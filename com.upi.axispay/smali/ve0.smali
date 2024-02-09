.class public Lve0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lng0;
.implements Lua0$e;


# instance fields
.field public l:I

.field public m:Landroid/widget/TextView;

.field public n:Lcom/upi/axispay/custom/NonScrollListView;

.field public o:Landroid/widget/LinearLayout;

.field public p:Landroid/widget/ImageView;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lk90;

.field public s:Lcom/olive/upi/transport/model/TransactionData;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lve0;->q:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic x(Lve0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lve0;->B(Ljava/lang/String;)V

    return-void
.end method

.method public static y()Lve0;
    .locals 1

    .line 1
    new-instance v0, Lve0;

    invoke-direct {v0}, Lve0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 2
    iput-object p1, p0, Lve0;->q:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {p0, p1}, Lve0;->z(Ljava/util/ArrayList;)V

    .line 4
    iget-object p1, p0, Lve0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lve0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lve0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lve0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public final B(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lve0;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lve0;->q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 4
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->filterString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0, v0}, Lve0;->z(Ljava/util/ArrayList;)V

    :cond_2
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
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0072

    if-eq p1, v0, :cond_0

    const v0, 0x7f0a00cf

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lve0;->s:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 3
    new-instance p1, Lma0;

    invoke-direct {p1}, Lma0;-><init>()V

    const/16 v0, 0x3f

    .line 4
    invoke-virtual {p1, v0}, Lma0;->c(I)V

    .line 5
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x40

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d0097

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    iput-object p2, p0, Lve0;->s:Lcom/olive/upi/transport/model/TransactionData;

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    const p2, 0x7f0a04af

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lve0;->m:Landroid/widget/TextView;

    const p2, 0x7f0a0072

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lve0;->p:Landroid/widget/ImageView;

    const p2, 0x7f0a01b5

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    const p2, 0x7f0a00cf

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    .line 8
    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p2, p0, Lve0;->p:Landroid/widget/ImageView;

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0a0561

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/NonScrollListView;

    iput-object p2, p0, Lve0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    const p2, 0x7f0a0279

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lve0;->o:Landroid/widget/LinearLayout;

    .line 12
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 p3, 0x1

    .line 13
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$p;->z1(Z)V

    .line 14
    iget-object p2, p0, Lve0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 15
    iget-object p2, p0, Lve0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    const p2, 0x7f0a03f0

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    .line 17
    new-instance p3, Lve0$a;

    invoke-direct {p3, p0}, Lve0$a;-><init>(Lve0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

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

    const/16 p2, 0x12

    if-eq p1, p2, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    :cond_1
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f12041e

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3f

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

    sget-object v1, Lqa0$e;->d:Lqa0$e;

    invoke-virtual {v0, v1}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 6
    invoke-virtual {p0, v0}, Lve0;->A(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lve0;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lve0;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p2

    const/16 v0, 0x12

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

    sget-object p2, Lqa0$e;->d:Lqa0$e;

    invoke-virtual {p1, p2}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lve0;->A(Ljava/util/ArrayList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    const v0, 0x7f0a00ad

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget p1, p0, Lve0;->l:I

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    const/4 v0, 0x1

    .line 3
    invoke-static {v0}, Lcom/olive/upi/transport/model/TransactionData;->setIsSelectedFromList(Z)V

    .line 4
    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 5
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->M()Lqa0$e;

    move-result-object p1

    .line 8
    sget-object p2, Lqa0$e;->b:Lqa0$e;

    if-eq p1, p2, :cond_1

    .line 9
    new-instance p1, Lma0;

    invoke-direct {p1}, Lma0;-><init>()V

    const/16 p2, 0x3f

    .line 10
    invoke-virtual {p1, p2}, Lma0;->c(I)V

    .line 11
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x40

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final z(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lve0;->r:Lk90;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lk90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    iget v2, p0, Lve0;->l:I

    invoke-direct {v0, v1, p1, v2}, Lk90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;I)V

    iput-object v0, p0, Lve0;->r:Lk90;

    goto :goto_0

    .line 3
    :cond_0
    iget v1, p0, Lve0;->l:I

    invoke-virtual {v0, p1, v1}, Lk90;->z(Ljava/util/ArrayList;I)V

    .line 4
    :goto_0
    iget-object p1, p0, Lve0;->r:Lk90;

    invoke-virtual {p1, p0}, Lk90;->y(Lng0;)V

    .line 5
    iget-object p1, p0, Lve0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    iget-object v0, p0, Lve0;->r:Lk90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method
