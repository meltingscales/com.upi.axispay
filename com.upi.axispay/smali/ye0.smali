.class public Lye0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# instance fields
.field public l:Landroid/widget/RelativeLayout;

.field public m:Landroidx/recyclerview/widget/RecyclerView;

.field public n:Landroid/widget/TextView;

.field public o:Laa0;

.field public p:Landroid/widget/ProgressBar;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;"
        }
    .end annotation
.end field

.field public r:Log0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lye0;)Log0;
    .locals 0

    .line 1
    iget-object p0, p0, Lye0;->r:Log0;

    return-object p0
.end method

.method public static y()Lye0;
    .locals 1

    .line 1
    new-instance v0, Lye0;

    invoke-direct {v0}, Lye0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lxc0;->i:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lye0;->q:Ljava/util/ArrayList;

    .line 3
    iget-object v0, p0, Lye0;->o:Laa0;

    if-nez v0, :cond_1

    .line 4
    new-instance p1, Laa0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lye0;->q:Ljava/util/ArrayList;

    invoke-direct {p1, v0, v1}, Laa0;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object p1, p0, Lye0;->o:Laa0;

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v0, p1}, Laa0;->z(Ljava/util/ArrayList;)V

    .line 6
    :goto_0
    iget-object p1, p0, Lye0;->o:Laa0;

    invoke-virtual {p1, p0}, Laa0;->y(Lng0;)V

    .line 7
    iget-object p1, p0, Lye0;->m:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lye0;->o:Laa0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 8
    iget-object p1, p0, Lye0;->q:Ljava/util/ArrayList;

    const/16 v0, 0x8

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 9
    iget-object p1, p0, Lye0;->p:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lye0;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 11
    :cond_2
    iget-object p1, p0, Lye0;->p:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lye0;->n:Landroid/widget/TextView;

    const/4 v0, 0x0

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

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d009a

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lye0;->l:Landroid/widget/RelativeLayout;

    const p2, 0x7f0a0356

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lye0;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    iget-object p1, p0, Lye0;->l:Landroid/widget/RelativeLayout;

    const p2, 0x7f0a01bb

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lye0;->n:Landroid/widget/TextView;

    .line 4
    iget-object p1, p0, Lye0;->l:Landroid/widget/RelativeLayout;

    const p2, 0x7f0a039d

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lye0;->p:Landroid/widget/ProgressBar;

    .line 5
    iget-object p1, p0, Lye0;->n:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lye0;->p:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lye0;->m:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 8
    iget-object p1, p0, Lye0;->l:Landroid/widget/RelativeLayout;

    const p2, 0x7f0a044d

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 9
    new-instance p2, Lye0$a;

    invoke-direct {p2, p0, p1}, Lye0$a;-><init>(Lye0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 10
    iget-object p1, p0, Lye0;->l:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 2

    const v0, 0x7f0a022b

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    check-cast p2, Lcom/olive/upi/transport/model/BannerOffersVo;

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getActionType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BannerOffersVo;->getClickUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lxc0;->b:Lmg0;

    invoke-static {p1, v0, v1}, Ljg0;->P(Ljava/lang/String;Ljava/lang/String;Lmg0;)V

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 4
    iget-object v0, p0, Lxc0;->d:Ljava/lang/String;

    const v1, 0x3788

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BannerOffersVo;->getClickUrl()Ljava/lang/String;

    move-result-object p2

    const v0, 0x3789

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x378a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method public z(Log0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lye0;->r:Log0;

    return-void
.end method
