package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: c40  reason: default package */
/* loaded from: classes.dex */
public final class c40 {
    public static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (f(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    public static String b(String str, e40 e40Var, x20 x20Var, x20 x20Var2) {
        int i = 0;
        z30[] z30VarArr = {new t30(), new v30(), new f40(), new g40(), new y30(), new u30()};
        a40 a40Var = new a40(str);
        a40Var.n(e40Var);
        a40Var.l(x20Var, x20Var2);
        boolean startsWith = str.startsWith(C0059ao.a(3));
        String a = C0059ao.a(4);
        if (startsWith && str.endsWith(a)) {
            a40Var.r((char) 236);
            a40Var.m(2);
            a40Var.f += 7;
        } else if (str.startsWith(C0059ao.a(5)) && str.endsWith(a)) {
            a40Var.r((char) 237);
            a40Var.m(2);
            a40Var.f += 7;
        }
        while (a40Var.i()) {
            z30VarArr[i].a(a40Var);
            if (a40Var.e() >= 0) {
                i = a40Var.e();
                a40Var.j();
            }
        }
        int a2 = a40Var.a();
        a40Var.p();
        int a3 = a40Var.g().a();
        if (a2 < a3 && i != 0 && i != 5 && i != 4) {
            a40Var.r((char) 254);
        }
        StringBuilder b = a40Var.b();
        if (b.length() < a3) {
            b.append((char) 129);
        }
        while (b.length() < a3) {
            b.append(o(b.length() + 1));
        }
        return a40Var.b().toString();
    }

    public static int c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil(fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static int d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    public static void e(char c) {
        String hexString;
        throw new IllegalArgumentException(C0059ao.a(7) + c + C0059ao.a(8) + (C0059ao.a(6).substring(0, 4 - hexString.length()) + Integer.toHexString(c)) + ')');
    }

    public static boolean f(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean g(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean h(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'A' && c <= 'Z';
            }
            return true;
        }
        return true;
    }

    public static boolean i(char c) {
        return c >= ' ' && c <= '^';
    }

    public static boolean j(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'a' && c <= 'z';
            }
            return true;
        }
        return true;
    }

    public static boolean k(char c) {
        if (m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static boolean l(char c) {
        return false;
    }

    public static boolean m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    public static int n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int c2 = c(fArr, iArr, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                int d = d(bArr);
                if (iArr[0] == c2) {
                    return 0;
                }
                if (d != 1 || bArr[5] <= 0) {
                    if (d != 1 || bArr[4] <= 0) {
                        if (d != 1 || bArr[2] <= 0) {
                            return (d != 1 || bArr[3] <= 0) ? 1 : 3;
                        }
                        return 2;
                    }
                    return 4;
                }
                return 5;
            }
            char charAt = charSequence.charAt(i4);
            i3++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                c(fArr, iArr2, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr2);
                int d2 = d(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (d2 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (d2 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (d2 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i5 = i + i3 + 1; i5 < charSequence.length(); i5++) {
                            char charAt2 = charSequence.charAt(i5);
                            if (m(charAt2)) {
                                return 3;
                            }
                            if (!k(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    public static char o(int i) {
        int i2 = ((i * 149) % 253) + 1 + 129;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
