package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pm0  reason: default package */
/* loaded from: classes.dex */
public class pm0 implements Iterable<Integer>, om0 {
    public static final a e = new a(null);
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: AxisPay */
    /* renamed from: pm0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(vl0 vl0Var) {
            this();
        }

        public final pm0 a(int i, int i2, int i3) {
            return new pm0(i, i2, i3);
        }
    }

    public pm0(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException(C0059ao.a(1597));
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i;
            this.c = mk0.b(i, i2, i3);
            this.d = i3;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1596));
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    @Override // java.lang.Iterable
    /* renamed from: d */
    public nj0 iterator() {
        return new qm0(this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (obj instanceof pm0) {
            if (!isEmpty() || !((pm0) obj).isEmpty()) {
                pm0 pm0Var = (pm0) obj;
                if (this.b != pm0Var.b || this.c != pm0Var.c || this.d != pm0Var.d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public boolean isEmpty() {
        if (this.d > 0) {
            if (this.b > this.c) {
                return true;
            }
        } else if (this.b < this.c) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        int i2 = this.d;
        String a2 = C0059ao.a(1598);
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append(C0059ao.a(1599));
            sb.append(this.c);
            sb.append(a2);
            i = this.d;
        } else {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append(C0059ao.a(1600));
            sb.append(this.c);
            sb.append(a2);
            i = -this.d;
        }
        sb.append(i);
        return sb.toString();
    }
}
