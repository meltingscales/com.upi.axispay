package defpackage;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: e0  reason: default package */
/* loaded from: classes.dex */
public class e0 {
    public final Deque<WeakReference<XmlPullParser>> a = new ArrayDeque();

    public static boolean b(XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3) {
                    return xmlPullParser.getEventType() == 1;
                }
                return true;
            } catch (XmlPullParserException unused) {
                return true;
            }
        }
        return true;
    }

    public static XmlPullParser c(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    public static boolean d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return C0059ao.a(3129).equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    public boolean a(AttributeSet attributeSet) {
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() == 1) {
                XmlPullParser c = c(this.a);
                this.a.push(new WeakReference<>(xmlPullParser));
                return d(xmlPullParser, c);
            }
            return false;
        }
        return false;
    }
}
