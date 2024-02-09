package defpackage;

import com.google.android.gms.common.api.Api;
import defpackage.q5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r5  reason: default package */
/* loaded from: classes.dex */
public class r5 {
    public static float u0;
    public int A;
    public float B;
    public int C;
    public float D;
    public int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public q5 L;
    public q5 M;
    public q5 N;
    public q5 O;
    public q5 P;
    public q5 Q;
    public q5 R;
    public q5 S;
    public q5[] T;
    public ArrayList<q5> U;
    public boolean[] V;
    public b[] W;
    public r5 X;
    public int Y;
    public int Z;
    public float a0;
    public b6 b;
    public int b0;
    public b6 c;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public float h0;
    public float i0;
    public Object j0;
    public int k0;
    public String l;
    public String l0;
    public boolean m;
    public String m0;
    public boolean n;
    public int n0;
    public boolean o;
    public int o0;
    public boolean p;
    public float[] p0;
    public int q;
    public r5[] q0;
    public int r;
    public r5[] r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public int u;
    public int[] v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean a = false;
    public k6 d = null;
    public m6 e = null;
    public boolean[] f = {true, true};
    public boolean g = true;
    public boolean h = false;
    public boolean i = true;
    public int j = -1;
    public int k = -1;

    /* compiled from: AxisPay */
    /* renamed from: r5$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[q5.b.values().length];
            a = iArr2;
            try {
                iArr2[q5.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[q5.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[q5.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[q5.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[q5.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[q5.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[q5.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[q5.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[q5.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: r5$b */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    static {
        C0059ao.a(r5.class, 382);
    }

    public r5() {
        new m5(this);
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = new int[2];
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.F = 0.0f;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        q5 q5Var = new q5(this, q5.b.LEFT);
        this.L = q5Var;
        q5 q5Var2 = new q5(this, q5.b.TOP);
        this.M = q5Var2;
        q5 q5Var3 = new q5(this, q5.b.RIGHT);
        this.N = q5Var3;
        q5 q5Var4 = new q5(this, q5.b.BOTTOM);
        this.O = q5Var4;
        q5 q5Var5 = new q5(this, q5.b.BASELINE);
        this.P = q5Var5;
        this.Q = new q5(this, q5.b.CENTER_X);
        this.R = new q5(this, q5.b.CENTER_Y);
        q5 q5Var6 = new q5(this, q5.b.CENTER);
        this.S = q5Var6;
        this.T = new q5[]{q5Var, q5Var3, q5Var2, q5Var4, q5Var5, q5Var6};
        this.U = new ArrayList<>();
        this.V = new boolean[2];
        b bVar = b.FIXED;
        this.W = new b[]{bVar, bVar};
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0.0f;
        this.b0 = -1;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        float f = u0;
        this.h0 = f;
        this.i0 = f;
        this.k0 = 0;
        this.l0 = null;
        this.m0 = null;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = new float[]{-1.0f, -1.0f};
        this.q0 = new r5[]{null, null};
        this.r0 = new r5[]{null, null};
        this.s0 = -1;
        this.t0 = -1;
        d();
    }

