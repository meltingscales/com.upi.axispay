.class public final Lcom/appsflyer/Foreground$5$3;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/Foreground$5;->onActivityPaused(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ǃ:Lcom/appsflyer/Foreground$5;

.field private synthetic Ι:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/appsflyer/Foreground$5;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/Foreground$5$3;->ǃ:Lcom/appsflyer/Foreground$5;

    iput-object p2, p0, Lcom/appsflyer/Foreground$5$3;->Ι:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/appsflyer/Foreground$5$3;->ǃ:Lcom/appsflyer/Foreground$5;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/appsflyer/Foreground$5;->ι:Z

    .line 2
    iget-object v1, p0, Lcom/appsflyer/Foreground$5$3;->Ι:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    :try_start_0
    new-instance v2, Ljava/util/Timer;

    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    new-instance v3, Lcom/appsflyer/Foreground$5$3$4;

    invoke-direct {v3, p0, v1}, Lcom/appsflyer/Foreground$5$3$4;-><init>(Lcom/appsflyer/Foreground$5$3;Landroid/content/Context;)V

    sget-wide v4, Lcom/appsflyer/Foreground;->CHECK_DELAY:J

    invoke-virtual {v2, v3, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    const v0, 0x10e3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v2, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
