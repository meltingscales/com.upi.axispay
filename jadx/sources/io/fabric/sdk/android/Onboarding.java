package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AppRequestData;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.CreateAppSpiCall;
import io.fabric.sdk.android.services.settings.IconRequest;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import io.fabric.sdk.android.services.settings.UpdateAppSpiCall;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Onboarding extends Kit<Boolean> {
    private static final String BINARY_BUILD_TYPE = null;
    public static final String CRASHLYTICS_API_ENDPOINT = null;
    private String applicationLabel;
    private String installerPackageName;
    private final Future<Map<String, KitInfo>> kitsFinder;
    private PackageInfo packageInfo;
    private PackageManager packageManager;
    private String packageName;
    private final Collection<Kit> providedKits;
    private final HttpRequestFactory requestFactory = new DefaultHttpRequestFactory();
    private String targetAndroidSdkVersion;
    private String versionCode;
    private String versionName;

    static {
        C0059ao.a(Onboarding.class, 306);
    }

    public Onboarding(Future<Map<String, KitInfo>> future, Collection<Kit> collection) {
        this.kitsFinder = future;
        this.providedKits = collection;
    }

    private AppRequestData buildAppRequest(IconRequest iconRequest, Collection<KitInfo> collection) {
        Context context = getContext();
        return new AppRequestData(new ApiKey().getValue(context), getIdManager().getAppIdentifier(), this.versionName, this.versionCode, CommonUtils.createInstanceIdFrom(CommonUtils.resolveBuildId(context)), this.applicationLabel, DeliveryMechanism.determineFrom(this.installerPackageName).getId(), this.targetAndroidSdkVersion, C0059ao.a(7991), iconRequest, collection);
    }

    private boolean performAutoConfigure(String str, AppSettingsData appSettingsData, Collection<KitInfo> collection) {
        boolean equals = C0059ao.a(7992).equals(appSettingsData.status);
        String a = C0059ao.a(7993);
        if (equals) {
            if (performCreateApp(str, appSettingsData, collection)) {
                return Settings.getInstance().loadSettingsSkippingCache();
            }
            Fabric.getLogger().e(a, C0059ao.a(7994), null);
            return false;
        }
        if (C0059ao.a(7995).equals(appSettingsData.status)) {
            return Settings.getInstance().loadSettingsSkippingCache();
        }
        if (appSettingsData.updateRequired) {
            Fabric.getLogger().d(a, C0059ao.a(7996));
            performUpdateApp(str, appSettingsData, collection);
        }
        return true;
    }

    private boolean performCreateApp(String str, AppSettingsData appSettingsData, Collection<KitInfo> collection) {
        return new CreateAppSpiCall(this, getOverridenSpiEndpoint(), appSettingsData.url, this.requestFactory).invoke(buildAppRequest(IconRequest.build(getContext(), str), collection));
    }

    private boolean performUpdateApp(String str, AppSettingsData appSettingsData, Collection<KitInfo> collection) {
        return performUpdateApp(appSettingsData, IconRequest.build(getContext(), str), collection);
    }

    private SettingsData retrieveSettingsData() {
        try {
            Settings.getInstance().initialize(this, this.idManager, this.requestFactory, this.versionCode, this.versionName, getOverridenSpiEndpoint()).loadSettingsData();
            return Settings.getInstance().awaitSettingsData();
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(7997), C0059ao.a(7998), e);
            return null;
        }
    }

    @Override // io.fabric.sdk.android.Kit
    public String getIdentifier() {
        return C0059ao.a(8001);
    }

    public String getOverridenSpiEndpoint() {
        return CommonUtils.getStringsFileValue(getContext(), C0059ao.a(8002));
    }

    @Override // io.fabric.sdk.android.Kit
    public String getVersion() {
        return C0059ao.a(8003);
    }

    public Map<String, KitInfo> mergeKits(Map<String, KitInfo> map, Collection<Kit> collection) {
        for (Kit kit : collection) {
            if (!map.containsKey(kit.getIdentifier())) {
                map.put(kit.getIdentifier(), new KitInfo(kit.getIdentifier(), kit.getVersion(), C0059ao.a(8004)));
            }
        }
        return map;
    }

    @Override // io.fabric.sdk.android.Kit
    public boolean onPreExecute() {
        try {
            this.installerPackageName = getIdManager().getInstallerPackageName();
            this.packageManager = getContext().getPackageManager();
            String packageName = getContext().getPackageName();
            this.packageName = packageName;
            PackageInfo packageInfo = this.packageManager.getPackageInfo(packageName, 0);
            this.packageInfo = packageInfo;
            this.versionCode = Integer.toString(packageInfo.versionCode);
            String str = this.packageInfo.versionName;
            if (str == null) {
                str = C0059ao.a(8005);
            }
            this.versionName = str;
            this.applicationLabel = this.packageManager.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.targetAndroidSdkVersion = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Fabric.getLogger().e(C0059ao.a(8006), C0059ao.a(8007), e);
            return false;
        }
    }

    private boolean performUpdateApp(AppSettingsData appSettingsData, IconRequest iconRequest, Collection<KitInfo> collection) {
        return new UpdateAppSpiCall(this, getOverridenSpiEndpoint(), appSettingsData.url, this.requestFactory).invoke(buildAppRequest(iconRequest, collection));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.fabric.sdk.android.Kit
    public Boolean doInBackground() {
        Map<String, KitInfo> hashMap;
        boolean performAutoConfigure;
        String appIconHashOrNull = CommonUtils.getAppIconHashOrNull(getContext());
        SettingsData retrieveSettingsData = retrieveSettingsData();
        if (retrieveSettingsData != null) {
            try {
                Future<Map<String, KitInfo>> future = this.kitsFinder;
                if (future != null) {
                    hashMap = future.get();
                } else {
                    hashMap = new HashMap<>();
                }
                performAutoConfigure = performAutoConfigure(appIconHashOrNull, retrieveSettingsData.appData, mergeKits(hashMap, this.providedKits).values());
            } catch (Exception e) {
                Fabric.getLogger().e(C0059ao.a(7999), C0059ao.a(8000), e);
            }
            return Boolean.valueOf(performAutoConfigure);
        }
        performAutoConfigure = false;
        return Boolean.valueOf(performAutoConfigure);
    }
}
