package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.mp;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: sp  reason: default package */
/* loaded from: classes.dex */
public abstract class sp {

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* renamed from: sp$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract sp a();

        public abstract a b(Integer num);

        public abstract a c(long j);

        public abstract a d(long j);

        public abstract a e(vp vpVar);

        public abstract a f(byte[] bArr);

        public abstract a g(String str);

        public abstract a h(long j);
    }

    public static a a() {
        return new mp.b();
    }

    public static a i(String str) {
        a a2 = a();
        a2.g(str);
        return a2;
    }

    public static a j(byte[] bArr) {
        a a2 = a();
        a2.f(bArr);
        return a2;
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract vp e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
