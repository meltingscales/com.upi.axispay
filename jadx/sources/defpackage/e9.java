package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: e9  reason: default package */
/* loaded from: classes.dex */
public final class e9 {
    public static final e9 e = new e9(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public e9(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static e9 a(e9 e9Var, e9 e9Var2) {
        return b(Math.max(e9Var.a, e9Var2.a), Math.max(e9Var.b, e9Var2.b), Math.max(e9Var.c, e9Var2.c), Math.max(e9Var.d, e9Var2.d));
    }

    public static e9 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new e9(i, i2, i3, i4);
    }

    public static e9 c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static e9 d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e9.class != obj.getClass()) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return this.d == e9Var.d && this.a == e9Var.a && this.c == e9Var.c && this.b == e9Var.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return C0059ao.a(3531) + this.a + C0059ao.a(3532) + this.b + C0059ao.a(3533) + this.c + C0059ao.a(3534) + this.d + '}';
    }
}
