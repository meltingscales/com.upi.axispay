package defpackage;

import defpackage.lq;
import java.util.Arrays;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: aq  reason: default package */
/* loaded from: classes.dex */
public final class aq extends lq {
    public final String a;
    public final byte[] b;
    public final xo c;

    /* compiled from: AxisPay */
    /* renamed from: aq$b */
    /* loaded from: classes.dex */
    public static final class b extends lq.a {
        public String a;
        public byte[] b;
        public xo c;

        @Override // defpackage.lq.a
        public lq a() {
            String str = this.a;
            String a = C0059ao.a(12465);
            if (str == null) {
                a = a + C0059ao.a(12466);
            }
            if (this.c == null) {
                a = a + C0059ao.a(12467);
            }
            if (a.isEmpty()) {
                return new aq(this.a, this.b, this.c);
            }
            throw new IllegalStateException(C0059ao.a(12468) + a);
        }

        @Override // defpackage.lq.a
        public lq.a b(String str) {
            Objects.requireNonNull(str, C0059ao.a(12469));
            this.a = str;
            return this;
        }

        @Override // defpackage.lq.a
        public lq.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // defpackage.lq.a
        public lq.a d(xo xoVar) {
            Objects.requireNonNull(xoVar, C0059ao.a(12470));
            this.c = xoVar;
            return this;
        }
    }

    @Override // defpackage.lq
    public String b() {
        return this.a;
    }

    @Override // defpackage.lq
    public byte[] c() {
        return this.b;
    }

    @Override // defpackage.lq
    public xo d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lq) {
            lq lqVar = (lq) obj;
            if (this.a.equals(lqVar.b())) {
                if (Arrays.equals(this.b, lqVar instanceof aq ? ((aq) lqVar).b : lqVar.c()) && this.c.equals(lqVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public aq(String str, byte[] bArr, xo xoVar) {
        this.a = str;
        this.b = bArr;
        this.c = xoVar;
    }
}
