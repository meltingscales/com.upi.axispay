package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes.dex */
public class PreferenceManager {
    public static final String PREF_ALWAYS_SEND_REPORTS_KEY = null;
    private static final String PREF_MIGRATION_COMPLETE = null;
    private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
    private final CrashlyticsCore kit;
    private final PreferenceStore preferenceStore;

    static {
        C0059ao.a(PreferenceManager.class, 197);
    }

    public PreferenceManager(PreferenceStore preferenceStore, CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = preferenceStore;
        this.kit = crashlyticsCore;
    }

    public static PreferenceManager create(PreferenceStore preferenceStore, CrashlyticsCore crashlyticsCore) {
        return new PreferenceManager(preferenceStore, crashlyticsCore);
    }

    public void setShouldAlwaysSendReports(boolean z) {
        PreferenceStore preferenceStore = this.preferenceStore;
        preferenceStore.save(preferenceStore.edit().putBoolean(C0059ao.a(5772), z));
    }

    public boolean shouldAlwaysSendReports() {
        SharedPreferences sharedPreferences = this.preferenceStore.get();
        String a = C0059ao.a(5773);
        boolean contains = sharedPreferences.contains(a);
        String a2 = C0059ao.a(5774);
        if (!contains) {
            PreferenceStoreImpl preferenceStoreImpl = new PreferenceStoreImpl(this.kit);
            if (!this.preferenceStore.get().contains(a2) && preferenceStoreImpl.get().contains(a2)) {
                boolean z = preferenceStoreImpl.get().getBoolean(a2, false);
                PreferenceStore preferenceStore = this.preferenceStore;
                preferenceStore.save(preferenceStore.edit().putBoolean(a2, z));
            }
            PreferenceStore preferenceStore2 = this.preferenceStore;
            preferenceStore2.save(preferenceStore2.edit().putBoolean(a, true));
        }
        return this.preferenceStore.get().getBoolean(a2, false);
    }
}
