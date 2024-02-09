package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzd implements Runnable {
    private final /* synthetic */ zza zzcc;
    private final /* synthetic */ long zzcd;

    public zzd(zza zzaVar, long j) {
        this.zzcc = zzaVar;
        this.zzcd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcc.zzd(this.zzcd);
    }
}
