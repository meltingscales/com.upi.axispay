package defpackage;

import android.graphics.Color;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d9  reason: default package */
/* loaded from: classes.dex */
public final class d9 {
    public static final ThreadLocal<double[]> a = new ThreadLocal<>();

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = k(f7, 0.0f, 360.0f);
        fArr[1] = k(abs, 0.0f, 1.0f);
        fArr[2] = k(f6, 0.0f, 1.0f);
    }

    public static void b(int i, int i2, int i3, double[] dArr) {
        if (dArr.length == 3) {
            double d = i / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = i2 / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = i3 / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(2598));
    }

    public static double c(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = i(i, i2);
            }
            double d = d(i) + 0.05d;
            double d2 = d(i2) + 0.05d;
            return Math.max(d, d2) / Math.min(d, d2);
        }
        throw new IllegalArgumentException(C0059ao.a(2599) + Integer.toHexString(i2));
    }

    public static double d(int i) {
        double[] l = l();
        g(i, l);
        return l[1] / 100.0d;
    }

    public static int e(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = f;
            if (c(m(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (c(m(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException(C0059ao.a(2600) + Integer.toHexString(i2));
    }

    public static void f(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void g(int i, double[] dArr) {
        b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static int h(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int i(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int h = h(alpha2, alpha);
        return Color.argb(h, j(Color.red(i), alpha2, Color.red(i2), alpha, h), j(Color.green(i), alpha2, Color.green(i2), alpha, h), j(Color.blue(i), alpha2, Color.blue(i2), alpha, h));
    }

    public static int j(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static float k(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static double[] l() {
        ThreadLocal<double[]> threadLocal = a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    public static int m(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException(C0059ao.a(2601));
        }
        return (i & 16777215) | (i2 << 24);
    }
}
