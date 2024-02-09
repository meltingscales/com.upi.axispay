package defpackage;

import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r30  reason: default package */
/* loaded from: classes.dex */
public final class r30 {
    public final p30 a;
    public final List<q30> b;

    public r30(p30 p30Var) {
        this.a = p30Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new q30(p30Var, new int[]{1}));
    }

    public final q30 a(int i) {
        if (i >= this.b.size()) {
            List<q30> list = this.b;
            q30 q30Var = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                p30 p30Var = this.a;
                q30Var = q30Var.g(new q30(p30Var, new int[]{1, p30Var.c((size - 1) + p30Var.d())}));
                this.b.add(q30Var);
            }
        }
        return this.b.get(i);
    }

    public void b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                q30 a = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] d = new q30(this.a, iArr2).h(i, 1).b(a)[1].d();
                int length2 = i - d.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(d, 0, iArr, length + length2, d.length);
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(5366));
        }
        throw new IllegalArgumentException(C0059ao.a(5367));
    }
}
