package defpackage;

import defpackage.xq;
import java.util.Arrays;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sq  reason: default package */
/* loaded from: classes.dex */
public final class sq extends xq {
    public final Iterable<fq> a;
    public final byte[] b;

    /* compiled from: AxisPay */
    /* renamed from: sq$b */
    /* loaded from: classes.dex */
    public static final class b extends xq.a {
        public Iterable<fq> a;
        public byte[] b;

        @Override // defpackage.xq.a
        public xq a() {
            Iterable<fq> iterable = this.a;
            String a = C0059ao.a(1592);
            if (iterable == null) {
                a = a + C0059ao.a(1593);
            }
            if (a.isEmpty()) {
                return new sq(this.a, this.b);
            }
            throw new IllegalStateException(C0059ao.a(1594) + a);
        }

        @Override // defpackage.xq.a
        public xq.a b(Iterable<fq> iterable) {
            Objects.requireNonNull(iterable, C0059ao.a(1595));
            this.a = iterable;
            return this;
        }

        @Override // defpackage.xq.a
        public xq.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // defpackage.xq
    public Iterable<fq> b() {
        return this.a;
    }

    @Override // defpackage.xq
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xq) {
            xq xqVar = (xq) obj;
            if (this.a.equals(xqVar.b())) {
                if (Arrays.equals(this.b, xqVar instanceof sq ? ((sq) xqVar).b : xqVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return C0059ao.a(2466) + this.a + C0059ao.a(2467) + Arrays.toString(this.b) + C0059ao.a(2468);
    }

    public sq(Iterable<fq> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
