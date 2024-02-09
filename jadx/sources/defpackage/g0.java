package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import defpackage.i1;
import defpackage.o1;
import defpackage.v;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: g0  reason: default package */
/* loaded from: classes.dex */
public class g0 extends v {
    public u2 a;
    public boolean b;
    public Window.Callback c;
    public boolean d;
    public boolean e;
    public ArrayList<v.b> f = new ArrayList<>();
    public final Runnable g = new a();
    public final Toolbar.f h;

    /* compiled from: AxisPay */
    /* renamed from: g0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.B();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g0$b */
    /* loaded from: classes.dex */
    public class b implements Toolbar.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return g0.this.c.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g0$c */
    /* loaded from: classes.dex */
    public final class c implements o1.a {
        public boolean b;

        public c() {
        }

        @Override // defpackage.o1.a
        public void b(i1 i1Var, boolean z) {
            if (this.b) {
                return;
            }
            this.b = true;
            g0.this.a.h();
            Window.Callback callback = g0.this.c;
            if (callback != null) {
                callback.onPanelClosed(108, i1Var);
            }
            this.b = false;
        }

        @Override // defpackage.o1.a
        public boolean c(i1 i1Var) {
            Window.Callback callback = g0.this.c;
            if (callback != null) {
                callback.onMenuOpened(108, i1Var);
                return true;
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g0$d */
    /* loaded from: classes.dex */
    public final class d implements i1.a {
        public d() {
        }

        @Override // defpackage.i1.a
        public boolean a(i1 i1Var, MenuItem menuItem) {
            return false;
        }

        @Override // defpackage.i1.a
        public void b(i1 i1Var) {
            g0 g0Var = g0.this;
            if (g0Var.c != null) {
                if (g0Var.a.b()) {
                    g0.this.c.onPanelClosed(108, i1Var);
                } else if (g0.this.c.onPreparePanel(0, null, i1Var)) {
                    g0.this.c.onMenuOpened(108, i1Var);
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g0$e */
    /* loaded from: classes.dex */
    public class e extends b1 {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(g0.this.a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                g0 g0Var = g0.this;
                if (!g0Var.b) {
                    g0Var.a.c();
                    g0.this.b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public g0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.h = bVar;
        this.a = new p3(toolbar, false);
        e eVar = new e(callback);
        this.c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.a.setWindowTitle(charSequence);
    }

    public Window.Callback A() {
        return this.c;
    }

    public void B() {
        Menu z = z();
        i1 i1Var = z instanceof i1 ? (i1) z : null;
        if (i1Var != null) {
            i1Var.h0();
        }
        try {
            z.clear();
            if (!this.c.onCreatePanelMenu(0, z) || !this.c.onPreparePanel(0, null, z)) {
                z.clear();
            }
        } finally {
            if (i1Var != null) {
                i1Var.g0();
            }
        }
    }

    public void C(int i, int i2) {
        this.a.o((i & i2) | ((~i2) & this.a.p()));
    }

    @Override // defpackage.v
    public boolean g() {
        return this.a.e();
    }

    @Override // defpackage.v
    public boolean h() {
        if (this.a.n()) {
            this.a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // defpackage.v
    public void i(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).a(z);
        }
    }

    @Override // defpackage.v
    public int j() {
        return this.a.p();
    }

    @Override // defpackage.v
    public Context k() {
        return this.a.getContext();
    }

    @Override // defpackage.v
    public boolean l() {
        this.a.l().removeCallbacks(this.g);
        ac.i0(this.a.l(), this.g);
        return true;
    }

    @Override // defpackage.v
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // defpackage.v
    public void n() {
        this.a.l().removeCallbacks(this.g);
    }

    @Override // defpackage.v
    public boolean o(int i, KeyEvent keyEvent) {
        Menu z = z();
        if (z != null) {
            z.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return z.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // defpackage.v
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // defpackage.v
    public boolean q() {
        return this.a.f();
    }

    @Override // defpackage.v
    public void r(boolean z) {
    }

    @Override // defpackage.v
    public void s(boolean z) {
        C(z ? 4 : 0, 4);
    }

    @Override // defpackage.v
    public void t(boolean z) {
        C(z ? 8 : 0, 8);
    }

    @Override // defpackage.v
    public void u(int i) {
        this.a.s(i);
    }

    @Override // defpackage.v
    public void v(Drawable drawable) {
        this.a.x(drawable);
    }

    @Override // defpackage.v
    public void w(boolean z) {
    }

    @Override // defpackage.v
    public void x(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu z() {
        if (!this.d) {
            this.a.i(new c(), new d());
            this.d = true;
        }
        return this.a.q();
    }
}
