package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: u4  reason: default package */
/* loaded from: classes.dex */
public class u4<K, V> {
    public static Object[] e;
    public static int f;
    public static Object[] g;
    public static int h;
    public int[] b;
    public Object[] c;
    public int d;

    public u4() {
        this.b = q4.a;
        this.c = q4.c;
        this.d = 0;
    }

    public static int b(int[] iArr, int i, int i2) {
        try {
            return q4.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (u4.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (u4.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (u4.class) {
                Object[] objArr = g;
                if (objArr != null) {
                    this.c = objArr;
                    g = (Object[]) objArr[0];
                    this.b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (u4.class) {
                Object[] objArr2 = e;
                if (objArr2 != null) {
                    this.c = objArr2;
                    e = (Object[]) objArr2[0];
                    this.b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.b = new int[i];
        this.c = new Object[i << 1];
    }

    public void c(int i) {
        int i2 = this.d;
        int[] iArr = this.b;
        if (iArr.length < i) {
            Object[] objArr = this.c;
            a(i);
            if (this.d > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i2);
                System.arraycopy(objArr, 0, this.c, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.b;
            Object[] objArr = this.c;
            this.b = q4.a;
            this.c = q4.c;
            this.d = 0;
            d(iArr, objArr, i);
        }
        if (this.d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int b = b(this.b, i2, i);
        if (b >= 0 && !obj.equals(this.c[b << 1])) {
            int i3 = b + 1;
            while (i3 < i2 && this.b[i3] == i) {
                if (obj.equals(this.c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = b - 1; i4 >= 0 && this.b[i4] == i; i4--) {
                if (obj.equals(this.c[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u4) {
            u4 u4Var = (u4) obj;
            if (size() != u4Var.size()) {
                return false;
            }
            for (int i = 0; i < this.d; i++) {
                try {
                    K i2 = i(i);
                    V m = m(i);
                    Object obj2 = u4Var.get(i2);
                    if (m == null) {
                        if (obj2 != null || !u4Var.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.d; i3++) {
                try {
                    K i4 = i(i3);
                    V m2 = m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int b = b(this.b, i, 0);
        if (b >= 0 && this.c[b << 1] != null) {
            int i2 = b + 1;
            while (i2 < i && this.b[i2] == 0) {
                if (this.c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = b - 1; i3 >= 0 && this.b[i3] == 0; i3--) {
                if (this.c[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return b;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? (V) this.c[(f2 << 1) + 1] : v;
    }

    public int h(Object obj) {
        int i = this.d * 2;
        Object[] objArr = this.c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K i(int i) {
        return (K) this.c[i << 1];
    }

    public boolean isEmpty() {
        return this.d <= 0;
    }

    public void j(u4<? extends K, ? extends V> u4Var) {
        int i = u4Var.d;
        c(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(u4Var.i(i2), u4Var.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(u4Var.b, 0, this.b, 0, i);
            System.arraycopy(u4Var.c, 0, this.c, 0, i << 1);
            this.d = i;
        }
    }

    public V k(int i) {
        Object[] objArr = this.c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.d;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.b, objArr, i3);
            this.b = q4.a;
            this.c = q4.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.b;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.b, 0, i);
                    System.arraycopy(objArr, 0, this.c, 0, i2);
                }
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, this.b, i, i7);
                    System.arraycopy(objArr, i6 << 1, this.c, i2, i7 << 1);
                }
            } else {
                if (i < i5) {
                    int i8 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.c;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.c;
                int i10 = i5 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.d) {
            this.d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V m(int i) {
        return (V) this.c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int e2;
        int i2 = this.d;
        if (k == null) {
            e2 = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            e2 = e(k, hashCode);
        }
        if (e2 >= 0) {
            int i3 = (e2 << 1) + 1;
            Object[] objArr = this.c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~e2;
        int[] iArr = this.b;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.c;
            a(i5);
            if (i2 == this.d) {
                int[] iArr2 = this.b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.c, 0, objArr2.length);
                }
                d(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.d - i4) << 1);
        }
        int i7 = this.d;
        if (i2 == i7) {
            int[] iArr4 = this.b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f2 = f(k);
        if (f2 >= 0) {
            return l(f2, v);
        }
        return null;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        if (isEmpty()) {
            return C0059ao.a(2444);
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(C0059ao.a(2445));
            }
            K i2 = i(i);
            String a = C0059ao.a(2446);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append(a);
            }
            sb.append('=');
            V m = m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append(a);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 >= 0) {
            V m = m(f2);
            if (obj2 == m || (obj2 != null && obj2.equals(m))) {
                k(f2);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int f2 = f(k);
        if (f2 >= 0) {
            V m = m(f2);
            if (m == v || (v != null && v.equals(m))) {
                l(f2, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public u4(int i) {
        if (i == 0) {
            this.b = q4.a;
            this.c = q4.c;
        } else {
            a(i);
        }
        this.d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u4(u4<K, V> u4Var) {
        this();
        if (u4Var != 0) {
            j(u4Var);
        }
    }
}
