.class public Lcd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroidx/recyclerview/widget/RecyclerView;

.field public n:Li90;

.field public o:Landroid/widget/EditText;

.field public p:Lcom/olive/upi/transport/model/Billers;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCircle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lcd0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcd0;->C(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic y(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method

.method public static z()Lcd0;
    .locals 1

    .line 1
    new-instance v0, Lcd0;

    invoke-direct {v0}, Lcd0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A(Lcom/olive/upi/transport/model/Billers;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcd0;->p:Lcom/olive/upi/transport/model/Billers;

    return-void
.end method

.method public final B(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCircle;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcd0;->n:Li90;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Li90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Li90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcd0;->n:Li90;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Li90;->z(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lcd0;->n:Li90;

    invoke-virtual {p1, p0}, Li90;->y(Lng0;)V

    .line 6
    iget-object p1, p0, Lcd0;->m:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcd0;->n:Li90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f1202f5

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final C(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcd0;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lcd0;->q:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcd0;->B(Ljava/util/ArrayList;)V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v1, p0, Lcd0;->q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/BillerCircle;

    .line 6
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerCircle;->getDESCRPTN()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0, v0}, Lcd0;->B(Ljava/util/ArrayList;)V

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
    .locals 1

    const p3, 0x7f0d0066

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcd0;->l:Landroid/view/View;

    const p2, 0x7f0a009d

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcd0;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 4
    iget-object p1, p0, Lcd0;->l:Landroid/view/View;

    const p2, 0x7f0a0444

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    const/16 p2, 0x8

    .line 5
    invoke-virtual {p1, p2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcd0;->l:Landroid/view/View;

    const p2, 0x7f0a03f0

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcd0;->o:Landroid/widget/EditText;

    const p2, 0x7f1203e6

    .line 7
    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setHint(I)V

    .line 8
    iget-object p1, p0, Lcd0;->o:Landroid/widget/EditText;

    new-instance p2, Lcd0$a;

    invoke-direct {p2, p0}, Lcd0$a;-><init>(Lcd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 9
    iget-object p1, p0, Lcd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3a91

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12005c

    .line 5
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f12031e

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lib0;->b:Lib0;

    const v2, 0x3a92

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-static {p1, p2, v2, v0, v1}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 9
    :cond_1
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 7

    const v0, 0x7f1203fd

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x78

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-static {}, Leg0;->B()V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 5
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0}, Loa0;->i()Lcom/olive/upi/transport/model/BillerCategory;

    move-result-object v0

    .line 6
    iget-boolean v2, p0, Lxc0;->h:Z

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v2

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x41

    new-instance v5, Lcom/olive/upi/transport/model/BillerLocation;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getCODE_VAL()Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Lcd0;->p:Lcom/olive/upi/transport/model/Billers;

    invoke-direct {v5, v0, v6}, Lcom/olive/upi/transport/model/BillerLocation;-><init>(Ljava/lang/String;Lcom/olive/upi/transport/model/Billers;)V

    invoke-direct {v3, v1, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/16 v1, 0x41

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_5

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lcd0;->q:Ljava/util/ArrayList;

    if-eqz p1, :cond_5

    .line 6
    invoke-virtual {p0, p1}, Lcd0;->B(Ljava/util/ArrayList;)V

    .line 7
    iget-object p1, p0, Lcd0;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_5

    .line 8
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Loa0;->t(I)V

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x67

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 10
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3a93

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 12
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    if-eqz p1, :cond_2

    .line 13
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    .line 14
    :cond_2
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f120407

    .line 15
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x3a94

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x3a95

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x3a96

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lqa0;->y0(Ljava/util/ArrayList;Landroid/content/Context;)V

    goto :goto_1

    .line 19
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12005c

    .line 20
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f12003a

    .line 21
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12031e

    .line 22
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcd0$b;

    invoke-direct {v2, p0}, Lcd0$b;-><init>(Lcd0;)V

    .line 23
    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 24
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    const p2, 0x7f0a00a0

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p2, v0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 2
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Loa0;->t(I)V

    .line 3
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x67

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
