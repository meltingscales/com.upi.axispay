.class public Lcom/olive/upi/transport/model/SaveAppPin;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public appPin:Ljava/lang/String;

.field public customerId:Ljava/lang/String;

.field public deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppPin()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/SaveAppPin;->appPin:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/SaveAppPin;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceDetails()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/SaveAppPin;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public setAppPin(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/SaveAppPin;->appPin:Ljava/lang/String;

    return-void
.end method

.method public setCustomerId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/SaveAppPin;->customerId:Ljava/lang/String;

    return-void
.end method

.method public setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/SaveAppPin;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method
