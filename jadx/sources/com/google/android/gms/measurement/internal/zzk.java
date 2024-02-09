package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzk implements Runnable {
    private final /* synthetic */ String zzao;
    private final /* synthetic */ String zzav;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzq zzdh;
    private final /* synthetic */ AppMeasurementDynamiteService zzdi;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzq zzqVar, String str, String str2) {
        this.zzdi = appMeasurementDynamiteService;
        this.zzdh = zzqVar;
        this.zzao = str;
        this.zzav = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdi.zzl.zzu().zza(this.zzdh, this.zzao, this.zzav);
    }
}
