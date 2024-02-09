package defpackage;

import defpackage.fq;
import java.util.Map;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yp  reason: default package */
/* loaded from: classes.dex */
public final class yp extends fq {
    public final String a;
    public final Integer b;
    public final eq c;
    public final long d;
    public final long e;
    public final Map<String, String> f;

    /* compiled from: AxisPay */
    /* renamed from: yp$b */
    /* loaded from: classes.dex */
    public static final class b extends fq.a {
        public String a;
        public Integer b;
        public eq c;
        public Long d;
        public Long e;
        public Map<String, String> f;

        @Override // defpackage.fq.a
        public fq d() {
            String str = this.a;
            String a = C0059ao.a(12454);
            if (str == null) {
                a = a + C0059ao.a(12455);
            }
            if (this.c == null) {
                a = a + C0059ao.a(12456);
            }
            if (this.d == null) {
                a = a + C0059ao.a(12457);
            }
            if (this.e == null) {
                a = a + C0059ao.a(12458);
            }
            if (this.f == null) {
                a = a + C0059ao.a(12459);
            }
            if (a.isEmpty()) {
                return new yp(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException(C0059ao.a(12460) + a);
        }

        @Override // defpackage.fq.a
        public Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException(C0059ao.a(12461));
        }

        @Override // defpackage.fq.a
        public fq.a f(Map<String, String> map) {
            Objects.requireNonNull(map, C0059ao.a(12462));
            this.f = map;
            return this;
        }

        @Override // defpackage.fq.a
        public fq.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // defpackage.fq.a
        public fq.a h(eq eqVar) {
            Objects.requireNonNull(eqVar, C0059ao.a(12463));
            this.c = eqVar;
            return this;
        }

        @Override // defpackage.fq.a
        public fq.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.fq.a
        public fq.a j(String str) {
            Objects.requireNonNull(str, C0059ao.a(12464));
            this.a = str;
            return this;
        }

        @Override // defpackage.fq.a
        public fq.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.fq
    public Map<String, String> c() {
        return this.f;
    }

    @Override // defpackage.fq
    public Integer d() {
        return this.b;
    }

    @Override // defpackage.fq
    public eq e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fq) {
            fq fqVar = (fq) obj;
            return this.a.equals(fqVar.j()) && ((num = this.b) != null ? num.equals(fqVar.d()) : fqVar.d() == null) && this.c.equals(fqVar.e()) && this.d == fqVar.f() && this.e == fqVar.k() && this.f.equals(fqVar.c());
        }
        return false;
    }

    @Override // defpackage.fq
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // defpackage.fq
    public String j() {
        return this.a;
    }

    @Override // defpackage.fq
    public long k() {
        return this.e;
    }

    public String toString() {
        return C0059ao.a(8064) + this.a + C0059ao.a(8065) + this.b + C0059ao.a(8066) + this.c + C0059ao.a(8067) + this.d + C0059ao.a(8068) + this.e + C0059ao.a(8069) + this.f + C0059ao.a(8070);
    }

    public yp(String str, Integer num, eq eqVar, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = eqVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}
