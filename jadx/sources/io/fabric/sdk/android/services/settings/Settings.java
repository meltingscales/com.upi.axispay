package io.fabric.sdk.android.services.settings;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Settings {
    public static final String SETTINGS_CACHE_FILENAME = null;
    private static final String SETTINGS_URL_FORMAT = null;
    private boolean initialized;
    private SettingsController settingsController;
    private final AtomicReference<SettingsData> settingsData;
    private final CountDownLatch settingsDataLatch;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class LazyHolder {
        private static final Settings INSTANCE = new Settings();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface SettingsAccess<T> {
        T usingSettings(SettingsData settingsData);
    }

    static {
        C0059ao.a(Settings.class, 318);
    }

    public static Settings getInstance() {
        return LazyHolder.INSTANCE;
    }

    private void setSettingsData(SettingsData settingsData) {
        this.settingsData.set(settingsData);
        this.settingsDataLatch.countDown();
    }

    public SettingsData awaitSettingsData() {
        try {
            this.settingsDataLatch.await();
            return this.settingsData.get();
        } catch (InterruptedException unused) {
            Fabric.getLogger().e(C0059ao.a(207), C0059ao.a(208));
            return null;
        }
    }

    public void clearSettings() {
        this.settingsData.set(null);
    }

    public synchronized Settings initialize(Kit kit, IdManager idManager, HttpRequestFactory httpRequestFactory, String str, String str2, String str3) {
        if (this.initialized) {
            return this;
        }
        if (this.settingsController == null) {
            Context context = kit.getContext();
            String appIdentifier = idManager.getAppIdentifier();
            String value = new ApiKey().getValue(context);
            String installerPackageName = idManager.getInstallerPackageName();
            this.settingsController = new DefaultSettingsController(kit, new SettingsRequest(value, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager.getAdvertisingId(), idManager.getAppInstallIdentifier(), idManager.getAndroidId(), CommonUtils.createInstanceIdFrom(CommonUtils.resolveBuildId(context)), str2, str, DeliveryMechanism.determineFrom(installerPackageName).getId(), CommonUtils.getAppIconHashOrNull(context)), new SystemCurrentTimeProvider(), new DefaultSettingsJsonTransform(), new DefaultCachedSettingsIo(kit), new DefaultSettingsSpiCall(kit, str3, String.format(Locale.US, C0059ao.a(209), appIdentifier), httpRequestFactory));
        }
        this.initialized = true;
        return this;
    }

    public synchronized boolean loadSettingsData() {
        SettingsData loadSettingsData;
        loadSettingsData = this.settingsController.loadSettingsData();
        setSettingsData(loadSettingsData);
        return loadSettingsData != null;
    }

    public synchronized boolean loadSettingsSkippingCache() {
        SettingsData loadSettingsData;
        loadSettingsData = this.settingsController.loadSettingsData(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        setSettingsData(loadSettingsData);
        if (loadSettingsData == null) {
            Fabric.getLogger().e(C0059ao.a(210), C0059ao.a(211), null);
        }
        return loadSettingsData != null;
    }

    public void setSettingsController(SettingsController settingsController) {
        this.settingsController = settingsController;
    }

    public <T> T withSettings(SettingsAccess<T> settingsAccess, T t) {
        SettingsData settingsData = this.settingsData.get();
        return settingsData == null ? t : settingsAccess.usingSettings(settingsData);
    }

    private Settings() {
        this.settingsData = new AtomicReference<>();
        this.settingsDataLatch = new CountDownLatch(1);
        this.initialized = false;
    }
}
