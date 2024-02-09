.class public Lze0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lze0;->s(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/app/Dialog;

.field public final synthetic c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

.field public final synthetic d:Lze0;


# direct methods
.method public constructor <init>(Lze0;Landroid/app/Dialog;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lze0$c;->d:Lze0;

    iput-object p2, p0, Lze0$c;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lze0$c;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 2
    iget-object p1, p0, Lze0$c;->d:Lze0;

    iget-object p1, p1, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_APPROVE_MANDATE:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 3
    iget-object p1, p0, Lze0$c;->d:Lze0;

    iget-object p1, p1, Lxc0;->k:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3394

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iget-object v1, v1, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iget-object v1, v1, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    iget-object v1, p0, Lze0$c;->d:Lze0;

    iget-object v1, v1, Lxc0;->k:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x3395

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 6
    iget-object v1, p0, Lze0$c;->d:Lze0;

    iget-object v1, v1, Lxc0;->k:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iget-object v0, v0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 7
    iget-object v0, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iget-object v0, v0, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iget-object v1, v1, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterVpa(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 10
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lxc0;->k:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x3396

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 11
    new-instance v0, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 12
    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iget-object v1, v1, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payeeVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lze0$c;->d:Lze0;

    iget-object v1, v1, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 14
    iget-object v1, p0, Lze0$c;->d:Lze0;

    iget-object v1, v1, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setPayeeData(Lcom/olive/upi/transport/model/Payee;)V

    .line 15
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 16
    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lze0$c;->d:Lze0;

    iget-object v1, v1, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 18
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 19
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getTxnid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getValidity_start()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getValidity_end()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setRecurrence(Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getNotes()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setOccurence(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iget-object v1, v1, Lcom/olive/upi/transport/model/PendingMandateReqVo;->rule_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setTransactionOn(Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setDebitAccountNo(Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getNotes()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x3397

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lze0$c;->c:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getNotes()Ljava/lang/String;

    move-result-object p1

    .line 30
    :goto_0
    iget-object v0, p0, Lze0$c;->d:Lze0;

    iget-object v0, v0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 31
    iget-object p1, p0, Lze0$c;->d:Lze0;

    iget-object v0, p1, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object p1, p1, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->getUmn()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 32
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x81

    const/16 v1, 0x1fe

    iget-object v2, p0, Lze0$c;->d:Lze0;

    iget-object v2, v2, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {p1, v0, v1, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0xb

    .line 33
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 34
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 35
    :cond_1
    iget-object p1, p0, Lze0$c;->d:Lze0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x3398

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void
.end method
