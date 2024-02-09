.class public Lcom/olive/upi/transport/model/MandateCreateRequest;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public ac:Lcom/olive/upi/transport/model/Account;

.field public amount:Ljava/lang/String;

.field public approvalref:Ljava/lang/String;

.field public cred:Lcom/olive/upi/transport/model/Cred;

.field public customerid:Ljava/lang/String;

.field public customerrefid:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public mandate:Lcom/olive/upi/transport/model/Mandate;

.field public mcc:Ljava/lang/String;

.field public minamount:Ljava/lang/String;

.field public orderid:Ljava/lang/String;

.field public payee:Lcom/olive/upi/transport/model/Payee;

.field public payervpa:Ljava/lang/String;

.field public refurl:Ljava/lang/String;

.field public remarks:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->ac:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getApprovalref()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->approvalref:Ljava/lang/String;

    return-object v0
.end method

.method public getCred()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->cred:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerrefid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->customerrefid:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getMandate()Lcom/olive/upi/transport/model/Mandate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->mandate:Lcom/olive/upi/transport/model/Mandate;

    return-object v0
.end method

.method public getMcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->mcc:Ljava/lang/String;

    return-object v0
.end method

.method public getMinamount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->minamount:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->orderid:Ljava/lang/String;

    return-object v0
.end method

.method public getPayee()Lcom/olive/upi/transport/model/Payee;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->payee:Lcom/olive/upi/transport/model/Payee;

    return-object v0
.end method

.method public getPayervpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->payervpa:Ljava/lang/String;

    return-object v0
.end method

.method public getRefurl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->refurl:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public setAc(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->ac:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->amount:Ljava/lang/String;

    return-void
.end method

.method public setApprovalref(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->approvalref:Ljava/lang/String;

    return-void
.end method

.method public setCred(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->cred:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setCustomerrefid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->customerrefid:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setMandate(Lcom/olive/upi/transport/model/Mandate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->mandate:Lcom/olive/upi/transport/model/Mandate;

    return-void
.end method

.method public setMcc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->mcc:Ljava/lang/String;

    return-void
.end method

.method public setMinamount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->minamount:Ljava/lang/String;

    return-void
.end method

.method public setOrderid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->orderid:Ljava/lang/String;

    return-void
.end method

.method public setPayee(Lcom/olive/upi/transport/model/Payee;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->payee:Lcom/olive/upi/transport/model/Payee;

    return-void
.end method

.method public setPayervpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->payervpa:Ljava/lang/String;

    return-void
.end method

.method public setRefurl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->refurl:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateCreateRequest;->txnid:Ljava/lang/String;

    return-void
.end method
