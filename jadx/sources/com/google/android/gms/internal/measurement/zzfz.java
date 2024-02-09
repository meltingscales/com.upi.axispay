package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfz<K, V> {
    public static <K, V> void zza(zzeg zzegVar, zzga<K, V> zzgaVar, K k, V v) throws IOException {
        zzeq.zza(zzegVar, zzgaVar.zzais, 1, k);
        zzeq.zza(zzegVar, zzgaVar.zzaiu, 2, v);
    }

    public static <K, V> int zza(zzga<K, V> zzgaVar, K k, V v) {
        return zzeq.zza(zzgaVar.zzais, 1, k) + zzeq.zza(zzgaVar.zzaiu, 2, v);
    }
}
