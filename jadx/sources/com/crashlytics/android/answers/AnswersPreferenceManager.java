package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AnswersPreferenceManager {
    public static final String PREFKEY_ANALYTICS_LAUNCHED = null;
    public static final String PREF_STORE_NAME = null;
    private final PreferenceStore prefStore;

    static {
        C0059ao.a(AnswersPreferenceManager.class, 308);
    }

    public AnswersPreferenceManager(PreferenceStore preferenceStore) {
        this.prefStore = preferenceStore;
    }

    public static AnswersPreferenceManager build(Context context) {
        return new AnswersPreferenceManager(new PreferenceStoreImpl(context, C0059ao.a(13631)));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean hasAnalyticsLaunched() {
        return this.prefStore.get().getBoolean(C0059ao.a(13632), false);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void setAnalyticsLaunched() {
        PreferenceStore preferenceStore = this.prefStore;
        preferenceStore.save(preferenceStore.edit().putBoolean(C0059ao.a(13633), true));
    }
}
