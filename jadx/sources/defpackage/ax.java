package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: AxisPay */
/* renamed from: ax  reason: default package */
/* loaded from: classes.dex */
public class ax {
    public static za<String, String> a(Long l, Long l2) {
        return b(l, l2, null);
    }

    public static za<String, String> b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return za.a(null, null);
        }
        if (l == null) {
            return za.a(null, d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return za.a(d(l.longValue(), simpleDateFormat), null);
        }
        Calendar o = mx.o();
        Calendar q = mx.q();
        q.setTimeInMillis(l.longValue());
        Calendar q2 = mx.q();
        q2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return za.a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (q.get(1) == q2.get(1)) {
            if (q.get(1) == o.get(1)) {
                return za.a(f(l.longValue(), Locale.getDefault()), f(l2.longValue(), Locale.getDefault()));
            }
            return za.a(f(l.longValue(), Locale.getDefault()), k(l2.longValue(), Locale.getDefault()));
        } else {
            return za.a(k(l.longValue(), Locale.getDefault()), k(l2.longValue(), Locale.getDefault()));
        }
    }

    public static String c(long j) {
        return d(j, null);
    }

    public static String d(long j, SimpleDateFormat simpleDateFormat) {
        Calendar o = mx.o();
        Calendar q = mx.q();
        q.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (o.get(1) == q.get(1)) {
            return e(j);
        }
        return j(j);
    }

    public static String e(long j) {
        return f(j, Locale.getDefault());
    }

    public static String f(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return mx.c(locale).format(new Date(j));
        }
        return mx.j(locale).format(new Date(j));
    }

    public static String g(long j) {
        return h(j, Locale.getDefault());
    }

    public static String h(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return mx.d(locale).format(new Date(j));
        }
        return mx.h(locale).format(new Date(j));
    }

    public static String i(Context context, long j) {
        return DateUtils.formatDateTime(context, j - TimeZone.getDefault().getOffset(j), 36);
    }

    public static String j(long j) {
        return k(j, Locale.getDefault());
    }

    public static String k(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return mx.s(locale).format(new Date(j));
        }
        return mx.i(locale).format(new Date(j));
    }

    public static String l(long j) {
        return m(j, Locale.getDefault());
    }

    public static String m(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return mx.t(locale).format(new Date(j));
        }
        return mx.h(locale).format(new Date(j));
    }
}
