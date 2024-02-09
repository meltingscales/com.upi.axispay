package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.io.IOException;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: eo  reason: default package */
/* loaded from: classes.dex */
public class eo {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Interpolator a(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r3 = r5.getDepth()
            r4 = 0
        L5:
            int r0 = r5.next()
            r1 = 3
            if (r0 != r1) goto L12
            int r1 = r5.getDepth()
            if (r1 <= r3) goto L102
        L12:
            r1 = 1
            if (r0 == r1) goto L102
            r1 = 2
            if (r0 == r1) goto L19
            goto L5
        L19:
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
            java.lang.String r0 = r5.getName()
            r1 = 5125(0x1405, float:7.182E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L34
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            goto L5
        L34:
            r1 = 5126(0x1406, float:7.183E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L48
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r2, r4)
        L46:
            r4 = r0
            goto L5
        L48:
            r1 = 5127(0x1407, float:7.184E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5b
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r2, r4)
            goto L46
        L5b:
            r1 = 5128(0x1408, float:7.186E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L6e
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            goto L5
        L6e:
            r1 = 5129(0x1409, float:7.187E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L81
            android.view.animation.CycleInterpolator r0 = new android.view.animation.CycleInterpolator
            r0.<init>(r2, r4)
            goto L46
        L81:
            r1 = 5130(0x140a, float:7.189E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L94
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator
            r0.<init>(r2, r4)
            goto L46
        L94:
            r1 = 5131(0x140b, float:7.19E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La7
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>(r2, r4)
            goto L46
        La7:
            r1 = 5132(0x140c, float:7.191E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lba
            android.view.animation.AnticipateOvershootInterpolator r0 = new android.view.animation.AnticipateOvershootInterpolator
            r0.<init>(r2, r4)
            goto L46
        Lba:
            r1 = 5133(0x140d, float:7.193E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lce
            android.view.animation.BounceInterpolator r4 = new android.view.animation.BounceInterpolator
            r4.<init>()
            goto L5
        Lce:
            r1 = 5134(0x140e, float:7.194E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le2
            ho r0 = new ho
            r0.<init>(r2, r4, r5)
            goto L46
        Le2:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 5135(0x140f, float:7.196E-42)
            java.lang.String r4 = myunmn.C0059ao.a(r4)
            r3.append(r4)
            java.lang.String r4 = r5.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L102:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    public static Interpolator b(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        String a = C0059ao.a(5136);
        try {
            try {
                if (i == 17563663) {
                    return new se();
                }
                if (i == 17563661) {
                    return new te();
                }
                if (i == 17563662) {
                    return new ue();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i);
                Interpolator a2 = a(context, context.getResources(), context.getTheme(), animation);
                if (animation != null) {
                    animation.close();
                }
                return a2;
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(a + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(a + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
