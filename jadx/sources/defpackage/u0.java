package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: AxisPay */
/* renamed from: u0  reason: default package */
/* loaded from: classes.dex */
public abstract class u0 {
    public Object b;
    public boolean c;

    /* compiled from: AxisPay */
    /* renamed from: u0$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(u0 u0Var, Menu menu);

        void b(u0 u0Var);

        boolean c(u0 u0Var, MenuItem menuItem);

        boolean d(u0 u0Var, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.b;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.c;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.b = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.c = z;
    }
}
