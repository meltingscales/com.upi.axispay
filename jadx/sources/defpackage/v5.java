package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: AxisPay */
/* renamed from: v5  reason: default package */
/* loaded from: classes.dex */
public class v5 extends r5 implements u5 {
    public r5[] v0 = new r5[4];
    public int w0 = 0;

    @Override // defpackage.u5
    public void a(s5 s5Var) {
    }

    @Override // defpackage.u5
    public void b() {
        this.w0 = 0;
        Arrays.fill(this.v0, (Object) null);
    }

    @Override // defpackage.u5
    public void c(r5 r5Var) {
        if (r5Var == this || r5Var == null) {
            return;
        }
        int i = this.w0 + 1;
        r5[] r5VarArr = this.v0;
        if (i > r5VarArr.length) {
            this.v0 = (r5[]) Arrays.copyOf(r5VarArr, r5VarArr.length * 2);
        }
        r5[] r5VarArr2 = this.v0;
        int i2 = this.w0;
        r5VarArr2[i2] = r5Var;
        this.w0 = i2 + 1;
    }

    public void o1(ArrayList<n6> arrayList, int i, n6 n6Var) {
        for (int i2 = 0; i2 < this.w0; i2++) {
            n6Var.a(this.v0[i2]);
        }
        for (int i3 = 0; i3 < this.w0; i3++) {
            h6.a(this.v0[i3], i, arrayList, n6Var);
        }
    }

    public int p1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.w0; i4++) {
            r5 r5Var = this.v0[i4];
            if (i == 0 && (i3 = r5Var.s0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = r5Var.t0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
