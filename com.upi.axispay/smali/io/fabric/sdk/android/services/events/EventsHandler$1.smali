.class public Lio/fabric/sdk/android/services/events/EventsHandler$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/events/EventsHandler;->recordEventAsync(Ljava/lang/Object;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

.field public final synthetic val$event:Ljava/lang/Object;

.field public final synthetic val$sendImmediately:Z


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/events/EventsHandler;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iput-object p2, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$event:Ljava/lang/Object;

    iput-boolean p3, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$sendImmediately:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v1, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    iget-object v2, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$event:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lio/fabric/sdk/android/services/events/EventsManager;->recordEvent(Ljava/lang/Object;)V

    .line 2
    iget-boolean v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$sendImmediately:Z

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v1, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/events/FileRollOverManager;->rollFileOver()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    iget-object v2, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v2, v2, Lio/fabric/sdk/android/services/events/EventsHandler;->context:Landroid/content/Context;

    const v0, 0x1213

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
