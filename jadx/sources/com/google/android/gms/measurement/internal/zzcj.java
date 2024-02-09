package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcj implements Callable<List<zzr>> {
    private final /* synthetic */ String zzao;
    private final /* synthetic */ String zzav;
    private final /* synthetic */ String zzdk;
    private final /* synthetic */ zzca zzot;

    public zzcj(zzca zzcaVar, String str, String str2, String str3) {
        this.zzot = zzcaVar;
        this.zzdk = str;
        this.zzao = str2;
        this.zzav = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzr> call() throws Exception {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        return zzftVar2.zzdo().zzb(this.zzdk, this.zzao, this.zzav);
    }
}
