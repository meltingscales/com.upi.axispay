package io.fabric.sdk.android.services.settings;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DefaultSettingsController implements SettingsController {
    private static final String LOAD_ERROR_MESSAGE = null;
    private static final String PREFS_BUILD_INSTANCE_IDENTIFIER = null;
    private final CachedSettingsIo cachedSettingsIo;
    private final CurrentTimeProvider currentTimeProvider;
    private final Kit kit;
    private final PreferenceStore preferenceStore;
    private final SettingsJsonTransform settingsJsonTransform;
    private final SettingsRequest settingsRequest;
    private final SettingsSpiCall settingsSpiCall;

    static {
        C0059ao.a(DefaultSettingsController.class, 359);
    }

    public DefaultSettingsController(Kit kit, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonTransform settingsJsonTransform, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall) {
        this.kit = kit;
        this.settingsRequest = settingsRequest;
        this.currentTimeProvider = currentTimeProvider;
        this.settingsJsonTransform = settingsJsonTransform;
        this.cachedSettingsIo = cachedSettingsIo;
        this.settingsSpiCall = settingsSpiCall;
        this.preferenceStore = new PreferenceStoreImpl(kit);
    }

    private SettingsData getCachedSettingsData(SettingsCacheBehavior settingsCacheBehavior) {
        String a = C0059ao.a(5932);
        SettingsData settingsData = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject readCachedSettings = this.cachedSettingsIo.readCachedSettings();
                if (readCachedSettings != null) {
                    SettingsData buildFromJson = this.settingsJsonTransform.buildFromJson(this.currentTimeProvider, readCachedSettings);
                    if (buildFromJson != null) {
                        logSettings(readCachedSettings, C0059ao.a(5933));
                        long currentTimeMillis = this.currentTimeProvider.getCurrentTimeMillis();
                        if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && buildFromJson.isExpired(currentTimeMillis)) {
                            Fabric.getLogger().d(a, C0059ao.a(5934));
                        }
                        try {
                            Fabric.getLogger().d(a, C0059ao.a(5935));
                            settingsData = buildFromJson;
                        } catch (Exception e) {
                            e = e;
                            settingsData = buildFromJson;
                            Fabric.getLogger().e(a, C0059ao.a(5938), e);
                            return settingsData;
                        }
                    } else {
                        Fabric.getLogger().e(a, C0059ao.a(5936), null);
                    }
                } else {
                    Fabric.getLogger().d(a, C0059ao.a(5937));
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return settingsData;
    }

    private void logSettings(JSONObject jSONObject, String str) throws JSONException {
        Logger logger = Fabric.getLogger();
        logger.d(C0059ao.a(5939), str + jSONObject.toString());
    }

    public boolean buildInstanceIdentifierChanged() {
        return !getStoredBuildInstanceIdentifier().equals(getBuildInstanceIdentifierFromContext());
    }

    public String getBuildInstanceIdentifierFromContext() {
        return CommonUtils.createInstanceIdFrom(CommonUtils.resolveBuildId(this.kit.getContext()));
    }

    public String getStoredBuildInstanceIdentifier() {
        return this.preferenceStore.get().getString(C0059ao.a(5940), C0059ao.a(5941));
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsController
    public SettingsData loadSettingsData() {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE);
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean setStoredBuildInstanceIdentifier(String str) {
        SharedPreferences.Editor edit = this.preferenceStore.edit();
        edit.putString(C0059ao.a(5945), str);
        return this.preferenceStore.save(edit);
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsController
    public SettingsData loadSettingsData(SettingsCacheBehavior settingsCacheBehavior) {
        JSONObject invoke;
        SettingsData settingsData = null;
        try {
            if (!Fabric.isDebuggable() && !buildInstanceIdentifierChanged()) {
                settingsData = getCachedSettingsData(settingsCacheBehavior);
            }
            if (settingsData == null && (invoke = this.settingsSpiCall.invoke(this.settingsRequest)) != null) {
                settingsData = this.settingsJsonTransform.buildFromJson(this.currentTimeProvider, invoke);
                this.cachedSettingsIo.writeCachedSettings(settingsData.expiresAtMillis, invoke);
                logSettings(invoke, C0059ao.a(5942));
                setStoredBuildInstanceIdentifier(getBuildInstanceIdentifierFromContext());
            }
            return settingsData == null ? getCachedSettingsData(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION) : settingsData;
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(5943), C0059ao.a(5944), e);
            return null;
        }
    }
}
