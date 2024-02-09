package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcf implements Runnable {
    private final /* synthetic */ zzca zzot;
    private final /* synthetic */ zzr zzou;

    public zzcf(zzca zzcaVar, zzr zzrVar) {
        this.zzot = zzcaVar;
        this.zzou = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        zzftVar2.zze(this.zzou);
    }
}
