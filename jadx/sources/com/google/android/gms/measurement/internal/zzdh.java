package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdh implements Runnable {
    private final /* synthetic */ boolean zzbd;
    private final /* synthetic */ AtomicReference zzpl;
    private final /* synthetic */ zzdd zzpm;

    public zzdh(zzdd zzddVar, AtomicReference atomicReference, boolean z) {
        this.zzpm = zzddVar;
        this.zzpl = atomicReference;
        this.zzbd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpm.zzu().zza(this.zzpl, this.zzbd);
    }
}
