package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: w8  reason: default package */
/* loaded from: classes.dex */
public final class w8 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException(C0059ao.a(4243));
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals(C0059ao.a(4244))) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0059ao.a(4245) + name);
    }

    public static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static ColorStateList d(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e(C0059ao.a(4246), C0059ao.a(4247), e);
            return null;
        }
    }

    public static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(C0059ao.a(4248))) {
                TypedArray h = h(resources, theme, attributeSet, c8.ColorStateListItem);
                int i3 = c8.ColorStateListItem_android_color;
                int resourceId = h.getResourceId(i3, -1);
                if (resourceId != -1 && !f(resources, resourceId)) {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = h.getColor(c8.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = h.getColor(i3, -65281);
                }
                float f = 1.0f;
                int i4 = c8.ColorStateListItem_android_alpha;
                if (h.hasValue(i4)) {
                    f = h.getFloat(i4, 1.0f);
                } else {
                    int i5 = c8.ColorStateListItem_alpha;
                    if (h.hasValue(i5)) {
                        f = h.getFloat(i5, 1.0f);
                    }
                }
                h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i6 = 0;
                for (int i7 = 0; i7 < attributeCount; i7++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != z7.alpha) {
                        int i8 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i6] = attributeNameResource;
                        i6 = i8;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i6);
                iArr2 = a9.a(iArr2, i2, g(color, f));
                iArr = (int[][]) a9.b(iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr4 = new int[i2];
        int[][] iArr5 = new int[i2];
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        return new ColorStateList(iArr5, iArr4);
    }

    public static boolean f(Resources resources, int i) {
        TypedValue c = c();
        resources.getValue(i, c, true);
        int i2 = c.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static int g(int i, float f) {
        return (i & 16777215) | (Math.round(Color.alpha(i) * f) << 24);
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
