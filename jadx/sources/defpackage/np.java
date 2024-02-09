package defpackage;

import com.google.firebase.encoders.annotations.Encodable;
import defpackage.tp;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: np  reason: default package */
/* loaded from: classes.dex */
public final class np extends tp {
    public final long a;
    public final long b;
    public final rp c;
    public final Integer d;
    public final String e;
    public final List<sp> f;
    public final wp g;

    /* compiled from: AxisPay */
    /* renamed from: np$b */
    /* loaded from: classes.dex */
    public static final class b extends tp.a {
        public Long a;
        public Long b;
        public rp c;
        public Integer d;
        public String e;
        public List<sp> f;
        public wp g;

        @Override // defpackage.tp.a
        public tp a() {
            Long l = this.a;
            String a = C0059ao.a(8922);
            if (l == null) {
                a = a + C0059ao.a(8923);
            }
            if (this.b == null) {
                a = a + C0059ao.a(8924);
            }
            if (a.isEmpty()) {
                return new np(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(C0059ao.a(8925) + a);
        }

        @Override // defpackage.tp.a
        public tp.a b(rp rpVar) {
            this.c = rpVar;
            return this;
        }

        @Override // defpackage.tp.a
        public tp.a c(List<sp> list) {
            this.f = list;
            return this;
        }

        @Override // defpackage.tp.a
        public tp.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // defpackage.tp.a
        public tp.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.tp.a
        public tp.a f(wp wpVar) {
            this.g = wpVar;
            return this;
        }

        @Override // defpackage.tp.a
        public tp.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.tp.a
        public tp.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.tp
    public rp b() {
        return this.c;
    }

    @Override // defpackage.tp
    @Encodable.Field(name = "logEvent")
    public List<sp> c() {
        return this.f;
    }

    @Override // defpackage.tp
    public Integer d() {
        return this.d;
    }

    @Override // defpackage.tp
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        rp rpVar;
        Integer num;
        String str;
        List<sp> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tp) {
            tp tpVar = (tp) obj;
            if (this.a == tpVar.g() && this.b == tpVar.h() && ((rpVar = this.c) != null ? rpVar.equals(tpVar.b()) : tpVar.b() == null) && ((num = this.d) != null ? num.equals(tpVar.d()) : tpVar.d() == null) && ((str = this.e) != null ? str.equals(tpVar.e()) : tpVar.e() == null) && ((list = this.f) != null ? list.equals(tpVar.c()) : tpVar.c() == null)) {
                wp wpVar = this.g;
                if (wpVar == null) {
                    if (tpVar.f() == null) {
                        return true;
                    }
                } else if (wpVar.equals(tpVar.f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.tp
    public wp f() {
        return this.g;
    }

    @Override // defpackage.tp
    public long g() {
        return this.a;
    }

    @Override // defpackage.tp
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        rp rpVar = this.c;
        int hashCode = (i ^ (rpVar == null ? 0 : rpVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<sp> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        wp wpVar = this.g;
        return hashCode4 ^ (wpVar != null ? wpVar.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(14070) + this.a + C0059ao.a(14071) + this.b + C0059ao.a(14072) + this.c + C0059ao.a(14073) + this.d + C0059ao.a(14074) + this.e + C0059ao.a(14075) + this.f + C0059ao.a(14076) + this.g + C0059ao.a(14077);
    }

    public np(long j, long j2, rp rpVar, Integer num, String str, List<sp> list, wp wpVar) {
        this.a = j;
        this.b = j2;
        this.c = rpVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = wpVar;
    }
}
