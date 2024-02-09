package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.zp;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: kq  reason: default package */
/* loaded from: classes.dex */
public abstract class kq {

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* renamed from: kq$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract kq a();

        public abstract a b(vo voVar);

        public abstract a c(wo<?> woVar);

        public abstract a d(yo<?, byte[]> yoVar);

        public abstract a e(lq lqVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new zp.b();
    }

    public abstract vo b();

    public abstract wo<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract yo<?, byte[]> e();

    public abstract lq f();

    public abstract String g();
}
