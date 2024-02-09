package defpackage;

import defpackage.q5;
import defpackage.r5;

/* compiled from: AxisPay */
/* renamed from: o6  reason: default package */
/* loaded from: classes.dex */
public abstract class o6 implements c6 {
    public int a;
    public r5 b;
    public l6 c;
    public r5.b d;
    public f6 e = new f6(this);
    public int f = 0;
    public boolean g = false;
    public e6 h = new e6(this);
    public e6 i = new e6(this);
    public b j = b.NONE;

    /* compiled from: AxisPay */
    /* renamed from: o6$a */
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
                a[q5.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[q5.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: o6$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public o6(r5 r5Var) {
        this.b = r5Var;
    }

    @Override // defpackage.c6
    public void a(c6 c6Var) {
    }

    public final void b(e6 e6Var, e6 e6Var2, int i) {
        e6Var.l.add(e6Var2);
        e6Var.f = i;
        e6Var2.k.add(e6Var);
    }

    public final void c(e6 e6Var, e6 e6Var2, int i, f6 f6Var) {
        e6Var.l.add(e6Var2);
        e6Var.l.add(this.e);
        e6Var.h = i;
        e6Var.i = f6Var;
        e6Var2.k.add(e6Var);
        f6Var.k.add(e6Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            r5 r5Var = this.b;
            int i3 = r5Var.x;
            max = Math.max(r5Var.w, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            r5 r5Var2 = this.b;
            int i4 = r5Var2.A;
            max = Math.max(r5Var2.z, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final e6 h(q5 q5Var) {
        q5 q5Var2 = q5Var.f;
        if (q5Var2 == null) {
            return null;
        }
        r5 r5Var = q5Var2.d;
        int i = a.a[q5Var2.e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return r5Var.e.i;
                    }
                    return r5Var.e.k;
                }
                return r5Var.e.h;
            }
            return r5Var.d.i;
        }
        return r5Var.d.h;
    }

    public final e6 i(q5 q5Var, int i) {
        q5 q5Var2 = q5Var.f;
        if (q5Var2 == null) {
            return null;
        }
        r5 r5Var = q5Var2.d;
        o6 o6Var = i == 0 ? r5Var.d : r5Var.e;
        int i2 = a.a[q5Var2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return o6Var.i;
        }
        return o6Var.h;
    }

    public long j() {
        f6 f6Var = this.e;
        if (f6Var.j) {
            return f6Var.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    public final void l(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i4 == 0) {
            this.e.d(g(i2, i));
        } else if (i4 == 1) {
            this.e.d(Math.min(g(this.e.m, i), i2));
        } else if (i4 == 2) {
            r5 I = this.b.I();
            if (I != null) {
                f6 f6Var = (i == 0 ? I.d : I.e).e;
                if (f6Var.j) {
                    r5 r5Var = this.b;
                    this.e.d(g((int) ((f6Var.g * (i == 0 ? r5Var.y : r5Var.B)) + 0.5f), i));
                }
            }
        } else if (i4 != 3) {
        } else {
            r5 r5Var2 = this.b;
            o6 o6Var = r5Var2.d;
            r5.b bVar = o6Var.d;
            r5.b bVar2 = r5.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && o6Var.a == 3) {
                m6 m6Var = r5Var2.e;
                if (m6Var.d == bVar2 && m6Var.a == 3) {
                    return;
                }
            }
            if (i == 0) {
                o6Var = r5Var2.e;
            }
            if (o6Var.e.j) {
                float t = r5Var2.t();
                if (i == 1) {
                    i3 = (int) ((o6Var.e.g / t) + 0.5f);
                } else {
                    i3 = (int) ((t * o6Var.e.g) + 0.5f);
                }
                this.e.d(i3);
            }
        }
    }

    public abstract boolean m();

    public void n(c6 c6Var, q5 q5Var, q5 q5Var2, int i) {
        e6 h = h(q5Var);
        e6 h2 = h(q5Var2);
        if (h.j && h2.j) {
            int e = h.g + q5Var.e();
            int e2 = h2.g - q5Var2.e();
            int i2 = e2 - e;
            if (!this.e.j && this.d == r5.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            f6 f6Var = this.e;
            if (f6Var.j) {
                if (f6Var.g == i2) {
                    this.h.d(e);
                    this.i.d(e2);
                    return;
                }
                r5 r5Var = this.b;
                float w = i == 0 ? r5Var.w() : r5Var.P();
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    w = 0.5f;
                }
                this.h.d((int) (e + 0.5f + (((e2 - e) - this.e.g) * w)));
                this.i.d(this.h.g + this.e.g);
            }
        }
    }

    public void o(c6 c6Var) {
    }

    public void p(c6 c6Var) {
    }
}
