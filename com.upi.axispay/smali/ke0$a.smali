.class public Lke0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lke0;->s(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/MandatesVo;

.field public final synthetic c:Landroid/app/Dialog;

.field public final synthetic d:Lke0;


# direct methods
.method public constructor <init>(Lke0;Lcom/olive/upi/transport/model/MandatesVo;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lke0$a;->d:Lke0;

    iput-object p2, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    iput-object p3, p0, Lke0$a;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lke0$a;->d:Lke0;

    iget-object p1, p1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_REVOKE_MANDATE:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 3
    new-instance p1, Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/UpdateMandate;-><init>()V

    .line 4
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x3a63

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/UpdateMandate;->setCustomerid(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 6
    iget-object v1, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/UpdateMandate;->setUmn(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_start()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 11
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setRecurrence(Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    iget-object v4, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 13
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const v3, 0x3a64

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/UpdateMandate;->setTxnid(Ljava/lang/String;)V

    .line 15
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->q:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/UpdateMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    const v1, 0x3a65

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/UpdateMandate;->setNewstate(Ljava/lang/String;)V

    .line 17
    iget-object v3, p0, Lke0$a;->d:Lke0;

    iget-object v3, v3, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v4, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 18
    iget-object v3, p0, Lke0$a;->d:Lke0;

    iget-object v3, v3, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v4, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 19
    iget-object v3, p0, Lke0$a;->d:Lke0;

    iget-object v3, v3, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v4, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 20
    iget-object v3, p0, Lke0$a;->d:Lke0;

    iget-object v3, v3, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v4, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 21
    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerMobile()Ljava/lang/String;

    move-result-object v3

    .line 22
    iget-object v4, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeMobile()Ljava/lang/String;

    move-result-object v4

    .line 23
    iget-object v5, p0, Lke0$a;->d:Lke0;

    iget-object v5, v5, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v6, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 24
    iget-object v5, p0, Lke0$a;->c:Landroid/app/Dialog;

    invoke-virtual {v5}, Landroid/app/Dialog;->hide()V

    .line 25
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const/16 v6, 0x71

    if-nez v5, :cond_1

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v5

    invoke-virtual {v5, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v3

    const v5, 0x3a66

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 26
    new-instance v0, Lcom/olive/upi/transport/model/UpdateMandateRequest;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/UpdateMandateRequest;-><init>()V

    .line 27
    iget-object v2, p0, Lke0$a;->d:Lke0;

    iget-object v2, v2, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 28
    iget-object v2, p0, Lke0$a;->d:Lke0;

    iget-object v2, v2, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 29
    iget-object v2, p0, Lke0$a;->d:Lke0;

    iget-object v2, v2, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 30
    iget-object v2, p0, Lke0$a;->d:Lke0;

    iget-object v2, v2, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 31
    iget-object v2, p0, Lke0$a;->d:Lke0;

    iget-object v2, v2, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 32
    iget-object v2, p0, Lke0$a;->d:Lke0;

    iget-object v2, v2, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/16 v3, 0xd

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 33
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/UpdateMandate;->setNewstate(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setUpdateMandate(Lcom/olive/upi/transport/model/UpdateMandate;)V

    .line 35
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x240

    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {p1, v6, v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 36
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 37
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 38
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v1

    const v3, 0x3a67

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 39
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 40
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 41
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 42
    iget-object v1, p0, Lke0$a;->d:Lke0;

    iget-object v1, v1, Lke0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v3, p0, Lke0$a;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 43
    iget-object v1, p0, Lke0$a;->d:Lke0;

    invoke-virtual {v1}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Leg0;->i(Landroid/app/Activity;)V

    .line 44
    new-instance v1, Lcom/olive/upi/transport/model/UpdateMandateRequest;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;-><init>()V

    .line 45
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x3a68

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setAppId(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setCustomerId(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setUpdateMandate(Lcom/olive/upi/transport/model/UpdateMandate;)V

    .line 48
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x4c

    invoke-direct {v0, v6, v2, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 49
    :cond_2
    iget-object p1, p0, Lke0$a;->c:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 50
    iget-object p1, p0, Lke0$a;->d:Lke0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x3a69

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void

    .line 51
    :cond_3
    iget-object p1, p0, Lke0$a;->c:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 52
    iget-object p1, p0, Lke0$a;->d:Lke0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x3a6a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
