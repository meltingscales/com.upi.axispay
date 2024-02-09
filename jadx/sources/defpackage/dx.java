package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: dx  reason: default package */
/* loaded from: classes.dex */
public final class dx<S> extends rd {
    public static final Object s = C0059ao.a(4348);
    public static final Object t = C0059ao.a(4349);
    public static final Object u = C0059ao.a(4350);
    public final LinkedHashSet<ex<? super S>> b = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> c = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> d = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> e = new LinkedHashSet<>();
    public int f;
    public DateSelector<S> g;
    public jx<S> h;
    public CalendarConstraints i;
    public cx<S> j;
    public int k;
    public CharSequence l;
    public boolean m;
    public int n;
    public TextView o;
    public CheckableImageButton p;
    public hz q;
    public Button r;

    /* compiled from: AxisPay */
    /* renamed from: dx$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = dx.this.b.iterator();
            while (it.hasNext()) {
                ((ex) it.next()).a(dx.this.w());
            }
            dx.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: dx$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = dx.this.c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            dx.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: dx$c */
    /* loaded from: classes.dex */
    public class c extends ix<S> {
        public c() {
        }

        @Override // defpackage.ix
        public void a() {
            dx.this.r.setEnabled(false);
        }

        @Override // defpackage.ix
        public void b(S s) {
            dx.this.D();
            dx.this.r.setEnabled(dx.this.g.r());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: dx$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dx.this.r.setEnabled(dx.this.g.r());
            dx.this.p.toggle();
            dx dxVar = dx.this;
            dxVar.E(dxVar.p);
            dx.this.C();
        }
    }

    public static boolean A(Context context) {
        return B(context, iv.nestedScrollable);
    }

    public static boolean B(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(sy.c(context, iv.materialCalendarStyle, cx.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static Drawable r(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, k0.d(context, lv.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], k0.d(context, lv.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    public static int t(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(kv.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(kv.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(kv.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(kv.mtrl_calendar_days_of_week_height);
        int i = gx.g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(kv.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(kv.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(kv.mtrl_calendar_bottom_padding);
    }

    public static int v(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(kv.mtrl_calendar_content_padding);
        int i = Month.e().e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(kv.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(kv.mtrl_calendar_month_horizontal_padding));
    }

    public static boolean z(Context context) {
        return B(context, 16843277);
    }

    public final void C() {
        int x = x(requireContext());
        this.j = cx.B(this.g, x, this.i);
        this.h = this.p.isChecked() ? fx.l(this.g, x, this.i) : this.j;
        D();
        je n = getChildFragmentManager().n();
        n.r(mv.mtrl_calendar_frame, this.h);
        n.l();
        this.h.j(new c());
    }

    public final void D() {
        String u2 = u();
        this.o.setContentDescription(String.format(getString(qv.mtrl_picker_announce_current_selection), u2));
        this.o.setText(u2);
    }

    public final void E(CheckableImageButton checkableImageButton) {
        String string;
        if (this.p.isChecked()) {
            string = checkableImageButton.getContext().getString(qv.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(qv.mtrl_picker_toggle_to_text_input_mode);
        }
        this.p.setContentDescription(string);
    }

    @Override // defpackage.rd, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // defpackage.rd, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f = bundle.getInt(C0059ao.a(4351));
        this.g = (DateSelector) bundle.getParcelable(C0059ao.a(4352));
        this.i = (CalendarConstraints) bundle.getParcelable(C0059ao.a(4353));
        this.k = bundle.getInt(C0059ao.a(4354));
        this.l = bundle.getCharSequence(C0059ao.a(4355));
        this.n = bundle.getInt(C0059ao.a(4356));
    }

    @Override // defpackage.rd
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), x(requireContext()));
        Context context = dialog.getContext();
        this.m = z(context);
        int c2 = sy.c(context, iv.colorSurface, dx.class.getCanonicalName());
        hz hzVar = new hz(context, null, iv.materialCalendarStyle, rv.Widget_MaterialComponents_MaterialCalendar);
        this.q = hzVar;
        hzVar.M(context);
        this.q.X(ColorStateList.valueOf(c2));
        this.q.W(ac.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.m ? ov.mtrl_picker_fullscreen : ov.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.m) {
            inflate.findViewById(mv.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(v(context), -2));
        } else {
            View findViewById = inflate.findViewById(mv.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(mv.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(v(context), -1));
            findViewById2.setMinimumHeight(t(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(mv.mtrl_picker_header_selection_text);
        this.o = textView;
        ac.s0(textView, 1);
        this.p = (CheckableImageButton) inflate.findViewById(mv.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(mv.mtrl_picker_title_text);
        CharSequence charSequence = this.l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.k);
        }
        y(context);
        this.r = (Button) inflate.findViewById(mv.confirm_button);
        if (this.g.r()) {
            this.r.setEnabled(true);
        } else {
            this.r.setEnabled(false);
        }
        this.r.setTag(s);
        this.r.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(mv.cancel_button);
        button.setTag(t);
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // defpackage.rd, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.rd, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(C0059ao.a(4357), this.f);
        bundle.putParcelable(C0059ao.a(4358), this.g);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.i);
        if (this.j.x() != null) {
            bVar.b(this.j.x().g);
        }
        bundle.putParcelable(C0059ao.a(4359), bVar.a());
        bundle.putInt(C0059ao.a(4360), this.k);
        bundle.putCharSequence(C0059ao.a(4361), this.l);
    }

    @Override // defpackage.rd, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.q);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(kv.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.q, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ox(requireDialog(), rect));
        }
        C();
    }

    @Override // defpackage.rd, androidx.fragment.app.Fragment
    public void onStop() {
        this.h.k();
        super.onStop();
    }

    public String u() {
        return this.g.b(getContext());
    }

    public final S w() {
        return this.g.z();
    }

    public final int x(Context context) {
        int i = this.f;
        return i != 0 ? i : this.g.j(context);
    }

    public final void y(Context context) {
        this.p.setTag(u);
        this.p.setImageDrawable(r(context));
        this.p.setChecked(this.n != 0);
        ac.q0(this.p, null);
        E(this.p);
        this.p.setOnClickListener(new d());
    }
}
