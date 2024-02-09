package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class BackgroundPriorityRunnable implements Runnable {
    public abstract void onRun();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        onRun();
    }
}
