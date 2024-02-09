package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.Month;
import defpackage.cx;
import java.util.Calendar;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nx  reason: default package */
/* loaded from: classes.dex */
public class nx extends RecyclerView.h<b> {
    public final cx<?> d;

    /* compiled from: AxisPay */
    /* renamed from: nx$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            nx.this.d.D(nx.this.d.v().f(Month.c(this.b, nx.this.d.x().c)));
            nx.this.d.E(cx.k.DAY);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: nx$b */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        public final TextView v;

        public b(TextView textView) {
            super(textView);
            this.v = textView;
        }
    }

    public nx(cx<?> cxVar) {
        this.d = cxVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: A */
    public void l(b bVar, int i) {
        int z = z(i);
        String string = bVar.v.getContext().getString(qv.mtrl_picker_navigate_to_year_description);
        bVar.v.setText(String.format(Locale.getDefault(), C0059ao.a(14171), Integer.valueOf(z)));
        bVar.v.setContentDescription(String.format(string, Integer.valueOf(z)));
        yw w = this.d.w();
        Calendar o = mx.o();
        xw xwVar = o.get(1) == z ? w.f : w.d;
        for (Long l : this.d.y().w()) {
            o.setTimeInMillis(l.longValue());
            if (o.get(1) == z) {
                xwVar = w.e;
            }
        }
        xwVar.d(bVar.v);
        bVar.v.setOnClickListener(x(z));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: B */
    public b n(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ov.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.v().o();
    }

    public final View.OnClickListener x(int i) {
        return new a(i);
    }

    public int y(int i) {
        return i - this.d.v().n().d;
    }

    public int z(int i) {
        return this.d.v().n().d + i;
    }
}
