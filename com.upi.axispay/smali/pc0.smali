.class public Lpc0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# static fields
.field public static q:Lpc0;


# instance fields
.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Ljava/lang/String;

.field public n:Lcom/olive/upi/transport/model/TransactionData;

.field public o:Lu90;

.field public p:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0x1885

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lpc0;->m:Ljava/lang/String;

    return-void
.end method

.method private synthetic A(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    invoke-virtual {p0, p1}, Lpc0;->H(Lcom/olive/upi/transport/model/Account;)V

    return-void
.end method

.method public static synthetic C(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method

.method private synthetic D(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lpc0;->m:Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x15

    const/16 v2, 0x1f

    invoke-direct {v0, v1, v2, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static F()Lpc0;
    .locals 1

    .line 1
    sget-object v0, Lpc0;->q:Lpc0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lpc0;

    invoke-direct {v0}, Lpc0;-><init>()V

    sput-object v0, Lpc0;->q:Lpc0;

    .line 3
    :cond_0
    sget-object v0, Lpc0;->q:Lpc0;

    return-object v0
.end method

.method private synthetic x(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x3a

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method


# virtual methods
.method public synthetic B(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpc0;->A(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V

    return-void
.end method

.method public synthetic E(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpc0;->D(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V

    return-void
.end method

.method public final G(Lcom/olive/upi/transport/model/Account;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120143

    .line 2
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1200fd

    .line 3
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12031e

    .line 4
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lza0;

    invoke-direct {v4, p0, p1}, Lza0;-><init>(Lpc0;Lcom/olive/upi/transport/model/Account;)V

    const p1, 0x7f1200bf

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lva0;->b:Lva0;

    .line 6
    invoke-static/range {v0 .. v6}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final H(Lcom/olive/upi/transport/model/Account;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120102

    .line 2
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120144

    .line 3
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1201c9

    .line 4
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lxa0;

    invoke-direct {v4, p0, p1}, Lxa0;-><init>(Lpc0;Lcom/olive/upi/transport/model/Account;)V

    .line 5
    invoke-static {v0, v1, v2, v3, v4}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final I(Ljava/util/ArrayList;)V
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
    iget-object v2, p0, Lpc0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lpc0;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lpc0;->o:Lu90;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lu90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lu90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lpc0;->o:Lu90;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lu90;->A(Ljava/util/ArrayList;)V

    .line 7
    :goto_0
    iget-object p1, p0, Lpc0;->o:Lu90;

    invoke-virtual {p1, p0}, Lu90;->y(Lng0;)V

    .line 8
    iget-object p1, p0, Lpc0;->l:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lpc0;->o:Lu90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object p1, p0, Lpc0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lpc0;->p:Landroid/widget/TextView;

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
    .locals 3

    const/16 v0, 0x15

    const/16 v1, 0x13

    if-eq p1, v1, :cond_1

    const/16 v1, 0x1c

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d007e

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    iput-object p2, p0, Lpc0;->n:Lcom/olive/upi/transport/model/TransactionData;

    const p2, 0x7f0a0047

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lpc0;->l:Landroidx/recyclerview/widget/RecyclerView;

    const p2, 0x7f0a01bb

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lpc0;->p:Landroid/widget/TextView;

    .line 6
    iget-object p2, p0, Lpc0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 7
    iget-object p2, p0, Lpc0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p3, Lcom/upi/axispay/custom/SpacesItemDecoration;

    const/16 v0, 0x14

    invoke-direct {p3, v0}, Lcom/upi/axispay/custom/SpacesItemDecoration;-><init>(I)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    const p2, 0x7f0a0071

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 9
    new-instance p3, Lya0;

    invoke-direct {p3, p0}, Lya0;-><init>(Lpc0;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0a044d

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 11
    new-instance p3, Lpc0$a;

    invoke-direct {p3, p0, p2}, Lpc0$a;-><init>(Lpc0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x13

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget v0, p0, Lxc0;->g:I

    if-ne p1, v0, :cond_3

    .line 4
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    .line 6
    :cond_0
    invoke-static {}, Leg0;->B()V

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const p1, 0x1886

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const v0, 0x1887

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    invoke-static {}, Leg0;->B()V

    .line 10
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

    sget-object v2, Lwa0;->b:Lwa0;

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 11
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 12
    :cond_3
    :goto_1
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 10

    const v0, 0x7f1202d0

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x15

    invoke-virtual {p0, v2, v1}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    iget-object v1, p0, Lxc0;->b:Lmg0;

    new-instance v9, Ltg0;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    const/16 v0, 0x5a

    invoke-interface {v1, v0, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v1, Lqa0$c;->b:Lqa0$c;

    invoke-virtual {v0, v1}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpc0;->I(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 9
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    const/4 v1, 0x0

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0xf

    const/4 v5, 0x0

    invoke-direct {v3, v2, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v3}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_7

    const/16 v2, 0x13

    if-eq v0, v2, :cond_5

    const/16 v2, 0x1c

    if-eq v0, v2, :cond_2

    const/16 v2, 0x1f

    const/16 v3, 0x15

    if-eq v0, v2, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p1, v3, :cond_8

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f120036

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 6
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f1202d0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x1888

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v0, p0, Lpc0;->m:Ljava/lang/String;

    const v2, 0x1889

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v2, 0x188a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, p2}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    if-eqz p1, :cond_1

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->b:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpc0;->I(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 12
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    const/4 p2, 0x1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/4 v2, 0x0

    invoke-direct {v0, v3, v1, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2, v0}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 13
    :goto_0
    invoke-static {}, Leg0;->B()V

    goto :goto_1

    .line 14
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 15
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x188b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f1204cc

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    .line 17
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x188c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 18
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120215

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    .line 19
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    .line 20
    :cond_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 21
    iget-object p2, p0, Lpc0;->o:Lu90;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lu90;->B(Ljava/lang/String;)V

    .line 22
    :cond_6
    invoke-static {}, Leg0;->B()V

    goto :goto_1

    .line 23
    :cond_7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->b:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpc0;->I(Ljava/util/ArrayList;)V

    .line 24
    invoke-static {}, Leg0;->B()V

    :cond_8
    :goto_1
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    const v0, 0x188d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 2
    :sswitch_0
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v1, 0x188e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/16 v0, 0x3d

    invoke-virtual {p1, v0}, Lqa0;->r0(I)V

    .line 4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 5
    :sswitch_1
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x3c

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 6
    :sswitch_2
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v1, 0x188f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lpc0;->n:Lcom/olive/upi/transport/model/TransactionData;

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_RESET:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/16 v0, 0x5c

    invoke-virtual {p1, v0}, Lqa0;->r0(I)V

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 10
    :sswitch_3
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x9

    const/16 v1, 0x210

    invoke-direct {p1, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 12
    :sswitch_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x15

    const/16 v2, 0x207

    invoke-direct {v0, v1, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 14
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 15
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v0, 0x1890

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p2, 0x7f1202d0

    .line 16
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x1891

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x1892

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 18
    :sswitch_5
    invoke-virtual {p0, p2}, Lpc0;->G(Lcom/olive/upi/transport/model/Account;)V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a0042 -> :sswitch_5
        0x7f0a0050 -> :sswitch_4
        0x7f0a00d7 -> :sswitch_3
        0x7f0a00f5 -> :sswitch_2
        0x7f0a00f9 -> :sswitch_1
        0x7f0a00fa -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic y(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lpc0;->x(Landroid/view/View;)V

    return-void
.end method
