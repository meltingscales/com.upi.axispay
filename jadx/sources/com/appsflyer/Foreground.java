package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Foreground {
    public static long CHECK_DELAY;
    public static Listener listener;

    /* compiled from: AxisPay */
    /* renamed from: com.appsflyer.Foreground$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass5 implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ı  reason: contains not printable characters */
        public boolean f154;

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Listener f156;

        /* renamed from: ι  reason: contains not printable characters */
        public boolean f157 = true;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Executor f155 = Executors.newSingleThreadExecutor();

        public AnonymousClass5(Listener listener) {
            this.f156 = listener;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.f155.execute(new Runnable() { // from class: com.appsflyer.Foreground.5.4
                @Override // java.lang.Runnable
                public final void run() {
                    AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.f155.execute(new Runnable() { // from class: com.appsflyer.Foreground.5.3
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass5.this.f157 = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.Foreground.5.3.4
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                if (anonymousClass5.f154 && anonymousClass5.f157) {
                                    anonymousClass5.f154 = false;
                                    try {
                                        anonymousClass5.f156.onBecameBackground(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.afErrorLog(C0059ao.a(615), e);
                                    }
                                }
                            }
                        }, Foreground.CHECK_DELAY);
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(C0059ao.a(4323), th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.f155.execute(new Runnable() { // from class: com.appsflyer.Foreground.5.5
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    if (!anonymousClass5.f154) {
                        try {
                            anonymousClass5.f156.onBecameForeground(activity);
                        } catch (Exception e) {
                            AFLogger.afErrorLog(C0059ao.a(4340), e);
                        }
                    }
                    AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                    anonymousClass52.f157 = false;
                    anonymousClass52.f154 = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface Listener {
        void onBecameBackground(Context context);

        void onBecameForeground(Activity activity);
    }

    static {
        C0059ao.a(Foreground.class, 365);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m131(Context context, Listener listener2) {
        listener = listener2;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(listener2);
        if (context instanceof Activity) {
            anonymousClass5.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass5);
    }
}
