package defpackage;

import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uo  reason: default package */
/* loaded from: classes.dex */
public final class uo<T> extends wo<T> {
    public final Integer a;
    public final T b;
    public final xo c;

    public uo(Integer num, T t, xo xoVar) {
        this.a = num;
        Objects.requireNonNull(t, C0059ao.a(4079));
        this.b = t;
        Objects.requireNonNull(xoVar, C0059ao.a(4080));
        this.c = xoVar;
    }

    @Override // defpackage.wo
    public Integer a() {
        return this.a;
    }

    @Override // defpackage.wo
    public T b() {
        return this.b;
    }

    @Override // defpackage.wo
    public xo c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wo) {
            wo woVar = (wo) obj;
            Integer num = this.a;
            if (num != null ? num.equals(woVar.a()) : woVar.a() == null) {
                if (this.b.equals(woVar.b()) && this.c.equals(woVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return C0059ao.a(4081) + this.a + C0059ao.a(4082) + this.b + C0059ao.a(4083) + this.c + C0059ao.a(4084);
    }
}
