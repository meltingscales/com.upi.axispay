package io.fabric.sdk.android.services.cache;

import android.content.Context;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface ValueCache<T> {
    T get(Context context, ValueLoader<T> valueLoader) throws Exception;

    void invalidate(Context context);
}
