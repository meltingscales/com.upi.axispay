package com.google.android.gms.internal.vision;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdy<K, V> extends zzdl<K, V> {
    @NullableDecl
    private final K zza;
    private int zzb;
    private final /* synthetic */ zzdp zzc;

    public zzdy(zzdp zzdpVar, int i) {
        this.zzc = zzdpVar;
        this.zza = (K) zzdpVar.zzb[i];
        this.zzb = i;
    }

    private final void zza() {
        int zza;
        int i = this.zzb;
        if (i == -1 || i >= this.zzc.size() || !zzcz.zza(this.zza, this.zzc.zzb[this.zzb])) {
            zza = this.zzc.zza(this.zza);
            this.zzb = zza;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzdl, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.vision.zzdl, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        Map<K, V> zzb = this.zzc.zzb();
        if (zzb != null) {
            return zzb.get(this.zza);
        }
        zza();
        int i = this.zzb;
        if (i == -1) {
            return null;
        }
        return (V) this.zzc.zzc[i];
    }

    @Override // com.google.android.gms.internal.vision.zzdl, java.util.Map.Entry
    public final V setValue(V v) {
        Map<K, V> zzb = this.zzc.zzb();
        if (zzb != null) {
            return zzb.put(this.zza, v);
        }
        zza();
        int i = this.zzb;
        if (i == -1) {
            this.zzc.put(this.zza, v);
            return null;
        }
        Object[] objArr = this.zzc.zzc;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }
}
