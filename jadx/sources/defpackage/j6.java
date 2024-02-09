package defpackage;

import defpackage.e6;

/* compiled from: AxisPay */
/* renamed from: j6  reason: default package */
/* loaded from: classes.dex */
public class j6 extends o6 {
    public j6(r5 r5Var) {
        super(r5Var);
    }

    @Override // defpackage.o6, defpackage.c6
    public void a(c6 c6Var) {
        n5 n5Var = (n5) this.b;
        int s1 = n5Var.s1();
        int i = 0;
        int i2 = -1;
        for (e6 e6Var : this.h.l) {
            int i3 = e6Var.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (s1 != 0 && s1 != 2) {
            this.h.d(i + n5Var.t1());
        } else {
            this.h.d(i2 + n5Var.t1());
        }
    }

    @Override // defpackage.o6
    public void d() {
        r5 r5Var = this.b;
        if (r5Var instanceof n5) {
            this.h.b = true;
            n5 n5Var = (n5) r5Var;
            int s1 = n5Var.s1();
            boolean r1 = n5Var.r1();
            int i = 0;
            if (s1 == 0) {
                this.h.e = e6.a.LEFT;
                while (i < n5Var.w0) {
                    r5 r5Var2 = n5Var.v0[i];
                    if (r1 || r5Var2.T() != 8) {
                        e6 e6Var = r5Var2.d.h;
                        e6Var.k.add(this.h);
                        this.h.l.add(e6Var);
                    }
                    i++;
                }
                q(this.b.d.h);
                q(this.b.d.i);
            } else if (s1 == 1) {
                this.h.e = e6.a.RIGHT;
                while (i < n5Var.w0) {
                    r5 r5Var3 = n5Var.v0[i];
                    if (r1 || r5Var3.T() != 8) {
                        e6 e6Var2 = r5Var3.d.i;
                        e6Var2.k.add(this.h);
                        this.h.l.add(e6Var2);
                    }
                    i++;
                }
                q(this.b.d.h);
                q(this.b.d.i);
            } else if (s1 == 2) {
                this.h.e = e6.a.TOP;
                while (i < n5Var.w0) {
                    r5 r5Var4 = n5Var.v0[i];
                    if (r1 || r5Var4.T() != 8) {
                        e6 e6Var3 = r5Var4.e.h;
                        e6Var3.k.add(this.h);
                        this.h.l.add(e6Var3);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
            } else if (s1 != 3) {
            } else {
                this.h.e = e6.a.BOTTOM;
                while (i < n5Var.w0) {
                    r5 r5Var5 = n5Var.v0[i];
                    if (r1 || r5Var5.T() != 8) {
                        e6 e6Var4 = r5Var5.e.i;
                        e6Var4.k.add(this.h);
                        this.h.l.add(e6Var4);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
            }
        }
    }

    @Override // defpackage.o6
    public void e() {
        r5 r5Var = this.b;
        if (r5Var instanceof n5) {
            int s1 = ((n5) r5Var).s1();
            if (s1 != 0 && s1 != 1) {
                this.b.k1(this.h.g);
            } else {
                this.b.j1(this.h.g);
            }
        }
    }

    @Override // defpackage.o6
    public void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.o6
    public boolean m() {
        return false;
    }

    public final void q(e6 e6Var) {
        this.h.k.add(e6Var);
        e6Var.l.add(this.h);
    }
}
