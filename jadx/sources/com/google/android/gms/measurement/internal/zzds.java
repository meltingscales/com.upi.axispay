package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzds implements Runnable {
    private final /* synthetic */ AtomicReference zzpl;
    private final /* synthetic */ zzdd zzpm;

    public zzds(zzdd zzddVar, AtomicReference atomicReference) {
        this.zzpm = zzddVar;
        this.zzpl = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzpl) {
            this.zzpl.set(Double.valueOf(this.zzpm.zzaf().zzc(this.zzpm.zzt().zzan(), zzal.zzho)));
            this.zzpl.notify();
        }
    }
}
