package com.google.firebase.crashlytics.internal.common;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface CrashlyticsLifecycleEvents {
    void onBeginSession(String str, long j);

    void onCustomKey(String str, String str2);

    void onLog(long j, String str);

    void onUserId(String str);
}
