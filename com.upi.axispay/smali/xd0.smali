.class public Lxd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/OliveUpiEventListener;


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroid/widget/Button;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Lsg0;

.field public s:Lcom/olive/upi/transport/model/Mandate;

.field public t:Lcom/olive/upi/transport/model/MandateTransactionData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static x()Lxd0;
    .locals 1

    .line 1
    new-instance v0, Lxd0;

    invoke-direct {v0}, Lxd0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0083

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lxd0;->l:Landroid/view/View;

    const p2, 0x7f0a00db

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lxd0;->m:Landroid/widget/Button;

    const p2, 0x7f080096

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 4
    iget-object p1, p0, Lxd0;->l:Landroid/view/View;

    const p2, 0x7f0a01fc

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lxd0;->n:Landroid/widget/TextView;

    .line 5
    iget-object p1, p0, Lxd0;->l:Landroid/view/View;

    const p2, 0x7f0a0506

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lxd0;->o:Landroid/widget/TextView;

    .line 6
    iget-object p1, p0, Lxd0;->l:Landroid/view/View;

    const p2, 0x7f0a007b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lxd0;->p:Landroid/widget/TextView;

    .line 7
    iget-object p1, p0, Lxd0;->l:Landroid/view/View;

    const p2, 0x7f0a0539

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lxd0;->q:Landroid/widget/TextView;

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->w()Lcom/olive/upi/transport/model/Mandate;

    move-result-object p1

    iput-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    .line 9
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->x()Lsg0;

    move-result-object p1

    iput-object p1, p0, Lxd0;->r:Lsg0;

    .line 10
    iget-object p1, p0, Lxd0;->n:Landroid/widget/TextView;

    iget-object p2, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Mandate;->getValiditystart()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p1, p0, Lxd0;->o:Landroid/widget/TextView;

    iget-object p2, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Mandate;->getValidityend()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object p1, p0, Lxd0;->p:Landroid/widget/TextView;

    iget-object p2, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Mandate;->getAmount()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object p1, p0, Lxd0;->q:Landroid/widget/TextView;

    iget-object p2, p0, Lxd0;->r:Lsg0;

    invoke-virtual {p2}, Lsg0;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    iget-object p2, p0, Lxd0;->r:Lsg0;

    invoke-virtual {p2}, Lsg0;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Mandate;->setRecurrence(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    const p2, 0x16

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Mandate;->setName(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Mandate;->setTxnid(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Mandate;->setRecurrencetype(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    const p3, 0x17

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/Mandate;->setAmount(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    const p3, 0x18

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/Mandate;->setRevokeable(Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    const v0, 0x19

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Mandate;->setRule(Ljava/lang/String;)V

    .line 21
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Mandate;->setRecurrencetype(Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/Mandate;->setSharetopayee(Ljava/lang/String;)V

    .line 23
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Mandate;->setType(Ljava/lang/String;)V

    .line 24
    iget-object p1, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Mandate;->setRecurrencetype(Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Lxd0;->m:Landroid/widget/Button;

    new-instance p2, Lxd0$a;

    invoke-direct {p2, p0}, Lxd0$a;-><init>(Lxd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    iget-object p1, p0, Lxd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 p2, 0x3b

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Leg0;->B()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f1203bc

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x75

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/olive/upi/transport/OliveUpiManager;->setListener(Lcom/olive/upi/transport/OliveUpiEventListener;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method public y()V
    .locals 6

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;-><init>()V

    iput-object v0, p0, Lxd0;->t:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    const v1, 0x1a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    const v1, 0x1b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 5
    new-instance v2, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/Account;-><init>()V

    .line 6
    new-instance v3, Lcom/olive/upi/transport/model/MandateRequest;

    invoke-direct {v3}, Lcom/olive/upi/transport/model/MandateRequest;-><init>()V

    .line 7
    sget-object v4, Ln70;->f:Ln70$a;

    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v5, 0x1c

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/MandateRequest;->setCustomerid(Ljava/lang/String;)V

    const v4, 0x1d

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/MandateRequest;->setPayervpa(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setPayee(Lcom/olive/upi/transport/model/Payee;)V

    .line 10
    iget-object v0, p0, Lxd0;->t:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setTxnid(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v3, v1}, Lcom/olive/upi/transport/model/MandateRequest;->setAmount(Ljava/lang/String;)V

    const v0, 0x1e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setRemarks(Ljava/lang/String;)V

    const v0, 0x1f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setApprovalref(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setCustomerrefid(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setMcc(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setOrderid(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setMinamount(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setRefurl(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v3, v2}, Lcom/olive/upi/transport/model/MandateRequest;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 20
    iget-object v0, p0, Lxd0;->s:Lcom/olive/upi/transport/model/Mandate;

    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/MandateRequest;->setMandate(Lcom/olive/upi/transport/model/Mandate;)V

    return-void
.end method
