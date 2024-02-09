package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: p4  reason: default package */
/* loaded from: classes.dex */
public final class p4<E> implements Collection<E>, Set<E> {
    public static final int[] f = new int[0];
    public static final Object[] g = new Object[0];
    public static Object[] h;
    public static int i;
    public static Object[] j;
    public static int k;
    public int[] b;
    public Object[] c;
    public int d;
    public t4<E, E> e;

    /* compiled from: AxisPay */
    /* renamed from: p4$a */
    /* loaded from: classes.dex */
    public class a extends t4<E, E> {
        public a() {
        }

        @Override // defpackage.t4
        public void a() {
            p4.this.clear();
        }

        @Override // defpackage.t4
        public Object b(int i, int i2) {
            return p4.this.c[i];
        }

        @Override // defpackage.t4
        public Map<E, E> c() {
            throw new UnsupportedOperationException(C0059ao.a(2470));
        }

        @Override // defpackage.t4
        public int d() {
            return p4.this.d;
        }

        @Override // defpackage.t4
        public int e(Object obj) {
            return p4.this.indexOf(obj);
        }

        @Override // defpackage.t4
        public int f(Object obj) {
            return p4.this.indexOf(obj);
        }

        @Override // defpackage.t4
        public void g(E e, E e2) {
            p4.this.add(e);
        }

        @Override // defpackage.t4
        public void h(int i) {
            p4.this.g(i);
        }

        @Override // defpackage.t4
        public E i(int i, E e) {
            throw new UnsupportedOperationException(C0059ao.a(2471));
        }
    }

    public p4() {
        this(0);
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (p4.class) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (p4.class) {
                if (i < 10) {
                    objArr[0] = h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    h = objArr;
                    i++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (p4.class) {
                Object[] objArr = j;
                if (objArr != null) {
                    this.c = objArr;
                    j = (Object[]) objArr[0];
                    this.b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (p4.class) {
                Object[] objArr2 = h;
                if (objArr2 != null) {
                    this.c = objArr2;
                    h = (Object[]) objArr2[0];
                    this.b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.b = new int[i2];
        this.c = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i2;
        int e2;
        if (e == null) {
            e2 = f();
            i2 = 0;
        } else {
            int hashCode = e.hashCode();
            i2 = hashCode;
            e2 = e(e, hashCode);
        }
        if (e2 >= 0) {
            return false;
        }
        int i3 = ~e2;
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.c;
            a(i5);
            int[] iArr2 = this.b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.c, 0, objArr.length);
            }
            c(iArr, objArr, this.d);
        }
        int i6 = this.d;
        if (i3 < i6) {
            int[] iArr3 = this.b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.d - i3);
        }
        this.b[i3] = i2;
        this.c[i3] = e;
        this.d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.d + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    public void b(int i2) {
        int[] iArr = this.b;
        if (iArr.length < i2) {
            Object[] objArr = this.c;
            a(i2);
            int i3 = this.d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i3);
                System.arraycopy(objArr, 0, this.c, 0, this.d);
            }
            c(iArr, objArr, this.d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.d;
        if (i2 != 0) {
            c(this.b, this.c, i2);
            this.b = f;
            this.c = g;
            this.d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final t4<E, E> d() {
        if (this.e == null) {
            this.e = new a();
        }
        return this.e;
    }

    public final int e(Object obj, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = q4.a(this.b, i3, i2);
        if (a2 >= 0 && !obj.equals(this.c[a2])) {
            int i4 = a2 + 1;
            while (i4 < i3 && this.b[i4] == i2) {
                if (obj.equals(this.c[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.b[i5] == i2; i5--) {
                if (obj.equals(this.c[i5])) {
                    return i5;
                }
            }
            return ~i4;
        }
        return a2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.d; i2++) {
                try {
                    if (!set.contains(h(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = q4.a(this.b, i2, 0);
        if (a2 >= 0 && this.c[a2] != null) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.b[i3] == 0) {
                if (this.c[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.b[i4] == 0; i4--) {
                if (this.c[i4] == null) {
                    return i4;
                }
            }
            return ~i3;
        }
        return a2;
    }

    public E g(int i2) {
        Object[] objArr = this.c;
        E e = (E) objArr[i2];
        int i3 = this.d;
        if (i3 <= 1) {
            c(this.b, objArr, i3);
            this.b = f;
            this.c = g;
            this.d = 0;
        } else {
            int[] iArr = this.b;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.b, 0, i2);
                    System.arraycopy(objArr, 0, this.c, 0, i2);
                }
                int i4 = this.d;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, this.b, i2, i4 - i2);
                    System.arraycopy(objArr, i5, this.c, i2, this.d - i2);
                }
            } else {
                int i6 = i3 - 1;
                this.d = i6;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, iArr, i2, i6 - i2);
                    Object[] objArr2 = this.c;
                    System.arraycopy(objArr2, i7, objArr2, i2, this.d - i2);
                }
                this.c[this.d] = null;
            }
        }
        return e;
    }

    public E h(int i2) {
        return (E) this.c[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.b;
        int i2 = this.d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            g(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.c[i2])) {
                g(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.c, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return C0059ao.a(14097);
        }
        StringBuilder sb = new StringBuilder(this.d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 > 0) {
                sb.append(C0059ao.a(14098));
            }
            E h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append(C0059ao.a(14099));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public p4(int i2) {
        if (i2 == 0) {
            this.b = f;
            this.c = g;
        } else {
            a(i2);
        }
        this.d = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.d));
        }
        System.arraycopy(this.c, 0, tArr, 0, this.d);
        int length = tArr.length;
        int i2 = this.d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
