package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n6  reason: default package */
/* loaded from: classes.dex */
public class n6 {
    public static int f;
    public int b;
    public int c;
    public ArrayList<r5> a = new ArrayList<>();
    public ArrayList<a> d = null;
    public int e = -1;

    /* compiled from: AxisPay */
    /* renamed from: n6$a */
    /* loaded from: classes.dex */
    public class a {
        public a(n6 n6Var, r5 r5Var, z4 z4Var, int i) {
            new WeakReference(r5Var);
            z4Var.x(r5Var.L);
            z4Var.x(r5Var.M);
            z4Var.x(r5Var.N);
            z4Var.x(r5Var.O);
            z4Var.x(r5Var.P);
        }
    }

    public n6(int i) {
        this.b = -1;
        this.c = 0;
        int i2 = f;
        f = i2 + 1;
        this.b = i2;
        this.c = i;
    }

    public boolean a(r5 r5Var) {
        if (this.a.contains(r5Var)) {
            return false;
        }
        this.a.add(r5Var);
        return true;
    }

    public void b(ArrayList<n6> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n6 n6Var = arrayList.get(i);
                if (this.e == n6Var.b) {
                    g(this.c, n6Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public final String e() {
        int i = this.c;
        return i == 0 ? C0059ao.a(12513) : i == 1 ? C0059ao.a(12514) : i == 2 ? C0059ao.a(12515) : C0059ao.a(12516);
    }

    public int f(z4 z4Var, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return j(z4Var, this.a, i);
    }

    public void g(int i, n6 n6Var) {
        Iterator<r5> it = this.a.iterator();
        while (it.hasNext()) {
            r5 next = it.next();
            n6Var.a(next);
            if (i == 0) {
                next.s0 = n6Var.c();
            } else {
                next.t0 = n6Var.c();
            }
        }
        this.e = n6Var.b;
    }

    public void h(boolean z) {
    }

    public void i(int i) {
        this.c = i;
    }

    public final int j(z4 z4Var, ArrayList<r5> arrayList, int i) {
        int x;
        int x2;
        s5 s5Var = (s5) arrayList.get(0).I();
        z4Var.D();
        s5Var.g(z4Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(z4Var, false);
        }
        if (i == 0 && s5Var.F0 > 0) {
            o5.b(s5Var, z4Var, arrayList, 0);
        }
        if (i == 1 && s5Var.G0 > 0) {
            o5.b(s5Var, z4Var, arrayList, 1);
        }
        try {
            z4Var.z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.d.add(new a(this, arrayList.get(i3), z4Var, i));
        }
        if (i == 0) {
            x = z4Var.x(s5Var.L);
            x2 = z4Var.x(s5Var.N);
            z4Var.D();
        } else {
            x = z4Var.x(s5Var.M);
            x2 = z4Var.x(s5Var.O);
            z4Var.D();
        }
        return x2 - x;
    }

    public String toString() {
        Iterator<r5> it;
        String str = e() + C0059ao.a(12517) + this.b + C0059ao.a(12518);
        while (this.a.iterator().hasNext()) {
            str = str + C0059ao.a(12519) + it.next().r();
        }
        return str + C0059ao.a(12520);
    }
}
