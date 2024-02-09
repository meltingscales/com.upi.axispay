package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AxisPay */
/* renamed from: ho  reason: default package */
/* loaded from: classes.dex */
public class ho implements Interpolator {
    public float[] a;
    public float[] b;

    public ho(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public final void a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        b(path);
    }

    public final void b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.a[i2] = fArr[0];
                this.b[i2] = fArr[1];
            }
            if (Math.abs(this.a[0]) <= 1.0E-5d && Math.abs(this.b[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.b[i3] - 1.0f) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException(C0059ao.a(8103) + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException(C0059ao.a(8104));
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(8105));
            sb.append(this.a[0]);
            String a = C0059ao.a(8106);
            sb.append(a);
            sb.append(this.b[0]);
            sb.append(C0059ao.a(8107));
            int i6 = min - 1;
            sb.append(this.a[i6]);
            sb.append(a);
            sb.append(this.b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException(C0059ao.a(8108) + length);
    }

    public final void c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        b(path);
    }

    public final void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        String a = C0059ao.a(8109);
        if (c9.j(xmlPullParser, a)) {
            String i = c9.i(typedArray, xmlPullParser, a, 4);
            Path e = f9.e(i);
            if (e != null) {
                b(e);
                return;
            }
            throw new InflateException(C0059ao.a(8110) + i);
        }
        String a2 = C0059ao.a(8111);
        if (c9.j(xmlPullParser, a2)) {
            String a3 = C0059ao.a(8112);
            if (c9.j(xmlPullParser, a3)) {
                float f = c9.f(typedArray, xmlPullParser, a2, 0, 0.0f);
                float f2 = c9.f(typedArray, xmlPullParser, a3, 1, 0.0f);
                String a4 = C0059ao.a(8113);
                boolean j = c9.j(xmlPullParser, a4);
                String a5 = C0059ao.a(8114);
                if (j != c9.j(xmlPullParser, a5)) {
                    throw new InflateException(C0059ao.a(8115));
                }
                if (!j) {
                    c(f, f2);
                    return;
                } else {
                    a(f, f2, c9.f(typedArray, xmlPullParser, a4, 2, 0.0f), c9.f(typedArray, xmlPullParser, a5, 3, 0.0f));
                    return;
                }
            }
            throw new InflateException(C0059ao.a(8116));
        }
        throw new InflateException(C0059ao.a(8117));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float[] fArr2 = this.b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public ho(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = c9.k(resources, theme, attributeSet, co.l);
        d(k, xmlPullParser);
        k.recycle();
    }
}
