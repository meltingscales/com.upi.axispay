package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzj implements Runnable {
    private final /* synthetic */ String zzao;
    private final /* synthetic */ String zzav;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzq zzdh;
    private final /* synthetic */ AppMeasurementDynamiteService zzdi;
    private final /* synthetic */ boolean zzdl;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzq zzqVar, String str, String str2, boolean z) {
        this.zzdi = appMeasurementDynamiteService;
        this.zzdh = zzqVar;
        this.zzao = str;
        this.zzav = str2;
        this.zzdl = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdi.zzl.zzu().zza(this.zzdh, this.zzao, this.zzav, this.zzdl);
    }
}
