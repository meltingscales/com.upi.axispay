package defpackage;

import defpackage.a4;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AxisPay */
/* renamed from: z3  reason: default package */
/* loaded from: classes.dex */
public class z3<K, V> extends a4<K, V> {
    public HashMap<K, a4.c<K, V>> f = new HashMap<>();

    @Override // defpackage.a4
    public a4.c<K, V> c(K k) {
        return this.f.get(k);
    }

    public boolean contains(K k) {
        return this.f.containsKey(k);
    }

    @Override // defpackage.a4
    public V g(K k, V v) {
        a4.c<K, V> c = c(k);
        if (c != null) {
            return c.c;
        }
        this.f.put(k, f(k, v));
        return null;
    }

    @Override // defpackage.a4
    public V h(K k) {
        V v = (V) super.h(k);
        this.f.remove(k);
        return v;
    }

    public Map.Entry<K, V> i(K k) {
        if (contains(k)) {
            return this.f.get(k).e;
        }
        return null;
    }
}
