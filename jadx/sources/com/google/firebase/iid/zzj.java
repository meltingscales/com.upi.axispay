package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zzj implements Executor {
    public static final Executor zzam = new zzj();

    private zzj() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
