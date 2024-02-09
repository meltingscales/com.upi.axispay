package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.DefaultRetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.ExponentialBackoff;
import io.fabric.sdk.android.services.concurrency.internal.RetryState;
import io.fabric.sdk.android.services.events.FilesSender;
import java.io.File;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AnswersRetryFilesSender implements FilesSender {
    private static final int BACKOFF_MS = 0;
    private static final int BACKOFF_POWER = 0;
    private static final double JITTER_PERCENT = 0.0d;
    private static final int MAX_RETRIES = 0;
    private final SessionAnalyticsFilesSender filesSender;
    private final RetryManager retryManager;

    static {
        C0059ao.a(AnswersRetryFilesSender.class, 298);
    }

    public AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionAnalyticsFilesSender, RetryManager retryManager) {
        this.filesSender = sessionAnalyticsFilesSender;
        this.retryManager = retryManager;
    }

    public static AnswersRetryFilesSender build(SessionAnalyticsFilesSender sessionAnalyticsFilesSender) {
        return new AnswersRetryFilesSender(sessionAnalyticsFilesSender, new RetryManager(new RetryState(new RandomBackoff(new ExponentialBackoff(1000L, 8), 0.1d), new DefaultRetryPolicy(5))));
    }

    @Override // io.fabric.sdk.android.services.events.FilesSender
    public boolean send(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.retryManager.canRetry(nanoTime)) {
            if (this.filesSender.send(list)) {
                this.retryManager.reset();
                return true;
            }
            this.retryManager.recordRetry(nanoTime);
        }
        return false;
    }
}
