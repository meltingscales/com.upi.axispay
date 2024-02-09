package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfn implements Runnable {
    private final /* synthetic */ long zzcd;
    private final /* synthetic */ zzfj zzro;

    public zzfn(zzfj zzfjVar, long j) {
        this.zzro = zzfjVar;
        this.zzcd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzro.zzac(this.zzcd);
    }
}
