package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import defpackage.bf;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mf  reason: default package */
/* loaded from: classes.dex */
public class mf extends Fragment {
    public a b;

    /* compiled from: AxisPay */
    /* renamed from: mf$a */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onResume();

        void onStart();
    }

    /* compiled from: AxisPay */
    /* renamed from: mf$b */
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            mf.a(activity, bf.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            mf.a(activity, bf.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            mf.a(activity, bf.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            mf.a(activity, bf.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            mf.a(activity, bf.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            mf.a(activity, bf.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, bf.b bVar) {
        if (activity instanceof gf) {
            ((gf) activity).getLifecycle().h(bVar);
        } else if (activity instanceof ef) {
            bf lifecycle = ((ef) activity).getLifecycle();
            if (lifecycle instanceof ff) {
                ((ff) lifecycle).h(bVar);
            }
        }
    }

    public static void f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        String a2 = C0059ao.a(12883);
        if (fragmentManager.findFragmentByTag(a2) == null) {
            fragmentManager.beginTransaction().add(new mf(), a2).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(bf.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    public final void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.b);
        b(bf.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(bf.b.ON_DESTROY);
        this.b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(bf.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.b);
        b(bf.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.b);
        b(bf.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(bf.b.ON_STOP);
    }
}
