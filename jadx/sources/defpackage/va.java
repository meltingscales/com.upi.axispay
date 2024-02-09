package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: va  reason: default package */
/* loaded from: classes.dex */
public final class va {
    public static final Locale a;

    static {
        String a2 = C0059ao.a(4554);
        a = new Locale(a2, a2);
    }

    public static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(a)) {
            return 0;
        }
        String c = ra.c(locale);
        if (c == null) {
            return a(locale);
        }
        return (c.equalsIgnoreCase(C0059ao.a(4555)) || c.equalsIgnoreCase(C0059ao.a(4556))) ? 1 : 0;
    }
}
