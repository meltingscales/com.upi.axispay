package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler(long j) {
        this.allocatedUntil = j;
        this.waitByteCount = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        this.maxByteCount = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = throttler.waitByteCount;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j, j4, j3);
    }

    private final long bytesToNanos(long j) {
        return (j * 1000000000) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j) {
        return (j * this.bytesPerSecond) / 1000000000;
    }

    private final void waitNanos(long j) {
        long j2 = j / 1000000;
        wait(j2, (int) (j - (1000000 * j2)));
    }

    public final long byteCountOrWaitNanos$okio(long j, long j2) {
        if (this.bytesPerSecond == 0) {
            return j2;
        }
        long max = Math.max(this.allocatedUntil - j, 0L);
        long nanosToBytes = this.maxByteCount - nanosToBytes(max);
        if (nanosToBytes >= j2) {
            this.allocatedUntil = j + max + bytesToNanos(j2);
            return j2;
        }
        long j3 = this.waitByteCount;
        if (nanosToBytes >= j3) {
            this.allocatedUntil = j + bytesToNanos(this.maxByteCount);
            return nanosToBytes;
        }
        long min = Math.min(j3, j2);
        long bytesToNanos = max + bytesToNanos(min - this.maxByteCount);
        if (bytesToNanos == 0) {
            this.allocatedUntil = j + bytesToNanos(this.maxByteCount);
            return min;
        }
        return -bytesToNanos;
    }

    public final void bytesPerSecond(long j) {
        bytesPerSecond$default(this, j, 0L, 0L, 6, null);
    }

    public final void bytesPerSecond(long j, long j2) {
        bytesPerSecond$default(this, j, j2, 0L, 4, null);
    }

    public final void bytesPerSecond(long j, long j2, long j3) {
        synchronized (this) {
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C0059ao.a(3511).toString());
            }
            if (!(j2 > 0)) {
                throw new IllegalArgumentException(C0059ao.a(3510).toString());
            }
            if (j3 >= j2) {
                this.bytesPerSecond = j;
                this.waitByteCount = j2;
                this.maxByteCount = j3;
                notifyAll();
                pi0 pi0Var = pi0.a;
            } else {
                throw new IllegalArgumentException(C0059ao.a(3509).toString());
            }
        }
    }

    public final Sink sink(final Sink sink) {
        yl0.e(sink, C0059ao.a(3512));
        return new ForwardingSink(sink) { // from class: okio.Throttler$sink$1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(Buffer buffer, long j) throws IOException {
                yl0.e(buffer, C0059ao.a(12521));
                while (j > 0) {
                    try {
                        long take$okio = Throttler.this.take$okio(j);
                        super.write(buffer, take$okio);
                        j -= take$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException(C0059ao.a(12522));
                    }
                }
            }
        };
    }

    public final Source source(final Source source) {
        yl0.e(source, C0059ao.a(3513));
        return new ForwardingSource(source) { // from class: okio.Throttler$source$1
            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j) {
                yl0.e(buffer, C0059ao.a(6167));
                try {
                    return super.read(buffer, Throttler.this.take$okio(j));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException(C0059ao.a(6168));
                }
            }
        };
    }

    public final long take$okio(long j) {
        long byteCountOrWaitNanos$okio;
        if (j > 0) {
            synchronized (this) {
                while (true) {
                    byteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j);
                    if (byteCountOrWaitNanos$okio < 0) {
                        waitNanos(-byteCountOrWaitNanos$okio);
                    }
                }
            }
            return byteCountOrWaitNanos$okio;
        }
        throw new IllegalArgumentException(C0059ao.a(3514).toString());
    }

    public Throttler() {
        this(System.nanoTime());
    }
}
