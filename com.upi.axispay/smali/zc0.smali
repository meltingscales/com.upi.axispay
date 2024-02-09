.class public Lzc0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroid/widget/LinearLayout;

.field public n:Landroid/widget/Button;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

.field public t:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lcom/olive/upi/transport/model/Billers;

.field public v:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ee

    if-eq p1, v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/model/BillerChargeReq;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BillerChargeReq;-><init>()V

    .line 3
    iget-object v0, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getOU_ID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BillerChargeReq;->setOU_ID(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getCORP_CODE()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BillerChargeReq;->setCORP_CODE(Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    iget-object v1, p0, Lzc0;->t:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    const-wide/16 v2, 0x0

    .line 7
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    .line 8
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 9
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 10
    iget-object v4, p0, Lzc0;->t:Ljava/util/Hashtable;

    invoke-virtual {v4, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 11
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    add-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :catch_0
    new-instance v5, Lcom/olive/upi/transport/model/NameVal;

    invoke-direct {v5, v3, v4}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/BillerChargeReq;->setAMT(Ljava/lang/String;)V

    .line 15
    new-instance v1, Lcom/olive/upi/transport/model/TagList;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/TagList;-><init>()V

    .line 16
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TagList;->setTag(Ljava/util/ArrayList;)V

    .line 17
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/BillerChargeReq;->setAMOUNT(Lcom/olive/upi/transport/model/TagList;)V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqa0;->W(Lcom/olive/upi/transport/model/BillerChargeReq;)V

    .line 19
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 20
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x7c

    const/16 v3, 0x44

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0074

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lzc0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lzc0;->y()V

    .line 3
    invoke-virtual {p0}, Lzc0;->z()V

    .line 4
    iget-object p1, p0, Lzc0;->l:Landroid/view/View;

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

    .line 1
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object v0

    iput-object v0, p0, Lzc0;->u:Lcom/olive/upi/transport/model/Billers;

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x7c

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 3
    invoke-super {p0}, Lxc0;->onResume()V

    .line 4
    invoke-virtual {p0}, Lzc0;->z()V

    .line 5
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

    const/16 v1, 0x44

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget p2, p0, Lxc0;->g:I

    if-ne p1, p2, :cond_1

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/BillerChargeRes;

    if-eqz p1, :cond_1

    .line 6
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x69

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public x(Lcom/olive/upi/transport/model/BillerRegEnqResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    return-void
.end method

.method public y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lzc0;->l:Landroid/view/View;

    const v1, 0x7f0a04ba

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lzc0;->q:Landroid/widget/TextView;

    .line 2
    iget-object v0, p0, Lzc0;->l:Landroid/view/View;

    const v1, 0x7f0a00b1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lzc0;->p:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lzc0;->l:Landroid/view/View;

    const v1, 0x7f0a00af

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lzc0;->o:Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Lzc0;->l:Landroid/view/View;

    const v1, 0x7f0a0259

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lzc0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    new-instance v1, Lcom/upi/axispay/custom/SpacesItemDecoration;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lcom/upi/axispay/custom/SpacesItemDecoration;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 6
    iget-object v0, p0, Lzc0;->l:Landroid/view/View;

    const v1, 0x7f0a00ee

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lzc0;->n:Landroid/widget/Button;

    .line 7
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v0, p0, Lzc0;->l:Landroid/view/View;

    const v1, 0x7f0a007d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lzc0;->m:Landroid/widget/LinearLayout;

    .line 9
    iget-object v0, p0, Lzc0;->l:Landroid/view/View;

    const v1, 0x7f0a04c0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lzc0;->r:Landroid/widget/TextView;

    .line 10
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    return-void
.end method

.method public final z()V
    .locals 10

    .line 1
    iget-object v0, p0, Lzc0;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getNM()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v1, Lcom/olive/upi/transport/model/NameVal;

    const v2, 0x7f1200ac

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getINVOICE_NO()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v1, Lcom/olive/upi/transport/model/NameVal;

    const v2, 0x7f1200b0

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getBILL_PERIOD()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v1, Lcom/olive/upi/transport/model/NameVal;

    const v2, 0x7f1200ab

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getVLD_FRM()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v1, Lcom/olive/upi/transport/model/NameVal;

    const v2, 0x7f120169

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getEXPR_DT()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    new-instance v1, Lcom/olive/upi/transport/model/NameVal;

    const v2, 0x7f12010a

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getCUST_CIF()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v1, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getADDTNL_INFO()Lcom/olive/upi/transport/model/TagList;

    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TagList;->getTag()Ljava/util/ArrayList;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/NameVal;

    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Lf90;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lf90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 13
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 15
    iget-object v2, p0, Lzc0;->v:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 16
    iget-object v0, p0, Lzc0;->v:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 17
    iget-object v0, p0, Lzc0;->p:Landroid/widget/TextView;

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v0, p0, Lzc0;->o:Landroid/widget/ImageView;

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Billers;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0800c8

    invoke-static {v0, v1, v2}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 19
    iget-object v0, p0, Lzc0;->p:Landroid/widget/TextView;

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, p0, Lzc0;->o:Landroid/widget/ImageView;

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Billers;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f08007f

    invoke-static {v0, v1, v2}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 21
    iget-object v0, p0, Lzc0;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d00bc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v3, 0x7f0a0080

    .line 23
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/CheckBox;

    const v5, 0x7f0a0087

    .line 24
    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const/4 v7, 0x0

    .line 25
    invoke-virtual {v4, v7}, Landroid/widget/CheckBox;->setChecked(Z)V

    const v7, 0x7f1200aa

    .line 26
    invoke-virtual {v4, v7}, Landroid/widget/CheckBox;->setText(I)V

    .line 27
    iget-object v7, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getAMT()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v7, p0, Lzc0;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 29
    new-instance v0, Lzc0$a;

    invoke-direct {v0, p0, v6, v4}, Lzc0$a;-><init>(Lzc0;Landroid/widget/TextView;Landroid/widget/CheckBox;)V

    invoke-virtual {v4, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 30
    iget-object v0, p0, Lzc0;->s:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getAMOUNT()Lcom/olive/upi/transport/model/TagList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 31
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TagList;->getTag()Ljava/util/ArrayList;

    move-result-object v0

    .line 32
    new-instance v4, Ljava/util/Hashtable;

    invoke-direct {v4}, Ljava/util/Hashtable;-><init>()V

    iput-object v4, p0, Lzc0;->t:Ljava/util/Hashtable;

    if-eqz v0, :cond_1

    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/NameVal;

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    invoke-virtual {v6, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    .line 35
    invoke-virtual {v6, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/CheckBox;

    .line 36
    invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 37
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/NameVal;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 38
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/NameVal;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    new-instance v4, Lzc0$b;

    invoke-direct {v4, p0, v7, v8}, Lzc0$b;-><init>(Lzc0;Landroid/widget/CheckBox;Landroid/widget/TextView;)V

    invoke-virtual {v7, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 40
    iget-object v4, p0, Lzc0;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_1
    return-void
.end method
