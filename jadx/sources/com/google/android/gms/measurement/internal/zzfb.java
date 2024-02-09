package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfb implements Runnable {
    private final /* synthetic */ zzey zzqz;
    private final /* synthetic */ zzam zzra;

    public zzfb(zzey zzeyVar, zzam zzamVar) {
        this.zzqz = zzeyVar;
        this.zzra = zzamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzqz) {
            zzey.zza(this.zzqz, false);
            if (!this.zzqz.zzqq.isConnected()) {
                this.zzqz.zzqq.zzad().zzdh().zzaq("Connected to remote service");
                this.zzqz.zzqq.zza(this.zzra);
            }
        }
    }
}
