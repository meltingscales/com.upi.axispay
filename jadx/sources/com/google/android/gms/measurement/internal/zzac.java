package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzac implements Runnable {
    private final /* synthetic */ zzcv zzeu;
    private final /* synthetic */ zzab zzev;

    public zzac(zzab zzabVar, zzcv zzcvVar) {
        this.zzev = zzabVar;
        this.zzeu = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeu.zzag();
        if (zzq.isMainThread()) {
            this.zzeu.zzac().zza(this);
            return;
        }
        boolean zzcn = this.zzev.zzcn();
        zzab.zza(this.zzev, 0L);
        if (zzcn) {
            this.zzev.run();
        }
    }
}
