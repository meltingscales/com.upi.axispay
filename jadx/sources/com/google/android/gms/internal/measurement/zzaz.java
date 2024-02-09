package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaz extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ boolean zzaz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzaa zzaaVar, boolean z) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzaz = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.setDataCollectionEnabled(this.zzaz);
    }
}
