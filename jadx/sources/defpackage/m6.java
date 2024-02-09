package defpackage;

import defpackage.e6;
import defpackage.o6;
import defpackage.q5;
import defpackage.r5;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: m6  reason: default package */
/* loaded from: classes.dex */
public class m6 extends o6 {
    public e6 k;
    public f6 l;

    /* compiled from: AxisPay */
    /* renamed from: m6$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[o6.b.values().length];
            a = iArr;
            try {
                iArr[o6.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[o6.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[o6.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m6(r5 r5Var) {
        super(r5Var);
        e6 e6Var = new e6(this);
        this.k = e6Var;
        this.l = null;
        this.h.e = e6.a.TOP;
        this.i.e = e6.a.BOTTOM;
        e6Var.e = e6.a.BASELINE;
        this.f = 1;
    }

    @Override // defpackage.o6, defpackage.c6
    public void a(c6 c6Var) {
        f6 f6Var;
        float f;
        float t;
        float f2;
        int i;
        r5 r5Var;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            p(c6Var);
        } else if (i2 == 2) {
            o(c6Var);
        } else if (i2 == 3) {
            r5 r5Var2 = this.b;
            n(c6Var, r5Var2.M, r5Var2.O, 1);
            return;
        }
        f6 f6Var2 = this.e;
        if (f6Var2.c && !f6Var2.j && this.d == r5.b.MATCH_CONSTRAINT) {
            r5 r5Var3 = this.b;
            int i3 = r5Var3.u;
            if (i3 != 2) {
                if (i3 == 3 && r5Var3.d.e.j) {
                    int u = r5Var3.u();
                    if (u == -1) {
                        r5 r5Var4 = this.b;
                        f = r5Var4.d.e.g;
                        t = r5Var4.t();
                    } else if (u == 0) {
                        f2 = r5Var.d.e.g * this.b.t();
                        i = (int) (f2 + 0.5f);
                        this.e.d(i);
                    } else if (u == 1) {
                        r5 r5Var5 = this.b;
                        f = r5Var5.d.e.g;
                        t = r5Var5.t();
                    } else {
                        i = 0;
                        this.e.d(i);
                    }
                    f2 = f / t;
                    i = (int) (f2 + 0.5f);
                    this.e.d(i);
                }
            } else {
                r5 I = r5Var3.I();
                if (I != null) {
                    if (I.e.e.j) {
                        this.e.d((int) ((f6Var.g * this.b.B) + 0.5f));
                    }
                }
            }
        }
        e6 e6Var = this.h;
        if (e6Var.c) {
            e6 e6Var2 = this.i;
            if (e6Var2.c) {
                if (e6Var.j && e6Var2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == r5.b.MATCH_CONSTRAINT) {
                    r5 r5Var6 = this.b;
                    if (r5Var6.t == 0 && !r5Var6.i0()) {
                        int i4 = this.h.l.get(0).g;
                        e6 e6Var3 = this.h;
                        int i5 = i4 + e6Var3.f;
                        int i6 = this.i.l.get(0).g + this.i.f;
                        e6Var3.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == r5.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                    f6 f6Var3 = this.e;
                    int i8 = f6Var3.m;
                    if (i7 < i8) {
                        f6Var3.d(i7);
                    } else {
                        f6Var3.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    e6 e6Var4 = this.h.l.get(0);
                    e6 e6Var5 = this.i.l.get(0);
                    int i9 = e6Var4.g + this.h.f;
                    int i10 = e6Var5.g + this.i.f;
                    float P = this.b.P();
                    if (e6Var4 == e6Var5) {
                        i9 = e6Var4.g;
                        i10 = e6Var5.g;
                        P = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * P)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // defpackage.o6
    public void d() {
        r5 I;
        r5 I2;
        r5 r5Var = this.b;
        if (r5Var.a) {
            this.e.d(r5Var.v());
        }
        if (!this.e.j) {
            this.d = this.b.R();
            if (this.b.X()) {
                this.l = new z5(this);
            }
            r5.b bVar = this.d;
            if (bVar != r5.b.MATCH_CONSTRAINT) {
                if (bVar == r5.b.MATCH_PARENT && (I2 = this.b.I()) != null && I2.R() == r5.b.FIXED) {
                    int v = (I2.v() - this.b.M.e()) - this.b.O.e();
                    b(this.h, I2.e.h, this.b.M.e());
                    b(this.i, I2.e.i, -this.b.O.e());
                    this.e.d(v);
                    return;
                } else if (this.d == r5.b.FIXED) {
                    this.e.d(this.b.v());
                }
            }
        } else if (this.d == r5.b.MATCH_PARENT && (I = this.b.I()) != null && I.R() == r5.b.FIXED) {
            b(this.h, I.e.h, this.b.M.e());
            b(this.i, I.e.i, -this.b.O.e());
            return;
        }
        f6 f6Var = this.e;
        boolean z = f6Var.j;
        if (z) {
            r5 r5Var2 = this.b;
            if (r5Var2.a) {
                q5[] q5VarArr = r5Var2.T;
                if (q5VarArr[2].f != null && q5VarArr[3].f != null) {
                    if (r5Var2.i0()) {
                        this.h.f = this.b.T[2].e();
                        this.i.f = -this.b.T[3].e();
                    } else {
                        e6 h = h(this.b.T[2]);
                        if (h != null) {
                            b(this.h, h, this.b.T[2].e());
                        }
                        e6 h2 = h(this.b.T[3]);
                        if (h2 != null) {
                            b(this.i, h2, -this.b.T[3].e());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.X()) {
                        b(this.k, this.h, this.b.n());
                        return;
                    }
                    return;
                } else if (q5VarArr[2].f != null) {
                    e6 h3 = h(q5VarArr[2]);
                    if (h3 != null) {
                        b(this.h, h3, this.b.T[2].e());
                        b(this.i, this.h, this.e.g);
                        if (this.b.X()) {
                            b(this.k, this.h, this.b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (q5VarArr[3].f != null) {
                    e6 h4 = h(q5VarArr[3]);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.T[3].e());
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.b.X()) {
                        b(this.k, this.h, this.b.n());
                        return;
                    }
                    return;
                } else if (q5VarArr[4].f != null) {
                    e6 h5 = h(q5VarArr[4]);
                    if (h5 != null) {
                        b(this.k, h5, 0);
                        b(this.h, this.k, -this.b.n());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else if ((r5Var2 instanceof u5) || r5Var2.I() == null || this.b.m(q5.b.CENTER).f != null) {
                    return;
                } else {
                    b(this.h, this.b.I().e.h, this.b.W());
                    b(this.i, this.h, this.e.g);
                    if (this.b.X()) {
                        b(this.k, this.h, this.b.n());
                        return;
                    }
                    return;
                }
            }
        }
        if (!z && this.d == r5.b.MATCH_CONSTRAINT) {
            r5 r5Var3 = this.b;
            int i = r5Var3.u;
            if (i != 2) {
                if (i == 3 && !r5Var3.i0()) {
                    r5 r5Var4 = this.b;
                    if (r5Var4.t != 3) {
                        f6 f6Var2 = r5Var4.d.e;
                        this.e.l.add(f6Var2);
                        f6Var2.k.add(this.e);
                        f6 f6Var3 = this.e;
                        f6Var3.b = true;
                        f6Var3.k.add(this.h);
                        this.e.k.add(this.i);
                    }
                }
            } else {
                r5 I3 = r5Var3.I();
                if (I3 != null) {
                    f6 f6Var4 = I3.e.e;
                    this.e.l.add(f6Var4);
                    f6Var4.k.add(this.e);
                    f6 f6Var5 = this.e;
                    f6Var5.b = true;
                    f6Var5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        } else {
            f6Var.b(this);
        }
        r5 r5Var5 = this.b;
        q5[] q5VarArr2 = r5Var5.T;
        if (q5VarArr2[2].f != null && q5VarArr2[3].f != null) {
            if (r5Var5.i0()) {
                this.h.f = this.b.T[2].e();
                this.i.f = -this.b.T[3].e();
            } else {
                e6 h6 = h(this.b.T[2]);
                e6 h7 = h(this.b.T[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = o6.b.CENTER;
            }
            if (this.b.X()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (q5VarArr2[2].f != null) {
            e6 h8 = h(q5VarArr2[2]);
            if (h8 != null) {
                b(this.h, h8, this.b.T[2].e());
                c(this.i, this.h, 1, this.e);
                if (this.b.X()) {
                    c(this.k, this.h, 1, this.l);
                }
                r5.b bVar2 = this.d;
                r5.b bVar3 = r5.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.t() > 0.0f) {
                    k6 k6Var = this.b.d;
                    if (k6Var.d == bVar3) {
                        k6Var.e.k.add(this.e);
                        this.e.l.add(this.b.d.e);
                        this.e.a = this;
                    }
                }
            }
        } else if (q5VarArr2[3].f != null) {
            e6 h9 = h(q5VarArr2[3]);
            if (h9 != null) {
                b(this.i, h9, -this.b.T[3].e());
                c(this.h, this.i, -1, this.e);
                if (this.b.X()) {
                    c(this.k, this.h, 1, this.l);
                }
            }
        } else if (q5VarArr2[4].f != null) {
            e6 h10 = h(q5VarArr2[4]);
            if (h10 != null) {
                b(this.k, h10, 0);
                c(this.h, this.k, -1, this.l);
                c(this.i, this.h, 1, this.e);
            }
        } else if (!(r5Var5 instanceof u5) && r5Var5.I() != null) {
            b(this.h, this.b.I().e.h, this.b.W());
            c(this.i, this.h, 1, this.e);
            if (this.b.X()) {
                c(this.k, this.h, 1, this.l);
            }
            r5.b bVar4 = this.d;
            r5.b bVar5 = r5.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.b.t() > 0.0f) {
                k6 k6Var2 = this.b.d;
                if (k6Var2.d == bVar5) {
                    k6Var2.e.k.add(this.e);
                    this.e.l.add(this.b.d.e);
                    this.e.a = this;
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // defpackage.o6
    public void e() {
        e6 e6Var = this.h;
        if (e6Var.j) {
            this.b.k1(e6Var.g);
        }
    }

    @Override // defpackage.o6
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.o6
    public boolean m() {
        return this.d != r5.b.MATCH_CONSTRAINT || this.b.u == 0;
    }

    public void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return C0059ao.a(11328) + this.b.r();
    }
}
