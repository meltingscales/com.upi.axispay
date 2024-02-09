package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import defpackage.cx;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hx  reason: default package */
/* loaded from: classes.dex */
public class hx extends RecyclerView.h<b> {
    public final Context d;
    public final CalendarConstraints e;
    public final DateSelector<?> f;
    public final cx.l g;
    public final int h;

    /* compiled from: AxisPay */
    /* renamed from: hx$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView b;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.b.getAdapter2().n(i)) {
                hx.this.g.a(this.b.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: hx$b */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        public final TextView v;
        public final MaterialCalendarGridView w;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(mv.month_title);
            this.v = textView;
            ac.r0(textView, true);
            this.w = (MaterialCalendarGridView) linearLayout.findViewById(mv.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public hx(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, cx.l lVar) {
        Month n = calendarConstraints.n();
        Month h = calendarConstraints.h();
        Month l = calendarConstraints.l();
        if (n.compareTo(l) <= 0) {
            if (l.compareTo(h) <= 0) {
                int z = gx.g * cx.z(context);
                int z2 = dx.z(context) ? cx.z(context) : 0;
                this.d = context;
                this.h = z + z2;
                this.e = calendarConstraints;
                this.f = dateSelector;
                this.g = lVar;
                u(true);
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(8542));
        }
        throw new IllegalArgumentException(C0059ao.a(8543));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: A */
    public void l(b bVar, int i) {
        Month n = this.e.n().n(i);
        bVar.v.setText(n.i(bVar.b.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.w.findViewById(mv.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && n.equals(materialCalendarGridView.getAdapter2().b)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        } else {
            gx gxVar = new gx(n, this.f, this.e);
            materialCalendarGridView.setNumColumns(n.e);
            materialCalendarGridView.setAdapter((ListAdapter) gxVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: B */
    public b n(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ov.mtrl_calendar_month_labeled, viewGroup, false);
        if (dx.z(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.h));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return this.e.n().n(i).l();
    }

    public Month x(int i) {
        return this.e.n().n(i);
    }

    public CharSequence y(int i) {
        return x(i).i(this.d);
    }

    public int z(Month month) {
        return this.e.n().o(month);
    }
}
