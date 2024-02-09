package com.appsflyer;

import android.net.TrafficStats;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AFExecutor {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static AFExecutor f24;

    /* renamed from: ı  reason: contains not printable characters */
    public Executor f25;

    /* renamed from: ɩ  reason: contains not printable characters */
    public ScheduledExecutorService f26;

    /* renamed from: Ι  reason: contains not printable characters */
    public final ThreadFactory f27 = new ThreadFactory() { // from class: com.appsflyer.AFExecutor.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.appsflyer.AFExecutor.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    TrafficStats.setThreadStatsTag(C0059ao.a(8950).hashCode());
                    runnable.run();
                }
            });
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    public ScheduledExecutorService f28;

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f24 == null) {
            f24 = new AFExecutor();
        }
        return f24;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m10(ExecutorService executorService) {
        String a = C0059ao.a(2822);
        try {
            try {
                AFLogger.afRDLog(C0059ao.a(2823));
                executorService.shutdown();
                executorService.awaitTermination(10L, TimeUnit.SECONDS);
                if (!executorService.isTerminated()) {
                    AFLogger.afRDLog(a);
                }
                executorService.shutdownNow();
            } catch (InterruptedException unused) {
                AFLogger.afRDLog(C0059ao.a(2824));
                if (!executorService.isTerminated()) {
                    AFLogger.afRDLog(a);
                }
                executorService.shutdownNow();
            }
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog(a);
            }
            executorService.shutdownNow();
            throw th;
        }
    }

    public Executor getThreadPoolExecutor() {
        Executor executor = this.f25;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f25).isTerminated() || ((ThreadPoolExecutor) this.f25).isTerminating()))) {
            this.f25 = Executors.newFixedThreadPool(2, this.f27);
        }
        return this.f25;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final ScheduledThreadPoolExecutor m11() {
        ScheduledExecutorService scheduledExecutorService = this.f28;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f28.isTerminated()) {
            this.f28 = Executors.newScheduledThreadPool(2, this.f27);
        }
        return (ScheduledThreadPoolExecutor) this.f28;
    }
}
