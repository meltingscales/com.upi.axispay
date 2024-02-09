package defpackage;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AxisPay */
/* renamed from: mr  reason: default package */
/* loaded from: classes.dex */
public final class mr {
    public final long a;
    public final b b;

    /* compiled from: AxisPay */
    /* renamed from: mr$a */
    /* loaded from: classes.dex */
    public static final class a {
        public long a = 0;
        public b b = b.REASON_UNKNOWN;

        public mr a() {
            return new mr(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mr$b */
    /* loaded from: classes.dex */
    public enum b implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        public final int b;

        b(int i) {
            this.b = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.b;
        }
    }

    static {
        new a().a();
    }

    public mr(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long a() {
        return this.a;
    }

    @Protobuf(tag = 3)
    public b b() {
        return this.b;
    }
}
