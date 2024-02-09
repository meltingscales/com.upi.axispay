package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdt implements Runnable {
    private final /* synthetic */ boolean zzaz;
    private final /* synthetic */ zzdd zzpm;

    public zzdt(zzdd zzddVar, boolean z) {
        this.zzpm = zzddVar;
        this.zzaz = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpm.zzg(this.zzaz);
    }
}
