package com.google.firebase.crashlytics.internal.common;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SystemCurrentTimeProvider implements CurrentTimeProvider {
    @Override // com.google.firebase.crashlytics.internal.common.CurrentTimeProvider
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
