package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdr implements Runnable {
    private final /* synthetic */ AtomicReference zzpl;
    private final /* synthetic */ zzdd zzpm;

    public zzdr(zzdd zzddVar, AtomicReference atomicReference) {
        this.zzpm = zzddVar;
        this.zzpl = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzpl) {
            this.zzpl.set(Integer.valueOf(this.zzpm.zzaf().zzb(this.zzpm.zzt().zzan(), zzal.zzhn)));
            this.zzpl.notify();
        }
    }
}
