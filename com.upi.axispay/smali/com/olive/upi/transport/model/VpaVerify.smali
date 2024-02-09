.class public Lcom/olive/upi/transport/model/VpaVerify;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public customerid:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public payerinfo:Lcom/olive/upi/transport/model/PayerInfo;

.field public vpa:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/VpaVerify;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/VpaVerify;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getPayerInfo()Lcom/olive/upi/transport/model/PayerInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/VpaVerify;->payerinfo:Lcom/olive/upi/transport/model/PayerInfo;

    return-object v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/VpaVerify;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/VpaVerify;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/VpaVerify;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setPayerInfo(Lcom/olive/upi/transport/model/PayerInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/VpaVerify;->payerinfo:Lcom/olive/upi/transport/model/PayerInfo;

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/VpaVerify;->vpa:Ljava/lang/String;

    return-void
.end method
