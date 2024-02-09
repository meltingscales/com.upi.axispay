package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdq implements Runnable {
    private final /* synthetic */ AtomicReference zzpl;
    private final /* synthetic */ zzdd zzpm;

    public zzdq(zzdd zzddVar, AtomicReference atomicReference) {
        this.zzpm = zzddVar;
        this.zzpl = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzpl) {
            this.zzpl.set(Long.valueOf(this.zzpm.zzaf().zza(this.zzpm.zzt().zzan(), zzal.zzhm)));
            this.zzpl.notify();
        }
    }
}
