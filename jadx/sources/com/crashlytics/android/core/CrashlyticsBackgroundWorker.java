package com.crashlytics.android.core;

import android.os.Looper;
import io.fabric.sdk.android.Fabric;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CrashlyticsBackgroundWorker {
    private final ExecutorService executorService;

    public CrashlyticsBackgroundWorker(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public Future<?> submit(final Runnable runnable) {
        try {
            return this.executorService.submit(new Runnable() { // from class: com.crashlytics.android.core.CrashlyticsBackgroundWorker.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        Fabric.getLogger().e(C0059ao.a(7660), C0059ao.a(7661), e);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            Fabric.getLogger().d(C0059ao.a(14955), C0059ao.a(14956));
            return null;
        }
    }

    public <T> T submitAndWait(Callable<T> callable) {
        String a = C0059ao.a(14959);
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return this.executorService.submit(callable).get(4L, TimeUnit.SECONDS);
            }
            return this.executorService.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            Fabric.getLogger().d(a, C0059ao.a(14961));
            return null;
        } catch (Exception e) {
            Fabric.getLogger().e(a, C0059ao.a(14960), e);
            return null;
        }
    }

    public <T> Future<T> submit(final Callable<T> callable) {
        try {
            return this.executorService.submit(new Callable<T>() { // from class: com.crashlytics.android.core.CrashlyticsBackgroundWorker.2
                @Override // java.util.concurrent.Callable
                public T call() throws Exception {
                    try {
                        return (T) callable.call();
                    } catch (Exception e) {
                        Fabric.getLogger().e(C0059ao.a(7638), C0059ao.a(7639), e);
                        return null;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            Fabric.getLogger().d(C0059ao.a(14957), C0059ao.a(14958));
            return null;
        }
    }
}
