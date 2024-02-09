package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a4  reason: default package */
/* loaded from: classes.dex */
public class a4<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> b;
    public c<K, V> c;
    public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    /* compiled from: AxisPay */
    /* renamed from: a4$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.a4.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        @Override // defpackage.a4.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a4$b */
    /* loaded from: classes.dex */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.a4.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // defpackage.a4.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a4$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K b;
        public final V c;
        public c<K, V> d;
        public c<K, V> e;

        public c(K k, V v) {
            this.b = k;
            this.c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.b.equals(cVar.b) && this.c.equals(cVar.c);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.b.hashCode() ^ this.c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException(C0059ao.a(10980));
        }

        public String toString() {
            return this.b + C0059ao.a(10981) + this.c;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a4$d */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> b;
        public boolean c = true;

        public d() {
        }

        @Override // defpackage.a4.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.b = cVar3;
                this.c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.c) {
                this.c = false;
                this.b = a4.this.b;
            } else {
                c<K, V> cVar = this.b;
                this.b = cVar != null ? cVar.d : null;
            }
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c) {
                return a4.this.b != null;
            }
            c<K, V> cVar = this.b;
            return (cVar == null || cVar.d == null) ? false : true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a4$e */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> b;
        public c<K, V> c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.b = cVar2;
            this.c = cVar;
        }

        @Override // defpackage.a4.f
        public void a(c<K, V> cVar) {
            if (this.b == cVar && cVar == this.c) {
                this.c = null;
                this.b = null;
            }
            c<K, V> cVar2 = this.b;
            if (cVar2 == cVar) {
                this.b = b(cVar2);
            }
            if (this.c == cVar) {
                this.c = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.c;
            this.c = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.c;
            c<K, V> cVar2 = this.b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c != null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a4$f */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        b bVar = new b(this.c, this.b);
        this.d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry<K, V> b() {
        return this.b;
    }

    public c<K, V> c(K k) {
        c<K, V> cVar = this.b;
        while (cVar != null && !cVar.b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    public a4<K, V>.d d() {
        a4<K, V>.d dVar = new d();
        this.d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a4) {
            a4 a4Var = (a4) obj;
            if (size() != a4Var.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = a4Var.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public c<K, V> f(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.c;
        if (cVar2 == null) {
            this.b = cVar;
            this.c = cVar;
            return cVar;
        }
        cVar2.d = cVar;
        cVar.e = cVar2;
        this.c = cVar;
        return cVar;
    }

    public V g(K k, V v) {
        c<K, V> c2 = c(k);
        if (c2 != null) {
            return c2.c;
        }
        f(k, v);
        return null;
    }

    public V h(K k) {
        c<K, V> c2 = c(k);
        if (c2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f<K, V> fVar : this.d.keySet()) {
                fVar.a(c2);
            }
        }
        c<K, V> cVar = c2.e;
        if (cVar != null) {
            cVar.d = c2.d;
        } else {
            this.b = c2.d;
        }
        c<K, V> cVar2 = c2.d;
        if (cVar2 != null) {
            cVar2.e = cVar;
        } else {
            this.c = cVar;
        }
        c2.d = null;
        c2.e = null;
        return c2.c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.b, this.c);
        this.d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(15662));
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(C0059ao.a(15663));
            }
        }
        sb.append(C0059ao.a(15664));
        return sb.toString();
    }
}
