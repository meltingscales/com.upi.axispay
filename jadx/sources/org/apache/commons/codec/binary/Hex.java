package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import myunmn.C0059ao;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Hex implements BinaryEncoder, BinaryDecoder {
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_CHARSET_NAME = null;
    private static final char[] DIGITS_LOWER;
    private static final char[] DIGITS_UPPER;
    private final Charset charset;

    static {
        C0059ao.a(Hex.class, 328);
        DEFAULT_CHARSET = StandardCharsets.UTF_8;
        DIGITS_LOWER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        DIGITS_UPPER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public Hex() {
        this.charset = DEFAULT_CHARSET;
    }

    public static byte[] decodeHex(char[] cArr) throws DecoderException {
        byte[] bArr = new byte[cArr.length >> 1];
        decodeHex(cArr, bArr, 0);
        return bArr;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    private static byte[] toByteArray(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            if (remaining == array.length) {
                byteBuffer.position(remaining);
                return array;
            }
        }
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static int toDigit(char c, int i) throws DecoderException {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException(C0059ao.a(3870) + c + C0059ao.a(3871) + i);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        return decodeHex(new String(bArr, getCharset()).toCharArray());
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeHexString(bArr).getBytes(getCharset());
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getCharsetName() {
        return this.charset.name();
    }

    public String toString() {
        return super.toString() + C0059ao.a(3872) + this.charset + C0059ao.a(3873);
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return encodeHex(bArr, z ? DIGITS_LOWER : DIGITS_UPPER);
    }

    public static String encodeHexString(byte[] bArr, boolean z) {
        return new String(encodeHex(bArr, z));
    }

    public byte[] decode(ByteBuffer byteBuffer) throws DecoderException {
        return decodeHex(new String(toByteArray(byteBuffer), getCharset()).toCharArray());
    }

    public byte[] encode(ByteBuffer byteBuffer) {
        return encodeHexString(byteBuffer).getBytes(getCharset());
    }

    public Hex(Charset charset) {
        this.charset = charset;
    }

    public static int decodeHex(char[] cArr, byte[] bArr, int i) throws DecoderException {
        int length = cArr.length;
        if ((length & 1) == 0) {
            int i2 = length >> 1;
            if (bArr.length - i >= i2) {
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    i3 = i4 + 1;
                    bArr[i] = (byte) (((toDigit(cArr[i3], i3) << 4) | toDigit(cArr[i4], i4)) & 255);
                    i++;
                }
                return i2;
            }
            throw new DecoderException(C0059ao.a(3868));
        }
        throw new DecoderException(C0059ao.a(3869));
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        encodeHex(bArr, 0, bArr.length, cArr, cArr2, 0);
        return cArr2;
    }

    public static String encodeHexString(ByteBuffer byteBuffer) {
        return new String(encodeHex(byteBuffer));
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof String) {
            return decode(((String) obj).toCharArray());
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof ByteBuffer) {
            return decode((ByteBuffer) obj);
        }
        try {
            return decodeHex((char[]) obj);
        } catch (ClassCastException e) {
            throw new DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        byte[] bArr;
        if (obj instanceof String) {
            bArr = ((String) obj).getBytes(getCharset());
        } else if (obj instanceof ByteBuffer) {
            bArr = toByteArray((ByteBuffer) obj);
        } else {
            try {
                bArr = (byte[]) obj;
            } catch (ClassCastException e) {
                throw new EncoderException(e.getMessage(), e);
            }
        }
        return encodeHex(bArr);
    }

    public static String encodeHexString(ByteBuffer byteBuffer, boolean z) {
        return new String(encodeHex(byteBuffer, z));
    }

    public Hex(String str) {
        this(Charset.forName(str));
    }

    public static char[] encodeHex(byte[] bArr, int i, int i2, boolean z) {
        char[] cArr = new char[i2 << 1];
        encodeHex(bArr, i, i2, z ? DIGITS_LOWER : DIGITS_UPPER, cArr, 0);
        return cArr;
    }

    public static void encodeHex(byte[] bArr, int i, int i2, boolean z, char[] cArr, int i3) {
        encodeHex(bArr, i, i2, z ? DIGITS_LOWER : DIGITS_UPPER, cArr, i3);
    }

    private static void encodeHex(byte[] bArr, int i, int i2, char[] cArr, char[] cArr2, int i3) {
        for (int i4 = i; i4 < i + i2; i4++) {
            int i5 = i3 + 1;
            cArr2[i3] = cArr[(bArr[i4] & 240) >>> 4];
            i3 = i5 + 1;
            cArr2[i5] = cArr[bArr[i4] & 15];
        }
    }

    public static byte[] decodeHex(String str) throws DecoderException {
        return decodeHex(str.toCharArray());
    }

    public static char[] encodeHex(ByteBuffer byteBuffer) {
        return encodeHex(byteBuffer, true);
    }

    public static char[] encodeHex(ByteBuffer byteBuffer, boolean z) {
        return encodeHex(byteBuffer, z ? DIGITS_LOWER : DIGITS_UPPER);
    }

    public static char[] encodeHex(ByteBuffer byteBuffer, char[] cArr) {
        return encodeHex(toByteArray(byteBuffer), cArr);
    }
}
