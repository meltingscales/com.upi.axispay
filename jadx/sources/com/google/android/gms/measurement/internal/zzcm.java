package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcm implements Runnable {
    private final /* synthetic */ zzaj zzdj;
    private final /* synthetic */ String zzdk;
    private final /* synthetic */ zzca zzot;

    public zzcm(zzca zzcaVar, zzaj zzajVar, String str) {
        this.zzot = zzcaVar;
        this.zzdj = zzajVar;
        this.zzdk = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        zzftVar2.zzd(this.zzdj, this.zzdk);
    }
}
