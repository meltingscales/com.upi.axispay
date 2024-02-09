package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcs implements Runnable {
    private final /* synthetic */ String zzax;
    private final /* synthetic */ String zzdk;
    private final /* synthetic */ zzca zzot;
    private final /* synthetic */ String zzow;
    private final /* synthetic */ long zzox;

    public zzcs(zzca zzcaVar, String str, String str2, String str3, long j) {
        this.zzot = zzcaVar;
        this.zzow = str;
        this.zzdk = str2;
        this.zzax = str3;
        this.zzox = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzft zzftVar2;
        String str = this.zzow;
        if (str != null) {
            zzec zzecVar = new zzec(this.zzax, str, this.zzox);
            zzftVar = this.zzot.zzkt;
            zzftVar.zzgi().zzv().zza(this.zzdk, zzecVar);
            return;
        }
        zzftVar2 = this.zzot.zzkt;
        zzftVar2.zzgi().zzv().zza(this.zzdk, (zzec) null);
    }
}
