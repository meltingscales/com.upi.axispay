package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        yl0.e(bufferedSource, C0059ao.a(3404));
        yl0.e(inflater, C0059ao.a(3405));
        this.source = bufferedSource;
        this.inflater = inflater;
    }

    private final void releaseBytesAfterInflate() {
        int i = this.bufferBytesHeldByInflater;
        if (i == 0) {
            return;
        }
        int remaining = i - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        yl0.e(buffer, C0059ao.a(3408));
        do {
            long readOrInflate = readOrInflate(buffer, j);
            if (readOrInflate > 0) {
                return readOrInflate;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException(C0059ao.a(3409));
    }

    public final long readOrInflate(Buffer buffer, long j) throws IOException {
        yl0.e(buffer, C0059ao.a(3410));
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.closed) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    Segment writableSegment$okio = buffer.writableSegment$okio(1);
                    refill();
                    int inflate = this.inflater.inflate(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
                    releaseBytesAfterInflate();
                    if (inflate > 0) {
                        writableSegment$okio.limit += inflate;
                        long j2 = inflate;
                        buffer.setSize$okio(buffer.size() + j2);
                        return j2;
                    }
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        buffer.head = writableSegment$okio.pop();
                        SegmentPool.recycle(writableSegment$okio);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException(C0059ao.a(3411).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(3412) + j).toString());
    }

    public final boolean refill() throws IOException {
        if (this.inflater.needsInput()) {
            if (this.source.exhausted()) {
                return true;
            }
            Segment segment = this.source.getBuffer().head;
            yl0.c(segment);
            int i = segment.limit;
            int i2 = segment.pos;
            int i3 = i - i2;
            this.bufferBytesHeldByInflater = i3;
            this.inflater.setInput(segment.data, i2, i3);
            return false;
        }
        return false;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
        yl0.e(source, C0059ao.a(3406));
        yl0.e(inflater, C0059ao.a(3407));
    }
}
