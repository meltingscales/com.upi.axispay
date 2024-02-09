package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzay extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ zzm zzaw;
    private final /* synthetic */ int zzbl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzaa zzaaVar, zzm zzmVar, int i) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzaw = zzmVar;
        this.zzbl = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.getTestFlag(this.zzaw, this.zzbl);
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzm() {
        this.zzaw.zzb((Bundle) null);
    }
}
