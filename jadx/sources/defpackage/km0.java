package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: km0  reason: default package */
/* loaded from: classes.dex */
public class km0 {
    public static final lm0 a;
    public static final wm0[] b;

    static {
        lm0 lm0Var = null;
        try {
            lm0Var = (lm0) Class.forName(C0059ao.a(14562)).newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (lm0Var == null) {
            lm0Var = new lm0();
        }
        a = lm0Var;
        b = new wm0[0];
    }

    public static wm0 a(Class cls) {
        return a.a(cls);
    }

    public static xm0 b(Class cls) {
        return a.b(cls, C0059ao.a(14563));
    }

    public static zm0 c(am0 am0Var) {
        a.c(am0Var);
        return am0Var;
    }

    public static cn0 d(em0 em0Var) {
        a.d(em0Var);
        return em0Var;
    }

    public static String e(zl0 zl0Var) {
        return a.f(zl0Var);
    }
}
