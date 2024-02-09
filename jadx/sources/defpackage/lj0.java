package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lj0  reason: default package */
/* loaded from: classes.dex */
public final class lj0 implements Map, Serializable, om0 {
    public static final lj0 b = new lj0();

    public boolean a(Void r2) {
        yl0.e(r2, C0059ao.a(8638));
        return false;
    }

    @Override // java.util.Map
    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    public Set<Map.Entry> c() {
        return mj0.b;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(C0059ao.a(8639));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    public Set<Object> d() {
        return mj0.b;
    }

    public int e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Collection f() {
        return kj0.b;
    }

    public Void g(Object obj, Void r2) {
        throw new UnsupportedOperationException(C0059ao.a(8640));
    }

    public Void h(Object obj) {
        throw new UnsupportedOperationException(C0059ao.a(8641));
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        g(obj, (Void) obj2);
        throw null;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException(C0059ao.a(8642));
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        h(obj);
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return C0059ao.a(8643);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return f();
    }
}
