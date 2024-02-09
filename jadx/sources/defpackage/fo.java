package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import defpackage.f9;
import java.io.IOException;
import java.util.ArrayList;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: fo  reason: default package */
/* loaded from: classes.dex */
public class fo {

    /* compiled from: AxisPay */
    /* renamed from: fo$a */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<f9.b[]> {
        public f9.b[] a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public f9.b[] evaluate(float f, f9.b[] bVarArr, f9.b[] bVarArr2) {
            if (f9.b(bVarArr, bVarArr2)) {
                if (!f9.b(this.a, bVarArr)) {
                    this.a = f9.f(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.a[i].d(bVarArr[i], bVarArr2[i], f);
                }
                return this.a;
            }
            throw new IllegalArgumentException(C0059ao.a(13089));
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
        if (r23 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r24 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0124, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    public static void d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    public static PropertyValuesHolder e(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && h(i7)) || (z2 && h(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            f9.b[] d = f9.d(string);
            f9.b[] d2 = f9.d(string2);
            if (d == null && d2 == null) {
                return null;
            }
            if (d == null) {
                if (d2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), d2);
                }
                return null;
            }
            a aVar = new a();
            if (d2 != null) {
                if (f9.b(d, d2)) {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, d, d2);
                } else {
                    throw new InflateException(C0059ao.a(6108) + string + C0059ao.a(6109) + string2);
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, d);
            }
            return ofObject;
        }
        go a2 = i == 3 ? go.a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (h(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (h(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (h(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
        }
        if (propertyValuesHolder == null || a2 == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(a2);
        return propertyValuesHolder;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && h(i3)) || (z2 && h(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    public static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = c9.k(resources, theme, attributeSet, co.j);
        int i = 0;
        TypedValue l = c9.l(k, xmlPullParser, C0059ao.a(6110), 0);
        if ((l != null) && h(l.type)) {
            i = 3;
        }
        k.recycle();
        return i;
    }

    public static boolean h(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator i(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return j(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i) throws Resources.NotFoundException {
        return k(context, resources, theme, i, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i, float f) throws Resources.NotFoundException {
        String a2 = C0059ao.a(6111);
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = resources.getAnimation(i);
                return a(context, resources, theme, xmlResourceParser, f);
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(a2 + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(a2 + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray k = c9.k(resources, theme, attributeSet, co.g);
        TypedArray k2 = c9.k(resources, theme, attributeSet, co.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k, k2, f, xmlPullParser);
        int h = c9.h(k, xmlPullParser, C0059ao.a(6112), 0, 0);
        if (h > 0) {
            valueAnimator.setInterpolator(eo.b(context, h));
        }
        k.recycle();
        if (k2 != null) {
            k2.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe ofInt;
        TypedArray k = c9.k(resources, theme, attributeSet, co.j);
        float f = c9.f(k, xmlPullParser, C0059ao.a(6113), 3, -1.0f);
        String a2 = C0059ao.a(6114);
        TypedValue l = c9.l(k, xmlPullParser, a2, 0);
        boolean z = l != null;
        if (i == 4) {
            i = (z && h(l.type)) ? 3 : 0;
        }
        if (z) {
            if (i != 0) {
                ofInt = (i == 1 || i == 3) ? Keyframe.ofInt(f, c9.g(k, xmlPullParser, a2, 0, 0)) : null;
            } else {
                ofInt = Keyframe.ofFloat(f, c9.f(k, xmlPullParser, a2, 0, 0.0f));
            }
        } else if (i == 0) {
            ofInt = Keyframe.ofFloat(f);
        } else {
            ofInt = Keyframe.ofInt(f);
        }
        int h = c9.h(k, xmlPullParser, C0059ao.a(6115), 1, 0);
        if (h > 0) {
            ofInt.setInterpolator(eo.b(context, h));
        }
        k.recycle();
        return ofInt;
    }

    public static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals(C0059ao.a(6116))) {
                if (i == 4) {
                    i = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(go.a());
            }
        }
        return propertyValuesHolder;
    }

    public static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals(C0059ao.a(6117))) {
                    TypedArray k = c9.k(resources, theme, attributeSet, co.i);
                    String i2 = c9.i(k, xmlPullParser, C0059ao.a(6118), 3);
                    int g = c9.g(k, xmlPullParser, C0059ao.a(6119), 2, 4);
                    PropertyValuesHolder o = o(context, resources, theme, xmlPullParser, i2, g);
                    if (o == null) {
                        o = e(k, g, 0, 1, i2);
                    }
                    if (o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o);
                    }
                    k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    public static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long g = c9.g(typedArray, xmlPullParser, C0059ao.a(6120), 1, 300);
        long g2 = c9.g(typedArray, xmlPullParser, C0059ao.a(6121), 2, 0);
        int g3 = c9.g(typedArray, xmlPullParser, C0059ao.a(6122), 7, 4);
        if (c9.j(xmlPullParser, C0059ao.a(6123)) && c9.j(xmlPullParser, C0059ao.a(6124))) {
            if (g3 == 4) {
                g3 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e = e(typedArray, g3, 5, 6, C0059ao.a(6125));
            if (e != null) {
                valueAnimator.setValues(e);
            }
        }
        valueAnimator.setDuration(g);
        valueAnimator.setStartDelay(g2);
        valueAnimator.setRepeatCount(c9.g(typedArray, xmlPullParser, C0059ao.a(6126), 3, 0));
        valueAnimator.setRepeatMode(c9.g(typedArray, xmlPullParser, C0059ao.a(6127), 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g3, f, xmlPullParser);
        }
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i2 = c9.i(typedArray, xmlPullParser, C0059ao.a(6128), 1);
        if (i2 != null) {
            String i3 = c9.i(typedArray, xmlPullParser, C0059ao.a(6129), 2);
            String i4 = c9.i(typedArray, xmlPullParser, C0059ao.a(6130), 3);
            if (i != 2) {
            }
            if (i3 == null && i4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + C0059ao.a(6131));
            }
            s(f9.e(i2), objectAnimator, f * 0.5f, i3, i4);
            return;
        }
        objectAnimator.setPropertyName(c9.i(typedArray, xmlPullParser, C0059ao.a(6132), 0));
    }

    public static void s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
