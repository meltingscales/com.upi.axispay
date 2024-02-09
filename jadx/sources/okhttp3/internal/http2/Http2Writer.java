package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    public Http2Writer(BufferedSink bufferedSink, boolean z) {
        yl0.e(bufferedSink, C0059ao.a(1968));
        this.sink = bufferedSink;
        this.client = z;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min(this.maxFrameSize, j);
            j -= min;
            frameHeader(i, (int) min, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        yl0.e(settings, C0059ao.a(1969));
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException(C0059ao.a(1970));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (!this.closed) {
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(C0059ao.a(1971) + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
                }
                this.sink.write(Http2.CONNECTION_PREFACE);
                this.sink.flush();
                return;
            }
            return;
        }
        throw new IOException(C0059ao.a(1972));
    }

    public final synchronized void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (!this.closed) {
            dataFrame(i, z ? 1 : 0, buffer, i2);
        } else {
            throw new IOException(C0059ao.a(1973));
        }
    }

    public final void dataFrame(int i, int i2, Buffer buffer, int i3) throws IOException {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            BufferedSink bufferedSink = this.sink;
            yl0.c(buffer);
            bufferedSink.write(buffer, i3);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException(C0059ao.a(1974));
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.maxFrameSize)) {
            throw new IllegalArgumentException((C0059ao.a(1976) + this.maxFrameSize + C0059ao.a(1977) + i2).toString());
        }
        if ((((int) 2147483648L) & i) == 0) {
            Util.writeMedium(this.sink, i2);
            this.sink.writeByte(i3 & 255);
            this.sink.writeByte(i4 & 255);
            this.sink.writeInt(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(1975) + i).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        yl0.e(errorCode, C0059ao.a(1978));
        yl0.e(bArr, C0059ao.a(1979));
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(0, bArr.length + 8, 7, 0);
                this.sink.writeInt(i);
                this.sink.writeInt(errorCode.getHttpCode());
                if (!(bArr.length == 0)) {
                    this.sink.write(bArr);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(C0059ao.a(1980).toString());
            }
        } else {
            throw new IOException(C0059ao.a(1981));
        }
    }

    public final synchronized void headers(boolean z, int i, List<Header> list) throws IOException {
        yl0.e(list, C0059ao.a(1982));
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            long min = Math.min(this.maxFrameSize, size);
            int i2 = (size > min ? 1 : (size == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            frameHeader(i, (int) min, 1, i3);
            this.sink.write(this.hpackBuffer, min);
            if (i2 > 0) {
                writeContinuationFrames(i, size - min);
            }
        } else {
            throw new IOException(C0059ao.a(1983));
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, 6, z ? 1 : 0);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        } else {
            throw new IOException(C0059ao.a(1984));
        }
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        yl0.e(list, C0059ao.a(1985));
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize - 4, size);
            int i3 = min + 4;
            long j = min;
            int i4 = (size > j ? 1 : (size == j ? 0 : -1));
            frameHeader(i, i3, 5, i4 == 0 ? 4 : 0);
            this.sink.writeInt(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.sink.write(this.hpackBuffer, j);
            if (i4 > 0) {
                writeContinuationFrames(i, size - j);
            }
        } else {
            throw new IOException(C0059ao.a(1986));
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        yl0.e(errorCode, C0059ao.a(1987));
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(i, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(C0059ao.a(1988).toString());
            }
        } else {
            throw new IOException(C0059ao.a(1989));
        }
    }

    public final synchronized void settings(Settings settings) throws IOException {
        yl0.e(settings, C0059ao.a(1990));
        if (!this.closed) {
            int i = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.sink.writeInt(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } else {
            throw new IOException(C0059ao.a(1991));
        }
    }

    public final synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.closed) {
            throw new IOException(C0059ao.a(1993));
        }
        if (j != 0 && j <= 2147483647L) {
            frameHeader(i, 4, 8, 0);
            this.sink.writeInt((int) j);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException((C0059ao.a(1992) + j).toString());
        }
    }
}
