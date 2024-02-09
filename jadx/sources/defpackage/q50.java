package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q50  reason: default package */
/* loaded from: classes.dex */
public final class q50 {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, Barcode.ITF, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(m30 m30Var, j50 j50Var, l50 l50Var, int i, n50 n50Var) throws d30 {
        c(n50Var);
        d(l50Var, n50Var);
        l(j50Var, i, n50Var);
        s(l50Var, n50Var);
        f(m30Var, i, n50Var);
    }

    public static int b(int i, int i2) {
        if (i2 != 0) {
            int n = n(i2);
            int i3 = i << (n - 1);
            while (n(i3) >= n) {
                i3 ^= i2 << (n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException(C0059ao.a(8450));
    }

    public static void c(n50 n50Var) {
        n50Var.a((byte) -1);
    }

    public static void d(l50 l50Var, n50 n50Var) throws d30 {
        j(n50Var);
        e(n50Var);
        r(l50Var, n50Var);
        k(n50Var);
    }

    public static void e(n50 n50Var) throws d30 {
        if (n50Var.b(8, n50Var.d() - 8) != 0) {
            n50Var.f(8, n50Var.d() - 8, 1);
            return;
        }
        throw new d30();
    }

    public static void f(m30 m30Var, int i, n50 n50Var) throws d30 {
        boolean z;
        int e = n50Var.e() - 1;
        int d2 = n50Var.d() - 1;
        int i2 = -1;
        int i3 = 0;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d2 >= 0 && d2 < n50Var.d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (o(n50Var.b(i5, d2))) {
                        if (i3 < m30Var.g()) {
                            z = m30Var.f(i3);
                            i3++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && p50.f(i, i5, d2)) {
                            z = !z;
                        }
                        n50Var.g(i5, d2, z);
                    }
                }
                d2 += i2;
            }
            i2 = -i2;
            d2 += i2;
            e -= 2;
        }
        if (i3 == m30Var.g()) {
            return;
        }
        throw new d30(C0059ao.a(8451) + i3 + '/' + m30Var.g());
    }

    public static void g(int i, int i2, n50 n50Var) throws d30 {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (o(n50Var.b(i4, i2))) {
                n50Var.f(i4, i2, 0);
            } else {
                throw new d30();
            }
        }
    }

    public static void h(int i, int i2, n50 n50Var) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                n50Var.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void i(int i, int i2, n50 n50Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                n50Var.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void j(n50 n50Var) throws d30 {
        int length = a[0].length;
        i(0, 0, n50Var);
        i(n50Var.e() - length, 0, n50Var);
        i(0, n50Var.e() - length, n50Var);
        g(0, 7, n50Var);
        g(n50Var.e() - 8, 7, n50Var);
        g(0, n50Var.e() - 8, n50Var);
        m(7, 0, n50Var);
        m((n50Var.d() - 7) - 1, 0, n50Var);
        m(7, n50Var.d() - 7, n50Var);
    }

    public static void k(n50 n50Var) {
        int i = 8;
        while (i < n50Var.e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (o(n50Var.b(i, 6))) {
                n50Var.f(i, 6, i3);
            }
            if (o(n50Var.b(6, i))) {
                n50Var.f(6, i, i3);
            }
            i = i2;
        }
    }

    public static void l(j50 j50Var, int i, n50 n50Var) throws d30 {
        int d2;
        m30 m30Var = new m30();
        p(j50Var, i, m30Var);
        for (int i2 = 0; i2 < m30Var.g(); i2++) {
            boolean f = m30Var.f((m30Var.g() - 1) - i2);
            int[] iArr = d[i2];
            n50Var.g(iArr[0], iArr[1], f);
            int i3 = 8;
            if (i2 < 8) {
                d2 = 8;
                i3 = (n50Var.e() - i2) - 1;
            } else {
                d2 = (n50Var.d() - 7) + (i2 - 8);
            }
            n50Var.g(i3, d2, f);
        }
    }

    public static void m(int i, int i2, n50 n50Var) throws d30 {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (o(n50Var.b(i, i4))) {
                n50Var.f(i, i4, 0);
            } else {
                throw new d30();
            }
        }
    }

    public static int n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    public static boolean o(int i) {
        return i == -1;
    }

    public static void p(j50 j50Var, int i, m30 m30Var) throws d30 {
        if (r50.b(i)) {
            int a2 = (j50Var.a() << 3) | i;
            m30Var.c(a2, 5);
            m30Var.c(b(a2, 1335), 10);
            m30 m30Var2 = new m30();
            m30Var2.c(21522, 15);
            m30Var.k(m30Var2);
            if (m30Var.g() == 15) {
                return;
            }
            throw new d30(C0059ao.a(8452) + m30Var.g());
        }
        throw new d30(C0059ao.a(8453));
    }

    public static void q(l50 l50Var, m30 m30Var) throws d30 {
        m30Var.c(l50Var.f(), 6);
        m30Var.c(b(l50Var.f(), 7973), 12);
        if (m30Var.g() == 18) {
            return;
        }
        throw new d30(C0059ao.a(8454) + m30Var.g());
    }

    public static void r(l50 l50Var, n50 n50Var) {
        if (l50Var.f() < 2) {
            return;
        }
        int[] iArr = c[l50Var.f() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && o(n50Var.b(i2, i))) {
                        h(i2 - 2, i - 2, n50Var);
                    }
                }
            }
        }
    }

    public static void s(l50 l50Var, n50 n50Var) throws d30 {
        if (l50Var.f() < 7) {
            return;
        }
        m30 m30Var = new m30();
        q(l50Var, m30Var);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean f = m30Var.f(i);
                i--;
                n50Var.g(i2, (n50Var.d() - 11) + i3, f);
                n50Var.g((n50Var.d() - 11) + i3, i2, f);
            }
        }
    }
}
