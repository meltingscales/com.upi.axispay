package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: cx  reason: default package */
/* loaded from: classes.dex */
public final class cx<S> extends jx<S> {
    public static final Object m = C0059ao.a(3582);
    public static final Object n = C0059ao.a(3583);
    public static final Object o = C0059ao.a(3584);
    public static final Object p = C0059ao.a(3585);
    public int c;
    public DateSelector<S> d;
    public CalendarConstraints e;
    public Month f;
    public k g;
    public yw h;
    public RecyclerView i;
    public RecyclerView j;
    public View k;
    public View l;

    /* compiled from: AxisPay */
    /* renamed from: cx$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            cx.this.j.smoothScrollToPosition(this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$b */
    /* loaded from: classes.dex */
    public class b extends eb {
        public b(cx cxVar) {
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            lcVar.c0(null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$c */
    /* loaded from: classes.dex */
    public class c extends kx {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void N1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = cx.this.j.getWidth();
                iArr[1] = cx.this.j.getWidth();
                return;
            }
            iArr[0] = cx.this.j.getHeight();
            iArr[1] = cx.this.j.getHeight();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$d */
    /* loaded from: classes.dex */
    public class d implements l {
        public d() {
        }

        @Override // defpackage.cx.l
        public void a(long j) {
            if (cx.this.e.g().m(j)) {
                cx.this.d.J(j);
                Iterator<ix<S>> it = cx.this.b.iterator();
                while (it.hasNext()) {
                    it.next().b((S) cx.this.d.z());
                }
                cx.this.j.getAdapter().j();
                if (cx.this.i != null) {
                    cx.this.i.getAdapter().j();
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$e */
    /* loaded from: classes.dex */
    public class e extends RecyclerView.o {
        public final Calendar a = mx.q();
        public final Calendar b = mx.q();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int width;
            if ((recyclerView.getAdapter() instanceof nx) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                nx nxVar = (nx) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (za<Long, Long> zaVar : cx.this.d.k()) {
                    Long l = zaVar.a;
                    if (l != null && zaVar.b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.b.setTimeInMillis(zaVar.b.longValue());
                        int y = nxVar.y(this.a.get(1));
                        int y2 = nxVar.y(this.b.get(1));
                        View C = gridLayoutManager.C(y);
                        View C2 = gridLayoutManager.C(y2);
                        int U2 = y / gridLayoutManager.U2();
                        int U22 = y2 / gridLayoutManager.U2();
                        int i = U2;
                        while (i <= U22) {
                            View C3 = gridLayoutManager.C(gridLayoutManager.U2() * i);
                            if (C3 != null) {
                                int top = C3.getTop() + cx.this.h.d.c();
                                int bottom = C3.getBottom() - cx.this.h.d.b();
                                int left = i == U2 ? C.getLeft() + (C.getWidth() / 2) : 0;
                                if (i == U22) {
                                    width = C2.getLeft() + (C2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, cx.this.h.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$f */
    /* loaded from: classes.dex */
    public class f extends eb {
        public f() {
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            String string;
            super.g(view, lcVar);
            if (cx.this.l.getVisibility() == 0) {
                string = cx.this.getString(qv.mtrl_picker_toggle_to_year_selection);
            } else {
                string = cx.this.getString(qv.mtrl_picker_toggle_to_day_selection);
            }
            lcVar.l0(string);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$g */
    /* loaded from: classes.dex */
    public class g extends RecyclerView.u {
        public final /* synthetic */ hx a;
        public final /* synthetic */ MaterialButton b;

        public g(hx hxVar, MaterialButton materialButton) {
            this.a = hxVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(Barcode.PDF417);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            int b2;
            if (i < 0) {
                b2 = cx.this.A().Z1();
            } else {
                b2 = cx.this.A().b2();
            }
            cx.this.f = this.a.x(b2);
            this.b.setText(this.a.y(b2));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            cx.this.F();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ hx b;

        public i(hx hxVar) {
            this.b = hxVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int Z1 = cx.this.A().Z1() + 1;
            if (Z1 < cx.this.j.getAdapter().e()) {
                cx.this.D(this.b.x(Z1));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$j */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {
        public final /* synthetic */ hx b;

        public j(hx hxVar) {
            this.b = hxVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int b2 = cx.this.A().b2() - 1;
            if (b2 >= 0) {
                cx.this.D(this.b.x(b2));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$k */
    /* loaded from: classes.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* compiled from: AxisPay */
    /* renamed from: cx$l */
    /* loaded from: classes.dex */
    public interface l {
        void a(long j);
    }

    public static <T> cx<T> B(DateSelector<T> dateSelector, int i2, CalendarConstraints calendarConstraints) {
        cx<T> cxVar = new cx<>();
        Bundle bundle = new Bundle();
        bundle.putInt(C0059ao.a(3586), i2);
        bundle.putParcelable(C0059ao.a(3587), dateSelector);
        bundle.putParcelable(C0059ao.a(3588), calendarConstraints);
        bundle.putParcelable(C0059ao.a(3589), calendarConstraints.l());
        cxVar.setArguments(bundle);
        return cxVar;
    }

    public static int z(Context context) {
        return context.getResources().getDimensionPixelSize(kv.mtrl_calendar_day_height);
    }

    public LinearLayoutManager A() {
        return (LinearLayoutManager) this.j.getLayoutManager();
    }

    public final void C(int i2) {
        this.j.post(new a(i2));
    }

    public void D(Month month) {
        hx hxVar = (hx) this.j.getAdapter();
        int z = hxVar.z(month);
        int z2 = z - hxVar.z(this.f);
        boolean z3 = Math.abs(z2) > 3;
        boolean z4 = z2 > 0;
        this.f = month;
        if (z3 && z4) {
            this.j.scrollToPosition(z - 3);
            C(z);
        } else if (z3) {
            this.j.scrollToPosition(z + 3);
            C(z);
        } else {
            C(z);
        }
    }

    public void E(k kVar) {
        this.g = kVar;
        if (kVar == k.YEAR) {
            this.i.getLayoutManager().x1(((nx) this.i.getAdapter()).y(this.f.d));
            this.k.setVisibility(0);
            this.l.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            D(this.f);
        }
    }

    public void F() {
        k kVar = this.g;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            E(k.DAY);
        } else if (kVar == k.DAY) {
            E(kVar2);
        }
    }

    @Override // defpackage.jx
    public boolean j(ix<S> ixVar) {
        return super.j(ixVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt(C0059ao.a(3590));
        this.d = (DateSelector) bundle.getParcelable(C0059ao.a(3591));
        this.e = (CalendarConstraints) bundle.getParcelable(C0059ao.a(3592));
        this.f = (Month) bundle.getParcelable(C0059ao.a(3593));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.c);
        this.h = new yw(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month n2 = this.e.n();
        if (dx.z(contextThemeWrapper)) {
            i2 = ov.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = ov.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(mv.mtrl_calendar_days_of_week);
        ac.q0(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new bx());
        gridView.setNumColumns(n2.e);
        gridView.setEnabled(false);
        this.j = (RecyclerView) inflate.findViewById(mv.mtrl_calendar_months);
        this.j.setLayoutManager(new c(getContext(), i3, false, i3));
        this.j.setTag(m);
        hx hxVar = new hx(contextThemeWrapper, this.d, this.e, new d());
        this.j.setAdapter(hxVar);
        int integer = contextThemeWrapper.getResources().getInteger(nv.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(mv.mtrl_calendar_year_selector_frame);
        this.i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.i.setAdapter(new nx(this));
            this.i.addItemDecoration(u());
        }
        if (inflate.findViewById(mv.month_navigation_fragment_toggle) != null) {
            t(inflate, hxVar);
        }
        if (!dx.z(contextThemeWrapper)) {
            new ej().b(this.j);
        }
        this.j.scrollToPosition(hxVar.z(this.f));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(C0059ao.a(3594), this.c);
        bundle.putParcelable(C0059ao.a(3595), this.d);
        bundle.putParcelable(C0059ao.a(3596), this.e);
        bundle.putParcelable(C0059ao.a(3597), this.f);
    }

    public final void t(View view, hx hxVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(mv.month_navigation_fragment_toggle);
        materialButton.setTag(p);
        ac.q0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(mv.month_navigation_previous);
        materialButton2.setTag(n);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(mv.month_navigation_next);
        materialButton3.setTag(o);
        this.k = view.findViewById(mv.mtrl_calendar_year_selector_frame);
        this.l = view.findViewById(mv.mtrl_calendar_day_selector_frame);
        E(k.DAY);
        materialButton.setText(this.f.i(view.getContext()));
        this.j.addOnScrollListener(new g(hxVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(hxVar));
        materialButton2.setOnClickListener(new j(hxVar));
    }

    public final RecyclerView.o u() {
        return new e();
    }

    public CalendarConstraints v() {
        return this.e;
    }

    public yw w() {
        return this.h;
    }

    public Month x() {
        return this.f;
    }

    public DateSelector<S> y() {
        return this.d;
    }
}
