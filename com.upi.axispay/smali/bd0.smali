.class public Lbd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# static fields
.field public static r:Lbd0;

.field public static s:Ljava/lang/String;


# instance fields
.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public n:Lh90;

.field public o:Ldg0;

.field public p:Landroid/view/View;

.field public q:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static C(Ljava/lang/String;)Lbd0;
    .locals 1

    .line 1
    sget-object v0, Lbd0;->r:Lbd0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lbd0;

    invoke-direct {v0}, Lbd0;-><init>()V

    sput-object v0, Lbd0;->r:Lbd0;

    .line 3
    :cond_0
    sput-object p0, Lbd0;->s:Ljava/lang/String;

    .line 4
    sget-object p0, Lbd0;->r:Lbd0;

    return-object p0
.end method

.method public static synthetic x(Lbd0;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbd0;->D(Lcom/olive/upi/transport/model/Account;)V

    return-void
.end method


# virtual methods
.method public final A(Lcom/olive/upi/transport/model/Account;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 6
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setPayeeData(Lcom/olive/upi/transport/model/Payee;)V

    .line 7
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p1

    const/16 v0, 0x1fe

    const/16 v2, 0x50

    const/4 v3, 0x1

    if-ne p1, v3, :cond_0

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 9
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p1, v2, v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0x9

    .line 10
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYER_UPDATE_MANDATE:I

    if-ne p1, v3, :cond_1

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 14
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p1, v2, v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0xc

    .line 15
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 16
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 17
    :cond_1
    new-instance p1, Ld70;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p1, v0}, Ld70;-><init>(Landroid/content/Context;)V

    .line 18
    new-instance p1, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;-><init>()V

    .line 19
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 20
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v3, 0x2e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setCustomerid(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setTxnid(Ljava/lang/String;)V

    const v0, 0x2f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMandatename(Ljava/lang/String;)V

    const v3, 0x30

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 23
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRevocable(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 25
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setValiditystart(Ljava/lang/String;)V

    .line 26
    :cond_2
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 27
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setValidityend(Ljava/lang/String;)V

    .line 28
    :cond_3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 29
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc70;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setAmount(Ljava/lang/String;)V

    :cond_4
    const v3, 0x31

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 30
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    const v3, 0x32

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 31
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRule(Ljava/lang/String;)V

    const v3, 0x33

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 32
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRecurrence(Ljava/lang/String;)V

    const v3, 0x34

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 33
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRulevalue(Ljava/lang/String;)V

    const v3, 0x35

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 34
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRuletype(Ljava/lang/String;)V

    const v3, 0x36

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMonthlylimit(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setNote(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getPayeeData()Lcom/olive/upi/transport/model/Payee;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeraddr(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayername(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeeaddr(Ljava/lang/String;)V

    .line 40
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeename(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x3b

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public final B(Lcom/olive/upi/transport/model/Account;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbd0;->E()V

    .line 2
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    .line 3
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->c()Ljava/lang/String;

    move-result-object v0

    const v1, 0x37

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->d()Ljava/lang/String;

    move-result-object v0

    const v1, 0x38

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->b()Ljava/lang/String;

    move-result-object v0

    const v1, 0x39

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->a()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->e()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-static {p1}, Ljg0;->f(Ljava/util/Hashtable;)Ljava/lang/String;

    move-result-object p1

    .line 9
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBillInfoString(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const v0, 0x3c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBillpayKey(Ljava/lang/String;)V

    .line 11
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/16 v1, 0x50

    const/16 v2, 0x1fe

    invoke-direct {p1, v1, v2, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v0, 0x7

    .line 12
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public final D(Lcom/olive/upi/transport/model/Account;)V
    .locals 2

    .line 1
    sget-object v0, Lbd0;->s:Ljava/lang/String;

    const v1, 0x3d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 3
    invoke-virtual {p0, p1}, Lbd0;->B(Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    :cond_0
    const v1, 0x3e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 5
    invoke-virtual {p0, p1}, Lbd0;->z(Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    :cond_1
    const v1, 0x3f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 6
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x97

    invoke-interface {v0, v1, p1}, Lmg0;->o(ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    const v1, 0x40

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 8
    invoke-virtual {p0, p1}, Lbd0;->A(Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    .line 9
    :cond_3
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1}, Loa0;->i()Lcom/olive/upi/transport/model/BillerCategory;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerCategory;->getCODE_VAL()Ljava/lang/String;

    move-result-object v1

    if-ne v0, v1, :cond_4

    .line 10
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 11
    invoke-virtual {p0, p1}, Lbd0;->y(Lcom/olive/upi/transport/model/Account;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public E()V
    .locals 4

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->m()Ldg0;

    move-result-object v0

    iput-object v0, p0, Lbd0;->o:Ldg0;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    const v1, 0x41

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    const v1, 0x42

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 5
    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->BILLPAY_UPIID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 7
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 8
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 9
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const v1, 0x43

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefUrl(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v1}, Ldg0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 13
    sget-object v0, Lbd0;->s:Ljava/lang/String;

    const v1, 0x44

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x45

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-ne v0, v2, :cond_0

    .line 14
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x46

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v3}, Ldg0;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v3}, Ldg0;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v3}, Ldg0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v1}, Ldg0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x47

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v3}, Ldg0;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v1}, Ldg0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final F(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 2
    iget-object v2, p0, Lbd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lbd0;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lbd0;->n:Lh90;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lh90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lh90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lbd0;->n:Lh90;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lh90;->A(Ljava/util/ArrayList;)V

    .line 7
    :goto_0
    iget-object p1, p0, Lbd0;->n:Lh90;

    invoke-virtual {p1, p0}, Lh90;->y(Lng0;)V

    .line 8
    iget-object p1, p0, Lbd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lbd0;->n:Lh90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object p1, p0, Lbd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lbd0;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 11

    const/16 v0, 0x9

    const/16 v1, 0x3a

    const v2, 0x48

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x49

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x4a

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x4b

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x4c

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x4d

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x4e

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x50

    if-eq p1, v0, :cond_4

    const/16 v0, 0xc

    if-eq p1, v0, :cond_3

    const/16 v0, 0x13

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x45

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    check-cast p2, Lcom/olive/upi/transport/model/BillPay;

    .line 2
    new-instance p1, Lcom/olive/upi/transport/model/BbpsPay;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BbpsPay;-><init>()V

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BillPay;->getPayRequest()Lcom/olive/upi/transport/model/PayRequest;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BbpsPay;->setPayRequest(Lcom/olive/upi/transport/model/PayRequest;)V

    .line 4
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p2

    invoke-virtual {p2}, Loa0;->c()Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    move-result-object p2

    .line 5
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BbpsPay;->setBbpspay(Lcom/olive/upi/transport/model/BillerRegEnqResponse;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v1, v9, v0, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v1, v9, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v1, v9, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 12
    :cond_3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 13
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    .line 14
    new-instance p1, Lcom/olive/upi/transport/model/PayerInitiatedMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;-><init>()V

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    if-eqz p2, :cond_5

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v10

    invoke-static {v10}, Leg0;->i(Landroid/app/Activity;)V

    .line 17
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCustomerid(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setTxnid(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setUmn(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->getUmn()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatename(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRevocable(Ljava/lang/String;)V

    .line 23
    iget-object v7, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setSharetopayee(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValiditystart(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValidityend(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc70;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmount(Ljava/lang/String;)V

    const v7, 0x4f

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 27
    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmountrule(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1, v5}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRecurrence(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRulevalue(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRuletype(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMonthlylimit(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setNote(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeraddr(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayername(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getPayeeData()Lcom/olive/upi/transport/model/Payee;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeeaddr(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeename(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setExecutebypayeepsp(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 40
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCreds(Lcom/olive/upi/transport/model/Cred;)V

    .line 41
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v0, v9, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 42
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 43
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    .line 44
    new-instance p1, Lcom/olive/upi/transport/model/PayerInitiatedMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;-><init>()V

    .line 45
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    if-eqz p2, :cond_5

    .line 46
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v10

    invoke-static {v10}, Leg0;->i(Landroid/app/Activity;)V

    .line 47
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCustomerid(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setTxnid(Ljava/lang/String;)V

    .line 49
    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setUmn(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->getUmn()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatename(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRevocable(Ljava/lang/String;)V

    .line 53
    iget-object v7, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setSharetopayee(Ljava/lang/String;)V

    .line 54
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValiditystart(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValidityend(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc70;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmount(Ljava/lang/String;)V

    const v7, 0x50

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 57
    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmountrule(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1, v5}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRecurrence(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRulevalue(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRuletype(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMonthlylimit(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setNote(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeraddr(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayername(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getPayeeData()Lcom/olive/upi/transport/model/Payee;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeeaddr(Ljava/lang/String;)V

    .line 68
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeename(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setExecutebypayeepsp(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 71
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCreds(Lcom/olive/upi/transport/model/Cred;)V

    .line 72
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v0, v9, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d006a

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lbd0;->p:Landroid/view/View;

    const p2, 0x7f0a0337

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lbd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    iget-object p1, p0, Lbd0;->p:Landroid/view/View;

    const p2, 0x7f0a01bb

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lbd0;->q:Landroid/widget/TextView;

    .line 4
    iget-object p1, p0, Lbd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 5
    iget-object p1, p0, Lbd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lcom/upi/axispay/custom/SpacesItemDecoration;

    const/16 p3, 0x14

    invoke-direct {p2, p3}, Lcom/upi/axispay/custom/SpacesItemDecoration;-><init>(I)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 7
    iget-object p1, p0, Lbd0;->p:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 12

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_d

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x51

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v1, 0x2d

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p1, v1, :cond_5

    const/16 v0, 0x3a

    const/16 v1, 0x6e

    const v4, 0x52

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    if-eq p1, v0, :cond_3

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_1

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_5

    .line 5
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 6
    invoke-static {}, Leg0;->B()V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    iput-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 8
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 9
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 10
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 13
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_5

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 15
    invoke-static {}, Leg0;->B()V

    .line 16
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    iput-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 17
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 18
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 19
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 22
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_5

    .line 23
    :cond_5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_6

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 25
    :cond_6
    sget-object p1, Lbd0;->s:Ljava/lang/String;

    const v1, 0x53

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 26
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v3}, Lqa0;->k0(Ljava/util/ArrayList;)V

    goto :goto_3

    .line 27
    :cond_7
    sget-object p1, Lbd0;->s:Ljava/lang/String;

    const v1, 0x54

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 28
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v3}, Lqa0;->Z(Ljava/util/ArrayList;)V

    .line 29
    :cond_8
    :goto_3
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x12d

    invoke-interface {p1, v1, v3}, Lmg0;->o(ILjava/lang/Object;)V

    .line 30
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 31
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 33
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 34
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 35
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    goto :goto_4

    .line 36
    :cond_9
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 37
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 38
    :goto_4
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 39
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 40
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v4, 0x55

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 41
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 42
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 43
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 44
    invoke-static {}, Leg0;->B()V

    const p1, 0x56

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const p2, 0x7f120497

    if-eqz p1, :cond_a

    .line 46
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f1201be

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    const p1, 0x7f1203cd

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lbd0$a;

    invoke-direct {v8, p0}, Lbd0$a;-><init>(Lbd0;)V

    const p1, 0x7f1203d2

    .line 47
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lbd0$b;

    invoke-direct {v10, p0}, Lbd0$b;-><init>(Lbd0;)V

    const/4 v11, 0x1

    .line 48
    invoke-static/range {v4 .. v11}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    :cond_a
    const p1, 0x57

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 50
    invoke-static {}, Leg0;->B()V

    .line 51
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12005c

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f120499

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12031e

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lbd0$c;

    invoke-direct {v2, p0}, Lbd0$c;-><init>(Lbd0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    :cond_b
    const p1, 0x58

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 53
    invoke-static {}, Leg0;->B()V

    .line 54
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f120206

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    const p1, 0x7f1200d3

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lbd0$d;

    invoke-direct {v8, p0}, Lbd0$d;-><init>(Lbd0;)V

    const p1, 0x7f12031d

    .line 55
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lbd0$e;

    invoke-direct {v10, p0}, Lbd0$e;-><init>(Lbd0;)V

    const/4 v11, 0x1

    .line 56
    invoke-static/range {v4 .. v11}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 57
    :cond_c
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x18

    invoke-interface {p1, p2, v3}, Lmg0;->t(ILjava/lang/Object;)V

    .line 58
    :cond_d
    :goto_5
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 6

    const v0, 0x7f1200b2

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x50

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v0, v2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    const/4 v2, 0x0

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0xf

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2, v3}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Lbd0;->F(Ljava/util/ArrayList;)V

    :goto_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_b

    const/16 v1, 0x13

    if-eq v0, v1, :cond_a

    const/16 v1, 0x2d

    const/16 v2, 0x18

    const/4 v3, 0x0

    const v4, 0x59

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x5a

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x12d

    const v7, 0x5b

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0xa

    const/4 v9, 0x0

    if-eq v0, v1, :cond_6

    const/16 v1, 0x45

    if-eq v0, v1, :cond_4

    const/16 v1, 0x3a

    const/16 v2, 0x6e

    const v3, 0x5c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3b

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_3

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 5
    invoke-static {}, Leg0;->B()V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p2

    iput-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 7
    invoke-virtual {p2, v8}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 8
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 11
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v9}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 12
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 15
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, v8}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 16
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 19
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v9}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 20
    :cond_4
    invoke-static {}, Leg0;->B()V

    .line 21
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v6, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 22
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v9}, Lqa0;->Z(Ljava/util/ArrayList;)V

    .line 23
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 24
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 28
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 30
    :cond_5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 31
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1, v5}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 32
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 33
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 34
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v7}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v7, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 35
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1, v4, v3}, Ln70;->A(Ljava/lang/String;Z)V

    .line 36
    invoke-static {}, Leg0;->B()V

    .line 37
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v9}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 38
    :cond_6
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v6, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 39
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 40
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 42
    iget-object v1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 44
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 45
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 46
    :cond_7
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 47
    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1, v5}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 48
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 49
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 50
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v7}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v7, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 51
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    invoke-virtual {p2, v4, v3}, Ln70;->A(Ljava/lang/String;Z)V

    .line 52
    sget-object p2, Lbd0;->s:Ljava/lang/String;

    const v0, 0x5d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x1

    const/16 v3, 0x50

    if-eqz p2, :cond_8

    .line 53
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v4, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x3c

    invoke-direct {v4, v3, v5, v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {p2, v4}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 54
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->c()Ljava/lang/String;

    move-result-object v0

    const v1, 0x5e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const p2, 0x5f

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v0, v1}, Ln70;->x(Ljava/lang/String;J)V

    goto :goto_2

    .line 56
    :cond_8
    sget-object p1, Lbd0;->s:Ljava/lang/String;

    const p2, 0x60

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 57
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x230

    invoke-direct {v0, v3, v4, p2, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 58
    :cond_9
    :goto_2
    invoke-static {}, Leg0;->B()V

    .line 59
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v9}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_3

    .line 60
    :cond_a
    invoke-static {}, Leg0;->B()V

    .line 61
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x61

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 62
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 63
    iget-object p2, p0, Lbd0;->n:Lh90;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lh90;->B(Ljava/lang/String;)V

    goto :goto_3

    .line 64
    :cond_b
    invoke-static {}, Leg0;->B()V

    .line 65
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd0;->F(Ljava/util/ArrayList;)V

    :cond_c
    :goto_3
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    const v0, 0x7f0a0050

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a0270

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 3
    invoke-virtual {p0, p2}, Lbd0;->D(Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x50

    const/16 v2, 0x207

    invoke-direct {v0, v1, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v0, 0x62

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x63

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method public final y(Lcom/olive/upi/transport/model/Account;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->m()Ldg0;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    const v1, 0x64

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    const v1, 0x65

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    const v1, 0x66

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 8
    sget p1, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    const p1, 0x67

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 10
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 11
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    const p1, 0x68

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefUrl(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    .line 15
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    invoke-virtual {p1}, Loa0;->e()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 16
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    invoke-virtual {p1}, Loa0;->g()Ljava/util/Hashtable;

    move-result-object p1

    .line 17
    invoke-static {p1}, Ljg0;->f(Ljava/util/Hashtable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const v0, 0x69

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBillpayKey(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBillInfoString(Ljava/lang/String;)V

    .line 20
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x50

    const/16 v2, 0x1fe

    invoke-direct {p1, v0, v2, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0xa

    .line 21
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 22
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public final z(Lcom/olive/upi/transport/model/Account;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbd0;->E()V

    .line 2
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    .line 3
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->f()Ljava/lang/String;

    move-result-object v0

    const v1, 0x6a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->d()Ljava/lang/String;

    move-result-object v0

    const v1, 0x6b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lbd0;->o:Ldg0;

    invoke-virtual {v0}, Ldg0;->a()Ljava/lang/String;

    move-result-object v0

    const v1, 0x6c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {p1}, Ljg0;->f(Ljava/util/Hashtable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 7
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const v1, 0x6d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setBillpayKey(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBillInfoString(Ljava/lang/String;)V

    .line 9
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    iget-object v0, p0, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/16 v1, 0x50

    const/16 v2, 0x1fe

    invoke-direct {p1, v1, v2, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v0, 0x7

    .line 10
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
