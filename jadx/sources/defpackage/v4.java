package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: v4  reason: default package */
/* loaded from: classes.dex */
public class v4<E> implements Cloneable {
    public static final Object f = new Object();
    public boolean b;
    public int[] c;
    public Object[] d;
    public int e;

    public v4() {
        this(10);
    }

    public void a(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.c[i2 - 1]) {
            i(i, e);
            return;
        }
        if (this.b && i2 >= this.c.length) {
            d();
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int e2 = q4.e(i3 + 1);
            int[] iArr = new int[e2];
            Object[] objArr = new Object[e2];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = iArr;
            this.d = objArr;
        }
        this.c[i3] = i;
        this.d[i3] = e;
        this.e = i3 + 1;
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
    public v4<E> clone() {
        try {
            v4<E> v4Var = (v4) super.clone();
            v4Var.c = (int[]) this.c.clone();
            v4Var.d = (Object[]) this.d.clone();
            return v4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public E e(int i) {
        return f(i, null);
    }

    public E f(int i, E e) {
        int a = q4.a(this.c, this.e, i);
        if (a >= 0) {
            Object[] objArr = this.d;
            if (objArr[a] != f) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    public int g(E e) {
        if (this.b) {
            d();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int h(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public void i(int i, E e) {
        int a = q4.a(this.c, this.e, i);
        if (a >= 0) {
            this.d[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.e;
        if (i2 < i3) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.b && i3 >= this.c.length) {
            d();
            i2 = ~q4.a(this.c, this.e, i);
        }
        int i4 = this.e;
        if (i4 >= this.c.length) {
            int e2 = q4.e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i5 = this.e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    public int j() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public E k(int i) {
        if (this.b) {
            d();
        }
        return (E) this.d[i];
    }

    public String toString() {
        if (j() <= 0) {
            return C0059ao.a(3218);
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(C0059ao.a(3219));
            }
            sb.append(h(i));
            sb.append('=');
            E k = k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append(C0059ao.a(3220));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public v4(int i) {
        this.b = false;
        if (i == 0) {
            this.c = q4.a;
            this.d = q4.c;
            return;
        }
        int e = q4.e(i);
        this.c = new int[e];
        this.d = new Object[e];
    }
}
