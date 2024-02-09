package defpackage;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hf  reason: default package */
/* loaded from: classes.dex */
public class hf {
    public static Map<Class<?>, Integer> a = new HashMap();
    public static Map<Class<?>, List<Constructor<? extends af>>> b = new HashMap();

    public static af a(Constructor<? extends af> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static Constructor<? extends af> b(Class<?> cls) {
        try {
            Package r1 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r1 != null ? r1.getName() : C0059ao.a(7774);
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = c(canonicalName);
            if (!name.isEmpty()) {
                c = name + C0059ao.a(7775) + c;
            }
            Constructor declaredConstructor = Class.forName(c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static String c(String str) {
        return str.replace(C0059ao.a(7776), C0059ao.a(7777)) + C0059ao.a(7778);
    }

    public static int d(Class<?> cls) {
        Integer num = a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        a.put(cls, Integer.valueOf(g));
        return g;
    }

    public static boolean e(Class<?> cls) {
        return cls != null && df.class.isAssignableFrom(cls);
    }

    public static cf f(Object obj) {
        boolean z = obj instanceof cf;
        boolean z2 = obj instanceof ze;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((ze) obj, (cf) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((ze) obj, null);
        }
        if (z) {
            return (cf) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) == 2) {
            List<Constructor<? extends af>> list = b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
            }
            af[] afVarArr = new af[list.size()];
            for (int i = 0; i < list.size(); i++) {
                afVarArr[i] = a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(afVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    public static int g(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends af> b2 = b(cls);
        if (b2 != null) {
            b.put(cls, Collections.singletonList(b2));
            return 2;
        } else if (ye.c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(b.get(cls2));
                }
            }
            if (arrayList != null) {
                b.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
