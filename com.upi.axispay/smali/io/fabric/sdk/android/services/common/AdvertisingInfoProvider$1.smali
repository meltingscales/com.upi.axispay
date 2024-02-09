.class public Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;
.super Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->refreshInfoIfNeededAsync(Lio/fabric/sdk/android/services/common/AdvertisingInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

.field public final synthetic val$advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;Lio/fabric/sdk/android/services/common/AdvertisingInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->val$advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;-><init>()V

    return-void
.end method


# virtual methods
.method public onRun()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->access$000(Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;)Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->val$advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    invoke-virtual {v1, v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const v2, 0x8ef

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x8f0

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    invoke-static {v1, v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->access$100(Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;Lio/fabric/sdk/android/services/common/AdvertisingInfo;)V

    :cond_0
    return-void
.end method
