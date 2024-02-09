.class public Lcom/olive/upi/transport/model/PendingReqVo;
.super Lcom/olive/upi/transport/model/Gst;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/model/CheckSum;
.implements Ljava/lang/Comparable;


# instance fields
.field public amount:Ljava/lang/String;

.field public beneName:Ljava/lang/String;

.field public expdate:Ljava/lang/String;

.field public invoiceurl:Ljava/lang/String;

.field public merchantflag:Ljava/lang/String;

.field public mobile:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public notes:Ljava/lang/String;

.field public payeeAcNo:Ljava/lang/String;

.field public payeeIfsc:Ljava/lang/String;

.field public payeeVpa:Ljava/lang/String;

.field public payeecode:Ljava/lang/String;

.field public payerVpa:Ljava/lang/String;

.field public purpose:Ljava/lang/String;

.field public refCategory:Ljava/lang/String;

.field public refid:Ljava/lang/String;

.field public status:Ljava/lang/String;

.field public txnid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/olive/upi/transport/model/Gst;-><init>()V

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getExpdate()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->expdate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getBeneName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->beneName:Ljava/lang/String;

    return-object v0
.end method

.method public getExpdate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->expdate:Ljava/lang/String;

    return-object v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->txnid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->notes:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->mobile:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->beneName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->amount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->expdate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->refid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInvoiceurl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->invoiceurl:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantflag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->merchantflag:Ljava/lang/String;

    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNotes()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeAcNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeAcNo:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeIfsc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeIfsc:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeecode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeecode:Ljava/lang/String;

    return-object v0
.end method

.method public getPayerVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payerVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPurpose()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->purpose:Ljava/lang/String;

    return-object v0
.end method

.method public getRefCategory()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->refCategory:Ljava/lang/String;

    return-object v0
.end method

.method public getRefid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->refid:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingReqVo;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->amount:Ljava/lang/String;

    return-void
.end method

.method public setBeneName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->beneName:Ljava/lang/String;

    return-void
.end method

.method public setExpdate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->expdate:Ljava/lang/String;

    return-void
.end method

.method public setInvoiceurl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->invoiceurl:Ljava/lang/String;

    return-void
.end method

.method public setMerchantflag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->merchantflag:Ljava/lang/String;

    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->mobile:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->name:Ljava/lang/String;

    return-void
.end method

.method public setNotes(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->notes:Ljava/lang/String;

    return-void
.end method

.method public setPayeeAcNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeAcNo:Ljava/lang/String;

    return-void
.end method

.method public setPayeeIfsc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeIfsc:Ljava/lang/String;

    return-void
.end method

.method public setPayeeVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeVpa:Ljava/lang/String;

    return-void
.end method

.method public setPayeecode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeecode:Ljava/lang/String;

    return-void
.end method

.method public setPayeevpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payeeVpa:Ljava/lang/String;

    return-void
.end method

.method public setPayerVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->payerVpa:Ljava/lang/String;

    return-void
.end method

.method public setPurpose(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->purpose:Ljava/lang/String;

    return-void
.end method

.method public setRefCategory(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->refCategory:Ljava/lang/String;

    return-void
.end method

.method public setRefid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->refid:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->status:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingReqVo;->txnid:Ljava/lang/String;

    return-void
.end method
