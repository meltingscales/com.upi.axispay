package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzef implements Runnable {
    private final /* synthetic */ zzed zzqh;
    private final /* synthetic */ zzec zzqi;

    public zzef(zzed zzedVar, zzec zzecVar) {
        this.zzqh = zzedVar;
        this.zzqi = zzecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzqh.zza(this.zzqi, false);
        zzed zzedVar = this.zzqh;
        zzedVar.zzpy = null;
        zzedVar.zzu().zza((zzec) null);
    }
}
