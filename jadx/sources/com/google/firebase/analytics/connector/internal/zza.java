package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface zza {
    void registerEventNames(Set<String> set);

    void unregisterEventNames();

    AnalyticsConnector.AnalyticsConnectorListener zzju();
}
