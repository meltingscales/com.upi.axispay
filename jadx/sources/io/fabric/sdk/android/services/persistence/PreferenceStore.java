package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface PreferenceStore {
    SharedPreferences.Editor edit();

    SharedPreferences get();

    boolean save(SharedPreferences.Editor editor);
}
