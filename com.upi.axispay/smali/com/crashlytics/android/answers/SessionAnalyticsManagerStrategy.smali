.class public interface abstract Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lio/fabric/sdk/android/services/events/FileRollOverManager;


# virtual methods
.method public abstract deleteAllEvents()V
.end method

.method public abstract processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;)V
.end method

.method public abstract sendEvents()V
.end method

.method public abstract setAnalyticsSettingsData(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Ljava/lang/String;)V
.end method
