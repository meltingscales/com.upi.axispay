package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.savedstate.SavedStateRegistry;
import defpackage.bf;
import defpackage.i;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ComponentActivity extends j8 implements ef, sf, tl, defpackage.c, h {
    public rf f;
    public int h;
    public final ActivityResultRegistry i;
    public final defpackage.d c = new defpackage.d();
    public final ff d = new ff(this);
    public final sl e = sl.a(this);
    public final OnBackPressedDispatcher g = new OnBackPressedDispatcher(new a());

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ int b;
            public final /* synthetic */ i.a c;

            public a(int i, i.a aVar) {
                this.b = i;
                this.c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.b, this.c.a());
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0000b implements Runnable {
            public final /* synthetic */ int b;
            public final /* synthetic */ IntentSender.SendIntentException c;

            public RunnableC0000b(int i, IntentSender.SendIntentException sendIntentException) {
                this.b = i;
                this.c = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.c));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i, i<I, O> iVar, I i2, f8 f8Var) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            i.a<O> b = iVar.b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, b));
                return;
            }
            Intent a2 = iVar.a(componentActivity, i2);
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else if (f8Var != null) {
                f8Var.a();
                throw null;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                d8.o(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    d8.r(componentActivity, intentSenderRequest.e(), i, intentSenderRequest.a(), intentSenderRequest.c(), intentSenderRequest.d(), 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0000b(i, e));
                }
            } else {
                d8.q(componentActivity, a2, i, bundle);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements SavedStateRegistry.b {
        public c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.i.h(bundle);
            return bundle;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements defpackage.e {
        public d() {
        }

        @Override // defpackage.e
        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle a = ComponentActivity.this.getSavedStateRegistry().a("android:support:activity-result");
            if (a != null) {
                ComponentActivity.this.i.g(a);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class e {
        public Object a;
        public rf b;
    }

    public ComponentActivity() {
        new AtomicInteger();
        this.i = new b();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                getLifecycle().a(new cf() { // from class: androidx.activity.ComponentActivity.3
                    @Override // defpackage.cf
                    public void d(ef efVar, bf.b bVar) {
                        if (bVar == bf.b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new cf() { // from class: androidx.activity.ComponentActivity.4
                @Override // defpackage.cf
                public void d(ef efVar, bf.b bVar) {
                    if (bVar == bf.b.ON_DESTROY) {
                        ComponentActivity.this.c.b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            getLifecycle().a(new cf() { // from class: androidx.activity.ComponentActivity.5
                @Override // defpackage.cf
                public void d(ef efVar, bf.b bVar) {
                    ComponentActivity.this.z();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            if (19 <= i && i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().d("android:support:activity-result", new c());
            y(new d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public final void A() {
        tf.a(getWindow().getDecorView(), this);
        uf.a(getWindow().getDecorView(), this);
        ul.a(getWindow().getDecorView(), this);
    }

    @Deprecated
    public Object B() {
        return null;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        A();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.c
    public final OnBackPressedDispatcher c() {
        return this.g;
    }

    @Override // defpackage.ef
    public bf getLifecycle() {
        return this.d;
    }

    @Override // defpackage.tl
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.e.b();
    }

    @Override // defpackage.sf
    public rf getViewModelStore() {
        if (getApplication() != null) {
            z();
            return this.f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.i.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.g.c();
    }

    @Override // defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e.c(bundle);
        this.c.c(this);
        super.onCreate(bundle);
        mf.f(this);
        int i = this.h;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.i.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object B = B();
        rf rfVar = this.f;
        if (rfVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            rfVar = eVar.b;
        }
        if (rfVar == null && B == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.a = B;
        eVar2.b = rfVar;
        return eVar2;
    }

    @Override // defpackage.j8, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bf lifecycle = getLifecycle();
        if (lifecycle instanceof ff) {
            ((ff) lifecycle).o(bf.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.e.d(bundle);
    }

    @Override // defpackage.h
    public final ActivityResultRegistry p() {
        return this.i;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (nm.d()) {
                nm.a("reportFullyDrawn() for " + getComponentName());
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19) {
                super.reportFullyDrawn();
            } else if (i == 19 && t8.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            nm.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        A();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void y(defpackage.e eVar) {
        this.c.a(eVar);
    }

    public void z() {
        if (this.f == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f = eVar.b;
            }
            if (this.f == null) {
                this.f = new rf();
            }
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        A();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        A();
        super.setContentView(view, layoutParams);
    }
}
