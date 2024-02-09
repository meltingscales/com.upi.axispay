package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: op  reason: default package */
/* loaded from: classes.dex */
public final class op extends up {
    public final long a;

    public op(long j) {
        this.a = j;
    }

    @Override // defpackage.up
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof up) && this.a == ((up) obj).c();
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return C0059ao.a(14816) + this.a + C0059ao.a(14817);
    }
}
