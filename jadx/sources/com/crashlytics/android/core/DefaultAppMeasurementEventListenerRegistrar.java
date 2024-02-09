package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DefaultAppMeasurementEventListenerRegistrar implements AppMeasurementEventListenerRegistrar {
    private static final String ANALYTIC_CLASS = null;
    private static final String ANALYTIC_CLASS_ON_EVENT_LISTENER = null;
    private static final String CRASH_ORIGIN = null;
    private static final String GET_INSTANCE_METHOD = null;
    private static final String NAME = null;
    private static final String PARAMETERS = null;
    private static final String REGISTER_METHOD = null;
    private final CrashlyticsCore crashlyticsCore;

    static {
        C0059ao.a(DefaultAppMeasurementEventListenerRegistrar.class, 146);
    }

    private DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore crashlyticsCore) {
        this.crashlyticsCore = crashlyticsCore;
    }

    private Class<?> getClass(String str) {
        try {
            return this.crashlyticsCore.getContext().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object getInstance(Class<?> cls) {
        try {
            return cls.getDeclaredMethod(C0059ao.a(7576), Context.class).invoke(cls, this.crashlyticsCore.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    public static AppMeasurementEventListenerRegistrar instanceFrom(CrashlyticsCore crashlyticsCore) {
        return new DefaultAppMeasurementEventListenerRegistrar(crashlyticsCore);
    }

    private boolean invoke(Class<?> cls, Object obj, String str) {
        String a = C0059ao.a(7577);
        Class<?> cls2 = getClass(C0059ao.a(7578));
        try {
            cls.getDeclaredMethod(str, cls2).invoke(obj, onEventListenerProxy(cls2));
            return true;
        } catch (IllegalAccessException e) {
            Logger logger = Fabric.getLogger();
            logger.w(a, C0059ao.a(7579) + str, e);
            return false;
        } catch (NoSuchMethodException e2) {
            Logger logger2 = Fabric.getLogger();
            logger2.w(a, C0059ao.a(7581) + str, e2);
            return false;
        } catch (InvocationTargetException e3) {
            Logger logger3 = Fabric.getLogger();
            logger3.w(a, C0059ao.a(7580) + str, e3);
            return false;
        }
    }

    private Object onEventListenerProxy(Class cls) {
        return Proxy.newProxyInstance(this.crashlyticsCore.getContext().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (objArr.length == 4) {
                    String str = (String) objArr[0];
                    String str2 = (String) objArr[1];
                    Bundle bundle = (Bundle) objArr[2];
                    if (str == null || str.equals(C0059ao.a(12966))) {
                        return null;
                    }
                    DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(DefaultAppMeasurementEventListenerRegistrar.this.crashlyticsCore, str2, bundle);
                    return null;
                }
                throw new RuntimeException(C0059ao.a(12967));
            }
        });
    }

    private static String serializeEvent(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(C0059ao.a(7582), str);
        jSONObject.put(C0059ao.a(7583), jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeEventToUserLog(CrashlyticsCore crashlyticsCore, String str, Bundle bundle) {
        try {
            crashlyticsCore.log(C0059ao.a(7584) + serializeEvent(str, bundle));
        } catch (JSONException unused) {
            Logger logger = Fabric.getLogger();
            logger.w(C0059ao.a(7586), C0059ao.a(7585) + str);
        }
    }

    @Override // com.crashlytics.android.core.AppMeasurementEventListenerRegistrar
    public boolean register() {
        Class<?> cls = getClass(C0059ao.a(7587));
        String a = C0059ao.a(7588);
        if (cls == null) {
            Fabric.getLogger().w(a, C0059ao.a(7589));
            return false;
        }
        Object defaultAppMeasurementEventListenerRegistrar = getInstance(cls);
        if (defaultAppMeasurementEventListenerRegistrar == null) {
            Fabric.getLogger().w(a, C0059ao.a(7590));
            return false;
        }
        return invoke(cls, defaultAppMeasurementEventListenerRegistrar, C0059ao.a(7591));
    }
}
