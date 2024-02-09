package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lm0  reason: default package */
/* loaded from: classes.dex */
public class lm0 {
    public wm0 a(Class cls) {
        return new tl0(cls);
    }

    public xm0 b(Class cls, String str) {
        return new dm0(cls, str);
    }

    public zm0 c(am0 am0Var) {
        return am0Var;
    }

    public cn0 d(em0 em0Var) {
        return em0Var;
    }

    public String e(wl0 wl0Var) {
        String obj = wl0Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(C0059ao.a(13758)) ? obj.substring(21) : obj;
    }

    public String f(zl0 zl0Var) {
        return e(zl0Var);
    }
}
