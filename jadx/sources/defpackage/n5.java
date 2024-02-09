package defpackage;

import defpackage.q5;
import defpackage.r5;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n5  reason: default package */
/* loaded from: classes.dex */
public class n5 extends v5 {
    public int x0 = 0;
    public boolean y0 = true;
    public int z0 = 0;
    public boolean A0 = false;

    @Override // defpackage.r5
    public void g(z4 z4Var, boolean z) {
        Object[] objArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        q5[] q5VarArr = this.T;
        q5VarArr[0] = this.L;
        q5VarArr[2] = this.M;
        q5VarArr[1] = this.N;
        q5VarArr[3] = this.O;
        int i4 = 0;
        while (true) {
            objArr = this.T;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].i = z4Var.q(objArr[i4]);
            i4++;
        }
        int i5 = this.x0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        q5 q5Var = objArr[i5];
        if (!this.A0) {
            q1();
        }
        if (this.A0) {
            this.A0 = false;
            int i6 = this.x0;
            if (i6 == 0 || i6 == 1) {
                z4Var.f(this.L.i, this.c0);
                z4Var.f(this.N.i, this.c0);
                return;
            } else if (i6 == 2 || i6 == 3) {
                z4Var.f(this.M.i, this.d0);
                z4Var.f(this.O.i, this.d0);
                return;
            } else {
                return;
            }
        }
        for (int i7 = 0; i7 < this.w0; i7++) {
            r5 r5Var = this.v0[i7];
            if ((this.y0 || r5Var.h()) && ((((i2 = this.x0) == 0 || i2 == 1) && r5Var.y() == r5.b.MATCH_CONSTRAINT && r5Var.L.f != null && r5Var.N.f != null) || (((i3 = this.x0) == 2 || i3 == 3) && r5Var.R() == r5.b.MATCH_CONSTRAINT && r5Var.M.f != null && r5Var.O.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.L.k() || this.N.k();
        boolean z4 = this.M.k() || this.O.k();
        int i8 = !z2 && (((i = this.x0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i9 = 0; i9 < this.w0; i9++) {
            r5 r5Var2 = this.v0[i9];
            if (this.y0 || r5Var2.h()) {
                e5 q = z4Var.q(r5Var2.T[this.x0]);
                q5[] q5VarArr2 = r5Var2.T;
                int i10 = this.x0;
                q5VarArr2[i10].i = q;
                int i11 = (q5VarArr2[i10].f == null || q5VarArr2[i10].f.d != this) ? 0 : q5VarArr2[i10].g + 0;
                if (i10 != 0 && i10 != 2) {
                    z4Var.g(q5Var.i, q, this.z0 + i11, z2);
                } else {
                    z4Var.i(q5Var.i, q, this.z0 - i11, z2);
                }
                z4Var.e(q5Var.i, q, this.z0 + i11, i8);
            }
        }
        int i12 = this.x0;
        if (i12 == 0) {
            z4Var.e(this.N.i, this.L.i, 0, 8);
            z4Var.e(this.L.i, this.X.N.i, 0, 4);
            z4Var.e(this.L.i, this.X.L.i, 0, 0);
        } else if (i12 == 1) {
            z4Var.e(this.L.i, this.N.i, 0, 8);
            z4Var.e(this.L.i, this.X.L.i, 0, 4);
            z4Var.e(this.L.i, this.X.N.i, 0, 0);
        } else if (i12 == 2) {
            z4Var.e(this.O.i, this.M.i, 0, 8);
            z4Var.e(this.M.i, this.X.O.i, 0, 4);
            z4Var.e(this.M.i, this.X.M.i, 0, 0);
        } else if (i12 == 3) {
            z4Var.e(this.M.i, this.O.i, 0, 8);
            z4Var.e(this.M.i, this.X.M.i, 0, 4);
            z4Var.e(this.M.i, this.X.O.i, 0, 0);
        }
    }

    @Override // defpackage.r5
    public boolean h() {
        return true;
    }

    @Override // defpackage.r5
    public boolean l0() {
        return this.A0;
    }

    @Override // defpackage.r5
    public boolean m0() {
        return this.A0;
    }

    public boolean q1() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.w0;
            if (i4 >= i) {
                break;
            }
            r5 r5Var = this.v0[i4];
            if ((this.y0 || r5Var.h()) && ((((i2 = this.x0) == 0 || i2 == 1) && !r5Var.l0()) || (((i3 = this.x0) == 2 || i3 == 3) && !r5Var.m0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.w0; i6++) {
            r5 r5Var2 = this.v0[i6];
            if (this.y0 || r5Var2.h()) {
                if (!z2) {
                    int i7 = this.x0;
                    if (i7 == 0) {
                        i5 = r5Var2.m(q5.b.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = r5Var2.m(q5.b.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = r5Var2.m(q5.b.TOP).d();
                    } else if (i7 == 3) {
                        i5 = r5Var2.m(q5.b.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.x0;
                if (i8 == 0) {
                    i5 = Math.min(i5, r5Var2.m(q5.b.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, r5Var2.m(q5.b.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, r5Var2.m(q5.b.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, r5Var2.m(q5.b.BOTTOM).d());
                }
            }
        }
        int i9 = i5 + this.z0;
        int i10 = this.x0;
        if (i10 != 0 && i10 != 1) {
            F0(i9, i9);
        } else {
            C0(i9, i9);
        }
        this.A0 = true;
        return true;
    }

    public boolean r1() {
        return this.y0;
    }

    public int s1() {
        return this.x0;
    }

    public int t1() {
        return this.z0;
    }

    @Override // defpackage.r5
    public String toString() {
        String str = C0059ao.a(12556) + r() + C0059ao.a(12557);
        for (int i = 0; i < this.w0; i++) {
            r5 r5Var = this.v0[i];
            if (i > 0) {
                str = str + C0059ao.a(12558);
            }
            str = str + r5Var.r();
        }
        return str + C0059ao.a(12559);
    }

    public int u1() {
        int i = this.x0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public void v1() {
        for (int i = 0; i < this.w0; i++) {
            r5 r5Var = this.v0[i];
            if (this.y0 || r5Var.h()) {
                int i2 = this.x0;
                if (i2 == 0 || i2 == 1) {
                    r5Var.P0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    r5Var.P0(1, true);
                }
            }
        }
    }

    public void w1(boolean z) {
        this.y0 = z;
    }

    public void x1(int i) {
        this.x0 = i;
    }

    public void y1(int i) {
        this.z0 = i;
    }
}
