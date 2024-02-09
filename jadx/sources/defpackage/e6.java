package defpackage;

import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: e6  reason: default package */
/* loaded from: classes.dex */
public class e6 implements c6 {
    public o6 d;
    public int f;
    public int g;
    public c6 a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public f6 i = null;
    public boolean j = false;
    public List<c6> k = new ArrayList();
    public List<e6> l = new ArrayList();

    /* compiled from: AxisPay */
    /* renamed from: e6$a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public e6(o6 o6Var) {
        this.d = o6Var;
    }

    @Override // defpackage.c6
    public void a(c6 c6Var) {
        for (e6 e6Var : this.l) {
            if (!e6Var.j) {
                return;
            }
        }
        this.c = true;
        c6 c6Var2 = this.a;
        if (c6Var2 != null) {
            c6Var2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        e6 e6Var2 = null;
        int i = 0;
        for (e6 e6Var3 : this.l) {
            if (!(e6Var3 instanceof f6)) {
                i++;
                e6Var2 = e6Var3;
            }
        }
        if (e6Var2 != null && i == 1 && e6Var2.j) {
            f6 f6Var = this.i;
            if (f6Var != null) {
                if (!f6Var.j) {
                    return;
                }
                this.f = this.h * f6Var.g;
            }
            d(e6Var2.g + this.f);
        }
        c6 c6Var3 = this.a;
        if (c6Var3 != null) {
            c6Var3.a(this);
        }
    }

    public void b(c6 c6Var) {
        this.k.add(c6Var);
        if (this.j) {
            c6Var.a(c6Var);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (c6 c6Var : this.k) {
            c6Var.a(c6Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.r());
        sb.append(C0059ao.a(3499));
        sb.append(this.e);
        sb.append(C0059ao.a(3500));
        sb.append(this.j ? Integer.valueOf(this.g) : C0059ao.a(3501));
        sb.append(C0059ao.a(3502));
        sb.append(this.l.size());
        sb.append(C0059ao.a(3503));
        sb.append(this.k.size());
        sb.append(C0059ao.a(3504));
        return sb.toString();
    }
}
