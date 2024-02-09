package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import defpackage.a6;
import defpackage.r5;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s5  reason: default package */
/* loaded from: classes.dex */
public class s5 extends y5 {
    public a5 B0;
    public int D0;
    public int E0;
    public int y0;
    public a6 w0 = new a6(this);
    public d6 x0 = new d6(this);
    public a6.b z0 = null;
    public boolean A0 = false;
    public z4 C0 = new z4();
    public int F0 = 0;
    public int G0 = 0;
    public p5[] H0 = new p5[4];
    public p5[] I0 = new p5[4];
    public int J0 = 257;
    public boolean K0 = false;
    public boolean L0 = false;
    public WeakReference<q5> M0 = null;
    public WeakReference<q5> N0 = null;
    public WeakReference<q5> O0 = null;
    public WeakReference<q5> P0 = null;
    public HashSet<r5> Q0 = new HashSet<>();
    public a6.a R0 = new a6.a();

    public static boolean O1(int i, r5 r5Var, a6.b bVar, a6.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (r5Var.T() != 8 && !(r5Var instanceof t5) && !(r5Var instanceof n5)) {
            aVar.a = r5Var.y();
            aVar.b = r5Var.R();
            aVar.c = r5Var.U();
            aVar.d = r5Var.v();
            aVar.i = false;
            aVar.j = i2;
            r5.b bVar2 = aVar.a;
            r5.b bVar3 = r5.b.MATCH_CONSTRAINT;
            boolean z = bVar2 == bVar3;
            boolean z2 = aVar.b == bVar3;
            boolean z3 = z && r5Var.a0 > 0.0f;
            boolean z4 = z2 && r5Var.a0 > 0.0f;
            if (z && r5Var.Y(0) && r5Var.t == 0 && !z3) {
                aVar.a = r5.b.WRAP_CONTENT;
                if (z2 && r5Var.u == 0) {
                    aVar.a = r5.b.FIXED;
                }
                z = false;
            }
            if (z2 && r5Var.Y(1) && r5Var.u == 0 && !z4) {
                aVar.b = r5.b.WRAP_CONTENT;
                if (z && r5Var.t == 0) {
                    aVar.b = r5.b.FIXED;
                }
                z2 = false;
            }
            if (r5Var.l0()) {
                aVar.a = r5.b.FIXED;
                z = false;
            }
            if (r5Var.m0()) {
                aVar.b = r5.b.FIXED;
                z2 = false;
            }
            if (z3) {
                if (r5Var.v[0] == 4) {
                    aVar.a = r5.b.FIXED;
                } else if (!z2) {
                    r5.b bVar4 = aVar.b;
                    r5.b bVar5 = r5.b.FIXED;
                    if (bVar4 == bVar5) {
                        i4 = aVar.d;
                    } else {
                        aVar.a = r5.b.WRAP_CONTENT;
                        bVar.b(r5Var, aVar);
                        i4 = aVar.f;
                    }
                    aVar.a = bVar5;
                    aVar.c = (int) (r5Var.t() * i4);
                }
            }
            if (z4) {
                if (r5Var.v[1] == 4) {
                    aVar.b = r5.b.FIXED;
                } else if (!z) {
                    r5.b bVar6 = aVar.a;
                    r5.b bVar7 = r5.b.FIXED;
                    if (bVar6 == bVar7) {
                        i3 = aVar.c;
                    } else {
                        aVar.b = r5.b.WRAP_CONTENT;
                        bVar.b(r5Var, aVar);
                        i3 = aVar.e;
                    }
                    aVar.b = bVar7;
                    if (r5Var.u() == -1) {
                        aVar.d = (int) (i3 / r5Var.t());
                    } else {
                        aVar.d = (int) (r5Var.t() * i3);
                    }
                }
            }
            bVar.b(r5Var, aVar);
            r5Var.h1(aVar.e);
            r5Var.I0(aVar.f);
            r5Var.H0(aVar.h);
            r5Var.x0(aVar.g);
            aVar.j = a6.a.k;
            return aVar.i;
        }
        aVar.e = 0;
        aVar.f = 0;
        return false;
    }

