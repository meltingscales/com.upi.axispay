package com.google.android.gms.internal.vision;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzdw<T> implements Iterator<T> {
    private int zza;
    private int zzb;
    private int zzc;
    private final /* synthetic */ zzdp zzd;

    private zzdw(zzdp zzdpVar) {
        int i;
        this.zzd = zzdpVar;
        i = zzdpVar.zzf;
        this.zza = i;
        this.zzb = zzdpVar.zzd();
        this.zzc = -1;
    }

    private final void zza() {
        int i;
        i = this.zzd.zzf;
        if (i != this.zza) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.zzb >= 0;
    }

    @Override // java.util.Iterator
    public T next() {
        zza();
        if (hasNext()) {
            int i = this.zzb;
            this.zzc = i;
            T zza = zza(i);
            this.zzb = this.zzd.zza(this.zzb);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        zza();
        zzde.zzb(this.zzc >= 0, "no calls to next() since the last call to remove()");
        this.zza += 32;
        zzdp zzdpVar = this.zzd;
        zzdpVar.remove(zzdpVar.zzb[this.zzc]);
        this.zzb = zzdp.zzb(this.zzb, this.zzc);
        this.zzc = -1;
    }

    public abstract T zza(int i);

    public /* synthetic */ zzdw(zzdp zzdpVar, zzds zzdsVar) {
        this(zzdpVar);
    }
}
