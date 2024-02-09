package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: za  reason: default package */
/* loaded from: classes.dex */
public class za<F, S> {
    public final F a;
    public final S b;

    public za(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> za<A, B> a(A a, B b) {
        return new za<>(a, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof za) {
            za zaVar = (za) obj;
            return ya.a(zaVar.a, this.a) && ya.a(zaVar.b, this.b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(8594) + this.a + C0059ao.a(8595) + this.b + C0059ao.a(8596);
    }
}
