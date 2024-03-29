package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import io.fabric.sdk.android.services.concurrency.internal.RetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ExecutorUtils {
    private static final long DEFAULT_TERMINATION_TIMEOUT = 0;

    static {
        C0059ao.a(ExecutorUtils.class, 347);
    }

    private ExecutorUtils() {
    }

    private static final void addDelayedShutdownHook(String str, ExecutorService executorService) {
        addDelayedShutdownHook(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static RetryThreadPoolExecutor buildRetryThreadPoolExecutor(String str, int i, RetryPolicy retryPolicy, Backoff backoff) {
        RetryThreadPoolExecutor retryThreadPoolExecutor = new RetryThreadPoolExecutor(i, getNamedThreadFactory(str), retryPolicy, backoff);
        addDelayedShutdownHook(str, retryThreadPoolExecutor);
        return retryThreadPoolExecutor;
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    public static final ThreadFactory getNamedThreadFactory(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1L);
        return new ThreadFactory() { // from class: io.fabric.sdk.android.services.common.ExecutorUtils.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() { // from class: io.fabric.sdk.android.services.common.ExecutorUtils.1.1
                    @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
                    public void onRun() {
                        runnable.run();
                    }
                });
                newThread.setName(str + atomicLong.getAndIncrement());
                return newThread;
            }
        };
    }

    public static final void addDelayedShutdownHook(final String str, final ExecutorService executorService, final long j, final TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        BackgroundPriorityRunnable backgroundPriorityRunnable = new BackgroundPriorityRunnable() { // from class: io.fabric.sdk.android.services.common.ExecutorUtils.2
            @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
            public void onRun() {
                String a = C0059ao.a(9907);
                try {
                    Logger logger = Fabric.getLogger();
                    logger.d(a, C0059ao.a(9908) + str);
                    executorService.shutdown();
                    if (executorService.awaitTermination(j, timeUnit)) {
                        return;
                    }
                    Logger logger2 = Fabric.getLogger();
                    logger2.d(a, str + C0059ao.a(9909));
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    Fabric.getLogger().d(a, String.format(Locale.US, C0059ao.a(9910), str));
                    executorService.shutdownNow();
                }
            }
        };
        runtime.addShutdownHook(new Thread(backgroundPriorityRunnable, C0059ao.a(6839) + str));
    }
}
