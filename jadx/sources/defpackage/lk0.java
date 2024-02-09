package defpackage;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lk0  reason: default package */
/* loaded from: classes.dex */
public final class lk0 {
    public static final kk0 a;

    static {
        kk0 kk0Var;
        int a2 = a();
        String a3 = C0059ao.a(12152);
        String a4 = C0059ao.a(12153);
        String a5 = C0059ao.a(12154);
        String a6 = C0059ao.a(12155);
        if (a2 >= 65544) {
            try {
                Object newInstance = Class.forName(C0059ao.a(12156)).newInstance();
                yl0.d(newInstance, a6);
                try {
                    try {
                        kk0Var = (kk0) newInstance;
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = kk0.class.getClassLoader();
                        Throwable initCause = new ClassCastException(a5 + classLoader + a4 + classLoader2).initCause(e);
                        yl0.d(initCause, a3);
                        throw initCause;
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance2 = Class.forName(C0059ao.a(12157)).newInstance();
                yl0.d(newInstance2, a6);
                try {
                    kk0Var = (kk0) newInstance2;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = kk0.class.getClassLoader();
                    Throwable initCause2 = new ClassCastException(a5 + classLoader3 + a4 + classLoader4).initCause(e2);
                    yl0.d(initCause2, a3);
                    throw initCause2;
                }
            }
            a = kk0Var;
        }
        if (a2 >= 65543) {
            try {
                Object newInstance3 = Class.forName(C0059ao.a(12158)).newInstance();
                yl0.d(newInstance3, a6);
                try {
                    try {
                        kk0Var = (kk0) newInstance3;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                        ClassLoader classLoader6 = kk0.class.getClassLoader();
                        Throwable initCause3 = new ClassCastException(a5 + classLoader5 + a4 + classLoader6).initCause(e3);
                        yl0.d(initCause3, a3);
                        throw initCause3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName(C0059ao.a(12159)).newInstance();
                yl0.d(newInstance4, a6);
                try {
                    kk0Var = (kk0) newInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = kk0.class.getClassLoader();
                    Throwable initCause4 = new ClassCastException(a5 + classLoader7 + a4 + classLoader8).initCause(e4);
                    yl0.d(initCause4, a3);
                    throw initCause4;
                }
            }
            a = kk0Var;
        }
        kk0Var = new kk0();
        a = kk0Var;
    }

    public static final int a() {
        String property = System.getProperty(C0059ao.a(12160));
        if (property == null) {
            return 65542;
        }
        int L = co0.L(property, '.', 0, false, 6, null);
        if (L < 0) {
            try {
                return Integer.parseInt(property) * LogFileManager.MAX_LOG_SIZE;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i = L + 1;
        int L2 = co0.L(property, '.', i, false, 4, null);
        if (L2 < 0) {
            L2 = property.length();
        }
        String substring = property.substring(0, L);
        String a2 = C0059ao.a(12161);
        yl0.d(substring, a2);
        String substring2 = property.substring(i, L2);
        yl0.d(substring2, a2);
        try {
            return (Integer.parseInt(substring) * LogFileManager.MAX_LOG_SIZE) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
