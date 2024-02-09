package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;
import okio.internal.ByteStringKt;
import okio.internal.SegmentedByteStringKt;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        yl0.e(bArr, C0059ao.a(1173));
        yl0.e(iArr, C0059ao.a(1174));
        this.segments = bArr;
        this.directory = iArr;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        Objects.requireNonNull(byteString, C0059ao.a(1175));
        return byteString;
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        yl0.d(asReadOnlyBuffer, C0059ao.a(1176));
        return asReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String str) {
        yl0.e(str, C0059ao.a(1177));
        return ByteStringKt.commonSegmentDigest(this, str);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            byte[] bArr = getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }

    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public ByteString hmac$okio(String str, ByteString byteString) {
        yl0.e(str, C0059ao.a(1178));
        yl0.e(byteString, C0059ao.a(1179));
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getDirectory$okio()[length + i];
                int i4 = getDirectory$okio()[i];
                mac.update(getSegments$okio()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = mac.doFinal();
            yl0.d(doFinal, C0059ao.a(1180));
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // okio.ByteString
    public int indexOf(byte[] bArr, int i) {
        yl0.e(bArr, C0059ao.a(1181));
        return toByteString().indexOf(bArr, i);
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i) {
        Util.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i, 1L);
        int segment = SegmentedByteStringKt.segment(this, i);
        return getSegments$okio()[segment][(i - (segment == 0 ? 0 : getDirectory$okio()[segment - 1])) + getDirectory$okio()[getSegments$okio().length + segment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] bArr, int i) {
        yl0.e(bArr, C0059ao.a(1182));
        return toByteString().lastIndexOf(bArr, i);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        yl0.e(byteString, C0059ao.a(1183));
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = SegmentedByteStringKt.segment(this, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i6 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i4, (getDirectory$okio()[segment] - i5) + i5) - i;
            if (!byteString.rangeEquals(i2, getSegments$okio()[segment], i6 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        yl0.e(charset, C0059ao.a(1185));
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int i, int i2) {
        if (i >= 0) {
            boolean z = i2 <= size();
            String a = C0059ao.a(1186);
            if (!z) {
                throw new IllegalArgumentException((a + i2 + C0059ao.a(1188) + size() + ')').toString());
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == size()) {
                    return this;
                }
                if (i == i2) {
                    return ByteString.EMPTY;
                }
                int segment = SegmentedByteStringKt.segment(this, i);
                int segment2 = SegmentedByteStringKt.segment(this, i2 - 1);
                byte[][] bArr = (byte[][]) wi0.f(getSegments$okio(), segment, segment2 + 1);
                int[] iArr = new int[bArr.length * 2];
                if (segment <= segment2) {
                    int i4 = 0;
                    int i5 = segment;
                    while (true) {
                        iArr[i4] = Math.min(getDirectory$okio()[i5] - i, i3);
                        int i6 = i4 + 1;
                        iArr[i4 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i5];
                        if (i5 == segment2) {
                            break;
                        }
                        i5++;
                        i4 = i6;
                    }
                }
                int i7 = segment != 0 ? getDirectory$okio()[segment - 1] : 0;
                int length = bArr.length;
                iArr[length] = iArr[length] + (i - i7);
                return new SegmentedByteString(bArr, iArr);
            }
            throw new IllegalArgumentException((a + i2 + C0059ao.a(1187) + i).toString());
        }
        throw new IllegalArgumentException((C0059ao.a(1189) + i + C0059ao.a(1190)).toString());
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            int i6 = i5 - i2;
            wi0.c(getSegments$okio()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        yl0.e(outputStream, C0059ao.a(1191));
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            outputStream.write(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // okio.ByteString
    public void write$okio(Buffer buffer, int i, int i2) {
        yl0.e(buffer, C0059ao.a(1192));
        int i3 = i + i2;
        int segment = SegmentedByteStringKt.segment(this, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i5 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i3, (getDirectory$okio()[segment] - i4) + i4) - i;
            int i6 = i5 + (i - i4);
            Segment segment2 = new Segment(getSegments$okio()[segment], i6, i6 + min, true, false);
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

    @Override // okio.ByteString
    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        yl0.e(bArr, C0059ao.a(1184));
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = SegmentedByteStringKt.segment(this, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i6 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i4, (getDirectory$okio()[segment] - i5) + i5) - i;
            if (!Util.arrayRangeEquals(getSegments$okio()[segment], i6 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }
}
