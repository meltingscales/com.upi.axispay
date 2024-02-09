package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wd  reason: default package */
/* loaded from: classes.dex */
public class wd {
    public final yd<?> a;

    public wd(yd<?> ydVar) {
        this.a = ydVar;
    }

    public static wd b(yd<?> ydVar) {
        db.f(ydVar, C0059ao.a(5741));
        return new wd(ydVar);
    }

    public void a(Fragment fragment) {
        yd<?> ydVar = this.a;
        ydVar.e.l(ydVar, ydVar, fragment);
    }

    public void c() {
        this.a.e.A();
    }

    public void d(Configuration configuration) {
        this.a.e.C(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.e.D(menuItem);
    }

    public void f() {
        this.a.e.E();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.e.F(menu, menuInflater);
    }

    public void h() {
        this.a.e.G();
    }

    public void i() {
        this.a.e.I();
    }

    public void j(boolean z) {
        this.a.e.J(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.e.L(menuItem);
    }

    public void l(Menu menu) {
        this.a.e.M(menu);
    }

    public void m() {
        this.a.e.O();
    }

    public void n(boolean z) {
        this.a.e.P(z);
    }

    public boolean o(Menu menu) {
        return this.a.e.Q(menu);
    }

    public void p() {
        this.a.e.S();
    }

    public void q() {
        this.a.e.T();
    }

    public void r() {
        this.a.e.V();
    }

    public boolean s() {
        return this.a.e.c0(true);
    }

    public FragmentManager t() {
        return this.a.e;
    }

    public void u() {
        this.a.e.W0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.e.x0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        yd<?> ydVar = this.a;
        if (ydVar instanceof sf) {
            ydVar.e.m1(parcelable);
            return;
        }
        throw new IllegalStateException(C0059ao.a(5742));
    }

    public Parcelable x() {
        return this.a.e.o1();
    }
}
