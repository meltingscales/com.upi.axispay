package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcp implements Runnable {
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzca zzot;
    private final /* synthetic */ zzga zzov;

    public zzcp(zzca zzcaVar, zzga zzgaVar, zzm zzmVar) {
        this.zzot = zzcaVar;
        this.zzov = zzgaVar;
        this.zzos = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        zzftVar2.zzb(this.zzov, this.zzos);
    }
}
