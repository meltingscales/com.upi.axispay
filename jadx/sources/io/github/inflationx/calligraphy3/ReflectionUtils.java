package io.github.inflationx.calligraphy3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ReflectionUtils {
    private static final String TAG = null;

    static {
        C0059ao.a(ReflectionUtils.class, 261);
    }

    public static Method getMethod(Class cls, String str) {
        Method[] methods;
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static void invokeMethod(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
