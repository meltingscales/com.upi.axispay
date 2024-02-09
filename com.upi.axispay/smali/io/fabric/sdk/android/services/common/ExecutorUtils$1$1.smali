.class public Lio/fabric/sdk/android/services/common/ExecutorUtils$1$1;
.super Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/common/ExecutorUtils$1;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/fabric/sdk/android/services/common/ExecutorUtils$1;

.field public final synthetic val$runnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/common/ExecutorUtils$1;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/ExecutorUtils$1$1;->this$0:Lio/fabric/sdk/android/services/common/ExecutorUtils$1;

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/ExecutorUtils$1$1;->val$runnable:Ljava/lang/Runnable;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;-><init>()V

    return-void
.end method


# virtual methods
.method public onRun()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/ExecutorUtils$1$1;->val$runnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
