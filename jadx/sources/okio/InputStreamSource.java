package okio;

import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public InputStreamSource(InputStream inputStream, Timeout timeout) {
        yl0.e(inputStream, C0059ao.a(37));
        yl0.e(timeout, C0059ao.a(38));
        this.input = inputStream;
        this.timeout = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(39));
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.timeout.throwIfReached();
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                int read = this.input.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
                if (read == -1) {
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        buffer.head = writableSegment$okio.pop();
                        SegmentPool.recycle(writableSegment$okio);
                        return -1L;
                    }
                    return -1L;
                }
                writableSegment$okio.limit += read;
                long j2 = read;
                buffer.setSize$okio(buffer.size() + j2);
                return j2;
            } catch (AssertionError e) {
                if (Okio.isAndroidGetsocknameError(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException((C0059ao.a(40) + j).toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return C0059ao.a(41) + this.input + ')';
    }
}
