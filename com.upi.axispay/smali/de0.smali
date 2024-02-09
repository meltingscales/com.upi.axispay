.class public Lde0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# static fields
.field public static A:Lde0;


# instance fields
.field public l:Landroid/view/View;

.field public m:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/LinearLayout;

.field public x:Landroid/widget/LinearLayout;

.field public y:Landroid/widget/LinearLayout;

.field public z:Lcom/olive/upi/transport/model/DeviceDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static y()Lde0;
    .locals 1

    .line 1
    sget-object v0, Lde0;->A:Lde0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lde0;

    invoke-direct {v0}, Lde0;-><init>()V

    sput-object v0, Lde0;->A:Lde0;

    .line 3
    :cond_0
    sget-object v0, Lde0;->A:Lde0;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00de

    const v1, 0x349e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eq p1, v0, :cond_2

    const v0, 0x7f0a00e2

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_MANDATE_EXECUTE:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 3
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 6
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setRecurrence(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    const v2, 0x7f0800de

    const p1, 0x7f1201b0

    .line 10
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 11
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v8

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v10

    const v4, 0x349f

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    move-object v1, p0

    .line 12
    invoke-virtual/range {v1 .. v10}, Lde0;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_MANDATE_DECLINE:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 14
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 17
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setRecurrence(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    const v2, 0x7f0800de

    const p1, 0x7f120139

    .line 21
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 22
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v8

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v10

    const v4, 0x34a0

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    move-object v1, p0

    .line 23
    invoke-virtual/range {v1 .. v10}, Lde0;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const p3, 0x7f0d00c9

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lde0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lua0;->u(Lua0$e;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object p1

    iput-object p1, p0, Lde0;->z:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 4
    invoke-virtual {p0}, Lde0;->z()V

    .line 5
    iget-object p1, p0, Lde0;->w:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object p1, p0, Lde0;->x:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    if-eqz p1, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    const v0, 0x34a1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    const v0, 0x34a2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 11
    new-instance p2, Lcom/olive/upi/transport/model/VpaVerify;

    invoke-direct {p2}, Lcom/olive/upi/transport/model/VpaVerify;-><init>()V

    .line 12
    sget-object p3, Ln70;->f:Ln70$a;

    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object p3

    const v0, 0x34a3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/VpaVerify;->setCustomerid(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/VpaVerify;->setVpa(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/VpaVerify;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 15
    new-instance p1, Lcom/olive/upi/transport/model/PayerInfo;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PayerInfo;-><init>()V

    .line 16
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p3

    sget-object v2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p3, v2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 17
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setPayervpa(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setAccountnumber(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/PayerInfo;->setName(Ljava/lang/String;)V

    const v0, 0x34a4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 20
    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/PayerInfo;->setMcc(Ljava/lang/String;)V

    .line 21
    :cond_0
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/VpaVerify;->setPayerInfo(Lcom/olive/upi/transport/model/PayerInfo;)V

    .line 22
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 23
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x83

    const/16 v3, 0x4f

    invoke-direct {p3, v2, v3, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 24
    iget-object p1, p0, Lde0;->n:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    invoke-virtual {p2, v1, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    iget-object p1, p0, Lde0;->o:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    :cond_1
    iget-object p1, p0, Lde0;->y:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 27
    iget-object p1, p0, Lde0;->p:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object p1, p0, Lde0;->r:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    iget-object p1, p0, Lde0;->s:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object p1, p0, Lde0;->t:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    iget-object p1, p0, Lde0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p1, p0, Lde0;->v:Landroid/widget/TextView;

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    const v0, 0x34a5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    new-instance p1, Ljava/text/SimpleDateFormat;

    const v0, 0x34a6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 34
    new-instance p1, Ljava/text/SimpleDateFormat;

    const v0, 0x34a7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 35
    new-instance p2, Ljava/text/SimpleDateFormat;

    const v0, 0x34a8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 36
    iget-object p3, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p3

    .line 37
    :try_start_0
    invoke-virtual {p1, p3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 38
    iget-object p3, p0, Lde0;->q:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    :catch_0
    :cond_3
    iget-object p1, p0, Lde0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 11

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x4c

    const/4 v1, 0x0

    const/16 v2, 0x6e

    const v3, 0x34a9

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    if-eq p1, v0, :cond_3

    const/16 v0, 0x4f

    if-eq p1, v0, :cond_2

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 6
    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 10
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 11
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    const p2, 0x34aa

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto/16 :goto_2

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 15
    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 16
    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v0}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x34ab

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const v0, 0x7f120497

    if-eqz p1, :cond_5

    .line 21
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f1201be

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x34ac

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lde0$c;

    invoke-direct {v7, p0}, Lde0$c;-><init>(Lde0;)V

    const p1, 0x34ad

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lde0$d;

    invoke-direct {v9, p0}, Lde0$d;-><init>(Lde0;)V

    const/4 v10, 0x1

    .line 23
    invoke-static/range {v3 .. v10}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 24
    :cond_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v3, 0x34ae

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 25
    invoke-static {}, Leg0;->B()V

    .line 26
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    new-instance p2, Lde0$e;

    invoke-direct {p2, p0}, Lde0$e;-><init>(Lde0;)V

    const v0, 0x34af

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x34b0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x34b1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2, p2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 27
    :cond_6
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const p2, 0x34b2

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 28
    invoke-static {}, Leg0;->B()V

    .line 29
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f120206

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x34b3

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lde0$f;

    invoke-direct {v7, p0}, Lde0$f;-><init>(Lde0;)V

    new-instance v9, Lde0$g;

    invoke-direct {v9, p0}, Lde0$g;-><init>(Lde0;)V

    const/4 v10, 0x1

    const v8, 0x34b4

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-static/range {v3 .. v10}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 30
    :cond_7
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_8
    :goto_2
    return-void
.end method

.method public onResume()V
    .locals 2

    const/16 v0, 0x83

    const v1, 0x34b5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-virtual {p0, v0, v1}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 6

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x4c

    const/4 v1, 0x0

    const/16 v2, 0x6e

    const v3, 0x34b6

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xa

    const v5, 0x34b7

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-eq p1, v0, :cond_3

    const/16 v0, 0x4f

    if-eq p1, v0, :cond_2

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 5
    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 6
    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_2

    .line 10
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 12
    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lde0;->n:Landroid/widget/TextView;

    iget-object v0, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object p2, p0, Lde0;->p:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 15
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 17
    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 18
    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 20
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 21
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    .line 1
    new-instance v10, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f130246

    invoke-direct {v10, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x7f0d0054

    .line 3
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-virtual {v0, v2, v3}, Landroid/view/Window;->setLayout(II)V

    const v0, 0x7f0a00ec

    .line 5
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/Button;

    const v0, 0x7f0a016f

    .line 6
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    const v0, 0x7f0a0172

    .line 7
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v2, p2

    .line 8
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a0171

    .line 9
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move v2, p1

    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const v3, 0x7f060049

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 12
    invoke-virtual {v10, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 13
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    const v0, 0x34b8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {v11, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 15
    new-instance v13, Lde0$a;

    move-object v0, v13

    move-object v1, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object v9, v10

    invoke-direct/range {v0 .. v9}, Lde0$a;-><init>(Lde0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Dialog;)V

    invoke-virtual {v11, v13}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    new-instance v0, Lde0$b;

    invoke-direct {v0, p0, v10}, Lde0$b;-><init>(Lde0;Landroid/app/Dialog;)V

    invoke-virtual {v12, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a0230

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->n:Landroid/widget/TextView;

    .line 2
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a04a8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->o:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a04ba

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->p:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a0494

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->q:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a048a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->r:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a04f4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->s:Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a043b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->t:Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a01be

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->u:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a04a3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lde0;->v:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a00de

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lde0;->w:Landroid/widget/LinearLayout;

    .line 11
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a00e2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lde0;->x:Landroid/widget/LinearLayout;

    .line 12
    iget-object v0, p0, Lde0;->l:Landroid/view/View;

    const v1, 0x7f0a026b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lde0;->y:Landroid/widget/LinearLayout;

    return-void
.end method
