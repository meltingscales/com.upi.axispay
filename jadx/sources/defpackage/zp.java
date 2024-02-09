package defpackage;

import defpackage.kq;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zp  reason: default package */
/* loaded from: classes.dex */
public final class zp extends kq {
    public final lq a;
    public final String b;
    public final wo<?> c;
    public final yo<?, byte[]> d;
    public final vo e;

    /* compiled from: AxisPay */
    /* renamed from: zp$b */
    /* loaded from: classes.dex */
    public static final class b extends kq.a {
        public lq a;
        public String b;
        public wo<?> c;
        public yo<?, byte[]> d;
        public vo e;

        @Override // defpackage.kq.a
        public kq a() {
            lq lqVar = this.a;
            String a = C0059ao.a(14184);
            if (lqVar == null) {
                a = a + C0059ao.a(14185);
            }
            if (this.b == null) {
                a = a + C0059ao.a(14186);
            }
            if (this.c == null) {
                a = a + C0059ao.a(14187);
            }
            if (this.d == null) {
                a = a + C0059ao.a(14188);
            }
            if (this.e == null) {
                a = a + C0059ao.a(14189);
            }
            if (a.isEmpty()) {
                return new zp(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException(C0059ao.a(14190) + a);
        }

        @Override // defpackage.kq.a
        public kq.a b(vo voVar) {
            Objects.requireNonNull(voVar, C0059ao.a(14191));
            this.e = voVar;
            return this;
        }

        @Override // defpackage.kq.a
        public kq.a c(wo<?> woVar) {
            Objects.requireNonNull(woVar, C0059ao.a(14192));
            this.c = woVar;
            return this;
        }

        @Override // defpackage.kq.a
        public kq.a d(yo<?, byte[]> yoVar) {
            Objects.requireNonNull(yoVar, C0059ao.a(14193));
            this.d = yoVar;
            return this;
        }

        @Override // defpackage.kq.a
        public kq.a e(lq lqVar) {
            Objects.requireNonNull(lqVar, C0059ao.a(14194));
            this.a = lqVar;
            return this;
        }

        @Override // defpackage.kq.a
        public kq.a f(String str) {
            Objects.requireNonNull(str, C0059ao.a(14195));
            this.b = str;
            return this;
        }
    }

    @Override // defpackage.kq
    public vo b() {
        return this.e;
    }

    @Override // defpackage.kq
    public wo<?> c() {
        return this.c;
    }

    @Override // defpackage.kq
    public yo<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq) {
            kq kqVar = (kq) obj;
            return this.a.equals(kqVar.f()) && this.b.equals(kqVar.g()) && this.c.equals(kqVar.c()) && this.d.equals(kqVar.e()) && this.e.equals(kqVar.b());
        }
        return false;
    }

    @Override // defpackage.kq
    public lq f() {
        return this.a;
    }

    @Override // defpackage.kq
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return C0059ao.a(9094) + this.a + C0059ao.a(9095) + this.b + C0059ao.a(9096) + this.c + C0059ao.a(9097) + this.d + C0059ao.a(9098) + this.e + C0059ao.a(9099);
    }

    public zp(lq lqVar, String str, wo<?> woVar, yo<?, byte[]> yoVar, vo voVar) {
        this.a = lqVar;
        this.b = str;
        this.c = woVar;
        this.d = yoVar;
        this.e = voVar;
    }
}
