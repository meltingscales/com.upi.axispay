package okio.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import myunmn.C0059ao;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Platform;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Util;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class BufferKt {
    private static final byte[] HEX_DIGIT_BYTES;
    public static final long OVERFLOW_DIGIT_START = 0;
    public static final long OVERFLOW_ZONE = 0;
    public static final int SEGMENTING_THRESHOLD = 0;

    static {
        C0059ao.a(BufferKt.class, 302);
        HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray(C0059ao.a(8268));
    }

    public static final void commonClear(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8269));
        buffer.skip(buffer.size());
    }

    public static final long commonCompleteSegmentByteCount(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8270));
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        yl0.c(segment);
        Segment segment2 = segment.prev;
        yl0.c(segment2);
        int i = segment2.limit;
        return (i >= 8192 || !segment2.owner) ? size : size - (i - segment2.pos);
    }

    public static final Buffer commonCopy(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8271));
        Buffer buffer2 = new Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        yl0.c(segment);
        Segment sharedCopy = segment.sharedCopy();
        buffer2.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            yl0.c(segment3);
            yl0.c(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final Buffer commonCopyTo(Buffer buffer, Buffer buffer2, long j, long j2) {
        yl0.e(buffer, C0059ao.a(8272));
        yl0.e(buffer2, C0059ao.a(8273));
        Util.checkOffsetAndCount(buffer.size(), j, j2);
        if (j2 == 0) {
            return buffer;
        }
        buffer2.setSize$okio(buffer2.size() + j2);
        Segment segment = buffer.head;
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
            Segment segment2 = buffer2.head;
            if (segment2 == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                buffer2.head = sharedCopy;
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
        return buffer;
    }

    public static final boolean commonEquals(Buffer buffer, Object obj) {
        yl0.e(buffer, C0059ao.a(8274));
        if (buffer == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer2 = (Buffer) obj;
            if (buffer.size() != buffer2.size()) {
                return false;
            }
            if (buffer.size() == 0) {
                return true;
            }
            Segment segment = buffer.head;
            yl0.c(segment);
            Segment segment2 = buffer2.head;
            yl0.c(segment2);
            int i = segment.pos;
            int i2 = segment2.pos;
            long j = 0;
            while (j < buffer.size()) {
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
            return true;
        }
        return false;
    }

    public static final byte commonGet(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8275));
        Util.checkOffsetAndCount(buffer.size(), j, 1L);
        Segment segment = buffer.head;
        if (segment != null) {
            if (buffer.size() - j < j) {
                long size = buffer.size();
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

    public static final int commonHashCode(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8276));
        Segment segment = buffer.head;
        if (segment != null) {
            int i = 1;
            do {
                int i2 = segment.limit;
                for (int i3 = segment.pos; i3 < i2; i3++) {
                    i = (i * 31) + segment.data[i3];
                }
                segment = segment.next;
                yl0.c(segment);
            } while (segment != buffer.head);
            return i;
        }
        return 0;
    }

    public static final long commonIndexOf(Buffer buffer, byte b, long j, long j2) {
        Segment segment;
        int i;
        yl0.e(buffer, C0059ao.a(8277));
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > buffer.size()) {
                j2 = buffer.size();
            }
            if (j == j2 || (segment = buffer.head) == null) {
                return -1L;
            }
            if (buffer.size() - j < j) {
                j3 = buffer.size();
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
            }
            return -1L;
            return (i - segment.pos) + j3;
        }
        throw new IllegalArgumentException((C0059ao.a(8278) + buffer.size() + C0059ao.a(8279) + j + C0059ao.a(8280) + j2).toString());
    }

    public static final long commonIndexOfElement(Buffer buffer, ByteString byteString, long j) {
        int i;
        int i2;
        yl0.e(buffer, C0059ao.a(8285));
        yl0.e(byteString, C0059ao.a(8286));
        long j2 = 0;
        if (j >= 0) {
            Segment segment = buffer.head;
            if (segment != null) {
                if (buffer.size() - j < j) {
                    j2 = buffer.size();
                    while (j2 > j) {
                        segment = segment.prev;
                        yl0.c(segment);
                        j2 -= segment.limit - segment.pos;
                    }
                    if (segment != null) {
                        if (byteString.size() == 2) {
                            byte b = byteString.getByte(0);
                            byte b2 = byteString.getByte(1);
                            while (j2 < buffer.size()) {
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
                        } else {
                            byte[] internalArray$okio = byteString.internalArray$okio();
                            while (j2 < buffer.size()) {
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
                        }
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
                        while (j2 < buffer.size()) {
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
                    } else {
                        byte[] internalArray$okio2 = byteString.internalArray$okio();
                        while (j2 < buffer.size()) {
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
                    }
                }
                return -1L;
                return (i - i2) + j2;
            }
            return -1L;
        }
        throw new IllegalArgumentException((C0059ao.a(8287) + j).toString());
    }

    public static final boolean commonRangeEquals(Buffer buffer, long j, ByteString byteString, int i, int i2) {
        yl0.e(buffer, C0059ao.a(8288));
        yl0.e(byteString, C0059ao.a(8289));
        if (j < 0 || i < 0 || i2 < 0 || buffer.size() - j < i2 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (buffer.getByte(i3 + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(Buffer buffer, byte[] bArr) {
        yl0.e(buffer, C0059ao.a(8290));
        yl0.e(bArr, C0059ao.a(8291));
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final long commonReadAll(Buffer buffer, Sink sink) {
        yl0.e(buffer, C0059ao.a(8297));
        yl0.e(sink, C0059ao.a(8298));
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final byte commonReadByte(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8299));
        if (buffer.size() != 0) {
            Segment segment = buffer.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = i + 1;
            byte b = segment.data[i];
            buffer.setSize$okio(buffer.size() - 1);
            if (i3 == i2) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public static final byte[] commonReadByteArray(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8300));
        return buffer.readByteArray(buffer.size());
    }

    public static final ByteString commonReadByteString(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8303));
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00d5 A[EDGE_INSN: B:108:0x00d5->B:100:0x00d5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(okio.Buffer r17) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(Buffer buffer, byte[] bArr) {
        yl0.e(buffer, C0059ao.a(8311));
        yl0.e(bArr, C0059ao.a(8312));
        int i = 0;
        while (i < bArr.length) {
            int read = buffer.read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c2 A[EDGE_INSN: B:92:0x00c2->B:85:0x00c2 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r14) {
        /*
            r0 = 8313(0x2079, float:1.1649E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lcc
            r0 = 0
            r1 = r0
            r4 = r2
        L17:
            okio.Segment r6 = r14.head
            defpackage.yl0.c(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L22:
            if (r8 >= r9) goto Lae
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L33
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L33
            int r11 = r10 - r11
            goto L4d
        L33:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L42
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L42
        L3d:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L4d
        L42:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L8a
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L8a
            goto L3d
        L4d:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L5d
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L22
        L5d:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 8314(0x207a, float:1.165E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r2)
            r1.append(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L8a:
            if (r0 == 0) goto L8e
            r1 = 1
            goto Lae
        L8e:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 8315(0x207b, float:1.1652E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            r0.append(r1)
            java.lang.String r1 = okio.Util.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        Lae:
            if (r8 != r9) goto Lba
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto Lbc
        Lba:
            r6.pos = r8
        Lbc:
            if (r1 != 0) goto Lc2
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L17
        Lc2:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lcc:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8316));
        if (buffer.size() >= 4) {
            Segment segment = buffer.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 4) {
                return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            buffer.setSize$okio(buffer.size() - 4);
            if (i8 == i2) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    public static final long commonReadLong(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8317));
        if (buffer.size() >= 8) {
            Segment segment = buffer.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 8) {
                return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
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
            buffer.setSize$okio(buffer.size() - 8);
            if (i10 == i2) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    public static final short commonReadShort(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8318));
        if (buffer.size() >= 2) {
            Segment segment = buffer.head;
            yl0.c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            buffer.setSize$okio(buffer.size() - 2);
            if (i4 == i2) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    public static final String commonReadUtf8(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8319));
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (buffer.size() >= j) {
                if (i == 0) {
                    return C0059ao.a(8320);
                }
                Segment segment = buffer.head;
                yl0.c(segment);
                int i2 = segment.pos;
                if (i2 + j > segment.limit) {
                    return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
                }
                int i3 = (int) j;
                String commonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i2, i2 + i3);
                segment.pos += i3;
                buffer.setSize$okio(buffer.size() - j);
                if (segment.pos == segment.limit) {
                    buffer.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
                return commonToUtf8String;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException((C0059ao.a(8321) + j).toString());
    }

    public static final int commonReadUtf8CodePoint(Buffer buffer) {
        int i;
        int i2;
        int i3;
        yl0.e(buffer, C0059ao.a(8322));
        if (buffer.size() != 0) {
            byte b = buffer.getByte(0L);
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
                buffer.skip(1L);
                return 65533;
            } else {
                i = b & 7;
                i2 = 4;
                i3 = LogFileManager.MAX_LOG_SIZE;
            }
            long j = i2;
            if (buffer.size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte b2 = buffer.getByte(j2);
                    if ((b2 & 192) != 128) {
                        buffer.skip(j2);
                        return 65533;
                    }
                    i = (i << 6) | (b2 & 63);
                }
                buffer.skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((55296 <= i && 57343 >= i) || i < i3) {
                    return 65533;
                }
                return i;
            }
            throw new EOFException(C0059ao.a(8323) + i2 + C0059ao.a(8324) + buffer.size() + C0059ao.a(8325) + Util.toHexString(b) + ')');
        }
        throw new EOFException();
    }

    public static final String commonReadUtf8Line(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8326));
        long indexOf = buffer.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8327));
        if (j >= 0) {
            long j2 = RecyclerView.FOREVER_NS;
            if (j != RecyclerView.FOREVER_NS) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long indexOf = buffer.indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return readUtf8Line(buffer, indexOf);
            }
            if (j2 < buffer.size() && buffer.getByte(j2 - 1) == ((byte) 13) && buffer.getByte(j2) == b) {
                return readUtf8Line(buffer, j2);
            }
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
            throw new EOFException(C0059ao.a(8328) + Math.min(buffer.size(), j) + C0059ao.a(8329) + buffer2.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException((C0059ao.a(8330) + j).toString());
    }

    public static final int commonSelect(Buffer buffer, Options options) {
        yl0.e(buffer, C0059ao.a(8331));
        yl0.e(options, C0059ao.a(8332));
        int selectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8333));
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment != null) {
                int min = (int) Math.min(j, segment.limit - segment.pos);
                long j2 = min;
                buffer.setSize$okio(buffer.size() - j2);
                j -= j2;
                int i = segment.pos + min;
                segment.pos = i;
                if (i == segment.limit) {
                    buffer.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public static final ByteString commonSnapshot(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(8334));
        if (buffer.size() <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException((C0059ao.a(8335) + buffer.size()).toString());
    }

    public static final Segment commonWritableSegment(Buffer buffer, int i) {
        yl0.e(buffer, C0059ao.a(8338));
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            Segment segment = buffer.head;
            if (segment == null) {
                Segment take = SegmentPool.take();
                buffer.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            yl0.c(segment);
            Segment segment2 = segment.prev;
            yl0.c(segment2);
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        throw new IllegalArgumentException(C0059ao.a(8339).toString());
    }

    public static final Buffer commonWrite(Buffer buffer, ByteString byteString, int i, int i2) {
        yl0.e(buffer, C0059ao.a(8340));
        yl0.e(byteString, C0059ao.a(8341));
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer buffer, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        yl0.e(buffer, C0059ao.a(8351));
        yl0.e(byteString, C0059ao.a(8352));
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final long commonWriteAll(Buffer buffer, Source source) {
        yl0.e(buffer, C0059ao.a(8353));
        yl0.e(source, C0059ao.a(8354));
        long j = 0;
        while (true) {
            long read = source.read(buffer, (long) UserMetadata.MAX_INTERNAL_KEY_SIZE);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static final Buffer commonWriteByte(Buffer buffer, int i) {
        yl0.e(buffer, C0059ao.a(8355));
        Segment writableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final Buffer commonWriteDecimalLong(Buffer buffer, long j) {
        int i;
        yl0.e(buffer, C0059ao.a(8356));
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return buffer.writeByte(48);
        }
        boolean z = false;
        int i3 = 1;
        if (i2 < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8(C0059ao.a(8357));
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
        Segment writableSegment$okio = buffer.writableSegment$okio(i3);
        byte[] bArr = writableSegment$okio.data;
        int i4 = writableSegment$okio.limit + i3;
        while (j != 0) {
            long j2 = 10;
            i4--;
            bArr[i4] = getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i4 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i3;
        buffer.setSize$okio(buffer.size() + i3);
        return buffer;
    }

    public static final Buffer commonWriteHexadecimalUnsignedLong(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8358));
        if (j == 0) {
            return buffer.writeByte(48);
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
        Segment writableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    public static final Buffer commonWriteInt(Buffer buffer, int i) {
        yl0.e(buffer, C0059ao.a(8359));
        Segment writableSegment$okio = buffer.writableSegment$okio(4);
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
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final Buffer commonWriteLong(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8360));
        Segment writableSegment$okio = buffer.writableSegment$okio(8);
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
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final Buffer commonWriteShort(Buffer buffer, int i) {
        yl0.e(buffer, C0059ao.a(8361));
        Segment writableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        writableSegment$okio.limit = i3 + 1;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final Buffer commonWriteUtf8(Buffer buffer, String str, int i, int i2) {
        yl0.e(buffer, C0059ao.a(8362));
        yl0.e(str, C0059ao.a(8363));
        if (!(i >= 0)) {
            throw new IllegalArgumentException((C0059ao.a(8368) + i).toString());
        }
        if (i2 >= i) {
            if (!(i2 <= str.length())) {
                throw new IllegalArgumentException((C0059ao.a(8364) + i2 + C0059ao.a(8365) + str.length()).toString());
            }
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    Segment writableSegment$okio = buffer.writableSegment$okio(1);
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
                    buffer.setSize$okio(buffer.size() + i6);
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        Segment writableSegment$okio2 = buffer.writableSegment$okio(2);
                        byte[] bArr2 = writableSegment$okio2.data;
                        int i7 = writableSegment$okio2.limit;
                        bArr2[i7] = (byte) ((charAt >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt & '?') | Barcode.ITF);
                        writableSegment$okio2.limit = i7 + 2;
                        buffer.setSize$okio(buffer.size() + 2);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                        if (charAt <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                            int i9 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + LogFileManager.MAX_LOG_SIZE;
                            Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
                            byte[] bArr3 = writableSegment$okio3.data;
                            int i10 = writableSegment$okio3.limit;
                            bArr3[i10] = (byte) ((i9 >> 18) | 240);
                            bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | Barcode.ITF);
                            bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | Barcode.ITF);
                            bArr3[i10 + 3] = (byte) ((i9 & 63) | Barcode.ITF);
                            writableSegment$okio3.limit = i10 + 4;
                            buffer.setSize$okio(buffer.size() + 4);
                            i += 2;
                        } else {
                            buffer.writeByte(63);
                            i = i8;
                        }
                    } else {
                        Segment writableSegment$okio4 = buffer.writableSegment$okio(3);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i11 = writableSegment$okio4.limit;
                        bArr4[i11] = (byte) ((charAt >> '\f') | 224);
                        bArr4[i11 + 1] = (byte) ((63 & (charAt >> 6)) | Barcode.ITF);
                        bArr4[i11 + 2] = (byte) ((charAt & '?') | Barcode.ITF);
                        writableSegment$okio4.limit = i11 + 3;
                        buffer.setSize$okio(buffer.size() + 3);
                    }
                    i++;
                }
            }
            return buffer;
        }
        throw new IllegalArgumentException((C0059ao.a(8366) + i2 + C0059ao.a(8367) + i).toString());
    }

    public static final Buffer commonWriteUtf8CodePoint(Buffer buffer, int i) {
        yl0.e(buffer, C0059ao.a(8369));
        if (i < 128) {
            buffer.writeByte(i);
        } else if (i < 2048) {
            Segment writableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | Barcode.ITF);
            writableSegment$okio.limit = i2 + 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i && 57343 >= i) {
            buffer.writeByte(63);
        } else if (i < 65536) {
            Segment writableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | Barcode.ITF);
            bArr2[i3 + 2] = (byte) ((i & 63) | Barcode.ITF);
            writableSegment$okio2.limit = i3 + 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else if (i <= 1114111) {
            Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i4 = writableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | Barcode.ITF);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | Barcode.ITF);
            bArr3[i4 + 3] = (byte) ((i & 63) | Barcode.ITF);
            writableSegment$okio3.limit = i4 + 4;
            buffer.setSize$okio(buffer.size() + 4);
        } else {
            throw new IllegalArgumentException(C0059ao.a(8370) + Util.toHexString(i));
        }
        return buffer;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(Segment segment, int i, byte[] bArr, int i2, int i3) {
        yl0.e(segment, C0059ao.a(8371));
        yl0.e(bArr, C0059ao.a(8372));
        int i4 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                yl0.c(segment);
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String readUtf8Line(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8373));
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == ((byte) 13)) {
                String readUtf8 = buffer.readUtf8(j2);
                buffer.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return readUtf82;
    }

    public static final <T> T seek(Buffer buffer, long j, hl0<? super Segment, ? super Long, ? extends T> hl0Var) {
        yl0.e(buffer, C0059ao.a(8374));
        yl0.e(hl0Var, C0059ao.a(8375));
        Segment segment = buffer.head;
        if (segment != null) {
            if (buffer.size() - j < j) {
                long size = buffer.size();
                while (size > j) {
                    segment = segment.prev;
                    yl0.c(segment);
                    size -= segment.limit - segment.pos;
                }
                return hl0Var.a(segment, Long.valueOf(size));
            }
            long j2 = 0;
            while (true) {
                long j3 = (segment.limit - segment.pos) + j2;
                if (j3 > j) {
                    return hl0Var.a(segment, Long.valueOf(j2));
                }
                segment = segment.next;
                yl0.c(segment);
                j2 = j3;
            }
        } else {
            return hl0Var.a(null, -1L);
        }
    }

    public static final int selectPrefix(Buffer buffer, Options options, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Segment segment;
        yl0.e(buffer, C0059ao.a(8376));
        yl0.e(options, C0059ao.a(8377));
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i5 = segment2.pos;
        int i6 = segment2.limit;
        int[] trie$okio = options.getTrie$okio();
        Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = trie$okio[i8];
            int i11 = i9 + 1;
            int i12 = trie$okio[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == trie$okio[i11]) {
                        i2 = trie$okio[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.next;
                            yl0.c(segment3);
                            i = segment3.pos;
                            bArr = segment3.data;
                            i6 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != trie$okio[i11]) {
                    return i7;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    yl0.c(segment3);
                    Segment segment4 = segment3.next;
                    yl0.c(segment4);
                    i4 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i3 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else if (!z2) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    Segment segment5 = segment3;
                    i3 = i6;
                    i4 = i16;
                    segment = segment5;
                }
                if (z2) {
                    i2 = trie$okio[i17];
                    i = i4;
                    i6 = i3;
                    segment3 = segment;
                    break;
                }
                i5 = i4;
                i6 = i3;
                i11 = i17;
                segment3 = segment;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    public static final int commonRead(Buffer buffer, byte[] bArr, int i, int i2) {
        yl0.e(buffer, C0059ao.a(8292));
        yl0.e(bArr, C0059ao.a(8293));
        Util.checkOffsetAndCount(bArr.length, i, i2);
        Segment segment = buffer.head;
        if (segment != null) {
            int min = Math.min(i2, segment.limit - segment.pos);
            byte[] bArr2 = segment.data;
            int i3 = segment.pos;
            wi0.c(bArr2, bArr, i, i3, i3 + min);
            segment.pos += min;
            buffer.setSize$okio(buffer.size() - min);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            return min;
        }
        return -1;
    }

    public static final byte[] commonReadByteArray(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8301));
        if (j >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (buffer.size() >= j) {
                byte[] bArr = new byte[(int) j];
                buffer.readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException((C0059ao.a(8302) + j).toString());
    }

    public static final ByteString commonReadByteString(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(8304));
        if (j >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (buffer.size() >= j) {
                if (j >= ((long) Barcode.AZTEC)) {
                    ByteString snapshot = buffer.snapshot((int) j);
                    buffer.skip(j);
                    return snapshot;
                }
                return new ByteString(buffer.readByteArray(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException((C0059ao.a(8305) + j).toString());
    }

    public static final Buffer commonWrite(Buffer buffer, byte[] bArr) {
        yl0.e(buffer, C0059ao.a(8344));
        yl0.e(bArr, C0059ao.a(8345));
        return buffer.write(bArr, 0, bArr.length);
    }

    public static final Buffer commonWrite(Buffer buffer, byte[] bArr, int i, int i2) {
        yl0.e(buffer, C0059ao.a(8346));
        yl0.e(bArr, C0059ao.a(8347));
        long j = i2;
        Util.checkOffsetAndCount(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            wi0.c(bArr, writableSegment$okio.data, writableSegment$okio.limit, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final void commonReadFully(Buffer buffer, Buffer buffer2, long j) {
        yl0.e(buffer, C0059ao.a(8309));
        yl0.e(buffer2, C0059ao.a(8310));
        if (buffer.size() >= j) {
            buffer2.write(buffer, j);
        } else {
            buffer2.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(Buffer buffer, int i) {
        yl0.e(buffer, C0059ao.a(8336));
        if (i == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(buffer.size(), 0L, i);
        Segment segment = buffer.head;
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
                throw new AssertionError(C0059ao.a(8337));
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = buffer.head;
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

    public static final Buffer commonWrite(Buffer buffer, Source source, long j) {
        yl0.e(buffer, C0059ao.a(8342));
        yl0.e(source, C0059ao.a(8343));
        while (j > 0) {
            long read = source.read(buffer, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return buffer;
    }

    public static final long commonRead(Buffer buffer, Buffer buffer2, long j) {
        yl0.e(buffer, C0059ao.a(8294));
        yl0.e(buffer2, C0059ao.a(8295));
        if (j >= 0) {
            if (buffer.size() == 0) {
                return -1L;
            }
            if (j > buffer.size()) {
                j = buffer.size();
            }
            buffer2.write(buffer, j);
            return j;
        }
        throw new IllegalArgumentException((C0059ao.a(8296) + j).toString());
    }

    public static final void commonWrite(Buffer buffer, Buffer buffer2, long j) {
        Segment segment;
        Segment segment2;
        yl0.e(buffer, C0059ao.a(8348));
        yl0.e(buffer2, C0059ao.a(8349));
        if (buffer2 != buffer) {
            Util.checkOffsetAndCount(buffer2.size(), 0L, j);
            while (j > 0) {
                Segment segment3 = buffer2.head;
                yl0.c(segment3);
                int i = segment3.limit;
                yl0.c(buffer2.head);
                if (j < i - segment.pos) {
                    Segment segment4 = buffer.head;
                    if (segment4 != null) {
                        yl0.c(segment4);
                        segment2 = segment4.prev;
                    } else {
                        segment2 = null;
                    }
                    if (segment2 != null && segment2.owner) {
                        if ((segment2.limit + j) - (segment2.shared ? 0 : segment2.pos) <= ((long) UserMetadata.MAX_INTERNAL_KEY_SIZE)) {
                            Segment segment5 = buffer2.head;
                            yl0.c(segment5);
                            segment5.writeTo(segment2, (int) j);
                            buffer2.setSize$okio(buffer2.size() - j);
                            buffer.setSize$okio(buffer.size() + j);
                            return;
                        }
                    }
                    Segment segment6 = buffer2.head;
                    yl0.c(segment6);
                    buffer2.head = segment6.split((int) j);
                }
                Segment segment7 = buffer2.head;
                yl0.c(segment7);
                long j2 = segment7.limit - segment7.pos;
                buffer2.head = segment7.pop();
                Segment segment8 = buffer.head;
                if (segment8 == null) {
                    buffer.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    yl0.c(segment8);
                    Segment segment9 = segment8.prev;
                    yl0.c(segment9);
                    segment9.push(segment7).compact();
                }
                buffer2.setSize$okio(buffer2.size() - j2);
                buffer.setSize$okio(buffer.size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(8350).toString());
    }

    public static final long commonIndexOf(Buffer buffer, ByteString byteString, long j) {
        long j2 = j;
        yl0.e(buffer, C0059ao.a(8281));
        yl0.e(byteString, C0059ao.a(8282));
        boolean z = true;
        if (byteString.size() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                Segment segment = buffer.head;
                if (segment != null) {
                    if (buffer.size() - j2 < j2) {
                        long size = buffer.size();
                        while (size > j2) {
                            segment = segment.prev;
                            yl0.c(segment);
                            size -= segment.limit - segment.pos;
                        }
                        if (segment != null) {
                            byte[] internalArray$okio = byteString.internalArray$okio();
                            byte b = internalArray$okio[0];
                            int size2 = byteString.size();
                            long size3 = (buffer.size() - size2) + 1;
                            while (size < size3) {
                                byte[] bArr = segment.data;
                                int min = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                                for (int i = (int) ((segment.pos + j2) - size); i < min; i++) {
                                    if (bArr[i] == b && rangeEquals(segment, i + 1, internalArray$okio, 1, size2)) {
                                        return (i - segment.pos) + size;
                                    }
                                }
                                size += segment.limit - segment.pos;
                                segment = segment.next;
                                yl0.c(segment);
                                j2 = size;
                            }
                            return -1L;
                        }
                        return -1L;
                    }
                    while (true) {
                        long j4 = (segment.limit - segment.pos) + j3;
                        if (j4 > j2) {
                            break;
                        }
                        segment = segment.next;
                        yl0.c(segment);
                        j3 = j4;
                        z = z;
                    }
                    if (segment != null) {
                        byte[] internalArray$okio2 = byteString.internalArray$okio();
                        byte b2 = internalArray$okio2[0];
                        int size4 = byteString.size();
                        long size5 = (buffer.size() - size4) + 1;
                        while (j3 < size5) {
                            byte[] bArr2 = segment.data;
                            long j5 = j3;
                            int min2 = (int) Math.min(segment.limit, (segment.pos + size5) - j3);
                            for (int i2 = (int) ((segment.pos + j2) - j5); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && rangeEquals(segment, i2 + 1, internalArray$okio2, 1, size4)) {
                                    return (i2 - segment.pos) + j5;
                                }
                            }
                            j3 = j5 + (segment.limit - segment.pos);
                            segment = segment.next;
                            yl0.c(segment);
                            j2 = j3;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                return -1L;
            }
            throw new IllegalArgumentException((C0059ao.a(8283) + j2).toString());
        }
        throw new IllegalArgumentException(C0059ao.a(8284).toString());
    }
}
