.class public Lcom/olive/upi/transport/model/AccountOTPRequest;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/model/CheckSum;


# instance fields
.field public ac:Lcom/olive/upi/transport/model/Account;

.field public bankId:Ljava/lang/String;

.field public card:Ljava/lang/String;

.field public customerId:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public expiry:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->ac:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getBankId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->bankId:Ljava/lang/String;

    return-object v0
.end method

.method public getCard()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->card:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getExpiry()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->expiry:Ljava/lang/String;

    return-object v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->bankId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->customerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/DeviceDetails;->getInput()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->txnId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->ac:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getInput()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTxnId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->txnId:Ljava/lang/String;

    return-object v0
.end method

.method public setAc(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->ac:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setBankId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->bankId:Ljava/lang/String;

    return-void
.end method

.method public setCard(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->card:Ljava/lang/String;

    return-void
.end method

.method public setCustomerId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->customerId:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setExpiry(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->expiry:Ljava/lang/String;

    return-void
.end method

.method public setTxnId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountOTPRequest;->txnId:Ljava/lang/String;

    return-void
.end method
