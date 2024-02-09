package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import defpackage.i1;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: t1  reason: default package */
/* loaded from: classes.dex */
public class t1 extends i1 implements SubMenu {
    public i1 B;
    public k1 C;

    public t1(Context context, i1 i1Var, k1 k1Var) {
        super(context);
        this.B = i1Var;
        this.C = k1Var;
    }

    @Override // defpackage.i1
    public i1 F() {
        return this.B.F();
    }

    @Override // defpackage.i1
    public boolean H() {
        return this.B.H();
    }

    @Override // defpackage.i1
    public boolean I() {
        return this.B.I();
    }

    @Override // defpackage.i1
    public boolean J() {
        return this.B.J();
    }

    @Override // defpackage.i1
    public void V(i1.a aVar) {
        this.B.V(aVar);
    }

    @Override // defpackage.i1
    public boolean f(k1 k1Var) {
        return this.B.f(k1Var);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    @Override // defpackage.i1
    public boolean h(i1 i1Var, MenuItem menuItem) {
        return super.h(i1Var, menuItem) || this.B.h(i1Var, menuItem);
    }

    public Menu i0() {
        return this.B;
    }

    @Override // defpackage.i1
    public boolean m(k1 k1Var) {
        return this.B.m(k1Var);
    }

    @Override // defpackage.i1, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.Z(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.c0(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.d0(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // defpackage.i1, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    @Override // defpackage.i1
    public String v() {
        k1 k1Var = this.C;
        int itemId = k1Var != null ? k1Var.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + C0059ao.a(1205) + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.Y(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.b0(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.C.setIcon(i);
        return this;
    }
}
