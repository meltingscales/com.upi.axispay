package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.RetryState;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RetryManager {
    private static final long NANOSECONDS_IN_MS = 0;
    public long lastRetry;
    private RetryState retryState;

    static {
        C0059ao.a(RetryManager.class, 122);
    }

    public RetryManager(RetryState retryState) {
        Objects.requireNonNull(retryState, C0059ao.a(698));
        this.retryState = retryState;
    }

    public boolean canRetry(long j) {
        return j - this.lastRetry >= this.retryState.getRetryDelay() * 1000000;
    }

    public void recordRetry(long j) {
        this.lastRetry = j;
        this.retryState = this.retryState.nextRetryState();
    }

    public void reset() {
        this.lastRetry = 0L;
        this.retryState = this.retryState.initialRetryState();
    }
}
