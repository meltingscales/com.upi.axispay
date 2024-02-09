.class public Lse0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# static fields
.field public static o:Lse0;

.field public static p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Ly90;

.field public n:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static x(Ljava/util/ArrayList;)Lse0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)",
            "Lse0;"
        }
    .end annotation

    .line 1
    sget-object v0, Lse0;->o:Lse0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lse0;

    invoke-direct {v0}, Lse0;-><init>()V

    sput-object v0, Lse0;->o:Lse0;

    .line 3
    :cond_0
    sput-object p0, Lse0;->p:Ljava/util/ArrayList;

    .line 4
    sget-object p0, Lse0;->o:Lse0;

    return-object p0
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

    const p3, 0x7f0d0094

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a0047

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lse0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 4
    iget-object p2, p0, Lse0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p3, Lcom/upi/axispay/custom/SpacesItemDecoration;

    const/16 v0, 0x14

    invoke-direct {p3, v0}, Lcom/upi/axispay/custom/SpacesItemDecoration;-><init>(I)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f030009

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lse0;->n:[Ljava/lang/String;

    const p2, 0x7f0a0444

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 7
    iget-object p3, p0, Lse0;->n:[Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

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
    .locals 2

    const v0, 0x7f120229

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x42

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    sget-object v0, Lse0;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    sget-object v0, Lse0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lse0;->y(Ljava/util/ArrayList;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/4 v1, 0x6

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
    invoke-virtual {p0, p1}, Lse0;->y(Ljava/util/ArrayList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    const v0, 0x7f0a0046

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x3c

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final y(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lse0;->m:Ly90;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ly90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ly90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lse0;->m:Ly90;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Ly90;->z(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lse0;->m:Ly90;

    invoke-virtual {p1, p0}, Ly90;->y(Lng0;)V

    .line 6
    iget-object p1, p0, Lse0;->l:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lse0;->m:Ly90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :cond_1
    return-void
.end method
