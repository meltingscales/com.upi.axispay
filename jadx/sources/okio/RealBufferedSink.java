package okio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink) {
        yl0.e(sink, C0059ao.a(12562));
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        Throwable th = null;
        try {
            if (this.bufferField.size() > 0) {
                Sink sink = this.sink;
                Buffer buffer = this.bufferField;
                sink.write(buffer, buffer.size());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink emit() {
        if (!this.closed) {
            long size = this.bufferField.size();
            if (size > 0) {
                this.sink.write(this.bufferField, size);
            }
            return this;
        }
        throw new IllegalStateException(C0059ao.a(12563).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink emitCompleteSegments() {
        if (!this.closed) {
            long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                this.sink.write(this.bufferField, completeSegmentByteCount);
            }
            return this;
        }
        throw new IllegalStateException(C0059ao.a(12564).toString());
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (!this.closed) {
            if (this.bufferField.size() > 0) {
                Sink sink = this.sink;
                Buffer buffer = this.bufferField;
                sink.write(buffer, buffer.size());
            }
            this.sink.flush();
            return;
        }
        throw new IllegalStateException(C0059ao.a(12565).toString());
    }

    @Override // okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.RealBufferedSink$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    return;
                }
                realBufferedSink.flush();
            }

            public String toString() {
                return RealBufferedSink.this + C0059ao.a(6889);
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.writeByte((int) ((byte) i));
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException(C0059ao.a(6890));
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                yl0.e(bArr, C0059ao.a(6891));
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.write(bArr, i, i2);
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException(C0059ao.a(6892));
            }
        };
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return C0059ao.a(12566) + this.sink + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        yl0.e(byteBuffer, C0059ao.a(12567));
        if (!this.closed) {
            int write = this.bufferField.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException(C0059ao.a(12568).toString());
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) {
        yl0.e(source, C0059ao.a(12580));
        long j = 0;
        while (true) {
            long read = source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE);
            if (read == -1) {
                return j;
            }
            j += read;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink writeByte(int i) {
        if (!this.closed) {
            this.bufferField.writeByte(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12581).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeDecimalLong(long j) {
        if (!this.closed) {
            this.bufferField.writeDecimalLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12582).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j) {
        if (!this.closed) {
            this.bufferField.writeHexadecimalUnsignedLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12583).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeInt(int i) {
        if (!this.closed) {
            this.bufferField.writeInt(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12584).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeIntLe(int i) {
        if (!this.closed) {
            this.bufferField.writeIntLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12585).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeLong(long j) {
        if (!this.closed) {
            this.bufferField.writeLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12586).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeLongLe(long j) {
        if (!this.closed) {
            this.bufferField.writeLongLe(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12587).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShort(int i) {
        if (!this.closed) {
            this.bufferField.writeShort(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12588).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShortLe(int i) {
        if (!this.closed) {
            this.bufferField.writeShortLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12589).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeString(String str, Charset charset) {
        yl0.e(str, C0059ao.a(12593));
        yl0.e(charset, C0059ao.a(12594));
        if (!this.closed) {
            this.bufferField.writeString(str, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12595).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String str) {
        yl0.e(str, C0059ao.a(12596));
        if (!this.closed) {
            this.bufferField.writeUtf8(str);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12597).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i) {
        if (!this.closed) {
            this.bufferField.writeUtf8CodePoint(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12600).toString());
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(12578));
        if (!this.closed) {
            this.bufferField.write(buffer, j);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException(C0059ao.a(12579).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeString(String str, int i, int i2, Charset charset) {
        yl0.e(str, C0059ao.a(12590));
        yl0.e(charset, C0059ao.a(12591));
        if (!this.closed) {
            this.bufferField.writeString(str, i, i2, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12592).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String str, int i, int i2) {
        yl0.e(str, C0059ao.a(12598));
        if (!this.closed) {
            this.bufferField.writeUtf8(str, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12599).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink write(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(12569));
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12570).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink write(ByteString byteString, int i, int i2) {
        yl0.e(byteString, C0059ao.a(12571));
        if (!this.closed) {
            this.bufferField.write(byteString, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12572).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(12574));
        if (!this.closed) {
            this.bufferField.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12575).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] bArr, int i, int i2) {
        yl0.e(bArr, C0059ao.a(12576));
        if (!this.closed) {
            this.bufferField.write(bArr, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(12577).toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink write(Source source, long j) {
        yl0.e(source, C0059ao.a(12573));
        while (j > 0) {
            long read = source.read(this.bufferField, j);
            if (read != -1) {
                j -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
