package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RetryFuture<T> extends AbstractFuture<T> implements Runnable {
    private final RetryThreadPoolExecutor executor;
    public RetryState retryState;
    private final AtomicReference<Thread> runner = new AtomicReference<>();
    private final Callable<T> task;

    public RetryFuture(Callable<T> callable, RetryState retryState, RetryThreadPoolExecutor retryThreadPoolExecutor) {
        this.task = callable;
        this.retryState = retryState;
        this.executor = retryThreadPoolExecutor;
    }

    private Backoff getBackoff() {
        return this.retryState.getBackoff();
    }

    private int getRetryCount() {
        return this.retryState.getRetryCount();
    }

    private RetryPolicy getRetryPolicy() {
        return this.retryState.getRetryPolicy();
    }

    @Override // io.fabric.sdk.android.services.concurrency.internal.AbstractFuture
    public void interruptTask() {
        Thread andSet = this.runner.getAndSet(null);
        if (andSet != null) {
            andSet.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isDone()) {
            return;
        }
        if (this.runner.compareAndSet(null, Thread.currentThread())) {
            try {
                set(this.task.call());
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
