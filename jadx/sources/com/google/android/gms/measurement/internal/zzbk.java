package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbk {
    private String value;
    private final String zzjf;
    private boolean zzlx;
    private final /* synthetic */ zzbf zzly;
    private final String zzme;

    public zzbk(zzbf zzbfVar, String str, String str2) {
        this.zzly = zzbfVar;
        Preconditions.checkNotEmpty(str);
        this.zzjf = str;
        this.zzme = null;
    }

    public final void zzav(String str) {
        SharedPreferences zzdr;
        if (zzgd.zzs(str, this.value)) {
            return;
        }
        zzdr = this.zzly.zzdr();
        SharedPreferences.Editor edit = zzdr.edit();
        edit.putString(this.zzjf, str);
        edit.apply();
        this.value = str;
    }

    public final String zzed() {
        SharedPreferences zzdr;
        if (!this.zzlx) {
            this.zzlx = true;
            zzdr = this.zzly.zzdr();
            this.value = zzdr.getString(this.zzjf, null);
        }
        return this.value;
    }
}
