package defpackage;

import defpackage.e5;
import defpackage.q5;
import java.util.Arrays;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: z4  reason: default package */
/* loaded from: classes.dex */
public class z4 {
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static int w;
    public static a5 x;
    public static long y;
    public static long z;
    public a d;
    public x4[] g;
    public final y4 n;
    public a q;
    public boolean a = false;
    public int b = 0;
    public HashMap<String, e5> c = null;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean i = false;
    public boolean[] j = new boolean[32];
    public int k = 1;
    public int l = 0;
    public int m = 32;
    public e5[] o = new e5[w];
    public int p = 0;

    /* compiled from: AxisPay */
    /* renamed from: z4$a */
    /* loaded from: classes.dex */
    public interface a {
        e5 a(z4 z4Var, boolean[] zArr);

        void b(e5 e5Var);

        void c(a aVar);

        void clear();

        e5 getKey();

        boolean isEmpty();
    }

    /* compiled from: AxisPay */
    /* renamed from: z4$b */
    /* loaded from: classes.dex */
    public class b extends x4 {
        public b(z4 z4Var, y4 y4Var) {
            this.e = new f5(this, y4Var);
        }
    }

    static {
        C0059ao.a(z4.class, 155);
    }

    public z4() {
        this.g = null;
        this.g = new x4[32];
        C();
        y4 y4Var = new y4();
        this.n = y4Var;
        this.d = new d5(y4Var);
        if (v) {
            this.q = new b(this, y4Var);
        } else {
            this.q = new x4(y4Var);
        }
    }

    public static x4 s(z4 z4Var, e5 e5Var, e5 e5Var2, float f) {
        x4 r2 = z4Var.r();
        r2.j(e5Var, e5Var2, f);
        return r2;
    }

    public static a5 w() {
        return x;
    }

    public void A(a aVar) throws Exception {
        a5 a5Var = x;
        if (a5Var != null) {
            a5Var.t++;
            a5Var.u = Math.max(a5Var.u, this.k);
            a5 a5Var2 = x;
            a5Var2.v = Math.max(a5Var2.v, this.l);
        }
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z2) {
        a5 a5Var = x;
        if (a5Var != null) {
            a5Var.h++;
        }
        for (int i = 0; i < this.k; i++) {
            this.j[i] = false;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            a5 a5Var2 = x;
            if (a5Var2 != null) {
                a5Var2.i++;
            }
            i2++;
            if (i2 >= this.k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().d] = true;
            }
            e5 a2 = aVar.a(this, this.j);
            if (a2 != null) {
                boolean[] zArr = this.j;
                int i3 = a2.d;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.l; i5++) {
                    x4 x4Var = this.g[i5];
                    if (x4Var.a.k != e5.a.UNRESTRICTED && !x4Var.f && x4Var.t(a2)) {
                        float d = x4Var.e.d(a2);
                        if (d < 0.0f) {
                            float f2 = (-x4Var.b) / d;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    x4 x4Var2 = this.g[i4];
                    x4Var2.a.e = -1;
                    a5 a5Var3 = x;
                    if (a5Var3 != null) {
                        a5Var3.j++;
                    }
                    x4Var2.x(a2);
                    e5 e5Var = x4Var2.a;
                    e5Var.e = i4;
                    e5Var.h(this, x4Var2);
                }
            } else {
                z3 = true;
            }
        }
        return i2;
    }

