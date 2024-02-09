package defpackage;

import defpackage.a6;
import defpackage.r5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: d6  reason: default package */
/* loaded from: classes.dex */
public class d6 {
    public s5 a;
    public s5 d;
    public a6.b f;
    public a6.a g;
    public ArrayList<l6> h;
    public boolean b = true;
    public boolean c = true;
    public ArrayList<o6> e = new ArrayList<>();

    public d6(s5 s5Var) {
        new ArrayList();
        this.f = null;
        this.g = new a6.a();
        this.h = new ArrayList<>();
        this.a = s5Var;
        this.d = s5Var;
    }

    public final void a(e6 e6Var, int i, int i2, e6 e6Var2, ArrayList<l6> arrayList, l6 l6Var) {
        o6 o6Var = e6Var.d;
        if (o6Var.c == null) {
            s5 s5Var = this.a;
            if (o6Var == s5Var.d || o6Var == s5Var.e) {
                return;
            }
            if (l6Var == null) {
                l6Var = new l6(o6Var, i2);
                arrayList.add(l6Var);
            }
            o6Var.c = l6Var;
            l6Var.a(o6Var);
            for (c6 c6Var : o6Var.h.k) {
                if (c6Var instanceof e6) {
                    a((e6) c6Var, i, 0, e6Var2, arrayList, l6Var);
                }
            }
            for (c6 c6Var2 : o6Var.i.k) {
                if (c6Var2 instanceof e6) {
                    a((e6) c6Var2, i, 1, e6Var2, arrayList, l6Var);
                }
            }
            if (i == 1 && (o6Var instanceof m6)) {
                for (c6 c6Var3 : ((m6) o6Var).k.k) {
                    if (c6Var3 instanceof e6) {
                        a((e6) c6Var3, i, 2, e6Var2, arrayList, l6Var);
                    }
                }
            }
            for (e6 e6Var3 : o6Var.h.l) {
                if (e6Var3 == e6Var2) {
                    l6Var.a = true;
                }
                a(e6Var3, i, 0, e6Var2, arrayList, l6Var);
            }
            for (e6 e6Var4 : o6Var.i.l) {
                if (e6Var4 == e6Var2) {
                    l6Var.a = true;
                }
                a(e6Var4, i, 1, e6Var2, arrayList, l6Var);
            }
            if (i == 1 && (o6Var instanceof m6)) {
                for (e6 e6Var5 : ((m6) o6Var).k.l) {
                    a(e6Var5, i, 2, e6Var2, arrayList, l6Var);
                }
            }
        }
    }

