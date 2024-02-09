package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import defpackage.x;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: w  reason: default package */
/* loaded from: classes.dex */
public class w implements DrawerLayout.d {
    public final b a;
    public final DrawerLayout b;
    public o0 c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public final int g;
    public final int h;
    public View.OnClickListener i;
    public boolean j;

    /* compiled from: AxisPay */
    /* renamed from: w$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w wVar = w.this;
            if (wVar.f) {
                wVar.k();
                return;
            }
            View.OnClickListener onClickListener = wVar.i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(Drawable drawable, int i);

        boolean b();

        Drawable c();

        void d(int i);

        Context e();
    }

    /* compiled from: AxisPay */
    /* renamed from: w$c */
    /* loaded from: classes.dex */
    public interface c {
        b j();
    }

    /* compiled from: AxisPay */
    /* renamed from: w$d */
    /* loaded from: classes.dex */
    public static class d implements b {
        public final Activity a;
        public x.a b;

        public d(Activity activity) {
            this.a = activity;
        }

        @Override // defpackage.w.b
        public void a(Drawable drawable, int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    actionBar.setHomeAsUpIndicator(drawable);
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                actionBar.setDisplayShowHomeEnabled(true);
                this.b = x.c(this.a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        @Override // defpackage.w.b
        public boolean b() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // defpackage.w.b
        public Drawable c() {
            if (Build.VERSION.SDK_INT >= 18) {
                TypedArray obtainStyledAttributes = e().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                return drawable;
            }
            return x.a(this.a);
        }

        @Override // defpackage.w.b
        public void d(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.b = x.b(this.b, this.a, i);
        }

        @Override // defpackage.w.b
        public Context e() {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.a;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w$e */
    /* loaded from: classes.dex */
    public static class e implements b {
        public final Toolbar a;
        public final Drawable b;
        public final CharSequence c;

        public e(Toolbar toolbar) {
            this.a = toolbar;
            this.b = toolbar.getNavigationIcon();
            this.c = toolbar.getNavigationContentDescription();
        }

        @Override // defpackage.w.b
        public void a(Drawable drawable, int i) {
            this.a.setNavigationIcon(drawable);
            d(i);
        }

        @Override // defpackage.w.b
        public boolean b() {
            return true;
        }

        @Override // defpackage.w.b
        public Drawable c() {
            return this.b;
        }

        @Override // defpackage.w.b
        public void d(int i) {
            if (i == 0) {
                this.a.setNavigationContentDescription(this.c);
            } else {
                this.a.setNavigationContentDescription(i);
            }
        }

        @Override // defpackage.w.b
        public Context e() {
            return this.a.getContext();
        }
    }

    public w(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(int i) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view, float f) {
        if (this.d) {
            i(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            i(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(View view) {
        i(1.0f);
        if (this.f) {
            f(this.h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view) {
        i(0.0f);
        if (this.f) {
            f(this.g);
        }
    }

    public Drawable e() {
        return this.a.c();
    }

    public void f(int i) {
        this.a.d(i);
    }

    public void g(Drawable drawable, int i) {
        if (!this.j && !this.a.b()) {
            Log.w(C0059ao.a(11319), C0059ao.a(11320));
            this.j = true;
        }
        this.a.a(drawable, i);
    }

    public void h(boolean z) {
        if (z != this.f) {
            if (z) {
                g(this.c, this.b.C(8388611) ? this.h : this.g);
            } else {
                g(this.e, 0);
            }
            this.f = z;
        }
    }

    public final void i(float f) {
        if (f == 1.0f) {
            this.c.g(true);
        } else if (f == 0.0f) {
            this.c.g(false);
        }
        this.c.e(f);
    }

    public void j() {
        if (this.b.C(8388611)) {
            i(1.0f);
        } else {
            i(0.0f);
        }
        if (this.f) {
            g(this.c, this.b.C(8388611) ? this.h : this.g);
        }
    }

    public void k() {
        int q = this.b.q(8388611);
        if (this.b.F(8388611) && q != 2) {
            this.b.d(8388611);
        } else if (q != 1) {
            this.b.K(8388611);
        }
    }

    public w(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, o0 o0Var, int i, int i2) {
        this.d = true;
        this.f = true;
        this.j = false;
        if (toolbar != null) {
            this.a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.a = ((c) activity).j();
        } else {
            this.a = new d(activity);
        }
        this.b = drawerLayout;
        this.g = i;
        this.h = i2;
        if (o0Var == null) {
            this.c = new o0(this.a.e());
        } else {
            this.c = o0Var;
        }
        this.e = e();
    }
}
