package com.google.android.gms.internal.gtm;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbo implements Runnable {
    public final /* synthetic */ zzcz zza;
    public final /* synthetic */ zzbq zzb;

    public zzbo(zzbq zzbqVar, zzcz zzczVar) {
        this.zzb = zzbqVar;
        this.zza = zzczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zzb.zza;
        zzckVar.zzf(this.zza);
    }
}
