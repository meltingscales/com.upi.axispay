package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: z8  reason: default package */
/* loaded from: classes.dex */
public final class z8 {
    public static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i, i3, i2);
        }
        return new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals(C0059ao.a(6855))) {
            TypedArray k = c9.k(resources, theme, attributeSet, c8.GradientColor);
            float f = c9.f(k, xmlPullParser, C0059ao.a(6856), c8.GradientColor_android_startX, 0.0f);
            float f2 = c9.f(k, xmlPullParser, C0059ao.a(6857), c8.GradientColor_android_startY, 0.0f);
            float f3 = c9.f(k, xmlPullParser, C0059ao.a(6858), c8.GradientColor_android_endX, 0.0f);
            float f4 = c9.f(k, xmlPullParser, C0059ao.a(6859), c8.GradientColor_android_endY, 0.0f);
            float f5 = c9.f(k, xmlPullParser, C0059ao.a(6860), c8.GradientColor_android_centerX, 0.0f);
            float f6 = c9.f(k, xmlPullParser, C0059ao.a(6861), c8.GradientColor_android_centerY, 0.0f);
            int g = c9.g(k, xmlPullParser, C0059ao.a(6862), c8.GradientColor_android_type, 0);
            int b = c9.b(k, xmlPullParser, C0059ao.a(6863), c8.GradientColor_android_startColor, 0);
            String a2 = C0059ao.a(6864);
            boolean j = c9.j(xmlPullParser, a2);
            int b2 = c9.b(k, xmlPullParser, a2, c8.GradientColor_android_centerColor, 0);
            int b3 = c9.b(k, xmlPullParser, C0059ao.a(6865), c8.GradientColor_android_endColor, 0);
            int g2 = c9.g(k, xmlPullParser, C0059ao.a(6866), c8.GradientColor_android_tileMode, 0);
            float f7 = c9.f(k, xmlPullParser, C0059ao.a(6867), c8.GradientColor_android_gradientRadius, 0.0f);
            k.recycle();
            a a3 = a(c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g != 1) {
                if (g != 2) {
                    return new LinearGradient(f, f2, f3, f4, a3.a, a3.b, d(g2));
                }
                return new SweepGradient(f5, f6, a3.a, a3.b);
            } else if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, a3.a, a3.b, d(g2));
            } else {
                throw new XmlPullParserException(C0059ao.a(6868));
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0059ao.a(6869) + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + myunmn.C0059ao.a(6871));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.z8.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L8b
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L8b
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            r5 = 6870(0x1ad6, float:9.627E-42)
            java.lang.String r5 = myunmn.C0059ao.a(r5)
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L39
            goto L12
        L39:
            int[] r3 = defpackage.c8.GradientColorItem
            android.content.res.TypedArray r3 = defpackage.c9.k(r9, r12, r11, r3)
            int r5 = defpackage.c8.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = defpackage.c8.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L6b
            if (r8 == 0) goto L6b
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6b:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            r10 = 6871(0x1ad7, float:9.628E-42)
            java.lang.String r10 = myunmn.C0059ao.a(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L8b:
            int r9 = r4.size()
            if (r9 <= 0) goto L97
            z8$a r9 = new z8$a
            r9.<init>(r4, r2)
            return r9
        L97:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):z8$a");
    }

    public static Shader.TileMode d(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* compiled from: AxisPay */
    /* renamed from: z8$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }

        public a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
