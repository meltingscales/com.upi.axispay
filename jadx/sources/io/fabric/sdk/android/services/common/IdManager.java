package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class IdManager {
    private static final String BAD_ANDROID_ID = null;
    public static final String COLLECT_DEVICE_IDENTIFIERS = null;
    public static final String COLLECT_USER_IDENTIFIERS = null;
    public static final String DEFAULT_VERSION_NAME = null;
    private static final String FORWARD_SLASH_REGEX;
    private static final Pattern ID_PATTERN;
    public static final String PREFKEY_ADVERTISING_ID = null;
    private static final String PREFKEY_INSTALLATION_UUID = null;
    public AdvertisingInfo advertisingInfo;
    public AdvertisingInfoProvider advertisingInfoProvider;
    private final Context appContext;
    private final String appIdentifier;
    private final String appInstallIdentifier;
    private final boolean collectHardwareIds;
    private final boolean collectUserIds;
    public boolean fetchedAdvertisingInfo;
    public FirebaseInfo firebaseInfo;
    private final ReentrantLock installationIdLock = new ReentrantLock();
    private final InstallerPackageNameProvider installerPackageNameProvider;
    private final Collection<Kit> kits;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum DeviceIdentifierType {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        DeviceIdentifierType(int i) {
            this.protobufIndex = i;
        }
    }

    static {
        C0059ao.a(IdManager.class, 217);
        ID_PATTERN = Pattern.compile(C0059ao.a(4827));
        FORWARD_SLASH_REGEX = Pattern.quote(C0059ao.a(4828));
    }

    public IdManager(Context context, String str, String str2, Collection<Kit> collection) {
        if (context == null) {
            throw new IllegalArgumentException(C0059ao.a(4836));
        }
        if (str == null) {
            throw new IllegalArgumentException(C0059ao.a(4835));
        }
        if (collection != null) {
            this.appContext = context;
            this.appIdentifier = str;
            this.appInstallIdentifier = str2;
            this.kits = collection;
            this.installerPackageNameProvider = new InstallerPackageNameProvider();
            this.advertisingInfoProvider = new AdvertisingInfoProvider(context);
            this.firebaseInfo = new FirebaseInfo();
            boolean booleanResourceValue = CommonUtils.getBooleanResourceValue(context, C0059ao.a(4829), true);
            this.collectHardwareIds = booleanResourceValue;
            String a = C0059ao.a(4830);
            if (!booleanResourceValue) {
                Logger logger = Fabric.getLogger();
                logger.d(a, C0059ao.a(4831) + context.getPackageName());
            }
            boolean booleanResourceValue2 = CommonUtils.getBooleanResourceValue(context, C0059ao.a(4832), true);
            this.collectUserIds = booleanResourceValue2;
            if (booleanResourceValue2) {
                return;
            }
            Logger logger2 = Fabric.getLogger();
            logger2.d(a, C0059ao.a(4833) + context.getPackageName());
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(4834));
    }

    private void checkAdvertisingIdRotation(SharedPreferences sharedPreferences) {
        AdvertisingInfo advertisingInfo = getAdvertisingInfo();
        if (advertisingInfo != null) {
            flushInstallationIdIfNecessary(sharedPreferences, advertisingInfo.advertisingId);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private String createInstallationUUID(SharedPreferences sharedPreferences) {
        String a = C0059ao.a(4837);
        this.installationIdLock.lock();
        try {
            String string = sharedPreferences.getString(a, null);
            if (string == null) {
                string = formatId(UUID.randomUUID().toString());
                sharedPreferences.edit().putString(a, string).commit();
            }
            return string;
        } finally {
            this.installationIdLock.unlock();
        }
    }

    private Boolean explicitCheckLimitAdTracking() {
        AdvertisingInfo advertisingInfo = getAdvertisingInfo();
        if (advertisingInfo != null) {
            return Boolean.valueOf(advertisingInfo.limitAdTrackingEnabled);
        }
        return null;
    }

    @SuppressLint({"CommitPrefEdits"})
    private void flushInstallationIdIfNecessary(SharedPreferences sharedPreferences, String str) {
        String a = C0059ao.a(4838);
        this.installationIdLock.lock();
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String string = sharedPreferences.getString(a, null);
            if (TextUtils.isEmpty(string)) {
                sharedPreferences.edit().putString(a, str).commit();
            } else if (!string.equals(str)) {
                sharedPreferences.edit().remove(C0059ao.a(4839)).putString(a, str).commit();
            }
        } finally {
            this.installationIdLock.unlock();
        }
    }

    private String formatId(String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll(C0059ao.a(4840)).toLowerCase(Locale.US);
    }

    private void putNonNullIdInto(Map<DeviceIdentifierType, String> map, DeviceIdentifierType deviceIdentifierType, String str) {
        if (str != null) {
            map.put(deviceIdentifierType, str);
        }
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, C0059ao.a(4841));
    }

    public boolean canCollectUserIds() {
        return this.collectUserIds;
    }

    @Deprecated
    public String createIdHeaderValue(String str, String str2) {
        return C0059ao.a(4842);
    }

    public String getAdvertisingId() {
        AdvertisingInfo advertisingInfo;
        if (!shouldCollectHardwareIds() || (advertisingInfo = getAdvertisingInfo()) == null || advertisingInfo.limitAdTrackingEnabled) {
            return null;
        }
        return advertisingInfo.advertisingId;
    }

    public synchronized AdvertisingInfo getAdvertisingInfo() {
        if (!this.fetchedAdvertisingInfo) {
            this.advertisingInfo = this.advertisingInfoProvider.getAdvertisingInfo();
            this.fetchedAdvertisingInfo = true;
        }
        return this.advertisingInfo;
    }

    public String getAndroidId() {
        boolean equals = Boolean.TRUE.equals(explicitCheckLimitAdTracking());
        if (shouldCollectHardwareIds() && !equals) {
            String string = Settings.Secure.getString(this.appContext.getContentResolver(), C0059ao.a(4843));
            if (!C0059ao.a(4844).equals(string)) {
                return formatId(string);
            }
        }
        return null;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getAppInstallIdentifier() {
        String str = this.appInstallIdentifier;
        if (str == null) {
            SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
            checkAdvertisingIdRotation(sharedPrefs);
            String string = sharedPrefs.getString(C0059ao.a(4845), null);
            return string == null ? createInstallationUUID(sharedPrefs) : string;
        }
        return str;
    }

    @Deprecated
    public String getBluetoothMacAddress() {
        return null;
    }

    public Map<DeviceIdentifierType, String> getDeviceIdentifiers() {
        HashMap hashMap = new HashMap();
        for (Kit kit : this.kits) {
            if (kit instanceof DeviceIdentifierProvider) {
                for (Map.Entry<DeviceIdentifierType, String> entry : ((DeviceIdentifierProvider) kit).getDeviceIdentifiers().entrySet()) {
                    putNonNullIdInto(hashMap, entry.getKey(), entry.getValue());
                }
            }
        }
        String advertisingId = getAdvertisingId();
        if (TextUtils.isEmpty(advertisingId)) {
            putNonNullIdInto(hashMap, DeviceIdentifierType.ANDROID_ID, getAndroidId());
        } else {
            putNonNullIdInto(hashMap, DeviceIdentifierType.ANDROID_ADVERTISING_ID, advertisingId);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }

    public String getModelName() {
        return String.format(Locale.US, C0059ao.a(4846), removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }

    public String getOsVersionString() {
        return getOsDisplayVersionString() + C0059ao.a(4847) + getOsBuildVersionString();
    }

    @Deprecated
    public String getSerialNumber() {
        return null;
    }

    @Deprecated
    public String getTelephonyId() {
        return null;
    }

    @Deprecated
    public String getWifiMacAddress() {
        return null;
    }

    public Boolean isLimitAdTrackingEnabled() {
        if (shouldCollectHardwareIds()) {
            return explicitCheckLimitAdTracking();
        }
        return null;
    }

    public boolean shouldCollectHardwareIds() {
        return this.collectHardwareIds && !this.firebaseInfo.isFirebaseCrashlyticsEnabled(this.appContext);
    }
}
