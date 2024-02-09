package defpackage;

import android.view.View;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;
import java.util.LinkedHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: e7  reason: default package */
/* loaded from: classes.dex */
public class e7 implements Comparable<e7> {
    public static String[] r = {C0059ao.a(3369), C0059ao.a(3370), C0059ao.a(3371), C0059ao.a(3372), C0059ao.a(3373), C0059ao.a(3374)};
    public h5 b;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int k;
    public int l;
    public a7 m;
    public LinkedHashMap<String, i7> n;
    public int o;
    public double[] p;
    public double[] q;
    public int c = 0;
    public float j = Float.NaN;

    public e7() {
        int i = x6.a;
        this.k = i;
        this.l = i;
        this.m = null;
        this.n = new LinkedHashMap<>();
        this.o = 0;
        this.p = new double[18];
        this.q = new double[18];
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(e7 e7Var) {
        return Float.compare(this.e, e7Var.e);
    }

    public void b(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
        float f5 = this.i;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        a7 a7Var = this.m;
        if (a7Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            a7Var.b(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            f = f4;
            double d4 = f6;
            double d5 = f8;
            float sin = (float) (f17 + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((f18 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((f15 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            f3 = (float) ((f16 - (d2 * Math.cos(d3))) - (f5 / 2.0f));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    public void c(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        boolean z2;
        boolean z3;
        float f3;
        float f4 = this.f;
        float f5 = this.g;
        float f6 = this.h;
        float f7 = this.i;
        if (iArr.length != 0 && this.p.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.p = new double[i];
            this.q = new double[i];
        }
        Arrays.fill(this.p, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.p[iArr[i2]] = dArr[i2];
            this.q[iArr[i2]] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i3 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr4 = this.p;
            if (i3 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i3]) && (dArr3 == null || dArr3[i3] == 0.0d)) {
                f3 = f8;
            } else {
                double d = dArr3 != null ? dArr3[i3] : 0.0d;
                if (!Double.isNaN(this.p[i3])) {
                    d = this.p[i3] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.q[i3];
                if (i3 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i3 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i3 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i3 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i3 == 5) {
                    f8 = f13;
                }
                i3++;
            }
            f8 = f3;
            i3++;
        }
        float f15 = f8;
        a7 a7Var = this.m;
        if (a7Var != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            a7Var.b(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float sin = (float) ((f16 + (Math.sin(d3) * d2)) - (f6 / 2.0f));
            f2 = f7;
            float cos = (float) ((f17 - (Math.cos(d3) * d2)) - (f7 / 2.0f));
            double d4 = f9;
            double d5 = f10;
            float sin2 = (float) (f18 + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float cos2 = (float) ((f19 - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                z2 = false;
                dArr2[0] = sin2;
                z3 = true;
                dArr2[1] = cos2;
            } else {
                z2 = false;
                z3 = true;
            }
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (f15 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f4 = sin;
            f5 = cos;
        } else {
            f2 = f7;
            z2 = false;
            z3 = true;
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (0.0f + f15 + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))));
            }
        }
        if (view instanceof w6) {
            ((w6) view).a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f20 = f4 + 0.5f;
        int i4 = (int) f20;
        float f21 = f5 + 0.5f;
        int i5 = (int) f21;
        int i6 = (int) (f20 + f6);
        int i7 = (int) (f21 + f2);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 != view.getMeasuredWidth() || i9 != view.getMeasuredHeight()) {
            z2 = z3;
        }
        if (z2 || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i8, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(i9, CommonUtils.BYTES_IN_A_GIGABYTE));
        }
        view.layout(i4, i5, i6, i7);
    }
}
