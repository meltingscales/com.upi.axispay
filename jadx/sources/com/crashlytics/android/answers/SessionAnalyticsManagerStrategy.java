package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.services.events.FileRollOverManager;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface SessionAnalyticsManagerStrategy extends FileRollOverManager {
    void deleteAllEvents();

    void processEvent(SessionEvent.Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(AnalyticsSettingsData analyticsSettingsData, String str);
}
