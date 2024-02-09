package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcn implements Callable<byte[]> {
    private final /* synthetic */ zzaj zzdj;
    private final /* synthetic */ String zzdk;
    private final /* synthetic */ zzca zzot;

    public zzcn(zzca zzcaVar, zzaj zzajVar, String str) {
        this.zzot = zzcaVar;
        this.zzdj = zzajVar;
        this.zzdk = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzft zzftVar;
        zzft zzftVar2;
        zzftVar = this.zzot.zzkt;
        zzftVar.zzgf();
        zzftVar2 = this.zzot.zzkt;
        return zzftVar2.zzfx().zzb(this.zzdj, this.zzdk);
    }
}
