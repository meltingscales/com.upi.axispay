package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.savedstate.SavedStateRegistry;
import defpackage.s8;
import defpackage.u0;
import defpackage.w;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: z  reason: default package */
/* loaded from: classes.dex */
public class z extends sd implements a0, s8.a, w.c {
    public b0 o;
    public Resources p;

    /* compiled from: AxisPay */
    /* renamed from: z$a */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            z.this.L().v(bundle);
            return bundle;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: z$b */
    /* loaded from: classes.dex */
    public class b implements e {
        public b() {
        }

        @Override // defpackage.e
        public void a(Context context) {
            b0 L = z.this.L();
            L.o();
            L.r(z.this.getSavedStateRegistry().a(C0059ao.a(1369)));
        }
    }

    public z() {
        N();
    }

    private void A() {
        tf.a(getWindow().getDecorView(), this);
        uf.a(getWindow().getDecorView(), this);
        ul.a(getWindow().getDecorView(), this);
    }

    @Override // defpackage.sd
    public void K() {
        L().p();
    }

    public b0 L() {
        if (this.o == null) {
            this.o = b0.g(this, this);
        }
        return this.o;
    }

    public v M() {
        return L().n();
    }

    public final void N() {
        getSavedStateRegistry().d(C0059ao.a(11378), new a());
        y(new b());
    }

    public void O(s8 s8Var) {
        s8Var.b(this);
    }

    public void P(int i) {
    }

    public void Q(s8 s8Var) {
    }

    @Deprecated
    public void R() {
    }

    public boolean S() {
        Intent r = r();
        if (r != null) {
            if (W(r)) {
                s8 d = s8.d(this);
                O(d);
                Q(d);
                d.e();
                try {
                    d8.m(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            V(r);
            return true;
        }
        return false;
    }

    public final boolean T(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void U(Toolbar toolbar) {
        L().E(toolbar);
    }

    public void V(Intent intent) {
        k8.e(this, intent);
    }

    public boolean W(Intent intent) {
        return k8.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        L().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(L().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        v M = M();
        if (getWindow().hasFeature(0)) {
            if (M == null || !M.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.j8, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        v M = M();
        if (keyCode == 82 && M != null && M.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) L().i(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return L().m();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.p == null && t3.b()) {
            this.p = new t3(this, super.getResources());
        }
        Resources resources = this.p;
        return resources == null ? super.getResources() : resources;
    }

    @Override // defpackage.a0
    public void i(u0 u0Var) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        L().p();
    }

    @Override // defpackage.w.c
    public w.b j() {
        return L().k();
    }

    @Override // defpackage.a0
    public void l(u0 u0Var) {
    }

    @Override // defpackage.sd, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.p != null) {
            this.p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        L().q(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        R();
    }

    @Override // defpackage.sd, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        L().s();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (T(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.sd, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        v M = M();
        if (menuItem.getItemId() != 16908332 || M == null || (M.j() & 4) == 0) {
            return false;
        }
        return S();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // defpackage.sd, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        L().t(bundle);
    }

    @Override // defpackage.sd, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        L().u();
    }

    @Override // defpackage.sd, android.app.Activity
    public void onStart() {
        super.onStart();
        L().w();
    }

    @Override // defpackage.sd, android.app.Activity
    public void onStop() {
        super.onStop();
        L().x();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        L().G(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        v M = M();
        if (getWindow().hasFeature(0)) {
            if (M == null || !M.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.s8.a
    public Intent r() {
        return k8.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        A();
        L().B(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        L().F(i);
    }

    @Override // defpackage.a0
    public u0 u(u0.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        A();
        L().C(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        L().D(view, layoutParams);
    }
}
