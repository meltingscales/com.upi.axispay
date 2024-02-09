package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzel implements Runnable {
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzeg zzqq;
    private final /* synthetic */ AtomicReference zzqs;

    public zzel(zzeg zzegVar, AtomicReference atomicReference, zzm zzmVar) {
        this.zzqq = zzegVar;
        this.zzqs = atomicReference;
        this.zzos = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzam zzamVar;
        synchronized (this.zzqs) {
            try {
                zzamVar = this.zzqq.zzqk;
            } catch (RemoteException e) {
                this.zzqq.zzad().zzda().zza("Failed to get app instance id", e);
                this.zzqs.notify();
            }
            if (zzamVar == null) {
                this.zzqq.zzad().zzda().zzaq("Failed to get app instance id");
                this.zzqs.notify();
                return;
            }
            this.zzqs.set(zzamVar.zzc(this.zzos));
            String str = (String) this.zzqs.get();
            if (str != null) {
                this.zzqq.zzs().zzbi(str);
                this.zzqq.zzae().zzli.zzav(str);
            }
            this.zzqq.zzfg();
            this.zzqs.notify();
        }
    }
}
