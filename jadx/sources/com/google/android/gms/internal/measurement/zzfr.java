package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzfr {
    private static final zzfr zzaik = new zzft();
    private static final zzfr zzail = new zzfu();

    private zzfr() {
    }

    public static zzfr zzni() {
        return zzaik;
    }

    public static zzfr zznj() {
        return zzail;
    }

    public abstract <L> List<L> zza(Object obj, long j);

    public abstract <L> void zza(Object obj, Object obj2, long j);

    public abstract void zzb(Object obj, long j);
}
