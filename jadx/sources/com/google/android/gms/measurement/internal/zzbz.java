package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbz implements Runnable {
    private final /* synthetic */ zzdc zzoo;
    private final /* synthetic */ zzby zzop;

    public zzbz(zzby zzbyVar, zzdc zzdcVar) {
        this.zzop = zzbyVar;
        this.zzoo = zzdcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzop.zza(this.zzoo);
        this.zzop.start();
    }
}
