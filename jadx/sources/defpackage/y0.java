package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import defpackage.u0;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: y0  reason: default package */
/* loaded from: classes.dex */
public class y0 extends ActionMode {
    public final Context a;
    public final u0 b;

    /* compiled from: AxisPay */
    /* renamed from: y0$a */
    /* loaded from: classes.dex */
    public static class a implements u0.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<y0> c = new ArrayList<>();
        public final u4<Menu, Menu> d = new u4<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // defpackage.u0.a
        public boolean a(u0 u0Var, Menu menu) {
            return this.a.onPrepareActionMode(e(u0Var), f(menu));
        }

        @Override // defpackage.u0.a
        public void b(u0 u0Var) {
            this.a.onDestroyActionMode(e(u0Var));
        }

        @Override // defpackage.u0.a
        public boolean c(u0 u0Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(u0Var), new l1(this.b, (w9) menuItem));
        }

        @Override // defpackage.u0.a
        public boolean d(u0 u0Var, Menu menu) {
            return this.a.onCreateActionMode(e(u0Var), f(menu));
        }

        public ActionMode e(u0 u0Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                y0 y0Var = this.c.get(i);
                if (y0Var != null && y0Var.b == u0Var) {
                    return y0Var;
                }
            }
            y0 y0Var2 = new y0(this.b, u0Var);
            this.c.add(y0Var2);
            return y0Var2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                q1 q1Var = new q1(this.b, (v9) menu);
                this.d.put(menu, q1Var);
                return q1Var;
            }
            return menu2;
        }
    }

    public y0(Context context, u0 u0Var) {
        this.a = context;
        this.b = u0Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new q1(this.a, (v9) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
