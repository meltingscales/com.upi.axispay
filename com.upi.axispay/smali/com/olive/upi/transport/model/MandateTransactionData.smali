.class public Lcom/olive/upi/transport/model/MandateTransactionData;
.super Lcom/olive/upi/transport/model/TransactionData;
.source "AxisPay"


# instance fields
.field public acceptType:Ljava/lang/String;

.field private amountRule:Ljava/lang/String;

.field private blockFund:Ljava/lang/String;

.field public debitAccountNo:Ljava/lang/String;

.field public endmandate:Ljava/lang/String;

.field public limitTranx:Ljava/lang/String;

.field public mandateType:I

.field public occurence:Ljava/lang/String;

.field public payeeData:Lcom/olive/upi/transport/model/Payee;

.field private recurrence:Ljava/lang/String;

.field public shareToPayee:Ljava/lang/String;

.field public startMandate:Ljava/lang/String;

.field public transactionOn:Ljava/lang/String;

.field private umnId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    const v0, 0x1d95

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->blockFund:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAcceptType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->acceptType:Ljava/lang/String;

    return-object v0
.end method

.method public getAmountRule()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->amountRule:Ljava/lang/String;

    return-object v0
.end method

.method public getBlockFund()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->blockFund:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitAccountNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->debitAccountNo:Ljava/lang/String;

    return-object v0
.end method

.method public getEndmandate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->endmandate:Ljava/lang/String;

    return-object v0
.end method

.method public getLimitTranx()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->limitTranx:Ljava/lang/String;

    return-object v0
.end method

.method public getMandateType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->mandateType:I

    return v0
.end method

.method public getOccurence()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->occurence:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeData()Lcom/olive/upi/transport/model/Payee;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->payeeData:Lcom/olive/upi/transport/model/Payee;

    return-object v0
.end method

.method public getRecurrence()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->recurrence:Ljava/lang/String;

    return-object v0
.end method

.method public getSharetoPayee()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->shareToPayee:Ljava/lang/String;

    return-object v0
.end method

.method public getStartMandate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->startMandate:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionOn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->transactionOn:Ljava/lang/String;

    return-object v0
.end method

.method public getUmnID()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->umnId:Ljava/lang/String;

    return-object v0
.end method

.method public setAcceptType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->acceptType:Ljava/lang/String;

    return-void
.end method

.method public setAmountRule(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->amountRule:Ljava/lang/String;

    return-void
.end method

.method public setBlockFund(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->blockFund:Ljava/lang/String;

    return-void
.end method

.method public setDebitAccountNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->debitAccountNo:Ljava/lang/String;

    return-void
.end method

.method public setEndmandate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->endmandate:Ljava/lang/String;

    return-void
.end method

.method public setLimitTranx(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->limitTranx:Ljava/lang/String;

    return-void
.end method

.method public setMandateType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->mandateType:I

    return-void
.end method

.method public setOccurence(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->occurence:Ljava/lang/String;

    return-void
.end method

.method public setPayeeData(Lcom/olive/upi/transport/model/Payee;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->payeeData:Lcom/olive/upi/transport/model/Payee;

    return-void
.end method

.method public setRecurrence(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->recurrence:Ljava/lang/String;

    return-void
.end method

.method public setSharetoPayee(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->shareToPayee:Ljava/lang/String;

    return-void
.end method

.method public setStartMandate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->startMandate:Ljava/lang/String;

    return-void
.end method

.method public setTransactionOn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->transactionOn:Ljava/lang/String;

    return-void
.end method

.method public setUmnID(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateTransactionData;->umnId:Ljava/lang/String;

    return-void
.end method
