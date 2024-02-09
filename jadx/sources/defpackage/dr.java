package defpackage;

import android.content.Context;

/* compiled from: AxisPay */
/* renamed from: dr  reason: default package */
/* loaded from: classes.dex */
public final class dr implements hr<cr> {
    public final wh0<Context> a;
    public final wh0<ar> b;

    public dr(wh0<Context> wh0Var, wh0<ar> wh0Var2) {
        this.a = wh0Var;
        this.b = wh0Var2;
    }

    public static dr a(wh0<Context> wh0Var, wh0<ar> wh0Var2) {
        return new dr(wh0Var, wh0Var2);
    }

    public static cr c(Context context, Object obj) {
        return new cr(context, (ar) obj);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public cr get() {
        return c(this.a.get(), this.b.get());
    }
}
