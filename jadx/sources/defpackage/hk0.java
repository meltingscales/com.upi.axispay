package defpackage;

import java.lang.reflect.Field;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hk0  reason: default package */
/* loaded from: classes.dex */
public final class hk0 {
    public static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException((C0059ao.a(6787) + i + C0059ao.a(6788) + i2 + C0059ao.a(6789)).toString());
    }

    public static final gk0 b(ck0 ck0Var) {
        return (gk0) ck0Var.getClass().getAnnotation(gk0.class);
    }

    public static final int c(ck0 ck0Var) {
        try {
            Field declaredField = ck0Var.getClass().getDeclaredField(C0059ao.a(6790));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(ck0Var);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num == null ? 0 : num.intValue()) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(ck0 ck0Var) {
        String b;
        String str;
        yl0.e(ck0Var, C0059ao.a(6791));
        gk0 b2 = b(ck0Var);
        if (b2 == null) {
            return null;
        }
        a(1, b2.v());
        int c = c(ck0Var);
        int i = c < 0 ? -1 : b2.l()[c];
        if (jk0.a.b(ck0Var) == null) {
            str = b2.c();
        } else {
            str = ((Object) b) + '/' + b2.c();
        }
        return new StackTraceElement(str, b2.m(), b2.f(), i);
    }
}
