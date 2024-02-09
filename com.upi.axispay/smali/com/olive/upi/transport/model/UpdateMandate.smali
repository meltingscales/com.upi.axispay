.class public Lcom/olive/upi/transport/model/UpdateMandate;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public cred:Lcom/olive/upi/transport/model/Cred;

.field public customerid:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public newstate:Ljava/lang/String;

.field public purposecode:Ljava/lang/String;

.field public txnid:Ljava/lang/String;

.field public umn:Ljava/lang/String;

.field public validityEnd:Ljava/lang/String;

.field public validityStart:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x11a2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->purposecode:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCred()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->cred:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getNewstate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->newstate:Ljava/lang/String;

    return-object v0
.end method

.method public getPurposecode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->purposecode:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public getUmn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->umn:Ljava/lang/String;

    return-object v0
.end method

.method public getValidityEnd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->validityEnd:Ljava/lang/String;

    return-object v0
.end method

.method public getValidityStart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/UpdateMandate;->validityStart:Ljava/lang/String;

    return-object v0
.end method

.method public setCred(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->cred:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setNewstate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->newstate:Ljava/lang/String;

    return-void
.end method

.method public setPurposecode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->purposecode:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->txnid:Ljava/lang/String;

    return-void
.end method

.method public setUmn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->umn:Ljava/lang/String;

    return-void
.end method

.method public setValidityEnd(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->validityEnd:Ljava/lang/String;

    return-void
.end method

.method public setValidityStart(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/UpdateMandate;->validityStart:Ljava/lang/String;

    return-void
.end method
