.class public Lcom/olive/upi/transport/model/UpdateMandateRequest;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public appId:Ljava/lang/String;

.field public customerId:Ljava/lang/String;

.field public updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandateRequest;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandateRequest;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdateMandate()Lcom/olive/upi/transport/model/UpdateMandate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandateRequest;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    return-object v0
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandateRequest;->appId:Ljava/lang/String;

    return-void
.end method

.method public setCustomerId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandateRequest;->customerId:Ljava/lang/String;

    return-void
.end method

.method public setUpdateMandate(Lcom/olive/upi/transport/model/UpdateMandate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandateRequest;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    return-void
.end method
