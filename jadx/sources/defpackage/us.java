package defpackage;

import defpackage.ws;
import java.util.Objects;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: us  reason: default package */
/* loaded from: classes.dex */
public final class us extends ws.b {
    public final long a;
    public final long b;
    public final Set<ws.c> c;

    /* compiled from: AxisPay */
    /* renamed from: us$b */
    /* loaded from: classes.dex */
    public static final class b extends ws.b.a {
        public Long a;
        public Long b;
        public Set<ws.c> c;

        @Override // defpackage.ws.b.a
        public ws.b a() {
            Long l = this.a;
            String a = C0059ao.a(12433);
            if (l == null) {
                a = a + C0059ao.a(12434);
            }
            if (this.b == null) {
                a = a + C0059ao.a(12435);
            }
            if (this.c == null) {
                a = a + C0059ao.a(12436);
            }
            if (a.isEmpty()) {
                return new us(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException(C0059ao.a(12437) + a);
        }

        @Override // defpackage.ws.b.a
        public ws.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.ws.b.a
        public ws.b.a c(Set<ws.c> set) {
            Objects.requireNonNull(set, C0059ao.a(12438));
            this.c = set;
            return this;
        }

        @Override // defpackage.ws.b.a
        public ws.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.ws.b
    public long b() {
        return this.a;
    }

    @Override // defpackage.ws.b
    public Set<ws.c> c() {
        return this.c;
    }

    @Override // defpackage.ws.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ws.b) {
            ws.b bVar = (ws.b) obj;
            return this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return C0059ao.a(4230) + this.a + C0059ao.a(4231) + this.b + C0059ao.a(4232) + this.c + C0059ao.a(4233);
    }

    public us(long j, long j2, Set<ws.c> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }
}
