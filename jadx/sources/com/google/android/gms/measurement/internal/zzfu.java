package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfu implements Runnable {
    private final /* synthetic */ zzfy zzsq;
    private final /* synthetic */ zzft zzsr;

    public zzfu(zzft zzftVar, zzfy zzfyVar) {
        this.zzsr = zzftVar;
        this.zzsq = zzfyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzsr.zza(this.zzsq);
        this.zzsr.start();
    }
}
