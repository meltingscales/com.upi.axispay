.class public Lio/fabric/sdk/android/services/events/EventsHandler$4;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/events/EventsHandler;->disable()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/fabric/sdk/android/services/events/EventsHandler;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/events/EventsHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v2, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    .line 2
    invoke-virtual {v1}, Lio/fabric/sdk/android/services/events/EventsHandler;->getDisabledEventsStrategy()Lio/fabric/sdk/android/services/events/EventsStrategy;

    move-result-object v3

    iput-object v3, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    .line 3
    invoke-interface {v2}, Lio/fabric/sdk/android/services/events/EventsManager;->deleteAllEvents()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    iget-object v2, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v2, v2, Lio/fabric/sdk/android/services/events/EventsHandler;->context:Landroid/content/Context;

    const v0, 0x1290

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
