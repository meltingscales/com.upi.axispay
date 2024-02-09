package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AdvertisingInfoProvider {
    private static final String ADVERTISING_INFO_PREFERENCES = null;
    private static final String PREFKEY_ADVERTISING_ID = null;
    private static final String PREFKEY_LIMIT_AD_TRACKING = null;
    private final Context context;
    private final PreferenceStore preferenceStore;

    static {
        C0059ao.a(AdvertisingInfoProvider.class, 240);
    }

    public AdvertisingInfoProvider(Context context) {
        this.context = context.getApplicationContext();
        this.preferenceStore = new PreferenceStoreImpl(context, C0059ao.a(6603));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdvertisingInfo getAdvertisingInfoFromStrategies() {
        AdvertisingInfo advertisingInfo = getReflectionStrategy().getAdvertisingInfo();
        boolean isInfoValid = isInfoValid(advertisingInfo);
        String a = C0059ao.a(6604);
        if (!isInfoValid) {
            advertisingInfo = getServiceStrategy().getAdvertisingInfo();
            if (!isInfoValid(advertisingInfo)) {
                Fabric.getLogger().d(a, C0059ao.a(6605));
            } else {
                Fabric.getLogger().d(a, C0059ao.a(6606));
            }
        } else {
            Fabric.getLogger().d(a, C0059ao.a(6607));
        }
        return advertisingInfo;
    }

    private boolean isInfoValid(AdvertisingInfo advertisingInfo) {
        return (advertisingInfo == null || TextUtils.isEmpty(advertisingInfo.advertisingId)) ? false : true;
    }

    private void refreshInfoIfNeededAsync(final AdvertisingInfo advertisingInfo) {
        new Thread(new BackgroundPriorityRunnable() { // from class: io.fabric.sdk.android.services.common.AdvertisingInfoProvider.1
            @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
            public void onRun() {
                AdvertisingInfo advertisingInfoFromStrategies = AdvertisingInfoProvider.this.getAdvertisingInfoFromStrategies();
                if (advertisingInfo.equals(advertisingInfoFromStrategies)) {
                    return;
                }
                Fabric.getLogger().d(C0059ao.a(2287), C0059ao.a(2288));
                AdvertisingInfoProvider.this.storeInfoToPreferences(advertisingInfoFromStrategies);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public void storeInfoToPreferences(AdvertisingInfo advertisingInfo) {
        boolean isInfoValid = isInfoValid(advertisingInfo);
        String a = C0059ao.a(6608);
        String a2 = C0059ao.a(6609);
        if (isInfoValid) {
            PreferenceStore preferenceStore = this.preferenceStore;
            preferenceStore.save(preferenceStore.edit().putString(a2, advertisingInfo.advertisingId).putBoolean(a, advertisingInfo.limitAdTrackingEnabled));
            return;
        }
        PreferenceStore preferenceStore2 = this.preferenceStore;
        preferenceStore2.save(preferenceStore2.edit().remove(a2).remove(a));
    }

    public AdvertisingInfo getAdvertisingInfo() {
        AdvertisingInfo infoFromPreferences = getInfoFromPreferences();
        if (isInfoValid(infoFromPreferences)) {
            Fabric.getLogger().d(C0059ao.a(6610), C0059ao.a(6611));
            refreshInfoIfNeededAsync(infoFromPreferences);
            return infoFromPreferences;
        }
        AdvertisingInfo advertisingInfoFromStrategies = getAdvertisingInfoFromStrategies();
        storeInfoToPreferences(advertisingInfoFromStrategies);
        return advertisingInfoFromStrategies;
    }

    public AdvertisingInfo getInfoFromPreferences() {
        return new AdvertisingInfo(this.preferenceStore.get().getString(C0059ao.a(6612), C0059ao.a(6613)), this.preferenceStore.get().getBoolean(C0059ao.a(6614), false));
    }

    public AdvertisingInfoStrategy getReflectionStrategy() {
        return new AdvertisingInfoReflectionStrategy(this.context);
    }

    public AdvertisingInfoStrategy getServiceStrategy() {
        return new AdvertisingInfoServiceStrategy(this.context);
    }
}
