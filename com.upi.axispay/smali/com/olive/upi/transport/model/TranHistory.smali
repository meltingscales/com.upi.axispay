.class public Lcom/olive/upi/transport/model/TranHistory;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/model/CheckSum;
.implements Ljava/lang/Comparable;


# static fields
.field public static final QSTATUS_CLOSE:Ljava/lang/String;

.field public static final QSTATUS_OPEN:Ljava/lang/String;

.field public static final TRANSACTION_CREDIT:Ljava/lang/String;

.field public static final TRANSACTION_DEBIT:Ljava/lang/String;


# instance fields
.field public amount:Ljava/lang/String;

.field public beneficiaryName:Ljava/lang/String;

.field public creditAccount:Ljava/lang/String;

.field public creditBankName:Ljava/lang/String;

.field public creditVpa:Ljava/lang/String;

.field public creditdebittype:Ljava/lang/String;

.field public dateTime:Ljava/lang/String;

.field public debitAccount:Ljava/lang/String;

.field public debitBankName:Ljava/lang/String;

.field public debitVpa:Ljava/lang/String;

.field public description:Ljava/lang/String;

.field public direction:I

.field public expirydateTime:Ljava/lang/String;

.field public initMode:Ljava/lang/String;

.field public mcc:Ljava/lang/String;

.field public purposeCode:Ljava/lang/String;

.field public query:Ljava/lang/String;

.field public queryCloserComment:Ljava/lang/String;

.field public queryStatus:Ljava/lang/String;

.field public querydate:Ljava/lang/String;

.field public queryid:Ljava/lang/String;

.field public refCategory:Ljava/lang/String;

.field public refUrl:Ljava/lang/String;

.field public refid:Ljava/lang/String;

.field public remarks:Ljava/lang/String;

.field public remitterName:Ljava/lang/String;

.field public status:Ljava/lang/String;

.field public tranid:Ljava/lang/String;

.field public type:Ljava/lang/String;

.field public udir:Lcom/olive/upi/transport/model/Udir;

.field public umn:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/model/TranHistory;

    const v1, 0x108

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getTransactionCredit()Ljava/lang/String;
    .locals 1

    const v0, 0x22

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getTransactionDebit()Ljava/lang/String;
    .locals 1

    const v0, 0x23

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lcom/olive/upi/transport/model/TranHistory;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->dateTime:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getBeneficiaryName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->beneficiaryName:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditAccount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->creditAccount:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->creditBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->creditVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditdebittype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->creditdebittype:Ljava/lang/String;

    return-object v0
.end method

.method public getDateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->dateTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitAccount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->debitAccount:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->debitBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->debitVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDirection()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TranHistory;->direction:I

    return v0
.end method

.method public getExpirydateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->expirydateTime:Ljava/lang/String;

    return-object v0
.end method

.method public getInitMode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->initMode:Ljava/lang/String;

    return-object v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->tranid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->refid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->dateTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->amount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->debitAccount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->debitVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->debitBankName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->creditAccount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->creditVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->remarks:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->queryStatus:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->queryid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->querydate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TranHistory;->expirydateTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->mcc:Ljava/lang/String;

    return-object v0
.end method

.method public getPayType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->creditdebittype:Ljava/lang/String;

    return-object v0
.end method

.method public getPurposeCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->purposeCode:Ljava/lang/String;

    return-object v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->query:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryCloserComment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->queryCloserComment:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->queryStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getQuerydate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->querydate:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->queryid:Ljava/lang/String;

    return-object v0
.end method

.method public getRefCategory()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->refCategory:Ljava/lang/String;

    return-object v0
.end method

.method public getRefUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->refUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRefid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->refid:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getRemitterName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->remitterName:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTranid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->tranid:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUdir()Lcom/olive/upi/transport/model/Udir;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->udir:Lcom/olive/upi/transport/model/Udir;

    return-object v0
.end method

.method public getUmn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TranHistory;->umn:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->amount:Ljava/lang/String;

    return-void
.end method

.method public setCreditAccount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->creditAccount:Ljava/lang/String;

    return-void
.end method

.method public setCreditBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->creditBankName:Ljava/lang/String;

    return-void
.end method

.method public setCreditVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->creditVpa:Ljava/lang/String;

    return-void
.end method

.method public setCreditdebittype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->creditdebittype:Ljava/lang/String;

    return-void
.end method

.method public setDateTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->dateTime:Ljava/lang/String;

    return-void
.end method

.method public setDebitAccount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->debitAccount:Ljava/lang/String;

    return-void
.end method

.method public setDebitBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->debitBankName:Ljava/lang/String;

    return-void
.end method

.method public setDebitVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->debitVpa:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->description:Ljava/lang/String;

    return-void
.end method

.method public setDirection(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TranHistory;->direction:I

    return-void
.end method

.method public setExpirydateTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->expirydateTime:Ljava/lang/String;

    return-void
.end method

.method public setInitMode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->initMode:Ljava/lang/String;

    return-void
.end method

.method public setMcc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->mcc:Ljava/lang/String;

    return-void
.end method

.method public setPayType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->creditdebittype:Ljava/lang/String;

    return-void
.end method

.method public setPurposeCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->purposeCode:Ljava/lang/String;

    return-void
.end method

.method public setQuery(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->query:Ljava/lang/String;

    return-void
.end method

.method public setQueryCloserComment(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->queryCloserComment:Ljava/lang/String;

    return-void
.end method

.method public setQueryStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->queryStatus:Ljava/lang/String;

    return-void
.end method

.method public setQuerydate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->querydate:Ljava/lang/String;

    return-void
.end method

.method public setQueryid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->queryid:Ljava/lang/String;

    return-void
.end method

.method public setRefCategory(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->refCategory:Ljava/lang/String;

    return-void
.end method

.method public setRefUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->refUrl:Ljava/lang/String;

    return-void
.end method

.method public setRefid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->refid:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->status:Ljava/lang/String;

    return-void
.end method

.method public setTranid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->tranid:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->type:Ljava/lang/String;

    return-void
.end method

.method public setUdir(Lcom/olive/upi/transport/model/Udir;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->udir:Lcom/olive/upi/transport/model/Udir;

    return-void
.end method

.method public setUmn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TranHistory;->umn:Ljava/lang/String;

    return-void
.end method
