package myunmn;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class aS implements Application.ActivityLifecycleCallbacks {
    private long a;

    public aS() {
        a();
    }

    private native void a();

    private native void b();

    protected void finalize() {
        try {
            b();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                super.finalize();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityStopped(Activity activity);
}
