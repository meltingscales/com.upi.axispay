package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcl implements Runnable {
    private final /* synthetic */ zzaj zzdj;
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzca zzot;

    public zzcl(zzca zzcaVar, zzaj zzajVar, zzm zzmVar) {
        this.zzot = zzcaVar;
        this.zzdj = zzajVar;
        this.zzos = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzft zzftVar2;
        zzaj zzb = this.zzot.zzb(this.zzdj, this.zzos);
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        zzftVar2.zzc(zzb, this.zzos);
    }
}
