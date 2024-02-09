package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: x8  reason: default package */
/* loaded from: classes.dex */
public final class x8 {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public x8(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    public static x8 a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals(C0059ao.a(5167))) {
                return d(z8.b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals(C0059ao.a(5168))) {
                return c(w8.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + C0059ao.a(5169) + name);
        }
        throw new XmlPullParserException(C0059ao.a(5170));
    }

    public static x8 b(int i) {
        return new x8(null, null, i);
    }

    public static x8 c(ColorStateList colorStateList) {
        return new x8(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static x8 d(Shader shader) {
        return new x8(shader, null, 0);
    }

    public static x8 g(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e) {
            Log.e(C0059ao.a(5171), C0059ao.a(5172), e);
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        return this.a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i) {
        this.c = i;
    }

    public boolean l() {
        return h() || this.c != 0;
    }
}
