package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import defpackage.o1;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s1  reason: default package */
/* loaded from: classes.dex */
public final class s1 extends m1 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, o1, View.OnKeyListener {
    public static final int w = r.abc_popup_menu_item_layout;
    public final Context c;
    public final i1 d;
    public final h1 e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final c3 j;
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public o1.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean v;
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public int u = 0;

    /* compiled from: AxisPay */
    /* renamed from: s1$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!s1.this.c() || s1.this.j.B()) {
                return;
            }
            View view = s1.this.o;
            if (view != null && view.isShown()) {
                s1.this.j.a();
            } else {
                s1.this.dismiss();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: s1$b */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = s1.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    s1.this.q = view.getViewTreeObserver();
                }
                s1 s1Var = s1.this;
                s1Var.q.removeGlobalOnLayoutListener(s1Var.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public s1(Context context, i1 i1Var, View view, int i, int i2, boolean z) {
        this.c = context;
        this.d = i1Var;
        this.f = z;
        this.e = new h1(i1Var, LayoutInflater.from(context), z, w);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(o.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new c3(context, null, i, i2);
        i1Var.c(this, context);
    }

    public final boolean B() {
        View view;
        if (c()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.K(this);
        this.j.L(this);
        this.j.J(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.D(view2);
        this.j.G(this.u);
        if (!this.s) {
            this.t = m1.q(this.e, null, this.c, this.g);
            this.s = true;
        }
        this.j.F(this.t);
        this.j.I(2);
        this.j.H(p());
        this.j.a();
        ListView h = this.j.h();
        h.setOnKeyListener(this);
        if (this.v && this.d.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(r.abc_popup_menu_header_item_layout, (ViewGroup) h, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.d.z());
            }
            frameLayout.setEnabled(false);
            h.addHeaderView(frameLayout, null, false);
        }
        this.j.p(this.e);
        this.j.a();
        return true;
    }

    @Override // defpackage.r1
    public void a() {
        if (!B()) {
            throw new IllegalStateException(C0059ao.a(442));
        }
    }

    @Override // defpackage.o1
    public void b(i1 i1Var, boolean z) {
        if (i1Var != this.d) {
            return;
        }
        dismiss();
        o1.a aVar = this.p;
        if (aVar != null) {
            aVar.b(i1Var, z);
        }
    }

    @Override // defpackage.r1
    public boolean c() {
        return !this.r && this.j.c();
    }

    @Override // defpackage.r1
    public void dismiss() {
        if (c()) {
            this.j.dismiss();
        }
    }

    @Override // defpackage.o1
    public void e(Parcelable parcelable) {
    }

    @Override // defpackage.o1
    public boolean f(t1 t1Var) {
        if (t1Var.hasVisibleItems()) {
            n1 n1Var = new n1(this.c, t1Var, this.o, this.f, this.h, this.i);
            n1Var.j(this.p);
            n1Var.g(m1.z(t1Var));
            n1Var.i(this.m);
            this.m = null;
            this.d.e(false);
            int d = this.j.d();
            int n = this.j.n();
            if ((Gravity.getAbsoluteGravity(this.u, ac.C(this.n)) & 7) == 5) {
                d += this.n.getWidth();
            }
            if (n1Var.n(d, n)) {
                o1.a aVar = this.p;
                if (aVar != null) {
                    aVar.c(t1Var);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.o1
    public void g(boolean z) {
        this.s = false;
        h1 h1Var = this.e;
        if (h1Var != null) {
            h1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.r1
    public ListView h() {
        return this.j.h();
    }

    @Override // defpackage.o1
    public boolean i() {
        return false;
    }

    @Override // defpackage.o1
    public Parcelable j() {
        return null;
    }

    @Override // defpackage.o1
    public void m(o1.a aVar) {
        this.p = aVar;
    }

    @Override // defpackage.m1
    public void n(i1 i1Var) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.m1
    public void r(View view) {
        this.n = view;
    }

    @Override // defpackage.m1
    public void t(boolean z) {
        this.e.d(z);
    }

    @Override // defpackage.m1
    public void u(int i) {
        this.u = i;
    }

    @Override // defpackage.m1
    public void v(int i) {
        this.j.l(i);
    }

    @Override // defpackage.m1
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.m1
    public void x(boolean z) {
        this.v = z;
    }

    @Override // defpackage.m1
    public void y(int i) {
        this.j.j(i);
    }
}
