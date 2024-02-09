package io.fabric.sdk.android.services.concurrency.internal;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AbstractFuture<V> implements Future<V> {
    private final Sync<V> sync = new Sync<>();

    public static final CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (this.sync.cancel(z)) {
            if (z) {
                interruptTask();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return this.sync.get(timeUnit.toNanos(j));
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.sync.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.sync.isDone();
    }

    public boolean set(V v) {
        return this.sync.set(v);
    }

    public boolean setException(Throwable th) {
        Objects.requireNonNull(th);
        return this.sync.setException(th);
    }

    public final boolean wasInterrupted() {
        return this.sync.wasInterrupted();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.sync.get();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Sync<V> extends AbstractQueuedSynchronizer {
        public static final int CANCELLED = 0;
        public static final int COMPLETED = 0;
        public static final int COMPLETING = 0;
        public static final int INTERRUPTED = 0;
        public static final int RUNNING = 0;
        private static final long serialVersionUID = 0;
        private Throwable exception;
        private V value;

        static {
            C0059ao.a(Sync.class, 226);
        }

        private boolean complete(V v, Throwable th, int i) {
            boolean compareAndSetState = compareAndSetState(0, 1);
            if (compareAndSetState) {
                this.value = v;
                if ((i & 12) != 0) {
                    th = new CancellationException(C0059ao.a(15493));
                }
                this.exception = th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return compareAndSetState;
        }

        private V getValue() throws CancellationException, ExecutionException {
            int state = getState();
            if (state == 2) {
                if (this.exception == null) {
                    return this.value;
                }
                throw new ExecutionException(this.exception);
            } else if (state != 4 && state != 8) {
                throw new IllegalStateException(C0059ao.a(15494) + state);
            } else {
                throw AbstractFuture.cancellationExceptionWithCause(C0059ao.a(15495), this.exception);
            }
        }

        public boolean cancel(boolean z) {
            return complete(null, null, z ? 8 : 4);
        }

        public V get(long j) throws TimeoutException, CancellationException, ExecutionException, InterruptedException {
            if (tryAcquireSharedNanos(-1, j)) {
                return getValue();
            }
            throw new TimeoutException(C0059ao.a(15496));
        }

        public boolean isCancelled() {
            return (getState() & 12) != 0;
        }

        public boolean isDone() {
            return (getState() & 14) != 0;
        }

        public boolean set(V v) {
            return complete(v, null, 2);
        }

        public boolean setException(Throwable th) {
            return complete(null, th, 2);
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i) {
            return isDone() ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        public boolean wasInterrupted() {
            return getState() == 8;
        }

        public V get() throws CancellationException, ExecutionException, InterruptedException {
            acquireSharedInterruptibly(-1);
            return getValue();
        }
    }
}
