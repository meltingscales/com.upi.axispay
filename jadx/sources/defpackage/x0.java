package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.i1;
import defpackage.u0;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: x0  reason: default package */
/* loaded from: classes.dex */
public class x0 extends u0 implements i1.a {
    public Context d;
    public ActionBarContextView e;
    public u0.a f;
    public WeakReference<View> g;
    public boolean h;
    public i1 i;

    public x0(Context context, ActionBarContextView actionBarContextView, u0.a aVar, boolean z) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = aVar;
        i1 i1Var = new i1(actionBarContextView.getContext());
        i1Var.W(1);
        this.i = i1Var;
        i1Var.V(this);
    }

    @Override // defpackage.i1.a
    public boolean a(i1 i1Var, MenuItem menuItem) {
        return this.f.c(this, menuItem);
    }

    @Override // defpackage.i1.a
    public void b(i1 i1Var) {
        k();
        this.e.l();
    }

    @Override // defpackage.u0
    public void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.sendAccessibilityEvent(32);
        this.f.b(this);
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
        return this.i;
    }

    @Override // defpackage.u0
    public MenuInflater f() {
        return new z0(this.e.getContext());
    }

    @Override // defpackage.u0
    public CharSequence g() {
        return this.e.getSubtitle();
    }

    @Override // defpackage.u0
    public CharSequence i() {
        return this.e.getTitle();
    }

    @Override // defpackage.u0
    public void k() {
        this.f.a(this, this.i);
    }

    @Override // defpackage.u0
    public boolean l() {
        return this.e.j();
    }

    @Override // defpackage.u0
    public void m(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.u0
    public void n(int i) {
        o(this.d.getString(i));
    }

    @Override // defpackage.u0
    public void o(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // defpackage.u0
    public void q(int i) {
        r(this.d.getString(i));
    }

    @Override // defpackage.u0
    public void r(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // defpackage.u0
    public void s(boolean z) {
        super.s(z);
        this.e.setTitleOptional(z);
    }
}
