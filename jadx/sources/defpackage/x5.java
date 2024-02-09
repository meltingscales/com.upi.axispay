package defpackage;

import java.util.HashSet;

/* compiled from: AxisPay */
/* renamed from: x5  reason: default package */
/* loaded from: classes.dex */
public class x5 extends v5 {
    public boolean x0 = false;

    @Override // defpackage.v5, defpackage.u5
    public void a(s5 s5Var) {
        q1();
    }

    public void q1() {
        for (int i = 0; i < this.w0; i++) {
            r5 r5Var = this.v0[i];
            if (r5Var != null) {
                r5Var.R0(true);
            }
        }
    }

    public boolean r1(HashSet<r5> hashSet) {
        for (int i = 0; i < this.w0; i++) {
            if (hashSet.contains(this.v0[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean s1() {
        return this.x0;
    }
}
