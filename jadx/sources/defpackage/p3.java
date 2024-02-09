package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import defpackage.i1;
import defpackage.o1;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: p3  reason: default package */
/* loaded from: classes.dex */
public class p3 implements u2 {
    public Toolbar a;
    public int b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public ActionMenuPresenter n;
    public int o;
    public int p;
    public Drawable q;

    /* compiled from: AxisPay */
    /* renamed from: p3$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final c1 b;

        public a() {
            this.b = new c1(p3.this.a.getContext(), 0, 16908332, 0, 0, p3.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p3 p3Var = p3.this;
            Window.Callback callback = p3Var.l;
            if (callback == null || !p3Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: p3$b */
    /* loaded from: classes.dex */
    public class b extends gc {
        public boolean a = false;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // defpackage.gc, defpackage.fc
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.gc, defpackage.fc
        public void b(View view) {
            if (this.a) {
                return;
            }
            p3.this.a.setVisibility(this.b);
        }

        @Override // defpackage.gc, defpackage.fc
        public void c(View view) {
            p3.this.a.setVisibility(0);
        }
    }

    public p3(Toolbar toolbar, boolean z) {
        this(toolbar, z, s.abc_action_bar_up_description, p.abc_ic_ab_back_material);
    }

    public void A(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void B(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            s(this.p);
        }
    }

    public void C(Drawable drawable) {
        this.f = drawable;
        J();
    }

    public void D(CharSequence charSequence) {
        this.k = charSequence;
        H();
    }

    public void E(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.h = true;
        G(charSequence);
    }

    public final void G(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    public final void H() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void I() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    public final void J() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    @Override // defpackage.u2
    public void a(Menu menu, o1.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.r(q.action_menu_presenter);
        }
        this.n.m(aVar);
        this.a.I((i1) menu, this.n);
    }

    @Override // defpackage.u2
    public boolean b() {
        return this.a.A();
    }

    @Override // defpackage.u2
    public void c() {
        this.m = true;
    }

    @Override // defpackage.u2
    public void collapseActionView() {
        this.a.e();
    }

    @Override // defpackage.u2
    public boolean d() {
        return this.a.z();
    }

    @Override // defpackage.u2
    public boolean e() {
        return this.a.w();
    }

    @Override // defpackage.u2
    public boolean f() {
        return this.a.O();
    }

    @Override // defpackage.u2
    public boolean g() {
        return this.a.d();
    }

    @Override // defpackage.u2
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.u2
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.u2
    public void h() {
        this.a.f();
    }

    @Override // defpackage.u2
    public void i(o1.a aVar, i1.a aVar2) {
        this.a.J(aVar, aVar2);
    }

    @Override // defpackage.u2
    public void j(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.u2
    public void k(h3 h3Var) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = h3Var;
        if (h3Var == null || this.o != 2) {
            return;
        }
        this.a.addView(h3Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.a = 8388691;
        h3Var.setAllowCollapse(true);
    }

    @Override // defpackage.u2
    public ViewGroup l() {
        return this.a;
    }

    @Override // defpackage.u2
    public void m(boolean z) {
    }

    @Override // defpackage.u2
    public boolean n() {
        return this.a.v();
    }

    @Override // defpackage.u2
    public void o(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i2 & 3) != 0) {
                J();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.u2
    public int p() {
        return this.b;
    }

    @Override // defpackage.u2
    public Menu q() {
        return this.a.getMenu();
    }

    @Override // defpackage.u2
    public void r(int i) {
        C(i != 0 ? k0.d(getContext(), i) : null);
    }

    @Override // defpackage.u2
    public void s(int i) {
        D(i == 0 ? null : getContext().getString(i));
    }

    @Override // defpackage.u2
    public void setIcon(int i) {
        setIcon(i != 0 ? k0.d(getContext(), i) : null);
    }

    @Override // defpackage.u2
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // defpackage.u2
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        G(charSequence);
    }

    @Override // defpackage.u2
    public int t() {
        return this.o;
    }

    @Override // defpackage.u2
    public ec u(int i, long j) {
        ec d = ac.d(this.a);
        d.a(i == 0 ? 1.0f : 0.0f);
        d.f(j);
        d.h(new b(i));
        return d;
    }

    @Override // defpackage.u2
    public void v() {
        Log.i(C0059ao.a(14116), C0059ao.a(14117));
    }

    @Override // defpackage.u2
    public void w() {
        Log.i(C0059ao.a(14118), C0059ao.a(14119));
    }

    @Override // defpackage.u2
    public void x(Drawable drawable) {
        this.g = drawable;
        I();
    }

    @Override // defpackage.u2
    public void y(boolean z) {
        this.a.setCollapsible(z);
    }

    public final int z() {
        if (this.a.getNavigationIcon() != null) {
            this.q = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public p3(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        o3 v = o3.v(toolbar.getContext(), null, u.ActionBar, l.actionBarStyle, 0);
        this.q = v.g(u.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p = v.p(u.ActionBar_title);
            if (!TextUtils.isEmpty(p)) {
                F(p);
            }
            CharSequence p2 = v.p(u.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p2)) {
                E(p2);
            }
            Drawable g = v.g(u.ActionBar_logo);
            if (g != null) {
                C(g);
            }
            Drawable g2 = v.g(u.ActionBar_icon);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                x(drawable);
            }
            o(v.k(u.ActionBar_displayOptions, 0));
            int n = v.n(u.ActionBar_customNavigationLayout, 0);
            if (n != 0) {
                A(LayoutInflater.from(this.a.getContext()).inflate(n, (ViewGroup) this.a, false));
                o(this.b | 16);
            }
            int m = v.m(u.ActionBar_height, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m;
                this.a.setLayoutParams(layoutParams);
            }
            int e = v.e(u.ActionBar_contentInsetStart, -1);
            int e2 = v.e(u.ActionBar_contentInsetEnd, -1);
            if (e >= 0 || e2 >= 0) {
                this.a.H(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.n(u.ActionBar_titleTextStyle, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.L(toolbar2.getContext(), n2);
            }
            int n3 = v.n(u.ActionBar_subtitleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.K(toolbar3.getContext(), n3);
            }
            int n4 = v.n(u.ActionBar_popupTheme, 0);
            if (n4 != 0) {
                this.a.setPopupTheme(n4);
            }
        } else {
            this.b = z();
        }
        v.w();
        B(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // defpackage.u2
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        J();
    }
}
