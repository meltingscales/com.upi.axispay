package org.apache.xml.security.utils;

import java.util.Enumeration;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class ClassLoaderUtils {
    public static Class a;

    /* compiled from: AxisPay */
    /* renamed from: org.apache.xml.security.utils.ClassLoaderUtils$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Enumeration {
        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return null;
        }
    }

    private ClassLoaderUtils() {
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static Class a(String str, Class cls) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException unused) {
        }
        return b(str, cls);
    }

    private static Class b(String str, Class cls) {
        Class cls2;
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            try {
                Class cls3 = a;
                String a2 = C0059ao.a(4772);
                if (cls3 == null) {
                    cls2 = a(a2);
                    a = cls2;
                } else {
                    cls2 = a;
                }
                if (cls2.getClassLoader() != null) {
                    Class cls4 = a;
                    if (cls4 == null) {
                        cls4 = a(a2);
                        a = cls4;
                    }
                    return cls4.getClassLoader().loadClass(str);
                }
            } catch (ClassNotFoundException unused) {
                if (cls != null && cls.getClassLoader() != null) {
                    return cls.getClassLoader().loadClass(str);
                }
            }
            throw e;
        }
    }
}
