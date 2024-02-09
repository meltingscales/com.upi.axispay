.class public Lef0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# instance fields
.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/ProgressBar;

.field public o:Lfa0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00a4

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a03ac

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lef0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 4
    iget-object p2, p0, Lef0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p3, Lcom/upi/axispay/custom/SpacesItemDecoration;

    const/16 v0, 0xa

    invoke-direct {p3, v0}, Lcom/upi/axispay/custom/SpacesItemDecoration;-><init>(I)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    const p2, 0x7f0a01bb

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lef0;->m:Landroid/widget/TextView;

    const p2, 0x7f0a039d

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lef0;->n:Landroid/widget/ProgressBar;

    const p2, 0x7f0a044d

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    new-instance p3, Lef0$a;

    invoke-direct {p3, p0, p2}, Lef0$a;-><init>(Lef0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x22

    if-eq p1, v0, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Lef0;->x(Ljava/util/ArrayList;)V

    .line 6
    :cond_1
    :goto_0
    invoke-static {}, Leg0;->B()V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lef0;->n:Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public onResume()V
    .locals 6

    const v0, 0x7f1202dd

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x21

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

    invoke-virtual {v0}, Lqa0;->G()Ljava/util/ArrayList;

    .line 5
    iget-object v0, p0, Lef0;->n:Landroid/widget/ProgressBar;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x22

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2, v3}, Lua0;->g(ZLcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p2

    const/16 v0, 0x22

    if-eq p2, v0, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_1

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->G()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lef0;->x(Ljava/util/ArrayList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/TranHistory;

    const v0, 0x7f0a03ad

    if-eq p1, v0, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2c8d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v0

    const v2, 0x2c8e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v0

    const v2, 0x2c8f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    .line 5
    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    goto :goto_2

    :cond_4
    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_RECEIVE:I

    :goto_2
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionNote(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionType(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getQueryCloserComment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setQueryCloserComment(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getQuery()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setQueryComment(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getQueryid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setQueryid(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getQueryStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setQueryStatus(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getQuerydate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setQuerydate(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getExpirydateTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setExpirydateTime(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v2, 0x2c90

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0xa

    .line 19
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto/16 :goto_3

    .line 20
    :cond_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v2, 0x2c91

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x3

    .line 21
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_3

    .line 22
    :cond_6
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v2, 0x2c92

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 23
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_3

    .line 24
    :cond_7
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2c93

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x5

    .line 25
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_3

    .line 26
    :cond_8
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2c94

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v0, 0x4

    .line 27
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_3

    .line 28
    :cond_9
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2c95

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x6

    .line 29
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_3

    .line 30
    :cond_a
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2c96

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x7

    .line 31
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 32
    :cond_b
    :goto_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getTranid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRefid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 34
    new-instance v0, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Account;-><init>()V

    .line 35
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setAccRefNumber(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 38
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitBankName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setDebitBankName(Ljava/lang/String;)V

    .line 39
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 40
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 42
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditBankName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setCreditBankName(Ljava/lang/String;)V

    const/16 p2, 0x46

    .line 43
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setSource(I)V

    .line 44
    iget-object v0, p0, Lxc0;->b:Lmg0;

    invoke-interface {v0, p2, p1}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public final x(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
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
    iget-object v2, p0, Lef0;->o:Lfa0;

    if-nez v2, :cond_0

    .line 3
    new-instance v2, Lfa0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Lfa0;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v2, p0, Lef0;->o:Lfa0;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v2, p1}, Lfa0;->B(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lef0;->o:Lfa0;

    invoke-virtual {p1, p0}, Lfa0;->A(Lng0;)V

    .line 6
    iget-object p1, p0, Lef0;->l:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lef0;->o:Lfa0;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 7
    iget-object p1, p0, Lef0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lef0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object p1, p0, Lef0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lef0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 11
    :goto_1
    iget-object p1, p0, Lef0;->n:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method
