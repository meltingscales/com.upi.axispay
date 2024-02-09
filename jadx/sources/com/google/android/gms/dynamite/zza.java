package com.google.android.gms.dynamite;

import android.os.Process;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zza extends Thread {
    public zza(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
