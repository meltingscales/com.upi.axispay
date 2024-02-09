package defpackage;

/* compiled from: AxisPay */
/* renamed from: i6  reason: default package */
/* loaded from: classes.dex */
public class i6 extends o6 {
    public i6(r5 r5Var) {
        super(r5Var);
        r5Var.d.f();
        r5Var.e.f();
        this.f = ((t5) r5Var).p1();
    }

    @Override // defpackage.o6, defpackage.c6
    public void a(c6 c6Var) {
        e6 e6Var = this.h;
        if (e6Var.c && !e6Var.j) {
            this.h.d((int) ((e6Var.l.get(0).g * ((t5) this.b).s1()) + 0.5f));
        }
    }

    @Override // defpackage.o6
    public void d() {
        t5 t5Var = (t5) this.b;
        int q1 = t5Var.q1();
        int r1 = t5Var.r1();
        t5Var.s1();
        if (t5Var.p1() == 1) {
            if (q1 != -1) {
                this.h.l.add(this.b.X.d.h);
                this.b.X.d.h.k.add(this.h);
                this.h.f = q1;
            } else if (r1 != -1) {
                this.h.l.add(this.b.X.d.i);
                this.b.X.d.i.k.add(this.h);
                this.h.f = -r1;
            } else {
                e6 e6Var = this.h;
                e6Var.b = true;
                e6Var.l.add(this.b.X.d.i);
                this.b.X.d.i.k.add(this.h);
            }
            q(this.b.d.h);
            q(this.b.d.i);
            return;
        }
        if (q1 != -1) {
            this.h.l.add(this.b.X.e.h);
            this.b.X.e.h.k.add(this.h);
            this.h.f = q1;
        } else if (r1 != -1) {
            this.h.l.add(this.b.X.e.i);
            this.b.X.e.i.k.add(this.h);
            this.h.f = -r1;
        } else {
            e6 e6Var2 = this.h;
            e6Var2.b = true;
            e6Var2.l.add(this.b.X.e.i);
            this.b.X.e.i.k.add(this.h);
        }
        q(this.b.e.h);
        q(this.b.e.i);
    }

    @Override // defpackage.o6
    public void e() {
        if (((t5) this.b).p1() == 1) {
            this.b.j1(this.h.g);
        } else {
            this.b.k1(this.h.g);
        }
    }

    @Override // defpackage.o6
    public void f() {
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
