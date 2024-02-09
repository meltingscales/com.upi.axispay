.class public Lcom/olive/upi/transport/model/ChangeCredReq;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public ac:Lcom/olive/upi/transport/model/Account;

.field public bank:Ljava/lang/String;

.field public cred:Lcom/olive/upi/transport/model/Cred;

.field public customerid:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public newcred:Lcom/olive/upi/transport/model/Cred;

.field public txnid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAc()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->ac:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getBank()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->bank:Ljava/lang/String;

    return-object v0
.end method

.method public getCred()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->cred:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getNewcred()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->newcred:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public setAc(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->ac:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setBank(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->bank:Ljava/lang/String;

    return-void
.end method

.method public setCred(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->cred:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setNewcred(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->newcred:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeCredReq;->txnid:Ljava/lang/String;

    return-void
.end method
