package com.crashlytics.android.beta;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeviceIdentifierProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Beta extends Kit<Boolean> implements DeviceIdentifierProvider {
    private static final String CRASHLYTICS_API_ENDPOINT = null;
    private static final String CRASHLYTICS_BUILD_PROPERTIES = null;
    public static final String NO_DEVICE_TOKEN = null;
    public static final String TAG = null;
    private final MemoryValueCache<String> deviceTokenCache = new MemoryValueCache<>();
    private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
    private UpdatesController updatesController;

    static {
        C0059ao.a(Beta.class, 77);
    }

    private String getBetaDeviceToken(Context context, String str) {
        String a = C0059ao.a(12790);
        String str2 = null;
        try {
            String str3 = this.deviceTokenCache.get(context, this.deviceTokenLoader);
            if (!C0059ao.a(12791).equals(str3)) {
                str2 = str3;
            }
        } catch (Exception e) {
            Fabric.getLogger().e(a, C0059ao.a(12792), e);
        }
        Logger logger = Fabric.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(12793));
        sb.append(!TextUtils.isEmpty(str2));
        logger.d(a, sb.toString());
        return str2;
    }

    private BetaSettingsData getBetaSettingsData() {
        SettingsData awaitSettingsData = Settings.getInstance().awaitSettingsData();
        if (awaitSettingsData != null) {
            return awaitSettingsData.betaSettingsData;
        }
        return null;
    }

    public static Beta getInstance() {
        return (Beta) Fabric.getKit(Beta.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    private BuildProperties loadBuildProperties(Context context) {
        BuildProperties buildProperties;
        Throwable th;
        InputStream inputStream;
        String a = C0059ao.a(12794);
        String a2 = C0059ao.a(12795);
        BuildProperties buildProperties2 = 0;
        r3 = null;
        BuildProperties buildProperties3 = null;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = context.getAssets().open(C0059ao.a(12796));
                if (inputStream != null) {
                    try {
                        buildProperties3 = BuildProperties.fromPropertiesStream(inputStream);
                        Fabric.getLogger().d(a2, buildProperties3.packageName + C0059ao.a(12797) + buildProperties3.versionName + C0059ao.a(12798) + buildProperties3.versionCode + C0059ao.a(12799) + buildProperties3.buildId);
                    } catch (Exception e) {
                        e = e;
                        BuildProperties buildProperties4 = buildProperties3;
                        inputStream2 = inputStream;
                        buildProperties = buildProperties4;
                        Fabric.getLogger().e(a2, C0059ao.a(12800), e);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e2) {
                                Fabric.getLogger().e(a2, a, e2);
                            }
                        }
                        buildProperties2 = buildProperties;
                        return buildProperties2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                Fabric.getLogger().e(a2, a, e3);
                            }
                        }
                        throw th;
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return buildProperties3;
                    } catch (IOException e4) {
                        Fabric.getLogger().e(a2, a, e4);
                        return buildProperties3;
                    }
                }
                return buildProperties3;
            } catch (Exception e5) {
                e = e5;
                buildProperties = null;
            }
        } catch (Throwable th3) {
            BuildProperties buildProperties5 = buildProperties2;
            th = th3;
            inputStream = buildProperties5;
        }
    }

    public boolean canCheckForUpdates(BetaSettingsData betaSettingsData, BuildProperties buildProperties) {
        return (betaSettingsData == null || TextUtils.isEmpty(betaSettingsData.updateUrl) || buildProperties == null) ? false : true;
    }

    @TargetApi(14)
    public UpdatesController createUpdatesController(int i, Application application) {
        if (i >= 14) {
            return new ActivityLifecycleCheckForUpdatesController(getFabric().getActivityLifecycleManager(), getFabric().getExecutorService());
        }
        return new ImmediateCheckForUpdatesController();
    }

    @Override // io.fabric.sdk.android.services.common.DeviceIdentifierProvider
    public Map<IdManager.DeviceIdentifierType, String> getDeviceIdentifiers() {
        String betaDeviceToken = getBetaDeviceToken(getContext(), getIdManager().getInstallerPackageName());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(betaDeviceToken)) {
            hashMap.put(IdManager.DeviceIdentifierType.FONT_TOKEN, betaDeviceToken);
        }
        return hashMap;
    }

    @Override // io.fabric.sdk.android.Kit
    public String getIdentifier() {
        return C0059ao.a(12805);
    }

    public String getOverridenSpiEndpoint() {
        return CommonUtils.getStringsFileValue(getContext(), C0059ao.a(12806));
    }

    @Override // io.fabric.sdk.android.Kit
    public String getVersion() {
        return C0059ao.a(12807);
    }

    @Override // io.fabric.sdk.android.Kit
    @TargetApi(14)
    public boolean onPreExecute() {
        this.updatesController = createUpdatesController(Build.VERSION.SDK_INT, (Application) getContext().getApplicationContext());
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.fabric.sdk.android.Kit
    public Boolean doInBackground() {
        Logger logger = Fabric.getLogger();
        String a = C0059ao.a(12801);
        logger.d(a, C0059ao.a(12802));
        Context context = getContext();
        IdManager idManager = getIdManager();
        if (TextUtils.isEmpty(getBetaDeviceToken(context, idManager.getInstallerPackageName()))) {
            Fabric.getLogger().d(a, C0059ao.a(12803));
            return Boolean.FALSE;
        }
        Fabric.getLogger().d(a, C0059ao.a(12804));
        BetaSettingsData betaSettingsData = getBetaSettingsData();
        BuildProperties loadBuildProperties = loadBuildProperties(context);
        if (canCheckForUpdates(betaSettingsData, loadBuildProperties)) {
            this.updatesController.initialize(context, this, idManager, betaSettingsData, loadBuildProperties, new PreferenceStoreImpl(this), new SystemCurrentTimeProvider(), new DefaultHttpRequestFactory(Fabric.getLogger()));
        }
        return Boolean.TRUE;
    }
}
