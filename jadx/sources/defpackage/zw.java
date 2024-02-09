package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zw  reason: default package */
/* loaded from: classes.dex */
public abstract class zw extends ky {
    public final TextInputLayout b;
    public final DateFormat c;
    public final CalendarConstraints d;
    public final String e;
    public final Runnable f;
    public Runnable g;

    /* compiled from: AxisPay */
    /* renamed from: zw$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout textInputLayout = zw.this.b;
            DateFormat dateFormat = zw.this.c;
            Context context = textInputLayout.getContext();
            String string = context.getString(qv.mtrl_picker_invalid_format);
            String format = String.format(context.getString(qv.mtrl_picker_invalid_format_use), this.b);
            String format2 = String.format(context.getString(qv.mtrl_picker_invalid_format_example), dateFormat.format(new Date(mx.o().getTimeInMillis())));
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String a = C0059ao.a(9603);
            sb.append(a);
            sb.append(format);
            sb.append(a);
            sb.append(format2);
            textInputLayout.setError(sb.toString());
            zw.this.e();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zw$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ long b;

        public b(long j) {
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            zw.this.b.setError(String.format(zw.this.e, ax.c(this.b)));
            zw.this.e();
        }
    }

    public zw(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.c = dateFormat;
        this.b = textInputLayout;
        this.d = calendarConstraints;
        this.e = textInputLayout.getContext().getString(qv.mtrl_picker_out_of_range);
        this.f = new a(str);
    }

    public final Runnable d(long j) {
        return new b(j);
    }

    public abstract void e();

    public abstract void f(Long l);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    @Override // defpackage.ky, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.removeCallbacks(this.f);
        this.b.removeCallbacks(this.g);
        this.b.setError(null);
        f(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.c.parse(charSequence.toString());
            this.b.setError(null);
            long time = parse.getTime();
            if (this.d.g().m(time) && this.d.p(time)) {
                f(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable d = d(time);
            this.g = d;
            g(this.b, d);
        } catch (ParseException unused) {
            g(this.b, this.f);
        }
    }
}