    public void A1(q5 q5Var) {
        WeakReference<q5> weakReference = this.O0;
        if (weakReference == null || weakReference.get() == null || q5Var.d() > this.O0.get().d()) {
            this.O0 = new WeakReference<>(q5Var);
        }
    }

    public void B1(q5 q5Var) {
        WeakReference<q5> weakReference = this.M0;
        if (weakReference == null || weakReference.get() == null || q5Var.d() > this.M0.get().d()) {
            this.M0 = new WeakReference<>(q5Var);
        }
    }

    public boolean C1(boolean z) {
        return this.x0.f(z);
    }

    public boolean D1(boolean z) {
        return this.x0.g(z);
    }

    public boolean E1(boolean z, int i) {
        return this.x0.h(z, i);
    }

    public a6.b F1() {
        return this.z0;
    }

    public int G1() {
        return this.J0;
    }

    public z4 H1() {
        return this.C0;
    }

    public void I1() {
        this.x0.j();
    }

    public void J1() {
        this.x0.k();
    }

    public boolean K1() {
        return this.L0;
    }

    public boolean L1() {
        return this.A0;
    }

    @Override // defpackage.r5
    public void M(StringBuilder sb) {
        sb.append(this.l + C0059ao.a(517));
        sb.append(C0059ao.a(518) + this.Y);
        String a = C0059ao.a(519);
        sb.append(a);
        sb.append(C0059ao.a(520) + this.Z);
        sb.append(a);
        Iterator<r5> it = o1().iterator();
        while (it.hasNext()) {
            it.next().M(sb);
            sb.append(C0059ao.a(521));
        }
        sb.append(C0059ao.a(522));
    }

    public boolean M1() {
        return this.K0;
    }

    public long N1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.D0 = i8;
        this.E0 = i9;
        return this.w0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean P1(int i) {
        return (this.J0 & i) == i;
    }

    public final void Q1() {
        this.F0 = 0;
        this.G0 = 0;
    }

    public void R1(a6.b bVar) {
        this.z0 = bVar;
        this.x0.n(bVar);
    }

    public void S1(int i) {
        this.J0 = i;
        z4.r = P1(Barcode.UPC_A);
    }

    public void T1(int i) {
        this.y0 = i;
    }

    public void U1(boolean z) {
        this.A0 = z;
    }

