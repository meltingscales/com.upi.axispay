package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: o70  reason: default package */
/* loaded from: classes.dex */
public final class o70 {
    public final String a;
    public String b;
    public final String c;

    public o70(String str, String str2, String str3) {
        yl0.e(str, C0059ao.a(1662));
        yl0.e(str3, C0059ao.a(1663));
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o70) {
            o70 o70Var = (o70) obj;
            return yl0.a(this.a, o70Var.a) && yl0.a(this.b, o70Var.b) && yl0.a(this.c, o70Var.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return C0059ao.a(1664) + this.a + C0059ao.a(1665) + ((Object) this.b) + C0059ao.a(1666) + this.c + ')';
    }
}
