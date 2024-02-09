package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzal extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ String zzbb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzaa zzaaVar, String str) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzbb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.endAdUnitExposure(this.zzbb, this.zzbs);
    }
}
