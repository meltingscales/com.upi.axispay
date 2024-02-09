package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: AxisPay */
/* renamed from: o4  reason: default package */
/* loaded from: classes.dex */
public class o4<K, V> extends u4<K, V> implements Map<K, V> {
    public t4<K, V> i;

    /* compiled from: AxisPay */
    /* renamed from: o4$a */
    /* loaded from: classes.dex */
    public class a extends t4<K, V> {
        public a() {
        }

        @Override // defpackage.t4
        public void a() {
            o4.this.clear();
        }

        @Override // defpackage.t4
        public Object b(int i, int i2) {
            return o4.this.c[(i << 1) + i2];
        }

        @Override // defpackage.t4
        public Map<K, V> c() {
            return o4.this;
        }

        @Override // defpackage.t4
        public int d() {
            return o4.this.d;
        }

        @Override // defpackage.t4
        public int e(Object obj) {
            return o4.this.f(obj);
        }

        @Override // defpackage.t4
        public int f(Object obj) {
            return o4.this.h(obj);
        }

        @Override // defpackage.t4
        public void g(K k, V v) {
            o4.this.put(k, v);
        }

        @Override // defpackage.t4
        public void h(int i) {
            o4.this.k(i);
        }

        @Override // defpackage.t4
        public V i(int i, V v) {
            return o4.this.l(i, v);
        }
    }

    public o4() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return n().m();
    }

    public final t4<K, V> n() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    public boolean o(Collection<?> collection) {
        return t4.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return n().n();
    }

    public o4(int i) {
        super(i);
    }

    public o4(u4 u4Var) {
        super(u4Var);
    }
}
