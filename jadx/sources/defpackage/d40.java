package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d40  reason: default package */
/* loaded from: classes.dex */
public class d40 {
    public static d40[] i = {new d40(false, 3, 5, 8, 8, 1), new d40(false, 5, 7, 10, 10, 1), new d40(true, 5, 7, 16, 6, 1), new d40(false, 8, 10, 12, 12, 1), new d40(true, 10, 11, 14, 6, 2), new d40(false, 12, 12, 14, 14, 1), new d40(true, 16, 14, 24, 10, 1), new d40(false, 18, 14, 16, 16, 1), new d40(false, 22, 18, 18, 18, 1), new d40(true, 22, 18, 16, 10, 2), new d40(false, 30, 20, 20, 20, 1), new d40(true, 32, 24, 16, 14, 2), new d40(false, 36, 24, 22, 22, 1), new d40(false, 44, 28, 24, 24, 1), new d40(true, 49, 28, 22, 14, 2), new d40(false, 62, 36, 14, 14, 4), new d40(false, 86, 42, 16, 16, 4), new d40(false, 114, 48, 18, 18, 4), new d40(false, 144, 56, 20, 20, 4), new d40(false, 174, 68, 22, 22, 4), new d40(false, 204, 84, 24, 24, 4, 102, 42), new d40(false, 280, 112, 14, 14, 16, 140, 56), new d40(false, 368, 144, 16, 16, 16, 92, 36), new d40(false, 456, 192, 18, 18, 16, 114, 48), new d40(false, 576, 224, 20, 20, 16, 144, 56), new d40(false, 696, 272, 22, 22, 16, 174, 68), new d40(false, 816, 336, 24, 24, 16, 136, 56), new d40(false, 1050, 408, 18, 18, 36, 175, 68), new d40(false, 1304, 496, 20, 20, 36, 163, 62), new w30()};
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public d40(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    public static d40 l(int i2, e40 e40Var, x20 x20Var, x20 x20Var2, boolean z) {
        d40[] d40VarArr;
        for (d40 d40Var : i) {
            if (!(e40Var == e40.FORCE_SQUARE && d40Var.a) && ((e40Var != e40.FORCE_RECTANGLE || d40Var.a) && ((x20Var == null || (d40Var.j() >= x20Var.b() && d40Var.i() >= x20Var.a())) && ((x20Var2 == null || (d40Var.j() <= x20Var2.b() && d40Var.i() <= x20Var2.a())) && i2 <= d40Var.b)))) {
                return d40Var;
            }
        }
        if (z) {
            throw new IllegalArgumentException(C0059ao.a(15235).concat(String.valueOf(i2)));
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    public int b(int i2) {
        return this.g;
    }

    public final int c() {
        return this.c;
    }

    public final int d(int i2) {
        return this.h;
    }

    public final int e() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 != 16) {
                    if (i2 == 36) {
                        return 6;
                    }
                    throw new IllegalStateException(C0059ao.a(15236));
                }
                return 4;
            }
        }
        return i3;
    }

    public int f() {
        return this.b / this.g;
    }

    public final int g() {
        return k() * this.e;
    }

    public final int h() {
        return e() * this.d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final int k() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 != 4) {
            if (i2 != 16) {
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException(C0059ao.a(15237));
            }
            return 4;
        }
        return 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a ? C0059ao.a(15238) : C0059ao.a(15239));
        sb.append(C0059ao.a(15240));
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append(C0059ao.a(15241));
        sb.append(j());
        sb.append('x');
        sb.append(i());
        sb.append(C0059ao.a(15242));
        sb.append(h());
        sb.append('x');
        sb.append(g());
        sb.append(C0059ao.a(15243));
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }

    public d40(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }
}
