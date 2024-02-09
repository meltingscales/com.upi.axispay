package okio;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import myunmn.C0059ao;
import okio.internal.BufferKt;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer bufferField;
    public boolean closed;
    public final Source source;

    public RealBufferedSource(Source source) {
        yl0.e(source, C0059ao.a(15167));
        this.source = source;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (!this.closed) {
            return this.bufferField.exhausted() && this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1;
        }
        throw new IllegalStateException(C0059ao.a(15168).toString());
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, RecyclerView.FOREVER_NS);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(15175));
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    return (int) Math.min(realBufferedSource.bufferField.size(), (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
                throw new IOException(C0059ao.a(5353));
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    if (realBufferedSource.bufferField.size() == 0) {
                        RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                        if (realBufferedSource2.source.read(realBufferedSource2.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                            return -1;
                        }
                    }
                    return RealBufferedSource.this.bufferField.readByte() & 255;
                }
                throw new IOException(C0059ao.a(5354));
            }

            public String toString() {
                return RealBufferedSource.this + C0059ao.a(5357);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                yl0.e(bArr, C0059ao.a(5355));
                if (!RealBufferedSource.this.closed) {
                    Util.checkOffsetAndCount(bArr.length, i, i2);
                    if (RealBufferedSource.this.bufferField.size() == 0) {
                        RealBufferedSource realBufferedSource = RealBufferedSource.this;
                        if (realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                            return -1;
                        }
                    }
                    return RealBufferedSource.this.bufferField.read(bArr, i, i2);
                }
                throw new IOException(C0059ao.a(5356));
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString) {
        yl0.e(byteString, C0059ao.a(15178));
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(15182));
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) {
        yl0.e(sink, C0059ao.a(15187));
        long j = 0;
        while (this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) != -1) {
            long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.bufferField, completeSegmentByteCount);
            }
        }
        if (this.bufferField.size() > 0) {
            long size = j + this.bufferField.size();
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
            return size;
        }
        return j;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(myunmn.C0059ao.a(15188));
        defpackage.on0.a(16);
        defpackage.on0.a(16);
        r2 = java.lang.Integer.toString(r8, 16);
        defpackage.yl0.d(r2, myunmn.C0059ao.a(15189));
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L61
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L61
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 15188(0x3b54, float:2.1283E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r2)
            r1.append(r2)
            r2 = 16
            defpackage.on0.a(r2)
            defpackage.on0.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            r3 = 15189(0x3b55, float:2.1284E-41)
            java.lang.String r3 = myunmn.C0059ao.a(r3)
            defpackage.yl0.d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L61:
            okio.Buffer r0 = r10.bufferField
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.RealBufferedSource.readDecimalLong():long");
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(15191));
        try {
            require(bArr.length);
            this.bufferField.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int read = buffer.read(bArr, i, (int) buffer.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
        byte b;
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            b = this.bufferField.getByte(i);
            if ((b < ((byte) 48) || b > ((byte) 57)) && ((b < ((byte) 97) || b > ((byte) 102)) && (b < ((byte) 65) || b > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(15192));
            on0.a(16);
            on0.a(16);
            String num = Integer.toString(b, 16);
            yl0.d(num, C0059ao.a(15193));
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public int readInt() {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    public String readString(long j, Charset charset) {
        yl0.e(charset, C0059ao.a(15194));
        require(j);
        return this.bufferField.readString(j, charset);
    }

    @Override // okio.BufferedSource
    public String readUtf8() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
        require(1L);
        byte b = this.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & 240) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            if (this.bufferField.size() != 0) {
                return readUtf8(this.bufferField.size());
            }
            return null;
        }
        return BufferKt.readUtf8Line(this.bufferField, indexOf);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(RecyclerView.FOREVER_NS);
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        if (j >= 0) {
            if (!this.closed) {
                while (this.bufferField.size() < j) {
                    if (this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException(C0059ao.a(15200).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(15201) + j).toString());
    }

    @Override // okio.BufferedSource
    public void require(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) {
        yl0.e(options, C0059ao.a(15202));
        if (!this.closed) {
            while (true) {
                int selectPrefix = BufferKt.selectPrefix(this.bufferField, options, true);
                if (selectPrefix == -2) {
                    if (this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                        break;
                    }
                } else if (selectPrefix != -1) {
                    this.bufferField.skip(options.getByteStrings$okio()[selectPrefix].size());
                    return selectPrefix;
                }
            }
            return -1;
        }
        throw new IllegalStateException(C0059ao.a(15203).toString());
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        if (!(!this.closed)) {
            throw new IllegalStateException(C0059ao.a(15204).toString());
        }
        while (j > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.bufferField.size());
            this.bufferField.skip(min);
            j -= min;
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return C0059ao.a(15205) + this.source + ')';
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j) {
        return indexOf(b, j, RecyclerView.FOREVER_NS);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j) {
        yl0.e(byteString, C0059ao.a(15176));
        if (!(!this.closed)) {
            throw new IllegalStateException(C0059ao.a(15177).toString());
        }
        while (true) {
            long indexOfElement = this.bufferField.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(15184));
        if (j >= 0) {
            if (!this.closed) {
                if (this.bufferField.size() == 0 && this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                    return -1L;
                }
                return this.bufferField.read(buffer, Math.min(j, this.bufferField.size()));
            }
            throw new IllegalStateException(C0059ao.a(15185).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(15186) + j).toString());
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j) {
        if (j >= 0) {
            long j2 = j == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(this.bufferField, indexOf);
            }
            if (j2 < RecyclerView.FOREVER_NS && request(j2) && this.bufferField.getByte(j2 - 1) == ((byte) 13) && request(1 + j2) && this.bufferField.getByte(j2) == b) {
                return BufferKt.readUtf8Line(this.bufferField, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.bufferField;
            buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
            throw new EOFException(C0059ao.a(15196) + Math.min(this.bufferField.size(), j) + C0059ao.a(15197) + buffer.readByteString().hex() + C0059ao.a(15198));
        }
        throw new IllegalArgumentException((C0059ao.a(15199) + j).toString());
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(15172));
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        int i3;
        yl0.e(byteString, C0059ao.a(15179));
        if (!this.closed) {
            if (j >= 0 && i >= 0 && i2 >= 0 && byteString.size() - i >= i2) {
                for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                    long j2 = i3 + j;
                    i3 = (request(1 + j2) && this.bufferField.getByte(j2) == byteString.getByte(i + i3)) ? i3 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException(C0059ao.a(15180).toString());
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j, long j2) {
        boolean z = true;
        if (!this.closed) {
            if (!((0 > j || j2 < j) ? false : false)) {
                throw new IllegalArgumentException((C0059ao.a(15169) + j + C0059ao.a(15170) + j2).toString());
            }
            while (j < j2) {
                long indexOf = this.bufferField.indexOf(b, j, j2);
                if (indexOf != -1) {
                    return indexOf;
                }
                long size = this.bufferField.size();
                if (size >= j2 || this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                    return -1L;
                }
                j = Math.max(j, size);
            }
            return -1L;
        }
        throw new IllegalStateException(C0059ao.a(15171).toString());
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        yl0.e(charset, C0059ao.a(15195));
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j) {
        require(j);
        return this.bufferField.readByteArray(j);
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j) {
        require(j);
        return this.bufferField.readByteString(j);
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j) {
        require(j);
        return this.bufferField.readUtf8(j);
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(15190));
        try {
            require(j);
            this.bufferField.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(this.bufferField);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString, long j) {
        yl0.e(byteString, C0059ao.a(15173));
        if (!(!this.closed)) {
            throw new IllegalStateException(C0059ao.a(15174).toString());
        }
        while (true) {
            long indexOf = this.bufferField.indexOf(byteString, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - byteString.size()) + 1);
        }
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr, int i, int i2) {
        yl0.e(bArr, C0059ao.a(15183));
        long j = i2;
        Util.checkOffsetAndCount(bArr.length, i, j);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
            return -1;
        }
        return this.bufferField.read(bArr, i, (int) Math.min(j, this.bufferField.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        yl0.e(byteBuffer, C0059ao.a(15181));
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
            return -1;
        }
        return this.bufferField.read(byteBuffer);
    }
}
