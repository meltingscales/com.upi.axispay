.class public Lio/fabric/sdk/android/services/common/SafeToast$1;
.super Lio/fabric/sdk/android/services/concurrency/PriorityRunnable;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/common/SafeToast;->show()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/fabric/sdk/android/services/common/SafeToast;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/common/SafeToast;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/SafeToast$1;->this$0:Lio/fabric/sdk/android/services/common/SafeToast;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityRunnable;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/SafeToast$1;->this$0:Lio/fabric/sdk/android/services/common/SafeToast;

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/SafeToast;->access$001(Lio/fabric/sdk/android/services/common/SafeToast;)V

    return-void
.end method
