package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface CrashlyticsNativeComponent {
    NativeSessionFileProvider getSessionFileProvider(String str);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(String str);

    void prepareNativeSession(String str, String str2, long j, StaticSessionData staticSessionData);
}
