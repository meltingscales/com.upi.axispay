package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzeo implements Runnable {
    private final /* synthetic */ zzec zzqi;
    private final /* synthetic */ zzeg zzqq;

    public zzeo(zzeg zzegVar, zzec zzecVar) {
        this.zzqq = zzegVar;
        this.zzqi = zzecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzam zzamVar;
        zzamVar = this.zzqq.zzqk;
        if (zzamVar == null) {
            this.zzqq.zzad().zzda().zzaq("Failed to send current screen to service");
            return;
        }
        try {
            zzec zzecVar = this.zzqi;
            if (zzecVar == null) {
                zzamVar.zza(0L, (String) null, (String) null, this.zzqq.getContext().getPackageName());
            } else {
                zzamVar.zza(zzecVar.zzpw, zzecVar.zzpu, zzecVar.zzpv, this.zzqq.getContext().getPackageName());
            }
            this.zzqq.zzfg();
        } catch (RemoteException e) {
            this.zzqq.zzad().zzda().zza("Failed to send current screen to the service", e);
        }
    }
}
