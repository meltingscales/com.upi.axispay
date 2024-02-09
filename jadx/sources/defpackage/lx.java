package defpackage;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: AxisPay */
/* renamed from: lx  reason: default package */
/* loaded from: classes.dex */
public class lx {
    public static final lx c = new lx(null, null);
    public final Long a;
    public final TimeZone b;

    public lx(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    public static lx c() {
        return c;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
