package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzah extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzaa zzaaVar) {
        super(zzaaVar);
        this.zzar = zzaaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.resetAnalyticsData(this.timestamp);
    }
}
