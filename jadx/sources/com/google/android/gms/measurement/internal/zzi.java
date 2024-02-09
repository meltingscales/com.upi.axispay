package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzi implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzq zzdh;
    private final /* synthetic */ AppMeasurementDynamiteService zzdi;
    private final /* synthetic */ zzaj zzdj;
    private final /* synthetic */ String zzdk;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzq zzqVar, zzaj zzajVar, String str) {
        this.zzdi = appMeasurementDynamiteService;
        this.zzdh = zzqVar;
        this.zzdj = zzajVar;
        this.zzdk = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdi.zzl.zzu().zza(this.zzdh, this.zzdj, this.zzdk);
    }
}
