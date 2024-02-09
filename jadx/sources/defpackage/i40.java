package defpackage;

import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i40  reason: default package */
/* loaded from: classes.dex */
public final class i40 extends u40 {
    public static final char[] b;
    public static final char[] c = {'T', 'N', '*', 'E'};
    public static final char[] d = {'/', ':', '+', '.'};
    public static final char e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        b = cArr;
        e = cArr[0];
    }

    @Override // defpackage.u40
    public boolean[] d(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = e;
            sb.append(c2);
            sb.append(str);
            sb.append(c2);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = b;
            boolean a = h40.a(cArr, upperCase);
            boolean a2 = h40.a(cArr, upperCase2);
            char[] cArr2 = c;
            boolean a3 = h40.a(cArr2, upperCase);
            boolean a4 = h40.a(cArr2, upperCase2);
            String a5 = C0059ao.a(14833);
            if (a) {
                if (!a2) {
                    throw new IllegalArgumentException(a5.concat(String.valueOf(str)));
                }
            } else if (a3) {
                if (!a4) {
                    throw new IllegalArgumentException(a5.concat(String.valueOf(str)));
                }
            } else if (!a2 && !a4) {
                StringBuilder sb2 = new StringBuilder();
                char c3 = e;
                sb2.append(c3);
                sb2.append(str);
                sb2.append(c3);
                str = sb2.toString();
            } else {
                throw new IllegalArgumentException(a5.concat(String.valueOf(str)));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (!h40.a(d, str.charAt(i3))) {
                throw new IllegalArgumentException(C0059ao.a(14834) + str.charAt(i3) + '\'');
            } else {
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = h40.a;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr3[i6]) {
                    i = h40.b[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.CODABAR);
    }
}
