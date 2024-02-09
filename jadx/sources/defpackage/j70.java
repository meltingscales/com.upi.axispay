package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j70  reason: default package */
/* loaded from: classes.dex */
public final class j70 {
    public final String a;
    public final String b;
    public final boolean c;

    public j70(String str, String str2, boolean z) {
        yl0.e(str, C0059ao.a(14800));
        yl0.e(str2, C0059ao.a(14801));
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j70) {
            j70 j70Var = (j70) obj;
            return yl0.a(this.a, j70Var.a) && yl0.a(this.b, j70Var.b) && this.c == j70Var.c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return C0059ao.a(14802) + this.a + C0059ao.a(14803) + this.b + C0059ao.a(14804) + this.c + ')';
    }
}
