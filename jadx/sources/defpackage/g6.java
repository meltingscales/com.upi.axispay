package defpackage;

import defpackage.a6;
import defpackage.q5;
import defpackage.r5;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: g6  reason: default package */
/* loaded from: classes.dex */
public class g6 {
    public static a6.a a = new a6.a();
    public static int b = 0;
    public static int c = 0;

    public static boolean a(int i, r5 r5Var) {
        r5.b bVar;
        r5.b bVar2;
        r5.b y = r5Var.y();
        r5.b R = r5Var.R();
        s5 s5Var = r5Var.I() != null ? (s5) r5Var.I() : null;
        if (s5Var != null) {
            s5Var.y();
            r5.b bVar3 = r5.b.FIXED;
        }
        if (s5Var != null) {
            s5Var.R();
            r5.b bVar4 = r5.b.FIXED;
        }
        r5.b bVar5 = r5.b.FIXED;
        boolean z = y == bVar5 || r5Var.l0() || y == r5.b.WRAP_CONTENT || (y == (bVar2 = r5.b.MATCH_CONSTRAINT) && r5Var.t == 0 && r5Var.a0 == 0.0f && r5Var.Y(0)) || (y == bVar2 && r5Var.t == 1 && r5Var.b0(0, r5Var.U()));
        boolean z2 = R == bVar5 || r5Var.m0() || R == r5.b.WRAP_CONTENT || (R == (bVar = r5.b.MATCH_CONSTRAINT) && r5Var.u == 0 && r5Var.a0 == 0.0f && r5Var.Y(1)) || (R == bVar && r5Var.u == 1 && r5Var.b0(1, r5Var.v()));
        if (r5Var.a0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(int i, r5 r5Var, a6.b bVar, boolean z) {
        q5 q5Var;
        q5 q5Var2;
        q5 q5Var3;
        q5 q5Var4;
        if (r5Var.e0()) {
            return;
        }
        boolean z2 = true;
        b++;
        if (!(r5Var instanceof s5) && r5Var.k0()) {
            int i2 = i + 1;
            if (a(i2, r5Var)) {
                s5.O1(i2, r5Var, bVar, new a6.a(), a6.a.k);
            }
        }
        q5 m = r5Var.m(q5.b.LEFT);
        q5 m2 = r5Var.m(q5.b.RIGHT);
        int d = m.d();
        int d2 = m2.d();
        if (m.c() != null && m.m()) {
            Iterator<q5> it = m.c().iterator();
            while (it.hasNext()) {
                q5 next = it.next();
                r5 r5Var2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, r5Var2);
                if (r5Var2.k0() && a2) {
                    s5.O1(i3, r5Var2, bVar, new a6.a(), a6.a.k);
                }
                boolean z3 = ((next == r5Var2.L && (q5Var4 = r5Var2.N.f) != null && q5Var4.m()) || (next == r5Var2.N && (q5Var3 = r5Var2.L.f) != null && q5Var3.m())) ? z2 : false;
                r5.b y = r5Var2.y();
                r5.b bVar2 = r5.b.MATCH_CONSTRAINT;
                if (y == bVar2 && !a2) {
                    if (r5Var2.y() == bVar2 && r5Var2.x >= 0 && r5Var2.w >= 0 && ((r5Var2.T() == 8 || (r5Var2.t == 0 && r5Var2.t() == 0.0f)) && !r5Var2.g0() && !r5Var2.j0() && z3 && !r5Var2.g0())) {
                        e(i3, r5Var, bVar, r5Var2, z);
                    }
                } else if (!r5Var2.k0()) {
                    q5 q5Var5 = r5Var2.L;
                    if (next == q5Var5 && r5Var2.N.f == null) {
                        int e = q5Var5.e() + d;
                        r5Var2.C0(e, r5Var2.U() + e);
                        b(i3, r5Var2, bVar, z);
                    } else {
                        q5 q5Var6 = r5Var2.N;
                        if (next == q5Var6 && q5Var5.f == null) {
                            int e2 = d - q5Var6.e();
                            r5Var2.C0(e2 - r5Var2.U(), e2);
                            b(i3, r5Var2, bVar, z);
                        } else if (z3 && !r5Var2.g0()) {
                            d(i3, bVar, r5Var2, z);
                        }
                    }
                }
                z2 = true;
            }
        }
        if (r5Var instanceof t5) {
            return;
        }
        if (m2.c() != null && m2.m()) {
            Iterator<q5> it2 = m2.c().iterator();
            while (it2.hasNext()) {
                q5 next2 = it2.next();
                r5 r5Var3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, r5Var3);
                if (r5Var3.k0() && a3) {
                    s5.O1(i4, r5Var3, bVar, new a6.a(), a6.a.k);
                }
                boolean z4 = (next2 == r5Var3.L && (q5Var2 = r5Var3.N.f) != null && q5Var2.m()) || (next2 == r5Var3.N && (q5Var = r5Var3.L.f) != null && q5Var.m());
                r5.b y2 = r5Var3.y();
                r5.b bVar3 = r5.b.MATCH_CONSTRAINT;
                if (y2 == bVar3 && !a3) {
                    if (r5Var3.y() == bVar3 && r5Var3.x >= 0 && r5Var3.w >= 0 && (r5Var3.T() == 8 || (r5Var3.t == 0 && r5Var3.t() == 0.0f))) {
                        if (!r5Var3.g0() && !r5Var3.j0() && z4 && !r5Var3.g0()) {
                            e(i4, r5Var, bVar, r5Var3, z);
                        }
                    }
                } else if (!r5Var3.k0()) {
                    q5 q5Var7 = r5Var3.L;
                    if (next2 == q5Var7 && r5Var3.N.f == null) {
                        int e3 = q5Var7.e() + d2;
                        r5Var3.C0(e3, r5Var3.U() + e3);
                        b(i4, r5Var3, bVar, z);
                    } else {
                        q5 q5Var8 = r5Var3.N;
                        if (next2 == q5Var8 && q5Var7.f == null) {
                            int e4 = d2 - q5Var8.e();
                            r5Var3.C0(e4 - r5Var3.U(), e4);
                            b(i4, r5Var3, bVar, z);
                        } else if (z4 && !r5Var3.g0()) {
                            d(i4, bVar, r5Var3, z);
                        }
                    }
                }
            }
        }
        r5Var.o0();
    }

