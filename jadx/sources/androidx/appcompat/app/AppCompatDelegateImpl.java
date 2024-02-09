package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.b9;
import defpackage.bf;
import defpackage.i1;
import defpackage.jb;
import defpackage.o1;
import defpackage.u0;
import defpackage.w;
import defpackage.x2;
import defpackage.y0;
import java.lang.Thread;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends b0 implements i1.a, LayoutInflater.Factory2 {
    public static final u4<String, Integer> c0 = new u4<>();
    public static final boolean d0;
    public static final int[] e0;
    public static final boolean f0;
    public static final boolean g0;
    public static boolean h0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public PanelFeatureState[] H;
    public PanelFeatureState I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public q S;
    public q T;
    public boolean U;
    public int V;
    public final Runnable W;
    public boolean X;
    public Rect Y;
    public Rect Z;
    public d0 a0;
    public e0 b0;
    public final Object e;
    public final Context f;
    public Window g;
    public o h;
    public final a0 i;
    public v j;
    public MenuInflater k;
    public CharSequence l;
    public t2 m;
    public i n;
    public u o;
    public u0 p;
    public ActionBarContextView q;
    public PopupWindow r;
    public Runnable s;
    public ec t;
    public boolean u;
    public boolean v;
    public ViewGroup w;
    public TextView x;
    public View y;
    public boolean z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class PanelFeatureState {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public i1 j;
        public g1 k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        /* compiled from: AxisPay */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int b;
            public boolean c;
            public Bundle d;

            /* compiled from: AxisPay */
            /* loaded from: classes.dex */
            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.c = z;
                if (z) {
                    savedState.d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.c ? 1 : 0);
                if (this.c) {
                    parcel.writeBundle(this.d);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.a = i;
        }

        public p1 a(o1.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                g1 g1Var = new g1(this.l, defpackage.r.abc_list_menu_item_layout);
                this.k = g1Var;
                g1Var.m(aVar);
                this.j.b(this.k);
            }
            return this.k.c(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        public void c(i1 i1Var) {
            g1 g1Var;
            i1 i1Var2 = this.j;
            if (i1Var == i1Var2) {
                return;
            }
            if (i1Var2 != null) {
                i1Var2.Q(this.k);
            }
            this.j = i1Var;
            if (i1Var == null || (g1Var = this.k) == null) {
                return;
            }
            i1Var.b(g1Var);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(defpackage.l.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(defpackage.l.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(defpackage.t.Theme_AppCompat_CompactMenu, true);
            }
            w0 w0Var = new w0(context, 0);
            w0Var.getTheme().setTo(newTheme);
            this.l = w0Var;
            TypedArray obtainStyledAttributes = w0Var.obtainStyledAttributes(defpackage.u.AppCompatTheme);
            this.b = obtainStyledAttributes.getResourceId(defpackage.u.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(defpackage.u.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        public final boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.V & 1) != 0) {
                appCompatDelegateImpl.W(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.V & Barcode.AZTEC) != 0) {
                appCompatDelegateImpl2.W(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.U = false;
            appCompatDelegateImpl3.V = 0;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements ub {
        public c() {
        }

        @Override // defpackage.ub
        public ic a(View view, ic icVar) {
            int l = icVar.l();
            int N0 = AppCompatDelegateImpl.this.N0(icVar, null);
            if (l != N0) {
                icVar = icVar.q(icVar.j(), N0, icVar.k(), icVar.i());
            }
            return ac.c0(view, icVar);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements x2.a {
        public d() {
        }

        @Override // defpackage.x2.a
        public void a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.N0(null, rect);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.U();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a extends gc {
            public a() {
            }

            @Override // defpackage.gc, defpackage.fc
            public void b(View view) {
                AppCompatDelegateImpl.this.q.setAlpha(1.0f);
                AppCompatDelegateImpl.this.t.h(null);
                AppCompatDelegateImpl.this.t = null;
            }

            @Override // defpackage.gc, defpackage.fc
            public void c(View view) {
                AppCompatDelegateImpl.this.q.setVisibility(0);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.r.showAtLocation(appCompatDelegateImpl.q, 55, 0, 0);
            AppCompatDelegateImpl.this.X();
            if (AppCompatDelegateImpl.this.F0()) {
                AppCompatDelegateImpl.this.q.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                ec d = ac.d(appCompatDelegateImpl2.q);
                d.a(1.0f);
                appCompatDelegateImpl2.t = d;
                AppCompatDelegateImpl.this.t.h(new a());
                return;
            }
            AppCompatDelegateImpl.this.q.setAlpha(1.0f);
            AppCompatDelegateImpl.this.q.setVisibility(0);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class g extends gc {
        public g() {
        }

        @Override // defpackage.gc, defpackage.fc
        public void b(View view) {
            AppCompatDelegateImpl.this.q.setAlpha(1.0f);
            AppCompatDelegateImpl.this.t.h(null);
            AppCompatDelegateImpl.this.t = null;
        }

        @Override // defpackage.gc, defpackage.fc
        public void c(View view) {
            AppCompatDelegateImpl.this.q.setVisibility(0);
            AppCompatDelegateImpl.this.q.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.q.getParent() instanceof View) {
                ac.n0((View) AppCompatDelegateImpl.this.q.getParent());
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class h implements w.b {
        public h() {
        }

        @Override // defpackage.w.b
        public void a(Drawable drawable, int i) {
            v n = AppCompatDelegateImpl.this.n();
            if (n != null) {
                n.v(drawable);
                n.u(i);
            }
        }

        @Override // defpackage.w.b
        public boolean b() {
            v n = AppCompatDelegateImpl.this.n();
            return (n == null || (n.j() & 4) == 0) ? false : true;
        }

        @Override // defpackage.w.b
        public Drawable c() {
            o3 u = o3.u(e(), null, new int[]{defpackage.l.homeAsUpIndicator});
            Drawable g = u.g(0);
            u.w();
            return g;
        }

        @Override // defpackage.w.b
        public void d(int i) {
            v n = AppCompatDelegateImpl.this.n();
            if (n != null) {
                n.u(i);
            }
        }

        @Override // defpackage.w.b
        public Context e() {
            return AppCompatDelegateImpl.this.c0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class i implements o1.a {
        public i() {
        }

        @Override // defpackage.o1.a
        public void b(i1 i1Var, boolean z) {
            AppCompatDelegateImpl.this.N(i1Var);
        }

        @Override // defpackage.o1.a
        public boolean c(i1 i1Var) {
            Window.Callback h0 = AppCompatDelegateImpl.this.h0();
            if (h0 != null) {
                h0.onMenuOpened(108, i1Var);
                return true;
            }
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class j implements u0.a {
        public u0.a a;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a extends gc {
            public a() {
            }

            @Override // defpackage.gc, defpackage.fc
            public void b(View view) {
                AppCompatDelegateImpl.this.q.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.q.getParent() instanceof View) {
                    ac.n0((View) AppCompatDelegateImpl.this.q.getParent());
                }
                AppCompatDelegateImpl.this.q.k();
                AppCompatDelegateImpl.this.t.h(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.t = null;
                ac.n0(appCompatDelegateImpl2.w);
            }
        }

        public j(u0.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.u0.a
        public boolean a(u0 u0Var, Menu menu) {
            ac.n0(AppCompatDelegateImpl.this.w);
            return this.a.a(u0Var, menu);
        }

        @Override // defpackage.u0.a
        public void b(u0 u0Var) {
            this.a.b(u0Var);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.r != null) {
                appCompatDelegateImpl.g.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.s);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.q != null) {
                appCompatDelegateImpl2.X();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                ec d = ac.d(appCompatDelegateImpl3.q);
                d.a(0.0f);
                appCompatDelegateImpl3.t = d;
                AppCompatDelegateImpl.this.t.h(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            a0 a0Var = appCompatDelegateImpl4.i;
            if (a0Var != null) {
                a0Var.l(appCompatDelegateImpl4.p);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.p = null;
            ac.n0(appCompatDelegateImpl5.w);
        }

        @Override // defpackage.u0.a
        public boolean c(u0 u0Var, MenuItem menuItem) {
            return this.a.c(u0Var, menuItem);
        }

        @Override // defpackage.u0.a
        public boolean d(u0 u0Var, Menu menu) {
            return this.a.d(u0Var, menu);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class k {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class l {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class n {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class p extends q {
        public final PowerManager c;

        public p(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !l.a(this.c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public void d() {
            AppCompatDelegateImpl.this.H();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public abstract class q {
        public BroadcastReceiver a;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        public q() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            AppCompatDelegateImpl.this.f.registerReceiver(this.a, b);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class r extends q {
        public final i0 c;

        public r(i0 i0Var) {
            super();
            this.c = i0Var;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public void d() {
            AppCompatDelegateImpl.this.H();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class s {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        public final boolean c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.P(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(k0.d(getContext(), i));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class u implements o1.a {
        public u() {
        }

        @Override // defpackage.o1.a
        public void b(i1 i1Var, boolean z) {
            i1 F = i1Var.F();
            boolean z2 = F != i1Var;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                i1Var = F;
            }
            PanelFeatureState a0 = appCompatDelegateImpl.a0(i1Var);
            if (a0 != null) {
                if (z2) {
                    AppCompatDelegateImpl.this.M(a0.a, a0, F);
                    AppCompatDelegateImpl.this.Q(a0, true);
                    return;
                }
                AppCompatDelegateImpl.this.Q(a0, z);
            }
        }

        @Override // defpackage.o1.a
        public boolean c(i1 i1Var) {
            Window.Callback h0;
            if (i1Var == i1Var.F()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (!appCompatDelegateImpl.B || (h0 = appCompatDelegateImpl.h0()) == null || AppCompatDelegateImpl.this.N) {
                    return true;
                }
                h0.onMenuOpened(108, i1Var);
                return true;
            }
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 < 21;
        d0 = z;
        e0 = new int[]{16842836};
        f0 = !"robolectric".equals(Build.FINGERPRINT);
        g0 = i2 >= 17;
        if (!z || h0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        h0 = true;
    }

    public AppCompatDelegateImpl(Activity activity, a0 a0Var) {
        this(activity, null, a0Var, activity);
    }

    public static Configuration b0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!ya.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                k.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    @Override // defpackage.b0
    public boolean A(int i2) {
        int E0 = E0(i2);
        if (this.F && E0 == 108) {
            return false;
        }
        if (this.B && E0 == 1) {
            this.B = false;
        }
        if (E0 == 1) {
            J0();
            this.F = true;
            return true;
        } else if (E0 == 2) {
            J0();
            this.z = true;
            return true;
        } else if (E0 == 5) {
            J0();
            this.A = true;
            return true;
        } else if (E0 == 10) {
            J0();
            this.D = true;
            return true;
        } else if (E0 == 108) {
            J0();
            this.B = true;
            return true;
        } else if (E0 != 109) {
            return this.g.requestFeature(E0);
        } else {
            J0();
            this.C = true;
            return true;
        }
    }

    public final v A0() {
        return this.j;
    }

    @Override // defpackage.b0
    public void B(int i2) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f).inflate(i2, viewGroup);
        this.h.a().onContentChanged();
    }

    public final boolean B0(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) {
        i1 i1Var;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.m || C0(panelFeatureState, keyEvent)) && (i1Var = panelFeatureState.j) != null) {
            z = i1Var.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.m == null) {
            Q(panelFeatureState, true);
        }
        return z;
    }

    @Override // defpackage.b0
    public void C(View view) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h.a().onContentChanged();
    }

    public final boolean C0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        t2 t2Var;
        t2 t2Var2;
        t2 t2Var3;
        t2 t2Var4;
        if (this.N) {
            return false;
        }
        if (panelFeatureState.m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.I;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            Q(panelFeatureState2, false);
        }
        Window.Callback h02 = h0();
        if (h02 != null) {
            panelFeatureState.i = h02.onCreatePanelView(panelFeatureState.a);
        }
        int i2 = panelFeatureState.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (t2Var4 = this.m) != null) {
            t2Var4.c();
        }
        if (panelFeatureState.i == null && (!z || !(A0() instanceof g0))) {
            i1 i1Var = panelFeatureState.j;
            if (i1Var == null || panelFeatureState.r) {
                if (i1Var == null && (!l0(panelFeatureState) || panelFeatureState.j == null)) {
                    return false;
                }
                if (z && (t2Var2 = this.m) != null) {
                    if (this.n == null) {
                        this.n = new i();
                    }
                    t2Var2.a(panelFeatureState.j, this.n);
                }
                panelFeatureState.j.h0();
                if (!h02.onCreatePanelMenu(panelFeatureState.a, panelFeatureState.j)) {
                    panelFeatureState.c(null);
                    if (z && (t2Var = this.m) != null) {
                        t2Var.a(null, this.n);
                    }
                    return false;
                }
                panelFeatureState.r = false;
            }
            panelFeatureState.j.h0();
            Bundle bundle = panelFeatureState.s;
            if (bundle != null) {
                panelFeatureState.j.R(bundle);
                panelFeatureState.s = null;
            }
            if (!h02.onPreparePanel(0, panelFeatureState.i, panelFeatureState.j)) {
                if (z && (t2Var3 = this.m) != null) {
                    t2Var3.a(null, this.n);
                }
                panelFeatureState.j.g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.p = z2;
            panelFeatureState.j.setQwertyMode(z2);
            panelFeatureState.j.g0();
        }
        panelFeatureState.m = true;
        panelFeatureState.n = false;
        this.I = panelFeatureState;
        return true;
    }

    @Override // defpackage.b0
    public void D(View view, ViewGroup.LayoutParams layoutParams) {
        Y();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    public final void D0(boolean z) {
        t2 t2Var = this.m;
        if (t2Var != null && t2Var.g() && (!ViewConfiguration.get(this.f).hasPermanentMenuKey() || this.m.d())) {
            Window.Callback h02 = h0();
            if (this.m.b() && z) {
                this.m.e();
                if (this.N) {
                    return;
                }
                h02.onPanelClosed(108, f0(0, true).j);
                return;
            } else if (h02 == null || this.N) {
                return;
            } else {
                if (this.U && (this.V & 1) != 0) {
                    this.g.getDecorView().removeCallbacks(this.W);
                    this.W.run();
                }
                PanelFeatureState f02 = f0(0, true);
                i1 i1Var = f02.j;
                if (i1Var == null || f02.r || !h02.onPreparePanel(0, f02.i, i1Var)) {
                    return;
                }
                h02.onMenuOpened(108, f02.j);
                this.m.f();
                return;
            }
        }
        PanelFeatureState f03 = f0(0, true);
        f03.q = true;
        Q(f03, false);
        z0(f03, null);
    }

    @Override // defpackage.b0
    public void E(Toolbar toolbar) {
        if (this.e instanceof Activity) {
            v n2 = n();
            if (!(n2 instanceof j0)) {
                this.k = null;
                if (n2 != null) {
                    n2.n();
                }
                if (toolbar != null) {
                    g0 g0Var = new g0(toolbar, g0(), this.h);
                    this.j = g0Var;
                    this.g.setCallback(g0Var.A());
                } else {
                    this.j = null;
                    this.g.setCallback(this.h);
                }
                p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final int E0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i2;
        }
    }

    @Override // defpackage.b0
    public void F(int i2) {
        this.P = i2;
    }

    public final boolean F0() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && ac.V(viewGroup);
    }

    @Override // defpackage.b0
    public final void G(CharSequence charSequence) {
        this.l = charSequence;
        t2 t2Var = this.m;
        if (t2Var != null) {
            t2Var.setWindowTitle(charSequence);
        } else if (A0() != null) {
            A0().x(charSequence);
        } else {
            TextView textView = this.x;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean G0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ac.U((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public boolean H() {
        return I(true);
    }

    public u0 H0(u0.a aVar) {
        a0 a0Var;
        if (aVar != null) {
            u0 u0Var = this.p;
            if (u0Var != null) {
                u0Var.c();
            }
            j jVar = new j(aVar);
            v n2 = n();
            if (n2 != null) {
                u0 y = n2.y(jVar);
                this.p = y;
                if (y != null && (a0Var = this.i) != null) {
                    a0Var.i(y);
                }
            }
            if (this.p == null) {
                this.p = I0(jVar);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final boolean I(boolean z) {
        if (this.N) {
            return false;
        }
        int L = L();
        boolean L0 = L0(p0(this.f, L), z);
        if (L == 0) {
            e0(this.f).e();
        } else {
            q qVar = this.S;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (L == 3) {
            d0(this.f).e();
        } else {
            q qVar2 = this.T;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return L0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.u0 I0(defpackage.u0.a r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.I0(u0$a):u0");
    }

    public final void J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(16908290);
        View decorView = this.g.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(defpackage.u.AppCompatTheme);
        obtainStyledAttributes.getValue(defpackage.u.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(defpackage.u.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i2 = defpackage.u.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = defpackage.u.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = defpackage.u.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = defpackage.u.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final void J0() {
        if (this.v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K(Window window) {
        if (this.g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                o oVar = new o(callback);
                this.h = oVar;
                window.setCallback(oVar);
                o3 u2 = o3.u(this.f, null, e0);
                Drawable h2 = u2.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                u2.w();
                this.g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final z K0() {
        for (Context context = this.f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof z) {
                return (z) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final int L() {
        int i2 = this.O;
        return i2 != -100 ? i2 : b0.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f
            r1 = 0
            android.content.res.Configuration r0 = r6.R(r0, r7, r1)
            boolean r2 = r6.n0()
            android.content.Context r3 = r6.f
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.K
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.f0
            if (r8 != 0) goto L30
            boolean r8 = r6.L
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.e
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.e
            android.app.Activity r8 = (android.app.Activity) r8
            defpackage.d8.n(r8)
            r8 = r4
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.M0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.e
            boolean r0 = r8 instanceof defpackage.z
            if (r0 == 0) goto L5e
            z r8 = (defpackage.z) r8
            r8.P(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.L0(int, boolean):boolean");
    }

    public void M(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.H;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.o) && !this.N) {
            this.h.a().onPanelClosed(i2, menu);
        }
    }

    public final void M0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            f0.a(resources);
        }
        int i4 = this.P;
        if (i4 != 0) {
            this.f.setTheme(i4);
            if (i3 >= 23) {
                this.f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof ef) {
                    if (((ef) activity).getLifecycle().b().a(bf.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.M) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    public void N(i1 i1Var) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.m.l();
        Window.Callback h02 = h0();
        if (h02 != null && !this.N) {
            h02.onPanelClosed(108, i1Var);
        }
        this.G = false;
    }

    public final int N0(ic icVar, Rect rect) {
        int i2;
        boolean z;
        boolean z2;
        if (icVar != null) {
            i2 = icVar.l();
        } else {
            i2 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect2 = this.Y;
                Rect rect3 = this.Z;
                if (icVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(icVar.j(), icVar.l(), icVar.k(), icVar.i());
                }
                u3.a(this.w, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                ic K = ac.K(this.w);
                int j2 = K == null ? 0 : K.j();
                int k2 = K == null ? 0 : K.k();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 > 0 && this.y == null) {
                    View view = new View(this.f);
                    this.y = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j2;
                    layoutParams.rightMargin = k2;
                    this.w.addView(this.y, -1, layoutParams);
                } else {
                    View view2 = this.y;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != j2 || marginLayoutParams2.rightMargin != k2) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = j2;
                            marginLayoutParams2.rightMargin = k2;
                            this.y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.y;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    O0(this.y);
                }
                if (!this.D && r5) {
                    i2 = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.y;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    public final void O() {
        q qVar = this.S;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.T;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    public final void O0(View view) {
        int d2;
        if ((ac.N(view) & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            d2 = t8.d(this.f, defpackage.n.abc_decor_view_status_guard_light);
        } else {
            d2 = t8.d(this.f, defpackage.n.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(d2);
    }

    public void P(int i2) {
        Q(f0(i2, true), true);
    }

    public void Q(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        t2 t2Var;
        if (z && panelFeatureState.a == 0 && (t2Var = this.m) != null && t2Var.b()) {
            N(panelFeatureState.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager != null && panelFeatureState.o && (viewGroup = panelFeatureState.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                M(panelFeatureState.a, panelFeatureState, null);
            }
        }
        panelFeatureState.m = false;
        panelFeatureState.n = false;
        panelFeatureState.o = false;
        panelFeatureState.h = null;
        panelFeatureState.q = true;
        if (this.I == panelFeatureState) {
            this.I = null;
        }
    }

    public final Configuration R(Context context, int i2, Configuration configuration) {
        int i3;
        if (i2 != 1) {
            i3 = i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final ViewGroup S() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(defpackage.u.AppCompatTheme);
        int i2 = defpackage.u.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i2)) {
            if (obtainStyledAttributes.getBoolean(defpackage.u.AppCompatTheme_windowNoTitle, false)) {
                A(1);
            } else if (obtainStyledAttributes.getBoolean(i2, false)) {
                A(108);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.u.AppCompatTheme_windowActionBarOverlay, false)) {
                A(109);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.u.AppCompatTheme_windowActionModeOverlay, false)) {
                A(10);
            }
            this.E = obtainStyledAttributes.getBoolean(defpackage.u.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            Z();
            this.g.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f);
            if (!this.F) {
                if (this.E) {
                    viewGroup = (ViewGroup) from.inflate(defpackage.r.abc_dialog_title_material, (ViewGroup) null);
                    this.C = false;
                    this.B = false;
                } else if (this.B) {
                    TypedValue typedValue = new TypedValue();
                    this.f.getTheme().resolveAttribute(defpackage.l.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new w0(this.f, typedValue.resourceId);
                    } else {
                        context = this.f;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(defpackage.r.abc_screen_toolbar, (ViewGroup) null);
                    t2 t2Var = (t2) viewGroup.findViewById(defpackage.q.decor_content_parent);
                    this.m = t2Var;
                    t2Var.setWindowCallback(h0());
                    if (this.C) {
                        this.m.k(109);
                    }
                    if (this.z) {
                        this.m.k(2);
                    }
                    if (this.A) {
                        this.m.k(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.D ? (ViewGroup) from.inflate(defpackage.r.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(defpackage.r.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    ac.D0(viewGroup, new c());
                } else if (viewGroup instanceof x2) {
                    ((x2) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.m == null) {
                    this.x = (TextView) viewGroup.findViewById(defpackage.q.title);
                }
                u3.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(defpackage.q.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.g.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.g.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View T(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            d0 r0 = r11.a0
            r1 = 0
            if (r0 != 0) goto L55
            android.content.Context r0 = r11.f
            int[] r2 = defpackage.u.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = defpackage.u.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            d0 r0 = new d0
            r0.<init>()
            r11.a0 = r0
            goto L55
        L1d:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L32
            d0 r2 = (defpackage.d0) r2     // Catch: java.lang.Throwable -> L32
            r11.a0 = r2     // Catch: java.lang.Throwable -> L32
            goto L55
        L32:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            d0 r0 = new d0
            r0.<init>()
            r11.a0 = r0
        L55:
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.d0
            r0 = 1
            if (r8 == 0) goto L85
            e0 r2 = r11.b0
            if (r2 != 0) goto L65
            e0 r2 = new e0
            r2.<init>()
            r11.b0 = r2
        L65:
            e0 r2 = r11.b0
            boolean r2 = r2.a(r15)
            if (r2 == 0) goto L6f
            r7 = r0
            goto L86
        L6f:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L7d
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L85
            goto L84
        L7d:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.G0(r0)
        L84:
            r1 = r0
        L85:
            r7 = r1
        L86:
            d0 r2 = r11.a0
            r9 = 1
            boolean r10 = defpackage.t3.b()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.q(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.T(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public void U() {
        i1 i1Var;
        t2 t2Var = this.m;
        if (t2Var != null) {
            t2Var.l();
        }
        if (this.r != null) {
            this.g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        X();
        PanelFeatureState f02 = f0(0, false);
        if (f02 == null || (i1Var = f02.j) == null) {
            return;
        }
        i1Var.close();
    }

    public boolean V(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.e;
        if (((obj instanceof jb.a) || (obj instanceof c0)) && (decorView = this.g.getDecorView()) != null && jb.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? r0(keyCode, keyEvent) : u0(keyCode, keyEvent);
    }

    public void W(int i2) {
        PanelFeatureState f02;
        PanelFeatureState f03 = f0(i2, true);
        if (f03.j != null) {
            Bundle bundle = new Bundle();
            f03.j.T(bundle);
            if (bundle.size() > 0) {
                f03.s = bundle;
            }
            f03.j.h0();
            f03.j.clear();
        }
        f03.r = true;
        f03.q = true;
        if ((i2 != 108 && i2 != 0) || this.m == null || (f02 = f0(0, false)) == null) {
            return;
        }
        f02.m = false;
        C0(f02, null);
    }

    public void X() {
        ec ecVar = this.t;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    public final void Y() {
        if (this.v) {
            return;
        }
        this.w = S();
        CharSequence g02 = g0();
        if (!TextUtils.isEmpty(g02)) {
            t2 t2Var = this.m;
            if (t2Var != null) {
                t2Var.setWindowTitle(g02);
            } else if (A0() != null) {
                A0().x(g02);
            } else {
                TextView textView = this.x;
                if (textView != null) {
                    textView.setText(g02);
                }
            }
        }
        J();
        y0(this.w);
        this.v = true;
        PanelFeatureState f02 = f0(0, false);
        if (this.N) {
            return;
        }
        if (f02 == null || f02.j == null) {
            m0(108);
        }
    }

    public final void Z() {
        if (this.g == null) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                K(((Activity) obj).getWindow());
            }
        }
        if (this.g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // defpackage.i1.a
    public boolean a(i1 i1Var, MenuItem menuItem) {
        PanelFeatureState a0;
        Window.Callback h02 = h0();
        if (h02 == null || this.N || (a0 = a0(i1Var.F())) == null) {
            return false;
        }
        return h02.onMenuItemSelected(a0.a, menuItem);
    }

    public PanelFeatureState a0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.H;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // defpackage.i1.a
    public void b(i1 i1Var) {
        D0(true);
    }

    public final Context c0() {
        v n2 = n();
        Context k2 = n2 != null ? n2.k() : null;
        return k2 == null ? this.f : k2;
    }

    @Override // defpackage.b0
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        Y();
        ((ViewGroup) this.w.findViewById(16908290)).addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    public final q d0(Context context) {
        if (this.T == null) {
            this.T = new p(context);
        }
        return this.T;
    }

    public final q e0(Context context) {
        if (this.S == null) {
            this.S = new r(i0.a(context));
        }
        return this.S;
    }

    @Override // defpackage.b0
    public Context f(Context context) {
        this.K = true;
        int p0 = p0(context, L());
        Configuration configuration = null;
        if (g0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, R(context, p0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof w0) {
            try {
                ((w0) context).a(R(context, p0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f0) {
            super.f(context);
            return context;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = k.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = b0(configuration3, configuration4);
            }
        }
        Configuration R = R(context, p0, configuration);
        w0 w0Var = new w0(context, defpackage.t.Theme_AppCompat_Empty);
        w0Var.a(R);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            b9.d.a(w0Var.getTheme());
        }
        super.f(w0Var);
        return w0Var;
    }

    public PanelFeatureState f0(int i2, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.H;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.H = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
            panelFeatureStateArr[i2] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    public final CharSequence g0() {
        Object obj = this.e;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.l;
    }

    public final Window.Callback h0() {
        return this.g.getCallback();
    }

    @Override // defpackage.b0
    public <T extends View> T i(int i2) {
        Y();
        return (T) this.g.findViewById(i2);
    }

    public final void i0() {
        Y();
        if (this.B && this.j == null) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                this.j = new j0((Activity) this.e, this.C);
            } else if (obj instanceof Dialog) {
                this.j = new j0((Dialog) this.e);
            }
            v vVar = this.j;
            if (vVar != null) {
                vVar.r(this.X);
            }
        }
    }

    public final boolean j0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.i;
        if (view != null) {
            panelFeatureState.h = view;
            return true;
        } else if (panelFeatureState.j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new u();
            }
            View view2 = (View) panelFeatureState.a(this.o);
            panelFeatureState.h = view2;
            return view2 != null;
        }
    }

    @Override // defpackage.b0
    public final w.b k() {
        return new h();
    }

    public final boolean k0(PanelFeatureState panelFeatureState) {
        panelFeatureState.d(c0());
        panelFeatureState.g = new t(panelFeatureState.l);
        panelFeatureState.c = 81;
        return true;
    }

    @Override // defpackage.b0
    public int l() {
        return this.O;
    }

    public final boolean l0(PanelFeatureState panelFeatureState) {
        Context context = this.f;
        int i2 = panelFeatureState.a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(defpackage.l.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(defpackage.l.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(defpackage.l.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                w0 w0Var = new w0(context, 0);
                w0Var.getTheme().setTo(theme2);
                context = w0Var;
            }
        }
        i1 i1Var = new i1(context);
        i1Var.V(this);
        panelFeatureState.c(i1Var);
        return true;
    }

    @Override // defpackage.b0
    public MenuInflater m() {
        if (this.k == null) {
            i0();
            v vVar = this.j;
            this.k = new z0(vVar != null ? vVar.k() : this.f);
        }
        return this.k;
    }

    public final void m0(int i2) {
        this.V = (1 << i2) | this.V;
        if (this.U) {
            return;
        }
        ac.i0(this.g.getDecorView(), this.W);
        this.U = true;
    }

    @Override // defpackage.b0
    public v n() {
        i0();
        return this.j;
    }

    public final boolean n0() {
        if (!this.R && (this.e instanceof Activity)) {
            PackageManager packageManager = this.f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f, this.e.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & Barcode.UPC_A) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    @Override // defpackage.b0
    public void o() {
        LayoutInflater from = LayoutInflater.from(this.f);
        if (from.getFactory() == null) {
            kb.b(from, this);
        } else if (from.getFactory2() instanceof AppCompatDelegateImpl) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean o0() {
        return this.u;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return T(view, str, context, attributeSet);
    }

    @Override // defpackage.b0
    public void p() {
        v n2 = n();
        if (n2 == null || !n2.l()) {
            m0(0);
        }
    }

    public int p0(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return e0(context).c();
                    }
                    return -1;
                } else if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return d0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // defpackage.b0
    public void q(Configuration configuration) {
        v n2;
        if (this.B && this.v && (n2 = n()) != null) {
            n2.m(configuration);
        }
        c2.b().g(this.f);
        I(false);
    }

    public boolean q0() {
        u0 u0Var = this.p;
        if (u0Var != null) {
            u0Var.c();
            return true;
        }
        v n2 = n();
        return n2 != null && n2.h();
    }

    @Override // defpackage.b0
    public void r(Bundle bundle) {
        this.K = true;
        I(false);
        Z();
        Object obj = this.e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = k8.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                v A0 = A0();
                if (A0 == null) {
                    this.X = true;
                } else {
                    A0.r(true);
                }
            }
            b0.c(this);
        }
        this.L = true;
    }

    public boolean r0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.J = (keyEvent.getFlags() & Barcode.ITF) != 0;
        } else if (i2 == 82) {
            s0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // defpackage.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            defpackage.b0.y(r3)
        L9:
            boolean r0 = r3.U
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.g
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.W
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.M = r0
            r0 = 1
            r3.N = r0
            int r0 = r3.O
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            u4<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.c0
            java.lang.Object r1 = r3.e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            u4<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.c0
            java.lang.Object r1 = r3.e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            v r0 = r3.j
            if (r0 == 0) goto L5e
            r0.n()
        L5e:
            r3.O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.s():void");
    }

    public final boolean s0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState f02 = f0(i2, true);
            if (f02.o) {
                return false;
            }
            return C0(f02, keyEvent);
        }
        return false;
    }

    @Override // defpackage.b0
    public void t(Bundle bundle) {
        Y();
    }

    public boolean t0(int i2, KeyEvent keyEvent) {
        v n2 = n();
        if (n2 == null || !n2.o(i2, keyEvent)) {
            PanelFeatureState panelFeatureState = this.I;
            if (panelFeatureState != null && B0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
                PanelFeatureState panelFeatureState2 = this.I;
                if (panelFeatureState2 != null) {
                    panelFeatureState2.n = true;
                }
                return true;
            }
            if (this.I == null) {
                PanelFeatureState f02 = f0(0, true);
                C0(f02, keyEvent);
                boolean B0 = B0(f02, keyEvent.getKeyCode(), keyEvent, 1);
                f02.m = false;
                if (B0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.b0
    public void u() {
        v n2 = n();
        if (n2 != null) {
            n2.w(true);
        }
    }

    public boolean u0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.J;
            this.J = false;
            PanelFeatureState f02 = f0(0, false);
            if (f02 != null && f02.o) {
                if (!z) {
                    Q(f02, true);
                }
                return true;
            } else if (q0()) {
                return true;
            }
        } else if (i2 == 82) {
            v0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // defpackage.b0
    public void v(Bundle bundle) {
    }

    public final boolean v0(int i2, KeyEvent keyEvent) {
        boolean z;
        t2 t2Var;
        if (this.p != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState f02 = f0(i2, true);
        if (i2 == 0 && (t2Var = this.m) != null && t2Var.g() && !ViewConfiguration.get(this.f).hasPermanentMenuKey()) {
            if (!this.m.b()) {
                if (!this.N && C0(f02, keyEvent)) {
                    z2 = this.m.f();
                }
                z2 = false;
            } else {
                z2 = this.m.e();
            }
        } else {
            boolean z3 = f02.o;
            if (!z3 && !f02.n) {
                if (f02.m) {
                    if (f02.r) {
                        f02.m = false;
                        z = C0(f02, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        z0(f02, keyEvent);
                    }
                }
                z2 = false;
            } else {
                Q(f02, true);
                z2 = z3;
            }
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    @Override // defpackage.b0
    public void w() {
        this.M = true;
        H();
    }

    public void w0(int i2) {
        v n2;
        if (i2 != 108 || (n2 = n()) == null) {
            return;
        }
        n2.i(true);
    }

    @Override // defpackage.b0
    public void x() {
        this.M = false;
        v n2 = n();
        if (n2 != null) {
            n2.w(false);
        }
    }

    public void x0(int i2) {
        if (i2 == 108) {
            v n2 = n();
            if (n2 != null) {
                n2.i(false);
            }
        } else if (i2 == 0) {
            PanelFeatureState f02 = f0(i2, true);
            if (f02.o) {
                Q(f02, false);
            }
        }
    }

    public void y0(ViewGroup viewGroup) {
    }

    public final void z0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.o || this.N) {
            return;
        }
        if (panelFeatureState.a == 0) {
            if ((this.f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback h02 = h0();
        if (h02 != null && !h02.onMenuOpened(panelFeatureState.a, panelFeatureState.j)) {
            Q(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager != null && C0(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.g;
            if (viewGroup != null && !panelFeatureState.q) {
                View view = panelFeatureState.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    panelFeatureState.n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
                    layoutParams2.gravity = panelFeatureState.c;
                    layoutParams2.windowAnimations = panelFeatureState.f;
                    windowManager.addView(panelFeatureState.g, layoutParams2);
                    panelFeatureState.o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!k0(panelFeatureState) || panelFeatureState.g == null) {
                        return;
                    }
                } else if (panelFeatureState.q && viewGroup.getChildCount() > 0) {
                    panelFeatureState.g.removeAllViews();
                }
                if (j0(panelFeatureState) && panelFeatureState.b()) {
                    ViewGroup.LayoutParams layoutParams3 = panelFeatureState.h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    panelFeatureState.g.setBackgroundResource(panelFeatureState.b);
                    ViewParent parent = panelFeatureState.h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(panelFeatureState.h);
                    }
                    panelFeatureState.g.addView(panelFeatureState.h, layoutParams3);
                    if (!panelFeatureState.h.hasFocus()) {
                        panelFeatureState.h.requestFocus();
                    }
                } else {
                    panelFeatureState.q = true;
                    return;
                }
            }
            i2 = -2;
            panelFeatureState.n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
            layoutParams22.gravity = panelFeatureState.c;
            layoutParams22.windowAnimations = panelFeatureState.f;
            windowManager.addView(panelFeatureState.g, layoutParams22);
            panelFeatureState.o = true;
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, a0 a0Var) {
        this(dialog.getContext(), dialog.getWindow(), a0Var, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, a0 a0Var, Object obj) {
        u4<String, Integer> u4Var;
        Integer num;
        z K0;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f = context;
        this.i = a0Var;
        this.e = obj;
        if ((obj instanceof Dialog) && (K0 = K0()) != null) {
            this.O = K0.L().l();
        }
        if (this.O == -100 && (num = (u4Var = c0).get(obj.getClass().getName())) != null) {
            this.O = num.intValue();
            u4Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            K(window);
        }
        c2.h();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class o extends b1 {
        public o(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode b(ActionMode.Callback callback) {
            y0.a aVar = new y0.a(AppCompatDelegateImpl.this.f, callback);
            u0 H0 = AppCompatDelegateImpl.this.H0(aVar);
            if (H0 != null) {
                return aVar.e(H0);
            }
            return null;
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.t0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof i1)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.w0(i);
            return true;
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.x0(i);
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            i1 i1Var = menu instanceof i1 ? (i1) menu : null;
            if (i == 0 && i1Var == null) {
                return false;
            }
            if (i1Var != null) {
                i1Var.e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (i1Var != null) {
                i1Var.e0(false);
            }
            return onPreparePanel;
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            i1 i1Var;
            PanelFeatureState f0 = AppCompatDelegateImpl.this.f0(0, true);
            if (f0 != null && (i1Var = f0.j) != null) {
                super.onProvideKeyboardShortcuts(list, i1Var, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.o0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // defpackage.b1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (AppCompatDelegateImpl.this.o0() && i == 0) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }
}
