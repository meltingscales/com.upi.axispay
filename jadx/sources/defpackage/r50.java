package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r50  reason: default package */
/* loaded from: classes.dex */
public final class r50 {
    public k50 a;
    public j50 b;
    public l50 c;
    public int d = -1;
    public n50 e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public n50 a() {
        return this.e;
    }

    public void c(j50 j50Var) {
        this.b = j50Var;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(n50 n50Var) {
        this.e = n50Var;
    }

    public void f(k50 k50Var) {
        this.a = k50Var;
    }

    public void g(l50 l50Var) {
        this.c = l50Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append(C0059ao.a(7606));
        sb.append(C0059ao.a(7607));
        sb.append(this.a);
        sb.append(C0059ao.a(7608));
        sb.append(this.b);
        sb.append(C0059ao.a(7609));
        sb.append(this.c);
        sb.append(C0059ao.a(7610));
        sb.append(this.d);
        if (this.e == null) {
            sb.append(C0059ao.a(7611));
        } else {
            sb.append(C0059ao.a(7612));
            sb.append(this.e);
        }
        sb.append(C0059ao.a(7613));
        return sb.toString();
    }
}
