package defpackage;

import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AxisPay */
/* renamed from: pr  reason: default package */
/* loaded from: classes.dex */
public final class pr {
    public final long a;
    public final long b;

    /* compiled from: AxisPay */
    /* renamed from: pr$a */
    /* loaded from: classes.dex */
    public static final class a {
        public long a = 0;
        public long b = 0;

        public pr a() {
            return new pr(this.a, this.b);
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }
    }

    static {
        new a().a();
    }

    public pr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 2)
    public long a() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public long b() {
        return this.a;
    }
}
