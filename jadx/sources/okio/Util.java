package okio;

import myunmn.C0059ao;
import okio.internal.ByteStringKt;

/* compiled from: AxisPay */
/* renamed from: okio.-Util  reason: invalid class name */
/* loaded from: classes2.dex */
public final class Util {
    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final long and(byte b, long j) {
        return b & j;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final boolean arrayRangeEquals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        yl0.e(bArr, C0059ao.a(9711));
        yl0.e(bArr2, C0059ao.a(9712));
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(C0059ao.a(9713) + j + C0059ao.a(9714) + j2 + C0059ao.a(9715) + j3);
        }
    }

    public static final int leftRotate(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static final long minOf(long j, int i) {
        return Math.min(j, i);
    }

    public static final int reverseBytes(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final short reverseBytes(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static final long rightRotate(long j, int i) {
        return (j << (64 - i)) | (j >>> i);
    }

    public static final int shl(byte b, int i) {
        return b << i;
    }

    public static final int shr(byte b, int i) {
        return b >> i;
    }

    public static final String toHexString(byte b) {
        return new String(new char[]{ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[b & 15]});
    }

    public static final long minOf(int i, long j) {
        return Math.min(i, j);
    }

    public static final String toHexString(int i) {
        if (i == 0) {
            return C0059ao.a(9716);
        }
        int i2 = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 28) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 24) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 20) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 16) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 12) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 8) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }

    public static final String toHexString(long j) {
        if (j == 0) {
            return C0059ao.a(9717);
        }
        int i = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 60) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 56) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 52) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 48) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 44) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 40) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 36) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 32) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 28) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 24) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 20) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 16) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 12) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 8) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 4) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) (j & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return new String(cArr, i, 16 - i);
    }
}
