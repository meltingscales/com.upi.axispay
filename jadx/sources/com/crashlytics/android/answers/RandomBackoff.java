package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import java.util.Objects;
import java.util.Random;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RandomBackoff implements Backoff {
    public final Backoff backoff;
    public final double jitterPercent;
    public final Random random;

    public RandomBackoff(Backoff backoff, double d) {
        this(backoff, d, new Random());
    }

    @Override // io.fabric.sdk.android.services.concurrency.internal.Backoff
    public long getDelayMillis(int i) {
        return (long) (randomJitter() * this.backoff.getDelayMillis(i));
    }

    public double randomJitter() {
        double d = this.jitterPercent;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.random.nextDouble());
    }

    public RandomBackoff(Backoff backoff, double d, Random random) {
        if (d >= 0.0d && d <= 1.0d) {
            Objects.requireNonNull(backoff, C0059ao.a(12686));
            Objects.requireNonNull(random, C0059ao.a(12687));
            this.backoff = backoff;
            this.jitterPercent = d;
            this.random = random;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(12688));
    }
}
