package defpackage;

import defpackage.yq;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tq  reason: default package */
/* loaded from: classes.dex */
public final class tq extends yq {
    public final yq.a a;
    public final long b;

    public tq(yq.a aVar, long j) {
        Objects.requireNonNull(aVar, C0059ao.a(3229));
        this.a = aVar;
        this.b = j;
    }

    @Override // defpackage.yq
    public long b() {
        return this.b;
    }

    @Override // defpackage.yq
    public yq.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yq) {
            yq yqVar = (yq) obj;
            return this.a.equals(yqVar.c()) && this.b == yqVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return C0059ao.a(3230) + this.a + C0059ao.a(3231) + this.b + C0059ao.a(3232);
    }
}
