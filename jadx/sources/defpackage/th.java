package defpackage;

import android.os.Bundle;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: th  reason: default package */
/* loaded from: classes.dex */
public final class th {
    public final Bundle a;
    public xh b;

    public th(xh xhVar, boolean z) {
        if (xhVar != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = xhVar;
            bundle.putBundle(C0059ao.a(2980), xhVar.a());
            bundle.putBoolean(C0059ao.a(2981), z);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(2982));
    }

    public Bundle a() {
        return this.a;
    }

    public final void b() {
        if (this.b == null) {
            xh d = xh.d(this.a.getBundle(C0059ao.a(2983)));
            this.b = d;
            if (d == null) {
                this.b = xh.c;
            }
        }
    }

    public xh c() {
        b();
        return this.b;
    }

    public boolean d() {
        return this.a.getBoolean(C0059ao.a(2984));
    }

    public boolean e() {
        b();
        return this.b.g();
    }

    public boolean equals(Object obj) {
        if (obj instanceof th) {
            th thVar = (th) obj;
            return c().equals(thVar.c()) && d() == thVar.d();
        }
        return false;
    }

    public int hashCode() {
        return c().hashCode() ^ d();
    }

    public String toString() {
        return C0059ao.a(2985) + c() + C0059ao.a(2986) + d() + C0059ao.a(2987) + e() + C0059ao.a(2988);
    }
}
