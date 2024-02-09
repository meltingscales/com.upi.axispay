package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbp implements Callable<Void> {
    public final /* synthetic */ zzbq zza;

    public zzbp(zzbq zzbqVar) {
        this.zza = zzbqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() throws Exception {
        zzck zzckVar;
        zzckVar = this.zza.zza;
        zzckVar.zzac();
        return null;
    }
}
