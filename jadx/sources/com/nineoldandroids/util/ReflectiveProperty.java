package com.nineoldandroids.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ReflectiveProperty<T, V> extends Property<T, V> {
    private static final String PREFIX_GET = null;
    private static final String PREFIX_IS = null;
    private static final String PREFIX_SET = null;
    private Field mField;
    private Method mGetter;
    private Method mSetter;

    static {
        C0059ao.a(ReflectiveProperty.class, 379);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectiveProperty(Class<T> cls, Class<V> cls2, String str) {
        super(cls2, str);
        String a = C0059ao.a(13003);
        String a2 = C0059ao.a(13004);
        String a3 = C0059ao.a(13005);
        String a4 = C0059ao.a(13006);
        String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        String str3 = C0059ao.a(13007) + str2;
        try {
            try {
                this.mGetter = cls.getMethod(str3, null);
            } catch (NoSuchMethodException unused) {
                String str4 = C0059ao.a(13008) + str2;
                try {
                    try {
                        try {
                            this.mGetter = cls.getMethod(str4, null);
                        } catch (NoSuchMethodException unused2) {
                            Method declaredMethod = cls.getDeclaredMethod(str4, null);
                            this.mGetter = declaredMethod;
                            declaredMethod.setAccessible(true);
                        }
                    } catch (NoSuchFieldException unused3) {
                        throw new NoSuchPropertyException(C0059ao.a(13010) + str);
                    }
                } catch (NoSuchMethodException unused4) {
                    Field field = cls.getField(str);
                    this.mField = field;
                    Class<?> type = field.getType();
                    if (typesMatch(cls2, type)) {
                        return;
                    }
                    throw new NoSuchPropertyException(a4 + type + a3 + a2 + cls2 + a);
                }
            }
        } catch (NoSuchMethodException unused5) {
            Method declaredMethod2 = cls.getDeclaredMethod(str3, null);
            this.mGetter = declaredMethod2;
            declaredMethod2.setAccessible(true);
        }
        Class<?> returnType = this.mGetter.getReturnType();
        if (typesMatch(cls2, returnType)) {
            try {
                Method declaredMethod3 = cls.getDeclaredMethod(C0059ao.a(13009) + str2, returnType);
                this.mSetter = declaredMethod3;
                declaredMethod3.setAccessible(true);
                return;
            } catch (NoSuchMethodException unused6) {
                return;
            }
        }
        throw new NoSuchPropertyException(a4 + returnType + a3 + a2 + cls2 + a);
    }

    private boolean typesMatch(Class<V> cls, Class cls2) {
        if (cls2 != cls) {
            if (cls2.isPrimitive()) {
                if (cls2 == Float.TYPE && cls == Float.class) {
                    return true;
                }
                if (cls2 == Integer.TYPE && cls == Integer.class) {
                    return true;
                }
                if (cls2 == Boolean.TYPE && cls == Boolean.class) {
                    return true;
                }
                if (cls2 == Long.TYPE && cls == Long.class) {
                    return true;
                }
                if (cls2 == Double.TYPE && cls == Double.class) {
                    return true;
                }
                if (cls2 == Short.TYPE && cls == Short.class) {
                    return true;
                }
                if (cls2 == Byte.TYPE && cls == Byte.class) {
                    return true;
                }
                return cls2 == Character.TYPE && cls == Character.class;
            }
            return false;
        }
        return true;
    }

    @Override // com.nineoldandroids.util.Property
    public V get(T t) {
        Method method = this.mGetter;
        if (method != null) {
            try {
                return (V) method.invoke(t, null);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        Field field = this.mField;
        if (field != null) {
            try {
                return (V) field.get(t);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        throw new AssertionError();
    }

    @Override // com.nineoldandroids.util.Property
    public boolean isReadOnly() {
        return this.mSetter == null && this.mField == null;
    }

    @Override // com.nineoldandroids.util.Property
    public void set(T t, V v) {
        Method method = this.mSetter;
        if (method != null) {
            try {
                method.invoke(t, v);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        Field field = this.mField;
        if (field != null) {
            try {
                field.set(t, v);
                return;
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        throw new UnsupportedOperationException(C0059ao.a(13011) + getName() + C0059ao.a(13012));
    }
}
