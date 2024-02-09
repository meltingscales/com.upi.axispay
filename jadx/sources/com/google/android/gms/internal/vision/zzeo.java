package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzeo<T> extends zzfa<T> {
    private boolean zza;
    private final /* synthetic */ Object zzb;

    public zzeo(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.zza) {
            this.zza = true;
            return (T) this.zzb;
        }
        throw new NoSuchElementException();
    }
}
