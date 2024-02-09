.class public Lcom/olive/upi/transport/model/PayerInitiatedMandate;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;,
        Lcom/olive/upi/transport/model/PayerInitiatedMandate$Rule;,
        Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;,
        Lcom/olive/upi/transport/model/PayerInitiatedMandate$RuleType;,
        Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;
    }
.end annotation


# instance fields
.field public amount:Ljava/lang/String;

.field public amountrule:Ljava/lang/String;

.field public blockfund:Ljava/lang/String;

.field public creds:Lcom/olive/upi/transport/model/Cred;

.field public customerid:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public executebypayeepsp:Ljava/lang/String;

.field public initmode:Ljava/lang/String;

.field public mandatename:Ljava/lang/String;

.field public mandatetype:Ljava/lang/String;

.field public monthlylimit:Ljava/lang/String;

.field public note:Ljava/lang/String;

.field public payeeaddr:Ljava/lang/String;

.field public payeename:Ljava/lang/String;

.field public payeraddr:Ljava/lang/String;

.field public payername:Ljava/lang/String;

.field public purposecode:Ljava/lang/String;

.field public recurrence:Ljava/lang/String;

.field public recurrenceValue:Ljava/lang/String;

.field public revocable:Ljava/lang/String;

.field public rule:Ljava/lang/String;

.field public ruletype:Ljava/lang/String;

.field public rulevalue:Ljava/lang/String;

.field public sharetopayee:Ljava/lang/String;

.field public txnid:Ljava/lang/String;

.field public umn:Ljava/lang/String;

.field public validityend:Ljava/lang/String;

.field public validitystart:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x1ed

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->purposecode:Ljava/lang/String;

    const v0, 0x1ee

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->initmode:Ljava/lang/String;

    const v0, 0x1ef

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    iput-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->blockfund:Ljava/lang/String;

    const v0, 0x1f0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->recurrenceValue:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getAmountrule()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->amountrule:Ljava/lang/String;

    return-object v0
.end method

.method public getBlockfund()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->blockfund:Ljava/lang/String;

    return-object v0
.end method

.method public getCreds()Lcom/olive/upi/transport/model/Cred;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->creds:Lcom/olive/upi/transport/model/Cred;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getExecutebypayeepsp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->executebypayeepsp:Ljava/lang/String;

    return-object v0
.end method

.method public getInitmode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->initmode:Ljava/lang/String;

    return-object v0
.end method

.method public getMandatename()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->mandatename:Ljava/lang/String;

    return-object v0
.end method

.method public getMandatetype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->mandatetype:Ljava/lang/String;

    return-object v0
.end method

.method public getMonthlylimit()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->monthlylimit:Ljava/lang/String;

    return-object v0
.end method

.method public getNote()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->note:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeaddr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payeeaddr:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeename()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payeename:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeraddr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payeraddr:Ljava/lang/String;

    return-object v0
.end method

.method public getPayername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payername:Ljava/lang/String;

    return-object v0
.end method

.method public getPurposecode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->purposecode:Ljava/lang/String;

    return-object v0
.end method

.method public getRecurrence()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->recurrence:Ljava/lang/String;

    return-object v0
.end method

.method public getRecurrenceValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->recurrenceValue:Ljava/lang/String;

    return-object v0
.end method

.method public getRevocable()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->revocable:Ljava/lang/String;

    return-object v0
.end method

.method public getRule()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->rule:Ljava/lang/String;

    return-object v0
.end method

.method public getRuletype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->ruletype:Ljava/lang/String;

    return-object v0
.end method

.method public getRulevalue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->rulevalue:Ljava/lang/String;

    return-object v0
.end method

.method public getSharetopayee()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->sharetopayee:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public getUmn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->umn:Ljava/lang/String;

    return-object v0
.end method

.method public getValidityend()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->validityend:Ljava/lang/String;

    return-object v0
.end method

.method public getValiditystart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->validitystart:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->amount:Ljava/lang/String;

    return-void
.end method

.method public setAmountrule(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->amountrule:Ljava/lang/String;

    return-void
.end method

.method public setBlockfund(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->blockfund:Ljava/lang/String;

    return-void
.end method

.method public setCreds(Lcom/olive/upi/transport/model/Cred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->creds:Lcom/olive/upi/transport/model/Cred;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setExecutebypayeepsp(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->executebypayeepsp:Ljava/lang/String;

    return-void
.end method

.method public setInitmode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->initmode:Ljava/lang/String;

    return-void
.end method

.method public setMandatename(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->mandatename:Ljava/lang/String;

    return-void
.end method

.method public setMandatetype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->mandatetype:Ljava/lang/String;

    return-void
.end method

.method public setMonthlylimit(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->monthlylimit:Ljava/lang/String;

    return-void
.end method

.method public setNote(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->note:Ljava/lang/String;

    return-void
.end method

.method public setPayeeaddr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payeeaddr:Ljava/lang/String;

    return-void
.end method

.method public setPayeename(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payeename:Ljava/lang/String;

    return-void
.end method

.method public setPayeraddr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payeraddr:Ljava/lang/String;

    return-void
.end method

.method public setPayername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->payername:Ljava/lang/String;

    return-void
.end method

.method public setPurposecode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->purposecode:Ljava/lang/String;

    return-void
.end method

.method public setRecurrence(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->recurrence:Ljava/lang/String;

    return-void
.end method

.method public setRecurrenceValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->recurrenceValue:Ljava/lang/String;

    return-void
.end method

.method public setRevocable(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->revocable:Ljava/lang/String;

    return-void
.end method

.method public setRule(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->rule:Ljava/lang/String;

    return-void
.end method

.method public setRuletype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->ruletype:Ljava/lang/String;

    return-void
.end method

.method public setRulevalue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->rulevalue:Ljava/lang/String;

    return-void
.end method

.method public setSharetopayee(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->sharetopayee:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->txnid:Ljava/lang/String;

    return-void
.end method

.method public setUmn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->umn:Ljava/lang/String;

    return-void
.end method

.method public setValidityend(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->validityend:Ljava/lang/String;

    return-void
.end method

.method public setValiditystart(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->validitystart:Ljava/lang/String;

    return-void
.end method
