package okio;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;
import okio.internal.BufferKt;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer != null) {
                this.buffer = null;
                this.segment = null;
                this.offset = -1L;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return;
            }
            throw new IllegalStateException(C0059ao.a(3045).toString());
        }

        public final long expandBuffer(int i) {
            if (!(i > 0)) {
                throw new IllegalArgumentException((C0059ao.a(3049) + i).toString());
            }
            if (i <= 8192) {
                Buffer buffer = this.buffer;
                if (buffer != null) {
                    if (this.readWrite) {
                        long size = buffer.size();
                        Segment writableSegment$okio = buffer.writableSegment$okio(i);
                        int i2 = 8192 - writableSegment$okio.limit;
                        writableSegment$okio.limit = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        long j = i2;
                        buffer.setSize$okio(size + j);
                        this.segment = writableSegment$okio;
                        this.offset = size;
                        this.data = writableSegment$okio.data;
                        this.start = 8192 - i2;
                        this.end = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        return j;
                    }
                    throw new IllegalStateException(C0059ao.a(3046).toString());
                }
                throw new IllegalStateException(C0059ao.a(3047).toString());
            }
            throw new IllegalArgumentException((C0059ao.a(3048) + i).toString());
        }

        public final int next() {
            long j = this.offset;
            Buffer buffer = this.buffer;
            yl0.c(buffer);
            if (j != buffer.size()) {
                long j2 = this.offset;
                return seek(j2 == -1 ? 0L : j2 + (this.end - this.start));
            }
            throw new IllegalStateException(C0059ao.a(3050).toString());
        }

        public final long resizeBuffer(long j) {
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (this.readWrite) {
                    long size = buffer.size();
                    int i = (j > size ? 1 : (j == size ? 0 : -1));
                    int i2 = 1;
                    if (i <= 0) {
                        if (j >= 0) {
                            long j2 = size - j;
                            while (true) {
                                if (j2 <= 0) {
                                    break;
                                }
                                Segment segment = buffer.head;
                                yl0.c(segment);
                                Segment segment2 = segment.prev;
                                yl0.c(segment2);
                                int i3 = segment2.limit;
                                long j3 = i3 - segment2.pos;
                                if (j3 <= j2) {
                                    buffer.head = segment2.pop();
                                    SegmentPool.recycle(segment2);
                                    j2 -= j3;
                                } else {
                                    segment2.limit = i3 - ((int) j2);
                                    break;
                                }
                            }
                            this.segment = null;
                            this.offset = j;
                            this.data = null;
                            this.start = -1;
                            this.end = -1;
                        } else {
                            throw new IllegalArgumentException((C0059ao.a(3051) + j).toString());
                        }
                    } else if (i > 0) {
                        long j4 = j - size;
                        boolean z = true;
                        while (j4 > 0) {
                            Segment writableSegment$okio = buffer.writableSegment$okio(i2);
                            int min = (int) Math.min(j4, 8192 - writableSegment$okio.limit);
                            int i4 = writableSegment$okio.limit + min;
                            writableSegment$okio.limit = i4;
                            j4 -= min;
                            if (z) {
                                this.segment = writableSegment$okio;
                                this.offset = size;
                                this.data = writableSegment$okio.data;
                                this.start = i4 - min;
                                this.end = i4;
                                z = false;
                            }
                            i2 = 1;
                        }
                    }
                    buffer.setSize$okio(j);
                    return size;
                }
                throw new IllegalStateException(C0059ao.a(3052).toString());
            }
            throw new IllegalStateException(C0059ao.a(3053).toString());
        }

        public final int seek(long j) {
            Segment segment;
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (j >= -1 && j <= buffer.size()) {
                    if (j != -1 && j != buffer.size()) {
                        long j2 = 0;
                        long size = buffer.size();
                        Segment segment2 = buffer.head;
                        Segment segment3 = this.segment;
                        if (segment3 != null) {
                            long j3 = this.offset;
                            int i = this.start;
                            yl0.c(segment3);
                            long j4 = j3 - (i - segment3.pos);
                            if (j4 > j) {
                                segment = segment2;
                                segment2 = this.segment;
                                size = j4;
                            } else {
                                segment = this.segment;
                                j2 = j4;
                            }
                        } else {
                            segment = segment2;
                        }
                        if (size - j > j - j2) {
                            while (true) {
                                yl0.c(segment);
                                int i2 = segment.limit;
                                int i3 = segment.pos;
                                if (j < (i2 - i3) + j2) {
                                    break;
                                }
                                j2 += i2 - i3;
                                segment = segment.next;
                            }
                        } else {
                            while (size > j) {
                                yl0.c(segment2);
                                segment2 = segment2.prev;
                                yl0.c(segment2);
                                size -= segment2.limit - segment2.pos;
                            }
                            j2 = size;
                            segment = segment2;
                        }
                        if (this.readWrite) {
                            yl0.c(segment);
                            if (segment.shared) {
                                Segment unsharedCopy = segment.unsharedCopy();
                                if (buffer.head == segment) {
                                    buffer.head = unsharedCopy;
                                }
                                segment = segment.push(unsharedCopy);
                                Segment segment4 = segment.prev;
                                yl0.c(segment4);
                                segment4.pop();
                            }
                        }
                        this.segment = segment;
                        this.offset = j;
                        yl0.c(segment);
                        this.data = segment.data;
                        int i4 = segment.pos + ((int) (j - j2));
                        this.start = i4;
                        int i5 = segment.limit;
                        this.end = i5;
                        return i5 - i4;
                    }
                    this.segment = null;
                    this.offset = j;
                    this.data = null;
                    this.start = -1;
                    this.end = -1;
                    return -1;
                }
                mm0 mm0Var = mm0.a;
                String format = String.format(C0059ao.a(3054), Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(buffer.size())}, 2));
                yl0.d(format, C0059ao.a(3055));
                throw new ArrayIndexOutOfBoundsException(format);
            }
            throw new IllegalStateException(C0059ao.a(3056).toString());
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j2);
    }

    private final ByteString digest(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i = segment.pos;
            messageDigest.update(bArr, i, segment.limit - i);
            Segment segment2 = segment.next;
            yl0.c(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i2 = segment2.pos;
                messageDigest.update(bArr2, i2, segment2.limit - i2);
                segment2 = segment2.next;
                yl0.c(segment2);
            }
        }
        byte[] digest = messageDigest.digest();
        yl0.d(digest, C0059ao.a(13890));
        return new ByteString(digest);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i = segment.pos;
                mac.update(bArr, i, segment.limit - i);
                Segment segment2 = segment.next;
                yl0.c(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i2 = segment2.pos;
                    mac.update(bArr2, i2, segment2.limit - i2);
                    segment2 = segment2.next;
                    yl0.c(segment2);
                }
            }
            byte[] doFinal = mac.doFinal();
            yl0.d(doFinal, C0059ao.a(13891));
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m377deprecated_getByte(long j) {
        return getByte(j);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final long m378deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        skip(size());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        yl0.c(segment);
        Segment segment2 = segment.prev;
        yl0.c(segment2);
        int i = segment2.limit;
        if (i < 8192 && segment2.owner) {
            size -= i - segment2.pos;
        }
        return size;
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            yl0.c(segment);
            Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = sharedCopy.prev;
                yl0.c(segment3);
                yl0.c(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    public final Buffer copyTo(OutputStream outputStream, long j) throws IOException {
        return copyTo$default(this, outputStream, j, 0L, 4, (Object) null);
    }

    public final Buffer copyTo(OutputStream outputStream, long j, long j2) throws IOException {
        int i;
        yl0.e(outputStream, C0059ao.a(13892));
        Util.checkOffsetAndCount(this.size, j, j2);
        if (j2 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            yl0.c(segment);
            int i2 = segment.limit;
            int i3 = segment.pos;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            segment = segment.next;
        }
        while (j2 > 0) {
            yl0.c(segment);
            int min = (int) Math.min(segment.limit - i, j2);
            outputStream.write(segment.data, (int) (segment.pos + j), min);
            j2 -= min;
            segment = segment.next;
            j = 0;
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Buffer)) {
                return false;
            }
            Buffer buffer = (Buffer) obj;
            if (size() != buffer.size()) {
                return false;
            }
            if (size() != 0) {
                Segment segment = this.head;
                yl0.c(segment);
                Segment segment2 = buffer.head;
                yl0.c(segment2);
                int i = segment.pos;
                int i2 = segment2.pos;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(segment.limit - i, segment2.limit - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (segment.data[i] != segment2.data[i2]) {
                            return false;
                        }
                        j2++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == segment.limit) {
                        segment = segment.next;
                        yl0.c(segment);
                        i = segment.pos;
                    }
                    if (i2 == segment2.limit) {
                        segment2 = segment2.next;
                        yl0.c(segment2);
                        i2 = segment2.pos;
                    }
                    j += min;
                }
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j) {
        Util.checkOffsetAndCount(size(), j, 1L);
        Segment segment = this.head;
        if (segment != null) {
            if (size() - j < j) {
                long size = size();
                while (size > j) {
                    segment = segment.prev;
                    yl0.c(segment);
                    size -= segment.limit - segment.pos;
                }
                yl0.c(segment);
                return segment.data[(int) ((segment.pos + j) - size)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (segment.limit - segment.pos) + j2;
                if (j3 > j) {
                    yl0.c(segment);
                    return segment.data[(int) ((segment.pos + j) - j2)];
                }
                segment = segment.next;
                yl0.c(segment);
                j2 = j3;
            }
        } else {
            Segment segment2 = null;
            yl0.c(null);
            return segment2.data[(int) ((segment2.pos + j) - (-1))];
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment != null) {
            int i = 1;
            do {
                int i2 = segment.limit;
                for (int i3 = segment.pos; i3 < i2; i3++) {
                    i = (i * 31) + segment.data[i3];
                }
                segment = segment.next;
                yl0.c(segment);
            } while (segment != this.head);
            return i;
        }
        return 0;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(13895));
        return hmac(C0059ao.a(13896), byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(13897));
        return hmac(C0059ao.a(13898), byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(13899));
        return hmac(C0059ao.a(13900), byteString);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, RecyclerView.FOREVER_NS);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(13908));
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + C0059ao.a(5140);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                yl0.e(bArr, C0059ao.a(5139));
                return Buffer.this.read(bArr, i, i2);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest(C0059ao.a(13911));
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + C0059ao.a(10918);
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                Buffer.this.writeByte(i);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                yl0.e(bArr, C0059ao.a(10919));
                Buffer.this.write(bArr, i, i2);
            }
        };
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString) {
        yl0.e(byteString, C0059ao.a(13912));
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        yl0.e(byteBuffer, C0059ao.a(13914));
        Segment segment = this.head;
        if (segment != null) {
            int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
            byteBuffer.put(segment.data, segment.pos, min);
            int i = segment.pos + min;
            segment.pos = i;
            this.size -= min;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            return min;
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        yl0.e(sink, C0059ao.a(13919));
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        yl0.e(unsafeCursor, C0059ao.a(13920));
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException(C0059ao.a(13921).toString());
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() != 0) {
            Segment segment = this.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = i + 1;
            byte b = segment.data[i];
            setSize$okio(size() - 1);
            if (i3 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[EDGE_INSN: B:48:0x00cb->B:41:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        yl0.e(inputStream, C0059ao.a(13926));
        readFrom(inputStream, RecyclerView.FOREVER_NS, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer buffer, long j) throws EOFException {
        yl0.e(buffer, C0059ao.a(13929));
        if (size() >= j) {
            buffer.write(this, j);
        } else {
            buffer.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[EDGE_INSN: B:43:0x00b8->B:37:0x00b8 ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc2
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            defpackage.yl0.c(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto La4
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L80
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L80
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 13931(0x366b, float:1.9521E-41)
            java.lang.String r3 = myunmn.C0059ao.a(r3)
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L80:
            if (r0 == 0) goto L84
            r1 = 1
            goto La4
        L84:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 13932(0x366c, float:1.9523E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r2)
            r1.append(r2)
            java.lang.String r2 = okio.Util.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La4:
            if (r8 != r9) goto Lb0
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto Lb2
        Lb0:
            r6.pos = r8
        Lb2:
            if (r1 != 0) goto Lb8
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        Lb8:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lc2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() >= 4) {
            Segment segment = this.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            setSize$okio(size() - 4);
            if (i8 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return Util.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() >= 8) {
            Segment segment = this.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            setSize$okio(size() - 8);
            if (i10 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return Util.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() >= 2) {
            Segment segment = this.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            setSize$okio(size() - 2);
            if (i4 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return Util.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        yl0.e(charset, C0059ao.a(13936));
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        yl0.e(unsafeCursor, C0059ao.a(13937));
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException(C0059ao.a(13938).toString());
    }

    @Override // okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, qn0.b);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i2;
        int i3;
        if (size() != 0) {
            byte b = getByte(0L);
            if ((b & 128) == 0) {
                i = b & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((b & 224) == 192) {
                i = b & 31;
                i2 = 2;
                i3 = 128;
            } else if ((b & 240) == 224) {
                i = b & 15;
                i2 = 3;
                i3 = Barcode.PDF417;
            } else if ((b & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i = b & 7;
                i2 = 4;
                i3 = LogFileManager.MAX_LOG_SIZE;
            }
            long j = i2;
            if (size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte b2 = getByte(j2);
                    if ((b2 & 192) != 128) {
                        skip(j2);
                        return 65533;
                    }
                    i = (i << 6) | (b2 & 63);
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((55296 <= i && 57343 >= i) || i < i3) {
                    return 65533;
                }
                return i;
            }
            throw new EOFException(C0059ao.a(13939) + i2 + C0059ao.a(13940) + size() + C0059ao.a(13941) + Util.toHexString(b) + ')');
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return BufferKt.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(RecyclerView.FOREVER_NS);
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        return this.size >= j;
    }

    @Override // okio.BufferedSource
    public void require(long j) throws EOFException {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) {
        yl0.e(options, C0059ao.a(13945));
        int selectPrefix$default = BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    public final ByteString sha1() {
        return digest(C0059ao.a(13946));
    }

    public final ByteString sha256() {
        return digest(C0059ao.a(13947));
    }

    public final ByteString sha512() {
        return digest(C0059ao.a(13948));
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.head;
            if (segment != null) {
                int min = (int) Math.min(j, segment.limit - segment.pos);
                long j2 = min;
                setSize$okio(size() - j2);
                j -= j2;
                int i = segment.pos + min;
                segment.pos = i;
                if (i == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            return snapshot((int) size());
        }
        throw new IllegalStateException((C0059ao.a(13949) + size()).toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            Segment segment = this.head;
            if (segment == null) {
                Segment take = SegmentPool.take();
                this.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            yl0.c(segment);
            Segment segment2 = segment.prev;
            yl0.c(segment2);
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        throw new IllegalArgumentException(C0059ao.a(13951).toString());
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        yl0.e(source, C0059ao.a(13960));
        long j = 0;
        while (true) {
            long read = source.read(this, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    public final Buffer writeTo(OutputStream outputStream, long j) throws IOException {
        yl0.e(outputStream, C0059ao.a(13974));
        Util.checkOffsetAndCount(this.size, 0L, j);
        Segment segment = this.head;
        while (j > 0) {
            yl0.c(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            outputStream.write(segment.data, segment.pos, min);
            int i = segment.pos + min;
            segment.pos = i;
            long j2 = min;
            this.size -= j2;
            j -= j2;
            if (i == segment.limit) {
                Segment pop = segment.pop();
                this.head = pop;
                SegmentPool.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    public Buffer clone() {
        return copy();
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j) {
        return indexOf(b, j, RecyclerView.FOREVER_NS);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j) {
        int i;
        int i2;
        yl0.e(byteString, C0059ao.a(13909));
        long j2 = 0;
        if (j >= 0) {
            Segment segment = this.head;
            if (segment != null) {
                if (size() - j < j) {
                    j2 = size();
                    while (j2 > j) {
                        segment = segment.prev;
                        yl0.c(segment);
                        j2 -= segment.limit - segment.pos;
                    }
                    if (segment != null) {
                        if (byteString.size() == 2) {
                            byte b = byteString.getByte(0);
                            byte b2 = byteString.getByte(1);
                            while (j2 < size()) {
                                byte[] bArr = segment.data;
                                i = (int) ((segment.pos + j) - j2);
                                int i3 = segment.limit;
                                while (i < i3) {
                                    byte b3 = bArr[i];
                                    if (b3 != b && b3 != b2) {
                                        i++;
                                    }
                                    i2 = segment.pos;
                                }
                                j2 += segment.limit - segment.pos;
                                segment = segment.next;
                                yl0.c(segment);
                                j = j2;
                            }
                            return -1L;
                        }
                        byte[] internalArray$okio = byteString.internalArray$okio();
                        while (j2 < size()) {
                            byte[] bArr2 = segment.data;
                            i = (int) ((segment.pos + j) - j2);
                            int i4 = segment.limit;
                            while (i < i4) {
                                byte b4 = bArr2[i];
                                for (byte b5 : internalArray$okio) {
                                    if (b4 == b5) {
                                        i2 = segment.pos;
                                    }
                                }
                                i++;
                            }
                            j2 += segment.limit - segment.pos;
                            segment = segment.next;
                            yl0.c(segment);
                            j = j2;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                while (true) {
                    long j3 = (segment.limit - segment.pos) + j2;
                    if (j3 > j) {
                        break;
                    }
                    segment = segment.next;
                    yl0.c(segment);
                    j2 = j3;
                }
                if (segment != null) {
                    if (byteString.size() == 2) {
                        byte b6 = byteString.getByte(0);
                        byte b7 = byteString.getByte(1);
                        while (j2 < size()) {
                            byte[] bArr3 = segment.data;
                            i = (int) ((segment.pos + j) - j2);
                            int i5 = segment.limit;
                            while (i < i5) {
                                byte b8 = bArr3[i];
                                if (b8 != b6 && b8 != b7) {
                                    i++;
                                }
                                i2 = segment.pos;
                            }
                            j2 += segment.limit - segment.pos;
                            segment = segment.next;
                            yl0.c(segment);
                            j = j2;
                        }
                        return -1L;
                    }
                    byte[] internalArray$okio2 = byteString.internalArray$okio();
                    while (j2 < size()) {
                        byte[] bArr4 = segment.data;
                        i = (int) ((segment.pos + j) - j2);
                        int i6 = segment.limit;
                        while (i < i6) {
                            byte b9 = bArr4[i];
                            for (byte b10 : internalArray$okio2) {
                                if (b9 == b10) {
                                    i2 = segment.pos;
                                }
                            }
                            i++;
                        }
                        j2 += segment.limit - segment.pos;
                        segment = segment.next;
                        yl0.c(segment);
                        j = j2;
                    }
                    return -1L;
                }
                return -1L;
                return (i - i2) + j2;
            }
            return -1L;
        }
        throw new IllegalArgumentException((C0059ao.a(13910) + j).toString());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        yl0.e(byteString, C0059ao.a(13913));
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (getByte(i3 + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j) throws EOFException {
        if (j >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (size() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException((C0059ao.a(13922) + j).toString());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j) throws EOFException {
        if (j >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (size() >= j) {
                if (j >= ((long) Barcode.AZTEC)) {
                    ByteString snapshot = snapshot((int) j);
                    skip(j);
                    return snapshot;
                }
                return new ByteString(readByteArray(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException((C0059ao.a(13923) + j).toString());
    }

    public final Buffer readFrom(InputStream inputStream, long j) throws IOException {
        yl0.e(inputStream, C0059ao.a(13927));
        if (j >= 0) {
            readFrom(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException((C0059ao.a(13928) + j).toString());
    }

    @Override // okio.BufferedSource
    public String readString(long j, Charset charset) throws EOFException {
        yl0.e(charset, C0059ao.a(13933));
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (this.size >= j) {
                if (i == 0) {
                    return C0059ao.a(13934);
                }
                Segment segment = this.head;
                yl0.c(segment);
                int i2 = segment.pos;
                if (i2 + j > segment.limit) {
                    return new String(readByteArray(j), charset);
                }
                int i3 = (int) j;
                String str = new String(segment.data, i2, i3, charset);
                int i4 = segment.pos + i3;
                segment.pos = i4;
                this.size -= j;
                if (i4 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException((C0059ao.a(13935) + j).toString());
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j) throws EOFException {
        return readString(j, qn0.b);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j) throws EOFException {
        if (j >= 0) {
            long j2 = RecyclerView.FOREVER_NS;
            if (j != RecyclerView.FOREVER_NS) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(this, indexOf);
            }
            if (j2 < size() && getByte(j2 - 1) == ((byte) 13) && getByte(j2) == b) {
                return BufferKt.readUtf8Line(this, j2);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0L, Math.min(32, size()));
            throw new EOFException(C0059ao.a(13942) + Math.min(size(), j) + C0059ao.a(13943) + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException((C0059ao.a(13944) + j).toString());
    }

    @Override // okio.BufferedSink
    public Buffer writeByte(int i) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeDecimalLong(long j) {
        int i;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i3 = 1;
        if (i2 < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8(C0059ao.a(13961));
            }
            z = true;
        }
        if (j < 100000000) {
            if (j >= 10000) {
                i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i3 = 2;
            }
            i3 = i;
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i3 = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
                i3 = i;
            }
        } else if (j >= 1000000000000000L) {
            i3 = j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j < 10000000000000L) {
            i3 = 13;
        } else {
            i = j < 100000000000000L ? 14 : 15;
            i3 = i;
        }
        if (z) {
            i3++;
        }
        Segment writableSegment$okio = writableSegment$okio(i3);
        byte[] bArr = writableSegment$okio.data;
        int i4 = writableSegment$okio.limit + i3;
        while (j != 0) {
            long j2 = 10;
            i4--;
            bArr[i4] = BufferKt.getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i4 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i3;
        setSize$okio(size() + i3);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        setSize$okio(size() + i);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeInt(int i) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment$okio.limit = i5 + 1;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeIntLe(int i) {
        return writeInt(Util.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    public Buffer writeLong(long j) {
        Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        writableSegment$okio.limit = i8 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeLongLe(long j) {
        return writeLong(Util.reverseBytes(j));
    }

    @Override // okio.BufferedSink
    public Buffer writeShort(int i) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        writableSegment$okio.limit = i3 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeShortLe(int i) {
        return writeShort((int) Util.reverseBytes((short) i));
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            Segment writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | Barcode.ITF);
            writableSegment$okio.limit = i2 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i && 57343 >= i) {
            writeByte(63);
        } else if (i < 65536) {
            Segment writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | Barcode.ITF);
            bArr2[i3 + 2] = (byte) ((i & 63) | Barcode.ITF);
            writableSegment$okio2.limit = i3 + 3;
            setSize$okio(size() + 3);
        } else if (i <= 1114111) {
            Segment writableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i4 = writableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | Barcode.ITF);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | Barcode.ITF);
            bArr3[i4 + 3] = (byte) ((i & 63) | Barcode.ITF);
            writableSegment$okio3.limit = i4 + 4;
            setSize$okio(size() + 4);
        } else {
            throw new IllegalArgumentException(C0059ao.a(13982) + Util.toHexString(i));
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        yl0.e(byteString, C0059ao.a(13904));
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        yl0.e(str, C0059ao.a(13972));
        yl0.e(charset, C0059ao.a(13973));
        return writeString(str, 0, str.length(), charset);
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String str) {
        yl0.e(str, C0059ao.a(13975));
        return writeUtf8(str, 0, str.length());
    }

    private final void readFrom(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            Segment writableSegment$okio = writableSegment$okio(1);
            int read = inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    this.head = writableSegment$okio.pop();
                    SegmentPool.recycle(writableSegment$okio);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            writableSegment$okio.limit += read;
            long j2 = read;
            this.size += j2;
            j -= j2;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j, long j2) {
        Segment segment;
        int i;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (segment = this.head) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    segment = segment.prev;
                    yl0.c(segment);
                    j3 -= segment.limit - segment.pos;
                }
                if (segment != null) {
                    while (j3 < j2) {
                        byte[] bArr = segment.data;
                        int min = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
                        i = (int) ((segment.pos + j) - j3);
                        while (i < min) {
                            if (bArr[i] != b) {
                                i++;
                            }
                        }
                        j3 += segment.limit - segment.pos;
                        segment = segment.next;
                        yl0.c(segment);
                        j = j3;
                    }
                    return -1L;
                }
                return -1L;
            }
            while (true) {
                long j4 = (segment.limit - segment.pos) + j3;
                if (j4 > j) {
                    break;
                }
                segment = segment.next;
                yl0.c(segment);
                j3 = j4;
            }
            if (segment != null) {
                while (j3 < j2) {
                    byte[] bArr2 = segment.data;
                    int min2 = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
                    i = (int) ((segment.pos + j) - j3);
                    while (i < min2) {
                        if (bArr2[i] != b) {
                            i++;
                        }
                    }
                    j3 += segment.limit - segment.pos;
                    segment = segment.next;
                    yl0.c(segment);
                    j = j3;
                }
                return -1L;
            }
            return -1L;
            return (i - segment.pos) + j3;
        }
        throw new IllegalArgumentException((C0059ao.a(13901) + size() + C0059ao.a(13902) + j + C0059ao.a(13903) + j2).toString());
    }

    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(size(), 0L, i);
        Segment segment = this.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            yl0.c(segment);
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                segment = segment.next;
            } else {
                throw new AssertionError(C0059ao.a(13950));
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.head;
        int i7 = 0;
        while (i2 < i) {
            yl0.c(segment2);
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String str, int i, int i2, Charset charset) {
        yl0.e(str, C0059ao.a(13962));
        yl0.e(charset, C0059ao.a(13963));
        if (!(i >= 0)) {
            throw new IllegalArgumentException((C0059ao.a(13971) + i).toString());
        }
        if (i2 >= i) {
            if (i2 <= str.length()) {
                if (yl0.a(charset, qn0.b)) {
                    return writeUtf8(str, i, i2);
                }
                String substring = str.substring(i, i2);
                yl0.d(substring, C0059ao.a(13964));
                Objects.requireNonNull(substring, C0059ao.a(13965));
                byte[] bytes = substring.getBytes(charset);
                yl0.d(bytes, C0059ao.a(13966));
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException((C0059ao.a(13967) + i2 + C0059ao.a(13968) + str.length()).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(13969) + i2 + C0059ao.a(13970) + i).toString());
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String str, int i, int i2) {
        yl0.e(str, C0059ao.a(13976));
        if (!(i >= 0)) {
            throw new IllegalArgumentException((C0059ao.a(13981) + i).toString());
        }
        if (i2 >= i) {
            if (!(i2 <= str.length())) {
                throw new IllegalArgumentException((C0059ao.a(13977) + i2 + C0059ao.a(13978) + str.length()).toString());
            }
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    Segment writableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = writableSegment$okio.data;
                    int i3 = writableSegment$okio.limit - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = writableSegment$okio.limit;
                    int i6 = (i3 + i4) - i5;
                    writableSegment$okio.limit = i5 + i6;
                    setSize$okio(size() + i6);
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        Segment writableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = writableSegment$okio2.data;
                        int i7 = writableSegment$okio2.limit;
                        bArr2[i7] = (byte) ((charAt >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt & '?') | Barcode.ITF);
                        writableSegment$okio2.limit = i7 + 2;
                        setSize$okio(size() + 2);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                        if (charAt <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                            int i9 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + LogFileManager.MAX_LOG_SIZE;
                            Segment writableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = writableSegment$okio3.data;
                            int i10 = writableSegment$okio3.limit;
                            bArr3[i10] = (byte) ((i9 >> 18) | 240);
                            bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | Barcode.ITF);
                            bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | Barcode.ITF);
                            bArr3[i10 + 3] = (byte) ((i9 & 63) | Barcode.ITF);
                            writableSegment$okio3.limit = i10 + 4;
                            setSize$okio(size() + 4);
                            i += 2;
                        } else {
                            writeByte(63);
                            i = i8;
                        }
                    } else {
                        Segment writableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i11 = writableSegment$okio4.limit;
                        bArr4[i11] = (byte) ((charAt >> '\f') | 224);
                        bArr4[i11 + 1] = (byte) ((63 & (charAt >> 6)) | Barcode.ITF);
                        bArr4[i11 + 2] = (byte) ((charAt & '?') | Barcode.ITF);
                        writableSegment$okio4.limit = i11 + 3;
                        setSize$okio(size() + 3);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException((C0059ao.a(13979) + i2 + C0059ao.a(13980) + i).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        yl0.e(bArr, C0059ao.a(13930));
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        yl0.e(byteBuffer, C0059ao.a(13952));
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i, 8192 - writableSegment$okio.limit);
            byteBuffer.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(13915));
        return read(bArr, 0, bArr.length);
    }

    public final Buffer copyTo(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(13893));
        return copyTo(buffer, j, this.size - j);
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr, int i, int i2) {
        yl0.e(bArr, C0059ao.a(13916));
        Util.checkOffsetAndCount(bArr.length, i, i2);
        Segment segment = this.head;
        if (segment != null) {
            int min = Math.min(i2, segment.limit - segment.pos);
            byte[] bArr2 = segment.data;
            int i3 = segment.pos;
            wi0.c(bArr2, bArr, i, i3, i3 + min);
            segment.pos += min;
            setSize$okio(size() - min);
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
                return min;
            }
            return min;
        }
        return -1;
    }

    public final Buffer copyTo(Buffer buffer, long j, long j2) {
        yl0.e(buffer, C0059ao.a(13894));
        Util.checkOffsetAndCount(size(), j, j2);
        if (j2 != 0) {
            buffer.setSize$okio(buffer.size() + j2);
            Segment segment = this.head;
            while (true) {
                yl0.c(segment);
                int i = segment.limit;
                int i2 = segment.pos;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                segment = segment.next;
            }
            while (j2 > 0) {
                yl0.c(segment);
                Segment sharedCopy = segment.sharedCopy();
                int i3 = sharedCopy.pos + ((int) j);
                sharedCopy.pos = i3;
                sharedCopy.limit = Math.min(i3 + ((int) j2), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    yl0.c(segment2);
                    Segment segment3 = segment2.prev;
                    yl0.c(segment3);
                    segment3.push(sharedCopy);
                }
                j2 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(13953));
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString, int i, int i2) {
        yl0.e(byteString, C0059ao.a(13954));
        byteString.write$okio(this, i, i2);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(13956));
        return write(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] bArr, int i, int i2) {
        yl0.e(bArr, C0059ao.a(13957));
        long j = i2;
        Util.checkOffsetAndCount(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            wi0.c(bArr, writableSegment$okio.data, writableSegment$okio.limit, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        setSize$okio(size() + j);
        return this;
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(13917));
        if (j >= 0) {
            if (size() == 0) {
                return -1L;
            }
            if (j > size()) {
                j = size();
            }
            buffer.write(this, j);
            return j;
        }
        throw new IllegalArgumentException((C0059ao.a(13918) + j).toString());
    }

    @Override // okio.BufferedSink
    public Buffer write(Source source, long j) throws IOException {
        yl0.e(source, C0059ao.a(13955));
        while (j > 0) {
            long read = source.read(this, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString, long j) throws IOException {
        long j2 = j;
        yl0.e(byteString, C0059ao.a(13905));
        if (byteString.size() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                Segment segment = this.head;
                if (segment != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            segment = segment.prev;
                            yl0.c(segment);
                            size -= segment.limit - segment.pos;
                        }
                        if (segment != null) {
                            byte[] internalArray$okio = byteString.internalArray$okio();
                            byte b = internalArray$okio[0];
                            int size2 = byteString.size();
                            long size3 = (size() - size2) + 1;
                            while (size < size3) {
                                byte[] bArr = segment.data;
                                long j4 = size;
                                int min = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                                for (int i = (int) ((segment.pos + j2) - j4); i < min; i++) {
                                    if (bArr[i] == b && BufferKt.rangeEquals(segment, i + 1, internalArray$okio, 1, size2)) {
                                        return (i - segment.pos) + j4;
                                    }
                                }
                                size = j4 + (segment.limit - segment.pos);
                                segment = segment.next;
                                yl0.c(segment);
                                j2 = size;
                            }
                        }
                    } else {
                        while (true) {
                            long j5 = (segment.limit - segment.pos) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            segment = segment.next;
                            yl0.c(segment);
                            j3 = j5;
                        }
                        if (segment != null) {
                            byte[] internalArray$okio2 = byteString.internalArray$okio();
                            byte b2 = internalArray$okio2[0];
                            int size4 = byteString.size();
                            long size5 = (size() - size4) + 1;
                            while (j3 < size5) {
                                byte[] bArr2 = segment.data;
                                long j6 = size5;
                                int min2 = (int) Math.min(segment.limit, (segment.pos + size5) - j3);
                                for (int i2 = (int) ((segment.pos + j2) - j3); i2 < min2; i2++) {
                                    if (bArr2[i2] == b2 && BufferKt.rangeEquals(segment, i2 + 1, internalArray$okio2, 1, size4)) {
                                        return (i2 - segment.pos) + j3;
                                    }
                                }
                                j3 += segment.limit - segment.pos;
                                segment = segment.next;
                                yl0.c(segment);
                                j2 = j3;
                                size5 = j6;
                            }
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException((C0059ao.a(13906) + j2).toString());
        }
        throw new IllegalArgumentException(C0059ao.a(13907).toString());
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) {
        Segment segment;
        Segment segment2;
        yl0.e(buffer, C0059ao.a(13958));
        if (buffer != this) {
            Util.checkOffsetAndCount(buffer.size(), 0L, j);
            while (j > 0) {
                Segment segment3 = buffer.head;
                yl0.c(segment3);
                int i = segment3.limit;
                yl0.c(buffer.head);
                if (j < i - segment.pos) {
                    Segment segment4 = this.head;
                    if (segment4 != null) {
                        yl0.c(segment4);
                        segment2 = segment4.prev;
                    } else {
                        segment2 = null;
                    }
                    if (segment2 != null && segment2.owner) {
                        if ((segment2.limit + j) - (segment2.shared ? 0 : segment2.pos) <= ((long) UserMetadata.MAX_INTERNAL_KEY_SIZE)) {
                            Segment segment5 = buffer.head;
                            yl0.c(segment5);
                            segment5.writeTo(segment2, (int) j);
                            buffer.setSize$okio(buffer.size() - j);
                            setSize$okio(size() + j);
                            return;
                        }
                    }
                    Segment segment6 = buffer.head;
                    yl0.c(segment6);
                    buffer.head = segment6.split((int) j);
                }
                Segment segment7 = buffer.head;
                yl0.c(segment7);
                long j2 = segment7.limit - segment7.pos;
                buffer.head = segment7.pop();
                Segment segment8 = this.head;
                if (segment8 == null) {
                    this.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    yl0.c(segment8);
                    Segment segment9 = segment8.prev;
                    yl0.c(segment9);
                    segment9.push(segment7).compact();
                }
                buffer.setSize$okio(buffer.size() - j2);
                setSize$okio(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(13959).toString());
    }
}
