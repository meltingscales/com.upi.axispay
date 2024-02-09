package defpackage;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: y5  reason: default package */
/* loaded from: classes.dex */
public class y5 extends r5 {
    public ArrayList<r5> v0 = new ArrayList<>();

    public void c(r5 r5Var) {
        this.v0.add(r5Var);
        if (r5Var.I() != null) {
            ((y5) r5Var.I()).q1(r5Var);
        }
        r5Var.Z0(this);
    }

    public ArrayList<r5> o1() {
        return this.v0;
    }

    public void p1() {
        ArrayList<r5> arrayList = this.v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r5 r5Var = this.v0.get(i);
            if (r5Var instanceof y5) {
                ((y5) r5Var).p1();
            }
        }
    }

    public void q1(r5 r5Var) {
        this.v0.remove(r5Var);
        r5Var.r0();
    }

    @Override // defpackage.r5
    public void r0() {
        this.v0.clear();
        super.r0();
    }

    public void r1() {
        this.v0.clear();
    }

    @Override // defpackage.r5
    public void t0(y4 y4Var) {
        super.t0(y4Var);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            this.v0.get(i).t0(y4Var);
        }
    }
}
