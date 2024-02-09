package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzao extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ zzm zzaw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzaa zzaaVar, zzm zzmVar) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzaw = zzmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.getCachedAppInstanceId(this.zzaw);
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzm() {
        this.zzaw.zzb((Bundle) null);
    }
}
