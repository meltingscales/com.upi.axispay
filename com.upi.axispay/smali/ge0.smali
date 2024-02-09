.class public Lge0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroidx/recyclerview/widget/RecyclerView;

.field public n:Lt90;

.field public o:Landroid/widget/EditText;

.field public p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lcom/olive/upi/transport/model/Billers;

.field public r:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static A()Lge0;
    .locals 1

    .line 1
    new-instance v0, Lge0;

    invoke-direct {v0}, Lge0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lge0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lge0;->C(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public B(Lcom/olive/upi/transport/model/Billers;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lge0;->q:Lcom/olive/upi/transport/model/Billers;

    return-void
.end method

.method public final C(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lge0;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lge0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lge0;->z(Ljava/util/ArrayList;)V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v1, p0, Lge0;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 6
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0, v0}, Lge0;->z(Ljava/util/ArrayList;)V

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

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d008a

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lge0;->l:Landroid/view/View;

    const p2, 0x7f0a02ac

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lge0;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 4
    iget-object p1, p0, Lge0;->l:Landroid/view/View;

    const p2, 0x7f0a01bb

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lge0;->r:Landroid/widget/TextView;

    .line 5
    iget-object p1, p0, Lge0;->l:Landroid/view/View;

    const p2, 0x7f0a03eb

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lge0;->o:Landroid/widget/EditText;

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lua0;->u(Lua0$e;)V

    .line 7
    iget-object p1, p0, Lge0;->q:Lcom/olive/upi/transport/model/Billers;

    if-eqz p1, :cond_0

    .line 8
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 p3, 0x65

    const/16 v0, 0x30

    iget-object v1, p0, Lge0;->q:Lcom/olive/upi/transport/model/Billers;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, p3, v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lge0;->o:Landroid/widget/EditText;

    new-instance p2, Lge0$a;

    invoke-direct {p2, p0}, Lge0$a;-><init>(Lge0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 10
    iget-object p1, p0, Lge0;->l:Landroid/view/View;

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

    const/16 p2, 0x30

    if-eq p1, p2, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lge0;->p:Ljava/util/ArrayList;

    .line 6
    invoke-virtual {p0, p1}, Lge0;->z(Ljava/util/ArrayList;)V

    .line 7
    :cond_1
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 8

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    iget-object v0, p0, Lxc0;->b:Lmg0;

    new-instance v7, Ltg0;

    const v1, 0x7f120232

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    const/16 v1, 0x5a

    invoke-interface {v0, v1, v7}, Lmg0;->o(ILjava/lang/Object;)V

    const v0, 0x7f120403

    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x30

    if-eq v0, v1, :cond_0

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
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 6
    invoke-virtual {p0, p1}, Lge0;->y(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lge0;->p:Ljava/util/ArrayList;

    .line 7
    invoke-virtual {p0, p1}, Lge0;->z(Ljava/util/ArrayList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    const v0, 0x7f0a0126

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    check-cast p2, Ljava/lang/String;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->m()Ldg0;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1, p2}, Ldg0;->h(Ljava/lang/String;)V

    .line 4
    :cond_1
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0xc

    const/16 v0, 0x51

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lmg0;->o(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final y(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const v2, 0x997

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x8

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 2
    iget-object v1, p0, Lge0;->r:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lge0;->m:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    invoke-static {}, Leg0;->c()V

    .line 5
    iget-object v0, p0, Lge0;->n:Lt90;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Lt90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lt90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lge0;->n:Lt90;

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Lt90;->z(Ljava/util/ArrayList;)V

    .line 8
    :goto_0
    iget-object p1, p0, Lge0;->m:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lge0;->n:Lt90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 9
    iget-object p1, p0, Lge0;->n:Lt90;

    invoke-virtual {p1, p0}, Lt90;->y(Lng0;)V

    goto :goto_1

    .line 10
    :cond_1
    iget-object p1, p0, Lge0;->r:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lge0;->m:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_1
    return-void
.end method
