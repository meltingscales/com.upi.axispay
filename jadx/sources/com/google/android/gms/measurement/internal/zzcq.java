package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcq implements Callable<List<zzgc>> {
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzca zzot;

    public zzcq(zzca zzcaVar, zzm zzmVar) {
        this.zzot = zzcaVar;
        this.zzos = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzgc> call() throws Exception {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        return zzftVar2.zzdo().zzad(this.zzos.packageName);
    }
}