    public int A() {
        return this.J;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008e -> B:39:0x008f). Please submit an issue!!! */
    public void A0(String str) {
        float f;
        int i = 0;
        if (str != null && str.length() != 0) {
            int i2 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(C0059ao.a(15607))) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase(C0059ao.a(15608))) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i3, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i2 == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = i;
            } else {
                String substring4 = str.substring(i3);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = i;
            }
            i = (f > i ? 1 : (f == i ? 0 : -1));
            if (i > 0) {
                this.a0 = f;
                this.b0 = i2;
                return;
            }
            return;
        }
        this.a0 = 0.0f;
    }

    public int B() {
        return this.K;
    }

    public void B0(int i) {
        if (this.G) {
            int i2 = i - this.e0;
            int i3 = this.Z + i2;
            this.d0 = i2;
            this.M.s(i2);
            this.O.s(i3);
            this.P.s(i);
            this.n = true;
        }
    }

    public int C(int i) {
        if (i == 0) {
            return U();
        }
        if (i == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i, int i2) {
        if (this.m) {
            return;
        }
        this.L.s(i);
        this.N.s(i2);
        this.c0 = i;
        this.Y = i2 - i;
        this.m = true;
    }

    public int D() {
        return this.E[1];
    }

    public void D0(int i) {
        this.L.s(i);
        this.c0 = i;
    }

    public int E() {
        return this.E[0];
    }

    public void E0(int i) {
        this.M.s(i);
        this.d0 = i;
    }

    public int F() {
        return this.g0;
    }

    public void F0(int i, int i2) {
        if (this.n) {
            return;
        }
        this.M.s(i);
        this.O.s(i2);
        this.d0 = i;
        this.Z = i2 - i;
        if (this.G) {
            this.P.s(i + this.e0);
        }
        this.n = true;
    }

    public int G() {
        return this.f0;
    }

    public void G0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.c0 = i;
        this.d0 = i2;
        if (this.k0 == 8) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        b[] bVarArr = this.W;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.Y)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.Z)) {
            i8 = i5;
        }
        this.Y = i7;
        this.Z = i8;
        int i9 = this.g0;
        if (i8 < i9) {
            this.Z = i9;
        }
        int i10 = this.f0;
        if (i7 < i10) {
            this.Y = i10;
        }
        int i11 = this.x;
        if (i11 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i11);
        }
        int i12 = this.A;
        if (i12 > 0 && this.W[1] == b.MATCH_CONSTRAINT) {
            this.Z = Math.min(this.Z, i12);
        }
        int i13 = this.Y;
        if (i7 != i13) {
            this.j = i13;
        }
        int i14 = this.Z;
        if (i8 != i14) {
            this.k = i14;
        }
    }

    public r5 H(int i) {
        q5 q5Var;
        q5 q5Var2;
        if (i != 0) {
            if (i == 1 && (q5Var2 = (q5Var = this.O).f) != null && q5Var2.f == q5Var) {
                return q5Var2.d;
            }
            return null;
        }
        q5 q5Var3 = this.N;
        q5 q5Var4 = q5Var3.f;
        if (q5Var4 == null || q5Var4.f != q5Var3) {
            return null;
        }
        return q5Var4.d;
    }

    public void H0(boolean z) {
        this.G = z;
    }

    public r5 I() {
        return this.X;
    }

    public void I0(int i) {
        this.Z = i;
        int i2 = this.g0;
        if (i < i2) {
            this.Z = i2;
        }
    }

    public r5 J(int i) {
        q5 q5Var;
        q5 q5Var2;
        if (i != 0) {
            if (i == 1 && (q5Var2 = (q5Var = this.M).f) != null && q5Var2.f == q5Var) {
                return q5Var2.d;
            }
            return null;
        }
        q5 q5Var3 = this.L;
        q5 q5Var4 = q5Var3.f;
        if (q5Var4 == null || q5Var4.f != q5Var3) {
            return null;
        }
        return q5Var4.d;
    }

    public void J0(float f) {
        this.h0 = f;
    }

    public int K() {
        return V() + this.Y;
    }

    public void K0(int i) {
        this.n0 = i;
    }

    public o6 L(int i) {
        if (i == 0) {
            return this.d;
        }
        if (i == 1) {
            return this.e;
        }
        return null;
    }

    public void L0(int i, int i2) {
        this.c0 = i;
        int i3 = i2 - i;
        this.Y = i3;
        int i4 = this.f0;
        if (i3 < i4) {
            this.Y = i4;
        }
    }

    public void M(StringBuilder sb) {
        sb.append(C0059ao.a(15609) + this.l + C0059ao.a(15610));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0059ao.a(15611));
        sb2.append(this.Y);
        sb.append(sb2.toString());
        String a2 = C0059ao.a(15612);
        sb.append(a2);
        sb.append(C0059ao.a(15613) + this.Z);
        sb.append(a2);
        sb.append(C0059ao.a(15614) + this.c0);
        sb.append(a2);
        sb.append(C0059ao.a(15615) + this.d0);
        sb.append(a2);
        O(sb, C0059ao.a(15616), this.L);
        O(sb, C0059ao.a(15617), this.M);
        O(sb, C0059ao.a(15618), this.N);
        O(sb, C0059ao.a(15619), this.O);
        O(sb, C0059ao.a(15620), this.P);
        O(sb, C0059ao.a(15621), this.Q);
        O(sb, C0059ao.a(15622), this.R);
        N(sb, C0059ao.a(15623), this.Y, this.f0, this.E[0], this.j, this.w, this.t, this.y, this.p0[0]);
        N(sb, C0059ao.a(15624), this.Z, this.g0, this.E[1], this.k, this.z, this.u, this.B, this.p0[1]);
        w0(sb, C0059ao.a(15625), this.a0, this.b0);
        u0(sb, C0059ao.a(15626), this.h0, u0);
        u0(sb, C0059ao.a(15627), this.i0, u0);
        v0(sb, C0059ao.a(15628), this.n0, 0);
        v0(sb, C0059ao.a(15629), this.o0, 0);
        sb.append(C0059ao.a(15630));
    }

    public void M0(b bVar) {
        this.W[0] = bVar;
    }

    public final void N(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(C0059ao.a(15631));
        v0(sb, C0059ao.a(15632), i, 0);
        v0(sb, C0059ao.a(15633), i2, 0);
        v0(sb, C0059ao.a(15634), i3, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        v0(sb, C0059ao.a(15635), i5, 0);
        v0(sb, C0059ao.a(15636), i6, 0);
        u0(sb, C0059ao.a(15637), f, 1.0f);
        sb.append(C0059ao.a(15638));
    }

    public void N0(int i, int i2, int i3, float f) {
        this.t = i;
        this.w = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.x = i3;
        this.y = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.t = 2;
    }

    public final void O(StringBuilder sb, String str, q5 q5Var) {
        if (q5Var.f == null) {
            return;
        }
        sb.append(C0059ao.a(15639));
        sb.append(str);
        sb.append(C0059ao.a(15640));
        sb.append(q5Var.f);
        sb.append(C0059ao.a(15641));
        if (q5Var.h != Integer.MIN_VALUE || q5Var.g != 0) {
            String a2 = C0059ao.a(15642);
            sb.append(a2);
            sb.append(q5Var.g);
            if (q5Var.h != Integer.MIN_VALUE) {
                sb.append(a2);
                sb.append(q5Var.h);
                sb.append(a2);
            }
        }
        sb.append(C0059ao.a(15643));
    }

    public void O0(float f) {
        this.p0[0] = f;
    }

    public float P() {
        return this.i0;
    }

    public void P0(int i, boolean z) {
        this.V[i] = z;
    }

    public int Q() {
        return this.o0;
    }

    public void Q0(boolean z) {
        this.H = z;
    }

    public b R() {
        return this.W[1];
    }

    public void R0(boolean z) {
        this.I = z;
    }

    public int S() {
        int i = this.L != null ? 0 + this.M.g : 0;
        return this.N != null ? i + this.O.g : i;
    }

    public void S0(int i, int i2) {
        this.J = i;
        this.K = i2;
        V0(false);
    }

    public int T() {
        return this.k0;
    }

    public void T0(int i) {
        this.E[1] = i;
    }

    public int U() {
        if (this.k0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public void U0(int i) {
        this.E[0] = i;
    }

    public int V() {
        r5 r5Var = this.X;
        if (r5Var != null && (r5Var instanceof s5)) {
            return ((s5) r5Var).D0 + this.c0;
        }
        return this.c0;
    }

    public void V0(boolean z) {
        this.g = z;
    }

    public int W() {
        r5 r5Var = this.X;
        if (r5Var != null && (r5Var instanceof s5)) {
            return ((s5) r5Var).E0 + this.d0;
        }
        return this.d0;
    }

    public void W0(int i) {
        if (i < 0) {
            this.g0 = 0;
        } else {
            this.g0 = i;
        }
    }

    public boolean X() {
        return this.G;
    }

    public void X0(int i) {
        if (i < 0) {
            this.f0 = 0;
        } else {
            this.f0 = i;
        }
    }

    public boolean Y(int i) {
        if (i == 0) {
            return (this.L.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2;
        }
        return ((this.M.f != null ? 1 : 0) + (this.O.f != null ? 1 : 0)) + (this.P.f != null ? 1 : 0) < 2;
    }

    public void Y0(int i, int i2) {
        this.c0 = i;
        this.d0 = i2;
    }

    public boolean Z() {
        int size = this.U.size();
        for (int i = 0; i < size; i++) {
            if (this.U.get(i).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(r5 r5Var) {
        this.X = r5Var;
    }

    public boolean a0() {
        return (this.j == -1 && this.k == -1) ? false : true;
    }

    public void a1(float f) {
        this.i0 = f;
    }

    public boolean b0(int i, int i2) {
        q5 q5Var;
        q5 q5Var2;
        if (i == 0) {
            q5 q5Var3 = this.L.f;
            return q5Var3 != null && q5Var3.m() && (q5Var2 = this.N.f) != null && q5Var2.m() && (this.N.f.d() - this.N.e()) - (this.L.f.d() + this.L.e()) >= i2;
        }
        q5 q5Var4 = this.M.f;
        return q5Var4 != null && q5Var4.m() && (q5Var = this.O.f) != null && q5Var.m() && (this.O.f.d() - this.O.e()) - (this.M.f.d() + this.M.e()) >= i2;
        return false;
    }

    public void b1(int i) {
        this.o0 = i;
    }

    public void c0(q5.b bVar, r5 r5Var, q5.b bVar2, int i, int i2) {
        m(bVar).a(r5Var.m(bVar2), i, i2, true);
    }

    public void c1(int i, int i2) {
        this.d0 = i;
        int i3 = i2 - i;
        this.Z = i3;
        int i4 = this.g0;
        if (i3 < i4) {
            this.Z = i4;
        }
    }

    public final void d() {
        this.U.add(this.L);
        this.U.add(this.M);
        this.U.add(this.N);
        this.U.add(this.O);
        this.U.add(this.Q);
        this.U.add(this.R);
        this.U.add(this.S);
        this.U.add(this.P);
    }

    public final boolean d0(int i) {
        int i2 = i * 2;
        q5[] q5VarArr = this.T;
        if (q5VarArr[i2].f != null && q5VarArr[i2].f.f != q5VarArr[i2]) {
            int i3 = i2 + 1;
            if (q5VarArr[i3].f != null && q5VarArr[i3].f.f == q5VarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    public void d1(b bVar) {
        this.W[1] = bVar;
    }

    public void e(s5 s5Var, z4 z4Var, HashSet<r5> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            w5.a(s5Var, z4Var, this);
            hashSet.remove(this);
            g(z4Var, s5Var.P1(64));
        }
        if (i == 0) {
            HashSet<q5> c = this.L.c();
            if (c != null) {
                Iterator<q5> it = c.iterator();
                while (it.hasNext()) {
                    it.next().d.e(s5Var, z4Var, hashSet, i, true);
                }
            }
            HashSet<q5> c2 = this.N.c();
            if (c2 != null) {
                Iterator<q5> it2 = c2.iterator();
                while (it2.hasNext()) {
                    it2.next().d.e(s5Var, z4Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<q5> c3 = this.M.c();
        if (c3 != null) {
            Iterator<q5> it3 = c3.iterator();
            while (it3.hasNext()) {
                it3.next().d.e(s5Var, z4Var, hashSet, i, true);
            }
        }
        HashSet<q5> c4 = this.O.c();
        if (c4 != null) {
            Iterator<q5> it4 = c4.iterator();
            while (it4.hasNext()) {
                it4.next().d.e(s5Var, z4Var, hashSet, i, true);
            }
        }
        HashSet<q5> c5 = this.P.c();
        if (c5 != null) {
            Iterator<q5> it5 = c5.iterator();
            while (it5.hasNext()) {
                it5.next().d.e(s5Var, z4Var, hashSet, i, true);
            }
        }
    }

    public boolean e0() {
        return this.o;
    }

    public void e1(int i, int i2, int i3, float f) {
        this.u = i;
        this.z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A = i3;
        this.B = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.u = 2;
    }

    public boolean f() {
        return (this instanceof x5) || (this instanceof t5);
    }

    public boolean f0(int i) {
        return this.V[i];
    }

    public void f1(float f) {
        this.p0[1] = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(defpackage.z4 r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5.g(z4, boolean):void");
    }

    public boolean g0() {
        q5 q5Var = this.L;
        q5 q5Var2 = q5Var.f;
        if (q5Var2 == null || q5Var2.f != q5Var) {
            q5 q5Var3 = this.N;
            q5 q5Var4 = q5Var3.f;
            return q5Var4 != null && q5Var4.f == q5Var3;
        }
        return true;
    }

    public void g1(int i) {
        this.k0 = i;
    }

    public boolean h() {
        return this.k0 != 8;
    }

    public boolean h0() {
        return this.H;
    }

    public void h1(int i) {
        this.Y = i;
        int i2 = this.f0;
        if (i < i2) {
            this.Y = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0462 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:384:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.z4 r32, boolean r33, boolean r34, boolean r35, boolean r36, defpackage.e5 r37, defpackage.e5 r38, defpackage.r5.b r39, boolean r40, defpackage.q5 r41, defpackage.q5 r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5.i(z4, boolean, boolean, boolean, boolean, e5, e5, r5$b, boolean, q5, q5, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public boolean i0() {
        q5 q5Var = this.M;
        q5 q5Var2 = q5Var.f;
        if (q5Var2 == null || q5Var2.f != q5Var) {
            q5 q5Var3 = this.O;
            q5 q5Var4 = q5Var3.f;
            return q5Var4 != null && q5Var4.f == q5Var3;
        }
        return true;
    }

    public void i1(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.s = i;
    }

    public void j(r5 r5Var, float f, int i) {
        q5.b bVar = q5.b.CENTER;
        c0(bVar, r5Var, bVar, i, 0);
        this.F = f;
    }

    public boolean j0() {
        return this.I;
    }

    public void j1(int i) {
        this.c0 = i;
    }

    public void k(z4 z4Var) {
        z4Var.q(this.L);
        z4Var.q(this.M);
        z4Var.q(this.N);
        z4Var.q(this.O);
        if (this.e0 > 0) {
            z4Var.q(this.P);
        }
    }

    public boolean k0() {
        return this.g && this.k0 != 8;
    }

    public void k1(int i) {
        this.d0 = i;
    }

    public void l() {
        if (this.d == null) {
            this.d = new k6(this);
        }
        if (this.e == null) {
            this.e = new m6(this);
        }
    }

    public boolean l0() {
        return this.m || (this.L.m() && this.N.m());
    }

    public void l1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.C == -1) {
            if (z3 && !z4) {
                this.C = 0;
            } else if (!z3 && z4) {
                this.C = 1;
                if (this.b0 == -1) {
                    this.D = 1.0f / this.D;
                }
            }
        }
        if (this.C == 0 && (!this.M.n() || !this.O.n())) {
            this.C = 1;
        } else if (this.C == 1 && (!this.L.n() || !this.N.n())) {
            this.C = 0;
        }
        if (this.C == -1 && (!this.M.n() || !this.O.n() || !this.L.n() || !this.N.n())) {
            if (this.M.n() && this.O.n()) {
                this.C = 0;
            } else if (this.L.n() && this.N.n()) {
                this.D = 1.0f / this.D;
                this.C = 1;
            }
        }
        if (this.C == -1) {
            int i = this.w;
            if (i > 0 && this.z == 0) {
                this.C = 0;
            } else if (i != 0 || this.z <= 0) {
            } else {
                this.D = 1.0f / this.D;
                this.C = 1;
            }
        }
    }

    public q5 m(q5.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.L;
            case 2:
                return this.M;
            case 3:
                return this.N;
            case 4:
                return this.O;
            case 5:
                return this.P;
            case 6:
                return this.S;
            case 7:
                return this.Q;
            case 8:
                return this.R;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.n || (this.M.m() && this.O.m());
    }

    public void m1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.d.k();
        boolean k2 = z2 & this.e.k();
        k6 k6Var = this.d;
        int i3 = k6Var.h.g;
        m6 m6Var = this.e;
        int i4 = m6Var.h.g;
        int i5 = k6Var.i.g;
        int i6 = m6Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.c0 = i3;
        }
        if (k2) {
            this.d0 = i4;
        }
        if (this.k0 == 8) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        if (k) {
            if (this.W[0] == b.FIXED && i8 < (i2 = this.Y)) {
                i8 = i2;
            }
            this.Y = i8;
            int i10 = this.f0;
            if (i8 < i10) {
                this.Y = i10;
            }
        }
        if (k2) {
            if (this.W[1] == b.FIXED && i9 < (i = this.Z)) {
                i9 = i;
            }
            this.Z = i9;
            int i11 = this.g0;
            if (i9 < i11) {
                this.Z = i11;
            }
        }
    }

    public int n() {
        return this.e0;
    }

    public boolean n0() {
        return this.p;
    }

    public void n1(z4 z4Var, boolean z) {
        m6 m6Var;
        k6 k6Var;
        int x = z4Var.x(this.L);
        int x2 = z4Var.x(this.M);
        int x3 = z4Var.x(this.N);
        int x4 = z4Var.x(this.O);
        if (z && (k6Var = this.d) != null) {
            e6 e6Var = k6Var.h;
            if (e6Var.j) {
                e6 e6Var2 = k6Var.i;
                if (e6Var2.j) {
                    x = e6Var.g;
                    x3 = e6Var2.g;
                }
            }
        }
        if (z && (m6Var = this.e) != null) {
            e6 e6Var3 = m6Var.h;
            if (e6Var3.j) {
                e6 e6Var4 = m6Var.i;
                if (e6Var4.j) {
                    x2 = e6Var3.g;
                    x4 = e6Var4.g;
                }
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        G0(x, x2, x3, x4);
    }

    public float o(int i) {
        if (i == 0) {
            return this.h0;
        }
        if (i == 1) {
            return this.i0;
        }
        return -1.0f;
    }

    public void o0() {
        this.o = true;
    }

    public int p() {
        return W() + this.Z;
    }

    public void p0() {
        this.p = true;
    }

    public Object q() {
        return this.j0;
    }

    public boolean q0() {
        b[] bVarArr = this.W;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.l0;
    }

    public void r0() {
        this.L.p();
        this.M.p();
        this.N.p();
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.X = null;
        this.F = 0.0f;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0.0f;
        this.b0 = -1;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0;
        float f = u0;
        this.h0 = f;
        this.i0 = f;
        b[] bVarArr = this.W;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.j0 = null;
        this.k0 = 0;
        this.m0 = null;
        this.n0 = 0;
        this.o0 = 0;
        float[] fArr = this.p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.q = -1;
        this.r = -1;
        int[] iArr = this.E;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.t = 0;
        this.u = 0;
        this.y = 1.0f;
        this.B = 1.0f;
        this.x = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.w = 0;
        this.z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.I = false;
        boolean[] zArr2 = this.V;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.v;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.j = -1;
        this.k = -1;
    }

    public b s(int i) {
        if (i == 0) {
            return y();
        }
        if (i == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        int size = this.U.size();
        for (int i = 0; i < size; i++) {
            this.U.get(i).q();
        }
    }

    public float t() {
        return this.a0;
    }

    public void t0(y4 y4Var) {
        this.L.r(y4Var);
        this.M.r(y4Var);
        this.N.r(y4Var);
        this.O.r(y4Var);
        this.P.r(y4Var);
        this.S.r(y4Var);
        this.Q.r(y4Var);
        this.R.r(y4Var);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.m0;
        String a2 = C0059ao.a(15644);
        String a3 = C0059ao.a(15645);
        if (str2 != null) {
            str = C0059ao.a(15646) + this.m0 + a2;
        } else {
            str = a3;
        }
        sb.append(str);
        if (this.l0 != null) {
            a3 = C0059ao.a(15647) + this.l0 + a2;
        }
        sb.append(a3);
        sb.append(C0059ao.a(15648));
        sb.append(this.c0);
        sb.append(C0059ao.a(15649));
        sb.append(this.d0);
        sb.append(C0059ao.a(15650));
        sb.append(this.Y);
        sb.append(C0059ao.a(15651));
        sb.append(this.Z);
        sb.append(C0059ao.a(15652));
        return sb.toString();
    }

    public int u() {
        return this.b0;
    }

    public final void u0(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(C0059ao.a(15653));
        sb.append(f);
        sb.append(C0059ao.a(15654));
    }

    public int v() {
        if (this.k0 == 8) {
            return 0;
        }
        return this.Z;
    }

    public final void v0(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(C0059ao.a(15655));
        sb.append(i);
        sb.append(C0059ao.a(15656));
    }

    public float w() {
        return this.h0;
    }

    public final void w0(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(C0059ao.a(15657));
        sb.append(f);
        sb.append(C0059ao.a(15658));
        sb.append(i);
        sb.append(C0059ao.a(15659));
        sb.append(C0059ao.a(15660));
    }

    public int x() {
        return this.n0;
    }

    public void x0(int i) {
        this.e0 = i;
        this.G = i > 0;
    }

    public b y() {
        return this.W[0];
    }

    public void y0(Object obj) {
        this.j0 = obj;
    }

    public int z() {
        q5 q5Var = this.L;
        int i = q5Var != null ? 0 + q5Var.g : 0;
        q5 q5Var2 = this.N;
        return q5Var2 != null ? i + q5Var2.g : i;
    }

    public void z0(String str) {
        this.l0 = str;
    }
}
