package defpackage;

import defpackage.e5;
import defpackage.z4;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: x4  reason: default package */
/* loaded from: classes.dex */
public class x4 implements z4.a {
    public boolean c;
    public a e;
    public e5 a = null;
    public float b = 0.0f;
    public ArrayList<e5> d = new ArrayList<>();
    public boolean f = false;

    /* compiled from: AxisPay */
    /* renamed from: x4$a */
    /* loaded from: classes.dex */
    public interface a {
        float a(int i);

        float b(e5 e5Var, boolean z);

        int c();

        void clear();

        float d(e5 e5Var);

        boolean e(e5 e5Var);

        float f(x4 x4Var, boolean z);

        void g(e5 e5Var, float f);

        e5 h(int i);

        void i(e5 e5Var, float f, boolean z);

        void j(float f);

        void k();
    }

    public x4() {
    }

    public void A(z4 z4Var, e5 e5Var, boolean z) {
        if (e5Var == null || !e5Var.h) {
            return;
        }
        this.b += e5Var.g * this.e.d(e5Var);
        this.e.b(e5Var, z);
        if (z) {
            e5Var.d(this);
        }
        if (z4.t && this.e.c() == 0) {
            this.f = true;
            z4Var.a = true;
        }
    }

    public void B(z4 z4Var, x4 x4Var, boolean z) {
        this.b += x4Var.b * this.e.f(x4Var, z);
        if (z) {
            x4Var.a.d(this);
        }
        if (z4.t && this.a != null && this.e.c() == 0) {
            this.f = true;
            z4Var.a = true;
        }
    }

    public void C(z4 z4Var, e5 e5Var, boolean z) {
        if (e5Var == null || !e5Var.o) {
            return;
        }
        float d = this.e.d(e5Var);
        this.b += e5Var.q * d;
        this.e.b(e5Var, z);
        if (z) {
            e5Var.d(this);
        }
        this.e.i(z4Var.n.d[e5Var.p], d, z);
        if (z4.t && this.e.c() == 0) {
            this.f = true;
            z4Var.a = true;
        }
    }

    public void D(z4 z4Var) {
        if (z4Var.g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int c = this.e.c();
            for (int i = 0; i < c; i++) {
                e5 h = this.e.h(i);
                if (h.e != -1 || h.h || h.o) {
                    this.d.add(h);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    e5 e5Var = this.d.get(i2);
                    if (e5Var.h) {
                        A(z4Var, e5Var, true);
                    } else if (e5Var.o) {
                        C(z4Var, e5Var, true);
                    } else {
                        B(z4Var, z4Var.g[e5Var.e], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (z4.t && this.a != null && this.e.c() == 0) {
            this.f = true;
            z4Var.a = true;
        }
    }

    @Override // defpackage.z4.a
    public e5 a(z4 z4Var, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // defpackage.z4.a
    public void b(e5 e5Var) {
        int i = e5Var.f;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.g(e5Var, f);
    }

    @Override // defpackage.z4.a
    public void c(z4.a aVar) {
        if (aVar instanceof x4) {
            x4 x4Var = (x4) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < x4Var.e.c(); i++) {
                this.e.i(x4Var.e.h(i), x4Var.e.a(i), true);
            }
        }
    }

    @Override // defpackage.z4.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public x4 d(z4 z4Var, int i) {
        this.e.g(z4Var.o(i, C0059ao.a(5101)), 1.0f);
        this.e.g(z4Var.o(i, C0059ao.a(5102)), -1.0f);
        return this;
    }

    public x4 e(e5 e5Var, int i) {
        this.e.g(e5Var, i);
        return this;
    }

    public boolean f(z4 z4Var) {
        boolean z;
        e5 g = g(z4Var);
        if (g == null) {
            z = true;
        } else {
            x(g);
            z = false;
        }
        if (this.e.c() == 0) {
            this.f = true;
        }
        return z;
    }

    public e5 g(z4 z4Var) {
        boolean u;
        boolean u2;
        int c = this.e.c();
        e5 e5Var = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        e5 e5Var2 = null;
        for (int i = 0; i < c; i++) {
            float a2 = this.e.a(i);
            e5 h = this.e.h(i);
            if (h.k == e5.a.UNRESTRICTED) {
                if (e5Var == null) {
                    u2 = u(h, z4Var);
                } else if (f > a2) {
                    u2 = u(h, z4Var);
                } else if (!z && u(h, z4Var)) {
                    f = a2;
                    e5Var = h;
                    z = true;
                }
                z = u2;
                f = a2;
                e5Var = h;
            } else if (e5Var == null && a2 < 0.0f) {
                if (e5Var2 == null) {
                    u = u(h, z4Var);
                } else if (f2 > a2) {
                    u = u(h, z4Var);
                } else if (!z2 && u(h, z4Var)) {
                    f2 = a2;
                    e5Var2 = h;
                    z2 = true;
                }
                z2 = u;
                f2 = a2;
                e5Var2 = h;
            }
        }
        return e5Var != null ? e5Var : e5Var2;
    }

    @Override // defpackage.z4.a
    public e5 getKey() {
        return this.a;
    }

    public x4 h(e5 e5Var, e5 e5Var2, int i, float f, e5 e5Var3, e5 e5Var4, int i2) {
        if (e5Var2 == e5Var3) {
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var4, 1.0f);
            this.e.g(e5Var2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var2, -1.0f);
            this.e.g(e5Var3, -1.0f);
            this.e.g(e5Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.e.g(e5Var, -1.0f);
            this.e.g(e5Var2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.e.g(e5Var4, -1.0f);
            this.e.g(e5Var3, 1.0f);
            this.b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.e.g(e5Var, f2 * 1.0f);
            this.e.g(e5Var2, f2 * (-1.0f));
            this.e.g(e5Var3, (-1.0f) * f);
            this.e.g(e5Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public x4 i(e5 e5Var, int i) {
        this.a = e5Var;
        float f = i;
        e5Var.g = f;
        this.b = f;
        this.f = true;
        return this;
    }

    @Override // defpackage.z4.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.c() == 0;
    }

    public x4 j(e5 e5Var, e5 e5Var2, float f) {
        this.e.g(e5Var, -1.0f);
        this.e.g(e5Var2, f);
        return this;
    }

    public x4 k(e5 e5Var, e5 e5Var2, e5 e5Var3, e5 e5Var4, float f) {
        this.e.g(e5Var, -1.0f);
        this.e.g(e5Var2, 1.0f);
        this.e.g(e5Var3, f);
        this.e.g(e5Var4, -f);
        return this;
    }

    public x4 l(float f, float f2, float f3, e5 e5Var, e5 e5Var2, e5 e5Var3, e5 e5Var4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var2, -1.0f);
            this.e.g(e5Var4, 1.0f);
            this.e.g(e5Var3, -1.0f);
        } else if (f == 0.0f) {
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.g(e5Var3, 1.0f);
            this.e.g(e5Var4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var2, -1.0f);
            this.e.g(e5Var4, f4);
            this.e.g(e5Var3, -f4);
        }
        return this;
    }

    public x4 m(e5 e5Var, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.g(e5Var, 1.0f);
        } else {
            this.b = i;
            this.e.g(e5Var, -1.0f);
        }
        return this;
    }

    public x4 n(e5 e5Var, e5 e5Var2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.g(e5Var, -1.0f);
            this.e.g(e5Var2, 1.0f);
        } else {
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var2, -1.0f);
        }
        return this;
    }

    public x4 o(e5 e5Var, e5 e5Var2, e5 e5Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.g(e5Var, -1.0f);
            this.e.g(e5Var2, 1.0f);
            this.e.g(e5Var3, 1.0f);
        } else {
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var2, -1.0f);
            this.e.g(e5Var3, -1.0f);
        }
        return this;
    }

