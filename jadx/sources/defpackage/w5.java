package defpackage;

import defpackage.r5;

/* compiled from: AxisPay */
/* renamed from: w5  reason: default package */
/* loaded from: classes.dex */
public class w5 {
    public static boolean[] a = new boolean[3];

    public static void a(s5 s5Var, z4 z4Var, r5 r5Var) {
        r5Var.q = -1;
        r5Var.r = -1;
        r5.b bVar = s5Var.W[0];
        r5.b bVar2 = r5.b.WRAP_CONTENT;
        if (bVar != bVar2 && r5Var.W[0] == r5.b.MATCH_PARENT) {
            int i = r5Var.L.g;
            int U = s5Var.U() - r5Var.N.g;
            q5 q5Var = r5Var.L;
            q5Var.i = z4Var.q(q5Var);
            q5 q5Var2 = r5Var.N;
            q5Var2.i = z4Var.q(q5Var2);
            z4Var.f(r5Var.L.i, i);
            z4Var.f(r5Var.N.i, U);
            r5Var.q = 2;
            r5Var.L0(i, U);
        }
        if (s5Var.W[1] == bVar2 || r5Var.W[1] != r5.b.MATCH_PARENT) {
            return;
        }
        int i2 = r5Var.M.g;
        int v = s5Var.v() - r5Var.O.g;
        q5 q5Var3 = r5Var.M;
        q5Var3.i = z4Var.q(q5Var3);
        q5 q5Var4 = r5Var.O;
        q5Var4.i = z4Var.q(q5Var4);
        z4Var.f(r5Var.M.i, i2);
        z4Var.f(r5Var.O.i, v);
        if (r5Var.e0 > 0 || r5Var.T() == 8) {
            q5 q5Var5 = r5Var.P;
            q5Var5.i = z4Var.q(q5Var5);
            z4Var.f(r5Var.P.i, r5Var.e0 + i2);
        }
        r5Var.r = 2;
        r5Var.c1(i2, v);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
