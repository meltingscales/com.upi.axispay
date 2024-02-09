package okio;

import java.io.OutputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class OutputStreamSink implements Sink {
    private final OutputStream out;
    private final Timeout timeout;

    public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
        yl0.e(outputStream, C0059ao.a(14558));
        yl0.e(timeout, C0059ao.a(14559));
        this.out = outputStream;
        this.timeout = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return C0059ao.a(14560) + this.out + ')';
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(14561));
        Util.checkOffsetAndCount(buffer.size(), 0L, j);
        while (j > 0) {
            this.timeout.throwIfReached();
            Segment segment = buffer.head;
            yl0.c(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j2 = min;
            j -= j2;
            buffer.setSize$okio(buffer.size() - j2);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
