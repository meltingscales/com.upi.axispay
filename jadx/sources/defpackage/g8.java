package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: g8  reason: default package */
/* loaded from: classes.dex */
public final class g8 {
    public static final Class<?> a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: AxisPay */
    /* renamed from: g8$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ d b;
        public final /* synthetic */ Object c;

        public a(d dVar, Object obj) {
            this.b = dVar;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.b = this.c;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g8$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Application b;
        public final /* synthetic */ d c;

        public b(Application application, d dVar) {
            this.b = application;
            this.c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g8$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public c(Object obj, Object obj2) {
            this.b = obj;
            this.c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = g8.d;
                if (method != null) {
                    method.invoke(this.b, this.c, Boolean.FALSE, C0059ao.a(2753));
                } else {
                    g8.e.invoke(this.b, this.c, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith(C0059ao.a(2756))) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e(C0059ao.a(2754), C0059ao.a(2755), th);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g8$d */
    /* loaded from: classes.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public Object b;
        public Activity c;
        public final int d;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;

        public d(Activity activity) {
            this.c = activity;
            this.d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.c == activity) {
                this.c = null;
                this.f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f || this.g || this.e || !g8.h(this.b, this.d, activity)) {
                return;
            }
            this.g = true;
            this.b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.c == activity) {
                this.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a2 = a();
        a = a2;
        b = b();
        c = f();
        d = d(a2);
        e = c(a2);
        f = e(a2);
    }

    public static Class<?> a() {
        try {
            return Class.forName(C0059ao.a(5315));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField(C0059ao.a(5316));
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(C0059ao.a(5317), IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(C0059ao.a(5318), IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                String a2 = C0059ao.a(5319);
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod(a2, IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField(C0059ao.a(5320));
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                g.postAtFrontOfQueue(new c(b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(C0059ao.a(5321), C0059ao.a(5322), th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
