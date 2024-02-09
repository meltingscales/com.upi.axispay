package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzat extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ String zzbf;
    private final /* synthetic */ Object zzbg;
    private final /* synthetic */ int zzbe = 5;
    private final /* synthetic */ Object zzbh = null;
    private final /* synthetic */ Object zzbi = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzaa zzaaVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.zzar = zzaaVar;
        this.zzbf = str;
        this.zzbg = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        zzn zznVar;
        zznVar = this.zzar.zzan;
        zznVar.logHealthData(this.zzbe, this.zzbf, ObjectWrapper.wrap(this.zzbg), ObjectWrapper.wrap(this.zzbh), ObjectWrapper.wrap(this.zzbi));
    }
}
