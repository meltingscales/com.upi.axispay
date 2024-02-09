package defpackage;

import defpackage.r5;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: p5  reason: default package */
/* loaded from: classes.dex */
public class p5 {
    public r5 a;
    public r5 b;
    public r5 c;
    public r5 d;
    public r5 e;
    public r5 f;
    public r5 g;
    public ArrayList<r5> h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public p5(r5 r5Var, int i, boolean z) {
        this.p = false;
        this.a = r5Var;
        this.o = i;
        this.p = z;
    }

    public static boolean c(r5 r5Var, int i) {
        if (r5Var.T() != 8 && r5Var.W[i] == r5.b.MATCH_CONSTRAINT) {
            int[] iArr = r5Var.v;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.t) {
            b();
        }
        this.t = true;
    }

    public final void b() {
        int i = this.o * 2;
        r5 r5Var = this.a;
        boolean z = false;
        r5 r5Var2 = r5Var;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            r5[] r5VarArr = r5Var.r0;
            int i2 = this.o;
            r5 r5Var3 = null;
            r5VarArr[i2] = null;
            r5Var.q0[i2] = null;
            if (r5Var.T() != 8) {
                this.l++;
                r5.b s = r5Var.s(this.o);
                r5.b bVar = r5.b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.m += r5Var.C(this.o);
                }
                int e = this.m + r5Var.T[i].e();
                this.m = e;
                int i3 = i + 1;
                this.m = e + r5Var.T[i3].e();
                int e2 = this.n + r5Var.T[i].e();
                this.n = e2;
                this.n = e2 + r5Var.T[i3].e();
                if (this.b == null) {
                    this.b = r5Var;
                }
                this.d = r5Var;
                r5.b[] bVarArr = r5Var.W;
                int i4 = this.o;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = r5Var.v;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = r5Var.p0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (c(r5Var, i4)) {
                            if (f < 0.0f) {
                                this.q = true;
                            } else {
                                this.r = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(r5Var);
                        }
                        if (this.f == null) {
                            this.f = r5Var;
                        }
                        r5 r5Var4 = this.g;
                        if (r5Var4 != null) {
                            r5Var4.q0[this.o] = r5Var;
                        }
                        this.g = r5Var;
                    }
                    if (this.o == 0) {
                        if (r5Var.t == 0 && r5Var.w == 0) {
                            int i5 = r5Var.x;
                        }
                    } else if (r5Var.u == 0 && r5Var.z == 0) {
                        int i6 = r5Var.A;
                    }
                    int i7 = (r5Var.a0 > 0.0f ? 1 : (r5Var.a0 == 0.0f ? 0 : -1));
                }
            }
            if (r5Var2 != r5Var) {
                r5Var2.r0[this.o] = r5Var;
            }
            q5 q5Var = r5Var.T[i + 1].f;
            if (q5Var != null) {
                r5 r5Var5 = q5Var.d;
                q5[] q5VarArr = r5Var5.T;
                if (q5VarArr[i].f != null && q5VarArr[i].f.d == r5Var) {
                    r5Var3 = r5Var5;
                }
            }
            if (r5Var3 == null) {
                r5Var3 = r5Var;
                z2 = true;
            }
            r5Var2 = r5Var;
            r5Var = r5Var3;
        }
        r5 r5Var6 = this.b;
        if (r5Var6 != null) {
            this.m -= r5Var6.T[i].e();
        }
        r5 r5Var7 = this.d;
        if (r5Var7 != null) {
            this.m -= r5Var7.T[i + 1].e();
        }
        this.c = r5Var;
        if (this.o == 0 && this.p) {
            this.e = r5Var;
        } else {
            this.e = this.a;
        }
        if (this.r && this.q) {
            z = true;
        }
        this.s = z;
    }
}
