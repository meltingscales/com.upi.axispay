package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: AxisPay */
/* renamed from: bx  reason: default package */
/* loaded from: classes.dex */
public class bx extends BaseAdapter {
    public static final int e;
    public final Calendar b;
    public final int c;
    public final int d;

    static {
        e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public bx() {
        Calendar q = mx.q();
        this.b = q;
        this.c = q.getMaximum(7);
        this.d = q.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.c) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    public final int b(int i) {
        int i2 = i + this.d;
        int i3 = this.c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ov.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.b.set(7, b(i));
        textView.setText(this.b.getDisplayName(7, e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(qv.mtrl_picker_day_of_week_column_header), this.b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
