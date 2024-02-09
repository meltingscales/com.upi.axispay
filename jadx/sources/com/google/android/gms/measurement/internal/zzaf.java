package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaf {
    public final String name;
    public final String zzcf;
    public final long zzfe;
    public final long zzff;
    public final long zzfg;
    public final long zzfh;
    public final Long zzfi;
    public final Long zzfj;
    public final Long zzfk;
    public final Boolean zzfl;

    public zzaf(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j4 >= 0);
        this.zzcf = str;
        this.name = str2;
        this.zzfe = j;
        this.zzff = j2;
        this.zzfg = j3;
        this.zzfh = j4;
        this.zzfi = l;
        this.zzfj = l2;
        this.zzfk = l3;
        this.zzfl = bool;
    }

    public final zzaf zza(long j, long j2) {
        return new zzaf(this.zzcf, this.name, this.zzfe, this.zzff, this.zzfg, j, Long.valueOf(j2), this.zzfj, this.zzfk, this.zzfl);
    }

    public final zzaf zzw(long j) {
        return new zzaf(this.zzcf, this.name, this.zzfe, this.zzff, j, this.zzfh, this.zzfi, this.zzfj, this.zzfk, this.zzfl);
    }

    public final zzaf zza(Long l, Long l2, Boolean bool) {
        return new zzaf(this.zzcf, this.name, this.zzfe, this.zzff, this.zzfg, this.zzfh, this.zzfi, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
