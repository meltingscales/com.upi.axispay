package defpackage;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mx  reason: default package */
/* loaded from: classes.dex */
public class mx {
    public static AtomicReference<lx> a = new AtomicReference<>();

    public static long a(long j) {
        Calendar q = q();
        q.setTimeInMillis(j);
        return f(q).getTimeInMillis();
    }

    public static int b(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 >= 0 && i2 < str.length()) {
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return e(C0059ao.a(13176), locale);
    }

    @TargetApi(24)
    public static DateFormat d(Locale locale) {
        return e(C0059ao.a(13177), locale);
    }

    @TargetApi(24)
    public static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(p());
        return instanceForSkeleton;
    }

    public static Calendar f(Calendar calendar) {
        Calendar r = r(calendar);
        Calendar q = q();
        q.set(r.get(1), r.get(2), r.get(5));
        return q;
    }

    public static java.text.DateFormat g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(n());
        return dateInstance;
    }

    public static java.text.DateFormat h(Locale locale) {
        return g(0, locale);
    }

    public static java.text.DateFormat i(Locale locale) {
        return g(2, locale);
    }

    public static java.text.DateFormat j(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) i(locale);
        simpleDateFormat.applyPattern(u(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    public static SimpleDateFormat k() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll(C0059ao.a(13178), C0059ao.a(13179)), Locale.getDefault());
        simpleDateFormat.setTimeZone(n());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String l(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(C0059ao.a(13180), resources.getString(qv.mtrl_picker_text_input_day_abbr)).replaceAll(C0059ao.a(13181), resources.getString(qv.mtrl_picker_text_input_month_abbr)).replaceAll(C0059ao.a(13182), resources.getString(qv.mtrl_picker_text_input_year_abbr));
    }

    public static lx m() {
        lx lxVar = a.get();
        return lxVar == null ? lx.c() : lxVar;
    }

    public static TimeZone n() {
        return TimeZone.getTimeZone(C0059ao.a(13183));
    }

    public static Calendar o() {
        Calendar a2 = m().a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(n());
        return a2;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone p() {
        return android.icu.util.TimeZone.getTimeZone(C0059ao.a(13184));
    }

    public static Calendar q() {
        return r(null);
    }

    public static Calendar r(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(n());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat s(Locale locale) {
        return e(C0059ao.a(13185), locale);
    }

    @TargetApi(24)
    public static DateFormat t(Locale locale) {
        return e(C0059ao.a(13186), locale);
    }

    public static String u(String str) {
        int b = b(str, C0059ao.a(13187), 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String a2 = C0059ao.a(13188);
        int b2 = b(str, a2, 1, b);
        if (b2 < str.length()) {
            a2 = a2 + C0059ao.a(13189);
        }
        return str.replace(str.substring(b(str, a2, -1, b) + 1, b2), C0059ao.a(13190)).trim();
    }
}
