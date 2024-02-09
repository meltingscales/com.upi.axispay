package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaj extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ long zzba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzaa zzaaVar, long j) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzba = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.setSessionTimeoutDuration(this.zzba);
    }
}
