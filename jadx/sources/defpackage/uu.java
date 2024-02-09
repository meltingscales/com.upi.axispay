package defpackage;

/* compiled from: AxisPay */
/* renamed from: uu  reason: default package */
/* loaded from: classes.dex */
public final class uu implements hr<tu> {
    public final wh0<zu> a;
    public final wh0<zu> b;
    public final wh0<mu> c;
    public final wh0<vu> d;
    public final wh0<String> e;

    public uu(wh0<zu> wh0Var, wh0<zu> wh0Var2, wh0<mu> wh0Var3, wh0<vu> wh0Var4, wh0<String> wh0Var5) {
        this.a = wh0Var;
        this.b = wh0Var2;
        this.c = wh0Var3;
        this.d = wh0Var4;
        this.e = wh0Var5;
    }

    public static uu a(wh0<zu> wh0Var, wh0<zu> wh0Var2, wh0<mu> wh0Var3, wh0<vu> wh0Var4, wh0<String> wh0Var5) {
        return new uu(wh0Var, wh0Var2, wh0Var3, wh0Var4, wh0Var5);
    }

    public static tu c(zu zuVar, zu zuVar2, Object obj, Object obj2, fr<String> frVar) {
        return new tu(zuVar, zuVar2, (mu) obj, (vu) obj2, frVar);
    }

    @Override // defpackage.wh0
    /* renamed from: b */
    public tu get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), gr.a(this.e));
    }
}
