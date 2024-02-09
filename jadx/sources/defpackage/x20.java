package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: x20  reason: default package */
/* loaded from: classes.dex */
public final class x20 {
    public final int a;
    public final int b;

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x20) {
            x20 x20Var = (x20) obj;
            if (this.a == x20Var.a && this.b == x20Var.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public String toString() {
        return this.a + C0059ao.a(3076) + this.b;
    }
}
