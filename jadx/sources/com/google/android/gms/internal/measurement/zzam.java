package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzam extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzda zzbc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzaa zzaaVar, com.google.android.gms.measurement.internal.zzda zzdaVar) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzbc = zzdaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.setEventInterceptor(new zzaa.zzb(this.zzbc));
    }
}
