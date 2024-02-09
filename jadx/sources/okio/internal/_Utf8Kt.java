package okio.internal;

import com.google.android.gms.vision.barcode.Barcode;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i;
        int i2;
        char charAt;
        yl0.e(str, C0059ao.a(14130));
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (true) {
            String a = C0059ao.a(14131);
            if (i3 < length) {
                char charAt2 = str.charAt(i3);
                if (yl0.g(charAt2, Barcode.ITF) >= 0) {
                    int length2 = str.length();
                    int i4 = i3;
                    while (i3 < length2) {
                        char charAt3 = str.charAt(i3);
                        if (yl0.g(charAt3, Barcode.ITF) < 0) {
                            int i5 = i4 + 1;
                            bArr[i4] = (byte) charAt3;
                            i3++;
                            while (i3 < length2 && yl0.g(str.charAt(i3), Barcode.ITF) < 0) {
                                bArr[i5] = (byte) str.charAt(i3);
                                i3++;
                                i5++;
                            }
                            i4 = i5;
                        } else {
                            if (yl0.g(charAt3, Barcode.PDF417) < 0) {
                                int i6 = i4 + 1;
                                bArr[i4] = (byte) ((charAt3 >> 6) | 192);
                                i = i6 + 1;
                                bArr[i6] = (byte) ((charAt3 & '?') | Barcode.ITF);
                            } else if (55296 > charAt3 || 57343 < charAt3) {
                                int i7 = i4 + 1;
                                bArr[i4] = (byte) ((charAt3 >> '\f') | 224);
                                int i8 = i7 + 1;
                                bArr[i7] = (byte) (((charAt3 >> 6) & 63) | Barcode.ITF);
                                i = i8 + 1;
                                bArr[i8] = (byte) ((charAt3 & '?') | Barcode.ITF);
                            } else if (yl0.g(charAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (charAt = str.charAt(i2)) || 57343 < charAt) {
                                i = i4 + 1;
                                bArr[i4] = 63;
                            } else {
                                int charAt4 = ((charAt3 << '\n') + str.charAt(i2)) - 56613888;
                                int i9 = i4 + 1;
                                bArr[i4] = (byte) ((charAt4 >> 18) | 240);
                                int i10 = i9 + 1;
                                bArr[i9] = (byte) (((charAt4 >> 12) & 63) | Barcode.ITF);
                                int i11 = i10 + 1;
                                bArr[i10] = (byte) (((charAt4 >> 6) & 63) | Barcode.ITF);
                                i = i11 + 1;
                                bArr[i11] = (byte) ((charAt4 & 63) | Barcode.ITF);
                                i3 += 2;
                                i4 = i;
                            }
                            i3++;
                            i4 = i;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr, i4);
                    yl0.d(copyOf, a);
                    return copyOf;
                }
                bArr[i3] = (byte) charAt2;
                i3++;
            } else {
                byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
                yl0.d(copyOf2, a);
                return copyOf2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
        if (((r16[r5] & 192) == 128) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0123, code lost:
        if (((r16[r5] & 192) == 128) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String commonToUtf8String(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._Utf8Kt.commonToUtf8String(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i2);
    }
}
