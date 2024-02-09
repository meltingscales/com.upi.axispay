package com.crashlytics.android.answers;

import android.os.Bundle;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface EventLogger {
    void logEvent(String str, Bundle bundle);

    void logEvent(String str, String str2, Bundle bundle);
}
