.class public Lcom/olive/upi/transport/model/PendingMandateReqVo;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/model/CheckSum;
.implements Ljava/lang/Comparable;


# instance fields
.field public amount:Ljava/lang/String;

.field public amountRule:Ljava/lang/String;

.field public amountRuleValue:Ljava/lang/String;

.field public beneName:Ljava/lang/String;

.field public createdate:Ljava/lang/String;

.field public expdate:Ljava/lang/String;

.field public initmode:Ljava/lang/String;

.field public isrevokable:Ljava/lang/String;

.field public mandatetype:Ljava/lang/String;

.field public merchantflag:Ljava/lang/String;

.field public mobile:Ljava/lang/String;

.field public mpinrequired:Ljava/lang/String;

.field public notes:Ljava/lang/String;

.field public payeeVpa:Ljava/lang/String;

.field public payerVpa:Ljava/lang/String;

.field public purposecode:Ljava/lang/String;

.field public recurrencePattern:Ljava/lang/String;

.field public recurrenceruletype:Ljava/lang/String;

.field public recurrencerulevalue:Ljava/lang/String;

.field public refid:Ljava/lang/String;

.field public refurl:Ljava/lang/String;

.field public remarks:Ljava/lang/String;

.field public rule_type:Ljava/lang/String;

.field public rule_value:Ljava/lang/String;

.field public sharewithpayee:Ljava/lang/String;

.field public status:Ljava/lang/String;

.field public txnid:Ljava/lang/String;

.field public umn:Ljava/lang/String;

.field public validity_end:Ljava/lang/String;

.field public validity_start:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x27a4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->merchantflag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getAmountRule()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->amountRule:Ljava/lang/String;

    return-object v0
.end method

.method public getAmountRuleValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->amountRuleValue:Ljava/lang/String;

    return-object v0
.end method

.method public getBeneName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->beneName:Ljava/lang/String;

    return-object v0
.end method

.method public getCreatedate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->createdate:Ljava/lang/String;

    return-object v0
.end method

.method public getExpdate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->expdate:Ljava/lang/String;

    return-object v0
.end method

.method public getInitmode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->initmode:Ljava/lang/String;

    return-object v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getIsrevokable()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->isrevokable:Ljava/lang/String;

    return-object v0
.end method

.method public getMandatetype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->mandatetype:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantflag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->merchantflag:Ljava/lang/String;

    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getMpinrequired()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->mpinrequired:Ljava/lang/String;

    return-object v0
.end method

.method public getNotes()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payeeVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPayerVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPurposecode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->purposecode:Ljava/lang/String;

    return-object v0
.end method

.method public getRecurrencePattern()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->recurrencePattern:Ljava/lang/String;

    return-object v0
.end method

.method public getRecurrenceruletype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->recurrenceruletype:Ljava/lang/String;

    return-object v0
.end method

.method public getRecurrencerulevalue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->recurrencerulevalue:Ljava/lang/String;

    return-object v0
.end method

.method public getRefid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->refid:Ljava/lang/String;

    return-object v0
.end method

.method public getRefurl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->refurl:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getRule_type()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->rule_type:Ljava/lang/String;

    return-object v0
.end method

.method public getRule_value()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->rule_value:Ljava/lang/String;

    return-object v0
.end method

.method public getSharewithpayee()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->sharewithpayee:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public getUmn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->umn:Ljava/lang/String;

    return-object v0
.end method

.method public getValidity_end()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->validity_end:Ljava/lang/String;

    return-object v0
.end method

.method public getValidity_start()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->validity_start:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->amount:Ljava/lang/String;

    return-void
.end method

.method public setAmountRule(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->amountRule:Ljava/lang/String;

    return-void
.end method

.method public setAmountRuleValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->amountRuleValue:Ljava/lang/String;

    return-void
.end method

.method public setBeneName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->beneName:Ljava/lang/String;

    return-void
.end method

.method public setCreatedate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->createdate:Ljava/lang/String;

    return-void
.end method

.method public setExpdate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->expdate:Ljava/lang/String;

    return-void
.end method

.method public setInitmode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->initmode:Ljava/lang/String;

    return-void
.end method

.method public setIsrevokable(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->isrevokable:Ljava/lang/String;

    return-void
.end method

.method public setMandatetype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->mandatetype:Ljava/lang/String;

    return-void
.end method

.method public setMerchantflag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->merchantflag:Ljava/lang/String;

    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->mobile:Ljava/lang/String;

    return-void
.end method

.method public setMpinrequired(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->mpinrequired:Ljava/lang/String;

    return-void
.end method

.method public setNotes(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->notes:Ljava/lang/String;

    return-void
.end method

.method public setPayeeVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payeeVpa:Ljava/lang/String;

    return-void
.end method

.method public setPayerVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    return-void
.end method

.method public setPurposecode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->purposecode:Ljava/lang/String;

    return-void
.end method

.method public setRecurrencePattern(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->recurrencePattern:Ljava/lang/String;

    return-void
.end method

.method public setRecurrenceruletype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->recurrenceruletype:Ljava/lang/String;

    return-void
.end method

.method public setRecurrencerulevalue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->recurrencerulevalue:Ljava/lang/String;

    return-void
.end method

.method public setRefid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->refid:Ljava/lang/String;

    return-void
.end method

.method public setRefurl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->refurl:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setRule_type(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->rule_type:Ljava/lang/String;

    return-void
.end method

.method public setRule_value(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->rule_value:Ljava/lang/String;

    return-void
.end method

.method public setSharewithpayee(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->sharewithpayee:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->status:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->txnid:Ljava/lang/String;

    return-void
.end method

.method public setUmn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->umn:Ljava/lang/String;

    return-void
.end method

.method public setValidity_end(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->validity_end:Ljava/lang/String;

    return-void
.end method

.method public setValidity_start(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->validity_start:Ljava/lang/String;

    return-void
.end method
