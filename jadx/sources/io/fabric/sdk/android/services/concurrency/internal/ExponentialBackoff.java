package io.fabric.sdk.android.services.concurrency.internal;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ExponentialBackoff implements Backoff {
    private static final int DEFAULT_POWER = 0;
    private final long baseTimeMillis;
    private final int power;

    static {
        C0059ao.a(ExponentialBackoff.class, 383);
    }

    public ExponentialBackoff(long j) {
        this(j, 2);
    }

    @Override // io.fabric.sdk.android.services.concurrency.internal.Backoff
    public long getDelayMillis(int i) {
        return (long) (this.baseTimeMillis * Math.pow(this.power, i));
    }

    public ExponentialBackoff(long j, int i) {
        this.baseTimeMillis = j;
        this.power = i;
    }
}
