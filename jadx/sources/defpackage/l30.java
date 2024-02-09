package defpackage;

/* compiled from: AxisPay */
/* renamed from: l30  reason: default package */
/* loaded from: classes.dex */
public abstract class l30 {
    public static final l30 b = new j30(null, 0, 0);
    public final l30 a;

    public l30(l30 l30Var) {
        this.a = l30Var;
    }

    public final l30 a(int i, int i2) {
        return new j30(this, i, i2);
    }

    public final l30 b(int i, int i2) {
        return new g30(this, i, i2);
    }

    public abstract void c(m30 m30Var, byte[] bArr);

    public final l30 d() {
        return this.a;
    }
}
