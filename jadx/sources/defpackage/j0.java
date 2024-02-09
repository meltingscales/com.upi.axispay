package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import defpackage.i1;
import defpackage.u0;
import defpackage.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j0  reason: default package */
/* loaded from: classes.dex */
public class j0 extends v implements ActionBarOverlayLayout.d {
    public static final Interpolator B = new AccelerateInterpolator();
    public static final Interpolator C = new DecelerateInterpolator();
    public final hc A;
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public u2 e;
    public ActionBarContextView f;
    public View g;
    public h3 h;
    public boolean i;
    public d j;
    public u0 k;
    public u0.a l;
    public boolean m;
    public ArrayList<v.b> n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public a1 v;
    public boolean w;
    public boolean x;
    public final fc y;
    public final fc z;

    /* compiled from: AxisPay */
    /* renamed from: j0$a */
    /* loaded from: classes.dex */
    public class a extends gc {
        public a() {
        }

        @Override // defpackage.gc, defpackage.fc
        public void b(View view) {
            View view2;
            j0 j0Var = j0.this;
            if (j0Var.q && (view2 = j0Var.g) != null) {
                view2.setTranslationY(0.0f);
                j0.this.d.setTranslationY(0.0f);
            }
            j0.this.d.setVisibility(8);
            j0.this.d.setTransitioning(false);
            j0 j0Var2 = j0.this;
            j0Var2.v = null;
            j0Var2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = j0.this.c;
            if (actionBarOverlayLayout != null) {
                ac.n0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: j0$b */
    /* loaded from: classes.dex */
    public class b extends gc {
        public b() {
        }

        @Override // defpackage.gc, defpackage.fc
        public void b(View view) {
            j0 j0Var = j0.this;
            j0Var.v = null;
            j0Var.d.requestLayout();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: j0$c */
    /* loaded from: classes.dex */
    public class c implements hc {
        public c() {
        }

        @Override // defpackage.hc
        public void a(View view) {
            ((View) j0.this.d.getParent()).invalidate();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: j0$d */
    /* loaded from: classes.dex */
    public class d extends u0 implements i1.a {
        public final Context d;
        public final i1 e;
        public u0.a f;
        public WeakReference<View> g;

        public d(Context context, u0.a aVar) {
            this.d = context;
            this.f = aVar;
            i1 i1Var = new i1(context);
            i1Var.W(1);
            this.e = i1Var;
            i1Var.V(this);
        }

        @Override // defpackage.i1.a
        public boolean a(i1 i1Var, MenuItem menuItem) {
            u0.a aVar = this.f;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // defpackage.i1.a
        public void b(i1 i1Var) {
            if (this.f == null) {
                return;
            }
            k();
            j0.this.f.l();
        }

        @Override // defpackage.u0
        public void c() {
            j0 j0Var = j0.this;
            if (j0Var.j != this) {
                return;
            }
            if (!j0.A(j0Var.r, j0Var.s, false)) {
                j0 j0Var2 = j0.this;
                j0Var2.k = this;
                j0Var2.l = this.f;
            } else {
                this.f.b(this);
            }
            this.f = null;
            j0.this.z(false);
            j0.this.f.g();
            j0.this.e.l().sendAccessibilityEvent(32);
            j0 j0Var3 = j0.this;
            j0Var3.c.setHideOnContentScrollEnabled(j0Var3.x);
            j0.this.j = null;
        }

        @Override // defpackage.u0
        public View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.u0
        public Menu e() {
            return this.e;
        }

        @Override // defpackage.u0
        public MenuInflater f() {
            return new z0(this.d);
        }

        @Override // defpackage.u0
        public CharSequence g() {
            return j0.this.f.getSubtitle();
        }

        @Override // defpackage.u0
        public CharSequence i() {
            return j0.this.f.getTitle();
        }

        @Override // defpackage.u0
        public void k() {
            if (j0.this.j != this) {
                return;
            }
            this.e.h0();
            try {
                this.f.a(this, this.e);
            } finally {
                this.e.g0();
            }
        }

        @Override // defpackage.u0
        public boolean l() {
            return j0.this.f.j();
        }

        @Override // defpackage.u0
        public void m(View view) {
            j0.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // defpackage.u0
        public void n(int i) {
            o(j0.this.a.getResources().getString(i));
        }

        @Override // defpackage.u0
        public void o(CharSequence charSequence) {
            j0.this.f.setSubtitle(charSequence);
        }

        @Override // defpackage.u0
        public void q(int i) {
            r(j0.this.a.getResources().getString(i));
        }

        @Override // defpackage.u0
        public void r(CharSequence charSequence) {
            j0.this.f.setTitle(charSequence);
        }

        @Override // defpackage.u0
        public void s(boolean z) {
            super.s(z);
            j0.this.f.setTitleOptional(z);
        }

        public boolean t() {
            this.e.h0();
            try {
                return this.f.d(this, this.e);
            } finally {
                this.e.g0();
            }
        }
    }

    public j0(Activity activity, boolean z) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(16908290);
    }

    public static boolean A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public void B() {
        u0.a aVar = this.l;
        if (aVar != null) {
            aVar.b(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public void C(boolean z) {
        View view;
        int[] iArr;
        a1 a1Var = this.v;
        if (a1Var != null) {
            a1Var.a();
        }
        if (this.p == 0 && (this.w || z)) {
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            a1 a1Var2 = new a1();
            float f = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            ec d2 = ac.d(this.d);
            d2.m(f);
            d2.k(this.A);
            a1Var2.c(d2);
            if (this.q && (view = this.g) != null) {
                ec d3 = ac.d(view);
                d3.m(f);
                a1Var2.c(d3);
            }
            a1Var2.f(B);
            a1Var2.e(250L);
            a1Var2.g(this.y);
            this.v = a1Var2;
            a1Var2.h();
            return;
        }
        this.y.b(null);
    }

    public void D(boolean z) {
        View view;
        View view2;
        int[] iArr;
        a1 a1Var = this.v;
        if (a1Var != null) {
            a1Var.a();
        }
        this.d.setVisibility(0);
        if (this.p == 0 && (this.w || z)) {
            this.d.setTranslationY(0.0f);
            float f = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.d.setTranslationY(f);
            a1 a1Var2 = new a1();
            ec d2 = ac.d(this.d);
            d2.m(0.0f);
            d2.k(this.A);
            a1Var2.c(d2);
            if (this.q && (view2 = this.g) != null) {
                view2.setTranslationY(f);
                ec d3 = ac.d(this.g);
                d3.m(0.0f);
                a1Var2.c(d3);
            }
            a1Var2.f(C);
            a1Var2.e(250L);
            a1Var2.g(this.z);
            this.v = a1Var2;
            a1Var2.h();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.q && (view = this.g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            ac.n0(actionBarOverlayLayout);
        }
    }

    public final u2 E(View view) {
        if (view instanceof u2) {
            return (u2) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(8056));
        sb.append(view != null ? view.getClass().getSimpleName() : C0059ao.a(8057));
        throw new IllegalStateException(sb.toString());
    }

    public int F() {
        return this.e.t();
    }

    public final void G() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            P(false);
        }
    }

    public final void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(q.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.e = E(view.findViewById(q.action_bar));
        this.f = (ActionBarContextView) view.findViewById(q.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(q.action_bar_container);
        this.d = actionBarContainer;
        u2 u2Var = this.e;
        if (u2Var != null && this.f != null && actionBarContainer != null) {
            this.a = u2Var.getContext();
            boolean z = (this.e.p() & 4) != 0;
            if (z) {
                this.i = true;
            }
            t0 b2 = t0.b(this.a);
            M(b2.a() || z);
            K(b2.g());
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, u.ActionBar, l.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(u.ActionBar_hideOnContentScroll, false)) {
                L(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(u.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                J(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(j0.class.getSimpleName() + C0059ao.a(8058));
    }

    public void I(int i, int i2) {
        int p = this.e.p();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.e.o((i & i2) | ((~i2) & p));
    }

    public void J(float f) {
        ac.y0(this.d, f);
    }

    public final void K(boolean z) {
        this.o = z;
        if (!z) {
            this.e.k(null);
            this.d.setTabContainer(this.h);
        } else {
            this.d.setTabContainer(null);
            this.e.k(this.h);
        }
        boolean z2 = true;
        boolean z3 = F() == 2;
        h3 h3Var = this.h;
        if (h3Var != null) {
            if (z3) {
                h3Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    ac.n0(actionBarOverlayLayout);
                }
            } else {
                h3Var.setVisibility(8);
            }
        }
        this.e.y(!this.o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
        if (this.o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    public void L(boolean z) {
        if (z && !this.c.w()) {
            throw new IllegalStateException(C0059ao.a(8059));
        }
        this.x = z;
        this.c.setHideOnContentScrollEnabled(z);
    }

    public void M(boolean z) {
        this.e.m(z);
    }

    public final boolean N() {
        return ac.V(this.d);
    }

    public final void O() {
        if (this.t) {
            return;
        }
        this.t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        P(false);
    }

    public final void P(boolean z) {
        if (A(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            D(z);
        } else if (this.u) {
            this.u = false;
            C(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.s) {
            this.s = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        a1 a1Var = this.v;
        if (a1Var != null) {
            a1Var.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i) {
        this.p = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (this.s) {
            return;
        }
        this.s = true;
        P(true);
    }

    @Override // defpackage.v
    public boolean h() {
        u2 u2Var = this.e;
        if (u2Var == null || !u2Var.n()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // defpackage.v
    public void i(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // defpackage.v
    public int j() {
        return this.e.p();
    }

    @Override // defpackage.v
    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(l.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.v
    public void m(Configuration configuration) {
        K(t0.b(this.a).g());
    }

    @Override // defpackage.v
    public boolean o(int i, KeyEvent keyEvent) {
        Menu e;
        d dVar = this.j;
        if (dVar == null || (e = dVar.e()) == null) {
            return false;
        }
        e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.v
    public void r(boolean z) {
        if (this.i) {
            return;
        }
        s(z);
    }

    @Override // defpackage.v
    public void s(boolean z) {
        I(z ? 4 : 0, 4);
    }

    @Override // defpackage.v
    public void t(boolean z) {
        I(z ? 8 : 0, 8);
    }

    @Override // defpackage.v
    public void u(int i) {
        this.e.s(i);
    }

    @Override // defpackage.v
    public void v(Drawable drawable) {
        this.e.x(drawable);
    }

    @Override // defpackage.v
    public void w(boolean z) {
        a1 a1Var;
        this.w = z;
        if (z || (a1Var = this.v) == null) {
            return;
        }
        a1Var.a();
    }

    @Override // defpackage.v
    public void x(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // defpackage.v
    public u0 y(u0.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.k();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (dVar2.t()) {
            this.j = dVar2;
            dVar2.k();
            this.f.h(dVar2);
            z(true);
            this.f.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    public void z(boolean z) {
        ec u;
        ec f;
        if (z) {
            O();
        } else {
            G();
        }
        if (!N()) {
            if (z) {
                this.e.j(4);
                this.f.setVisibility(0);
                return;
            }
            this.e.j(0);
            this.f.setVisibility(8);
            return;
        }
        if (z) {
            f = this.e.u(4, 100L);
            u = this.f.f(0, 200L);
        } else {
            u = this.e.u(0, 200L);
            f = this.f.f(8, 100L);
        }
        a1 a1Var = new a1();
        a1Var.d(f, u);
        a1Var.h();
    }

    public j0(Dialog dialog) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        H(dialog.getWindow().getDecorView());
    }
}
