package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbc extends zzaa.zza {
    private final /* synthetic */ String zzao;
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ String zzbn;
    private final /* synthetic */ boolean zzbp;
    private final /* synthetic */ Object zzbr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzaa zzaaVar, String str, String str2, Object obj, boolean z) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzao = str;
        this.zzbn = str2;
        this.zzbr = obj;
        this.zzbp = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.setUserProperty(this.zzao, this.zzbn, ObjectWrapper.wrap(this.zzbr), this.zzbp, this.timestamp);
    }
}
