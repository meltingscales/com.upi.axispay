package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdj implements Runnable {
    private final /* synthetic */ zzdd zzpm;
    private final /* synthetic */ long zzps;

    public zzdj(zzdd zzddVar, long j) {
        this.zzpm = zzddVar;
        this.zzps = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdd zzddVar = this.zzpm;
        long j = this.zzps;
        zzddVar.zzq();
        zzddVar.zzo();
        zzddVar.zzah();
        zzddVar.zzad().zzdh().zzaq("Resetting analytics data (FE)");
        zzddVar.zzx().zzfo();
        if (zzddVar.zzaf().zzu(zzddVar.zzt().zzan())) {
            zzddVar.zzae().zzlg.set(j);
        }
        boolean isEnabled = zzddVar.zzl.isEnabled();
        if (!zzddVar.zzaf().zzbq()) {
            zzddVar.zzae().zzf(!isEnabled);
        }
        zzddVar.zzu().resetAnalyticsData();
        zzddVar.zzpk = !isEnabled;
        this.zzpm.zzu().zza(new AtomicReference<>());
    }
}
