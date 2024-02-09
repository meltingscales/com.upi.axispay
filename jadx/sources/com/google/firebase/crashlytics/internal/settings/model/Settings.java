package com.google.firebase.crashlytics.internal.settings.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Settings {
    int getCacheDuration();

    long getExpiresAtMillis();

    FeaturesSettingsData getFeaturesData();

    SessionSettingsData getSessionData();

    int getSettingsVersion();

    boolean isExpired(long j);
}
