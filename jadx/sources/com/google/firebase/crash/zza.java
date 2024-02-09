package com.google.firebase.crash;

import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zza implements Executor {
    public static final Executor zzm = new zza();

    private zza() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
