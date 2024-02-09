package defpackage;

import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gi0  reason: default package */
/* loaded from: classes.dex */
public final class gi0<A, B> implements Serializable {
    public final A b;
    public final B c;

    public gi0(A a, B b) {
        this.b = a;
        this.c = b;
    }

    public final A a() {
        return this.b;
    }

    public final B b() {
        return this.c;
    }

    public final A c() {
        return this.b;
    }

    public final B d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gi0) {
            gi0 gi0Var = (gi0) obj;
            return yl0.a(this.b, gi0Var.b) && yl0.a(this.c, gi0Var.c);
        }
        return false;
    }

    public int hashCode() {
        A a = this.b;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.c;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.b + C0059ao.a(6133) + this.c + ')';
    }
}
