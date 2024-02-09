package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qj0  reason: default package */
/* loaded from: classes.dex */
public class qj0 extends pj0 {
    public static final <K, V> Map<K, V> d() {
        return lj0.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        yl0.e(map, C0059ao.a(10140));
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : pj0.c(map);
        }
        return d();
    }

    public static final <K, V> void f(Map<? super K, ? super V> map, Iterable<? extends gi0<? extends K, ? extends V>> iterable) {
        yl0.e(map, C0059ao.a(10141));
        yl0.e(iterable, C0059ao.a(10142));
        for (gi0<? extends K, ? extends V> gi0Var : iterable) {
            map.put((K) gi0Var.a(), (V) gi0Var.b());
        }
    }

    public static final <K, V> Map<K, V> g(Iterable<? extends gi0<? extends K, ? extends V>> iterable) {
        yl0.e(iterable, C0059ao.a(10143));
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return pj0.b(iterable instanceof List ? (gi0<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(pj0.a(collection.size()));
                h(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return d();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        h(iterable, linkedHashMap2);
        return e(linkedHashMap2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h(Iterable<? extends gi0<? extends K, ? extends V>> iterable, M m) {
        yl0.e(iterable, C0059ao.a(10144));
        yl0.e(m, C0059ao.a(10145));
        f(m, iterable);
        return m;
    }

    public static final <K, V> Map<K, V> i(Map<? extends K, ? extends V> map) {
        yl0.e(map, C0059ao.a(10146));
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return j(map);
            }
            return pj0.c(map);
        }
        return d();
    }

    public static final <K, V> Map<K, V> j(Map<? extends K, ? extends V> map) {
        yl0.e(map, C0059ao.a(10147));
        return new LinkedHashMap(map);
    }
}
