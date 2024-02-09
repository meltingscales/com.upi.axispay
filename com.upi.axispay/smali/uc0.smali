.class public Luc0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# static fields
.field public static q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public l:Landroid/widget/TextView;

.field public m:Lka0;

.field public n:Landroidx/recyclerview/widget/RecyclerView;

.field public o:Landroid/widget/ProgressBar;

.field public p:Log0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static x(Ljava/util/ArrayList;)Luc0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)",
            "Luc0;"
        }
    .end annotation

    .line 1
    sput-object p0, Luc0;->q:Ljava/util/ArrayList;

    .line 2
    new-instance p0, Luc0;

    invoke-direct {p0}, Luc0;-><init>()V

    return-object p0
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    sput-object p1, Luc0;->q:Ljava/util/ArrayList;

    .line 2
    iget-object v0, p0, Luc0;->n:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Luc0;->o:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 5
    iget-object v2, p0, Luc0;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Luc0;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Luc0;->m:Lka0;

    if-nez v0, :cond_1

    .line 8
    new-instance v0, Lka0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lka0;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Luc0;->m:Lka0;

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v0, p1}, Lka0;->B(Ljava/util/List;)V

    .line 10
    :goto_0
    iget-object p1, p0, Luc0;->m:Lka0;

    invoke-virtual {p1, p0}, Lka0;->z(Lng0;)V

    .line 11
    iget-object p1, p0, Luc0;->n:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Luc0;->m:Lka0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 12
    iget-object p1, p0, Luc0;->m:Lka0;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    goto :goto_1

    .line 13
    :cond_2
    iget-object p1, p0, Luc0;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 14
    iget-object p1, p0, Luc0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object p1, p0, Luc0;->l:Landroid/widget/TextView;

    const v0, 0x7f12030a

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

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

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const p3, 0x7f0d0063

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    .line 3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p3

    const/4 v0, 0x5

    const/16 v1, -0x1e

    .line 4
    invoke-virtual {p3, v0, v1}, Ljava/util/Calendar;->add(II)V

    const v0, 0x7f0a01bb

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Luc0;->l:Landroid/widget/TextView;

    const v1, 0x264a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a0527

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Luc0;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    const v0, 0x7f0a039d

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Luc0;->o:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 11
    invoke-virtual {p3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p3

    const v0, 0x264b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const v1, 0x264c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x264d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 12
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    invoke-static {p2, v0}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    const p2, 0x7f0a044d

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 14
    new-instance p3, Luc0$a;

    invoke-direct {p3, p0, p2}, Luc0$a;-><init>(Luc0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    return-object p1
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    sget-object v0, Luc0;->q:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Luc0;->A(Ljava/util/ArrayList;)V

    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/TranHistory;

    .line 2
    new-instance p1, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionNote(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionType(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getExpirydateTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setExpiry(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getUmn()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setUmn(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 10
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDirection()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getUdir()Lcom/olive/upi/transport/model/Udir;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setUdir(Lcom/olive/upi/transport/model/Udir;)V

    .line 12
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getMcc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setCuurentTime(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x264e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eqz v0, :cond_0

    const/16 v0, 0xa

    .line 15
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto/16 :goto_0

    .line 16
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v4, 0x264f

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v4, 0x2650

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 20
    :cond_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v4, 0x2651

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x5

    .line 21
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 22
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v4, 0x2652

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 23
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 24
    :cond_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v4, 0x2653

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    .line 25
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 26
    :cond_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v4, 0x2654

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    .line 27
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 28
    :cond_6
    :goto_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRemitterName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterName(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getBeneficiaryName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneficiaryName(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getTranid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRefid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRefUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefUrl(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 34
    new-instance v0, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Account;-><init>()V

    .line 35
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitAccount()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Account;->setAccRefNumber(Ljava/lang/String;)V

    .line 36
    new-instance v4, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 37
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDirection()I

    move-result v5

    if-eq v5, v2, :cond_a

    const/4 v2, 0x2

    if-eq v5, v2, :cond_9

    if-eq v5, v3, :cond_8

    if-eq v5, v1, :cond_7

    goto :goto_1

    .line 38
    :cond_7
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitBankName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDebitBankName(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDestAccount(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    goto :goto_1

    .line 42
    :cond_8
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditBankName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDebitBankName(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDestAccount(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    goto :goto_1

    .line 46
    :cond_9
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditBankName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDebitBankName(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDestAccount(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    goto :goto_1

    .line 50
    :cond_a
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitBankName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDebitBankName(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDestAccount(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 54
    :goto_1
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 55
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 56
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditBankName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setCreditBankName(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    const/16 p2, 0x2d

    .line 58
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setSource(I)V

    .line 59
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 60
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x18

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method

.method public y(Log0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luc0;->p:Log0;

    return-void
.end method

.method public z(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Luc0;->o:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 2
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_1
    return-void
.end method
