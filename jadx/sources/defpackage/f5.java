package defpackage;

import defpackage.x4;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: f5  reason: default package */
/* loaded from: classes.dex */
public class f5 implements x4.a {
    public static float m;
    public int a = 16;
    public int b = 16;
    public int[] c = new int[16];
    public int[] d = new int[16];
    public int[] e = new int[16];
    public float[] f = new float[16];
    public int[] g = new int[16];
    public int[] h = new int[16];
    public int i = 0;
    public int j = -1;
    public final x4 k;
    public final y4 l;

    static {
        C0059ao.a(f5.class, 311);
    }

    public f5(x4 x4Var, y4 y4Var) {
        this.k = x4Var;
        this.l = y4Var;
        clear();
    }

    @Override // defpackage.x4.a
    public float a(int i) {
        int i2 = this.i;
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f[i3];
            }
            i3 = this.h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // defpackage.x4.a
    public float b(e5 e5Var, boolean z) {
        int p = p(e5Var);
        if (p == -1) {
            return 0.0f;
        }
        r(e5Var);
        float f = this.f[p];
        if (this.j == p) {
            this.j = this.h[p];
        }
        this.e[p] = -1;
        int[] iArr = this.g;
        if (iArr[p] != -1) {
            int[] iArr2 = this.h;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.h;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.i--;
        e5Var.n--;
        if (z) {
            e5Var.d(this.k);
        }
        return f;
    }

    @Override // defpackage.x4.a
    public int c() {
        return this.i;
    }

    @Override // defpackage.x4.a
    public void clear() {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            e5 h = h(i2);
            if (h != null) {
                h.d(this.k);
            }
        }
        for (int i3 = 0; i3 < this.a; i3++) {
            this.e[i3] = -1;
            this.d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.b; i4++) {
            this.c[i4] = -1;
        }
        this.i = 0;
        this.j = -1;
    }

    @Override // defpackage.x4.a
    public float d(e5 e5Var) {
        int p = p(e5Var);
        if (p != -1) {
            return this.f[p];
        }
        return 0.0f;
    }

    @Override // defpackage.x4.a
    public boolean e(e5 e5Var) {
        return p(e5Var) != -1;
    }

    @Override // defpackage.x4.a
    public float f(x4 x4Var, boolean z) {
        float d = d(x4Var.a);
        b(x4Var.a, z);
        f5 f5Var = (f5) x4Var.e;
        int c = f5Var.c();
        int i = f5Var.j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < c) {
            int[] iArr = f5Var.e;
            if (iArr[i3] != -1) {
                i(this.l.d[iArr[i3]], f5Var.f[i3] * d, z);
                i2++;
            }
            i3++;
        }
        return d;
    }

    @Override // defpackage.x4.a
    public void g(e5 e5Var, float f) {
        float f2 = m;
        if (f > (-f2) && f < f2) {
            b(e5Var, true);
            return;
        }
        if (this.i == 0) {
            m(0, e5Var, f);
            l(e5Var, 0);
            this.j = 0;
            return;
        }
        int p = p(e5Var);
        if (p != -1) {
            this.f[p] = f;
            return;
        }
        if (this.i + 1 >= this.a) {
            o();
        }
        int i = this.i;
        int i2 = this.j;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.e;
            int i5 = iArr[i2];
            int i6 = e5Var.d;
            if (i5 == i6) {
                this.f[i2] = f;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.h[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, e5Var, f);
    }

    @Override // defpackage.x4.a
    public e5 h(int i) {
        int i2 = this.i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.l.d[this.e[i3]];
            }
            i3 = this.h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // defpackage.x4.a
    public void i(e5 e5Var, float f, boolean z) {
        float f2 = m;
        if (f <= (-f2) || f >= f2) {
            int p = p(e5Var);
            if (p == -1) {
                g(e5Var, f);
                return;
            }
            float[] fArr = this.f;
            fArr[p] = fArr[p] + f;
            float f3 = fArr[p];
            float f4 = m;
            if (f3 <= (-f4) || fArr[p] >= f4) {
                return;
            }
            fArr[p] = 0.0f;
            b(e5Var, z);
        }
    }

    @Override // defpackage.x4.a
    public void j(float f) {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // defpackage.x4.a
    public void k() {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public final void l(e5 e5Var, int i) {
        int[] iArr;
        int i2 = e5Var.d % this.b;
        int[] iArr2 = this.c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.d;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.d[i] = -1;
    }

    public final void m(int i, e5 e5Var, float f) {
        this.e[i] = e5Var.d;
        this.f[i] = f;
        this.g[i] = -1;
        this.h[i] = -1;
        e5Var.a(this.k);
        e5Var.n++;
        this.i++;
    }

    public final int n() {
        for (int i = 0; i < this.a; i++) {
            if (this.e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void o() {
        int i = this.a * 2;
        this.e = Arrays.copyOf(this.e, i);
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.d = Arrays.copyOf(this.d, i);
        for (int i2 = this.a; i2 < i; i2++) {
            this.e[i2] = -1;
            this.d[i2] = -1;
        }
        this.a = i;
    }

    public int p(e5 e5Var) {
        int[] iArr;
        if (this.i != 0 && e5Var != null) {
            int i = e5Var.d;
            int i2 = this.c[i % this.b];
            if (i2 == -1) {
                return -1;
            }
            if (this.e[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.d;
                if (iArr[i2] == -1 || this.e[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            if (iArr[i2] != -1 && this.e[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    public final void q(int i, e5 e5Var, float f) {
        int n = n();
        m(n, e5Var, f);
        if (i != -1) {
            this.g[n] = i;
            int[] iArr = this.h;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.g[n] = -1;
            if (this.i > 0) {
                this.h[n] = this.j;
                this.j = n;
            } else {
                this.h[n] = -1;
            }
        }
        int[] iArr2 = this.h;
        if (iArr2[n] != -1) {
            this.g[iArr2[n]] = n;
        }
        l(e5Var, n);
    }

    public final void r(e5 e5Var) {
        int[] iArr;
        int i = e5Var.d;
        int i2 = i % this.b;
        int[] iArr2 = this.c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            return;
        }
        if (this.e[i3] == i) {
            int[] iArr3 = this.d;
            iArr2[i2] = iArr3[i3];
            iArr3[i3] = -1;
            return;
        }
        while (true) {
            iArr = this.d;
            if (iArr[i3] == -1 || this.e[iArr[i3]] == i) {
                break;
            }
            i3 = iArr[i3];
        }
        int i4 = iArr[i3];
        if (i4 == -1 || this.e[i4] != i) {
            return;
        }
        iArr[i3] = iArr[i4];
        iArr[i4] = -1;
    }

    public String toString() {
        String str = hashCode() + C0059ao.a(4282);
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            e5 h = h(i2);
            if (h != null) {
                String str2 = str + h + C0059ao.a(4283) + a(i2) + C0059ao.a(4284);
                int p = p(h);
                String str3 = str2 + C0059ao.a(4285);
                int i3 = this.g[p];
                String a = C0059ao.a(4286);
                String str4 = (i3 != -1 ? str3 + this.l.d[this.e[this.g[p]]] : str3 + a) + C0059ao.a(4287);
                str = (this.h[p] != -1 ? str4 + this.l.d[this.e[this.h[p]]] : str4 + a) + C0059ao.a(4288);
            }
        }
        return str + C0059ao.a(4289);
    }
}
