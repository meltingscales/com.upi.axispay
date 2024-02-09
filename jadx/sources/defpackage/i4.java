package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: AxisPay */
/* renamed from: i4  reason: default package */
/* loaded from: classes.dex */
public class i4 implements l4 {
    @Override // defpackage.l4
    public float a(k4 k4Var) {
        return o(k4Var).c();
    }

    @Override // defpackage.l4
    public ColorStateList b(k4 k4Var) {
        return o(k4Var).b();
    }

    @Override // defpackage.l4
    public void c(k4 k4Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        k4Var.d(new m4(colorStateList, f));
        View b = k4Var.b();
        b.setClipToOutline(true);
        b.setElevation(f2);
        n(k4Var, f3);
    }

    @Override // defpackage.l4
    public void d(k4 k4Var, float f) {
        o(k4Var).h(f);
    }

    @Override // defpackage.l4
    public float e(k4 k4Var) {
        return k4Var.b().getElevation();
    }

    @Override // defpackage.l4
    public void f() {
    }

    @Override // defpackage.l4
    public float g(k4 k4Var) {
        return o(k4Var).d();
    }

    @Override // defpackage.l4
    public float h(k4 k4Var) {
        return g(k4Var) * 2.0f;
    }

    @Override // defpackage.l4
    public float i(k4 k4Var) {
        return g(k4Var) * 2.0f;
    }

    @Override // defpackage.l4
    public void j(k4 k4Var) {
        n(k4Var, a(k4Var));
    }

    @Override // defpackage.l4
    public void k(k4 k4Var, float f) {
        k4Var.b().setElevation(f);
    }

    @Override // defpackage.l4
    public void l(k4 k4Var) {
        n(k4Var, a(k4Var));
    }

    @Override // defpackage.l4
    public void m(k4 k4Var, ColorStateList colorStateList) {
        o(k4Var).f(colorStateList);
    }

    @Override // defpackage.l4
    public void n(k4 k4Var, float f) {
        o(k4Var).g(f, k4Var.f(), k4Var.e());
        p(k4Var);
    }

    public final m4 o(k4 k4Var) {
        return (m4) k4Var.g();
    }

    public void p(k4 k4Var) {
        if (!k4Var.f()) {
            k4Var.a(0, 0, 0, 0);
            return;
        }
        float a = a(k4Var);
        float g = g(k4Var);
        int ceil = (int) Math.ceil(n4.c(a, g, k4Var.e()));
        int ceil2 = (int) Math.ceil(n4.d(a, g, k4Var.e()));
        k4Var.a(ceil, ceil2, ceil, ceil2);
    }
}
