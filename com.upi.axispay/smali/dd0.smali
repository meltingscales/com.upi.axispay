.class public Ldd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# instance fields
.field public l:Landroid/widget/TextView;

.field public m:Landroid/app/Activity;

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lj90;

.field public p:Landroid/view/View;

.field public q:Landroidx/recyclerview/widget/RecyclerView;

.field public r:I

.field public s:Lgd0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldd0;->n:Ljava/util/ArrayList;

    return-void
.end method

.method private synthetic x(Ljava/lang/Object;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    check-cast p1, Lcom/olive/upi/transport/model/Collectbeneblock;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Collectbeneblock;->getVpa()Ljava/lang/String;

    move-result-object p2

    .line 4
    iget-object v0, p0, Ldd0;->s:Lgd0;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-interface {v0, v1, p1, v2}, Lgd0;->g(ILjava/lang/Object;I)V

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x11

    const/16 v2, 0x20

    invoke-direct {v0, v1, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static z()Ldd0;
    .locals 1

    .line 1
    new-instance v0, Ldd0;

    invoke-direct {v0}, Ldd0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldd0;->n:Ljava/util/ArrayList;

    return-void
.end method

.method public B(Lyc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldd0;->s:Lgd0;

    return-void
.end method

.method public C(Lma0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lma0;->b()I

    move-result v0

    iput v0, p0, Ldd0;->r:I

    .line 2
    invoke-virtual {p1}, Lma0;->a()I

    return-void
.end method

.method public final D(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldd0;->o:Lj90;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lj90;

    iget-object v1, p0, Ldd0;->m:Landroid/app/Activity;

    iget v2, p0, Ldd0;->r:I

    invoke-direct {v0, v1, p1, v2}, Lj90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;I)V

    iput-object v0, p0, Ldd0;->o:Lj90;

    goto :goto_0

    .line 3
    :cond_0
    iget v1, p0, Ldd0;->r:I

    invoke-virtual {v0, p1, v1}, Lj90;->z(Ljava/util/ArrayList;I)V

    .line 4
    :goto_0
    iget-object p1, p0, Ldd0;->o:Lj90;

    invoke-virtual {p1, p0}, Lj90;->y(Lng0;)V

    .line 5
    iget-object p1, p0, Ldd0;->q:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Ldd0;->o:Lj90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldd0;->F(Ljava/util/ArrayList;)V

    return-void
.end method

.method public F(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
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
    iput-object p1, p0, Ldd0;->n:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {p0, p1}, Ldd0;->D(Ljava/util/ArrayList;)V

    .line 4
    iget-object p1, p0, Ldd0;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Ldd0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Ldd0;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Ldd0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
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
    .locals 1

    const p3, 0x7f0d006c

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ldd0;->p:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Ldd0;->m:Landroid/app/Activity;

    .line 3
    iget-object p1, p0, Ldd0;->p:Landroid/view/View;

    const p2, 0x7f0a00b5

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Ldd0;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 5
    iget-object p1, p0, Ldd0;->p:Landroid/view/View;

    const p2, 0x7f0a01bb

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ldd0;->l:Landroid/widget/TextView;

    .line 6
    iget-object p1, p0, Ldd0;->p:Landroid/view/View;

    const p2, 0x7f0a044d

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 7
    new-instance p2, Ldd0$a;

    invoke-direct {p2, p0, p1}, Ldd0$a;-><init>(Ldd0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 8
    iget-object p1, p0, Ldd0;->p:Landroid/view/View;

    return-object p1
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual {p0}, Ldd0;->E()V

    .line 3
    iget-object v0, p0, Ldd0;->n:Ljava/util/ArrayList;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Ldd0;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Ldd0;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Ldd0;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Ldd0;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 8

    const v0, 0x7f0a00fd

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a0139

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const p1, 0x7f120102

    .line 2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f120145

    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const p1, 0x7f12031e

    .line 4
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljb0;

    invoke-direct {v5, p0, p2}, Ljb0;-><init>(Ldd0;Ljava/lang/Object;)V

    const p1, 0x7f1200bf

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ldd0$b;

    invoke-direct {v7, p0}, Ldd0$b;-><init>(Ldd0;)V

    .line 6
    invoke-static/range {v1 .. v7}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 7
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    check-cast p2, Lcom/olive/upi/transport/model/Collectbeneblock;

    .line 9
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpaBlock;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Collectbeneblock;->getVpa()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const v3, 0x2910

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3, v1, v2}, Lcom/olive/upi/transport/model/BeneVpaBlock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 12
    iget-object v0, p0, Ldd0;->s:Lgd0;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-interface {v0, v1, p2, v2}, Lgd0;->g(ILjava/lang/Object;I)V

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x11

    const/16 v2, 0x34

    invoke-direct {v0, v1, v2, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public synthetic y(Ljava/lang/Object;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ldd0;->x(Ljava/lang/Object;Landroid/view/View;)V

    return-void
.end method
