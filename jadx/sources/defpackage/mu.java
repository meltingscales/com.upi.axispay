package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.iu;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: mu  reason: default package */
/* loaded from: classes.dex */
public abstract class mu {
    public static final mu a;

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* renamed from: mu$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract mu a();

        public abstract a b(int i);

        public abstract a c(long j);

        public abstract a d(int i);

        public abstract a e(int i);

        public abstract a f(long j);
    }

    static {
        a a2 = a();
        a2.f(10485760L);
        a2.d(200);
        a2.b(10000);
        a2.c(604800000L);
        a2.e(81920);
        a = a2.a();
    }

    public static a a() {
        return new iu.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
