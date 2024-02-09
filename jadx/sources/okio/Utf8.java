package okio;

import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 0;
    public static final int LOG_SURROGATE_HEADER = 0;
    public static final int MASK_2BYTES = 0;
    public static final int MASK_3BYTES = 0;
    public static final int MASK_4BYTES = 0;
    public static final byte REPLACEMENT_BYTE = 0;
    public static final char REPLACEMENT_CHARACTER = 0;
    public static final int REPLACEMENT_CODE_POINT = 0;

    static {
        C0059ao.a(Utf8.class, 21);
    }

    public static final boolean isIsoControl(int i) {
        return (i >= 0 && 31 >= i) || (127 <= i && 159 >= i);
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i, int i2, dl0<? super Integer, pi0> dl0Var) {
        yl0.e(bArr, C0059ao.a(5721));
        yl0.e(dl0Var, C0059ao.a(5722));
        int i3 = i + 1;
        if (i2 <= i3) {
            dl0Var.invoke(65533);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if (!((b2 & 192) == 128)) {
            dl0Var.invoke(65533);
            return 1;
        }
        int i4 = (b2 ^ 3968) ^ (b << 6);
        if (i4 < 128) {
            dl0Var.invoke(65533);
            return 2;
        }
        dl0Var.invoke(Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i, int i2, dl0<? super Integer, pi0> dl0Var) {
        yl0.e(bArr, C0059ao.a(5723));
        yl0.e(dl0Var, C0059ao.a(5724));
        int i3 = i + 2;
        if (i2 <= i3) {
            dl0Var.invoke(65533);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            dl0Var.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i3];
        if (!((b3 & 192) == 128)) {
            dl0Var.invoke(65533);
            return 2;
        }
        int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << 12);
        if (i5 < 2048) {
            dl0Var.invoke(65533);
            return 3;
        } else if (55296 <= i5 && 57343 >= i5) {
            dl0Var.invoke(65533);
            return 3;
        } else {
            dl0Var.invoke(Integer.valueOf(i5));
            return 3;
        }
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i, int i2, dl0<? super Integer, pi0> dl0Var) {
        yl0.e(bArr, C0059ao.a(5725));
        yl0.e(dl0Var, C0059ao.a(5726));
        int i3 = i + 3;
        if (i2 <= i3) {
            dl0Var.invoke(65533);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            dl0Var.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if (!((b3 & 192) == 128)) {
            dl0Var.invoke(65533);
            return 2;
        }
        byte b4 = bArr[i3];
        if (!((b4 & 192) == 128)) {
            dl0Var.invoke(65533);
            return 3;
        }
        int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
        if (i6 > 1114111) {
            dl0Var.invoke(65533);
            return 4;
        } else if (55296 <= i6 && 57343 >= i6) {
            dl0Var.invoke(65533);
            return 4;
        } else if (i6 < 65536) {
            dl0Var.invoke(65533);
            return 4;
        } else {
            dl0Var.invoke(Integer.valueOf(i6));
            return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0123, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf16Chars(byte[] r16, int r17, int r18, defpackage.dl0<? super java.lang.Character, defpackage.pi0> r19) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, dl0):void");
    }

    public static final void processUtf8Bytes(String str, int i, int i2, dl0<? super Byte, pi0> dl0Var) {
        int i3;
        char charAt;
        yl0.e(str, C0059ao.a(5729));
        yl0.e(dl0Var, C0059ao.a(5730));
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (yl0.g(charAt2, Barcode.ITF) < 0) {
                dl0Var.invoke(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && yl0.g(str.charAt(i), Barcode.ITF) < 0) {
                    dl0Var.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (yl0.g(charAt2, Barcode.PDF417) < 0) {
                    dl0Var.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    dl0Var.invoke(Byte.valueOf((byte) ((charAt2 & '?') | Barcode.ITF)));
                } else if (55296 <= charAt2 && 57343 >= charAt2) {
                    if (yl0.g(charAt2, 56319) <= 0 && i2 > (i3 = i + 1) && 56320 <= (charAt = str.charAt(i3)) && 57343 >= charAt) {
                        int charAt3 = ((charAt2 << '\n') + str.charAt(i3)) - 56613888;
                        dl0Var.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                        dl0Var.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | Barcode.ITF)));
                        dl0Var.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | Barcode.ITF)));
                        dl0Var.invoke(Byte.valueOf((byte) ((charAt3 & 63) | Barcode.ITF)));
                        i += 2;
                    } else {
                        dl0Var.invoke((byte) 63);
                    }
                } else {
                    dl0Var.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    dl0Var.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | Barcode.ITF)));
                    dl0Var.invoke(Byte.valueOf((byte) ((charAt2 & '?') | Barcode.ITF)));
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0121, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf8CodePoints(byte[] r16, int r17, int r18, defpackage.dl0<? super java.lang.Integer, defpackage.pi0> r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, dl0):void");
    }

    public static final long size(String str) {
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(String str, int i) {
        return size$default(str, i, 0, 2, null);
    }

    public static final long size(String str, int i, int i2) {
        int i3;
        yl0.e(str, C0059ao.a(5733));
        if (!(i >= 0)) {
            throw new IllegalArgumentException((C0059ao.a(5738) + i).toString());
        }
        if (i2 >= i) {
            if (!(i2 <= str.length())) {
                throw new IllegalArgumentException((C0059ao.a(5734) + i2 + C0059ao.a(5735) + str.length()).toString());
            }
            long j = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    j++;
                } else {
                    if (charAt < 2048) {
                        i3 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i3 = 3;
                    } else {
                        int i4 = i + 1;
                        char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j++;
                            i = i4;
                        } else {
                            j += 4;
                            i += 2;
                        }
                    }
                    j += i3;
                }
                i++;
            }
            return j;
        }
        throw new IllegalArgumentException((C0059ao.a(5736) + i2 + C0059ao.a(5737) + i).toString());
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }
}
