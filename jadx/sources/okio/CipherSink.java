package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class CipherSink implements Sink {
    private final int blockSize;
    private final Cipher cipher;
    private boolean closed;
    private final BufferedSink sink;

    public CipherSink(BufferedSink bufferedSink, Cipher cipher) {
        yl0.e(bufferedSink, C0059ao.a(4578));
        yl0.e(cipher, C0059ao.a(4579));
        this.sink = bufferedSink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        if (!(blockSize > 0)) {
            throw new IllegalArgumentException((C0059ao.a(4582) + cipher).toString());
        }
        if (blockSize <= 8192) {
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(4580) + blockSize + C0059ao.a(4581) + cipher).toString());
    }

    private final Throwable doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        Buffer buffer = this.sink.getBuffer();
        Segment writableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int doFinal = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.limit);
            writableSegment$okio.limit += doFinal;
            buffer.setSize$okio(buffer.size() + doFinal);
        } catch (Throwable th2) {
            th = th2;
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
        return th;
    }

    private final int update(Buffer buffer, long j) {
        Segment segment = buffer.head;
        yl0.c(segment);
        int min = (int) Math.min(j, segment.limit - segment.pos);
        Buffer buffer2 = this.sink.getBuffer();
        Segment writableSegment$okio = buffer2.writableSegment$okio(min);
        int update = this.cipher.update(segment.data, segment.pos, min, writableSegment$okio.data, writableSegment$okio.limit);
        writableSegment$okio.limit += update;
        buffer2.setSize$okio(buffer2.size() + update);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer2.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
        buffer.setSize$okio(buffer.size() - min);
        int i = segment.pos + min;
        segment.pos = i;
        if (i == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        Throwable doFinal = doFinal();
        try {
            this.sink.close();
        } catch (Throwable th) {
            if (doFinal == null) {
                doFinal = th;
            }
        }
        if (doFinal != null) {
            throw doFinal;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.sink.flush();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        yl0.e(buffer, C0059ao.a(4583));
        Util.checkOffsetAndCount(buffer.size(), 0L, j);
        if (!(!this.closed)) {
            throw new IllegalStateException(C0059ao.a(4584).toString());
        }
        while (j > 0) {
            j -= update(buffer, j);
        }
    }
}
