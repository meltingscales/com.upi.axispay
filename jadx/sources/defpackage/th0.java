package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: th0  reason: default package */
/* loaded from: classes.dex */
public final class th0 {
    public static final Method a(Class<?> cls, String str) {
        Method[] methods;
        yl0.f(cls, C0059ao.a(1100));
        yl0.f(str, C0059ao.a(1101));
        for (Method method : cls.getMethods()) {
            yl0.b(method, C0059ao.a(1102));
            if (yl0.a(method.getName(), str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static final void b(Method method, Object obj, Object... objArr) {
        yl0.f(obj, C0059ao.a(1103));
        yl0.f(objArr, C0059ao.a(1104));
        if (method == null) {
            return;
        }
        try {
            method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public static final void c(Field field, Object obj, Object obj2) {
        yl0.f(field, C0059ao.a(1105));
        yl0.f(obj, C0059ao.a(1106));
        yl0.f(obj2, C0059ao.a(1107));
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException unused) {
        }
    }
}
