package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private Sink foldedSink;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j) {
        this.maxBufferSize = j;
        if (j >= 1) {
            this.sink = new Sink() { // from class: okio.Pipe$sink$1
                private final Timeout timeout = new Timeout();

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    synchronized (Pipe.this.getBuffer$okio()) {
                        if (Pipe.this.getSinkClosed$okio()) {
                            return;
                        }
                        Sink foldedSink$okio = Pipe.this.getFoldedSink$okio();
                        if (foldedSink$okio == null) {
                            if (Pipe.this.getSourceClosed$okio() && Pipe.this.getBuffer$okio().size() > 0) {
                                throw new IOException(C0059ao.a(2232));
                            }
                            Pipe.this.setSinkClosed$okio(true);
                            Buffer buffer$okio = Pipe.this.getBuffer$okio();
                            if (buffer$okio == null) {
                                throw new NullPointerException(C0059ao.a(2233));
                            }
                            buffer$okio.notifyAll();
                            foldedSink$okio = null;
                        }
                        pi0 pi0Var = pi0.a;
                        if (foldedSink$okio != null) {
                            Pipe pipe = Pipe.this;
                            Timeout timeout = foldedSink$okio.timeout();
                            Timeout timeout2 = pipe.sink().timeout();
                            long timeoutNanos = timeout.timeoutNanos();
                            long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            timeout.timeout(minTimeout, timeUnit);
                            if (timeout.hasDeadline()) {
                                long deadlineNanoTime = timeout.deadlineNanoTime();
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                }
                                try {
                                    foldedSink$okio.close();
                                    timeout.timeout(timeoutNanos, timeUnit);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                    }
                                    throw th;
                                }
                            }
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.close();
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            } catch (Throwable th2) {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th2;
                            }
                        }
                    }
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() {
                    Sink foldedSink$okio;
                    synchronized (Pipe.this.getBuffer$okio()) {
                        if (!Pipe.this.getSinkClosed$okio()) {
                            if (!Pipe.this.getCanceled$okio()) {
                                foldedSink$okio = Pipe.this.getFoldedSink$okio();
                                if (foldedSink$okio == null) {
                                    if (Pipe.this.getSourceClosed$okio() && Pipe.this.getBuffer$okio().size() > 0) {
                                        throw new IOException(C0059ao.a(2234));
                                    }
                                    foldedSink$okio = null;
                                }
                                pi0 pi0Var = pi0.a;
                            } else {
                                throw new IOException(C0059ao.a(2235));
                            }
                        } else {
                            throw new IllegalStateException(C0059ao.a(2236).toString());
                        }
                    }
                    if (foldedSink$okio != null) {
                        Pipe pipe = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe.sink().timeout();
                        long timeoutNanos = timeout.timeoutNanos();
                        long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(minTimeout, timeUnit);
                        if (timeout.hasDeadline()) {
                            long deadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.flush();
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(deadlineNanoTime);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(deadlineNanoTime);
                                }
                                throw th;
                            }
                        }
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.flush();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                        } catch (Throwable th2) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th2;
                        }
                    }
                }

                @Override // okio.Sink
                public Timeout timeout() {
                    return this.timeout;
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
                    r1 = defpackage.pi0.a;
                 */
                @Override // okio.Sink
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void write(okio.Buffer r14, long r15) {
                    /*
                        Method dump skipped, instructions count: 352
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: okio.Pipe$sink$1.write(okio.Buffer, long):void");
                }
            };
            this.source = new Source() { // from class: okio.Pipe$source$1
                private final Timeout timeout = new Timeout();

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    synchronized (Pipe.this.getBuffer$okio()) {
                        Pipe.this.setSourceClosed$okio(true);
                        Buffer buffer$okio = Pipe.this.getBuffer$okio();
                        if (buffer$okio != null) {
                            buffer$okio.notifyAll();
                            pi0 pi0Var = pi0.a;
                        } else {
                            throw new NullPointerException(C0059ao.a(6434));
                        }
                    }
                }

                @Override // okio.Source
                public long read(Buffer buffer, long j2) {
                    yl0.e(buffer, C0059ao.a(6435));
                    synchronized (Pipe.this.getBuffer$okio()) {
                        if (!Pipe.this.getSourceClosed$okio()) {
                            if (!Pipe.this.getCanceled$okio()) {
                                while (Pipe.this.getBuffer$okio().size() == 0) {
                                    if (Pipe.this.getSinkClosed$okio()) {
                                        return -1L;
                                    }
                                    this.timeout.waitUntilNotified(Pipe.this.getBuffer$okio());
                                    if (Pipe.this.getCanceled$okio()) {
                                        throw new IOException(C0059ao.a(6436));
                                    }
                                }
                                long read = Pipe.this.getBuffer$okio().read(buffer, j2);
                                Buffer buffer$okio = Pipe.this.getBuffer$okio();
                                if (buffer$okio != null) {
                                    buffer$okio.notifyAll();
                                    return read;
                                }
                                throw new NullPointerException(C0059ao.a(6437));
                            }
                            throw new IOException(C0059ao.a(6438));
                        }
                        throw new IllegalStateException(C0059ao.a(6439).toString());
                    }
                }

                @Override // okio.Source
                public Timeout timeout() {
                    return this.timeout;
                }
            };
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(6914) + j).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forward(Sink sink, dl0<? super Sink, pi0> dl0Var) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(minTimeout, timeUnit);
        if (timeout.hasDeadline()) {
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                dl0Var.invoke(sink);
                xl0.b(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                xl0.a(1);
                return;
            } catch (Throwable th) {
                xl0.b(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                xl0.a(1);
                throw th;
            }
        }
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
        }
        try {
            dl0Var.invoke(sink);
            xl0.b(1);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.clearDeadline();
            }
            xl0.a(1);
        } catch (Throwable th2) {
            xl0.b(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.clearDeadline();
            }
            xl0.a(1);
            throw th2;
        }
    }

    /* renamed from: -deprecated_sink  reason: not valid java name */
    public final Sink m395deprecated_sink() {
        return this.sink;
    }

    /* renamed from: -deprecated_source  reason: not valid java name */
    public final Source m396deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        synchronized (this.buffer) {
            this.canceled = true;
            this.buffer.clear();
            Buffer buffer = this.buffer;
            if (buffer != null) {
                buffer.notifyAll();
                pi0 pi0Var = pi0.a;
            } else {
                throw new NullPointerException(C0059ao.a(6915));
            }
        }
    }

    public final void fold(Sink sink) throws IOException {
        boolean z;
        Buffer buffer;
        yl0.e(sink, C0059ao.a(6916));
        while (true) {
            synchronized (this.buffer) {
                if (this.foldedSink == null) {
                    if (!this.canceled) {
                        if (this.buffer.exhausted()) {
                            this.sourceClosed = true;
                            this.foldedSink = sink;
                            return;
                        }
                        z = this.sinkClosed;
                        buffer = new Buffer();
                        Buffer buffer2 = this.buffer;
                        buffer.write(buffer2, buffer2.size());
                        Buffer buffer3 = this.buffer;
                        if (buffer3 != null) {
                            buffer3.notifyAll();
                            pi0 pi0Var = pi0.a;
                        } else {
                            throw new NullPointerException(C0059ao.a(6918));
                        }
                    } else {
                        this.foldedSink = sink;
                        throw new IOException(C0059ao.a(6919));
                    }
                } else {
                    throw new IllegalStateException(C0059ao.a(6920).toString());
                }
            }
            try {
                sink.write(buffer, buffer.size());
                if (z) {
                    sink.close();
                } else {
                    sink.flush();
                }
            } catch (Throwable th) {
                synchronized (this.buffer) {
                    this.sourceClosed = true;
                    Buffer buffer4 = this.buffer;
                    if (buffer4 == null) {
                        throw new NullPointerException(C0059ao.a(6917));
                    }
                    buffer4.notifyAll();
                    pi0 pi0Var2 = pi0.a;
                    throw th;
                }
            }
        }
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z) {
        this.canceled = z;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.sinkClosed = z;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.sourceClosed = z;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
