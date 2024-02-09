package defpackage;

import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: o40  reason: default package */
/* loaded from: classes.dex */
public class o40 extends u40 {
    public static int h(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    public static int i(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += C0059ao.a(15086).indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    public static String j(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append(C0059ao.a(15087));
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) ((charAt + 'A') - 1));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) ((charAt + 'A') - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) ((charAt + 'A') - 33));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append(C0059ao.a(15088));
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) ((charAt + 'F') - 59));
            } else if (charAt == '@') {
                sb.append(C0059ao.a(15089));
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) ((charAt + 'K') - 91));
            } else if (charAt == '`') {
                sb.append(C0059ao.a(15090));
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) ((charAt + 'A') - 97));
            } else if (charAt <= 127) {
                sb.append('b');
                sb.append((char) ((charAt + 'P') - 123));
            } else {
                throw new IllegalArgumentException(C0059ao.a(15091) + charAt + C0059ao.a(15092));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.u40
    public boolean[] d(String str) {
        String j = j(str);
        int length = j.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[((j.length() + 2 + 2) * 9) + 1];
            int i = 0;
            int h = h(zArr, 0, n40.b);
            while (true) {
                String a = C0059ao.a(15093);
                if (i < length) {
                    h += h(zArr, h, n40.a[a.indexOf(j.charAt(i))]);
                    i++;
                } else {
                    int i2 = i(j, 20);
                    int[] iArr = n40.a;
                    int h2 = h + h(zArr, h, iArr[i2]);
                    int h3 = h2 + h(zArr, h2, iArr[i(j + a.charAt(i2), 15)]);
                    zArr[h3 + h(zArr, h3, n40.b)] = true;
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException(C0059ao.a(15094).concat(String.valueOf(length)));
        }
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.CODE_93);
    }
}
