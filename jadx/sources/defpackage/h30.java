package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: h30  reason: default package */
/* loaded from: classes.dex */
public final class h30 {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(m30 m30Var, int i, int i2) {
        int[] iArr = new int[i2];
        int g = m30Var.g() / i;
        for (int i3 = 0; i3 < g; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= m30Var.f((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    public static void b(n30 n30Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    n30Var.g(i5, i4);
                    n30Var.g(i5, i6);
                    n30Var.g(i4, i5);
                    n30Var.g(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        n30Var.g(i7, i7);
        int i8 = i7 + 1;
        n30Var.g(i8, i7);
        n30Var.g(i7, i8);
        int i9 = i + i2;
        n30Var.g(i9, i7);
        n30Var.g(i9, i8);
        n30Var.g(i9, i9 - 1);
    }

    public static void c(n30 n30Var, boolean z, int i, m30 m30Var) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (m30Var.f(i3)) {
                    n30Var.g(i4, i2 - 5);
                }
                if (m30Var.f(i3 + 7)) {
                    n30Var.g(i2 + 5, i4);
                }
                if (m30Var.f(20 - i3)) {
                    n30Var.g(i4, i2 + 5);
                }
                if (m30Var.f(27 - i3)) {
                    n30Var.g(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (m30Var.f(i3)) {
                n30Var.g(i5, i2 - 7);
            }
            if (m30Var.f(i3 + 10)) {
                n30Var.g(i2 + 7, i5);
            }
            if (m30Var.f(29 - i3)) {
                n30Var.g(i5, i2 + 7);
            }
            if (m30Var.f(39 - i3)) {
                n30Var.g(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f30 d(byte[] bArr, int i, int i2) {
        m30 m30Var;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        m30 a2 = new i30(bArr).a();
        int g = ((a2.g() * i) / 100) + 11;
        int g2 = a2.g() + g;
        int i8 = 0;
        int i9 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (i4 <= (z ? 4 : 32)) {
                i5 = i(i4, z);
                i3 = a[i4];
                int i10 = i5 - (i5 % i3);
                m30Var = h(a2, i3);
                int g3 = m30Var.g() + g;
                String a3 = C0059ao.a(445);
                if (g3 <= i10) {
                    if (z && m30Var.g() > (i3 << 6)) {
                        throw new IllegalArgumentException(a3);
                    }
                } else {
                    throw new IllegalArgumentException(a3);
                }
            } else {
                throw new IllegalArgumentException(String.format(C0059ao.a(446), Integer.valueOf(i2)));
            }
        } else {
            m30 m30Var2 = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 <= 32) {
                boolean z2 = i11 <= 3 ? i9 : i8;
                int i13 = z2 ? i11 + 1 : i11;
                int i14 = i(i13, z2);
                if (g2 <= i14) {
                    if (m30Var2 == null || i12 != a[i13]) {
                        int i15 = a[i13];
                        i12 = i15;
                        m30Var2 = h(a2, i15);
                    }
                    int i16 = i14 - (i14 % i12);
                    if ((!z2 || m30Var2.g() <= (i12 << 6)) && m30Var2.g() + g <= i16) {
                        m30Var = m30Var2;
                        i3 = i12;
                        z = z2;
                        i4 = i13;
                        i5 = i14;
                        i8 = i8;
                    }
                }
                i11++;
                i9 = i9;
                i8 = 0;
            }
            throw new IllegalArgumentException(C0059ao.a(447));
        }
        m30 e = e(m30Var, i5, i3);
        int g4 = m30Var.g() / i3;
        m30 f = f(z, i4, g4);
        int i17 = (z ? 11 : 14) + (i4 << 2);
        int[] iArr = new int[i17];
        int i18 = 2;
        if (z) {
            for (int i19 = i8; i19 < i17; i19++) {
                iArr[i19] = i19;
            }
            i6 = i17;
        } else {
            int i20 = i17 / 2;
            i6 = i17 + 1 + (((i20 - 1) / 15) * 2);
            int i21 = i6 / 2;
            for (int i22 = i8; i22 < i20; i22++) {
                iArr[(i20 - i22) - i9] = (i21 - i7) - 1;
                iArr[i20 + i22] = (i22 / 15) + i22 + i21 + i9;
            }
        }
        n30 n30Var = new n30(i6);
        int i23 = i8;
        int i24 = i23;
        while (i23 < i4) {
            int i25 = ((i4 - i23) << i18) + (z ? 9 : 12);
            int i26 = i8;
            while (i26 < i25) {
                int i27 = i26 << 1;
                while (i8 < i18) {
                    if (e.f(i24 + i27 + i8)) {
                        int i28 = i23 << 1;
                        n30Var.g(iArr[i28 + i8], iArr[i28 + i26]);
                    }
                    if (e.f((i25 << 1) + i24 + i27 + i8)) {
                        int i29 = i23 << 1;
                        n30Var.g(iArr[i29 + i26], iArr[((i17 - 1) - i29) - i8]);
                    }
                    if (e.f((i25 << 2) + i24 + i27 + i8)) {
                        int i30 = (i17 - 1) - (i23 << 1);
                        n30Var.g(iArr[i30 - i8], iArr[i30 - i26]);
                    }
                    if (e.f((i25 * 6) + i24 + i27 + i8)) {
                        int i31 = i23 << 1;
                        n30Var.g(iArr[((i17 - 1) - i31) - i26], iArr[i31 + i8]);
                    }
                    i8++;
                    i18 = 2;
                }
                i26++;
                i8 = 0;
                i18 = 2;
            }
            i24 += i25 << 3;
            i23++;
            i8 = 0;
            i18 = 2;
        }
        c(n30Var, z, i6, f);
        if (z) {
            b(n30Var, i6 / 2, 5);
        } else {
            int i32 = i6 / 2;
            b(n30Var, i32, 7);
            int i33 = 0;
            int i34 = 0;
            while (i34 < (i17 / 2) - 1) {
                for (int i35 = i32 & 1; i35 < i6; i35 += 2) {
                    int i36 = i32 - i33;
                    n30Var.g(i36, i35);
                    int i37 = i32 + i33;
                    n30Var.g(i37, i35);
                    n30Var.g(i35, i36);
                    n30Var.g(i35, i37);
                }
                i34 += 15;
                i33 += 16;
            }
        }
        f30 f30Var = new f30();
        f30Var.c(z);
        f30Var.f(i6);
        f30Var.d(i4);
        f30Var.b(g4);
        f30Var.e(n30Var);
        return f30Var;
    }

    public static m30 e(m30 m30Var, int i, int i2) {
        r30 r30Var = new r30(g(i2));
        int i3 = i / i2;
        int[] a2 = a(m30Var, i2, i3);
        r30Var.b(a2, i3 - (m30Var.g() / i2));
        m30 m30Var2 = new m30();
        m30Var2.c(0, i % i2);
        for (int i4 : a2) {
            m30Var2.c(i4, i2);
        }
        return m30Var2;
    }

    public static m30 f(boolean z, int i, int i2) {
        m30 m30Var = new m30();
        if (z) {
            m30Var.c(i - 1, 2);
            m30Var.c(i2 - 1, 6);
            return e(m30Var, 28, 4);
        }
        m30Var.c(i - 1, 5);
        m30Var.c(i2 - 1, 11);
        return e(m30Var, 40, 4);
    }

    public static p30 g(int i) {
        if (i != 4) {
            if (i != 6) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 12) {
                            return p30.g;
                        }
                        throw new IllegalArgumentException(C0059ao.a(448).concat(String.valueOf(i)));
                    }
                    return p30.h;
                }
                return p30.l;
            }
            return p30.i;
        }
        return p30.j;
    }

    public static m30 h(m30 m30Var, int i) {
        m30 m30Var2 = new m30();
        int g = m30Var.g();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < g) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= g || m30Var.f(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                m30Var2.c(i7, i);
            } else if (i7 == 0) {
                m30Var2.c(i4 | 1, i);
            } else {
                m30Var2.c(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return m30Var2;
    }

    public static int i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
