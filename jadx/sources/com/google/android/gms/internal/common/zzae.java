package com.google.android.gms.internal.common;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzae<E> extends zzz<E> {
    private final zzag<E> zza;

    public zzae(zzag<E> zzagVar, int i) {
        super(zzagVar.size(), i);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final E zza(int i) {
        return this.zza.get(i);
    }
}
