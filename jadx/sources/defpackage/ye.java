package defpackage;

import defpackage.bf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ye  reason: default package */
/* loaded from: classes.dex */
public final class ye {
    public static ye c = new ye();
    public final Map<Class<?>, a> a = new HashMap();
    public final Map<Class<?>, Boolean> b = new HashMap();

    /* compiled from: AxisPay */
    /* renamed from: ye$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Map<bf.b, List<b>> a = new HashMap();
        public final Map<b, bf.b> b;

        public a(Map<b, bf.b> map) {
            this.b = map;
            for (Map.Entry<b, bf.b> entry : map.entrySet()) {
                bf.b value = entry.getValue();
                List<b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void b(List<b> list, ef efVar, bf.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(efVar, bVar, obj);
                }
            }
        }

        public void a(ef efVar, bf.b bVar, Object obj) {
            b(this.a.get(bVar), efVar, bVar, obj);
            b(this.a.get(bf.b.ON_ANY), efVar, bVar, obj);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ye$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final Method b;

        public b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public void a(ef efVar, bf.b bVar, Object obj) {
            try {
                int i = this.a;
                if (i == 0) {
                    this.b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.b.invoke(obj, efVar);
                } else if (i != 2) {
                } else {
                    this.b.invoke(obj, efVar, bVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(C0059ao.a(12442), e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i;
        a c2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c2 = c(superclass)) != null) {
            hashMap.putAll(c2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, bf.b> entry : c(cls2).b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            lf lfVar = (lf) method.getAnnotation(lf.class);
            if (lfVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(ef.class)) {
                    throw new IllegalArgumentException(C0059ao.a(7724));
                } else {
                    i = 1;
                }
                bf.b value = lfVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(bf.b.class)) {
                        if (value != bf.b.ON_ANY) {
                            throw new IllegalArgumentException(C0059ao.a(7725));
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException(C0059ao.a(7726));
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException(C0059ao.a(7727));
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException(C0059ao.a(7728), e);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method method : b2) {
            if (((lf) method.getAnnotation(lf.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, bf.b> map, b bVar, bf.b bVar2, Class<?> cls) {
        bf.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        Method method = bVar.b;
        throw new IllegalArgumentException(C0059ao.a(7729) + method.getName() + C0059ao.a(7730) + cls.getName() + C0059ao.a(7731) + bVar3 + C0059ao.a(7732) + bVar2);
    }
}
