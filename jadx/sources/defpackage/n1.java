package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import defpackage.o1;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n1  reason: default package */
/* loaded from: classes.dex */
public class n1 {
    public final Context a;
    public final i1 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public o1.a i;
    public m1 j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    /* compiled from: AxisPay */
    /* renamed from: n1$a */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            n1.this.e();
        }
    }

    public n1(Context context, i1 i1Var, View view, boolean z, int i) {
        this(context, i1Var, view, z, i, 0);
    }

    public final m1 a() {
        m1 s1Var;
        Display defaultDisplay = ((WindowManager) this.a.getSystemService(C0059ao.a(12445))).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(o.abc_cascading_menus_min_smallest_width)) {
            s1Var = new f1(this.a, this.f, this.d, this.e, this.c);
        } else {
            s1Var = new s1(this.a, this.b, this.f, this.d, this.e, this.c);
        }
        s1Var.n(this.b);
        s1Var.w(this.l);
        s1Var.r(this.f);
        s1Var.m(this.i);
        s1Var.t(this.h);
        s1Var.u(this.g);
        return s1Var;
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public m1 c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        m1 m1Var = this.j;
        return m1Var != null && m1Var.c();
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        m1 m1Var = this.j;
        if (m1Var != null) {
            m1Var.t(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(o1.a aVar) {
        this.i = aVar;
        m1 m1Var = this.j;
        if (m1Var != null) {
            m1Var.m(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException(C0059ao.a(12446));
        }
    }

    public final void l(int i, int i2, boolean z, boolean z2) {
        m1 c = c();
        c.x(z2);
        if (z) {
            if ((ib.b(this.g, ac.C(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            c.v(i);
            c.y(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }

    public n1(Context context, i1 i1Var, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = i1Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
