package defpackage;

import defpackage.q5;
import defpackage.r5;

/* compiled from: AxisPay */
/* renamed from: t5  reason: default package */
/* loaded from: classes.dex */
public class t5 extends r5 {
    public boolean A0;
    public float v0 = -1.0f;
    public int w0 = -1;
    public int x0 = -1;
    public q5 y0 = this.M;
    public int z0 = 0;

    /* compiled from: AxisPay */
    /* renamed from: t5$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q5.b.values().length];
            a = iArr;
            try {
                iArr[q5.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[q5.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[q5.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[q5.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[q5.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[q5.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[q5.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[q5.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[q5.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public t5() {
        this.U.clear();
        this.U.add(this.y0);
        int length = this.T.length;
        for (int i = 0; i < length; i++) {
            this.T[i] = this.y0;
        }
    }

    @Override // defpackage.r5
    public void g(z4 z4Var, boolean z) {
        s5 s5Var = (s5) I();
        if (s5Var == null) {
            return;
        }
        q5 m = s5Var.m(q5.b.LEFT);
        q5 m2 = s5Var.m(q5.b.RIGHT);
        r5 r5Var = this.X;
        boolean z2 = true;
        boolean z3 = r5Var != null && r5Var.W[0] == r5.b.WRAP_CONTENT;
        if (this.z0 == 0) {
            m = s5Var.m(q5.b.TOP);
            m2 = s5Var.m(q5.b.BOTTOM);
            r5 r5Var2 = this.X;
            if (r5Var2 == null || r5Var2.W[1] != r5.b.WRAP_CONTENT) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.A0 && this.y0.m()) {
            e5 q = z4Var.q(this.y0);
            z4Var.f(q, this.y0.d());
            if (this.w0 != -1) {
                if (z3) {
                    z4Var.h(z4Var.q(m2), q, 0, 5);
                }
            } else if (this.x0 != -1 && z3) {
                e5 q2 = z4Var.q(m2);
                z4Var.h(q, z4Var.q(m), 0, 5);
                z4Var.h(q2, q, 0, 5);
            }
            this.A0 = false;
        } else if (this.w0 != -1) {
            e5 q3 = z4Var.q(this.y0);
            z4Var.e(q3, z4Var.q(m), this.w0, 8);
            if (z3) {
                z4Var.h(z4Var.q(m2), q3, 0, 5);
            }
        } else if (this.x0 != -1) {
            e5 q4 = z4Var.q(this.y0);
            e5 q5 = z4Var.q(m2);
            z4Var.e(q4, q5, -this.x0, 8);
            if (z3) {
                z4Var.h(q4, z4Var.q(m), 0, 5);
                z4Var.h(q5, q4, 0, 5);
            }
        } else if (this.v0 != -1.0f) {
            z4Var.d(z4.s(z4Var, z4Var.q(this.y0), z4Var.q(m2), this.v0));
        }
    }

    @Override // defpackage.r5
    public boolean h() {
        return true;
    }

    @Override // defpackage.r5
    public boolean l0() {
        return this.A0;
    }

    @Override // defpackage.r5
    public q5 m(q5.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i != 1 && i != 2) {
            if ((i == 3 || i == 4) && this.z0 == 0) {
                return this.y0;
            }
            return null;
        } else if (this.z0 == 1) {
            return this.y0;
        } else {
            return null;
        }
    }

    @Override // defpackage.r5
    public boolean m0() {
        return this.A0;
    }

    @Override // defpackage.r5
    public void n1(z4 z4Var, boolean z) {
        if (I() == null) {
            return;
        }
        int x = z4Var.x(this.y0);
        if (this.z0 == 1) {
            j1(x);
            k1(0);
            I0(I().v());
            h1(0);
            return;
        }
        j1(0);
        k1(x);
        h1(I().U());
        I0(0);
    }

    public q5 o1() {
        return this.y0;
    }

    public int p1() {
        return this.z0;
    }

    public int q1() {
        return this.w0;
    }

    public int r1() {
        return this.x0;
    }

    public float s1() {
        return this.v0;
    }

    public void t1(int i) {
        this.y0.s(i);
        this.A0 = true;
    }

    public void u1(int i) {
        if (i > -1) {
            this.v0 = -1.0f;
            this.w0 = i;
            this.x0 = -1;
        }
    }

    public void v1(int i) {
        if (i > -1) {
            this.v0 = -1.0f;
            this.w0 = -1;
            this.x0 = i;
        }
    }

    public void w1(float f) {
        if (f > -1.0f) {
            this.v0 = f;
            this.w0 = -1;
            this.x0 = -1;
        }
    }

    public void x1(int i) {
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
        this.U.clear();
        if (this.z0 == 1) {
            this.y0 = this.L;
        } else {
            this.y0 = this.M;
        }
        this.U.add(this.y0);
        int length = this.T.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.T[i2] = this.y0;
        }
    }
}
