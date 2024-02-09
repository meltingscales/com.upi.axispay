package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: AxisPay */
/* renamed from: e1  reason: default package */
/* loaded from: classes.dex */
public abstract class e1 {
    public final Context a;
    public u4<w9, MenuItem> b;
    public u4<x9, SubMenu> c;

    public e1(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof w9) {
            w9 w9Var = (w9) menuItem;
            if (this.b == null) {
                this.b = new u4<>();
            }
            MenuItem menuItem2 = this.b.get(menuItem);
            if (menuItem2 == null) {
                l1 l1Var = new l1(this.a, w9Var);
                this.b.put(w9Var, l1Var);
                return l1Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof x9) {
            x9 x9Var = (x9) subMenu;
            if (this.c == null) {
                this.c = new u4<>();
            }
            SubMenu subMenu2 = this.c.get(x9Var);
            if (subMenu2 == null) {
                u1 u1Var = new u1(this.a, x9Var);
                this.c.put(x9Var, u1Var);
                return u1Var;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public final void e() {
        u4<w9, MenuItem> u4Var = this.b;
        if (u4Var != null) {
            u4Var.clear();
        }
        u4<x9, SubMenu> u4Var2 = this.c;
        if (u4Var2 != null) {
            u4Var2.clear();
        }
    }

    public final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (this.b.i(i2).getGroupId() == i) {
                this.b.k(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.i(i2).getItemId() == i) {
                this.b.k(i2);
                return;
            }
        }
    }
}
