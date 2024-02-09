package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdv implements Runnable {
    private final /* synthetic */ long zzba;
    private final /* synthetic */ zzdd zzpm;

    public zzdv(zzdd zzddVar, long j) {
        this.zzpm = zzddVar;
        this.zzba = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpm.zzae().zzlm.set(this.zzba);
        this.zzpm.zzad().zzdh().zza("Minimum session duration set", Long.valueOf(this.zzba));
    }
}
