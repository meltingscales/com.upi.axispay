package defpackage;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AxisPay */
/* renamed from: lr  reason: default package */
/* loaded from: classes.dex */
public final class lr {
    public final or a;

    /* compiled from: AxisPay */
    /* renamed from: lr$a */
    /* loaded from: classes.dex */
    public static final class a {
        public or a = null;

        public lr a() {
            return new lr(this.a);
        }

        public a b(or orVar) {
            this.a = orVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    public lr(or orVar) {
        this.a = orVar;
    }

    public static a b() {
        return new a();
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public or a() {
        return this.a;
    }
}
