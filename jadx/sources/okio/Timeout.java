package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Timeout {
    public static final Companion Companion = new Companion(null);
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        public Timeout deadlineNanoTime(long j) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        public Timeout timeout(long j, TimeUnit timeUnit) {
            yl0.e(timeUnit, C0059ao.a(15661));
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public final long minTimeout(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final Timeout deadline(long j, TimeUnit timeUnit) {
        yl0.e(timeUnit, C0059ao.a(9057));
        if (j > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException((C0059ao.a(9058) + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException(C0059ao.a(9059).toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(Timeout timeout, sk0<pi0> sk0Var) {
        yl0.e(timeout, C0059ao.a(9060));
        yl0.e(sk0Var, C0059ao.a(9061));
        long timeoutNanos = timeoutNanos();
        long minTimeout = Companion.minTimeout(timeout.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(minTimeout, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (timeout.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), timeout.deadlineNanoTime()));
            }
            try {
                sk0Var.invoke();
                xl0.b(1);
                timeout(timeoutNanos, timeUnit);
                if (timeout.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                xl0.a(1);
                return;
            } catch (Throwable th) {
                xl0.b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                xl0.a(1);
                throw th;
            }
        }
        if (timeout.hasDeadline()) {
            deadlineNanoTime(timeout.deadlineNanoTime());
        }
        try {
            sk0Var.invoke();
            xl0.b(1);
            timeout(timeoutNanos, timeUnit);
            if (timeout.hasDeadline()) {
                clearDeadline();
            }
            xl0.a(1);
        } catch (Throwable th2) {
            xl0.b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout.hasDeadline()) {
                clearDeadline();
            }
            xl0.a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (!Thread.interrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException(C0059ao.a(9062));
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException(C0059ao.a(9063));
    }

    public Timeout timeout(long j, TimeUnit timeUnit) {
        yl0.e(timeUnit, C0059ao.a(9064));
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException((C0059ao.a(9065) + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        yl0.e(obj, C0059ao.a(9066));
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j2 = timeoutNanos / 1000000;
                obj.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= timeoutNanos) {
                throw new InterruptedIOException(C0059ao.a(9067));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(C0059ao.a(9068));
        }
    }

    public Timeout deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
