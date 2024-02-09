package defpackage;

import defpackage.sp;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mp  reason: default package */
/* loaded from: classes.dex */
public final class mp extends sp {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final vp g;

    /* compiled from: AxisPay */
    /* renamed from: mp$b */
    /* loaded from: classes.dex */
    public static final class b extends sp.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public vp g;

        @Override // defpackage.sp.a
        public sp a() {
            Long l = this.a;
            String a = C0059ao.a(2482);
            if (l == null) {
                a = a + C0059ao.a(2483);
            }
            if (this.c == null) {
                a = a + C0059ao.a(2484);
            }
            if (this.f == null) {
                a = a + C0059ao.a(2485);
            }
            if (a.isEmpty()) {
                return new mp(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException(C0059ao.a(2486) + a);
        }

        @Override // defpackage.sp.a
        public sp.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // defpackage.sp.a
        public sp.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.sp.a
        public sp.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.sp.a
        public sp.a e(vp vpVar) {
            this.g = vpVar;
            return this;
        }

        @Override // defpackage.sp.a
        public sp.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // defpackage.sp.a
        public sp.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.sp.a
        public sp.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.sp
    public Integer b() {
        return this.b;
    }

    @Override // defpackage.sp
    public long c() {
        return this.a;
    }

    @Override // defpackage.sp
    public long d() {
        return this.c;
    }

    @Override // defpackage.sp
    public vp e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sp) {
            sp spVar = (sp) obj;
            if (this.a == spVar.c() && ((num = this.b) != null ? num.equals(spVar.b()) : spVar.b() == null) && this.c == spVar.d()) {
                if (Arrays.equals(this.d, spVar instanceof mp ? ((mp) spVar).d : spVar.f()) && ((str = this.e) != null ? str.equals(spVar.g()) : spVar.g() == null) && this.f == spVar.h()) {
                    vp vpVar = this.g;
                    if (vpVar == null) {
                        if (spVar.e() == null) {
                            return true;
                        }
                    } else if (vpVar.equals(spVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.sp
    public byte[] f() {
        return this.d;
    }

    @Override // defpackage.sp
    public String g() {
        return this.e;
    }

    @Override // defpackage.sp
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        vp vpVar = this.g;
        return i2 ^ (vpVar != null ? vpVar.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(13049) + this.a + C0059ao.a(13050) + this.b + C0059ao.a(13051) + this.c + C0059ao.a(13052) + Arrays.toString(this.d) + C0059ao.a(13053) + this.e + C0059ao.a(13054) + this.f + C0059ao.a(13055) + this.g + C0059ao.a(13056);
    }

    public mp(long j, Integer num, long j2, byte[] bArr, String str, long j3, vp vpVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = vpVar;
    }
}
