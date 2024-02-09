package io.fabric.sdk.android.services.cache;

import android.content.Context;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MemoryValueCache<T> extends AbstractValueCache<T> {
    private T value;

    public MemoryValueCache() {
        this(null);
    }

    @Override // io.fabric.sdk.android.services.cache.AbstractValueCache
    public void cacheValue(Context context, T t) {
        this.value = t;
    }

    @Override // io.fabric.sdk.android.services.cache.AbstractValueCache
    public void doInvalidate(Context context) {
        this.value = null;
    }

    @Override // io.fabric.sdk.android.services.cache.AbstractValueCache
    public T getCached(Context context) {
        return this.value;
    }

    public MemoryValueCache(ValueCache<T> valueCache) {
        super(valueCache);
    }
}
