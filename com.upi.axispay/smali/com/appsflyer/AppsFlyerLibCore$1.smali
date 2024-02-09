.class public final Lcom/appsflyer/AppsFlyerLibCore$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/appsflyer/Foreground$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/AppsFlyerLibCore;->ι(Landroid/content/Context;Ljava/lang/String;Lcom/appsflyer/AppsFlyerTrackingRequestListener;Lcom/appsflyer/attribution/AppsFlyerRequestListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic ı:Ljava/lang/String;

.field private synthetic ǃ:Lcom/appsflyer/attribution/AppsFlyerRequestListener;

.field private synthetic ɩ:Lcom/appsflyer/AppsFlyerTrackingRequestListener;

.field private synthetic ι:Lcom/appsflyer/AppsFlyerLibCore;


# direct methods
.method public constructor <init>(Lcom/appsflyer/AppsFlyerLibCore;Ljava/lang/String;Lcom/appsflyer/AppsFlyerTrackingRequestListener;Lcom/appsflyer/attribution/AppsFlyerRequestListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    iput-object p2, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ı:Ljava/lang/String;

    iput-object p3, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ɩ:Lcom/appsflyer/AppsFlyerTrackingRequestListener;

    iput-object p4, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ǃ:Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBecameBackground(Landroid/content/Context;)V
    .locals 7

    const v0, 0x13d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/appsflyer/AppsFlyerLibCore;->ı(Lcom/appsflyer/AppsFlyerLibCore;J)J

    .line 3
    new-instance v1, Lcom/appsflyer/internal/EventDataCollector;

    invoke-direct {v1, p1}, Lcom/appsflyer/internal/EventDataCollector;-><init>(Landroid/content/Context;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    .line 4
    invoke-static {v3}, Lcom/appsflyer/AppsFlyerLibCore;->ǃ(Lcom/appsflyer/AppsFlyerLibCore;)J

    move-result-wide v3

    iget-object v5, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v5}, Lcom/appsflyer/AppsFlyerLibCore;->ɩ(Lcom/appsflyer/AppsFlyerLibCore;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    .line 5
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v2

    const v0, 0x13e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v2, v3}, Lcom/appsflyer/internal/EventDataCollector;->set(Ljava/lang/String;J)V

    const v0, 0x13f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/appsflyer/AppsFlyerLibCore;->ı(Ljava/lang/ref/WeakReference;)V

    .line 8
    invoke-static {}, Lcom/appsflyer/internal/ae;->ǃ()Lcom/appsflyer/internal/ae;

    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/appsflyer/internal/ae;->Ӏ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {v1}, Lcom/appsflyer/internal/ae;->ι()V

    if-eqz p1, :cond_0

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 13
    invoke-static {v2, v3}, Lcom/appsflyer/internal/ae;->ı(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 14
    :cond_0
    invoke-virtual {v1}, Lcom/appsflyer/internal/ae;->ı()V

    goto :goto_0

    :cond_1
    const v0, 0x140

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 16
    :goto_0
    invoke-static {}, Lcom/appsflyer/AFExecutor;->getInstance()Lcom/appsflyer/AFExecutor;

    move-result-object v1

    .line 17
    :try_start_0
    iget-object v2, v1, Lcom/appsflyer/AFExecutor;->ι:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v2}, Lcom/appsflyer/AFExecutor;->ɩ(Ljava/util/concurrent/ExecutorService;)V

    .line 18
    iget-object v1, v1, Lcom/appsflyer/AFExecutor;->ı:Ljava/util/concurrent/Executor;

    instance-of v2, v1, Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v2, :cond_2

    .line 19
    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v1}, Lcom/appsflyer/AFExecutor;->ɩ(Ljava/util/concurrent/ExecutorService;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    const v0, 0x141

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-static {v2, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    :cond_2
    :goto_1
    invoke-static {p1}, Lcom/appsflyer/AFSensorManager;->Ι(Landroid/content/Context;)Lcom/appsflyer/AFSensorManager;

    move-result-object p1

    .line 22
    iget-object v1, p1, Lcom/appsflyer/AFSensorManager;->ǃ:Landroid/os/Handler;

    iget-object p1, p1, Lcom/appsflyer/AFSensorManager;->ɹ:Ljava/lang/Runnable;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onBecameForeground(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {p1}, Lcom/appsflyer/AppsFlyerLibCore;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/AppsFlyerLibCore;->getLaunchCounter(Landroid/content/SharedPreferences;Z)I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 2
    invoke-static {p1}, Lcom/appsflyer/AFSensorManager;->Ι(Landroid/content/Context;)Lcom/appsflyer/AFSensorManager;

    move-result-object v0

    .line 3
    iget-object v1, v0, Lcom/appsflyer/AFSensorManager;->ǃ:Landroid/os/Handler;

    iget-object v2, v0, Lcom/appsflyer/AFSensorManager;->ɹ:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 4
    iget-object v1, v0, Lcom/appsflyer/AFSensorManager;->ǃ:Landroid/os/Handler;

    iget-object v0, v0, Lcom/appsflyer/AFSensorManager;->Ι:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    const v0, 0x142

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/appsflyer/AppsFlyerLibCore;->ǃ(Lcom/appsflyer/AppsFlyerLibCore;J)J

    .line 7
    iget-object v0, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    new-instance v1, Lcom/appsflyer/internal/model/event/Launch;

    invoke-direct {v1}, Lcom/appsflyer/internal/model/event/Launch;-><init>()V

    invoke-virtual {v1, p1}, Lcom/appsflyer/AFEvent;->context(Landroid/content/Context;)Lcom/appsflyer/AFEvent;

    move-result-object p1

    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ı:Ljava/lang/String;

    .line 8
    invoke-virtual {p1, v1}, Lcom/appsflyer/AFEvent;->key(Ljava/lang/String;)Lcom/appsflyer/AFEvent;

    move-result-object p1

    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ɩ:Lcom/appsflyer/AppsFlyerTrackingRequestListener;

    .line 9
    iput-object v1, p1, Lcom/appsflyer/AFEvent;->Ι:Lcom/appsflyer/AppsFlyerTrackingRequestListener;

    .line 10
    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$1;->ǃ:Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    .line 11
    invoke-virtual {p1, v1}, Lcom/appsflyer/AFEvent;->requestListener(Lcom/appsflyer/attribution/AppsFlyerRequestListener;)Lcom/appsflyer/AFEvent;

    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLibCore;->ı(Lcom/appsflyer/AFEvent;)V

    return-void
.end method
