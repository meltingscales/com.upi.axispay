package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import defpackage.x4;
import java.util.Arrays;
import java.util.Comparator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d5  reason: default package */
/* loaded from: classes.dex */
public class d5 extends x4 {
    public int g;
    public e5[] h;
    public e5[] i;
    public int j;
    public b k;

    /* compiled from: AxisPay */
    /* renamed from: d5$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<e5> {
        public a(d5 d5Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(e5 e5Var, e5 e5Var2) {
            return e5Var.d - e5Var2.d;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d5$b */
    /* loaded from: classes.dex */
    public class b {
        public e5 a;

        public b(d5 d5Var) {
        }

        public boolean a(e5 e5Var, float f) {
            boolean z = true;
            if (!this.a.b) {
                for (int i = 0; i < 9; i++) {
                    float f2 = e5Var.j[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.a.j[i] = f3;
                    } else {
                        this.a.j[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.a.j;
                fArr[i2] = fArr[i2] + (e5Var.j[i2] * f);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.a.j[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                d5.this.G(this.a);
            }
            return false;
        }

        public void b(e5 e5Var) {
            this.a = e5Var;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.a.j[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(e5 e5Var) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = e5Var.j[i];
                float f2 = this.a.j[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.a.j, 0.0f);
        }

        public String toString() {
            e5 e5Var = this.a;
            String a = C0059ao.a(12531);
            if (e5Var != null) {
                for (int i = 0; i < 9; i++) {
                    a = a + this.a.j[i] + C0059ao.a(12532);
                }
            }
            return a + C0059ao.a(12533) + this.a;
        }
    }

    public d5(y4 y4Var) {
        super(y4Var);
        this.g = Barcode.ITF;
        this.h = new e5[Barcode.ITF];
        this.i = new e5[Barcode.ITF];
        this.j = 0;
        this.k = new b(this);
    }

    @Override // defpackage.x4
    public void B(z4 z4Var, x4 x4Var, boolean z) {
        e5 e5Var = x4Var.a;
        if (e5Var == null) {
            return;
        }
        x4.a aVar = x4Var.e;
        int c = aVar.c();
        for (int i = 0; i < c; i++) {
            e5 h = aVar.h(i);
            float a2 = aVar.a(i);
            this.k.b(h);
            if (this.k.a(e5Var, a2)) {
                F(h);
            }
            this.b += x4Var.b * a2;
        }
        G(e5Var);
    }

    public final void F(e5 e5Var) {
        int i;
        int i2 = this.j + 1;
        e5[] e5VarArr = this.h;
        if (i2 > e5VarArr.length) {
            e5[] e5VarArr2 = (e5[]) Arrays.copyOf(e5VarArr, e5VarArr.length * 2);
            this.h = e5VarArr2;
            this.i = (e5[]) Arrays.copyOf(e5VarArr2, e5VarArr2.length * 2);
        }
        e5[] e5VarArr3 = this.h;
        int i3 = this.j;
        e5VarArr3[i3] = e5Var;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && e5VarArr3[i4 - 1].d > e5Var.d) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a(this));
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        e5Var.b = true;
        e5Var.a(this);
    }

    public final void G(e5 e5Var) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == e5Var) {
                while (true) {
                    int i2 = this.j;
                    if (i < i2 - 1) {
                        e5[] e5VarArr = this.h;
                        int i3 = i + 1;
                        e5VarArr[i] = e5VarArr[i3];
                        i = i3;
                    } else {
                        this.j = i2 - 1;
                        e5Var.b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.x4, defpackage.z4.a
    public e5 a(z4 z4Var, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            e5 e5Var = this.h[i2];
            if (!zArr[e5Var.d]) {
                this.k.b(e5Var);
                if (i == -1) {
                    if (!this.k.c()) {
                    }
                    i = i2;
                } else {
                    if (!this.k.d(this.h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    @Override // defpackage.x4, defpackage.z4.a
    public void b(e5 e5Var) {
        this.k.b(e5Var);
        this.k.e();
        e5Var.j[e5Var.f] = 1.0f;
        F(e5Var);
    }

    @Override // defpackage.x4, defpackage.z4.a
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override // defpackage.x4, defpackage.z4.a
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // defpackage.x4
    public String toString() {
        String str = C0059ao.a(2487) + C0059ao.a(2488) + this.b + C0059ao.a(2489);
        for (int i = 0; i < this.j; i++) {
            this.k.b(this.h[i]);
            str = str + this.k + C0059ao.a(2490);
        }
        return str;
    }
}
