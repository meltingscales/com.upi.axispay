package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.savedstate.SavedStateRegistry;
import defpackage.bf;
import defpackage.d8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sd  reason: default package */
/* loaded from: classes.dex */
public class sd extends ComponentActivity implements d8.c, d8.e {
    public boolean l;
    public boolean m;
    public final wd j = wd.b(new c());
    public final ff k = new ff(this);
    public boolean n = true;

    /* compiled from: AxisPay */
    /* renamed from: sd$a */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            sd.this.F();
            sd.this.k.h(bf.b.ON_STOP);
            Parcelable x = sd.this.j.x();
            if (x != null) {
                bundle.putParcelable(C0059ao.a(12143), x);
            }
            return bundle;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: sd$b */
    /* loaded from: classes.dex */
    public class b implements e {
        public b() {
        }

        @Override // defpackage.e
        public void a(Context context) {
            sd.this.j.a(null);
            SavedStateRegistry savedStateRegistry = sd.this.getSavedStateRegistry();
            String a = C0059ao.a(12368);
            Bundle a2 = savedStateRegistry.a(a);
            if (a2 != null) {
                sd.this.j.w(a2.getParcelable(a));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: sd$c */
    /* loaded from: classes.dex */
    public class c extends yd<sd> implements sf, defpackage.c, h, de {
        public c() {
            super(sd.this);
        }

        @Override // defpackage.de
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            sd.this.H(fragment);
        }

        @Override // defpackage.c
        public OnBackPressedDispatcher c() {
            return sd.this.c();
        }

        @Override // defpackage.yd, defpackage.ud
        public View d(int i) {
            return sd.this.findViewById(i);
        }

        @Override // defpackage.yd, defpackage.ud
        public boolean e() {
            Window window = sd.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.ef
        public bf getLifecycle() {
            return sd.this.k;
        }

        @Override // defpackage.sf
        public rf getViewModelStore() {
            return sd.this.getViewModelStore();
        }

        @Override // defpackage.yd
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            sd.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // defpackage.yd
        public LayoutInflater k() {
            return sd.this.getLayoutInflater().cloneInContext(sd.this);
        }

        @Override // defpackage.yd
        public boolean m(Fragment fragment) {
            return !sd.this.isFinishing();
        }

        @Override // defpackage.yd
        public boolean n(String str) {
            return d8.p(sd.this, str);
        }

        @Override // defpackage.h
        public ActivityResultRegistry p() {
            return sd.this.p();
        }

        @Override // defpackage.yd
        public void r() {
            sd.this.K();
        }

        @Override // defpackage.yd
        /* renamed from: s */
        public sd j() {
            return sd.this;
        }
    }

    public sd() {
        E();
    }

    public static boolean G(FragmentManager fragmentManager, bf.c cVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.v0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= G(fragment.getChildFragmentManager(), cVar);
                }
                ne neVar = fragment.mViewLifecycleOwner;
                if (neVar != null && neVar.getLifecycle().b().a(bf.c.STARTED)) {
                    fragment.mViewLifecycleOwner.g(cVar);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.b().a(bf.c.STARTED)) {
                    fragment.mLifecycleRegistry.o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View C(View view, String str, Context context, AttributeSet attributeSet) {
        return this.j.v(view, str, context, attributeSet);
    }

    public FragmentManager D() {
        return this.j.t();
    }

    public final void E() {
        getSavedStateRegistry().d(C0059ao.a(1741), new a());
        y(new b());
    }

    public void F() {
        do {
        } while (G(D(), bf.c.CREATED));
    }

    @Deprecated
    public void H(Fragment fragment) {
    }

    @Deprecated
    public boolean I(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void J() {
        this.k.h(bf.b.ON_RESUME);
        this.j.p();
    }

    @Deprecated
    public void K() {
        invalidateOptionsMenu();
    }

    @Override // defpackage.d8.e
    @Deprecated
    public final void b(int i) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print(C0059ao.a(1742));
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(C0059ao.a(1743));
        String str2 = str + C0059ao.a(1744);
        printWriter.print(str2);
        printWriter.print(C0059ao.a(1745));
        printWriter.print(this.l);
        printWriter.print(C0059ao.a(1746));
        printWriter.print(this.m);
        printWriter.print(C0059ao.a(1747));
        printWriter.print(this.n);
        if (getApplication() != null) {
            xf.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.j.t().Y(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.j.u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.j.u();
        super.onConfigurationChanged(configuration);
        this.j.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k.h(bf.b.ON_CREATE);
        this.j.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.j.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View C = C(view, str, context, attributeSet);
        return C == null ? super.onCreateView(view, str, context, attributeSet) : C;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.j.h();
        this.k.h(bf.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.j.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.j.e(menuItem);
        }
        return this.j.k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.j.j(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.j.u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.j.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.m = false;
        this.j.m();
        this.k.h(bf.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.j.n(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        J();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return I(view, menu) | this.j.o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.j.u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.j.u();
        super.onResume();
        this.m = true;
        this.j.s();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.j.u();
        super.onStart();
        this.n = false;
        if (!this.l) {
            this.l = true;
            this.j.c();
        }
        this.j.s();
        this.k.h(bf.b.ON_START);
        this.j.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.j.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.n = true;
        F();
        this.j.r();
        this.k.h(bf.b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View C = C(null, str, context, attributeSet);
        return C == null ? super.onCreateView(str, context, attributeSet) : C;
    }
}
