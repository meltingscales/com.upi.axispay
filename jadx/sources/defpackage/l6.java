package defpackage;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: l6  reason: default package */
/* loaded from: classes.dex */
public class l6 {
    public static int d;
    public boolean a;
    public o6 b;
    public ArrayList<o6> c = new ArrayList<>();

    public l6(o6 o6Var, int i) {
        this.b = null;
        d++;
        this.b = o6Var;
    }

    public void a(o6 o6Var) {
        this.c.add(o6Var);
    }

    public long b(s5 s5Var, int i) {
        long j;
        int i2;
        o6 o6Var = this.b;
        if (o6Var instanceof b6) {
            if (((b6) o6Var).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(o6Var instanceof k6)) {
                return 0L;
            }
        } else if (!(o6Var instanceof m6)) {
            return 0L;
        }
        e6 e6Var = (i == 0 ? s5Var.d : s5Var.e).h;
        e6 e6Var2 = (i == 0 ? s5Var.d : s5Var.e).i;
        boolean contains = o6Var.h.l.contains(e6Var);
        boolean contains2 = this.b.i.l.contains(e6Var2);
        long j2 = this.b.j();
        if (contains && contains2) {
            long d2 = d(this.b.h, 0L);
            long c = c(this.b.i, 0L);
            long j3 = d2 - j2;
            o6 o6Var2 = this.b;
            int i3 = o6Var2.i.f;
            if (j3 >= (-i3)) {
                j3 += i3;
            }
            int i4 = o6Var2.h.f;
            long j4 = ((-c) - j2) - i4;
            if (j4 >= i4) {
                j4 -= i4;
            }
            float o = o6Var2.b.o(i);
            float f = (float) (o > 0.0f ? (((float) j4) / o) + (((float) j3) / (1.0f - o)) : 0L);
            long j5 = (f * o) + 0.5f + j2 + (f * (1.0f - o)) + 0.5f;
            o6 o6Var3 = this.b;
            j = o6Var3.h.f + j5;
            i2 = o6Var3.i.f;
        } else if (contains) {
            e6 e6Var3 = this.b.h;
            return Math.max(d(e6Var3, e6Var3.f), this.b.h.f + j2);
        } else if (contains2) {
            e6 e6Var4 = this.b.i;
            return Math.max(-c(e6Var4, e6Var4.f), (-this.b.i.f) + j2);
        } else {
            o6 o6Var4 = this.b;
            j = o6Var4.h.f + o6Var4.j();
            i2 = this.b.i.f;
        }
        return j - i2;
    }

    public final long c(e6 e6Var, long j) {
        o6 o6Var = e6Var.d;
        if (o6Var instanceof j6) {
            return j;
        }
        int size = e6Var.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            c6 c6Var = e6Var.k.get(i);
            if (c6Var instanceof e6) {
                e6 e6Var2 = (e6) c6Var;
                if (e6Var2.d != o6Var) {
                    j2 = Math.min(j2, c(e6Var2, e6Var2.f + j));
                }
            }
        }
        if (e6Var == o6Var.i) {
            long j3 = j - o6Var.j();
            return Math.min(Math.min(j2, c(o6Var.h, j3)), j3 - o6Var.h.f);
        }
        return j2;
    }

    public final long d(e6 e6Var, long j) {
        o6 o6Var = e6Var.d;
        if (o6Var instanceof j6) {
            return j;
        }
        int size = e6Var.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            c6 c6Var = e6Var.k.get(i);
            if (c6Var instanceof e6) {
                e6 e6Var2 = (e6) c6Var;
                if (e6Var2.d != o6Var) {
                    j2 = Math.max(j2, d(e6Var2, e6Var2.f + j));
                }
            }
        }
        if (e6Var == o6Var.h) {
            long j3 = j + o6Var.j();
            return Math.max(Math.max(j2, d(o6Var.i, j3)), j3 - o6Var.i.f);
        }
        return j2;
    }
}
