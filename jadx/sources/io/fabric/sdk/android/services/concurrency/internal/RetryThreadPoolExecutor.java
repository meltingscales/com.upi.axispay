package io.fabric.sdk.android.services.concurrency.internal;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RetryThreadPoolExecutor extends ScheduledThreadPoolExecutor {
    private final Backoff backoff;
    private final RetryPolicy retryPolicy;

    public RetryThreadPoolExecutor(int i, RetryPolicy retryPolicy, Backoff backoff) {
        this(i, Executors.defaultThreadFactory(), retryPolicy, backoff);
    }

    private <T> Future<T> scheduleWithRetryInternal(Callable<T> callable) {
        Objects.requireNonNull(callable);
        RetryFuture retryFuture = new RetryFuture(callable, new RetryState(this.backoff, this.retryPolicy), this);
        execute(retryFuture);
        return retryFuture;
    }

    public Backoff getBackoff() {
        return this.backoff;
    }

    public RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    public Future<?> scheduleWithRetry(Runnable runnable) {
        return scheduleWithRetryInternal(Executors.callable(runnable));
    }

    public RetryThreadPoolExecutor(int i, ThreadFactory threadFactory, RetryPolicy retryPolicy, Backoff backoff) {
        super(i, threadFactory);
        Objects.requireNonNull(retryPolicy, C0059ao.a(3631));
        Objects.requireNonNull(backoff, C0059ao.a(3632));
        this.retryPolicy = retryPolicy;
        this.backoff = backoff;
    }

    public <T> Future<T> scheduleWithRetry(Runnable runnable, T t) {
        return scheduleWithRetryInternal(Executors.callable(runnable, t));
    }

    public <T> Future<T> scheduleWithRetry(Callable<T> callable) {
        return scheduleWithRetryInternal(callable);
    }
}
