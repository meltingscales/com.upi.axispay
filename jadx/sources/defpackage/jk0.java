package defpackage;

import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jk0  reason: default package */
/* loaded from: classes.dex */
public final class jk0 {
    public static final jk0 a = new jk0();
    public static final a b = new a(null, null, null);
    public static a c;

    /* compiled from: AxisPay */
    /* renamed from: jk0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public final a a(ck0 ck0Var) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod(C0059ao.a(1055), new Class[0]), ck0Var.getClass().getClassLoader().loadClass(C0059ao.a(1056)).getDeclaredMethod(C0059ao.a(1057), new Class[0]), ck0Var.getClass().getClassLoader().loadClass(C0059ao.a(1058)).getDeclaredMethod(C0059ao.a(1059), new Class[0]));
            c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = b;
            c = aVar2;
            return aVar2;
        }
    }

    public final String b(ck0 ck0Var) {
        yl0.e(ck0Var, C0059ao.a(1060));
        a aVar = c;
        if (aVar == null) {
            aVar = a(ck0Var);
        }
        if (aVar == b) {
            return null;
        }
        Method method = aVar.a;
        Object invoke = method == null ? null : method.invoke(ck0Var.getClass(), new Object[0]);
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.b;
        Object invoke2 = method2 == null ? null : method2.invoke(invoke, new Object[0]);
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.c;
        Object invoke3 = method3 == null ? null : method3.invoke(invoke2, new Object[0]);
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
