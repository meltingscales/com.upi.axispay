package defpackage;

import defpackage.nh0;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sh0  reason: default package */
/* loaded from: classes.dex */
public final class sh0 implements nh0.a {
    public final List<nh0> a;
    public final int b;
    public final lh0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public sh0(List<? extends nh0> list, int i, lh0 lh0Var) {
        yl0.f(list, C0059ao.a(2073));
        yl0.f(lh0Var, C0059ao.a(2074));
        this.a = list;
        this.b = i;
        this.c = lh0Var;
    }

    @Override // defpackage.nh0.a
    public mh0 a(lh0 lh0Var) {
        yl0.f(lh0Var, C0059ao.a(2075));
        if (this.b < this.a.size()) {
            return this.a.get(this.b).intercept(new sh0(this.a, this.b + 1, lh0Var));
        }
        throw new AssertionError(C0059ao.a(2076));
    }

    @Override // defpackage.nh0.a
    public lh0 request() {
        return this.c;
    }
}
