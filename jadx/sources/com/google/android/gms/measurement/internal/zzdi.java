package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdi implements Runnable {
    private final /* synthetic */ AtomicReference zzpl;
    private final /* synthetic */ zzdd zzpm;

    public zzdi(zzdd zzddVar, AtomicReference atomicReference) {
        this.zzpm = zzddVar;
        this.zzpl = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpm.zzu().zza(this.zzpl);
    }
}
