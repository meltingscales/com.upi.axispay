package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfh implements Runnable {
    private final /* synthetic */ zzft zzri;
    private final /* synthetic */ Runnable zzrj;

    public zzfh(zzfe zzfeVar, zzft zzftVar, Runnable runnable) {
        this.zzri = zzftVar;
        this.zzrj = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzri.zzgf();
        this.zzri.zzf(this.zzrj);
        this.zzri.zzga();
    }
}
