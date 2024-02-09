package okio.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import myunmn.C0059ao;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class RealBufferedSinkKt {
    public static final void commonClose(RealBufferedSink realBufferedSink) {
        yl0.e(realBufferedSink, C0059ao.a(1314));
        if (realBufferedSink.closed) {
            return;
        }
        Throwable th = null;
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final BufferedSink commonEmit(RealBufferedSink realBufferedSink) {
        yl0.e(realBufferedSink, C0059ao.a(1315));
        if (!realBufferedSink.closed) {
            long size = realBufferedSink.bufferField.size();
            if (size > 0) {
                realBufferedSink.sink.write(realBufferedSink.bufferField, size);
            }
            return realBufferedSink;
        }
        throw new IllegalStateException(C0059ao.a(1316).toString());
    }

    public static final BufferedSink commonEmitCompleteSegments(RealBufferedSink realBufferedSink) {
        yl0.e(realBufferedSink, C0059ao.a(1317));
        if (!realBufferedSink.closed) {
            long completeSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                realBufferedSink.sink.write(realBufferedSink.bufferField, completeSegmentByteCount);
            }
            return realBufferedSink;
        }
        throw new IllegalStateException(C0059ao.a(1318).toString());
    }

    public static final void commonFlush(RealBufferedSink realBufferedSink) {
        yl0.e(realBufferedSink, C0059ao.a(1319));
        if (!realBufferedSink.closed) {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
            realBufferedSink.sink.flush();
            return;
        }
        throw new IllegalStateException(C0059ao.a(1320).toString());
    }

    public static final Timeout commonTimeout(RealBufferedSink realBufferedSink) {
        yl0.e(realBufferedSink, C0059ao.a(1321));
        return realBufferedSink.sink.timeout();
    }

    public static final String commonToString(RealBufferedSink realBufferedSink) {
        yl0.e(realBufferedSink, C0059ao.a(1322));
        return C0059ao.a(1323) + realBufferedSink.sink + ')';
    }

    public static final void commonWrite(RealBufferedSink realBufferedSink, Buffer buffer, long j) {
        yl0.e(realBufferedSink, C0059ao.a(1338));
        yl0.e(buffer, C0059ao.a(1339));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(buffer, j);
            realBufferedSink.emitCompleteSegments();
            return;
        }
        throw new IllegalStateException(C0059ao.a(1340).toString());
    }

    public static final long commonWriteAll(RealBufferedSink realBufferedSink, Source source) {
        yl0.e(realBufferedSink, C0059ao.a(1341));
        yl0.e(source, C0059ao.a(1342));
        long j = 0;
        while (true) {
            long read = source.read(realBufferedSink.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE);
            if (read == -1) {
                return j;
            }
            j += read;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(RealBufferedSink realBufferedSink, int i) {
        yl0.e(realBufferedSink, C0059ao.a(1343));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeByte(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1344).toString());
    }

    public static final BufferedSink commonWriteDecimalLong(RealBufferedSink realBufferedSink, long j) {
        yl0.e(realBufferedSink, C0059ao.a(1345));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeDecimalLong(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1346).toString());
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(RealBufferedSink realBufferedSink, long j) {
        yl0.e(realBufferedSink, C0059ao.a(1347));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1348).toString());
    }

    public static final BufferedSink commonWriteInt(RealBufferedSink realBufferedSink, int i) {
        yl0.e(realBufferedSink, C0059ao.a(1349));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeInt(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1350).toString());
    }

    public static final BufferedSink commonWriteIntLe(RealBufferedSink realBufferedSink, int i) {
        yl0.e(realBufferedSink, C0059ao.a(1351));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeIntLe(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1352).toString());
    }

    public static final BufferedSink commonWriteLong(RealBufferedSink realBufferedSink, long j) {
        yl0.e(realBufferedSink, C0059ao.a(1353));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeLong(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1354).toString());
    }

    public static final BufferedSink commonWriteLongLe(RealBufferedSink realBufferedSink, long j) {
        yl0.e(realBufferedSink, C0059ao.a(1355));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeLongLe(j);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1356).toString());
    }

    public static final BufferedSink commonWriteShort(RealBufferedSink realBufferedSink, int i) {
        yl0.e(realBufferedSink, C0059ao.a(1357));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeShort(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1358).toString());
    }

    public static final BufferedSink commonWriteShortLe(RealBufferedSink realBufferedSink, int i) {
        yl0.e(realBufferedSink, C0059ao.a(1359));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeShortLe(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1360).toString());
    }

    public static final BufferedSink commonWriteUtf8(RealBufferedSink realBufferedSink, String str) {
        yl0.e(realBufferedSink, C0059ao.a(1361));
        yl0.e(str, C0059ao.a(1362));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1363).toString());
    }

    public static final BufferedSink commonWriteUtf8CodePoint(RealBufferedSink realBufferedSink, int i) {
        yl0.e(realBufferedSink, C0059ao.a(1367));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8CodePoint(i);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1368).toString());
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, ByteString byteString) {
        yl0.e(realBufferedSink, C0059ao.a(1324));
        yl0.e(byteString, C0059ao.a(1325));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1326).toString());
    }

    public static final BufferedSink commonWriteUtf8(RealBufferedSink realBufferedSink, String str, int i, int i2) {
        yl0.e(realBufferedSink, C0059ao.a(1364));
        yl0.e(str, C0059ao.a(1365));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1366).toString());
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, ByteString byteString, int i, int i2) {
        yl0.e(realBufferedSink, C0059ao.a(1327));
        yl0.e(byteString, C0059ao.a(1328));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1329).toString());
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, byte[] bArr) {
        yl0.e(realBufferedSink, C0059ao.a(1332));
        yl0.e(bArr, C0059ao.a(1333));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1334).toString());
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, byte[] bArr, int i, int i2) {
        yl0.e(realBufferedSink, C0059ao.a(1335));
        yl0.e(bArr, C0059ao.a(1336));
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException(C0059ao.a(1337).toString());
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, Source source, long j) {
        yl0.e(realBufferedSink, C0059ao.a(1330));
        yl0.e(source, C0059ao.a(1331));
        while (j > 0) {
            long read = source.read(realBufferedSink.bufferField, j);
            if (read != -1) {
                j -= read;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}
