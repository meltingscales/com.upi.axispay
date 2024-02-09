package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfm<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzfk> zzaic;

    private zzfm(Map.Entry<K, zzfk> entry) {
        this.zzaic = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzaic.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zzaic.getValue() == null) {
            return null;
        }
        return zzfk.zzne();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzgh) {
            return this.zzaic.getValue().zzi((zzgh) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzfk zznf() {
        return this.zzaic.getValue();
    }
}
