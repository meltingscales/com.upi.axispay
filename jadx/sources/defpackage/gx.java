package defpackage;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: gx  reason: default package */
/* loaded from: classes.dex */
public class gx extends BaseAdapter {
    public static final int g = mx.q().getMaximum(4);
    public final Month b;
    public final DateSelector<?> c;
    public Collection<Long> d;
    public yw e;
    public final CalendarConstraints f;

    public gx(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.b = month;
        this.c = dateSelector;
        this.f = calendarConstraints;
        this.d = dateSelector.w();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.b.f();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.b.f() || i > i()) {
            return null;
        }
        return Long.valueOf(this.b.g(j(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = defpackage.ov.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L7a
            com.google.android.material.datepicker.Month r8 = r5.b
            int r2 = r8.f
            if (r7 < r2) goto L2d
            goto L7a
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            r4 = 7570(0x1d92, float:1.0608E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r4)
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.b
            long r7 = r8.g(r7)
            com.google.android.material.datepicker.Month r3 = r5.b
            int r3 = r3.d
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.e()
            int r4 = r4.d
            if (r3 != r4) goto L6c
            java.lang.String r7 = defpackage.ax.g(r7)
            r0.setContentDescription(r7)
            goto L73
        L6c:
            java.lang.String r7 = defpackage.ax.l(r7)
            r0.setContentDescription(r7)
        L73:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L82
        L7a:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L82:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L89
            return r0
        L89:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.e == null) {
            this.e = new yw(context);
        }
    }

    public boolean f(int i) {
        return i % this.b.e == 0;
    }

    public boolean g(int i) {
        return (i + 1) % this.b.e == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.f + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.b.e;
    }

    public final boolean h(long j) {
        Iterator<Long> it = this.c.w().iterator();
        while (it.hasNext()) {
            if (mx.a(j) == mx.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.b.f() + this.b.f) - 1;
    }

    public int j(int i) {
        return (i - this.b.f()) + 1;
    }

    public final void k(TextView textView, long j) {
        xw xwVar;
        if (textView == null) {
            return;
        }
        if (this.f.g().m(j)) {
            textView.setEnabled(true);
            if (h(j)) {
                xwVar = this.e.b;
            } else if (mx.o().getTimeInMillis() == j) {
                xwVar = this.e.c;
            } else {
                xwVar = this.e.a;
            }
        } else {
            textView.setEnabled(false);
            xwVar = this.e.g;
        }
        xwVar.d(textView);
    }

    public final void l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.d(j).equals(this.b)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.b.h(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.d) {
            l(materialCalendarGridView, l.longValue());
        }
        DateSelector<?> dateSelector = this.c;
        if (dateSelector != null) {
            for (Long l2 : dateSelector.w()) {
                l(materialCalendarGridView, l2.longValue());
            }
            this.d = this.c.w();
        }
    }

    public boolean n(int i) {
        return i >= b() && i <= i();
    }
}
