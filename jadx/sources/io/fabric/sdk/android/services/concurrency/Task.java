package io.fabric.sdk.android.services.concurrency;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Task {
    Throwable getError();

    boolean isFinished();

    void setError(Throwable th);

    void setFinished(boolean z);
}
