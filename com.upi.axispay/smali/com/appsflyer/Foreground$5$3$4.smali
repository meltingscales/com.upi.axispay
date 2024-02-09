.class public final Lcom/appsflyer/Foreground$5$3$4;
.super Ljava/util/TimerTask;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/Foreground$5$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic ǃ:Lcom/appsflyer/Foreground$5$3;

.field private synthetic ι:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/appsflyer/Foreground$5$3;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/Foreground$5$3$4;->ǃ:Lcom/appsflyer/Foreground$5$3;

    iput-object p2, p0, Lcom/appsflyer/Foreground$5$3$4;->ι:Landroid/content/Context;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v1, p0, Lcom/appsflyer/Foreground$5$3$4;->ǃ:Lcom/appsflyer/Foreground$5$3;

    iget-object v1, v1, Lcom/appsflyer/Foreground$5$3;->ǃ:Lcom/appsflyer/Foreground$5;

    iget-boolean v2, v1, Lcom/appsflyer/Foreground$5;->ı:Z

    if-eqz v2, :cond_0

    iget-boolean v2, v1, Lcom/appsflyer/Foreground$5;->ι:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 2
    iput-boolean v2, v1, Lcom/appsflyer/Foreground$5;->ı:Z

    .line 3
    :try_start_0
    iget-object v1, v1, Lcom/appsflyer/Foreground$5;->Ι:Lcom/appsflyer/Foreground$Listener;

    iget-object v2, p0, Lcom/appsflyer/Foreground$5$3$4;->ι:Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/appsflyer/Foreground$Listener;->onBecameBackground(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const v0, 0x267

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v2, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
