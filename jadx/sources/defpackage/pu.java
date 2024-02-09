package defpackage;

import android.content.Context;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pu  reason: default package */
/* loaded from: classes.dex */
public final class pu implements hr<String> {
    public final wh0<Context> a;

    public pu(wh0<Context> wh0Var) {
        this.a = wh0Var;
    }

    public static pu a(wh0<Context> wh0Var) {
        return new pu(wh0Var);
    }

    public static String c(Context context) {
        String b = nu.b(context);
        jr.c(b, C0059ao.a(15729));
        return b;
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public String get() {
        return c(this.a.get());
    }
}
