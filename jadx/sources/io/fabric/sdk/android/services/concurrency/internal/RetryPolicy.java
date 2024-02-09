package io.fabric.sdk.android.services.concurrency.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface RetryPolicy {
    boolean shouldRetry(int i, Throwable th);
}
