package com.google.firebase.inject;

import com.google.firebase.annotations.DeferredApi;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Deferred<T> {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface DeferredHandler<T> {
        @DeferredApi
        void handle(Provider<T> provider);
    }

    void whenAvailable(DeferredHandler<T> deferredHandler);
}
