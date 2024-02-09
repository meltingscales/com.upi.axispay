package defpackage;

import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s30  reason: default package */
/* loaded from: classes.dex */
public final class s30 implements c30 {
    public static n30 b(n50 n50Var, int i, int i2) {
        n30 n30Var;
        int e = n50Var.e();
        int d = n50Var.d();
        int max = Math.max(i, e);
        int max2 = Math.max(i2, d);
        int min = Math.min(max / e, max2 / d);
        int i3 = (max - (e * min)) / 2;
        int i4 = (max2 - (d * min)) / 2;
        if (i2 >= d && i >= e) {
            n30Var = new n30(i, i2);
        } else {
            n30Var = new n30(e, d);
            i3 = 0;
            i4 = 0;
        }
        n30Var.b();
        int i5 = 0;
        while (i5 < d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e) {
                if (n50Var.b(i7, i5) == 1) {
                    n30Var.h(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return n30Var;
    }

    public static n30 c(x30 x30Var, d40 d40Var, int i, int i2) {
        int h = d40Var.h();
        int g = d40Var.g();
        n50 n50Var = new n50(d40Var.j(), d40Var.i());
        int i3 = 0;
        for (int i4 = 0; i4 < g; i4++) {
            if (i4 % d40Var.e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < d40Var.j(); i6++) {
                    n50Var.g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < h; i8++) {
                if (i8 % d40Var.d == 0) {
                    n50Var.g(i7, i3, true);
                    i7++;
                }
                n50Var.g(i7, i3, x30Var.e(i8, i4));
                i7++;
                int i9 = d40Var.d;
                if (i8 % i9 == i9 - 1) {
                    n50Var.g(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = d40Var.e;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < d40Var.j(); i12++) {
                    n50Var.g(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return b(n50Var, i, i2);
    }

    @Override // defpackage.c30
    public n30 a(String str, w20 w20Var, int i, int i2, Map<y20, ?> map) {
        x20 x20Var;
        if (!str.isEmpty()) {
            if (w20Var != w20.DATA_MATRIX) {
                throw new IllegalArgumentException(C0059ao.a(425).concat(String.valueOf(w20Var)));
            } else if (i >= 0 && i2 >= 0) {
                e40 e40Var = e40.FORCE_NONE;
                x20 x20Var2 = null;
                if (map != null) {
                    e40 e40Var2 = (e40) map.get(y20.DATA_MATRIX_SHAPE);
                    if (e40Var2 != null) {
                        e40Var = e40Var2;
                    }
                    x20 x20Var3 = (x20) map.get(y20.MIN_SIZE);
                    if (x20Var3 == null) {
                        x20Var3 = null;
                    }
                    x20Var = (x20) map.get(y20.MAX_SIZE);
                    if (x20Var == null) {
                        x20Var = null;
                    }
                    x20Var2 = x20Var3;
                } else {
                    x20Var = null;
                }
                String b = c40.b(str, e40Var, x20Var2, x20Var);
                d40 l = d40.l(b.length(), e40Var, x20Var2, x20Var, true);
                x30 x30Var = new x30(b40.b(b, l), l.h(), l.g());
                x30Var.h();
                return c(x30Var, l, i, i2);
            } else {
                throw new IllegalArgumentException(C0059ao.a(424) + i + 'x' + i2);
            }
        }
        throw new IllegalArgumentException(C0059ao.a(426));
    }
}
