package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzaa;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzax extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzdb zzbk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzaa zzaaVar, com.google.android.gms.measurement.internal.zzdb zzdbVar) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzbk = zzdbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        Map map;
        Map map2;
        zzn zznVar;
        String str;
        map = this.zzar.zzad;
        if (!map.containsKey(this.zzbk)) {
            zzaa.zzc zzcVar = new zzaa.zzc(this.zzbk);
            map2 = this.zzar.zzad;
            map2.put(this.zzbk, zzcVar);
            zznVar = this.zzar.zzan;
            zznVar.registerOnMeasurementEventListener(zzcVar);
            return;
        }
        str = this.zzar.zzw;
        Log.w(str, "OnEventListener already registered.");
    }
}
