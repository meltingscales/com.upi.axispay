package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzeq extends zzab {
    private final /* synthetic */ zzeg zzqq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzeg zzegVar, zzcv zzcvVar) {
        super(zzcvVar);
        this.zzqq = zzegVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final void run() {
        this.zzqq.zzad().zzdd().zzaq("Tasks have been queued for a long time");
    }
}
