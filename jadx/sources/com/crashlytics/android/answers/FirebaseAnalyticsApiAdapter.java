package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FirebaseAnalyticsApiAdapter {
    private final Context context;
    private EventLogger eventLogger;
    private final FirebaseAnalyticsEventMapper eventMapper;

    public FirebaseAnalyticsApiAdapter(Context context) {
        this(context, new FirebaseAnalyticsEventMapper());
    }

    public EventLogger getFirebaseAnalytics() {
        if (this.eventLogger == null) {
            this.eventLogger = AppMeasurementEventLogger.getEventLogger(this.context);
        }
        return this.eventLogger;
    }

    public void processEvent(SessionEvent sessionEvent) {
        EventLogger firebaseAnalytics = getFirebaseAnalytics();
        String a = C0059ao.a(4266);
        if (firebaseAnalytics == null) {
            Fabric.getLogger().d(a, C0059ao.a(4267));
            return;
        }
        FirebaseAnalyticsEvent mapEvent = this.eventMapper.mapEvent(sessionEvent);
        if (mapEvent == null) {
            Logger logger = Fabric.getLogger();
            logger.d(a, C0059ao.a(4268) + sessionEvent);
            return;
        }
        firebaseAnalytics.logEvent(mapEvent.getEventName(), mapEvent.getEventParams());
        if (C0059ao.a(4269).equals(sessionEvent.predefinedType)) {
            firebaseAnalytics.logEvent(C0059ao.a(4270), mapEvent.getEventParams());
        }
    }

    public FirebaseAnalyticsApiAdapter(Context context, FirebaseAnalyticsEventMapper firebaseAnalyticsEventMapper) {
        this.context = context;
        this.eventMapper = firebaseAnalyticsEventMapper;
    }
}
