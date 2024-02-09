package defpackage;

import defpackage.mu;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: iu  reason: default package */
/* loaded from: classes.dex */
public final class iu extends mu {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    /* compiled from: AxisPay */
    /* renamed from: iu$b */
    /* loaded from: classes.dex */
    public static final class b extends mu.a {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;

        @Override // defpackage.mu.a
        public mu a() {
            Long l = this.a;
            String a = C0059ao.a(12974);
            if (l == null) {
                a = a + C0059ao.a(12975);
            }
            if (this.b == null) {
                a = a + C0059ao.a(12976);
            }
            if (this.c == null) {
                a = a + C0059ao.a(12977);
            }
            if (this.d == null) {
                a = a + C0059ao.a(12978);
            }
            if (this.e == null) {
                a = a + C0059ao.a(12979);
            }
            if (a.isEmpty()) {
                return new iu(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException(C0059ao.a(12980) + a);
        }

        @Override // defpackage.mu.a
        public mu.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.mu.a
        public mu.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.mu.a
        public mu.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.mu.a
        public mu.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.mu.a
        public mu.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.mu
    public int b() {
        return this.d;
    }

    @Override // defpackage.mu
    public long c() {
        return this.e;
    }

    @Override // defpackage.mu
    public int d() {
        return this.c;
    }

    @Override // defpackage.mu
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mu) {
            mu muVar = (mu) obj;
            return this.b == muVar.f() && this.c == muVar.d() && this.d == muVar.b() && this.e == muVar.c() && this.f == muVar.e();
        }
        return false;
    }

    @Override // defpackage.mu
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public String toString() {
        return C0059ao.a(9483) + this.b + C0059ao.a(9484) + this.c + C0059ao.a(9485) + this.d + C0059ao.a(9486) + this.e + C0059ao.a(9487) + this.f + C0059ao.a(9488);
    }

    public iu(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }
}
