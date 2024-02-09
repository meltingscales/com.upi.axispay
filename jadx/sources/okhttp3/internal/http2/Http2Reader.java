package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final BufferedSource source;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(C0059ao.a(3611) + i3 + C0059ao.a(3612) + i);
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(BufferedSource bufferedSource) {
            yl0.e(bufferedSource, C0059ao.a(14757));
            this.source = bufferedSource;
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt != i) {
                    throw new IOException(C0059ao.a(14758));
                }
                return;
            }
            throw new IOException(and + C0059ao.a(14759));
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            yl0.e(buffer, C0059ao.a(14760));
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(buffer, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j);

        void data(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        yl0.d(logger2, C0059ao.a(4592));
        logger = logger2;
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z) {
        yl0.e(bufferedSource, C0059ao.a(4593));
        this.source = bufferedSource;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, Barcode.AZTEC, 0, 4, null);
    }

    private final void readData(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException(C0059ao.a(4595));
        }
        boolean z = (i2 & 1) != 0;
        if (!((i2 & 32) != 0)) {
            int and = (i2 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
            handler.data(z, i3, this.source, Companion.lengthWithoutPadding(i, i2, and));
            this.source.skip(and);
            return;
        }
        throw new IOException(C0059ao.a(4594));
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException(C0059ao.a(4598) + i);
        } else if (i3 == 0) {
            int readInt = this.source.readInt();
            int readInt2 = this.source.readInt();
            int i4 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
            if (fromHttp2 != null) {
                ByteString byteString = ByteString.EMPTY;
                if (i4 > 0) {
                    byteString = this.source.readByteString(i4);
                }
                handler.goAway(readInt, fromHttp2, byteString);
                return;
            }
            throw new IOException(C0059ao.a(4596) + readInt2);
        } else {
            throw new IOException(C0059ao.a(4597));
        }
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) throws IOException {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i2);
        this.continuation.setFlags(i3);
        this.continuation.setStreamId(i4);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            boolean z = (i2 & 1) != 0;
            int and = (i2 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
            if ((i2 & 32) != 0) {
                readPriority(handler, i3);
                i -= 5;
            }
            handler.headers(z, i3, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i2, and), and, i2, i3));
            return;
        }
        throw new IOException(C0059ao.a(4599));
    }

    private final void readPing(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(C0059ao.a(4601) + i);
        } else if (i3 == 0) {
            handler.ping((i2 & 1) != 0, this.source.readInt(), this.source.readInt());
        } else {
            throw new IOException(C0059ao.a(4600));
        }
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 5) {
            if (i3 != 0) {
                readPriority(handler, i3);
                return;
            }
            throw new IOException(C0059ao.a(4602));
        }
        throw new IOException(C0059ao.a(4603) + i + C0059ao.a(4604));
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int and = (i2 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
            handler.pushPromise(i3, this.source.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, and), and, i2, i3));
            return;
        }
        throw new IOException(C0059ao.a(4605));
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException(C0059ao.a(4608) + i + C0059ao.a(4609));
        } else if (i3 != 0) {
            int readInt = this.source.readInt();
            ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
            if (fromHttp2 != null) {
                handler.rstStream(i3, fromHttp2);
                return;
            }
            throw new IOException(C0059ao.a(4606) + readInt);
        } else {
            throw new IOException(C0059ao.a(4607));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        throw new java.io.IOException(myunmn.C0059ao.a(4611) + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r8, int r9, int r10, int r11) throws java.io.IOException {
        /*
            r7 = this;
            if (r11 != 0) goto Ld1
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L19
            if (r9 != 0) goto Lc
            r8.ackSettings()
            return
        Lc:
            java.io.IOException r8 = new java.io.IOException
            r9 = 4610(0x1202, float:6.46E-42)
            java.lang.String r9 = myunmn.C0059ao.a(r9)
            r8.<init>(r9)
            throw r8
        L19:
            int r10 = r9 % 6
            if (r10 != 0) goto Lb5
            okhttp3.internal.http2.Settings r10 = new okhttp3.internal.http2.Settings
            r10.<init>()
            r0 = 0
            rm0 r9 = defpackage.tm0.h(r0, r9)
            r1 = 6
            pm0 r9 = defpackage.tm0.g(r9, r1)
            int r1 = r9.a()
            int r2 = r9.b()
            int r9 = r9.c()
            if (r9 < 0) goto L3d
            if (r1 > r2) goto Lb1
            goto L3f
        L3d:
            if (r1 < r2) goto Lb1
        L3f:
            okio.BufferedSource r3 = r7.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal.Util.and(r3, r4)
            okio.BufferedSource r4 = r7.source
            int r4 = r4.readInt()
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L98
            r5 = 3
            if (r3 == r5) goto L96
            if (r3 == r6) goto L85
            r5 = 5
            if (r3 == r5) goto L5f
            goto Laa
        L5f:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L69
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L69
            goto Laa
        L69:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 4611(0x1203, float:6.461E-42)
            java.lang.String r10 = myunmn.C0059ao.a(r10)
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L85:
            r3 = 7
            if (r4 < 0) goto L89
            goto Laa
        L89:
            java.io.IOException r8 = new java.io.IOException
            r9 = 4612(0x1204, float:6.463E-42)
            java.lang.String r9 = myunmn.C0059ao.a(r9)
            r8.<init>(r9)
            throw r8
        L96:
            r3 = r6
            goto Laa
        L98:
            if (r4 == 0) goto Laa
            if (r4 != r11) goto L9d
            goto Laa
        L9d:
            java.io.IOException r8 = new java.io.IOException
            r9 = 4613(0x1205, float:6.464E-42)
            java.lang.String r9 = myunmn.C0059ao.a(r9)
            r8.<init>(r9)
            throw r8
        Laa:
            r10.set(r3, r4)
            if (r1 == r2) goto Lb1
            int r1 = r1 + r9
            goto L3f
        Lb1:
            r8.settings(r0, r10)
            return
        Lb5:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 4614(0x1206, float:6.466E-42)
            java.lang.String r11 = myunmn.C0059ao.a(r11)
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        Ld1:
            java.io.IOException r8 = new java.io.IOException
            r9 = 4615(0x1207, float:6.467E-42)
            java.lang.String r9 = myunmn.C0059ao.a(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.readSettings(okhttp3.internal.http2.Http2Reader$Handler, int, int, int):void");
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            long and = Util.and(this.source.readInt(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(i3, and);
                return;
            }
            throw new IOException(C0059ao.a(4616));
        }
        throw new IOException(C0059ao.a(4617) + i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
        yl0.e(handler, C0059ao.a(4618));
        try {
            this.source.require(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.readByte(), 255);
                int and2 = Util.and(this.source.readByte(), 255);
                int readInt = this.source.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
                if (z && and != 4) {
                    throw new IOException(C0059ao.a(4619) + Http2.INSTANCE.formattedType$okhttp(and));
                }
                switch (and) {
                    case 0:
                        readData(handler, readMedium, and2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, and2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, and2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, and2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, and2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, and2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, and2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, and2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, and2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw new IOException(C0059ao.a(4620) + readMedium);
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        yl0.e(handler, C0059ao.a(4621));
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException(C0059ao.a(4622));
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString readByteString = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format(C0059ao.a(4623) + readByteString.hex(), new Object[0]));
        }
        if (!yl0.a(byteString, readByteString)) {
            throw new IOException(C0059ao.a(4624) + readByteString.utf8());
        }
    }

    private final void readPriority(Handler handler, int i) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i, readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER, Util.and(this.source.readByte(), 255) + 1, (((int) 2147483648L) & readInt) != 0);
    }
}
