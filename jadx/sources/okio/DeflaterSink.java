package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import myunmn.C0059ao;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        yl0.e(bufferedSink, C0059ao.a(633));
        yl0.e(deflater, C0059ao.a(634));
        this.sink = bufferedSink;
        this.deflater = deflater;
    }

    @IgnoreJRERequirement
    private final void deflate(boolean z) {
        Segment writableSegment$okio;
        int deflate;
        Buffer buffer = this.sink.getBuffer();
        while (true) {
            writableSegment$okio = buffer.writableSegment$okio(1);
            if (z) {
                Deflater deflater = this.deflater;
                byte[] bArr = writableSegment$okio.data;
                int i = writableSegment$okio.limit;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = writableSegment$okio.data;
                int i2 = writableSegment$okio.limit;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                writableSegment$okio.limit += deflate;
                buffer.setSize$okio(buffer.size() + deflate);
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        Throwable th = null;
        try {
            finishDeflate$okio();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final void finishDeflate$okio() {
        this.deflater.finish();
        deflate(false);
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return C0059ao.a(637) + this.sink + ')';
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        yl0.e(buffer, C0059ao.a(638));
        Util.checkOffsetAndCount(buffer.size(), 0L, j);
        while (j > 0) {
            Segment segment = buffer.head;
            yl0.c(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, min);
            deflate(false);
            long j2 = min;
            buffer.setSize$okio(buffer.size() - j2);
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j -= j2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
        yl0.e(sink, C0059ao.a(635));
        yl0.e(deflater, C0059ao.a(636));
    }
}
