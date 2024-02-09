package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class CipherSource implements Source {
    private final int blockSize;
    private final Buffer buffer;
    private final Cipher cipher;
    private boolean closed;

    /* renamed from: final  reason: not valid java name */
    private boolean f364final;
    private final BufferedSource source;

    public CipherSource(BufferedSource bufferedSource, Cipher cipher) {
        yl0.e(bufferedSource, C0059ao.a(2266));
        yl0.e(cipher, C0059ao.a(2267));
        this.source = bufferedSource;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new Buffer();
        if (!(blockSize > 0)) {
            throw new IllegalArgumentException((C0059ao.a(2270) + cipher).toString());
        }
        if (blockSize <= 8192) {
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(2268) + blockSize + C0059ao.a(2269) + cipher).toString());
    }

    private final void doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        Segment writableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int doFinal = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.pos);
        writableSegment$okio.limit += doFinal;
        Buffer buffer = this.buffer;
        buffer.setSize$okio(buffer.size() + doFinal);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    private final void refill() {
        while (this.buffer.size() == 0) {
            if (this.source.exhausted()) {
                this.f364final = true;
                doFinal();
                return;
            }
            update();
        }
    }

    private final void update() {
        Segment segment = this.source.getBuffer().head;
        yl0.c(segment);
        int i = segment.limit - segment.pos;
        Segment writableSegment$okio = this.buffer.writableSegment$okio(i);
        int update = this.cipher.update(segment.data, segment.pos, i, writableSegment$okio.data, writableSegment$okio.pos);
        this.source.skip(i);
        writableSegment$okio.limit += update;
        Buffer buffer = this.buffer;
        buffer.setSize$okio(buffer.size() + update);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.source.close();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        yl0.e(buffer, C0059ao.a(2271));
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (true ^ this.closed) {
                if (i == 0) {
                    return 0L;
                }
                if (this.f364final) {
                    return this.buffer.read(buffer, j);
                }
                refill();
                return this.buffer.read(buffer, j);
            }
            throw new IllegalStateException(C0059ao.a(2272).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(2273) + j).toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
