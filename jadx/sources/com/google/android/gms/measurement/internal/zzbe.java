package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbe implements Runnable {
    private final /* synthetic */ boolean zzkw;
    private final /* synthetic */ zzbd zzkx;

    public zzbe(zzbd zzbdVar, boolean z) {
        this.zzkx = zzbdVar;
        this.zzkw = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzftVar = this.zzkx.zzkt;
        zzftVar.zzj(this.zzkw);
    }
}
