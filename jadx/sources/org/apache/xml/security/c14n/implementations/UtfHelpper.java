package org.apache.xml.security.c14n.implementations;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class UtfHelpper {
    public static final void a(char c, OutputStream outputStream) {
        int i;
        char c2;
        if (c < 128) {
            outputStream.write(c);
        } else if ((c >= 55296 && c <= 56319) || (c >= 56320 && c <= 57343)) {
            outputStream.write(63);
        } else {
            if (c > 2047) {
                char c3 = (char) (c >>> '\f');
                outputStream.write(c3 > 0 ? 224 | (c3 & 15) : 224);
                i = 128;
                c2 = '?';
            } else {
                i = 192;
                c2 = 31;
            }
            char c4 = (char) (c >>> 6);
            if (c4 > 0) {
                i |= c2 & c4;
            }
            outputStream.write(i);
            outputStream.write((c & 63) | Barcode.ITF);
        }
    }

    public static final void a(String str, OutputStream outputStream) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int charAt = str.charAt(i2);
            if (charAt >= 128) {
                char c = '?';
                if ((charAt < 55296 || charAt > 56319) && (charAt < 56320 || charAt > 57343)) {
                    if (charAt > 2047) {
                        char c2 = (char) (charAt >>> 12);
                        outputStream.write(c2 > 0 ? 224 | (c2 & 15) : 224);
                        i = 128;
                    } else {
                        i = 192;
                        c = 31;
                    }
                    char c3 = (char) (charAt >>> 6);
                    if (c3 > 0) {
                        i |= c & c3;
                    }
                    outputStream.write(i);
                    charAt = (charAt & 63) | Barcode.ITF;
                } else {
                    outputStream.write(63);
                    i2 = i3;
                }
            }
            outputStream.write(charAt);
            i2 = i3;
        }
    }

    public static final void a(String str, OutputStream outputStream, Map map) {
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = a(str);
            map.put(str, bArr);
        }
        outputStream.write(bArr);
    }

    public static final byte[] a(String str) {
        int i;
        int i2;
        byte b;
        int length = str.length();
        byte[] bArr = new byte[length];
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                i = i4 + 1;
                bArr[i4] = (byte) charAt;
            } else {
                char c = '?';
                if ((charAt < 55296 || charAt > 56319) && (charAt < 56320 || charAt > 57343)) {
                    if (!z) {
                        byte[] bArr2 = new byte[length * 3];
                        System.arraycopy(bArr, 0, bArr2, 0, i4);
                        z = true;
                        bArr = bArr2;
                    }
                    if (charAt > 2047) {
                        char c2 = (char) (charAt >>> '\f');
                        byte b2 = c2 > 0 ? (byte) ((c2 & 15) | (-32)) : (byte) -32;
                        i2 = i4 + 1;
                        bArr[i4] = b2;
                        b = Byte.MIN_VALUE;
                    } else {
                        c = 31;
                        i2 = i4;
                        b = -64;
                    }
                    char c3 = (char) (charAt >>> 6);
                    if (c3 > 0) {
                        b = (byte) (b | (c & c3));
                    }
                    int i6 = i2 + 1;
                    bArr[i2] = b;
                    i4 = i6 + 1;
                    bArr[i6] = (byte) ((charAt & '?') | Barcode.ITF);
                    i3 = i5;
                } else {
                    i = i4 + 1;
                    bArr[i4] = 63;
                }
            }
            i3 = i5;
            i4 = i;
        }
        if (z) {
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 0, bArr3, 0, i4);
            return bArr3;
        }
        return bArr;
    }
}
