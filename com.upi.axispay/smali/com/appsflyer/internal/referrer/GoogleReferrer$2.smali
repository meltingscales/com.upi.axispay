.class public final Lcom/appsflyer/internal/referrer/GoogleReferrer$2;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/android/installreferrer/api/InstallReferrerStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/referrer/GoogleReferrer;->start(Landroid/content/Context;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic ı:Landroid/content/Context;

.field private synthetic ǃ:Lcom/android/installreferrer/api/InstallReferrerClient;

.field private synthetic ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

.field private synthetic ι:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/referrer/GoogleReferrer;Landroid/content/Context;Lcom/android/installreferrer/api/InstallReferrerClient;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iput-object p2, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ı:Landroid/content/Context;

    iput-object p3, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ǃ:Lcom/android/installreferrer/api/InstallReferrerClient;

    iput-object p4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ι:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInstallReferrerServiceDisconnected()V
    .locals 1

    const v0, 0x2abf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    return-void
.end method

.method public final onInstallReferrerSetupFinished(I)V
    .locals 9

    const v0, 0x2ac0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x2ac1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x2ac2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1
    iget-object v4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v4, v4, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const v0, 0x2ac3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v4, v4, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2ac4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v0, 0x2ac5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v4, v4, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    iget-object v5, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ı:Landroid/content/Context;

    const v0, 0x2ac6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/appsflyer/AndroidUtils;->getVersionCode(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const v0, 0x2ac7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v4, v4, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    iget-object v5, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ı:Landroid/content/Context;

    invoke-static {v5, v6}, Lcom/appsflyer/AndroidUtils;->getVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const v0, 0x2ac8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v4, v4, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    new-instance v5, Lcom/appsflyer/internal/referrer/MandatoryFields;

    invoke-direct {v5}, Lcom/appsflyer/internal/referrer/MandatoryFields;-><init>()V

    invoke-interface {v4, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/4 v4, -0x1

    const v0, 0x2ac9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-eq p1, v4, :cond_6

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const v0, 0x2aca

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    const v0, 0x2acb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object p1, p1, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2acc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_1
    const v0, 0x2acd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object p1, p1, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2ace

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object p1, p1, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2acf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x2ad0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object p1, p1, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2ad1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    const v0, 0x2ad2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ǃ:Lcom/android/installreferrer/api/InstallReferrerClient;

    invoke-virtual {p1}, Lcom/android/installreferrer/api/InstallReferrerClient;->isReady()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 16
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ǃ:Lcom/android/installreferrer/api/InstallReferrerClient;

    invoke-virtual {p1}, Lcom/android/installreferrer/api/InstallReferrerClient;->getInstallReferrer()Lcom/android/installreferrer/api/ReferrerDetails;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallReferrer()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 18
    iget-object v4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v4, v4, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    const v0, 0x2ad3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget-object v4, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v4, v4, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2ad4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_4
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getReferrerClickTimestampSeconds()J

    move-result-wide v4

    .line 21
    iget-object v2, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v2, v2, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    const v0, 0x2ad5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    iget-object v2, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v2, v2, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2ad6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallBeginTimestampSeconds()J

    move-result-wide v4

    .line 24
    iget-object v2, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v2, v2, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    const v0, 0x2ad7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iget-object v2, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v2, v2, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2ad8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :try_start_1
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getGooglePlayInstantParam()Z

    move-result v4

    .line 28
    iget-object v5, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v5, v5, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {v5, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    const v0, 0x2ad9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getReferrerClickTimestampServerSeconds()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x2ada

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallBeginTimestampServerSeconds()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x2adb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallVersion()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    :catch_1
    :try_start_3
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object p1, p1, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2adc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 34
    :cond_5
    invoke-static {v2}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    .line 35
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object p1, p1, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    invoke-interface {p1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    const v0, 0x2add

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    .line 37
    iget-object v1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object v1, v1, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    const v0, 0x2ade

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    iget-object p1, p1, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    const v0, 0x2adf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_0
    const v0, 0x2ae0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 40
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 41
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ɩ:Lcom/appsflyer/internal/referrer/GoogleReferrer;

    .line 42
    iget-object v1, p1, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p1, Lcom/appsflyer/internal/referrer/Referrer;->Ι:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const v0, 0x2ae1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v1, Lcom/appsflyer/internal/referrer/Referrer$State;->FINISHED:Lcom/appsflyer/internal/referrer/Referrer$State;

    iput-object v1, p1, Lcom/appsflyer/internal/referrer/Referrer;->ǃ:Lcom/appsflyer/internal/referrer/Referrer$State;

    .line 44
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ι:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 45
    iget-object p1, p0, Lcom/appsflyer/internal/referrer/GoogleReferrer$2;->ǃ:Lcom/android/installreferrer/api/InstallReferrerClient;

    invoke-virtual {p1}, Lcom/android/installreferrer/api/InstallReferrerClient;->endConnection()V

    return-void
.end method
