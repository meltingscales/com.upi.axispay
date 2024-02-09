package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.r6;
import defpackage.s6;
import defpackage.t6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a7  reason: default package */
/* loaded from: classes.dex */
public class a7 {
    public boolean a;
    public e7 b;
    public e7 c;
    public z6 d;
    public z6 e;
    public g5[] f;
    public g5 g;
    public float h;
    public float i;
    public int[] j;
    public double[] k;
    public double[] l;
    public String[] m;
    public float[] n;
    public ArrayList<e7> o;
    public HashMap<String, t6> p;
    public HashMap<String, s6> q;
    public HashMap<String, r6> r;
    public y6[] s;
    public int t;
    public View u;
    public int v;
    public float w;
    public Interpolator x;
    public boolean y;

    public final float a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.i;
            if (f3 != 1.0d) {
                float f4 = this.h;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        h5 h5Var = this.b.b;
        float f5 = Float.NaN;
        Iterator<e7> it = this.o.iterator();
        while (it.hasNext()) {
            e7 next = it.next();
            h5 h5Var2 = next.b;
            if (h5Var2 != null) {
                float f6 = next.d;
                if (f6 < f) {
                    h5Var = h5Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = next.d;
                }
            }
        }
        if (h5Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) h5Var.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) h5Var.b(d);
            }
        }
        return f;
    }

    public void b(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f[0].b(d, dArr);
        this.f[0].d(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.b.b(d, this.j, dArr, fArr, dArr2, fArr2);
    }

    public boolean c(View view, float f, long j, i5 i5Var) {
        t6.a aVar;
        boolean z;
        int i;
        double d;
        View view2;
        float f2;
        float a = a(f, null);
        int i2 = this.v;
        if (i2 != x6.a) {
            float f3 = 1.0f / i2;
            float floor = ((float) Math.floor(a / f3)) * f3;
            float f4 = (a % f3) / f3;
            if (!Float.isNaN(this.w)) {
                f4 = (f4 + this.w) % 1.0f;
            }
            Interpolator interpolator = this.x;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f4);
            } else {
                f2 = ((double) f4) > 0.5d ? 1.0f : 0.0f;
            }
            a = (f2 * f3) + floor;
        }
        float f5 = a;
        HashMap<String, s6> hashMap = this.q;
        if (hashMap != null) {
            for (s6 s6Var : hashMap.values()) {
                s6Var.b(view, f5);
            }
        }
        HashMap<String, t6> hashMap2 = this.p;
        if (hashMap2 != null) {
            t6.a aVar2 = null;
            boolean z2 = false;
            for (t6 t6Var : hashMap2.values()) {
                if (t6Var instanceof t6.a) {
                    aVar2 = (t6.a) t6Var;
                } else {
                    z2 |= t6Var.b(view, f5, j, i5Var);
                }
            }
            z = z2;
            aVar = aVar2;
        } else {
            aVar = null;
            z = false;
        }
        g5[] g5VarArr = this.f;
        if (g5VarArr != null) {
            double d2 = f5;
            g5VarArr[0].b(d2, this.k);
            this.f[0].d(d2, this.l);
            g5 g5Var = this.g;
            if (g5Var != null) {
                double[] dArr = this.k;
                if (dArr.length > 0) {
                    g5Var.b(d2, dArr);
                    this.g.d(d2, this.l);
                }
            }
            if (this.y) {
                d = d2;
            } else {
                d = d2;
                this.b.c(f5, view, this.j, this.k, this.l, null, this.a);
                this.a = false;
            }
            if (this.t != x6.a) {
                if (this.u == null) {
                    this.u = ((View) view.getParent()).findViewById(this.t);
                }
                if (this.u != null) {
                    float top = (view2.getTop() + this.u.getBottom()) / 2.0f;
                    float left = (this.u.getLeft() + this.u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, s6> hashMap3 = this.q;
            if (hashMap3 != null) {
                for (s6 s6Var2 : hashMap3.values()) {
                    if (s6Var2 instanceof s6.a) {
                        double[] dArr2 = this.l;
                        if (dArr2.length > 1) {
                            ((s6.a) s6Var2).c(view, f5, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.l;
                i = 1;
                z |= aVar.c(view, i5Var, f5, j, dArr3[0], dArr3[1]);
            } else {
                i = 1;
            }
            int i3 = i;
            while (true) {
                g5[] g5VarArr2 = this.f;
                if (i3 >= g5VarArr2.length) {
                    break;
                }
                g5VarArr2[i3].c(d, this.n);
                p6.b(this.b.n.get(this.m[i3 - 1]), view, this.n);
                i3++;
            }
            z6 z6Var = this.d;
            if (z6Var.b == 0) {
                if (f5 <= 0.0f) {
                    view.setVisibility(z6Var.c);
                } else if (f5 >= 1.0f) {
                    view.setVisibility(this.e.c);
                } else if (this.e.c != z6Var.c) {
                    view.setVisibility(0);
                }
            }
            if (this.s != null) {
                int i4 = 0;
                while (true) {
                    y6[] y6VarArr = this.s;
                    if (i4 >= y6VarArr.length) {
                        break;
                    }
                    y6VarArr[i4].a(f5, view);
                    i4++;
                }
            }
        } else {
            i = 1;
            e7 e7Var = this.b;
            float f6 = e7Var.f;
            e7 e7Var2 = this.c;
            float f7 = f6 + ((e7Var2.f - f6) * f5);
            float f8 = e7Var.g;
            float f9 = f8 + ((e7Var2.g - f8) * f5);
            float f10 = e7Var.h;
            float f11 = e7Var2.h;
            float f12 = e7Var.i;
            float f13 = e7Var2.i;
            float f14 = f7 + 0.5f;
            int i5 = (int) f14;
            float f15 = f9 + 0.5f;
            int i6 = (int) f15;
            int i7 = (int) (f14 + ((f11 - f10) * f5) + f10);
            int i8 = (int) (f15 + ((f13 - f12) * f5) + f12);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (f11 != f10 || f13 != f12 || this.a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(i10, CommonUtils.BYTES_IN_A_GIGABYTE));
                this.a = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap<String, r6> hashMap4 = this.r;
        if (hashMap4 != null) {
            for (r6 r6Var : hashMap4.values()) {
                if (r6Var instanceof r6.a) {
                    double[] dArr4 = this.l;
                    ((r6.a) r6Var).c(view, f5, dArr4[0], dArr4[i]);
                } else {
                    r6Var.b(view, f5);
                }
            }
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(15684));
        sb.append(this.b.f);
        String a = C0059ao.a(15685);
        sb.append(a);
        sb.append(this.b.g);
        sb.append(C0059ao.a(15686));
        sb.append(this.c.f);
        sb.append(a);
        sb.append(this.c.g);
        return sb.toString();
    }
}
