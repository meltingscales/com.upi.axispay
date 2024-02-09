package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzkc<K, V> {
    public static <K, V> void zza(zzii zziiVar, zzkf<K, V> zzkfVar, K k, V v) throws IOException {
        zziu.zza(zziiVar, zzkfVar.zza, 1, k);
        zziu.zza(zziiVar, zzkfVar.zzc, 2, v);
    }

    public static <K, V> int zza(zzkf<K, V> zzkfVar, K k, V v) {
        return zziu.zza(zzkfVar.zza, 1, k) + zziu.zza(zzkfVar.zzc, 2, v);
    }
}
