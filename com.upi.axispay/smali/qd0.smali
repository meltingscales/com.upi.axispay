.class public Lqd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroidx/recyclerview/widget/RecyclerView;

.field public n:Landroid/widget/ProgressBar;

.field public o:Lq90;

.field public p:Landroid/widget/TextView;

.field public q:Log0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic A(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method

.method public static B()Lqd0;
    .locals 1

    .line 1
    new-instance v0, Lqd0;

    invoke-direct {v0}, Lqd0;-><init>()V

    return-object v0
.end method

.method private synthetic y(Lcom/olive/upi/transport/model/Inbox;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    const p2, 0x1091

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Inbox;->setIsDelete(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x47

    const/16 v2, 0x51

    invoke-direct {v0, v1, v2, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method


# virtual methods
.method public C(Log0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqd0;->q:Log0;

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

    const p3, 0x7f0d007b

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lqd0;->l:Landroid/view/View;

    const p2, 0x7f0a023e

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lqd0;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    iget-object p1, p0, Lqd0;->l:Landroid/view/View;

    const p2, 0x7f0a01bb

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqd0;->p:Landroid/widget/TextView;

    .line 4
    iget-object p1, p0, Lqd0;->l:Landroid/view/View;

    const p2, 0x7f0a039d

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lqd0;->n:Landroid/widget/ProgressBar;

    .line 5
    iget-object p1, p0, Lqd0;->m:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 6
    iget-object p1, p0, Lqd0;->l:Landroid/view/View;

    const p2, 0x7f0a044d

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 7
    new-instance p2, Lqd0$a;

    invoke-direct {p2, p0, p1}, Lqd0$a;-><init>(Lqd0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 8
    iget-object p1, p0, Lqd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 10

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/Inbox;

    const v0, 0x7f0a0163

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a02a9

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const p1, 0x1092

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/Inbox;->setIsRead(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x47

    const/16 v2, 0x51

    invoke-direct {v0, v1, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    const p1, 0x7f120142

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f1201fe

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f12031e

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lbc0;

    invoke-direct {v7, p0, p2}, Lbc0;-><init>(Lqd0;Lcom/olive/upi/transport/model/Inbox;)V

    const p1, 0x7f1200bf

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lac0;->b:Lac0;

    .line 6
    invoke-static/range {v3 .. v9}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public x(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lxc0;->i:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lqd0;->o:Lq90;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lq90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lq90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lqd0;->o:Lq90;

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {v0, p1}, Lq90;->z(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object v0, p0, Lqd0;->o:Lq90;

    invoke-virtual {v0, p0}, Lq90;->y(Lng0;)V

    .line 6
    iget-object v0, p0, Lqd0;->m:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lqd0;->o:Lq90;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 7
    iget-object v0, p0, Lqd0;->n:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 9
    iget-object p1, p0, Lqd0;->p:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object p1, p0, Lqd0;->p:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public synthetic z(Lcom/olive/upi/transport/model/Inbox;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lqd0;->y(Lcom/olive/upi/transport/model/Inbox;Landroid/view/View;)V

    return-void
.end method
