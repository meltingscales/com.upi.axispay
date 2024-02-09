package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzez;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzgw implements zzgf {
    private final int flags;
    private final String info;
    private final Object[] zzajb;
    private final zzgh zzaje;

    public zzgw(zzgh zzghVar, String str, Object[] objArr) {
        this.zzaje = zzghVar;
        this.info = str;
        this.zzajb = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgf
    public final int zzns() {
        return (this.flags & 1) == 1 ? zzez.zze.zzahc : zzez.zze.zzahd;
    }

    @Override // com.google.android.gms.internal.measurement.zzgf
    public final boolean zznt() {
        return (this.flags & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzgf
    public final zzgh zznu() {
        return this.zzaje;
    }

    public final String zzob() {
        return this.info;
    }

    public final Object[] zzoc() {
        return this.zzajb;
    }
}
