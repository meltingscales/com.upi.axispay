package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbh {
    private boolean value;
    private final String zzjf;
    private final boolean zzlw;
    private boolean zzlx;
    private final /* synthetic */ zzbf zzly;

    public zzbh(zzbf zzbfVar, String str, boolean z) {
        this.zzly = zzbfVar;
        Preconditions.checkNotEmpty(str);
        this.zzjf = str;
        this.zzlw = z;
    }

    public final boolean get() {
        SharedPreferences zzdr;
        if (!this.zzlx) {
            this.zzlx = true;
            zzdr = this.zzly.zzdr();
            this.value = zzdr.getBoolean(this.zzjf, this.zzlw);
        }
        return this.value;
    }

    public final void set(boolean z) {
        SharedPreferences zzdr;
        zzdr = this.zzly.zzdr();
        SharedPreferences.Editor edit = zzdr.edit();
        edit.putBoolean(this.zzjf, z);
        edit.apply();
        this.value = z;
    }
}
