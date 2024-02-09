package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sx  reason: default package */
/* loaded from: classes.dex */
public final class sx {
    public final View a;
    public boolean b = false;
    public int c = 0;

    public sx(rx rxVar) {
        this.a = (View) rxVar;
    }

    public final void a() {
        ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.a);
        }
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(Bundle bundle) {
        this.b = bundle.getBoolean(C0059ao.a(2588), false);
        this.c = bundle.getInt(C0059ao.a(2589), 0);
        if (this.b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C0059ao.a(2590), this.b);
        bundle.putInt(C0059ao.a(2591), this.c);
        return bundle;
    }

    public void f(int i) {
        this.c = i;
    }
}
