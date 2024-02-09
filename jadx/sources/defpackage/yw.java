package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* compiled from: AxisPay */
/* renamed from: yw  reason: default package */
/* loaded from: classes.dex */
public final class yw {
    public final xw a;
    public final xw b;
    public final xw c;
    public final xw d;
    public final xw e;
    public final xw f;
    public final xw g;
    public final Paint h;

    public yw(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(sy.c(context, iv.materialCalendarStyle, cx.class.getCanonicalName()), sv.MaterialCalendar);
        this.a = xw.a(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendar_dayStyle, 0));
        this.g = xw.a(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendar_dayInvalidStyle, 0));
        this.b = xw.a(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendar_daySelectedStyle, 0));
        this.c = xw.a(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = ty.a(context, obtainStyledAttributes, sv.MaterialCalendar_rangeFillColor);
        this.d = xw.a(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendar_yearStyle, 0));
        this.e = xw.a(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendar_yearSelectedStyle, 0));
        this.f = xw.a(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
