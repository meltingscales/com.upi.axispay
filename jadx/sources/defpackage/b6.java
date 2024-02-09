package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: b6  reason: default package */
/* loaded from: classes.dex */
public class b6 extends o6 {
    public ArrayList<o6> k;
    public int l;

    public b6(r5 r5Var, int i) {
        super(r5Var);
        this.k = new ArrayList<>();
        this.f = i;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0400, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // defpackage.o6, defpackage.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.c6 r27) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6.a(c6):void");
    }

    @Override // defpackage.o6
    public void d() {
        Iterator<o6> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        r5 r5Var = this.k.get(0).b;
        r5 r5Var2 = this.k.get(size - 1).b;
        if (this.f == 0) {
            q5 q5Var = r5Var.L;
            q5 q5Var2 = r5Var2.N;
            e6 i = i(q5Var, 0);
            int e = q5Var.e();
            r5 r = r();
            if (r != null) {
                e = r.L.e();
            }
            if (i != null) {
                b(this.h, i, e);
            }
            e6 i2 = i(q5Var2, 0);
            int e2 = q5Var2.e();
            r5 s = s();
            if (s != null) {
                e2 = s.N.e();
            }
            if (i2 != null) {
                b(this.i, i2, -e2);
            }
        } else {
            q5 q5Var3 = r5Var.M;
            q5 q5Var4 = r5Var2.O;
            e6 i3 = i(q5Var3, 1);
            int e3 = q5Var3.e();
            r5 r2 = r();
            if (r2 != null) {
                e3 = r2.M.e();
            }
            if (i3 != null) {
                b(this.h, i3, e3);
            }
            e6 i4 = i(q5Var4, 1);
            int e4 = q5Var4.e();
            r5 s2 = s();
            if (s2 != null) {
                e4 = s2.O.e();
            }
            if (i4 != null) {
                b(this.i, i4, -e4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.o6
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // defpackage.o6
    public void f() {
        this.c = null;
        Iterator<o6> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // defpackage.o6
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            o6 o6Var = this.k.get(i);
            j = j + o6Var.h.f + o6Var.j() + o6Var.i.f;
        }
        return j;
    }

    @Override // defpackage.o6
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        r5 r5Var;
        r5 r5Var2 = this.b;
        r5 J = r5Var2.J(this.f);
        while (true) {
            r5 r5Var3 = J;
            r5Var = r5Var2;
            r5Var2 = r5Var3;
            if (r5Var2 == null) {
                break;
            }
            J = r5Var2.J(this.f);
        }
        this.b = r5Var;
        this.k.add(r5Var.L(this.f));
        r5 H = r5Var.H(this.f);
        while (H != null) {
            this.k.add(H.L(this.f));
            H = H.H(this.f);
        }
        Iterator<o6> it = this.k.iterator();
        while (it.hasNext()) {
            o6 next = it.next();
            int i = this.f;
            if (i == 0) {
                next.b.b = this;
            } else if (i == 1) {
                next.b.c = this;
            }
        }
        if ((this.f == 0 && ((s5) this.b.I()).L1()) && this.k.size() > 1) {
            ArrayList<o6> arrayList = this.k;
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.x() : this.b.Q();
    }

    public final r5 r() {
        for (int i = 0; i < this.k.size(); i++) {
            o6 o6Var = this.k.get(i);
            if (o6Var.b.T() != 8) {
                return o6Var.b;
            }
        }
        return null;
    }

    public final r5 s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            o6 o6Var = this.k.get(size);
            if (o6Var.b.T() != 8) {
                return o6Var.b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0059ao.a(626));
        sb.append(this.f == 0 ? C0059ao.a(627) : C0059ao.a(628));
        Iterator<o6> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append(C0059ao.a(629));
            sb.append(it.next());
            sb.append(C0059ao.a(630));
        }
        return sb.toString();
    }
}
