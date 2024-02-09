package io.fabric.sdk.android.services.concurrency;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface PriorityProvider<T> extends Comparable<T> {
    Priority getPriority();
}
