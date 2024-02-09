package defpackage;

import defpackage.e6;
import defpackage.o6;
import defpackage.q5;
import defpackage.r5;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: k6  reason: default package */
/* loaded from: classes.dex */
public class k6 extends o6 {
    public static int[] k = new int[2];

    /* compiled from: AxisPay */
    /* renamed from: k6$a */
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

    public k6(r5 r5Var) {
        super(r5Var);
        this.h.e = e6.a.LEFT;
        this.i.e = e6.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // defpackage.o6, defpackage.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.c6 r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6.a(c6):void");
    }

    @Override // defpackage.o6
    public void d() {
        r5 I;
        r5 I2;
        r5 r5Var = this.b;
        if (r5Var.a) {
            this.e.d(r5Var.U());
        }
        if (!this.e.j) {
            r5.b y = this.b.y();
            this.d = y;
            if (y != r5.b.MATCH_CONSTRAINT) {
                r5.b bVar = r5.b.MATCH_PARENT;
                if (y == bVar && (I2 = this.b.I()) != null && (I2.y() == r5.b.FIXED || I2.y() == bVar)) {
                    int U = (I2.U() - this.b.L.e()) - this.b.N.e();
                    b(this.h, I2.d.h, this.b.L.e());
                    b(this.i, I2.d.i, -this.b.N.e());
                    this.e.d(U);
                    return;
                } else if (this.d == r5.b.FIXED) {
                    this.e.d(this.b.U());
                }
            }
        } else {
            r5.b bVar2 = this.d;
            r5.b bVar3 = r5.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.b.I()) != null && (I.y() == r5.b.FIXED || I.y() == bVar3)) {
                b(this.h, I.d.h, this.b.L.e());
                b(this.i, I.d.i, -this.b.N.e());
                return;
            }
        }
        f6 f6Var = this.e;
        if (f6Var.j) {
            r5 r5Var2 = this.b;
            if (r5Var2.a) {
                q5[] q5VarArr = r5Var2.T;
                if (q5VarArr[0].f != null && q5VarArr[1].f != null) {
                    if (r5Var2.g0()) {
                        this.h.f = this.b.T[0].e();
                        this.i.f = -this.b.T[1].e();
                        return;
                    }
                    e6 h = h(this.b.T[0]);
                    if (h != null) {
                        b(this.h, h, this.b.T[0].e());
                    }
                    e6 h2 = h(this.b.T[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.T[1].e());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                } else if (q5VarArr[0].f != null) {
                    e6 h3 = h(q5VarArr[0]);
                    if (h3 != null) {
                        b(this.h, h3, this.b.T[0].e());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else if (q5VarArr[1].f != null) {
                    e6 h4 = h(q5VarArr[1]);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.T[1].e());
                        b(this.h, this.i, -this.e.g);
                        return;
                    }
                    return;
                } else if ((r5Var2 instanceof u5) || r5Var2.I() == null || this.b.m(q5.b.CENTER).f != null) {
                    return;
                } else {
                    b(this.h, this.b.I().d.h, this.b.V());
                    b(this.i, this.h, this.e.g);
                    return;
                }
            }
        }
        if (this.d == r5.b.MATCH_CONSTRAINT) {
            r5 r5Var3 = this.b;
            int i = r5Var3.t;
            if (i == 2) {
                r5 I3 = r5Var3.I();
                if (I3 != null) {
                    f6 f6Var2 = I3.e.e;
                    this.e.l.add(f6Var2);
                    f6Var2.k.add(this.e);
                    f6 f6Var3 = this.e;
                    f6Var3.b = true;
                    f6Var3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3) {
                if (r5Var3.u == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    m6 m6Var = r5Var3.e;
                    m6Var.h.a = this;
                    m6Var.i.a = this;
                    f6Var.a = this;
                    if (r5Var3.i0()) {
                        this.e.l.add(this.b.e.e);
                        this.b.e.e.k.add(this.e);
                        m6 m6Var2 = this.b.e;
                        m6Var2.e.a = this;
                        this.e.l.add(m6Var2.h);
                        this.e.l.add(this.b.e.i);
                        this.b.e.h.k.add(this.e);
                        this.b.e.i.k.add(this.e);
                    } else if (this.b.g0()) {
                        this.b.e.e.l.add(this.e);
                        this.e.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(this.e);
                    }
                } else {
                    f6 f6Var4 = r5Var3.e.e;
                    f6Var.l.add(f6Var4);
                    f6Var4.k.add(this.e);
                    this.b.e.h.k.add(this.e);
                    this.b.e.i.k.add(this.e);
                    f6 f6Var5 = this.e;
                    f6Var5.b = true;
                    f6Var5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        r5 r5Var4 = this.b;
        q5[] q5VarArr2 = r5Var4.T;
        if (q5VarArr2[0].f != null && q5VarArr2[1].f != null) {
            if (r5Var4.g0()) {
                this.h.f = this.b.T[0].e();
                this.i.f = -this.b.T[1].e();
                return;
            }
            e6 h5 = h(this.b.T[0]);
            e6 h6 = h(this.b.T[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = o6.b.CENTER;
        } else if (q5VarArr2[0].f != null) {
            e6 h7 = h(q5VarArr2[0]);
            if (h7 != null) {
                b(this.h, h7, this.b.T[0].e());
                c(this.i, this.h, 1, this.e);
            }
        } else if (q5VarArr2[1].f != null) {
            e6 h8 = h(q5VarArr2[1]);
            if (h8 != null) {
                b(this.i, h8, -this.b.T[1].e());
                c(this.h, this.i, -1, this.e);
            }
        } else if ((r5Var4 instanceof u5) || r5Var4.I() == null) {
        } else {
            b(this.h, this.b.I().d.h, this.b.V());
            c(this.i, this.h, 1, this.e);
        }
    }

    @Override // defpackage.o6
    public void e() {
        e6 e6Var = this.h;
        if (e6Var.j) {
            this.b.j1(e6Var.g);
        }
    }

    @Override // defpackage.o6
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.o6
    public boolean m() {
        return this.d != r5.b.MATCH_CONSTRAINT || this.b.t == 0;
    }

    public final void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return C0059ao.a(9232) + this.b.r();
    }
}
