package defpackage;

import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nm0  reason: default package */
/* loaded from: classes.dex */
public class nm0 {
    public static List a(Object obj) {
        if (obj instanceof om0) {
            e(obj, C0059ao.a(7625));
            throw null;
        }
        return b(obj);
    }

    public static List b(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            d(e);
            throw null;
        }
    }

    public static <T extends Throwable> T c(T t) {
        yl0.k(t, nm0.class.getName());
        return t;
    }

    public static ClassCastException d(ClassCastException classCastException) {
        c(classCastException);
        throw classCastException;
    }

    public static void e(Object obj, String str) {
        String a = obj == null ? C0059ao.a(7626) : obj.getClass().getName();
        f(a + C0059ao.a(7627) + str);
        throw null;
    }

    public static void f(String str) {
        d(new ClassCastException(str));
        throw null;
    }
}
