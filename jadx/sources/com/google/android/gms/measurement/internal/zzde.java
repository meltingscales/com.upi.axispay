package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzde implements Runnable {
    private final /* synthetic */ AtomicReference zzpl;
    private final /* synthetic */ zzdd zzpm;

    public zzde(zzdd zzddVar, AtomicReference atomicReference) {
        this.zzpm = zzddVar;
        this.zzpl = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzpl) {
            this.zzpl.set(Boolean.valueOf(this.zzpm.zzaf().zzp(this.zzpm.zzt().zzan())));
            this.zzpl.notify();
        }
    }
}
