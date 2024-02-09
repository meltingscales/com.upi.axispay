.class public Ltc0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# instance fields
.field public l:Landroid/widget/TextView;

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:Lk90;

.field public r:Landroid/widget/Button;

.field public s:Lgd0;

.field public t:Landroidx/recyclerview/widget/RecyclerView;

.field public u:I

.field public v:Landroid/widget/ProgressBar;

.field public w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ltc0;->n:I

    const/4 v0, 0x2

    .line 3
    iput v0, p0, Ltc0;->o:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltc0;->w:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic B(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method

.method private synthetic x(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Ltc0;->m:I

    iget v0, p0, Ltc0;->n:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Ltc0;->o:I

    if-ne p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xc

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic z(Ljava/lang/Object;ILandroid/view/View;)V
    .locals 4

    .line 1
    check-cast p1, Lcom/olive/upi/transport/model/BeneVpa;

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p3

    .line 3
    invoke-static {}, Leg0;->c()V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 5
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x11

    const/16 v3, 0x20

    invoke-direct {v1, v2, v3, p3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 6
    iget-object p3, p0, Ltc0;->s:Lgd0;

    const/4 v0, 0x0

    invoke-interface {p3, p2, p1, v0}, Lgd0;->g(ILjava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public synthetic A(Ljava/lang/Object;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltc0;->z(Ljava/lang/Object;ILandroid/view/View;)V

    return-void
.end method

.method public C(Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltc0;->w:Ljava/util/ArrayList;

    .line 2
    iput p2, p0, Ltc0;->m:I

    return-void
.end method

.method public D(Lyc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltc0;->s:Lgd0;

    return-void
.end method

.method public E(Lma0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lma0;->b()I

    move-result v0

    iput v0, p0, Ltc0;->u:I

    .line 2
    invoke-virtual {p1}, Lma0;->a()I

    return-void
.end method

.method public F(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ltc0;->p:Z

    return-void
.end method

.method public final G(Ljava/util/ArrayList;)V
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
    iget-object v0, p0, Ltc0;->q:Lk90;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lk90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    iget v2, p0, Ltc0;->u:I

    invoke-direct {v0, v1, p1, v2}, Lk90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;I)V

    iput-object v0, p0, Ltc0;->q:Lk90;

    goto :goto_0

    .line 3
    :cond_0
    iget v1, p0, Ltc0;->u:I

    invoke-virtual {v0, p1, v1}, Lk90;->z(Ljava/util/ArrayList;I)V

    .line 4
    :goto_0
    iget-object p1, p0, Ltc0;->q:Lk90;

    invoke-virtual {p1, p0}, Lk90;->y(Lng0;)V

    .line 5
    iget-object p1, p0, Ltc0;->t:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Ltc0;->q:Lk90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 6
    iget-object p1, p0, Ltc0;->v:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public H(Ljava/util/ArrayList;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iput p2, p0, Ltc0;->m:I

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 3
    iget-object p2, p0, Ltc0;->r:Landroid/widget/Button;

    const v0, 0x7f12005a

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    .line 4
    iget-object p2, p0, Ltc0;->r:Landroid/widget/Button;

    const v0, 0x7f120055

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x3

    if-ne p2, v0, :cond_3

    .line 5
    iget-object p2, p0, Ltc0;->r:Landroid/widget/Button;

    const v0, 0x7f12004d

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_0
    const/4 p2, 0x0

    const/16 v0, 0x8

    if-eqz p1, :cond_7

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_7

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ltc0;->w:Ljava/util/ArrayList;

    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/BeneVpa;

    .line 9
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lqa0;->P(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 10
    iget-object v2, p0, Ltc0;->w:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 11
    :cond_5
    iget-object p1, p0, Ltc0;->w:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_6

    .line 12
    iget-object p1, p0, Ltc0;->w:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ltc0;->G(Ljava/util/ArrayList;)V

    .line 13
    iget-object p1, p0, Ltc0;->t:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 14
    iget-object p1, p0, Ltc0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 15
    :cond_6
    iget-object p1, p0, Ltc0;->t:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 16
    iget-object p1, p0, Ltc0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 17
    :cond_7
    iget-object p1, p0, Ltc0;->t:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Ltc0;->l:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    :goto_2
    iget-object p1, p0, Ltc0;->v:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_8
    :goto_3
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

    const p3, 0x7f0d0064

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    const p2, 0x7f0a0561

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Ltc0;->t:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    const p2, 0x7f0a01bb

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Ltc0;->l:Landroid/widget/TextView;

    const p2, 0x7f0a039d

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Ltc0;->v:Landroid/widget/ProgressBar;

    const p2, 0x7f0a0073

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Ltc0;->r:Landroid/widget/Button;

    .line 8
    new-instance p3, Ldb0;

    invoke-direct {p3, p0}, Ldb0;-><init>(Ltc0;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0a044d

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 10
    new-instance p3, Ltc0$a;

    invoke-direct {p3, p0, p2}, Ltc0$a;-><init>(Ltc0;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    invoke-virtual {p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    return-object p1
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    iget-object v0, p0, Ltc0;->w:Ljava/util/ArrayList;

    iget v1, p0, Ltc0;->m:I

    invoke-virtual {p0, v0, v1}, Ltc0;->H(Ljava/util/ArrayList;I)V

    .line 3
    iget-boolean v0, p0, Ltc0;->p:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Ltc0;->r:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Ltc0;->r:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 9

    const v0, 0x7f0a00ad

    if-eq p1, v0, :cond_4

    const v0, 0x7f0a0139

    if-eq p1, v0, :cond_3

    const v0, 0x7f0a01d6

    if-eq p1, v0, :cond_0

    goto/16 :goto_1

    .line 1
    :cond_0
    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v1, 0x2b95

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object v0

    const v2, 0x2b96

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p2, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 8
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x11

    invoke-direct {v1, v2, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 9
    iget-object v0, p0, Ltc0;->s:Lgd0;

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lgd0;->g(ILjava/lang/Object;I)V

    goto :goto_1

    .line 10
    :cond_3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const v0, 0x7f120102

    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f120145

    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x7f12031e

    .line 13
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Leb0;

    invoke-direct {v6, p0, p2, p1}, Leb0;-><init>(Ltc0;Ljava/lang/Object;I)V

    const p1, 0x7f1200bf

    .line 14
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcb0;->b:Lcb0;

    .line 15
    invoke-static/range {v2 .. v8}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 16
    :cond_4
    iget p1, p0, Ltc0;->u:I

    const/4 v0, 0x5

    if-eq p1, v0, :cond_5

    .line 17
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    .line 18
    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 19
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 20
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->M()Lqa0$e;

    move-result-object p1

    .line 21
    sget-object p2, Lqa0$e;->b:Lqa0$e;

    if-eq p1, p2, :cond_5

    .line 22
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_5
    :goto_1
    return-void
.end method

.method public synthetic y(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Ltc0;->x(Landroid/view/View;)V

    return-void
.end method
