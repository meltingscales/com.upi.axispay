package okio.internal;

import java.util.Arrays;
import java.util.Objects;
import myunmn.C0059ao;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.SegmentedByteString;
import okio.Util;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class ByteStringKt {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:304:0x006b, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int codePointIndexToCharIndex(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteStringKt.codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(11070));
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(11071));
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(ByteString byteString, ByteString byteString2) {
        yl0.e(byteString, C0059ao.a(11072));
        yl0.e(byteString2, C0059ao.a(11073));
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = byteString.getByte(i) & 255;
            int i3 = byteString2.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final ByteString commonDecodeBase64(String str) {
        yl0.e(str, C0059ao.a(11074));
        byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    public static final ByteString commonDecodeHex(String str) {
        yl0.e(str, C0059ao.a(11075));
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException((C0059ao.a(11076) + str).toString());
    }

    public static final ByteString commonDigest(ByteString byteString, String str) {
        yl0.e(byteString, C0059ao.a(11077));
        yl0.e(str, C0059ao.a(11078));
        HashFunction newHashFunction = HashFunctionKt.newHashFunction(str);
        newHashFunction.update(byteString.getData$okio(), 0, byteString.size());
        return new ByteString(newHashFunction.digest());
    }

    public static final ByteString commonEncodeUtf8(String str) {
        yl0.e(str, C0059ao.a(11079));
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(ByteString byteString, ByteString byteString2) {
        yl0.e(byteString, C0059ao.a(11080));
        yl0.e(byteString2, C0059ao.a(11081));
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEquals(ByteString byteString, Object obj) {
        yl0.e(byteString, C0059ao.a(11084));
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(ByteString byteString, int i) {
        yl0.e(byteString, C0059ao.a(11085));
        return byteString.getData$okio()[i];
    }

    public static final int commonGetSize(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(11086));
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(11087));
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    public static final String commonHex(ByteString byteString) {
        byte[] data$okio;
        yl0.e(byteString, C0059ao.a(11088));
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i = 0;
        for (byte b : byteString.getData$okio()) {
            int i2 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(ByteString byteString, byte[] bArr, int i) {
        yl0.e(byteString, C0059ao.a(11089));
        yl0.e(bArr, C0059ao.a(11090));
        int length = byteString.getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(byteString.getData$okio(), max, bArr, 0, bArr.length)) {
                if (max == length) {
                    return -1;
                }
                max++;
            }
            return max;
        }
        return -1;
    }

    public static final byte[] commonInternalArray(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(11091));
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(ByteString byteString, ByteString byteString2, int i) {
        yl0.e(byteString, C0059ao.a(11092));
        yl0.e(byteString2, C0059ao.a(11093));
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i);
    }

    public static final ByteString commonOf(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(11096));
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        yl0.d(copyOf, C0059ao.a(11097));
        return new ByteString(copyOf);
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, ByteString byteString2, int i2, int i3) {
        yl0.e(byteString, C0059ao.a(11098));
        yl0.e(byteString2, C0059ao.a(11099));
        return byteString2.rangeEquals(i2, byteString.getData$okio(), i, i3);
    }

    public static final ByteString commonSegmentDigest(SegmentedByteString segmentedByteString, String str) {
        yl0.e(segmentedByteString, C0059ao.a(11102));
        yl0.e(str, C0059ao.a(11103));
        HashFunction newHashFunction = HashFunctionKt.newHashFunction(str);
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = segmentedByteString.getDirectory$okio()[length + i];
            int i4 = segmentedByteString.getDirectory$okio()[i];
            newHashFunction.update(segmentedByteString.getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new ByteString(newHashFunction.digest());
    }

    public static final boolean commonStartsWith(ByteString byteString, ByteString byteString2) {
        yl0.e(byteString, C0059ao.a(11104));
        yl0.e(byteString2, C0059ao.a(11105));
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static final ByteString commonSubstring(ByteString byteString, int i, int i2) {
        yl0.e(byteString, C0059ao.a(11108));
        if (i >= 0) {
            if (i2 <= byteString.getData$okio().length) {
                if (i2 - i >= 0) {
                    return (i == 0 && i2 == byteString.getData$okio().length) ? byteString : new ByteString(wi0.e(byteString.getData$okio(), i, i2));
                }
                throw new IllegalArgumentException(C0059ao.a(11109).toString());
            }
            throw new IllegalArgumentException((C0059ao.a(11110) + byteString.getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException(C0059ao.a(11111).toString());
    }

    public static final ByteString commonToAsciiLowercase(ByteString byteString) {
        byte b;
        yl0.e(byteString, C0059ao.a(11112));
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b2 = byteString.getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                yl0.d(copyOf, C0059ao.a(11113));
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final ByteString commonToAsciiUppercase(ByteString byteString) {
        byte b;
        yl0.e(byteString, C0059ao.a(11114));
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b2 = byteString.getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                yl0.d(copyOf, C0059ao.a(11115));
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(11116));
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        yl0.d(copyOf, C0059ao.a(11117));
        return copyOf;
    }

    public static final ByteString commonToByteString(byte[] bArr, int i, int i2) {
        yl0.e(bArr, C0059ao.a(11118));
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new ByteString(wi0.e(bArr, i, i2 + i));
    }

    public static final String commonToString(ByteString byteString) {
        ByteString byteString2 = byteString;
        yl0.e(byteString2, C0059ao.a(11119));
        if (byteString.getData$okio().length == 0) {
            return C0059ao.a(11120);
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        String a = C0059ao.a(11121);
        String a2 = C0059ao.a(11122);
        if (codePointIndexToCharIndex == -1) {
            if (byteString.getData$okio().length <= 64) {
                return C0059ao.a(11123) + byteString.hex() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(byteString.getData$okio().length);
            sb.append(C0059ao.a(11124));
            if (64 <= byteString.getData$okio().length) {
                if (64 != byteString.getData$okio().length) {
                    byteString2 = new ByteString(wi0.e(byteString.getData$okio(), 0, 64));
                }
                sb.append(byteString2.hex());
                sb.append(a);
                return sb.toString();
            }
            throw new IllegalArgumentException((C0059ao.a(11125) + byteString.getData$okio().length + ')').toString());
        }
        String utf8 = byteString.utf8();
        Objects.requireNonNull(utf8, C0059ao.a(11126));
        String substring = utf8.substring(0, codePointIndexToCharIndex);
        yl0.d(substring, C0059ao.a(11127));
        String s = bo0.s(bo0.s(bo0.s(substring, C0059ao.a(11128), C0059ao.a(11129), false, 4, null), C0059ao.a(11130), C0059ao.a(11131), false, 4, null), C0059ao.a(11132), C0059ao.a(11133), false, 4, null);
        if (codePointIndexToCharIndex < utf8.length()) {
            return a2 + byteString.getData$okio().length + C0059ao.a(11134) + s + a;
        }
        return C0059ao.a(11135) + s + ']';
    }

    public static final String commonUtf8(ByteString byteString) {
        yl0.e(byteString, C0059ao.a(11136));
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = Platform.toUtf8String(byteString.internalArray$okio());
            byteString.setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public static final void commonWrite(ByteString byteString, Buffer buffer, int i, int i2) {
        yl0.e(byteString, C0059ao.a(11137));
        yl0.e(buffer, C0059ao.a(11138));
        buffer.write(byteString.getData$okio(), i, i2);
    }

    public static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException(C0059ao.a(11139) + c);
            }
        }
        return (c - c2) + 10;
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(ByteString byteString, byte[] bArr) {
        yl0.e(byteString, C0059ao.a(11082));
        yl0.e(bArr, C0059ao.a(11083));
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonLastIndexOf(ByteString byteString, byte[] bArr, int i) {
        yl0.e(byteString, C0059ao.a(11094));
        yl0.e(bArr, C0059ao.a(11095));
        for (int min = Math.min(i, byteString.getData$okio().length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(byteString.getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        yl0.e(byteString, C0059ao.a(11100));
        yl0.e(bArr, C0059ao.a(11101));
        return i >= 0 && i <= byteString.getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Util.arrayRangeEquals(byteString.getData$okio(), i, bArr, i2, i3);
    }

    public static final boolean commonStartsWith(ByteString byteString, byte[] bArr) {
        yl0.e(byteString, C0059ao.a(11106));
        yl0.e(bArr, C0059ao.a(11107));
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }
}
