package com.google.android.gms.internal.vision;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzed<E> extends zzdm<E> {
    private final zzee<E> zza;

    public zzed(zzee<E> zzeeVar, int i) {
        super(zzeeVar.size(), i);
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.vision.zzdm
    public final E zza(int i) {
        return this.zza.get(i);
    }
}
