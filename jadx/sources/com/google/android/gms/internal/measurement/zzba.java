package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzaa;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzba extends zzaa.zza {
    private final /* synthetic */ zzaa zzar;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzdb zzbk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(zzaa zzaaVar, com.google.android.gms.measurement.internal.zzdb zzdbVar) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzbk = zzdbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    public final void zzl() throws RemoteException {
        Map map;
        zzn zznVar;
        Map map2;
        String str;
        map = this.zzar.zzad;
        zzaa.zzc zzcVar = (zzaa.zzc) map.get(this.zzbk);
        if (zzcVar != null) {
            zznVar = this.zzar.zzan;
            zznVar.unregisterOnMeasurementEventListener(zzcVar);
            map2 = this.zzar.zzad;
            map2.remove(this.zzbk);
            return;
        }
        str = this.zzar.zzw;
        Log.w(str, "OnEventListener had not been registered.");
    }
}
