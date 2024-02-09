package defpackage;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nr  reason: default package */
/* loaded from: classes.dex */
public final class nr {
    public final String a;
    public final List<mr> b;

    /* compiled from: AxisPay */
    /* renamed from: nr$a */
    /* loaded from: classes.dex */
    public static final class a {
        public String a = C0059ao.a(2469);
        public List<mr> b = new ArrayList();

        public nr a() {
            return new nr(this.a, Collections.unmodifiableList(this.b));
        }

        public a b(List<mr> list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    static {
        new a().a();
    }

    public nr(String str, List<mr> list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<mr> a() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public String b() {
        return this.a;
    }
}
