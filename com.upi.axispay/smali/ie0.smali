.class public Lie0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie0$a;
    }
.end annotation


# instance fields
.field public l:Lcom/olive/upi/transport/model/BillerCategory;

.field public m:Landroid/view/View;

.field public n:Landroidx/recyclerview/widget/RecyclerView;

.field public o:Lba0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static A()Lie0;
    .locals 1

    .line 1
    new-instance v0, Lie0;

    invoke-direct {v0}, Lie0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public B(Lcom/olive/upi/transport/model/BillerCategory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lie0;->l:Lcom/olive/upi/transport/model/BillerCategory;

    return-void
.end method

.method public final C(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/DTHOperator;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/DTHOperator;

    .line 4
    new-instance v2, Lcom/olive/upi/transport/model/Billers;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/Billers;-><init>()V

    .line 5
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/DTHOperator;->getDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/Billers;->setName(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lie0;->o:Lba0;

    if-nez p1, :cond_1

    .line 8
    new-instance p1, Lba0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Lba0;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object p1, p0, Lie0;->o:Lba0;

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p1, v0}, Lba0;->z(Ljava/util/List;)V

    .line 10
    :goto_1
    iget-object p1, p0, Lie0;->n:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lie0;->o:Lba0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 11
    iget-object p1, p0, Lie0;->o:Lba0;

    invoke-virtual {p1, p0}, Lba0;->y(Lng0;)V

    goto :goto_2

    .line 12
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f120302

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public final D(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lie0;->o:Lba0;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lba0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lba0;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lie0;->o:Lba0;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lba0;->z(Ljava/util/List;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lie0;->n:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lie0;->o:Lba0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 6
    iget-object p1, p0, Lie0;->o:Lba0;

    invoke-virtual {p1, p0}, Lba0;->y(Lng0;)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f120302

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public E(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lie0;->o:Lba0;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lba0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lba0;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lie0;->o:Lba0;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lba0;->z(Ljava/util/List;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lie0;->n:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lie0;->o:Lba0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 6
    iget-object p1, p0, Lie0;->o:Lba0;

    invoke-virtual {p1, p0}, Lba0;->y(Lng0;)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f120302

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

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
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d008b

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lie0;->m:Landroid/view/View;

    const p2, 0x7f0a03bf

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lie0;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    const/4 p3, 0x3

    invoke-direct {p1, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 4
    iget-object p2, p0, Lie0;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 5
    iget-object p1, p0, Lie0;->n:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lie0$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljg0;->d(Landroid/content/Context;I)I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p2, p0, p3, v0, v1}, Lie0$a;-><init>(Lie0;IIZ)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 6
    iget-object p1, p0, Lie0;->n:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lxi;

    invoke-direct {p2}, Lxi;-><init>()V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    .line 7
    iget-object p1, p0, Lie0;->m:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 11

    const v0, 0x7f120403

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x64

    invoke-virtual {p0, v2, v1}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lua0;->u(Lua0$e;)V

    .line 4
    iget-object v1, p0, Lie0;->l:Lcom/olive/upi/transport/model/BillerCategory;

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerCategory;->getFixedCategory()I

    move-result v1

    const/16 v3, 0x51

    const/16 v4, 0x5a

    if-ne v1, v3, :cond_0

    .line 6
    iget-object v1, p0, Lxc0;->b:Lmg0;

    new-instance v2, Ltg0;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v4, v2}, Lmg0;->o(ILjava/lang/Object;)V

    .line 7
    invoke-virtual {p0}, Lie0;->z()V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lie0;->l:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerCategory;->getFixedCategory()I

    move-result v1

    const/16 v3, 0x55

    if-ne v1, v3, :cond_1

    .line 9
    iget-object v1, p0, Lxc0;->b:Lmg0;

    new-instance v2, Ltg0;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v4, v2}, Lmg0;->o(ILjava/lang/Object;)V

    .line 10
    invoke-virtual {p0}, Lie0;->y()V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lxc0;->b:Lmg0;

    new-instance v1, Ltg0;

    iget-object v3, p0, Lie0;->l:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BillerCategory;->getDSCRPTN()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v0, v4, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x40

    iget-object v4, p0, Lie0;->l:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/BillerCategory;->getCODE_VAL()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p2

    const/16 v0, 0x33

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3d

    if-eq p2, v0, :cond_1

    const/16 v0, 0x40

    if-eq p2, v0, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_3

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    invoke-virtual {p1}, Loa0;->d()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lie0;->D(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->D()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lie0;->x(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lie0;->E(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 9
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->t()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lie0;->C(Ljava/util/ArrayList;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/Billers;

    .line 2
    iget-object v0, p0, Lie0;->l:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getFixedCategory()I

    move-result v0

    const/16 v1, 0x51

    if-ne v0, v1, :cond_1

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->m()Ldg0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldg0;->j(Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x65

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lie0;->l:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getFixedCategory()I

    move-result v0

    const/16 v1, 0x55

    if-ne v0, v1, :cond_3

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->m()Ldg0;

    move-result-object p1

    if-nez p1, :cond_2

    .line 8
    new-instance p1, Ldg0;

    invoke-direct {p1}, Ldg0;-><init>()V

    .line 9
    :cond_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldg0;->j(Ljava/lang/String;)V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqa0;->U(Ldg0;)V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    .line 12
    :cond_3
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0, p1}, Loa0;->r(I)V

    .line 13
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x78

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final x(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/OperatorsLogos;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/OperatorsLogos;

    .line 3
    new-instance v2, Lcom/olive/upi/transport/model/Billers;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/Billers;-><init>()V

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/OperatorsLogos;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/Billers;->setName(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/OperatorsLogos;->getLogo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/Billers;->setIconUrl(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final y()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->t()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0, v0}, Lie0;->C(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x64

    const/16 v3, 0x33

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->o(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public z()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->D()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0, v0}, Lie0;->x(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lie0;->E(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x64

    const/16 v3, 0x3d

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->p(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_3
    :goto_1
    return-void
.end method
