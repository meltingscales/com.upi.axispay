package io.fabric.sdk.android.services.concurrency.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DefaultRetryPolicy implements RetryPolicy {
    private final int maxRetries;

    public DefaultRetryPolicy() {
        this(1);
    }

    @Override // io.fabric.sdk.android.services.concurrency.internal.RetryPolicy
    public boolean shouldRetry(int i, Throwable th) {
        return i < this.maxRetries;
    }

    public DefaultRetryPolicy(int i) {
        this.maxRetries = i;
    }
}
