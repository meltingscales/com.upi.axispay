package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import defpackage.q5;
import defpackage.r5;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a6  reason: default package */
/* loaded from: classes.dex */
public class a6 {
    public final ArrayList<r5> a = new ArrayList<>();
    public a b = new a();
    public s5 c;

    /* compiled from: AxisPay */
    /* renamed from: a6$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int k;
        public static int l;
        public static int m;
        public r5.b a;
        public r5.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;

        static {
            C0059ao.a(a.class, 252);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a6$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(r5 r5Var, a aVar);
    }

    public a6(s5 s5Var) {
        this.c = s5Var;
    }

    public final boolean a(b bVar, r5 r5Var, int i) {
        this.b.a = r5Var.y();
        this.b.b = r5Var.R();
        this.b.c = r5Var.U();
        this.b.d = r5Var.v();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        r5.b bVar2 = aVar.a;
        r5.b bVar3 = r5.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.b == bVar3;
        boolean z3 = z && r5Var.a0 > 0.0f;
        boolean z4 = z2 && r5Var.a0 > 0.0f;
        if (z3 && r5Var.v[0] == 4) {
            aVar.a = r5.b.FIXED;
        }
        if (z4 && r5Var.v[1] == 4) {
            aVar.b = r5.b.FIXED;
        }
        bVar.b(r5Var, aVar);
        r5Var.h1(this.b.e);
        r5Var.I0(this.b.f);
        r5Var.H0(this.b.h);
        r5Var.x0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r8 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r5.a0 <= 0.0f) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.s5 r13) {
        /*
            r12 = this;
            java.util.ArrayList<r5> r0 = r13.v0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.P1(r1)
            a6$b r2 = r13.F1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<r5> r5 = r13.v0
            java.lang.Object r5 = r5.get(r4)
            r5 r5 = (defpackage.r5) r5
            boolean r6 = r5 instanceof defpackage.t5
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof defpackage.n5
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            k6 r6 = r5.d
            if (r6 == 0) goto L48
            m6 r7 = r5.e
            if (r7 == 0) goto L48
            f6 r6 = r6.e
            boolean r6 = r6.j
            if (r6 == 0) goto L48
            f6 r6 = r7.e
            boolean r6 = r6.j
            if (r6 == 0) goto L48
            goto Lac
        L48:
            r5$b r6 = r5.s(r3)
            r7 = 1
            r5$b r8 = r5.s(r7)
            r5$b r9 = defpackage.r5.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.t
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.u
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.P1(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof defpackage.x5
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.t
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.g0()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.u
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.a0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = defpackage.a6.a.k
            r12.a(r2, r5, r6)
            a5 r5 = r13.B0
            if (r5 == 0) goto Lac
            long r6 = r5.a
            r8 = 1
            long r6 = r6 + r8
            r5.a = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.b(s5):void");
    }

    public final void c(s5 s5Var, String str, int i, int i2, int i3) {
        int G = s5Var.G();
        int F = s5Var.F();
        s5Var.X0(0);
        s5Var.W0(0);
        s5Var.h1(i2);
        s5Var.I0(i3);
        s5Var.X0(G);
        s5Var.W0(F);
        this.c.T1(i);
        this.c.p1();
    }

    public long d(s5 s5Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        int i11;
        boolean z2;
        int i12;
        b bVar;
        int i13;
        int i14;
        int i15;
        boolean z3;
        a5 a5Var;
        b F1 = s5Var.F1();
        int size = s5Var.v0.size();
        int U = s5Var.U();
        int v = s5Var.v();
        boolean b2 = w5.b(i, Barcode.ITF);
        boolean z4 = b2 || w5.b(i, 64);
        if (z4) {
            for (int i16 = 0; i16 < size; i16++) {
                r5 r5Var = s5Var.v0.get(i16);
                r5.b y = r5Var.y();
                r5.b bVar2 = r5.b.MATCH_CONSTRAINT;
                boolean z5 = (y == bVar2) && (r5Var.R() == bVar2) && r5Var.t() > 0.0f;
                if ((r5Var.g0() && z5) || ((r5Var.i0() && z5) || (r5Var instanceof x5) || r5Var.g0() || r5Var.i0())) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4 && (a5Var = z4.x) != null) {
            a5Var.c++;
        }
        boolean z6 = z4 & ((i4 == 1073741824 && i6 == 1073741824) || b2);
        int i17 = 2;
        if (z6) {
            int min = Math.min(s5Var.E(), i5);
            int min2 = Math.min(s5Var.D(), i7);
            if (i4 == 1073741824 && s5Var.U() != min) {
                s5Var.h1(min);
                s5Var.I1();
            }
            if (i6 == 1073741824 && s5Var.v() != min2) {
                s5Var.I0(min2);
                s5Var.I1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = s5Var.C1(b2);
                i10 = 2;
            } else {
                boolean D1 = s5Var.D1(b2);
                if (i4 == 1073741824) {
                    D1 &= s5Var.E1(b2, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = s5Var.E1(b2, 1) & D1;
                    i10++;
                } else {
                    z = D1;
                }
            }
            if (z) {
                s5Var.m1(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        int G1 = s5Var.G1();
        if (size > 0) {
            b(s5Var);
        }
        e(s5Var);
        int size2 = this.a.size();
        if (size > 0) {
            c(s5Var, C0059ao.a(15732), 0, U, v);
        }
        if (size2 > 0) {
            r5.b y2 = s5Var.y();
            r5.b bVar3 = r5.b.WRAP_CONTENT;
            boolean z7 = y2 == bVar3;
            boolean z8 = s5Var.R() == bVar3;
            int max = Math.max(s5Var.U(), this.c.G());
            int max2 = Math.max(s5Var.v(), this.c.F());
            int i18 = 0;
            boolean z9 = false;
            while (i18 < size2) {
                r5 r5Var2 = this.a.get(i18);
                if (r5Var2 instanceof x5) {
                    int U2 = r5Var2.U();
                    i13 = G1;
                    int v2 = r5Var2.v();
                    i14 = v;
                    boolean a2 = a(F1, r5Var2, a.l) | z9;
                    a5 a5Var2 = s5Var.B0;
                    i15 = U;
                    if (a5Var2 != null) {
                        a5Var2.b++;
                    }
                    int U3 = r5Var2.U();
                    int v3 = r5Var2.v();
                    if (U3 != U2) {
                        r5Var2.h1(U3);
                        if (z7 && r5Var2.K() > max) {
                            max = Math.max(max, r5Var2.K() + r5Var2.m(q5.b.RIGHT).e());
                        }
                        z3 = true;
                    } else {
                        z3 = a2;
                    }
                    if (v3 != v2) {
                        r5Var2.I0(v3);
                        if (z8 && r5Var2.p() > max2) {
                            max2 = Math.max(max2, r5Var2.p() + r5Var2.m(q5.b.BOTTOM).e());
                        }
                        z3 = true;
                    }
                    z9 = z3 | ((x5) r5Var2).s1();
                } else {
                    i13 = G1;
                    i15 = U;
                    i14 = v;
                }
                i18++;
                G1 = i13;
                v = i14;
                U = i15;
                i17 = 2;
            }
            int i19 = G1;
            int i20 = U;
            int i21 = v;
            int i22 = i17;
            int i23 = 0;
            while (i23 < i22) {
                int i24 = 0;
                while (i24 < size2) {
                    r5 r5Var3 = this.a.get(i24);
                    if (((r5Var3 instanceof u5) && !(r5Var3 instanceof x5)) || (r5Var3 instanceof t5) || r5Var3.T() == 8 || ((z6 && r5Var3.d.e.j && r5Var3.e.e.j) || (r5Var3 instanceof x5))) {
                        z2 = z6;
                        i12 = size2;
                        bVar = F1;
                    } else {
                        int U4 = r5Var3.U();
                        int v4 = r5Var3.v();
                        int n = r5Var3.n();
                        int i25 = a.l;
                        z2 = z6;
                        if (i23 == 1) {
                            i25 = a.m;
                        }
                        boolean a3 = a(F1, r5Var3, i25) | z9;
                        a5 a5Var3 = s5Var.B0;
                        i12 = size2;
                        bVar = F1;
                        if (a5Var3 != null) {
                            a5Var3.b++;
                        }
                        int U5 = r5Var3.U();
                        int v5 = r5Var3.v();
                        if (U5 != U4) {
                            r5Var3.h1(U5);
                            if (z7 && r5Var3.K() > max) {
                                max = Math.max(max, r5Var3.K() + r5Var3.m(q5.b.RIGHT).e());
                            }
                            a3 = true;
                        }
                        if (v5 != v4) {
                            r5Var3.I0(v5);
                            if (z8 && r5Var3.p() > max2) {
                                max2 = Math.max(max2, r5Var3.p() + r5Var3.m(q5.b.BOTTOM).e());
                            }
                            a3 = true;
                        }
                        z9 = (!r5Var3.X() || n == r5Var3.n()) ? a3 : true;
                    }
                    i24++;
                    F1 = bVar;
                    z6 = z2;
                    size2 = i12;
                }
                boolean z10 = z6;
                int i26 = size2;
                b bVar4 = F1;
                if (!z9) {
                    break;
                }
                i23++;
                c(s5Var, C0059ao.a(15733), i23, i20, i21);
                F1 = bVar4;
                z6 = z10;
                size2 = i26;
                i22 = 2;
                z9 = false;
            }
            i11 = i19;
        } else {
            i11 = G1;
        }
        s5Var.S1(i11);
        return 0L;
    }

    public void e(s5 s5Var) {
        this.a.clear();
        int size = s5Var.v0.size();
        for (int i = 0; i < size; i++) {
            r5 r5Var = s5Var.v0.get(i);
            r5.b y = r5Var.y();
            r5.b bVar = r5.b.MATCH_CONSTRAINT;
            if (y == bVar || r5Var.R() == bVar) {
                this.a.add(r5Var);
            }
        }
        s5Var.I1();
    }
}
