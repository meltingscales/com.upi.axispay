package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzci implements Callable<List<zzr>> {
    private final /* synthetic */ String zzao;
    private final /* synthetic */ String zzav;
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzca zzot;

    public zzci(zzca zzcaVar, zzm zzmVar, String str, String str2) {
        this.zzot = zzcaVar;
        this.zzos = zzmVar;
        this.zzao = str;
        this.zzav = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzr> call() throws Exception {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        return zzftVar2.zzdo().zzb(this.zzos.packageName, this.zzao, this.zzav);
    }
}
