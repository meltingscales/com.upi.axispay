package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: t4  reason: default package */
/* loaded from: classes.dex */
public abstract class t4<K, V> {
    public t4<K, V>.b a;
    public t4<K, V>.c b;
    public t4<K, V>.e c;

    /* compiled from: AxisPay */
    /* renamed from: t4$a */
    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {
        public final int b;
        public int c;
        public int d;
        public boolean e = false;

        public a(int i) {
            this.b = i;
            this.c = t4.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d < this.c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) t4.this.b(this.d, this.b);
                this.d++;
                this.e = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.e) {
                int i = this.d - 1;
                this.d = i;
                this.c--;
                this.e = false;
                t4.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t4$b */
    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Map.Entry) obj);
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = t4.this.d();
            for (Map.Entry<K, V> entry : collection) {
                t4.this.g(entry.getKey(), entry.getValue());
            }
            return d != t4.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            t4.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e = t4.this.e(entry.getKey());
                if (e < 0) {
                    return false;
                }
                return q4.c(t4.this.b(e, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return t4.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int d = t4.this.d() - 1; d >= 0; d--) {
                Object b = t4.this.b(d, 0);
                Object b2 = t4.this.b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return t4.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return t4.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t4$c */
    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            t4.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return t4.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return t4.j(t4.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return t4.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int d = t4.this.d() - 1; d >= 0; d--) {
                Object b = t4.this.b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return t4.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e = t4.this.e(obj);
            if (e >= 0) {
                t4.this.h(e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return t4.o(t4.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return t4.p(t4.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return t4.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return t4.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) t4.this.r(tArr, 0);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t4$d */
    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int b;
        public boolean d = false;
        public int c = -1;

        public d() {
            this.b = t4.this.d() - 1;
        }

        public Map.Entry<K, V> a() {
            if (hasNext()) {
                this.c++;
                this.d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.d) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return q4.c(entry.getKey(), t4.this.b(this.c, 0)) && q4.c(entry.getValue(), t4.this.b(this.c, 1));
                }
                return false;
            }
            throw new IllegalStateException(C0059ao.a(9172));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.d) {
                return (K) t4.this.b(this.c, 0);
            }
            throw new IllegalStateException(C0059ao.a(9173));
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.d) {
                return (V) t4.this.b(this.c, 1);
            }
            throw new IllegalStateException(C0059ao.a(9174));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.d) {
                Object b = t4.this.b(this.c, 0);
                Object b2 = t4.this.b(this.c, 1);
                return (b == null ? 0 : b.hashCode()) ^ (b2 != null ? b2.hashCode() : 0);
            }
            throw new IllegalStateException(C0059ao.a(9175));
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            a();
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.d) {
                t4.this.h(this.c);
                this.c--;
                this.b--;
                this.d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.d) {
                return (V) t4.this.i(this.c, v);
            }
            throw new IllegalStateException(C0059ao.a(9176));
        }

        public String toString() {
            return getKey() + C0059ao.a(9177) + getValue();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t4$e */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            t4.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return t4.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return t4.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f = t4.this.f(obj);
            if (f >= 0) {
                t4.this.h(f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d = t4.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(t4.this.b(i, 1))) {
                    t4.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d = t4.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(t4.this.b(i, 1))) {
                    t4.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return t4.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return t4.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) t4.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public Set<Map.Entry<K, V>> l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set<K> m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection<V> n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int i) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] r(T[] tArr, int i) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2));
        }
        for (int i2 = 0; i2 < d2; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
