.class public Lcom/olive/upi/transport/model/ProfileVpa;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public deviceInfo:Lcom/olive/upi/transport/model/DeviceDetails;

.field public mobilenumber:Ljava/lang/String;

.field public vpa:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceInfo()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ProfileVpa;->deviceInfo:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getMobilenumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ProfileVpa;->mobilenumber:Ljava/lang/String;

    return-object v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ProfileVpa;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceInfo(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ProfileVpa;->deviceInfo:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setMobilenumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ProfileVpa;->mobilenumber:Ljava/lang/String;

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ProfileVpa;->vpa:Ljava/lang/String;

    return-void
.end method
