package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbd extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ Bundle zzbj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzaa zzaaVar, Bundle bundle) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzbj = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.setConditionalUserProperty(this.zzbj, this.timestamp);
    }
}
