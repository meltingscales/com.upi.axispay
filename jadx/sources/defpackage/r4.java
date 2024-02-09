package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r4  reason: default package */
/* loaded from: classes.dex */
public class r4<E> implements Cloneable {
    public static final Object f = new Object();
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public r4() {
        this(10);
    }

    public void a(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.c[i - 1]) {
            i(j, e);
            return;
        }
        if (this.b && i >= this.c.length) {
            d();
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int f2 = q4.f(i2 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = jArr;
            this.d = objArr;
        }
        this.c[i2] = j;
        this.d[i2] = e;
        this.e = i2 + 1;
    }

    public void b() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    /* renamed from: c */
    public r4<E> clone() {
        try {
            r4<E> r4Var = (r4) super.clone();
            r4Var.c = (long[]) this.c.clone();
            r4Var.d = (Object[]) this.d.clone();
            return r4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public E e(long j) {
        return f(j, null);
    }

    public E f(long j, E e) {
        int b = q4.b(this.c, this.e, j);
        if (b >= 0) {
            Object[] objArr = this.d;
            if (objArr[b] != f) {
                return (E) objArr[b];
            }
        }
        return e;
    }

    public int g(long j) {
        if (this.b) {
            d();
        }
        return q4.b(this.c, this.e, j);
    }

    public long h(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public void i(long j, E e) {
        int b = q4.b(this.c, this.e, j);
        if (b >= 0) {
            this.d[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.e;
        if (i < i2) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.b && i2 >= this.c.length) {
            d();
            i = ~q4.b(this.c, this.e, j);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int f2 = q4.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i != 0) {
            long[] jArr3 = this.c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i5, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    public void j(long j) {
        int b = q4.b(this.c, this.e, j);
        if (b >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[b];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.b = true;
            }
        }
    }

    public void k(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.b = true;
        }
    }

    public int l() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public E m(int i) {
        if (this.b) {
            d();
        }
        return (E) this.d[i];
    }

    public String toString() {
        if (l() <= 0) {
            return C0059ao.a(15512);
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(C0059ao.a(15513));
            }
            sb.append(h(i));
            sb.append('=');
            E m = m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append(C0059ao.a(15514));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public r4(int i) {
        this.b = false;
        if (i == 0) {
            this.c = q4.b;
            this.d = q4.c;
            return;
        }
        int f2 = q4.f(i);
        this.c = new long[f2];
        this.d = new Object[f2];
    }
}
