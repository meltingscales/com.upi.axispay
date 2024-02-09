package defpackage;

import defpackage.e6;

/* compiled from: AxisPay */
/* renamed from: f6  reason: default package */
/* loaded from: classes.dex */
public class f6 extends e6 {
    public int m;

    public f6(o6 o6Var) {
        super(o6Var);
        if (o6Var instanceof k6) {
            this.e = e6.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = e6.a.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.e6
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (c6 c6Var : this.k) {
            c6Var.a(c6Var);
        }
    }
}
