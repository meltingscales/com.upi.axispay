package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppMeasurementEventLogger implements EventLogger {
    private static final String ANALYTIC_CLASS = null;
    private static final String GET_INSTANCE_METHOD = null;
    private static final String LOG_METHOD = null;
    private final Object logEventInstance;
    private final Method logEventMethod;

    static {
        C0059ao.a(AppMeasurementEventLogger.class, 270);
    }

    public AppMeasurementEventLogger(Object obj, Method method) {
        this.logEventInstance = obj;
        this.logEventMethod = method;
    }

    private static Class getClass(Context context) {
        try {
            return context.getClassLoader().loadClass(C0059ao.a(9447));
        } catch (Exception unused) {
            return null;
        }
    }

    public static EventLogger getEventLogger(Context context) {
        Object appMeasurementEventLogger;
        Method logEventMethod;
        Class cls = getClass(context);
        if (cls == null || (appMeasurementEventLogger = getInstance(context, cls)) == null || (logEventMethod = getLogEventMethod(context, cls)) == null) {
            return null;
        }
        return new AppMeasurementEventLogger(appMeasurementEventLogger, logEventMethod);
    }

    private static Object getInstance(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod(C0059ao.a(9448), Context.class).invoke(cls, context);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method getLogEventMethod(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod(C0059ao.a(9449), String.class, String.class, Bundle.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.crashlytics.android.answers.EventLogger
    public void logEvent(String str, Bundle bundle) {
        logEvent(C0059ao.a(9450), str, bundle);
    }

    @Override // com.crashlytics.android.answers.EventLogger
    public void logEvent(String str, String str2, Bundle bundle) {
        try {
            this.logEventMethod.invoke(this.logEventInstance, str, str2, bundle);
        } catch (Exception unused) {
        }
    }
}
