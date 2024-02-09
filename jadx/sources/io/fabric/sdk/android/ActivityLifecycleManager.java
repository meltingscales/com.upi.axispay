package io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ActivityLifecycleManager {
    private final Application application;
    private ActivityLifecycleCallbacksWrapper callbacksWrapper;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class ActivityLifecycleCallbacksWrapper {
        private final Application application;
        private final Set<Application.ActivityLifecycleCallbacks> registeredCallbacks = new HashSet();

        public ActivityLifecycleCallbacksWrapper(Application application) {
            this.application = application;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(14)
        public void clearCallbacks() {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.registeredCallbacks) {
                this.application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(14)
        public boolean registerLifecycleCallbacks(final Callbacks callbacks) {
            if (this.application != null) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: io.fabric.sdk.android.ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        callbacks.onActivityCreated(activity, bundle);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        callbacks.onActivityDestroyed(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        callbacks.onActivityPaused(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        callbacks.onActivityResumed(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        callbacks.onActivitySaveInstanceState(activity, bundle);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        callbacks.onActivityStarted(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        callbacks.onActivityStopped(activity);
                    }
                };
                this.application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                this.registeredCallbacks.add(activityLifecycleCallbacks);
                return true;
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class Callbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public ActivityLifecycleManager(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.application = application;
        if (Build.VERSION.SDK_INT >= 14) {
            this.callbacksWrapper = new ActivityLifecycleCallbacksWrapper(application);
        }
    }

    public boolean registerCallbacks(Callbacks callbacks) {
        ActivityLifecycleCallbacksWrapper activityLifecycleCallbacksWrapper = this.callbacksWrapper;
        return activityLifecycleCallbacksWrapper != null && activityLifecycleCallbacksWrapper.registerLifecycleCallbacks(callbacks);
    }

    public void resetCallbacks() {
        ActivityLifecycleCallbacksWrapper activityLifecycleCallbacksWrapper = this.callbacksWrapper;
        if (activityLifecycleCallbacksWrapper != null) {
            activityLifecycleCallbacksWrapper.clearCallbacks();
        }
    }
}
