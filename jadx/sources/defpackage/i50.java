package defpackage;

import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i50  reason: default package */
/* loaded from: classes.dex */
public final class i50 implements c30 {
    public static n30 b(r50 r50Var, int i, int i2, int i3) {
        n50 a = r50Var.a();
        if (a != null) {
            int e = a.e();
            int d = a.d();
            int i4 = i3 << 1;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            n30 n30Var = new n30(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < e) {
                    if (a.b(i10, i9) == 1) {
                        n30Var.h(i11, i8, min, min);
                    }
                    i10++;
                    i11 += min;
                }
                i9++;
                i8 += min;
            }
            return n30Var;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.c30
    public n30 a(String str, w20 w20Var, int i, int i2, Map<y20, ?> map) throws d30 {
        if (!str.isEmpty()) {
            if (w20Var != w20.QR_CODE) {
                throw new IllegalArgumentException(C0059ao.a(1219).concat(String.valueOf(w20Var)));
            } else if (i >= 0 && i2 >= 0) {
                j50 j50Var = j50.L;
                int i3 = 4;
                if (map != null) {
                    y20 y20Var = y20.ERROR_CORRECTION;
                    if (map.containsKey(y20Var)) {
                        j50Var = j50.valueOf(map.get(y20Var).toString());
                    }
                    y20 y20Var2 = y20.MARGIN;
                    if (map.containsKey(y20Var2)) {
                        i3 = Integer.parseInt(map.get(y20Var2).toString());
                    }
                }
                return b(o50.n(str, j50Var, map), i, i2, i3);
            } else {
                throw new IllegalArgumentException(C0059ao.a(1218) + i + 'x' + i2);
            }
        }
        throw new IllegalArgumentException(C0059ao.a(1220));
    }
}
