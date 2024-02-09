package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfu extends zzfr {
    private zzfu() {
        super();
    }

    private static <E> zzfg<E> zzd(Object obj, long j) {
        return (zzfg) zzhw.zzp(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzfr
    public final <L> List<L> zza(Object obj, long j) {
        zzfg zzd = zzd(obj, j);
        if (zzd.zzjy()) {
            return zzd;
        }
        int size = zzd.size();
        zzfg zzq = zzd.zzq(size == 0 ? 10 : size << 1);
        zzhw.zza(obj, j, zzq);
        return zzq;
    }

    @Override // com.google.android.gms.internal.measurement.zzfr
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzjz();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.zzfr
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzfg<E> zzd = zzd(obj, j);
        zzfg<E> zzd2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = zzd2.size();
        zzfg<E> zzfgVar = zzd;
        zzfgVar = zzd;
        if (size > 0 && size2 > 0) {
            boolean zzjy = zzd.zzjy();
            zzfg<E> zzfgVar2 = zzd;
            if (!zzjy) {
                zzfgVar2 = zzd.zzq(size2 + size);
            }
            zzfgVar2.addAll(zzd2);
            zzfgVar = zzfgVar2;
        }
        if (size > 0) {
            zzd2 = zzfgVar;
        }
        zzhw.zza(obj, j, zzd2);
    }
}
