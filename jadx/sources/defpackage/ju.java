package defpackage;

import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ju  reason: default package */
/* loaded from: classes.dex */
public final class ju extends su {
    public final long a;
    public final lq b;
    public final fq c;

    public ju(long j, lq lqVar, fq fqVar) {
        this.a = j;
        Objects.requireNonNull(lqVar, C0059ao.a(10609));
        this.b = lqVar;
        Objects.requireNonNull(fqVar, C0059ao.a(10610));
        this.c = fqVar;
    }

    @Override // defpackage.su
    public fq b() {
        return this.c;
    }

    @Override // defpackage.su
    public long c() {
        return this.a;
    }

    @Override // defpackage.su
    public lq d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof su) {
            su suVar = (su) obj;
            return this.a == suVar.c() && this.b.equals(suVar.d()) && this.c.equals(suVar.b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return C0059ao.a(10611) + this.a + C0059ao.a(10612) + this.b + C0059ao.a(10613) + this.c + C0059ao.a(10614);
    }
}
