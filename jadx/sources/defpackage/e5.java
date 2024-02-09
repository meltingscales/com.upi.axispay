package defpackage;

import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: e5  reason: default package */
/* loaded from: classes.dex */
public class e5 implements Comparable<e5> {
    public static int r;
    public boolean b;
    public String c;
    public float g;
    public a k;
    public int d = -1;
    public int e = -1;
    public int f = 0;
    public boolean h = false;
    public float[] i = new float[9];
    public float[] j = new float[9];
    public x4[] l = new x4[16];
    public int m = 0;
    public int n = 0;
    public boolean o = false;
    public int p = -1;
    public float q = 0.0f;

    /* compiled from: AxisPay */
    /* renamed from: e5$a */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    static {
        C0059ao.a(e5.class, 370);
    }

    public e5(a aVar, String str) {
        this.k = aVar;
    }

    public static void c() {
        r++;
    }

    public final void a(x4 x4Var) {
        int i = 0;
        while (true) {
            int i2 = this.m;
            if (i < i2) {
                if (this.l[i] == x4Var) {
                    return;
                }
                i++;
            } else {
                x4[] x4VarArr = this.l;
                if (i2 >= x4VarArr.length) {
                    this.l = (x4[]) Arrays.copyOf(x4VarArr, x4VarArr.length * 2);
                }
                x4[] x4VarArr2 = this.l;
                int i3 = this.m;
                x4VarArr2[i3] = x4Var;
                this.m = i3 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(e5 e5Var) {
        return this.d - e5Var.d;
    }

    public final void d(x4 x4Var) {
        int i = this.m;
        int i2 = 0;
        while (i2 < i) {
            if (this.l[i2] == x4Var) {
                while (i2 < i - 1) {
                    x4[] x4VarArr = this.l;
                    int i3 = i2 + 1;
                    x4VarArr[i2] = x4VarArr[i3];
                    i2 = i3;
                }
                this.m--;
                return;
            }
            i2++;
        }
    }

    public void e() {
        this.c = null;
        this.k = a.UNKNOWN;
        this.f = 0;
        this.d = -1;
        this.e = -1;
        this.g = 0.0f;
        this.h = false;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            this.l[i2] = null;
        }
        this.m = 0;
        this.n = 0;
        this.b = false;
        Arrays.fill(this.j, 0.0f);
    }

    public void f(z4 z4Var, float f) {
        this.g = f;
        this.h = true;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i = this.m;
        this.e = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.l[i2].A(z4Var, this, false);
        }
        this.m = 0;
    }

    public void g(a aVar, String str) {
        this.k = aVar;
    }

    public final void h(z4 z4Var, x4 x4Var) {
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            this.l[i2].B(z4Var, x4Var, false);
        }
        this.m = 0;
    }

    public String toString() {
        String str = this.c;
        String a2 = C0059ao.a(3319);
        if (str != null) {
            return a2 + this.c;
        }
        return a2 + this.d;
    }
}
