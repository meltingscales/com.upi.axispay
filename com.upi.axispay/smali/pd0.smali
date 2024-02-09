.class public Lpd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# instance fields
.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Lg90;

.field public n:Landroid/widget/EditText;

.field public o:Lcom/olive/upi/transport/model/Bank;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static B()Lpd0;
    .locals 1

    .line 1
    new-instance v0, Lpd0;

    invoke-direct {v0}, Lpd0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lpd0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lpd0;->E(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic y(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method

.method private synthetic z(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x15

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic A(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lpd0;->z(Landroid/view/View;)V

    return-void
.end method

.method public final C(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Account;

    .line 2
    iget-object v2, p0, Lpd0;->o:Lcom/olive/upi/transport/model/Bank;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Bank;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/Account;->setName(Ljava/lang/String;)V

    .line 3
    iget-object v2, p0, Lpd0;->o:Lcom/olive/upi/transport/model/Bank;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Bank;->getIin()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/Account;->setIin(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x42

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method

.method public final D(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Bank;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lpd0;->m:Lg90;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lg90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lg90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lpd0;->m:Lg90;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lg90;->z(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lpd0;->m:Lg90;

    invoke-virtual {p1, p0}, Lg90;->y(Lng0;)V

    .line 6
    iget-object p1, p0, Lpd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lpd0;->m:Lg90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x2541

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final E(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->j()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lpd0;->D(Ljava/util/ArrayList;)V

    return-void

    .line 4
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Bank;

    .line 6
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Bank;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0, v1}, Lpd0;->D(Ljava/util/ArrayList;)V

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

    const p3, 0x7f0d0079

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a009d

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lpd0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    const p2, 0x7f0a03f0

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lpd0;->n:Landroid/widget/EditText;

    .line 5
    new-instance p3, Lpd0$a;

    invoke-direct {p3, p0}, Lpd0$a;-><init>(Lpd0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

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

    const v0, 0x2542

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1200a1

    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lpd0;->o:Lcom/olive/upi/transport/model/Bank;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Bank;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, v0

    const/4 v0, 0x1

    sget-object v1, Ln70;->f:Ln70$a;

    .line 4
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x2543

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, v0

    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {}, Leg0;->B()V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x7f12005c

    .line 8
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12031e

    .line 9
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lzb0;->b:Lzb0;

    .line 10
    invoke-static {p2, v0, p1, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 12
    :cond_1
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 5

    const v0, 0x7f1203f9

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x68

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
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x15

    const/4 v4, 0x0

    invoke-direct {v2, v1, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lua0;->h(ZLcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/16 p2, 0x15

    if-eq v0, p2, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_6

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->j()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpd0;->D(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 6
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x2544

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    .line 9
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    .line 10
    iget-object v1, p0, Lpd0;->o:Lcom/olive/upi/transport/model/Bank;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Bank;->getIin()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setIin(Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Lpd0;->o:Lcom/olive/upi/transport/model/Bank;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Bank;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setBankName(Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 13
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f120407

    .line 14
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2545

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2546

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x2547

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 17
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lqa0;->y0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 18
    invoke-virtual {p0, p1}, Lpd0;->C(Ljava/util/ArrayList;)V

    goto :goto_2

    .line 19
    :cond_4
    :goto_1
    invoke-static {}, Leg0;->B()V

    .line 20
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12005c

    .line 21
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f12003a

    .line 22
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12031e

    .line 23
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lyb0;

    invoke-direct {v2, p0}, Lyb0;-><init>(Lpd0;)V

    .line 24
    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 25
    :cond_5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    const v0, 0x7f0a00a0

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 2
    check-cast p2, Lcom/olive/upi/transport/model/Bank;

    iput-object p2, p0, Lpd0;->o:Lcom/olive/upi/transport/model/Bank;

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lpd0;->o:Lcom/olive/upi/transport/model/Bank;

    invoke-virtual {p1, p2}, Lqa0;->s0(Lcom/olive/upi/transport/model/Bank;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :goto_0
    return-void
.end method
