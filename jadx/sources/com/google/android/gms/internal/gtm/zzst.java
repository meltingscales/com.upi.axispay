package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzst extends zzsw {
    public final /* synthetic */ zztd zza;
    private int zzb = 0;
    private final int zzc;

    public zzst(zztd zztdVar) {
        this.zza = zztdVar;
        this.zzc = zztdVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsy
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
