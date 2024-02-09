package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import io.fabric.sdk.android.services.events.EventsStorage;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.io.IOException;
import java.util.UUID;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SessionAnalyticsFilesManager extends EventsFilesManager<SessionEvent> {
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = null;
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = null;
    private AnalyticsSettingsData analyticsSettingsData;

    static {
        C0059ao.a(SessionAnalyticsFilesManager.class, 78);
    }

    public SessionAnalyticsFilesManager(Context context, SessionEventTransform sessionEventTransform, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage) throws IOException {
        super(context, sessionEventTransform, currentTimeProvider, eventsStorage, 100);
    }

    @Override // io.fabric.sdk.android.services.events.EventsFilesManager
    public String generateUniqueRollOverFileName() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(6377));
        String a = C0059ao.a(6378);
        sb.append(a);
        sb.append(randomUUID.toString());
        sb.append(a);
        sb.append(this.currentTimeProvider.getCurrentTimeMillis());
        sb.append(C0059ao.a(6379));
        return sb.toString();
    }

    @Override // io.fabric.sdk.android.services.events.EventsFilesManager
    public int getMaxByteSizePerFile() {
        AnalyticsSettingsData analyticsSettingsData = this.analyticsSettingsData;
        return analyticsSettingsData == null ? super.getMaxByteSizePerFile() : analyticsSettingsData.maxByteSizePerFile;
    }

    @Override // io.fabric.sdk.android.services.events.EventsFilesManager
    public int getMaxFilesToKeep() {
        AnalyticsSettingsData analyticsSettingsData = this.analyticsSettingsData;
        return analyticsSettingsData == null ? super.getMaxFilesToKeep() : analyticsSettingsData.maxPendingSendFileCount;
    }

    public void setAnalyticsSettingsData(AnalyticsSettingsData analyticsSettingsData) {
        this.analyticsSettingsData = analyticsSettingsData;
    }
}
