package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzei implements Runnable {
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzga zzov;
    private final /* synthetic */ zzeg zzqq;
    private final /* synthetic */ boolean zzqr;

    public zzei(zzeg zzegVar, boolean z, zzga zzgaVar, zzm zzmVar) {
        this.zzqq = zzegVar;
        this.zzqr = z;
        this.zzov = zzgaVar;
        this.zzos = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzam zzamVar;
        zzamVar = this.zzqq.zzqk;
        if (zzamVar == null) {
            this.zzqq.zzad().zzda().zzaq("Discarding data. Failed to set user attribute");
            return;
        }
        this.zzqq.zza(zzamVar, this.zzqr ? null : this.zzov, this.zzos);
        this.zzqq.zzfg();
    }
}
