.class public Laf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Landroid/app/DatePickerDialog$OnDateSetListener;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/ProgressBar;

.field public o:Lda0;

.field public p:Lcom/olive/upi/transport/model/TransactionData;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation
.end field

.field public r:Log0;

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Laf0;->q:Ljava/util/ArrayList;

    return-void
.end method

.method public static B(Ljava/util/ArrayList;)Laf0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)",
            "Laf0;"
        }
    .end annotation

    .line 1
    sput-object p0, Laf0;->t:Ljava/util/ArrayList;

    .line 2
    new-instance p0, Laf0;

    invoke-direct {p0}, Laf0;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Laf0;)I
    .locals 0

    .line 1
    iget p0, p0, Laf0;->s:I

    return p0
.end method

.method public static synthetic y(Laf0;Lcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Laf0;->C(Lcom/olive/upi/transport/model/PendingReqVo;)V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1
    new-instance v6, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f130246

    invoke-direct {v6, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {v6}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x7f0d0050

    .line 3
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    invoke-virtual {v6}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    const v0, 0x7f0a03b5

    .line 5
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/RadioGroup;

    const v0, 0x7f0a01e1

    .line 6
    invoke-virtual {v7, v0}, Landroid/widget/RadioGroup;->check(I)V

    const v0, 0x7f0a00d4

    .line 7
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/Button;

    const v0, 0x7f0a00d5

    .line 8
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/Button;

    const v0, 0x7f0a0107

    .line 9
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    .line 10
    new-instance v11, Laf0$d;

    move-object v0, v11

    move-object v1, p0

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Laf0$d;-><init>(Laf0;Landroid/app/Dialog;Landroid/widget/RadioGroup;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    new-instance v8, Laf0$e;

    move-object v0, v8

    invoke-direct/range {v0 .. v5}, Laf0$e;-><init>(Laf0;Landroid/app/Dialog;Landroid/widget/RadioGroup;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    new-instance p1, Laf0$f;

    invoke-direct {p1, p0, v6}, Laf0$f;-><init>(Laf0;Landroid/app/Dialog;)V

    invoke-virtual {v10, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x0

    .line 13
    invoke-virtual {v6, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 14
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final C(Lcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 6
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 7
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getExpdate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setExpiry(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getNotes()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getRefid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getTxnid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 12
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    iget-object v1, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 15
    iget-object v1, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 16
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterVpa(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 18
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x47

    const/16 v3, 0x1d

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public D(I)V
    .locals 0

    .line 1
    iput p1, p0, Laf0;->s:I

    return-void
.end method

.method public E(Log0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laf0;->r:Log0;

    return-void
.end method

.method public F()V
    .locals 3

    .line 1
    iget-object v0, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    .line 2
    sget-object v0, Laf0;->t:Ljava/util/ArrayList;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    iget-object v0, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Laf0;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Laf0;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    :goto_0
    iget-object v0, p0, Laf0;->n:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public G(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Laf0;->n:Landroid/widget/ProgressBar;

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

.method public H(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lxc0;->i:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3

    .line 3
    iget-object v0, p0, Laf0;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 5
    iput-object p1, p0, Laf0;->q:Ljava/util/ArrayList;

    .line 6
    iget-object v2, p0, Laf0;->o:Lda0;

    if-nez v2, :cond_1

    .line 7
    new-instance p1, Lda0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    iget-object v3, p0, Laf0;->q:Ljava/util/ArrayList;

    invoke-direct {p1, v2, v3}, Lda0;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object p1, p0, Laf0;->o:Lda0;

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v2, p1}, Lda0;->z(Ljava/util/ArrayList;)V

    .line 9
    :goto_0
    iget-object p1, p0, Laf0;->o:Lda0;

    invoke-virtual {p1, p0}, Lda0;->y(Lng0;)V

    .line 10
    iget-object p1, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Laf0;->o:Lda0;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 11
    iget-object p1, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Laf0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 13
    :cond_2
    iget-object p1, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 14
    iget-object p1, p0, Laf0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    :goto_1
    iget-object p1, p0, Laf0;->n:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_3
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

.method public onClick(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d009d

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    iput-object p2, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    const p2, 0x7f0a0382

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    const p2, 0x7f0a039d

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Laf0;->n:Landroid/widget/ProgressBar;

    .line 5
    iget-object p2, p0, Laf0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 6
    iget-object p2, p0, Laf0;->n:Landroid/widget/ProgressBar;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const p2, 0x7f0a01bb

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Laf0;->m:Landroid/widget/TextView;

    const p2, 0x7f0a044d

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 9
    new-instance p3, Laf0$a;

    invoke-direct {p3, p0, p2}, Laf0$a;-><init>(Laf0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    return-object p1
.end method

.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    iget-boolean v0, p0, Lxc0;->i:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    const/4 v1, 0x0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x47

    const/16 v4, 0xf

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    :cond_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/PendingReqVo;

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 2
    :sswitch_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getInvoiceurl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getInvoiceurl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lna0;->e(Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x45

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const/4 p2, 0x0

    const v0, 0x1231

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 7
    :sswitch_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const p1, 0x7f120136

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const p1, 0x7f120493

    .line 8
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f1204fe

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Laf0$b;

    invoke-direct {v4, p0, p2}, Laf0$b;-><init>(Laf0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    const p1, 0x7f120308

    .line 9
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Laf0$c;

    invoke-direct {v6, p0}, Laf0$c;-><init>(Laf0;)V

    .line 10
    invoke-static/range {v0 .. v6}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 11
    :sswitch_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getTxnid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Laf0;->A(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :sswitch_3
    invoke-virtual {p0, p2}, Laf0;->z(Lcom/olive/upi/transport/model/PendingReqVo;)V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a00d2 -> :sswitch_3
        0x7f0a00d4 -> :sswitch_2
        0x7f0a00de -> :sswitch_1
        0x7f0a024d -> :sswitch_0
    .end sparse-switch
.end method

.method public final z(Lcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 6
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 7
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setEditedAmount(Ljava/lang/Double;)V

    .line 8
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 9
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getExpdate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setExpiry(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getNotes()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getRefid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getTxnid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getMerchantflag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setMerchantflag(Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    iget-object v2, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, v2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 16
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 17
    iget-object v2, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 18
    iget-object v2, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterVpa(Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    iget-object v3, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, v3}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayerVpa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 21
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x9

    invoke-interface {p1, v1, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f12005c

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f1203c6

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Laf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Leg0;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
