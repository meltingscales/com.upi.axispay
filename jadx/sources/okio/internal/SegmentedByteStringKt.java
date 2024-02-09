package okio.internal;

import myunmn.C0059ao;
import okio.Buffer;
import okio.ByteString;
import okio.Segment;
import okio.SegmentedByteString;
import okio.Util;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class SegmentedByteStringKt {
    public static final int binarySearch(int[] iArr, int i, int i2, int i3) {
        yl0.e(iArr, C0059ao.a(10772));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final boolean commonEquals(SegmentedByteString segmentedByteString, Object obj) {
        yl0.e(segmentedByteString, C0059ao.a(10773));
        if (obj == segmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == segmentedByteString.size() && segmentedByteString.rangeEquals(0, byteString, 0, segmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(SegmentedByteString segmentedByteString) {
        yl0.e(segmentedByteString, C0059ao.a(10774));
        return segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(SegmentedByteString segmentedByteString) {
        yl0.e(segmentedByteString, C0059ao.a(10775));
        int hashCode$okio = segmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = segmentedByteString.getDirectory$okio()[length + i];
            int i5 = segmentedByteString.getDirectory$okio()[i];
            byte[] bArr = segmentedByteString.getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        segmentedByteString.setHashCode$okio(i2);
        return i2;
    }

    public static final byte commonInternalGet(SegmentedByteString segmentedByteString, int i) {
        yl0.e(segmentedByteString, C0059ao.a(10776));
        Util.checkOffsetAndCount(segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1], i, 1L);
        int segment = segment(segmentedByteString, i);
        return segmentedByteString.getSegments$okio()[segment][(i - (segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1])) + segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment]];
    }

    public static final boolean commonRangeEquals(SegmentedByteString segmentedByteString, int i, ByteString byteString, int i2, int i3) {
        yl0.e(segmentedByteString, C0059ao.a(10777));
        yl0.e(byteString, C0059ao.a(10778));
        if (i < 0 || i > segmentedByteString.size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(segmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i6 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i4, (segmentedByteString.getDirectory$okio()[segment] - i5) + i5) - i;
            if (!byteString.rangeEquals(i2, segmentedByteString.getSegments$okio()[segment], i6 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(SegmentedByteString segmentedByteString, int i, int i2) {
        yl0.e(segmentedByteString, C0059ao.a(10781));
        if (i >= 0) {
            boolean z = i2 <= segmentedByteString.size();
            String a = C0059ao.a(10782);
            if (!z) {
                throw new IllegalArgumentException((a + i2 + C0059ao.a(10784) + segmentedByteString.size() + ')').toString());
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == segmentedByteString.size()) {
                    return segmentedByteString;
                }
                if (i == i2) {
                    return ByteString.EMPTY;
                }
                int segment = segment(segmentedByteString, i);
                int segment2 = segment(segmentedByteString, i2 - 1);
                byte[][] bArr = (byte[][]) wi0.f(segmentedByteString.getSegments$okio(), segment, segment2 + 1);
                int[] iArr = new int[bArr.length * 2];
                if (segment <= segment2) {
                    int i4 = 0;
                    int i5 = segment;
                    while (true) {
                        iArr[i4] = Math.min(segmentedByteString.getDirectory$okio()[i5] - i, i3);
                        int i6 = i4 + 1;
                        iArr[i4 + bArr.length] = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + i5];
                        if (i5 == segment2) {
                            break;
                        }
                        i5++;
                        i4 = i6;
                    }
                }
                int i7 = segment != 0 ? segmentedByteString.getDirectory$okio()[segment - 1] : 0;
                int length = bArr.length;
                iArr[length] = iArr[length] + (i - i7);
                return new SegmentedByteString(bArr, iArr);
            }
            throw new IllegalArgumentException((a + i2 + C0059ao.a(10783) + i).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(10785) + i + C0059ao.a(10786)).toString());
    }

    public static final byte[] commonToByteArray(SegmentedByteString segmentedByteString) {
        yl0.e(segmentedByteString, C0059ao.a(10787));
        byte[] bArr = new byte[segmentedByteString.size()];
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = segmentedByteString.getDirectory$okio()[length + i];
            int i5 = segmentedByteString.getDirectory$okio()[i];
            int i6 = i5 - i2;
            wi0.c(segmentedByteString.getSegments$okio()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final void commonWrite(SegmentedByteString segmentedByteString, Buffer buffer, int i, int i2) {
        yl0.e(segmentedByteString, C0059ao.a(10788));
        yl0.e(buffer, C0059ao.a(10789));
        int i3 = i + i2;
        int segment = segment(segmentedByteString, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i5 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i3, (segmentedByteString.getDirectory$okio()[segment] - i4) + i4) - i;
            int i6 = i5 + (i - i4);
            Segment segment2 = new Segment(segmentedByteString.getSegments$okio()[segment], i6, i6 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                yl0.c(segment3);
                Segment segment4 = segment3.prev;
                yl0.c(segment4);
                segment4.push(segment2);
            }
            i += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i2);
    }

    public static final void forEachSegment(SegmentedByteString segmentedByteString, il0<? super byte[], ? super Integer, ? super Integer, pi0> il0Var) {
        yl0.e(segmentedByteString, C0059ao.a(10790));
        yl0.e(il0Var, C0059ao.a(10791));
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = segmentedByteString.getDirectory$okio()[length + i];
            int i4 = segmentedByteString.getDirectory$okio()[i];
            il0Var.a(segmentedByteString.getSegments$okio()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    public static final int segment(SegmentedByteString segmentedByteString, int i) {
        yl0.e(segmentedByteString, C0059ao.a(10792));
        int binarySearch = binarySearch(segmentedByteString.getDirectory$okio(), i + 1, 0, segmentedByteString.getSegments$okio().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachSegment(SegmentedByteString segmentedByteString, int i, int i2, il0<? super byte[], ? super Integer, ? super Integer, pi0> il0Var) {
        int segment = segment(segmentedByteString, i);
        while (i < i2) {
            int i3 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i4 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i2, (segmentedByteString.getDirectory$okio()[segment] - i3) + i3) - i;
            il0Var.a(segmentedByteString.getSegments$okio()[segment], Integer.valueOf(i4 + (i - i3)), Integer.valueOf(min));
            i += min;
            segment++;
        }
    }

    public static final boolean commonRangeEquals(SegmentedByteString segmentedByteString, int i, byte[] bArr, int i2, int i3) {
        yl0.e(segmentedByteString, C0059ao.a(10779));
        yl0.e(bArr, C0059ao.a(10780));
        if (i < 0 || i > segmentedByteString.size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(segmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i6 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i4, (segmentedByteString.getDirectory$okio()[segment] - i5) + i5) - i;
            if (!Util.arrayRangeEquals(segmentedByteString.getSegments$okio()[segment], i6 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }
}
