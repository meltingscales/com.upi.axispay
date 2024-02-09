package defpackage;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kr  reason: default package */
/* loaded from: classes.dex */
public final class kr {
    public final pr a;
    public final List<nr> b;
    public final lr c;
    public final String d;

    /* compiled from: AxisPay */
    /* renamed from: kr$a */
    /* loaded from: classes.dex */
    public static final class a {
        public pr a = null;
        public List<nr> b = new ArrayList();
        public lr c = null;
        public String d = C0059ao.a(45);

        public a a(nr nrVar) {
            this.b.add(nrVar);
            return this;
        }

        public kr b() {
            return new kr(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(lr lrVar) {
            this.c = lrVar;
            return this;
        }

        public a e(pr prVar) {
            this.a = prVar;
            return this;
        }
    }

    static {
        new a().b();
    }

    public kr(pr prVar, List<nr> list, lr lrVar, String str) {
        this.a = prVar;
        this.b = list;
        this.c = lrVar;
        this.d = str;
    }

    public static a e() {
        return new a();
    }

    @Protobuf(tag = 4)
    public String a() {
        return this.d;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public lr b() {
        return this.c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<nr> c() {
        return this.b;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public pr d() {
        return this.a;
    }

    public byte[] f() {
        return iq.a(this);
    }
}
