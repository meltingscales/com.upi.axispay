package defpackage;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import defpackage.np;
import java.util.List;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: tp  reason: default package */
/* loaded from: classes.dex */
public abstract class tp {

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* renamed from: tp$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract tp a();

        public abstract a b(rp rpVar);

        public abstract a c(List<sp> list);

        public abstract a d(Integer num);

        public abstract a e(String str);

        public abstract a f(wp wpVar);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            d(Integer.valueOf(i));
            return this;
        }

        public a j(String str) {
            e(str);
            return this;
        }
    }

    public static a a() {
        return new np.b();
    }

    public abstract rp b();

    @Encodable.Field(name = "logEvent")
    public abstract List<sp> c();

    public abstract Integer d();

    public abstract String e();

    public abstract wp f();

    public abstract long g();

    public abstract long h();
}
