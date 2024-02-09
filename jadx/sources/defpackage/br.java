package defpackage;

import android.content.Context;

/* compiled from: AxisPay */
/* renamed from: br  reason: default package */
/* loaded from: classes.dex */
public final class br implements hr<ar> {
    public final wh0<Context> a;
    public final wh0<zu> b;
    public final wh0<zu> c;

    public br(wh0<Context> wh0Var, wh0<zu> wh0Var2, wh0<zu> wh0Var3) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
    }

    public static br a(wh0<Context> wh0Var, wh0<zu> wh0Var2, wh0<zu> wh0Var3) {
        return new br(wh0Var, wh0Var2, wh0Var3);
    }

    public static ar c(Context context, zu zuVar, zu zuVar2) {
        return new ar(context, zuVar, zuVar2);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public ar get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
