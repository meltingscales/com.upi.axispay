package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s4  reason: default package */
/* loaded from: classes.dex */
public class s4<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public s4(int i) {
        if (i > 0) {
            this.maxSize = i;
            this.map = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(449));
    }

    private int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(C0059ao.a(450) + k + C0059ao.a(451) + v);
    }

    public V create(K k) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final V get(K k) {
        V put;
        Objects.requireNonNull(k, C0059ao.a(452));
        synchronized (this) {
            V v = this.map.get(k);
            if (v != null) {
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V create = create(k);
            if (create == null) {
                return null;
            }
            synchronized (this) {
                this.createCount++;
                put = this.map.put(k, create);
                if (put != null) {
                    this.map.put(k, put);
                } else {
                    this.size += safeSizeOf(k, create);
                }
            }
            if (put != null) {
                entryRemoved(false, k, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final V put(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.putCount++;
                this.size += safeSizeOf(k, v);
                put = this.map.put(k, v);
                if (put != null) {
                    this.size -= safeSizeOf(k, put);
                }
            }
            if (put != null) {
                entryRemoved(false, k, put, v);
            }
            trimToSize(this.maxSize);
            return put;
        }
        throw new NullPointerException(C0059ao.a(453));
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final V remove(K k) {
        V remove;
        Objects.requireNonNull(k, C0059ao.a(454));
        synchronized (this) {
            remove = this.map.remove(k);
            if (remove != null) {
                this.size -= safeSizeOf(k, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, k, remove, null);
        }
        return remove;
    }

    public void resize(int i) {
        if (i > 0) {
            synchronized (this) {
                this.maxSize = i;
            }
            trimToSize(i);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(455));
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(K k, V v) {
        return 1;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.hitCount;
        i2 = this.missCount + i;
        return String.format(Locale.US, C0059ao.a(456), Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + myunmn.C0059ao.a(457));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            monitor-enter(r5)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L76
            if (r1 < 0) goto L52
            java.util.LinkedHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L76
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L11
            int r1 = r5.size     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L52
        L11:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L76
            if (r1 <= r6) goto L50
            java.util.LinkedHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L76
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L76
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L76
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L76
            java.util.LinkedHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L76
            r3.remove(r2)     // Catch: java.lang.Throwable -> L76
            int r3 = r5.size     // Catch: java.lang.Throwable -> L76
            int r4 = r5.safeSizeOf(r2, r1)     // Catch: java.lang.Throwable -> L76
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L76
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L76
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L76
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            r3 = 0
            r5.entryRemoved(r4, r2, r1, r3)
            goto L0
        L50:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            return
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L76
            r1.append(r2)     // Catch: java.lang.Throwable -> L76
            r0 = 457(0x1c9, float:6.4E-43)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L76
            r1.append(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L76
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L76
        L76:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4.trimToSize(int):void");
    }
}
