package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.yp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: fq  reason: default package */
/* loaded from: classes.dex */
public abstract class fq {

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* renamed from: fq$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final a a(String str, int i) {
            e().put(str, String.valueOf(i));
            return this;
        }

        public final a b(String str, long j) {
            e().put(str, String.valueOf(j));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract fq d();

        public abstract Map<String, String> e();

        public abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(eq eqVar);

        public abstract a i(long j);

        public abstract a j(String str);

        public abstract a k(long j);
    }

    public static a a() {
        yp.b bVar = new yp.b();
        bVar.f(new HashMap());
        return bVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? C0059ao.a(6166) : str2;
    }

    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract eq e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        yp.b bVar = new yp.b();
        bVar.j(j());
        bVar.g(d());
        bVar.h(e());
        bVar.i(f());
        bVar.k(k());
        bVar.f(new HashMap(c()));
        return bVar;
    }
}
