package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q30  reason: default package */
/* loaded from: classes.dex */
public final class q30 {
    public final p30 a;
    public final int[] b;

    public q30(p30 p30Var, int[] iArr) {
        if (iArr.length != 0) {
            this.a = p30Var;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public q30 a(q30 q30Var) {
        if (this.a.equals(q30Var.a)) {
            if (f()) {
                return q30Var;
            }
            if (q30Var.f()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = q30Var.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = p30.a(iArr2[i - length], iArr[i]);
            }
            return new q30(this.a, iArr3);
        }
        throw new IllegalArgumentException(C0059ao.a(6267));
    }

    public q30[] b(q30 q30Var) {
        if (this.a.equals(q30Var.a)) {
            if (!q30Var.f()) {
                q30 e = this.a.e();
                int f = this.a.f(q30Var.c(q30Var.e()));
                q30 q30Var2 = this;
                while (q30Var2.e() >= q30Var.e() && !q30Var2.f()) {
                    int e2 = q30Var2.e() - q30Var.e();
                    int h = this.a.h(q30Var2.c(q30Var2.e()), f);
                    q30 h2 = q30Var.h(e2, h);
                    e = e.a(this.a.b(e2, h));
                    q30Var2 = q30Var2.a(h2);
                }
                return new q30[]{e, q30Var2};
            }
            throw new IllegalArgumentException(C0059ao.a(6268));
        }
        throw new IllegalArgumentException(C0059ao.a(6269));
    }

    public int c(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public int[] d() {
        return this.b;
    }

    public int e() {
        return this.b.length - 1;
    }

    public boolean f() {
        return this.b[0] == 0;
    }

    public q30 g(q30 q30Var) {
        if (this.a.equals(q30Var.a)) {
            if (!f() && !q30Var.f()) {
                int[] iArr = this.b;
                int length = iArr.length;
                int[] iArr2 = q30Var.b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = p30.a(iArr3[i4], this.a.h(i2, iArr2[i3]));
                    }
                }
                return new q30(this.a, iArr3);
            }
            return this.a.e();
        }
        throw new IllegalArgumentException(C0059ao.a(6270));
    }

    public q30 h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.a.e();
            }
            int length = this.b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.h(this.b[i3], i2);
            }
            return new q30(this.a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        if (f()) {
            return C0059ao.a(6271);
        }
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int e = e(); e >= 0; e--) {
            int c = c(e);
            if (c != 0) {
                if (c < 0) {
                    if (e == e()) {
                        sb.append(C0059ao.a(6272));
                    } else {
                        sb.append(C0059ao.a(6273));
                    }
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(C0059ao.a(6274));
                }
                if (e == 0 || c != 1) {
                    int g = this.a.g(c);
                    if (g == 0) {
                        sb.append('1');
                    } else if (g == 1) {
                        sb.append('a');
                    } else {
                        sb.append(C0059ao.a(6275));
                        sb.append(g);
                    }
                }
                if (e != 0) {
                    if (e == 1) {
                        sb.append('x');
                    } else {
                        sb.append(C0059ao.a(6276));
                        sb.append(e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