    public static void c(int i, n5 n5Var, a6.b bVar, int i2, boolean z) {
        if (n5Var.q1()) {
            if (i2 == 0) {
                b(i + 1, n5Var, bVar, z);
            } else {
                i(i + 1, n5Var, bVar);
            }
        }
    }

    public static void d(int i, a6.b bVar, r5 r5Var, boolean z) {
        float w = r5Var.w();
        int d = r5Var.L.f.d();
        int d2 = r5Var.N.f.d();
        int e = r5Var.L.e() + d;
        int e2 = d2 - r5Var.N.e();
        if (d == d2) {
            w = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int U = r5Var.U();
        int i2 = (d2 - d) - U;
        if (d > d2) {
            i2 = (d - d2) - U;
        }
        int i3 = ((int) (i2 > 0 ? (w * i2) + 0.5f : w * i2)) + d;
        int i4 = i3 + U;
        if (d > d2) {
            i4 = i3 - U;
        }
        r5Var.C0(i3, i4);
        b(i + 1, r5Var, bVar, z);
    }

    public static void e(int i, r5 r5Var, a6.b bVar, r5 r5Var2, boolean z) {
        int U;
        float w = r5Var2.w();
        int d = r5Var2.L.f.d() + r5Var2.L.e();
        int d2 = r5Var2.N.f.d() - r5Var2.N.e();
        if (d2 >= d) {
            int U2 = r5Var2.U();
            if (r5Var2.T() != 8) {
                int i2 = r5Var2.t;
                if (i2 == 2) {
                    if (r5Var instanceof s5) {
                        U = r5Var.U();
                    } else {
                        U = r5Var.I().U();
                    }
                    U2 = (int) (r5Var2.w() * 0.5f * U);
                } else if (i2 == 0) {
                    U2 = d2 - d;
                }
                U2 = Math.max(r5Var2.w, U2);
                int i3 = r5Var2.x;
                if (i3 > 0) {
                    U2 = Math.min(i3, U2);
                }
            }
            int i4 = d + ((int) ((w * ((d2 - d) - U2)) + 0.5f));
            r5Var2.C0(i4, U2 + i4);
            b(i + 1, r5Var2, bVar, z);
        }
    }

    public static void f(int i, a6.b bVar, r5 r5Var) {
        float P = r5Var.P();
        int d = r5Var.M.f.d();
        int d2 = r5Var.O.f.d();
        int e = r5Var.M.e() + d;
        int e2 = d2 - r5Var.O.e();
        if (d == d2) {
            P = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int v = r5Var.v();
        int i2 = (d2 - d) - v;
        if (d > d2) {
            i2 = (d - d2) - v;
        }
        int i3 = (int) (i2 > 0 ? (P * i2) + 0.5f : P * i2);
        int i4 = d + i3;
        int i5 = i4 + v;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - v;
        }
        r5Var.F0(i4, i5);
        i(i + 1, r5Var, bVar);
    }

    public static void g(int i, r5 r5Var, a6.b bVar, r5 r5Var2) {
        int v;
        float P = r5Var2.P();
        int d = r5Var2.M.f.d() + r5Var2.M.e();
        int d2 = r5Var2.O.f.d() - r5Var2.O.e();
        if (d2 >= d) {
            int v2 = r5Var2.v();
            if (r5Var2.T() != 8) {
                int i2 = r5Var2.u;
                if (i2 == 2) {
                    if (r5Var instanceof s5) {
                        v = r5Var.v();
                    } else {
                        v = r5Var.I().v();
                    }
                    v2 = (int) (P * 0.5f * v);
                } else if (i2 == 0) {
                    v2 = d2 - d;
                }
                v2 = Math.max(r5Var2.z, v2);
                int i3 = r5Var2.A;
                if (i3 > 0) {
                    v2 = Math.min(i3, v2);
                }
            }
            int i4 = d + ((int) ((P * ((d2 - d) - v2)) + 0.5f));
            r5Var2.F0(i4, v2 + i4);
            i(i + 1, r5Var2, bVar);
        }
    }

    public static void h(s5 s5Var, a6.b bVar) {
        r5.b y = s5Var.y();
        r5.b R = s5Var.R();
        b = 0;
        c = 0;
        s5Var.s0();
        ArrayList<r5> o1 = s5Var.o1();
        int size = o1.size();
        for (int i = 0; i < size; i++) {
            o1.get(i).s0();
        }
        boolean L1 = s5Var.L1();
        if (y == r5.b.FIXED) {
            s5Var.C0(0, s5Var.U());
        } else {
            s5Var.D0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            r5 r5Var = o1.get(i2);
            if (r5Var instanceof t5) {
                t5 t5Var = (t5) r5Var;
                if (t5Var.p1() == 1) {
                    if (t5Var.q1() != -1) {
                        t5Var.t1(t5Var.q1());
                    } else if (t5Var.r1() != -1 && s5Var.l0()) {
                        t5Var.t1(s5Var.U() - t5Var.r1());
                    } else if (s5Var.l0()) {
                        t5Var.t1((int) ((t5Var.s1() * s5Var.U()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((r5Var instanceof n5) && ((n5) r5Var).u1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                r5 r5Var2 = o1.get(i3);
                if (r5Var2 instanceof t5) {
                    t5 t5Var2 = (t5) r5Var2;
                    if (t5Var2.p1() == 1) {
                        b(0, t5Var2, bVar, L1);
                    }
                }
            }
        }
        b(0, s5Var, bVar, L1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                r5 r5Var3 = o1.get(i4);
                if (r5Var3 instanceof n5) {
                    n5 n5Var = (n5) r5Var3;
                    if (n5Var.u1() == 0) {
                        c(0, n5Var, bVar, 0, L1);
                    }
                }
            }
        }
        if (R == r5.b.FIXED) {
            s5Var.F0(0, s5Var.v());
        } else {
            s5Var.E0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            r5 r5Var4 = o1.get(i5);
            if (r5Var4 instanceof t5) {
                t5 t5Var3 = (t5) r5Var4;
                if (t5Var3.p1() == 0) {
                    if (t5Var3.q1() != -1) {
                        t5Var3.t1(t5Var3.q1());
                    } else if (t5Var3.r1() != -1 && s5Var.m0()) {
                        t5Var3.t1(s5Var.v() - t5Var3.r1());
                    } else if (s5Var.m0()) {
                        t5Var3.t1((int) ((t5Var3.s1() * s5Var.v()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((r5Var4 instanceof n5) && ((n5) r5Var4).u1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                r5 r5Var5 = o1.get(i6);
                if (r5Var5 instanceof t5) {
                    t5 t5Var4 = (t5) r5Var5;
                    if (t5Var4.p1() == 0) {
                        i(1, t5Var4, bVar);
                    }
                }
            }
        }
        i(0, s5Var, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                r5 r5Var6 = o1.get(i7);
                if (r5Var6 instanceof n5) {
                    n5 n5Var2 = (n5) r5Var6;
                    if (n5Var2.u1() == 1) {
                        c(0, n5Var2, bVar, 1, L1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            r5 r5Var7 = o1.get(i8);
            if (r5Var7.k0() && a(0, r5Var7)) {
                s5.O1(0, r5Var7, bVar, a, a6.a.k);
                if (r5Var7 instanceof t5) {
                    if (((t5) r5Var7).p1() == 0) {
                        i(0, r5Var7, bVar);
                    } else {
                        b(0, r5Var7, bVar, L1);
                    }
                } else {
                    b(0, r5Var7, bVar, L1);
                    i(0, r5Var7, bVar);
                }
            }
        }
    }

    public static void i(int i, r5 r5Var, a6.b bVar) {
        q5 q5Var;
        q5 q5Var2;
        q5 q5Var3;
        q5 q5Var4;
        if (r5Var.n0()) {
            return;
        }
        c++;
        if (!(r5Var instanceof s5) && r5Var.k0()) {
            int i2 = i + 1;
            if (a(i2, r5Var)) {
                s5.O1(i2, r5Var, bVar, new a6.a(), a6.a.k);
            }
        }
        q5 m = r5Var.m(q5.b.TOP);
        q5 m2 = r5Var.m(q5.b.BOTTOM);
        int d = m.d();
        int d2 = m2.d();
        if (m.c() != null && m.m()) {
            Iterator<q5> it = m.c().iterator();
            while (it.hasNext()) {
                q5 next = it.next();
                r5 r5Var2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, r5Var2);
                if (r5Var2.k0() && a2) {
                    s5.O1(i3, r5Var2, bVar, new a6.a(), a6.a.k);
                }
                boolean z = (next == r5Var2.M && (q5Var4 = r5Var2.O.f) != null && q5Var4.m()) || (next == r5Var2.O && (q5Var3 = r5Var2.M.f) != null && q5Var3.m());
                r5.b R = r5Var2.R();
                r5.b bVar2 = r5.b.MATCH_CONSTRAINT;
                if (R == bVar2 && !a2) {
                    if (r5Var2.R() == bVar2 && r5Var2.A >= 0 && r5Var2.z >= 0 && (r5Var2.T() == 8 || (r5Var2.u == 0 && r5Var2.t() == 0.0f))) {
                        if (!r5Var2.i0() && !r5Var2.j0() && z && !r5Var2.i0()) {
                            g(i3, r5Var, bVar, r5Var2);
                        }
                    }
                } else if (!r5Var2.k0()) {
                    q5 q5Var5 = r5Var2.M;
                    if (next == q5Var5 && r5Var2.O.f == null) {
                        int e = q5Var5.e() + d;
                        r5Var2.F0(e, r5Var2.v() + e);
                        i(i3, r5Var2, bVar);
                    } else {
                        q5 q5Var6 = r5Var2.O;
                        if (next == q5Var6 && q5Var5.f == null) {
                            int e2 = d - q5Var6.e();
                            r5Var2.F0(e2 - r5Var2.v(), e2);
                            i(i3, r5Var2, bVar);
                        } else if (z && !r5Var2.i0()) {
                            f(i3, bVar, r5Var2);
                        }
                    }
                }
            }
        }
        if (r5Var instanceof t5) {
            return;
        }
        if (m2.c() != null && m2.m()) {
            Iterator<q5> it2 = m2.c().iterator();
            while (it2.hasNext()) {
                q5 next2 = it2.next();
                r5 r5Var3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, r5Var3);
                if (r5Var3.k0() && a3) {
                    s5.O1(i4, r5Var3, bVar, new a6.a(), a6.a.k);
                }
                boolean z2 = (next2 == r5Var3.M && (q5Var2 = r5Var3.O.f) != null && q5Var2.m()) || (next2 == r5Var3.O && (q5Var = r5Var3.M.f) != null && q5Var.m());
                r5.b R2 = r5Var3.R();
                r5.b bVar3 = r5.b.MATCH_CONSTRAINT;
                if (R2 == bVar3 && !a3) {
                    if (r5Var3.R() == bVar3 && r5Var3.A >= 0 && r5Var3.z >= 0 && (r5Var3.T() == 8 || (r5Var3.u == 0 && r5Var3.t() == 0.0f))) {
                        if (!r5Var3.i0() && !r5Var3.j0() && z2 && !r5Var3.i0()) {
                            g(i4, r5Var, bVar, r5Var3);
                        }
                    }
                } else if (!r5Var3.k0()) {
                    q5 q5Var7 = r5Var3.M;
                    if (next2 == q5Var7 && r5Var3.O.f == null) {
                        int e3 = q5Var7.e() + d2;
                        r5Var3.F0(e3, r5Var3.v() + e3);
                        i(i4, r5Var3, bVar);
                    } else {
                        q5 q5Var8 = r5Var3.O;
                        if (next2 == q5Var8 && q5Var7.f == null) {
                            int e4 = d2 - q5Var8.e();
                            r5Var3.F0(e4 - r5Var3.v(), e4);
                            i(i4, r5Var3, bVar);
                        } else if (z2 && !r5Var3.i0()) {
                            f(i4, bVar, r5Var3);
                        }
                    }
                }
            }
        }
        q5 m3 = r5Var.m(q5.b.BASELINE);
        if (m3.c() != null && m3.m()) {
            int d3 = m3.d();
            Iterator<q5> it3 = m3.c().iterator();
            while (it3.hasNext()) {
                q5 next3 = it3.next();
                r5 r5Var4 = next3.d;
                int i5 = i + 1;
                boolean a4 = a(i5, r5Var4);
                if (r5Var4.k0() && a4) {
                    s5.O1(i5, r5Var4, bVar, new a6.a(), a6.a.k);
                }
                if (r5Var4.R() != r5.b.MATCH_CONSTRAINT || a4) {
                    if (!r5Var4.k0() && next3 == r5Var4.P) {
                        r5Var4.B0(next3.e() + d3);
                        i(i5, r5Var4, bVar);
                    }
                }
            }
        }
        r5Var.p0();
    }
}