    public x4 p(e5 e5Var, e5 e5Var2, e5 e5Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.g(e5Var, -1.0f);
            this.e.g(e5Var2, 1.0f);
            this.e.g(e5Var3, -1.0f);
        } else {
            this.e.g(e5Var, 1.0f);
            this.e.g(e5Var2, -1.0f);
            this.e.g(e5Var3, 1.0f);
        }
        return this;
    }

    public x4 q(e5 e5Var, e5 e5Var2, e5 e5Var3, e5 e5Var4, float f) {
        this.e.g(e5Var3, 0.5f);
        this.e.g(e5Var4, 0.5f);
        this.e.g(e5Var, -0.5f);
        this.e.g(e5Var2, -0.5f);
        this.b = -f;
        return this;
    }

    public void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.k();
        }
    }

    public boolean s() {
        e5 e5Var = this.a;
        return e5Var != null && (e5Var.k == e5.a.UNRESTRICTED || this.b >= 0.0f);
    }

    public boolean t(e5 e5Var) {
        return this.e.e(e5Var);
    }

    public String toString() {
        return z();
    }

    public final boolean u(e5 e5Var, z4 z4Var) {
        return e5Var.n <= 1;
    }

    public e5 v(e5 e5Var) {
        return w(null, e5Var);
    }

    public final e5 w(boolean[] zArr, e5 e5Var) {
        e5.a aVar;
        int c = this.e.c();
        e5 e5Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < c; i++) {
            float a2 = this.e.a(i);
            if (a2 < 0.0f) {
                e5 h = this.e.h(i);
                if ((zArr == null || !zArr[h.d]) && h != e5Var && (((aVar = h.k) == e5.a.SLACK || aVar == e5.a.ERROR) && a2 < f)) {
                    f = a2;
                    e5Var2 = h;
                }
            }
        }
        return e5Var2;
    }

    public void x(e5 e5Var) {
        e5 e5Var2 = this.a;
        if (e5Var2 != null) {
            this.e.g(e5Var2, -1.0f);
            this.a.e = -1;
            this.a = null;
        }
        float b = this.e.b(e5Var, true) * (-1.0f);
        this.a = e5Var;
        if (b == 1.0f) {
            return;
        }
        this.b /= b;
        this.e.j(b);
    }

    public void y() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String z() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4.z():java.lang.String");
    }

    public x4(y4 y4Var) {
        this.e = new w4(this, y4Var);
    }
}