    public final boolean b(s5 s5Var) {
        int i;
        r5.b bVar;
        int i2;
        r5.b bVar2;
        r5.b bVar3;
        r5.b bVar4;
        Iterator<r5> it = s5Var.v0.iterator();
        while (it.hasNext()) {
            r5 next = it.next();
            r5.b[] bVarArr = next.W;
            r5.b bVar5 = bVarArr[0];
            r5.b bVar6 = bVarArr[1];
            if (next.T() == 8) {
                next.a = true;
            } else {
                if (next.y < 1.0f && bVar5 == r5.b.MATCH_CONSTRAINT) {
                    next.t = 2;
                }
                if (next.B < 1.0f && bVar6 == r5.b.MATCH_CONSTRAINT) {
                    next.u = 2;
                }
                if (next.t() > 0.0f) {
                    r5.b bVar7 = r5.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == r5.b.WRAP_CONTENT || bVar6 == r5.b.FIXED)) {
                        next.t = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == r5.b.WRAP_CONTENT || bVar5 == r5.b.FIXED)) {
                        next.u = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.t == 0) {
                            next.t = 3;
                        }
                        if (next.u == 0) {
                            next.u = 3;
                        }
                    }
                }
                r5.b bVar8 = r5.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.t == 1 && (next.L.f == null || next.N.f == null)) {
                    bVar5 = r5.b.WRAP_CONTENT;
                }
                r5.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.u == 1 && (next.M.f == null || next.O.f == null)) {
                    bVar6 = r5.b.WRAP_CONTENT;
                }
                r5.b bVar10 = bVar6;
                k6 k6Var = next.d;
                k6Var.d = bVar9;
                int i3 = next.t;
                k6Var.a = i3;
                m6 m6Var = next.e;
                m6Var.d = bVar10;
                int i4 = next.u;
                m6Var.a = i4;
                r5.b bVar11 = r5.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == r5.b.FIXED || bVar9 == r5.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == r5.b.FIXED || bVar10 == r5.b.WRAP_CONTENT)) {
                    int U = next.U();
                    if (bVar9 == bVar11) {
                        i = (s5Var.U() - next.L.g) - next.N.g;
                        bVar = r5.b.FIXED;
                    } else {
                        i = U;
                        bVar = bVar9;
                    }
                    int v = next.v();
                    if (bVar10 == bVar11) {
                        i2 = (s5Var.v() - next.M.g) - next.O.g;
                        bVar2 = r5.b.FIXED;
                    } else {
                        i2 = v;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, i, bVar2, i2);
                    next.d.e.d(next.U());
                    next.e.e.d(next.v());
                    next.a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = r5.b.WRAP_CONTENT) || bVar10 == r5.b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int v2 = next.v();
                            r5.b bVar12 = r5.b.FIXED;
                            l(next, bVar12, (int) ((v2 * next.a0) + 0.5f), bVar12, v2);
                            next.d.e.d(next.U());
                            next.e.e.d(next.v());
                            next.a = true;
                        } else if (i3 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.d.e.m = next.U();
                        } else if (i3 == 2) {
                            r5.b[] bVarArr2 = s5Var.W;
                            r5.b bVar13 = bVarArr2[0];
                            r5.b bVar14 = r5.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                l(next, bVar14, (int) ((next.y * s5Var.U()) + 0.5f), bVar10, next.v());
                                next.d.e.d(next.U());
                                next.e.e.d(next.v());
                                next.a = true;
                            }
                        } else {
                            q5[] q5VarArr = next.T;
                            if (q5VarArr[0].f == null || q5VarArr[1].f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.d.e.d(next.U());
                                next.e.e.d(next.v());
                                next.a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = r5.b.WRAP_CONTENT) || bVar9 == r5.b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int U2 = next.U();
                            float f = next.a0;
                            if (next.u() == -1) {
                                f = 1.0f / f;
                            }
                            r5.b bVar15 = r5.b.FIXED;
                            l(next, bVar15, U2, bVar15, (int) ((U2 * f) + 0.5f));
                            next.d.e.d(next.U());
                            next.e.e.d(next.v());
                            next.a = true;
                        } else if (i4 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.e.e.m = next.v();
                        } else if (i4 == 2) {
                            r5.b[] bVarArr3 = s5Var.W;
                            r5.b bVar16 = bVarArr3[1];
                            r5.b bVar17 = r5.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                l(next, bVar9, next.U(), bVar17, (int) ((next.B * s5Var.v()) + 0.5f));
                                next.d.e.d(next.U());
                                next.e.e.d(next.v());
                                next.a = true;
                            }
                        } else {
                            q5[] q5VarArr2 = next.T;
                            if (q5VarArr2[2].f == null || q5VarArr2[3].f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.d.e.d(next.U());
                                next.e.e.d(next.v());
                                next.a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i3 == 1 || i4 == 1) {
                            r5.b bVar18 = r5.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.d.e.m = next.U();
                            next.e.e.m = next.v();
                        } else if (i4 == 2 && i3 == 2) {
                            r5.b[] bVarArr4 = s5Var.W;
                            r5.b bVar19 = bVarArr4[0];
                            r5.b bVar20 = r5.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr4[1] == bVar20) {
                                l(next, bVar20, (int) ((next.y * s5Var.U()) + 0.5f), bVar20, (int) ((next.B * s5Var.v()) + 0.5f));
                                next.d.e.d(next.U());
                                next.e.e.d(next.v());
                                next.a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.e);
        this.h.clear();
        l6.d = 0;
        i(this.a.d, 0, this.h);
        i(this.a.e, 1, this.h);
        this.b = false;
    }

    public void d(ArrayList<o6> arrayList) {
        arrayList.clear();
        this.d.d.f();
        this.d.e.f();
        arrayList.add(this.d.d);
        arrayList.add(this.d.e);
        Iterator<r5> it = this.d.v0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            r5 next = it.next();
            if (next instanceof t5) {
                arrayList.add(new i6(next));
            } else {
                if (next.g0()) {
                    if (next.b == null) {
                        next.b = new b6(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.i0()) {
                    if (next.c == null) {
                        next.c = new b6(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof v5) {
                    arrayList.add(new j6(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o6> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<o6> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o6 next2 = it3.next();
            if (next2.b != this.d) {
                next2.d();
            }
        }
    }

    public final int e(s5 s5Var, int i) {
        int size = this.h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.h.get(i2).b(s5Var, i));
        }
        return (int) j;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.b || this.c) {
            Iterator<r5> it = this.a.v0.iterator();
            while (it.hasNext()) {
                r5 next = it.next();
                next.l();
                next.a = false;
                next.d.r();
                next.e.q();
            }
            this.a.l();
            s5 s5Var = this.a;
            s5Var.a = false;
            s5Var.d.r();
            this.a.e.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.j1(0);
        this.a.k1(0);
        r5.b s = this.a.s(0);
        r5.b s2 = this.a.s(1);
        if (this.b) {
            c();
        }
        int V = this.a.V();
        int W = this.a.W();
        this.a.d.h.d(V);
        this.a.e.h.d(W);
        m();
        r5.b bVar = r5.b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator<o6> it2 = this.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && s == r5.b.WRAP_CONTENT) {
                this.a.M0(r5.b.FIXED);
                s5 s5Var2 = this.a;
                s5Var2.h1(e(s5Var2, 0));
                s5 s5Var3 = this.a;
                s5Var3.d.e.d(s5Var3.U());
            }
            if (z4 && s2 == r5.b.WRAP_CONTENT) {
                this.a.d1(r5.b.FIXED);
                s5 s5Var4 = this.a;
                s5Var4.I0(e(s5Var4, 1));
                s5 s5Var5 = this.a;
                s5Var5.e.e.d(s5Var5.v());
            }
        }
        s5 s5Var6 = this.a;
        r5.b[] bVarArr = s5Var6.W;
        r5.b bVar2 = bVarArr[0];
        r5.b bVar3 = r5.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == r5.b.MATCH_PARENT) {
            int U = s5Var6.U() + V;
            this.a.d.i.d(U);
            this.a.d.e.d(U - V);
            m();
            s5 s5Var7 = this.a;
            r5.b[] bVarArr2 = s5Var7.W;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == r5.b.MATCH_PARENT) {
                int v = s5Var7.v() + W;
                this.a.e.i.d(v);
                this.a.e.e.d(v - W);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<o6> it3 = this.e.iterator();
        while (it3.hasNext()) {
            o6 next2 = it3.next();
            if (next2.b != this.a || next2.g) {
                next2.e();
            }
        }
        Iterator<o6> it4 = this.e.iterator();
        while (it4.hasNext()) {
            o6 next3 = it4.next();
            if (z2 || next3.b != this.a) {
                if (!next3.h.j || ((!next3.i.j && !(next3 instanceof i6)) || (!next3.e.j && !(next3 instanceof b6) && !(next3 instanceof i6)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.M0(s);
        this.a.d1(s2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            Iterator<r5> it = this.a.v0.iterator();
            while (it.hasNext()) {
                r5 next = it.next();
                next.l();
                next.a = false;
                k6 k6Var = next.d;
                k6Var.e.j = false;
                k6Var.g = false;
                k6Var.r();
                m6 m6Var = next.e;
                m6Var.e.j = false;
                m6Var.g = false;
                m6Var.q();
            }
            this.a.l();
            s5 s5Var = this.a;
            s5Var.a = false;
            k6 k6Var2 = s5Var.d;
            k6Var2.e.j = false;
            k6Var2.g = false;
            k6Var2.r();
            m6 m6Var2 = this.a.e;
            m6Var2.e.j = false;
            m6Var2.g = false;
            m6Var2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.j1(0);
        this.a.k1(0);
        this.a.d.h.d(0);
        this.a.e.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        r5.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        r5.b s = this.a.s(0);
        r5.b s2 = this.a.s(1);
        int V = this.a.V();
        int W = this.a.W();
        if (z4 && (s == (bVar = r5.b.WRAP_CONTENT) || s2 == bVar)) {
            Iterator<o6> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o6 next = it.next();
                if (next.f == i && !next.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && s == r5.b.WRAP_CONTENT) {
                    this.a.M0(r5.b.FIXED);
                    s5 s5Var = this.a;
                    s5Var.h1(e(s5Var, 0));
                    s5 s5Var2 = this.a;
                    s5Var2.d.e.d(s5Var2.U());
                }
            } else if (z4 && s2 == r5.b.WRAP_CONTENT) {
                this.a.d1(r5.b.FIXED);
                s5 s5Var3 = this.a;
                s5Var3.I0(e(s5Var3, 1));
                s5 s5Var4 = this.a;
                s5Var4.e.e.d(s5Var4.v());
            }
        }
        if (i == 0) {
            s5 s5Var5 = this.a;
            r5.b[] bVarArr = s5Var5.W;
            if (bVarArr[0] == r5.b.FIXED || bVarArr[0] == r5.b.MATCH_PARENT) {
                int U = s5Var5.U() + V;
                this.a.d.i.d(U);
                this.a.d.e.d(U - V);
                z2 = true;
            }
            z2 = false;
        } else {
            s5 s5Var6 = this.a;
            r5.b[] bVarArr2 = s5Var6.W;
            if (bVarArr2[1] == r5.b.FIXED || bVarArr2[1] == r5.b.MATCH_PARENT) {
                int v = s5Var6.v() + W;
                this.a.e.i.d(v);
                this.a.e.e.d(v - W);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator<o6> it2 = this.e.iterator();
        while (it2.hasNext()) {
            o6 next2 = it2.next();
            if (next2.f == i && (next2.b != this.a || next2.g)) {
                next2.e();
            }
        }
        Iterator<o6> it3 = this.e.iterator();
        while (it3.hasNext()) {
            o6 next3 = it3.next();
            if (next3.f == i && (z2 || next3.b != this.a)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof b6) && !next3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.M0(s);
        this.a.d1(s2);
        return z3;
    }

    public final void i(o6 o6Var, int i, ArrayList<l6> arrayList) {
        for (c6 c6Var : o6Var.h.k) {
            if (c6Var instanceof e6) {
                a((e6) c6Var, i, 0, o6Var.i, arrayList, null);
            } else if (c6Var instanceof o6) {
                a(((o6) c6Var).h, i, 0, o6Var.i, arrayList, null);
            }
        }
        for (c6 c6Var2 : o6Var.i.k) {
            if (c6Var2 instanceof e6) {
                a((e6) c6Var2, i, 1, o6Var.h, arrayList, null);
            } else if (c6Var2 instanceof o6) {
                a(((o6) c6Var2).i, i, 1, o6Var.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (c6 c6Var3 : ((m6) o6Var).k.k) {
                if (c6Var3 instanceof e6) {
                    a((e6) c6Var3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public final void l(r5 r5Var, r5.b bVar, int i, r5.b bVar2, int i2) {
        a6.a aVar = this.g;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.f.b(r5Var, aVar);
        r5Var.h1(this.g.e);
        r5Var.I0(this.g.f);
        r5Var.H0(this.g.h);
        r5Var.x0(this.g.g);
    }

    public void m() {
        f6 f6Var;
        Iterator<r5> it = this.a.v0.iterator();
        while (it.hasNext()) {
            r5 next = it.next();
            if (!next.a) {
                r5.b[] bVarArr = next.W;
                boolean z = false;
                r5.b bVar = bVarArr[0];
                r5.b bVar2 = bVarArr[1];
                int i = next.t;
                int i2 = next.u;
                r5.b bVar3 = r5.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == r5.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == r5.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                f6 f6Var2 = next.d.e;
                boolean z3 = f6Var2.j;
                f6 f6Var3 = next.e.e;
                boolean z4 = f6Var3.j;
                if (z3 && z4) {
                    r5.b bVar4 = r5.b.FIXED;
                    l(next, bVar4, f6Var2.g, bVar4, f6Var3.g);
                    next.a = true;
                } else if (z3 && z) {
                    l(next, r5.b.FIXED, f6Var2.g, bVar3, f6Var3.g);
                    if (bVar2 == r5.b.MATCH_CONSTRAINT) {
                        next.e.e.m = next.v();
                    } else {
                        next.e.e.d(next.v());
                        next.a = true;
                    }
                } else if (z4 && z2) {
                    l(next, bVar3, f6Var2.g, r5.b.FIXED, f6Var3.g);
                    if (bVar == r5.b.MATCH_CONSTRAINT) {
                        next.d.e.m = next.U();
                    } else {
                        next.d.e.d(next.U());
                        next.a = true;
                    }
                }
                if (next.a && (f6Var = next.e.l) != null) {
                    f6Var.d(next.n());
                }
            }
        }
    }

    public void n(a6.b bVar) {
        this.f = bVar;
    }
}
