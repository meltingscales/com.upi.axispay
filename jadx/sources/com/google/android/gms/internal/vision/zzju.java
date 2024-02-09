package com.google.android.gms.internal.vision;

import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzju {
    private static final zzju zza = new zzjw();
    private static final zzju zzb = new zzjz();

    private zzju() {
    }

    public static zzju zza() {
        return zza;
    }

    public static zzju zzb() {
        return zzb;
    }

    public abstract <L> List<L> zza(Object obj, long j);

    public abstract <L> void zza(Object obj, Object obj2, long j);

    public abstract void zzb(Object obj, long j);
}
