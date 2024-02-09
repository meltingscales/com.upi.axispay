package com.google.android.gms.tasks;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
