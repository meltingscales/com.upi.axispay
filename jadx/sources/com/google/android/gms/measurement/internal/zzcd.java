package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcd implements Runnable {
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzca zzot;
    private final /* synthetic */ zzr zzou;

    public zzcd(zzca zzcaVar, zzr zzrVar, zzm zzmVar) {
        this.zzot = zzcaVar;
        this.zzou = zzrVar;
        this.zzos = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        zzftVar2.zzb(this.zzou, this.zzos);
    }
}
