.class public Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final context:Landroid/content/Context;

.field private final fileRollOverManager:Lio/fabric/sdk/android/services/events/FileRollOverManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/fabric/sdk/android/services/events/FileRollOverManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;->fileRollOverManager:Lio/fabric/sdk/android/services/events/FileRollOverManager;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;->context:Landroid/content/Context;

    const v0, 0x3973

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;->fileRollOverManager:Lio/fabric/sdk/android/services/events/FileRollOverManager;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/events/FileRollOverManager;->rollFileOver()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;->fileRollOverManager:Lio/fabric/sdk/android/services/events/FileRollOverManager;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/events/FileRollOverManager;->cancelTimeBasedFileRollOver()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    iget-object v2, p0, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;->context:Landroid/content/Context;

    const v0, 0x3974

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
