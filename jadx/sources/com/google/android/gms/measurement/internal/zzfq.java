package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfq extends zzab {
    private final /* synthetic */ zzft zzri;
    private final /* synthetic */ zzfp zzrs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzfp zzfpVar, zzcv zzcvVar, zzft zzftVar) {
        super(zzcvVar);
        this.zzrs = zzfpVar;
        this.zzri = zzftVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final void run() {
        this.zzrs.cancel();
        this.zzrs.zzad().zzdi().zzaq("Starting upload from DelayedRunnable");
        this.zzri.zzga();
    }
}
