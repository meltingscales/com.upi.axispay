package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzem implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzq zzdh;
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzeg zzqq;

    public zzem(zzeg zzegVar, zzm zzmVar, com.google.android.gms.internal.measurement.zzq zzqVar) {
        this.zzqq = zzegVar;
        this.zzos = zzmVar;
        this.zzdh = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzam zzamVar;
        try {
            zzamVar = this.zzqq.zzqk;
            if (zzamVar == null) {
                this.zzqq.zzad().zzda().zzaq("Failed to get app instance id");
                return;
            }
            String zzc = zzamVar.zzc(this.zzos);
            if (zzc != null) {
                this.zzqq.zzs().zzbi(zzc);
                this.zzqq.zzae().zzli.zzav(zzc);
            }
            this.zzqq.zzfg();
            this.zzqq.zzab().zzb(this.zzdh, zzc);
        } catch (RemoteException e) {
            this.zzqq.zzad().zzda().zza("Failed to get app instance id", e);
        } finally {
            this.zzqq.zzab().zzb(this.zzdh, (String) null);
        }
    }
}
