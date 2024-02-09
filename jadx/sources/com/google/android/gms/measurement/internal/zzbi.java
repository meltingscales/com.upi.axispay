package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbi {
    private long value;
    private final String zzjf;
    private boolean zzlx;
    private final /* synthetic */ zzbf zzly;
    private final long zzlz;

    public zzbi(zzbf zzbfVar, String str, long j) {
        this.zzly = zzbfVar;
        Preconditions.checkNotEmpty(str);
        this.zzjf = str;
        this.zzlz = j;
    }

    public final long get() {
        SharedPreferences zzdr;
        if (!this.zzlx) {
            this.zzlx = true;
            zzdr = this.zzly.zzdr();
            this.value = zzdr.getLong(this.zzjf, this.zzlz);
        }
        return this.value;
    }

    public final void set(long j) {
        SharedPreferences zzdr;
        zzdr = this.zzly.zzdr();
        SharedPreferences.Editor edit = zzdr.edit();
        edit.putLong(this.zzjf, j);
        edit.apply();
        this.value = j;
    }
}