    public final void C() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                x4 x4Var = this.g[i];
                if (x4Var != null) {
                    this.n.a.a(x4Var);
                }
                this.g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            x4 x4Var2 = this.g[i];
            if (x4Var2 != null) {
                this.n.b.a(x4Var2);
            }
            this.g[i] = null;
            i++;
        }
    }

    public void D() {
        y4 y4Var;
        int i = 0;
        while (true) {
            y4Var = this.n;
            e5[] e5VarArr = y4Var.d;
            if (i >= e5VarArr.length) {
                break;
            }
            e5 e5Var = e5VarArr[i];
            if (e5Var != null) {
                e5Var.e();
            }
            i++;
        }
        y4Var.c.c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap<String, e5> hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.b = 0;
        this.d.clear();
        this.k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            x4[] x4VarArr = this.g;
            if (x4VarArr[i2] != null) {
                x4VarArr[i2].c = false;
            }
        }
        C();
        this.l = 0;
        if (v) {
            this.q = new b(this, this.n);
        } else {
            this.q = new x4(this.n);
        }
    }

    public final e5 a(e5.a aVar, String str) {
        e5 b2 = this.n.c.b();
        if (b2 == null) {
            b2 = new e5(aVar, str);
            b2.g(aVar, str);
        } else {
            b2.e();
            b2.g(aVar, str);
        }
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (e5[]) Arrays.copyOf(this.o, i3);
        }
        e5[] e5VarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        e5VarArr[i4] = b2;
        return b2;
    }

    public void b(r5 r5Var, r5 r5Var2, float f, int i) {
        q5.b bVar = q5.b.LEFT;
        e5 q = q(r5Var.m(bVar));
        q5.b bVar2 = q5.b.TOP;
        e5 q2 = q(r5Var.m(bVar2));
        q5.b bVar3 = q5.b.RIGHT;
        e5 q3 = q(r5Var.m(bVar3));
        q5.b bVar4 = q5.b.BOTTOM;
        e5 q4 = q(r5Var.m(bVar4));
        e5 q5 = q(r5Var2.m(bVar));
        e5 q6 = q(r5Var2.m(bVar2));
        e5 q7 = q(r5Var2.m(bVar3));
        e5 q8 = q(r5Var2.m(bVar4));
        x4 r2 = r();
        double d = f;
        double d2 = i;
        r2.q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        d(r2);
        x4 r3 = r();
        r3.q(q, q3, q5, q7, (float) (Math.cos(d) * d2));
        d(r3);
    }

    public void c(e5 e5Var, e5 e5Var2, int i, float f, e5 e5Var3, e5 e5Var4, int i2, int i3) {
        x4 r2 = r();
        r2.h(e5Var, e5Var2, i, f, e5Var3, e5Var4, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(defpackage.x4 r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            a5 r0 = defpackage.z4.x
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f
            long r3 = r3 + r1
            r0.f = r3
            boolean r3 = r8.f
            if (r3 == 0) goto L17
            long r3 = r0.g
            long r3 = r3 + r1
            r0.g = r3
        L17:
            int r0 = r7.l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.m
            if (r0 >= r4) goto L26
            int r0 = r7.k
            int r0 = r0 + r3
            int r4 = r7.f
            if (r0 < r4) goto L29
        L26:
            r7.y()
        L29:
            r0 = 0
            boolean r4 = r8.f
            if (r4 != 0) goto La1
            r8.D(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L38
            return
        L38:
            r8.r()
            boolean r4 = r8.f(r7)
            if (r4 == 0) goto L98
            e5 r4 = r7.p()
            r8.a = r4
            int r5 = r7.l
            r7.l(r8)
            int r6 = r7.l
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            z4$a r0 = r7.q
            r0.c(r8)
            z4$a r0 = r7.q
            r7.B(r0, r3)
            int r0 = r4.e
            r5 = -1
            if (r0 != r5) goto L99
            e5 r0 = r8.a
            if (r0 != r4) goto L76
            e5 r0 = r8.v(r4)
            if (r0 == 0) goto L76
            a5 r4 = defpackage.z4.x
            if (r4 == 0) goto L73
            long r5 = r4.j
            long r5 = r5 + r1
            r4.j = r5
        L73:
            r8.x(r0)
        L76:
            boolean r0 = r8.f
            if (r0 != 0) goto L7f
            e5 r0 = r8.a
            r0.h(r7, r8)
        L7f:
            boolean r0 = defpackage.z4.v
            if (r0 == 0) goto L8b
            y4 r0 = r7.n
            b5<x4> r0 = r0.a
            r0.a(r8)
            goto L92
        L8b:
            y4 r0 = r7.n
            b5<x4> r0 = r0.b
            r0.a(r8)
        L92:
            int r0 = r7.l
            int r0 = r0 - r3
            r7.l = r0
            goto L99
        L98:
            r3 = r0
        L99:
            boolean r0 = r8.s()
            if (r0 != 0) goto La0
            return
        La0:
            r0 = r3
        La1:
            if (r0 != 0) goto La6
            r7.l(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4.d(x4):void");
    }

    public x4 e(e5 e5Var, e5 e5Var2, int i, int i2) {
        if (s && i2 == 8 && e5Var2.h && e5Var.e == -1) {
            e5Var.f(this, e5Var2.g + i);
            return null;
        }
        x4 r2 = r();
        r2.n(e5Var, e5Var2, i);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
        return r2;
    }

    public void f(e5 e5Var, int i) {
        if (s && e5Var.e == -1) {
            float f = i;
            e5Var.f(this, f);
            for (int i2 = 0; i2 < this.b + 1; i2++) {
                e5 e5Var2 = this.n.d[i2];
                if (e5Var2 != null && e5Var2.o && e5Var2.p == e5Var.d) {
                    e5Var2.f(this, e5Var2.q + f);
                }
            }
            return;
        }
        int i3 = e5Var.e;
        if (i3 != -1) {
            x4 x4Var = this.g[i3];
            if (x4Var.f) {
                x4Var.b = i;
                return;
            } else if (x4Var.e.c() == 0) {
                x4Var.f = true;
                x4Var.b = i;
                return;
            } else {
                x4 r2 = r();
                r2.m(e5Var, i);
                d(r2);
                return;
            }
        }
        x4 r3 = r();
        r3.i(e5Var, i);
        d(r3);
    }

    public void g(e5 e5Var, e5 e5Var2, int i, boolean z2) {
        x4 r2 = r();
        e5 t2 = t();
        t2.f = 0;
        r2.o(e5Var, e5Var2, t2, i);
        d(r2);
    }

    public void h(e5 e5Var, e5 e5Var2, int i, int i2) {
        x4 r2 = r();
        e5 t2 = t();
        t2.f = 0;
        r2.o(e5Var, e5Var2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.d(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void i(e5 e5Var, e5 e5Var2, int i, boolean z2) {
        x4 r2 = r();
        e5 t2 = t();
        t2.f = 0;
        r2.p(e5Var, e5Var2, t2, i);
        d(r2);
    }

    public void j(e5 e5Var, e5 e5Var2, int i, int i2) {
        x4 r2 = r();
        e5 t2 = t();
        t2.f = 0;
        r2.p(e5Var, e5Var2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.d(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void k(e5 e5Var, e5 e5Var2, e5 e5Var3, e5 e5Var4, float f, int i) {
        x4 r2 = r();
        r2.k(e5Var, e5Var2, e5Var3, e5Var4, f);
        if (i != 8) {
            r2.d(this, i);
        }
        d(r2);
    }

    public final void l(x4 x4Var) {
        int i;
        if (t && x4Var.f) {
            x4Var.a.f(this, x4Var.b);
        } else {
            x4[] x4VarArr = this.g;
            int i2 = this.l;
            x4VarArr[i2] = x4Var;
            e5 e5Var = x4Var.a;
            e5Var.e = i2;
            this.l = i2 + 1;
            e5Var.h(this, x4Var);
        }
        if (t && this.a) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.g[i3] == null) {
                    System.out.println(C0059ao.a(6748));
                }
                x4[] x4VarArr2 = this.g;
                if (x4VarArr2[i3] != null && x4VarArr2[i3].f) {
                    x4 x4Var2 = x4VarArr2[i3];
                    x4Var2.a.f(this, x4Var2.b);
                    if (v) {
                        this.n.a.a(x4Var2);
                    } else {
                        this.n.b.a(x4Var2);
                    }
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        x4[] x4VarArr3 = this.g;
                        int i6 = i4 - 1;
                        x4VarArr3[i6] = x4VarArr3[i4];
                        if (x4VarArr3[i6].a.e == i4) {
                            x4VarArr3[i6].a.e = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public void m(x4 x4Var, int i, int i2) {
        x4Var.e(o(i2, null), i);
    }

    public final void n() {
        for (int i = 0; i < this.l; i++) {
            x4 x4Var = this.g[i];
            x4Var.a.g = x4Var.b;
        }
    }

    public e5 o(int i, String str) {
        a5 a5Var = x;
        if (a5Var != null) {
            a5Var.l++;
        }
        if (this.k + 1 >= this.f) {
            y();
        }
        e5 a2 = a(e5.a.ERROR, str);
        int i2 = this.b + 1;
        this.b = i2;
        this.k++;
        a2.d = i2;
        a2.f = i;
        this.n.d[i2] = a2;
        this.d.b(a2);
        return a2;
    }

    public e5 p() {
        a5 a5Var = x;
        if (a5Var != null) {
            a5Var.n++;
        }
        if (this.k + 1 >= this.f) {
            y();
        }
        e5 a2 = a(e5.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.d = i;
        this.n.d[i] = a2;
        return a2;
    }

    public e5 q(Object obj) {
        e5 e5Var = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            y();
        }
        if (obj instanceof q5) {
            q5 q5Var = (q5) obj;
            e5Var = q5Var.h();
            if (e5Var == null) {
                q5Var.r(this.n);
                e5Var = q5Var.h();
            }
            int i = e5Var.d;
            if (i == -1 || i > this.b || this.n.d[i] == null) {
                if (i != -1) {
                    e5Var.e();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.k++;
                e5Var.d = i2;
                e5Var.k = e5.a.UNRESTRICTED;
                this.n.d[i2] = e5Var;
            }
        }
        return e5Var;
    }

    public x4 r() {
        x4 b2;
        if (v) {
            b2 = this.n.a.b();
            if (b2 == null) {
                b2 = new b(this, this.n);
                z++;
            } else {
                b2.y();
            }
        } else {
            b2 = this.n.b.b();
            if (b2 == null) {
                b2 = new x4(this.n);
                y++;
            } else {
                b2.y();
            }
        }
        e5.c();
        return b2;
    }

    public e5 t() {
        a5 a5Var = x;
        if (a5Var != null) {
            a5Var.m++;
        }
        if (this.k + 1 >= this.f) {
            y();
        }
        e5 a2 = a(e5.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        a2.d = i;
        this.n.d[i] = a2;
        return a2;
    }

    public final int u(a aVar) throws Exception {
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= this.l) {
                z2 = false;
                break;
            }
            x4[] x4VarArr = this.g;
            if (x4VarArr[i].a.k != e5.a.UNRESTRICTED && x4VarArr[i].b < 0.0f) {
                z2 = true;
                break;
            }
            i++;
        }
        if (z2) {
            boolean z3 = false;
            int i2 = 0;
            while (!z3) {
                a5 a5Var = x;
                if (a5Var != null) {
                    a5Var.k++;
                }
                i2++;
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.l; i6++) {
                    x4 x4Var = this.g[i6];
                    if (x4Var.a.k != e5.a.UNRESTRICTED && !x4Var.f && x4Var.b < 0.0f) {
                        int i7 = 9;
                        if (u) {
                            int c = x4Var.e.c();
                            int i8 = 0;
                            while (i8 < c) {
                                e5 h = x4Var.e.h(i8);
                                float d = x4Var.e.d(h);
                                if (d > 0.0f) {
                                    int i9 = 0;
                                    while (i9 < i7) {
                                        float f2 = h.i[i9] / d;
                                        if ((f2 < f && i9 == i5) || i9 > i5) {
                                            i4 = h.d;
                                            i5 = i9;
                                            i3 = i6;
                                            f = f2;
                                        }
                                        i9++;
                                        i7 = 9;
                                    }
                                }
                                i8++;
                                i7 = 9;
                            }
                        } else {
                            for (int i10 = 1; i10 < this.k; i10++) {
                                e5 e5Var = this.n.d[i10];
                                float d2 = x4Var.e.d(e5Var);
                                if (d2 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f3 = e5Var.i[i11] / d2;
                                        if ((f3 < f && i11 == i5) || i11 > i5) {
                                            i4 = i10;
                                            i5 = i11;
                                            i3 = i6;
                                            f = f3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    x4 x4Var2 = this.g[i3];
                    x4Var2.a.e = -1;
                    a5 a5Var2 = x;
                    if (a5Var2 != null) {
                        a5Var2.j++;
                    }
                    x4Var2.x(this.n.d[i4]);
                    e5 e5Var2 = x4Var2.a;
                    e5Var2.e = i3;
                    e5Var2.h(this, x4Var2);
                } else {
                    z3 = true;
                }
                if (i2 > this.k / 2) {
                    z3 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    public y4 v() {
        return this.n;
    }

    public int x(Object obj) {
        e5 h = ((q5) obj).h();
        if (h != null) {
            return (int) (h.g + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i = this.e * 2;
        this.e = i;
        this.g = (x4[]) Arrays.copyOf(this.g, i);
        y4 y4Var = this.n;
        y4Var.d = (e5[]) Arrays.copyOf(y4Var.d, this.e);
        int i2 = this.e;
        this.j = new boolean[i2];
        this.f = i2;
        this.m = i2;
        a5 a5Var = x;
        if (a5Var != null) {
            a5Var.d++;
            a5Var.o = Math.max(a5Var.o, i2);
            a5 a5Var2 = x;
            a5Var2.x = a5Var2.o;
        }
    }

    public void z() throws Exception {
        a5 a5Var = x;
        if (a5Var != null) {
            a5Var.e++;
        }
        if (this.d.isEmpty()) {
            n();
        } else if (!this.h && !this.i) {
            A(this.d);
        } else {
            a5 a5Var2 = x;
            if (a5Var2 != null) {
                a5Var2.q++;
            }
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= this.l) {
                    z2 = true;
                    break;
                } else if (!this.g[i].f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z2) {
                A(this.d);
                return;
            }
            a5 a5Var3 = x;
            if (a5Var3 != null) {
                a5Var3.p++;
            }
            n();
        }
    }
}
