.class public Lcom/olive/upi/transport/model/RegRequest;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public ac:Lcom/olive/upi/transport/model/Account;

.field public atmpincred:Lcom/olive/upi/transport/model/Cred;

.field public bank:Ljava/lang/String;

.field public card:Ljava/lang/String;

.field public customerid:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public expiry:Ljava/lang/String;

.field public mpincred:Lcom/olive/upi/transport/model/Cred;

.field public otpcred:Lcom/olive/upi/transport/model/Cred;

.field public regtype:Ljava/lang/String;

.field public txnId:Ljava/lang/String;


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
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->ac:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getAtmpincred()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->atmpincred:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getBank()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->bank:Ljava/lang/String;

    return-object v0
.end method

.method public getCard()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->card:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getExpiry()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->expiry:Ljava/lang/String;

    return-object v0
.end method

.method public getMpincred()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->mpincred:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getOtpcred()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->otpcred:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getRegtype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->regtype:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegRequest;->txnId:Ljava/lang/String;

    return-object v0
.end method

.method public setAc(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->ac:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setAtmpincred(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->atmpincred:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setBank(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->bank:Ljava/lang/String;

    return-void
.end method

.method public setCard(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->card:Ljava/lang/String;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setExpiry(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->expiry:Ljava/lang/String;

    return-void
.end method

.method public setMpincred(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->mpincred:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setOtpcred(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->otpcred:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setRegtype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->regtype:Ljava/lang/String;

    return-void
.end method

.method public setTxnId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegRequest;->txnId:Ljava/lang/String;

    return-void
.end method
