package defpackage;

import android.content.Context;

/* compiled from: AxisPay */
/* renamed from: wu  reason: default package */
/* loaded from: classes.dex */
public final class wu implements hr<vu> {
    public final wh0<Context> a;
    public final wh0<String> b;
    public final wh0<Integer> c;

    public wu(wh0<Context> wh0Var, wh0<String> wh0Var2, wh0<Integer> wh0Var3) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
    }

    public static wu a(wh0<Context> wh0Var, wh0<String> wh0Var2, wh0<Integer> wh0Var3) {
        return new wu(wh0Var, wh0Var2, wh0Var3);
    }

    public static vu c(Context context, String str, int i) {
        return new vu(context, str, i);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public vu get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
