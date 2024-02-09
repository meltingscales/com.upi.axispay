package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzl implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzq zzdh;
    private final /* synthetic */ AppMeasurementDynamiteService zzdi;

    public zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzq zzqVar) {
        this.zzdi = appMeasurementDynamiteService;
        this.zzdh = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdi.zzl.zzab().zza(this.zzdh, this.zzdi.zzl.zzeq());
    }
}
