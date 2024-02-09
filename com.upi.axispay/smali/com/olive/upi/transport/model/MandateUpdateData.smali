.class public Lcom/olive/upi/transport/model/MandateUpdateData;
.super Lcom/olive/upi/transport/model/LibTransportData;
.source "AxisPay"


# instance fields
.field private amount:Ljava/lang/String;

.field private payeeName:Ljava/lang/String;

.field private payeeVpa:Ljava/lang/String;

.field private payerVpa:Ljava/lang/String;

.field private refUrl:Ljava/lang/String;

.field private remark:Ljava/lang/String;

.field public salt:Lcom/olive/upi/transport/model/lib/PaymentSalt;

.field private sourceAccount:Lcom/olive/upi/transport/model/Account;

.field public updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/olive/upi/transport/model/LibTransportData;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->payeeName:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->payeeVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPayerVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->payerVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getRefUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->refUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRemark()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->remark:Ljava/lang/String;

    return-object v0
.end method

.method public getSalt()Lcom/olive/upi/transport/model/lib/PaymentSalt;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->salt:Lcom/olive/upi/transport/model/lib/PaymentSalt;

    return-object v0
.end method

.method public getSourceAccount()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->sourceAccount:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getUpdateMandate()Lcom/olive/upi/transport/model/UpdateMandate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->amount:Ljava/lang/String;

    return-void
.end method

.method public setPayeeName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->payeeName:Ljava/lang/String;

    return-void
.end method

.method public setPayeeVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->payeeVpa:Ljava/lang/String;

    return-void
.end method

.method public setPayerVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->payerVpa:Ljava/lang/String;

    return-void
.end method

.method public setRefUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->refUrl:Ljava/lang/String;

    return-void
.end method

.method public setRemark(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->remark:Ljava/lang/String;

    return-void
.end method

.method public setSalt(Lcom/olive/upi/transport/model/lib/PaymentSalt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->salt:Lcom/olive/upi/transport/model/lib/PaymentSalt;

    return-void
.end method

.method public setSourceAccount(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->sourceAccount:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setUpdateMandate(Lcom/olive/upi/transport/model/UpdateMandate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateUpdateData;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    return-void
.end method
