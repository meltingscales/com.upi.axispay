package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mk0  reason: default package */
/* loaded from: classes.dex */
public final class mk0 {
    public static final int a(int i, int i2, int i3) {
        return c(c(i, i3) - c(i2, i3), i3);
    }

    public static final int b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException(C0059ao.a(6313));
        }
    }

    public static final int c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
