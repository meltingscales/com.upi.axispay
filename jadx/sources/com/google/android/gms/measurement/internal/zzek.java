package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzek implements Runnable {
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzeg zzqq;

    public zzek(zzeg zzegVar, zzm zzmVar) {
        this.zzqq = zzegVar;
        this.zzos = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzam zzamVar;
        zzamVar = this.zzqq.zzqk;
        if (zzamVar == null) {
            this.zzqq.zzad().zzda().zzaq("Failed to reset data on the service; null service");
            return;
        }
        try {
            zzamVar.zzd(this.zzos);
        } catch (RemoteException e) {
            this.zzqq.zzad().zzda().zza("Failed to reset data on the service", e);
        }
        this.zzqq.zzfg();
    }
}
