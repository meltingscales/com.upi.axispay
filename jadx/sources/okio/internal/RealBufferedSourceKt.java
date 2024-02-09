package okio.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import myunmn.C0059ao;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Timeout;
import okio.Util;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class RealBufferedSourceKt {
    public static final void commonClose(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7779));
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7780));
        if (!realBufferedSource.closed) {
            return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1;
        }
        throw new IllegalStateException(C0059ao.a(7781).toString());
    }

    public static final long commonIndexOf(RealBufferedSource realBufferedSource, byte b, long j, long j2) {
        yl0.e(realBufferedSource, C0059ao.a(7782));
        boolean z = true;
        if (!realBufferedSource.closed) {
            if (!((0 > j || j2 < j) ? false : false)) {
                throw new IllegalArgumentException((C0059ao.a(7783) + j + C0059ao.a(7784) + j2).toString());
            }
            while (j < j2) {
                long indexOf = realBufferedSource.bufferField.indexOf(b, j, j2);
                if (indexOf == -1) {
                    long size = realBufferedSource.bufferField.size();
                    if (size >= j2 || realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                        break;
                    }
                    j = Math.max(j, size);
                } else {
                    return indexOf;
                }
            }
            return -1L;
        }
        throw new IllegalStateException(C0059ao.a(7785).toString());
    }

    public static final long commonIndexOfElement(RealBufferedSource realBufferedSource, ByteString byteString, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7789));
        yl0.e(byteString, C0059ao.a(7790));
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException(C0059ao.a(7791).toString());
        }
        while (true) {
            long indexOfElement = realBufferedSource.bufferField.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    public static final BufferedSource commonPeek(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7792));
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(RealBufferedSource realBufferedSource, long j, ByteString byteString, int i, int i2) {
        yl0.e(realBufferedSource, C0059ao.a(7793));
        yl0.e(byteString, C0059ao.a(7794));
        if (!realBufferedSource.closed) {
            if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!realBufferedSource.request(1 + j2) || realBufferedSource.bufferField.getByte(j2) != byteString.getByte(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException(C0059ao.a(7795).toString());
    }

    public static final long commonRead(RealBufferedSource realBufferedSource, Buffer buffer, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7798));
        yl0.e(buffer, C0059ao.a(7799));
        if (j >= 0) {
            if (!realBufferedSource.closed) {
                if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                    return -1L;
                }
                return realBufferedSource.bufferField.read(buffer, Math.min(j, realBufferedSource.bufferField.size()));
            }
            throw new IllegalStateException(C0059ao.a(7800).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(7801) + j).toString());
    }

    public static final long commonReadAll(RealBufferedSource realBufferedSource, Sink sink) {
        yl0.e(realBufferedSource, C0059ao.a(7802));
        yl0.e(sink, C0059ao.a(7803));
        long j = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) != -1) {
            long completeSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(realBufferedSource.bufferField, completeSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() > 0) {
            long size = j + realBufferedSource.bufferField.size();
            Buffer buffer = realBufferedSource.bufferField;
            sink.write(buffer, buffer.size());
            return size;
        }
        return j;
    }

    public static final byte commonReadByte(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7804));
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(RealBufferedSource realBufferedSource, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7806));
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteArray(j);
    }

    public static final ByteString commonReadByteString(RealBufferedSource realBufferedSource, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7808));
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteString(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(myunmn.C0059ao.a(7810));
        defpackage.on0.a(16);
        defpackage.on0.a(16);
        r1 = java.lang.Integer.toString(r8, 16);
        defpackage.yl0.d(r1, myunmn.C0059ao.a(7811));
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(okio.RealBufferedSource r10) {
        /*
            r0 = 7809(0x1e81, float:1.0943E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r10, r0)
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L12:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L6b
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L2a
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L34
        L2a:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L36
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L34
            goto L36
        L34:
            r4 = r6
            goto L12
        L36:
            if (r4 == 0) goto L39
            goto L6b
        L39:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 7810(0x1e82, float:1.0944E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            r0.append(r1)
            r1 = 16
            defpackage.on0.a(r1)
            defpackage.on0.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            r2 = 7811(0x1e83, float:1.0946E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r2)
            defpackage.yl0.d(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L6b:
            okio.Buffer r10 = r10.bufferField
            long r0 = r10.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.RealBufferedSourceKt.commonReadDecimalLong(okio.RealBufferedSource):long");
    }

    public static final void commonReadFully(RealBufferedSource realBufferedSource, byte[] bArr) {
        yl0.e(realBufferedSource, C0059ao.a(7814));
        yl0.e(bArr, C0059ao.a(7815));
        try {
            realBufferedSource.require(bArr.length);
            realBufferedSource.bufferField.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int read = buffer.read(bArr, i, (int) buffer.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(RealBufferedSource realBufferedSource) {
        byte b;
        yl0.e(realBufferedSource, C0059ao.a(7816));
        realBufferedSource.require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!realBufferedSource.request(i2)) {
                break;
            }
            b = realBufferedSource.bufferField.getByte(i);
            if ((b < ((byte) 48) || b > ((byte) 57)) && ((b < ((byte) 97) || b > ((byte) 102)) && (b < ((byte) 65) || b > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(7817));
            on0.a(16);
            on0.a(16);
            String num = Integer.toString(b, 16);
            yl0.d(num, C0059ao.a(7818));
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7819));
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7820));
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7821));
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7822));
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7823));
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7824));
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(RealBufferedSource realBufferedSource, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7826));
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readUtf8(j);
    }

    public static final int commonReadUtf8CodePoint(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7827));
        realBufferedSource.require(1L);
        byte b = realBufferedSource.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7828));
        long indexOf = realBufferedSource.indexOf((byte) 10);
        if (indexOf == -1) {
            if (realBufferedSource.bufferField.size() != 0) {
                return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
            }
            return null;
        }
        return BufferKt.readUtf8Line(realBufferedSource.bufferField, indexOf);
    }

    public static final String commonReadUtf8LineStrict(RealBufferedSource realBufferedSource, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7829));
        if (j >= 0) {
            long j2 = j == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long indexOf = realBufferedSource.indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(realBufferedSource.bufferField, indexOf);
            }
            if (j2 < RecyclerView.FOREVER_NS && realBufferedSource.request(j2) && realBufferedSource.bufferField.getByte(j2 - 1) == ((byte) 13) && realBufferedSource.request(1 + j2) && realBufferedSource.bufferField.getByte(j2) == b) {
                return BufferKt.readUtf8Line(realBufferedSource.bufferField, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = realBufferedSource.bufferField;
            buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
            throw new EOFException(C0059ao.a(7830) + Math.min(realBufferedSource.bufferField.size(), j) + C0059ao.a(7831) + buffer.readByteString().hex() + C0059ao.a(7832));
        }
        throw new IllegalArgumentException((C0059ao.a(7833) + j).toString());
    }

    public static final boolean commonRequest(RealBufferedSource realBufferedSource, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7834));
        if (j >= 0) {
            if (!realBufferedSource.closed) {
                while (realBufferedSource.bufferField.size() < j) {
                    if (realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException(C0059ao.a(7835).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(7836) + j).toString());
    }

    public static final void commonRequire(RealBufferedSource realBufferedSource, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7837));
        if (!realBufferedSource.request(j)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(RealBufferedSource realBufferedSource, Options options) {
        yl0.e(realBufferedSource, C0059ao.a(7838));
        yl0.e(options, C0059ao.a(7839));
        if (!realBufferedSource.closed) {
            do {
                int selectPrefix = BufferKt.selectPrefix(realBufferedSource.bufferField, options, true);
                if (selectPrefix != -2) {
                    if (selectPrefix != -1) {
                        realBufferedSource.bufferField.skip(options.getByteStrings$okio()[selectPrefix].size());
                        return selectPrefix;
                    }
                    return -1;
                }
            } while (realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) != -1);
            return -1;
        }
        throw new IllegalStateException(C0059ao.a(7840).toString());
    }

    public static final void commonSkip(RealBufferedSource realBufferedSource, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7841));
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException(C0059ao.a(7842).toString());
        }
        while (j > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(min);
            j -= min;
        }
    }

    public static final Timeout commonTimeout(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7843));
        return realBufferedSource.source.timeout();
    }

    public static final String commonToString(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7844));
        return C0059ao.a(7845) + realBufferedSource.source + ')';
    }

    public static final byte[] commonReadByteArray(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7805));
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7807));
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final String commonReadUtf8(RealBufferedSource realBufferedSource) {
        yl0.e(realBufferedSource, C0059ao.a(7825));
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(RealBufferedSource realBufferedSource, Buffer buffer, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7812));
        yl0.e(buffer, C0059ao.a(7813));
        try {
            realBufferedSource.require(j);
            realBufferedSource.bufferField.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonIndexOf(RealBufferedSource realBufferedSource, ByteString byteString, long j) {
        yl0.e(realBufferedSource, C0059ao.a(7786));
        yl0.e(byteString, C0059ao.a(7787));
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException(C0059ao.a(7788).toString());
        }
        while (true) {
            long indexOf = realBufferedSource.bufferField.indexOf(byteString, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - byteString.size()) + 1);
        }
    }

    public static final int commonRead(RealBufferedSource realBufferedSource, byte[] bArr, int i, int i2) {
        yl0.e(realBufferedSource, C0059ao.a(7796));
        yl0.e(bArr, C0059ao.a(7797));
        long j = i2;
        Util.checkOffsetAndCount(bArr.length, i, j);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(bArr, i, (int) Math.min(j, realBufferedSource.bufferField.size()));
    }
}
