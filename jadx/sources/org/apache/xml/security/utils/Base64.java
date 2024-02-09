package org.apache.xml.security.utils;

import com.google.android.gms.common.api.Api;
import java.io.OutputStream;
import myunmn.C0059ao;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Base64 {
    private static final byte[] a = new byte[255];
    private static final char[] b = new char[64];

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 255; i4++) {
            a[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            a[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            a[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            a[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            b[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            b[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            b[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        char[] cArr = b;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    private Base64() {
    }

    public static final int a(String str, byte[] bArr) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte charAt = (byte) str.charAt(i2);
            if (!a(charAt)) {
                bArr[i] = charAt;
                i++;
            }
        }
        return i;
    }

    public static final String a(byte[] bArr, int i) {
        byte b2;
        int i2;
        int i3 = i;
        if (i3 < 4) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return C0059ao.a(8612);
        }
        int i4 = length % 24;
        int i5 = length / 24;
        int i6 = i4 != 0 ? i5 + 1 : i5;
        int i7 = (i6 - 1) / (i3 / 4);
        char[] cArr = new char[(i6 * 4) + i7];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < i7) {
            int i12 = 0;
            while (i12 < 19) {
                int i13 = i11 + 1;
                byte b3 = bArr[i11];
                int i14 = i13 + 1;
                byte b4 = bArr[i13];
                int i15 = i14 + 1;
                byte b5 = bArr[i14];
                byte b6 = (byte) (b4 & 15);
                byte b7 = (byte) (b3 & 3);
                int i16 = b3 & Byte.MIN_VALUE;
                int i17 = b3 >> 2;
                if (i16 != 0) {
                    i17 ^= 192;
                }
                byte b8 = (byte) i17;
                int i18 = b4 & Byte.MIN_VALUE;
                int i19 = b4 >> 4;
                if (i18 != 0) {
                    i19 ^= 240;
                }
                byte b9 = (byte) i19;
                int i20 = b5 >> 6;
                if ((b5 & Byte.MIN_VALUE) != 0) {
                    i20 ^= 252;
                }
                int i21 = i10 + 1;
                char[] cArr2 = b;
                cArr[i10] = cArr2[b8];
                int i22 = i21 + 1;
                cArr[i21] = cArr2[(b7 << 4) | b9];
                int i23 = i22 + 1;
                cArr[i22] = cArr2[((byte) i20) | (b6 << 2)];
                i10 = i23 + 1;
                cArr[i23] = cArr2[b5 & 63];
                i9++;
                i12++;
                i11 = i15;
            }
            cArr[i10] = '\n';
            i8++;
            i10++;
        }
        while (i9 < i5) {
            int i24 = i11 + 1;
            byte b10 = bArr[i11];
            int i25 = i24 + 1;
            byte b11 = bArr[i24];
            i11 = i25 + 1;
            byte b12 = bArr[i25];
            byte b13 = (byte) (b11 & 15);
            byte b14 = (byte) (b10 & 3);
            int i26 = b10 & Byte.MIN_VALUE;
            int i27 = b10 >> 2;
            if (i26 != 0) {
                i27 ^= 192;
            }
            byte b15 = (byte) i27;
            int i28 = b11 & Byte.MIN_VALUE;
            int i29 = b11 >> 4;
            if (i28 != 0) {
                i29 ^= 240;
            }
            byte b16 = (byte) i29;
            int i30 = (b12 & Byte.MIN_VALUE) == 0 ? b12 >> 6 : (b12 >> 6) ^ 252;
            int i31 = i10 + 1;
            char[] cArr3 = b;
            cArr[i10] = cArr3[b15];
            int i32 = i31 + 1;
            cArr[i31] = cArr3[b16 | (b14 << 4)];
            int i33 = i32 + 1;
            cArr[i32] = cArr3[(b13 << 2) | ((byte) i30)];
            i10 = i33 + 1;
            cArr[i33] = cArr3[b12 & 63];
            i9++;
        }
        if (i4 == 8) {
            byte b17 = bArr[i11];
            byte b18 = (byte) (b17 & 3);
            int i34 = b17 & Byte.MIN_VALUE;
            int i35 = b17 >> 2;
            if (i34 != 0) {
                i35 ^= 192;
            }
            int i36 = i10 + 1;
            char[] cArr4 = b;
            cArr[i10] = cArr4[(byte) i35];
            int i37 = i36 + 1;
            cArr[i36] = cArr4[b18 << 4];
            cArr[i37] = '=';
            cArr[i37 + 1] = '=';
        } else if (i4 == 16) {
            byte b19 = bArr[i11];
            byte b20 = bArr[i11 + 1];
            byte b21 = (byte) (b20 & 15);
            byte b22 = (byte) (b19 & 3);
            int i38 = b19 & Byte.MIN_VALUE;
            int i39 = b19 >> 2;
            if (i38 != 0) {
                i39 ^= 192;
            }
            byte b23 = (byte) i39;
            if ((b20 & Byte.MIN_VALUE) == 0) {
                b2 = 4;
                i2 = b20 >> 4;
            } else {
                b2 = 4;
                i2 = (b20 >> 4) ^ 240;
            }
            int i40 = i10 + 1;
            char[] cArr5 = b;
            cArr[i10] = cArr5[b23];
            int i41 = i40 + 1;
            cArr[i40] = cArr5[((byte) i2) | (b22 << b2)];
            cArr[i41] = cArr5[b21 << 2];
            cArr[i41 + 1] = '=';
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        r11 = r1[0];
        r2 = r1[1];
        r3 = r1[2];
        r1 = r1[3];
        r4 = org.apache.xml.security.utils.Base64.a;
        r11 = r4[r11];
        r2 = r4[r2];
        r7 = r4[r3];
        r8 = r4[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r7 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r8 != (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        r12.write((byte) ((r11 << 2) | (r2 >> 4)));
        r12.write((byte) (((r2 & 15) << 4) | ((r7 >> 2) & 15)));
        r11 = (r7 << 6) | r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
        r12.write((byte) r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
        if (b(r3) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (b(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
        if ((r2 & 15) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
        r11 = r11 << 2;
        r0 = r2 >> 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r11 = r11 | r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
        throw new org.apache.xml.security.exceptions.Base64DecodingException(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (b(r3) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (b(r1) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
        r1 = r4[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if ((r1 & 3) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
        r12.write((byte) ((r11 << 2) | (r2 >> 4)));
        r11 = (r2 & 15) << 4;
        r0 = (r1 >> 2) & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
        throw new org.apache.xml.security.exceptions.Base64DecodingException(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
        throw new org.apache.xml.security.exceptions.Base64DecodingException(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.io.InputStream r11, java.io.OutputStream r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.Base64.a(java.io.InputStream, java.io.OutputStream):void");
    }

    public static final void a(String str, OutputStream outputStream) {
        byte[] bArr = new byte[str.length()];
        a(bArr, outputStream, a(str, bArr));
    }

    public static final void a(byte[] bArr, OutputStream outputStream) {
        a(bArr, outputStream, -1);
    }

    public static final void a(byte[] bArr, OutputStream outputStream, int i) {
        String a2;
        int i2;
        if (i == -1) {
            i = c(bArr);
        }
        if (i % 4 != 0) {
            throw new Base64DecodingException(C0059ao.a(8615));
        }
        int i3 = i / 4;
        if (i3 == 0) {
            return;
        }
        int i4 = 0;
        int i5 = i3 - 1;
        while (true) {
            a2 = C0059ao.a(8614);
            if (i5 <= 0) {
                byte[] bArr2 = a;
                int i6 = i4 + 1;
                int i7 = bArr2[bArr[i4]];
                int i8 = i6 + 1;
                int i9 = bArr2[bArr[i6]];
                if (i7 == -1 || i9 == -1) {
                    throw new Base64DecodingException(a2);
                }
                int i10 = i8 + 1;
                byte b2 = bArr[i8];
                int i11 = bArr2[b2];
                byte b3 = bArr[i10];
                int i12 = bArr2[b3];
                if (i11 != -1 && i12 != -1) {
                    outputStream.write((byte) ((i7 << 2) | (i9 >> 4)));
                    outputStream.write((byte) (((i9 & 15) << 4) | ((i11 >> 2) & 15)));
                    i2 = i11 << 6;
                } else if (b(b2) && b(b3)) {
                    if ((i9 & 15) != 0) {
                        throw new Base64DecodingException(a2);
                    }
                    i2 = i7 << 2;
                    i12 = i9 >> 4;
                } else if (b(b2) || !b(b3)) {
                    throw new Base64DecodingException(a2);
                } else {
                    if ((i11 & 3) != 0) {
                        throw new Base64DecodingException(a2);
                    }
                    outputStream.write((byte) ((i7 << 2) | (i9 >> 4)));
                    i2 = (i9 & 15) << 4;
                    i12 = (i11 >> 2) & 15;
                }
                outputStream.write((byte) (i2 | i12));
                return;
            }
            byte[] bArr3 = a;
            int i13 = i4 + 1;
            byte b4 = bArr3[bArr[i4]];
            int i14 = i13 + 1;
            byte b5 = bArr3[bArr[i13]];
            int i15 = i14 + 1;
            byte b6 = bArr3[bArr[i14]];
            int i16 = i15 + 1;
            byte b7 = bArr3[bArr[i15]];
            if (b4 == -1 || b5 == -1 || b6 == -1 || b7 == -1) {
                break;
            }
            outputStream.write((byte) ((b4 << 2) | (b5 >> 4)));
            outputStream.write((byte) (((b5 & 15) << 4) | ((b6 >> 2) & 15)));
            outputStream.write((byte) ((b6 << 6) | b7));
            i5--;
            i4 = i16;
        }
        throw new Base64DecodingException(a2);
    }

    public static final boolean a(byte b2) {
        return b2 == 32 || b2 == 13 || b2 == 10 || b2 == 9;
    }

    public static final byte[] a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length()];
        return b(bArr, a(str, bArr));
    }

    public static final byte[] a(Element element) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 3) {
                stringBuffer.append(((Text) firstChild).getData());
            }
        }
        return a(stringBuffer.toString());
    }

    public static final byte[] a(byte[] bArr) {
        return b(bArr, -1);
    }

    public static final String b(byte[] bArr) {
        return a(bArr, XMLUtils.a() ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 76);
    }

    public static final boolean b(byte b2) {
        return b2 == 61;
    }

    public static final byte[] b(byte[] bArr, int i) {
        byte[] bArr2;
        if (i == -1) {
            i = c(bArr);
        }
        if (i % 4 == 0) {
            int i2 = i / 4;
            int i3 = 0;
            if (i2 == 0) {
                return new byte[0];
            }
            int i4 = i2 - 1;
            int i5 = i4 * 4;
            int i6 = i4 * 3;
            byte[] bArr3 = a;
            int i7 = i5 + 1;
            byte b2 = bArr3[bArr[i5]];
            int i8 = i7 + 1;
            byte b3 = bArr3[bArr[i7]];
            String a2 = C0059ao.a(8616);
            if (b2 == -1 || b3 == -1) {
                throw new Base64DecodingException(a2);
            }
            int i9 = i8 + 1;
            byte b4 = bArr[i8];
            byte b5 = bArr3[b4];
            byte b6 = bArr[i9];
            byte b7 = bArr3[b6];
            if (b5 != -1 && b7 != -1) {
                bArr2 = new byte[i6 + 3];
                int i10 = i6 + 1;
                bArr2[i6] = (byte) ((b2 << 2) | (b3 >> 4));
                bArr2[i10] = (byte) (((b3 & 15) << 4) | ((b5 >> 2) & 15));
                bArr2[i10 + 1] = (byte) ((b5 << 6) | b7);
            } else if (b(b4) && b(b6)) {
                if ((b3 & 15) != 0) {
                    throw new Base64DecodingException(a2);
                }
                bArr2 = new byte[i6 + 1];
                bArr2[i6] = (byte) ((b2 << 2) | (b3 >> 4));
            } else if (b(b4) || !b(b6)) {
                throw new Base64DecodingException(a2);
            } else {
                if ((b5 & 3) != 0) {
                    throw new Base64DecodingException(a2);
                }
                bArr2 = new byte[i6 + 2];
                bArr2[i6] = (byte) ((b2 << 2) | (b3 >> 4));
                bArr2[i6 + 1] = (byte) (((b3 & 15) << 4) | ((b5 >> 2) & 15));
            }
            int i11 = 0;
            while (i4 > 0) {
                byte[] bArr4 = a;
                int i12 = i3 + 1;
                byte b8 = bArr4[bArr[i3]];
                int i13 = i12 + 1;
                byte b9 = bArr4[bArr[i12]];
                int i14 = i13 + 1;
                byte b10 = bArr4[bArr[i13]];
                int i15 = i14 + 1;
                byte b11 = bArr4[bArr[i14]];
                if (b8 == -1 || b9 == -1 || b10 == -1 || b11 == -1) {
                    throw new Base64DecodingException(a2);
                }
                int i16 = i11 + 1;
                bArr2[i11] = (byte) ((b8 << 2) | (b9 >> 4));
                int i17 = i16 + 1;
                bArr2[i16] = (byte) (((b9 & 15) << 4) | ((b10 >> 2) & 15));
                i11 = i17 + 1;
                bArr2[i17] = (byte) (b11 | (b10 << 6));
                i4--;
                i3 = i15;
            }
            return bArr2;
        }
        throw new Base64DecodingException(C0059ao.a(8617));
    }

    public static final int c(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        for (byte b2 : bArr) {
            if (!a(b2)) {
                bArr[i] = b2;
                i++;
            }
        }
        return i;
    }
}
