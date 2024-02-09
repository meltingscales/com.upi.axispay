package defpackage;

import defpackage.pm0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tm0  reason: default package */
/* loaded from: classes.dex */
public class tm0 extends sm0 {
    public static final int b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final int c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long d(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final int e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException(C0059ao.a(4039) + i3 + C0059ao.a(4040) + i2 + '.');
    }

    public static final pm0 f(int i, int i2) {
        return pm0.e.a(i, i2, -1);
    }

    public static final pm0 g(pm0 pm0Var, int i) {
        yl0.e(pm0Var, C0059ao.a(4041));
        sm0.a(i > 0, Integer.valueOf(i));
        pm0.a aVar = pm0.e;
        int a = pm0Var.a();
        int b = pm0Var.b();
        if (pm0Var.c() <= 0) {
            i = -i;
        }
        return aVar.a(a, b, i);
    }

    public static final rm0 h(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return rm0.f.a();
        }
        return new rm0(i, i2 - 1);
    }
}
