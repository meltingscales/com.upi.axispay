package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdk implements Runnable {
    private final /* synthetic */ zzda zzbc;
    private final /* synthetic */ zzdd zzpm;

    public zzdk(zzdd zzddVar, zzda zzdaVar) {
        this.zzpm = zzddVar;
        this.zzbc = zzdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpm.zza(this.zzbc);
    }
}
