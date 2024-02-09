package defpackage;

import java.util.LinkedList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: k30  reason: default package */
/* loaded from: classes.dex */
public final class k30 {
    public static final k30 e = new k30(l30.b, 0, 0, 0);
    public final int a;
    public final l30 b;
    public final int c;
    public final int d;

    public k30(l30 l30Var, int i, int i2, int i3) {
        this.b = l30Var;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public static int b(k30 k30Var) {
        int i = k30Var.c;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    public k30 a(int i) {
        l30 l30Var = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int i4 = i30.c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            l30Var = l30Var.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.c;
        k30 k30Var = new k30(l30Var, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return k30Var.c == 2078 ? k30Var.c(i + 1) : k30Var;
    }

    public k30 c(int i) {
        int i2 = this.c;
        return i2 == 0 ? this : new k30(this.b.b(i - i2, i2), this.a, 0, this.d);
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.a;
    }

    public boolean g(k30 k30Var) {
        int i = this.d + (i30.c[this.a][k30Var.a] >> 16);
        int i2 = this.c;
        int i3 = k30Var.c;
        if (i2 < i3) {
            i += b(k30Var) - b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= k30Var.d;
    }

    public k30 h(int i, int i2) {
        int i3 = this.d;
        l30 l30Var = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = i30.c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            l30Var = l30Var.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new k30(l30Var.a(i2, i8), i, 0, i3 + i8);
    }

    public k30 i(int i, int i2) {
        l30 l30Var = this.b;
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        return new k30(l30Var.a(i30.e[i3][i], i4).a(i2, 5), this.a, 0, this.d + i4 + 5);
    }

    public m30 j(byte[] bArr) {
        LinkedList<l30> linkedList = new LinkedList();
        for (l30 l30Var = c(bArr.length).b; l30Var != null; l30Var = l30Var.d()) {
            linkedList.addFirst(l30Var);
        }
        m30 m30Var = new m30();
        for (l30 l30Var2 : linkedList) {
            l30Var2.c(m30Var, bArr);
        }
        return m30Var;
    }

    public String toString() {
        return String.format(C0059ao.a(9845), i30.b[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
