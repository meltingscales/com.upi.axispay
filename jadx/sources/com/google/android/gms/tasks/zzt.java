package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzt implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
