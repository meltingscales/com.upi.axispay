package io.fabric.sdk.android.services.persistence;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import io.fabric.sdk.android.Kit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PreferenceStoreImpl implements PreferenceStore {
    private final Context context;
    private final String preferenceName;
    private final SharedPreferences sharedPreferences;

    public PreferenceStoreImpl(Context context, String str) {
        if (context != null) {
            this.context = context;
            this.preferenceName = str;
            this.sharedPreferences = context.getSharedPreferences(str, 0);
            return;
        }
        throw new IllegalStateException(C0059ao.a(1963));
    }

    @Override // io.fabric.sdk.android.services.persistence.PreferenceStore
    public SharedPreferences.Editor edit() {
        return this.sharedPreferences.edit();
    }

    @Override // io.fabric.sdk.android.services.persistence.PreferenceStore
    public SharedPreferences get() {
        return this.sharedPreferences;
    }

    @Override // io.fabric.sdk.android.services.persistence.PreferenceStore
    @TargetApi(9)
    public boolean save(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
            return true;
        }
        return editor.commit();
    }

    @Deprecated
    public PreferenceStoreImpl(Kit kit) {
        this(kit.getContext(), kit.getClass().getName());
    }
}
