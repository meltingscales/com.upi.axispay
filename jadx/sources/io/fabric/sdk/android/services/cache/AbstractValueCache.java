package io.fabric.sdk.android.services.cache;

import android.content.Context;
import java.util.Objects;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AbstractValueCache<T> implements ValueCache<T> {
    private final ValueCache<T> childCache;

    public AbstractValueCache() {
        this(null);
    }

    private void cache(Context context, T t) {
        Objects.requireNonNull(t);
        cacheValue(context, t);
    }

    public abstract void cacheValue(Context context, T t);

    public abstract void doInvalidate(Context context);

    @Override // io.fabric.sdk.android.services.cache.ValueCache
    public final synchronized T get(Context context, ValueLoader<T> valueLoader) throws Exception {
        T cached;
        cached = getCached(context);
        if (cached == null) {
            ValueCache<T> valueCache = this.childCache;
            cached = valueCache != null ? valueCache.get(context, valueLoader) : valueLoader.load(context);
            cache(context, cached);
        }
        return cached;
    }

    public abstract T getCached(Context context);

    @Override // io.fabric.sdk.android.services.cache.ValueCache
    public final synchronized void invalidate(Context context) {
        doInvalidate(context);
    }

    public AbstractValueCache(ValueCache<T> valueCache) {
        this.childCache = valueCache;
    }
}
