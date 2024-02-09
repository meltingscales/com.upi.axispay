package defpackage;

import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AxisPay */
/* renamed from: or  reason: default package */
/* loaded from: classes.dex */
public final class or {
    public final long a;
    public final long b;

    /* compiled from: AxisPay */
    /* renamed from: or$a */
    /* loaded from: classes.dex */
    public static final class a {
        public long a = 0;
        public long b = 0;

        public or a() {
            return new or(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(long j) {
            this.b = j;
            return this;
        }
    }

    static {
        new a().a();
    }

    public or(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long a() {
        return this.a;
    }

    @Protobuf(tag = 2)
    public long b() {
        return this.b;
    }
}
