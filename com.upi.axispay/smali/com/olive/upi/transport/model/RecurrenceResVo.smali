.class public Lcom/olive/upi/transport/model/RecurrenceResVo;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public amount:Ljava/lang/String;

.field public benename:Ljava/lang/String;

.field public expdate:Ljava/lang/String;

.field public initiatedtime:Ljava/lang/String;

.field public invoiceurl:Ljava/lang/String;

.field public maskaccount:Ljava/lang/String;

.field public merchantflag:Ljava/lang/String;

.field public mobile:Ljava/lang/String;

.field public mpinLength:Ljava/lang/String;

.field public mpinType:Ljava/lang/String;

.field public mpinrequired:Ljava/lang/String;

.field public notes:Ljava/lang/String;

.field public payeecode:Ljava/lang/String;

.field public payeevpa:Ljava/lang/String;

.field public payeraccount:Ljava/lang/String;

.field public payervpa:Ljava/lang/String;

.field public purpose:Ljava/lang/String;

.field public refCategory:Ljava/lang/String;

.field public refid:Ljava/lang/String;

.field public status:Ljava/lang/String;

.field public txnid:Ljava/lang/String;

.field public umn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xf58

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->merchantflag:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mpinrequired:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getBenename()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->benename:Ljava/lang/String;

    return-object v0
.end method

.method public getExpdate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->expdate:Ljava/lang/String;

    return-object v0
.end method

.method public getInitiatedtime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->initiatedtime:Ljava/lang/String;

    return-object v0
.end method

.method public getInvoiceurl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->invoiceurl:Ljava/lang/String;

    return-object v0
.end method

.method public getMaskaccount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->maskaccount:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantflag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->merchantflag:Ljava/lang/String;

    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getMpinLength()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mpinLength:Ljava/lang/String;

    return-object v0
.end method

.method public getMpinType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mpinType:Ljava/lang/String;

    return-object v0
.end method

.method public getMpinrequired()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mpinrequired:Ljava/lang/String;

    return-object v0
.end method

.method public getNotes()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeecode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payeecode:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeevpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payeevpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeraccount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payeraccount:Ljava/lang/String;

    return-object v0
.end method

.method public getPayervpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payervpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPurpose()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->purpose:Ljava/lang/String;

    return-object v0
.end method

.method public getRefCategory()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->refCategory:Ljava/lang/String;

    return-object v0
.end method

.method public getRefid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->refid:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public getUmn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->umn:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->amount:Ljava/lang/String;

    return-void
.end method

.method public setBenename(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->benename:Ljava/lang/String;

    return-void
.end method

.method public setExpdate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->expdate:Ljava/lang/String;

    return-void
.end method

.method public setInitiatedtime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->initiatedtime:Ljava/lang/String;

    return-void
.end method

.method public setInvoiceurl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->invoiceurl:Ljava/lang/String;

    return-void
.end method

.method public setMaskaccount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->maskaccount:Ljava/lang/String;

    return-void
.end method

.method public setMerchantflag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->merchantflag:Ljava/lang/String;

    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mobile:Ljava/lang/String;

    return-void
.end method

.method public setMpinLength(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mpinLength:Ljava/lang/String;

    return-void
.end method

.method public setMpinType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mpinType:Ljava/lang/String;

    return-void
.end method

.method public setMpinrequired(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->mpinrequired:Ljava/lang/String;

    return-void
.end method

.method public setNotes(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->notes:Ljava/lang/String;

    return-void
.end method

.method public setPayeecode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payeecode:Ljava/lang/String;

    return-void
.end method

.method public setPayeevpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payeevpa:Ljava/lang/String;

    return-void
.end method

.method public setPayeraccount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payeraccount:Ljava/lang/String;

    return-void
.end method

.method public setPayervpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->payervpa:Ljava/lang/String;

    return-void
.end method

.method public setPurpose(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->purpose:Ljava/lang/String;

    return-void
.end method

.method public setRefCategory(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->refCategory:Ljava/lang/String;

    return-void
.end method

.method public setRefid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->refid:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->status:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->txnid:Ljava/lang/String;

    return-void
.end method

.method public setUmn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RecurrenceResVo;->umn:Ljava/lang/String;

    return-void
.end method
