.class public Lio/fabric/sdk/android/services/settings/SettingsData;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

.field public final appData:Lio/fabric/sdk/android/services/settings/AppSettingsData;

.field public final betaSettingsData:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

.field public final cacheDuration:I

.field public final expiresAtMillis:J

.field public final featuresData:Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

.field public final promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

.field public final sessionData:Lio/fabric/sdk/android/services/settings/SessionSettingsData;

.field public final settingsVersion:I


# direct methods
.method public constructor <init>(JLio/fabric/sdk/android/services/settings/AppSettingsData;Lio/fabric/sdk/android/services/settings/SessionSettingsData;Lio/fabric/sdk/android/services/settings/PromptSettingsData;Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Lio/fabric/sdk/android/services/settings/BetaSettingsData;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->expiresAtMillis:J

    .line 3
    iput-object p3, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->appData:Lio/fabric/sdk/android/services/settings/AppSettingsData;

    .line 4
    iput-object p4, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->sessionData:Lio/fabric/sdk/android/services/settings/SessionSettingsData;

    .line 5
    iput-object p5, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    .line 6
    iput-object p6, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->featuresData:Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

    .line 7
    iput p9, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->settingsVersion:I

    .line 8
    iput p10, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->cacheDuration:I

    .line 9
    iput-object p7, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    .line 10
    iput-object p8, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->betaSettingsData:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    return-void
.end method


# virtual methods
.method public isExpired(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->expiresAtMillis:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
