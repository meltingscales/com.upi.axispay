package com.google.android.gms.tasks;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(Task<TResult> task) throws Exception;
}
