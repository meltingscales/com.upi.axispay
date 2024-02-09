package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzep implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzq zzdh;
    private final /* synthetic */ zzaj zzdj;
    private final /* synthetic */ String zzdk;
    private final /* synthetic */ zzeg zzqq;

    public zzep(zzeg zzegVar, zzaj zzajVar, String str, com.google.android.gms.internal.measurement.zzq zzqVar) {
        this.zzqq = zzegVar;
        this.zzdj = zzajVar;
        this.zzdk = str;
        this.zzdh = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzam zzamVar;
        try {
            zzamVar = this.zzqq.zzqk;
            if (zzamVar == null) {
                this.zzqq.zzad().zzda().zzaq("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] zza = zzamVar.zza(this.zzdj, this.zzdk);
            this.zzqq.zzfg();
            this.zzqq.zzab().zza(this.zzdh, zza);
        } catch (RemoteException e) {
            this.zzqq.zzad().zzda().zza("Failed to send event to the service to bundle", e);
        } finally {
            this.zzqq.zzab().zza(this.zzdh, (byte[]) null);
        }
    }
}
