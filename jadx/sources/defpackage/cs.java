package defpackage;

import android.content.Context;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: cs  reason: default package */
/* loaded from: classes.dex */
public final class cs implements hr<bt> {
    public final wh0<Context> a;
    public final wh0<lu> b;
    public final wh0<ws> c;
    public final wh0<zu> d;

    public cs(wh0<Context> wh0Var, wh0<lu> wh0Var2, wh0<ws> wh0Var3, wh0<zu> wh0Var4) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
        this.d = wh0Var4;
    }

    public static cs a(wh0<Context> wh0Var, wh0<lu> wh0Var2, wh0<ws> wh0Var3, wh0<zu> wh0Var4) {
        return new cs(wh0Var, wh0Var2, wh0Var3, wh0Var4);
    }

    public static bt c(Context context, lu luVar, ws wsVar, zu zuVar) {
        bt a = bs.a(context, luVar, wsVar, zuVar);
        jr.c(a, C0059ao.a(3320));
        return a;
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public bt get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