    public boolean V1(z4 z4Var, boolean[] zArr) {
        zArr[2] = false;
        boolean P1 = P1(64);
        n1(z4Var, P1);
        int size = this.v0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            r5 r5Var = this.v0.get(i);
            r5Var.n1(z4Var, P1);
            if (r5Var.a0()) {
                z = true;
            }
        }
        return z;
    }

    public void W1() {
        this.w0.e(this);
    }

    @Override // defpackage.r5
    public void m1(boolean z, boolean z2) {
        super.m1(z, z2);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            this.v0.get(i).m1(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0322  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p1() {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5.p1():void");
    }

    @Override // defpackage.y5, defpackage.r5
    public void r0() {
        this.C0.D();
        this.D0 = 0;
        this.E0 = 0;
        super.r0();
    }

    public void s1(r5 r5Var, int i) {
        if (i == 0) {
            u1(r5Var);
        } else if (i == 1) {
            z1(r5Var);
        }
    }

    public boolean t1(z4 z4Var) {
        boolean P1 = P1(64);
        g(z4Var, P1);
        int size = this.v0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            r5 r5Var = this.v0.get(i);
            r5Var.P0(0, false);
            r5Var.P0(1, false);
            if (r5Var instanceof n5) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                r5 r5Var2 = this.v0.get(i2);
                if (r5Var2 instanceof n5) {
                    ((n5) r5Var2).v1();
                }
            }
        }
        this.Q0.clear();
        for (int i3 = 0; i3 < size; i3++) {
            r5 r5Var3 = this.v0.get(i3);
            if (r5Var3.f()) {
                if (r5Var3 instanceof x5) {
                    this.Q0.add(r5Var3);
                } else {
                    r5Var3.g(z4Var, P1);
                }
            }
        }
        while (this.Q0.size() > 0) {
            int size2 = this.Q0.size();
            Iterator<r5> it = this.Q0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x5 x5Var = (x5) it.next();
                if (x5Var.r1(this.Q0)) {
                    x5Var.g(z4Var, P1);
                    this.Q0.remove(x5Var);
                    break;
                }
            }
            if (size2 == this.Q0.size()) {
                Iterator<r5> it2 = this.Q0.iterator();
                while (it2.hasNext()) {
                    it2.next().g(z4Var, P1);
                }
                this.Q0.clear();
            }
        }
        if (z4.r) {
            HashSet<r5> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                r5 r5Var4 = this.v0.get(i4);
                if (!r5Var4.f()) {
                    hashSet.add(r5Var4);
                }
            }
            e(this, z4Var, hashSet, y() == r5.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<r5> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                r5 next = it3.next();
                w5.a(this, z4Var, next);
                next.g(z4Var, P1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                r5 r5Var5 = this.v0.get(i5);
                if (r5Var5 instanceof s5) {
                    r5.b[] bVarArr = r5Var5.W;
                    r5.b bVar = bVarArr[0];
                    r5.b bVar2 = bVarArr[1];
                    r5.b bVar3 = r5.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        r5Var5.M0(r5.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        r5Var5.d1(r5.b.FIXED);
                    }
                    r5Var5.g(z4Var, P1);
                    if (bVar == bVar3) {
                        r5Var5.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        r5Var5.d1(bVar2);
                    }
                } else {
                    w5.a(this, z4Var, r5Var5);
                    if (!r5Var5.f()) {
                        r5Var5.g(z4Var, P1);
                    }
                }
            }
        }
        if (this.F0 > 0) {
            o5.b(this, z4Var, null, 0);
        }
        if (this.G0 > 0) {
            o5.b(this, z4Var, null, 1);
        }
        return true;
    }

    public final void u1(r5 r5Var) {
        int i = this.F0 + 1;
        p5[] p5VarArr = this.I0;
        if (i >= p5VarArr.length) {
            this.I0 = (p5[]) Arrays.copyOf(p5VarArr, p5VarArr.length * 2);
        }
        this.I0[this.F0] = new p5(r5Var, 0, L1());
        this.F0++;
    }

    public void v1(q5 q5Var) {
        WeakReference<q5> weakReference = this.P0;
        if (weakReference == null || weakReference.get() == null || q5Var.d() > this.P0.get().d()) {
            this.P0 = new WeakReference<>(q5Var);
        }
    }

    public void w1(q5 q5Var) {
        WeakReference<q5> weakReference = this.N0;
        if (weakReference == null || weakReference.get() == null || q5Var.d() > this.N0.get().d()) {
            this.N0 = new WeakReference<>(q5Var);
        }
    }

    public final void x1(q5 q5Var, e5 e5Var) {
        this.C0.h(e5Var, this.C0.q(q5Var), 0, 5);
    }

    public final void y1(q5 q5Var, e5 e5Var) {
        this.C0.h(this.C0.q(q5Var), e5Var, 0, 5);
    }

    public final void z1(r5 r5Var) {
        int i = this.G0 + 1;
        p5[] p5VarArr = this.H0;
        if (i >= p5VarArr.length) {
            this.H0 = (p5[]) Arrays.copyOf(p5VarArr, p5VarArr.length * 2);
        }
        this.H0[this.G0] = new p5(r5Var, 1, L1());
        this.G0++;
    }
}
