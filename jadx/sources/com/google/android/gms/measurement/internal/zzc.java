package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzc implements Runnable {
    private final /* synthetic */ String zzbb;
    private final /* synthetic */ long zzcb;
    private final /* synthetic */ zza zzcc;

    public zzc(zza zzaVar, String str, long j) {
        this.zzcc = zzaVar;
        this.zzbb = str;
        this.zzcb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcc.zzb(this.zzbb, this.zzcb);
    }
}
