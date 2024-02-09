.class public Lad0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# instance fields
.field public A:Landroid/widget/LinearLayout;

.field public B:Landroid/widget/LinearLayout;

.field public C:Landroid/widget/LinearLayout;

.field public D:Landroid/widget/LinearLayout;

.field public E:Lcom/olive/upi/transport/model/Billers;

.field public F:Lcom/olive/upi/transport/model/TransactionData;

.field public G:Landroidx/recyclerview/widget/RecyclerView;

.field public H:Lcom/olive/upi/transport/model/BillerChargeReq;

.field public I:D

.field public l:Landroid/view/View;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Lcom/olive/upi/transport/model/BillerChargeRes;

.field public x:Landroid/widget/Button;

.field public y:Landroid/widget/ImageView;

.field public z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lad0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lad0;->z()V

    return-void
.end method


# virtual methods
.method public A(Lcom/olive/upi/transport/model/BillerChargeRes;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    return-void
.end method

.method public B()V
    .locals 3

    .line 1
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a04ba

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->m:Landroid/widget/TextView;

    .line 2
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0259

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lad0;->G:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance v1, Lcom/upi/axispay/custom/SpacesItemDecoration;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lcom/upi/axispay/custom/SpacesItemDecoration;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 4
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0087

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->o:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a00af

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lad0;->y:Landroid/widget/ImageView;

    .line 6
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a00b1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->v:Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0088

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->p:Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0089

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->q:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a008a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->r:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a008b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->s:Landroid/widget/TextView;

    .line 11
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a008c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->t:Landroid/widget/TextView;

    .line 12
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a008d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->u:Landroid/widget/TextView;

    .line 13
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a00ee

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lad0;->x:Landroid/widget/Button;

    .line 14
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a04c0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lad0;->n:Landroid/widget/TextView;

    .line 15
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 16
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0148

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lad0;->z:Landroid/widget/LinearLayout;

    .line 17
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0462

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lad0;->A:Landroid/widget/LinearLayout;

    .line 18
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0463

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lad0;->B:Landroid/widget/LinearLayout;

    .line 19
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0464

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lad0;->C:Landroid/widget/LinearLayout;

    .line 20
    iget-object v0, p0, Lad0;->l:Landroid/view/View;

    const v1, 0x7f0a0511

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lad0;->D:Landroid/widget/LinearLayout;

    return-void
.end method

.method public final C()V
    .locals 5

    .line 1
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0}, Loa0;->c()Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    move-result-object v0

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->o()Lcom/olive/upi/transport/model/BillerChargeReq;

    move-result-object v1

    iput-object v1, p0, Lad0;->H:Lcom/olive/upi/transport/model/BillerChargeReq;

    .line 3
    iget-object v1, p0, Lad0;->m:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getNM()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v2, Lcom/olive/upi/transport/model/NameVal;

    const v3, 0x7f1200ac

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getINVOICE_NO()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v2, Lcom/olive/upi/transport/model/NameVal;

    const v3, 0x7f1200b0

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getBILL_PERIOD()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    new-instance v2, Lcom/olive/upi/transport/model/NameVal;

    const v3, 0x7f1200ab

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getVLD_FRM()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    new-instance v2, Lcom/olive/upi/transport/model/NameVal;

    const v3, 0x7f120169

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getEXPR_DT()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    new-instance v2, Lcom/olive/upi/transport/model/NameVal;

    const v3, 0x7f12010a

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getCUST_CIF()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/olive/upi/transport/model/NameVal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerRegEnqResponse;->getADDTNL_INFO()Lcom/olive/upi/transport/model/TagList;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TagList;->getTag()Ljava/util/ArrayList;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/NameVal;

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lf90;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lf90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 15
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 17
    iget-object v2, p0, Lad0;->G:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 18
    iget-object v1, p0, Lad0;->G:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 19
    iget-object v0, p0, Lad0;->v:Landroid/widget/TextView;

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, p0, Lad0;->y:Landroid/widget/ImageView;

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Billers;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0800c8

    invoke-static {v0, v1, v2}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 21
    iget-object v0, p0, Lad0;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lad0;->H:Lcom/olive/upi/transport/model/BillerChargeReq;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerChargeReq;->getAMT()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    iget-object v0, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerChargeRes;->getCHRG_AMT()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lad0;->D(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 23
    iget-object v0, p0, Lad0;->p:Landroid/widget/TextView;

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getCHRG_AMT()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, Lad0;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 25
    :goto_1
    iget-object v0, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lad0;->D(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 26
    iget-object v0, p0, Lad0;->q:Landroid/widget/TextView;

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 27
    :cond_2
    iget-object v0, p0, Lad0;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 28
    :goto_2
    iget-object v0, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lad0;->D(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 29
    iget-object v0, p0, Lad0;->r:Landroid/widget/TextView;

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 30
    :cond_3
    iget-object v0, p0, Lad0;->B:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 31
    :goto_3
    iget-object v0, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lad0;->D(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 32
    iget-object v0, p0, Lad0;->s:Landroid/widget/TextView;

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 33
    :cond_4
    iget-object v0, p0, Lad0;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 34
    :goto_4
    iget-object v0, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerChargeRes;->getNET_CHRG_AMT()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lad0;->D(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    iget-object v0, p0, Lad0;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerChargeRes;->getNET_CHRG_AMT()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 36
    :cond_5
    iget-object v0, p0, Lad0;->D:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 37
    :goto_5
    iget-object v0, p0, Lad0;->H:Lcom/olive/upi/transport/model/BillerChargeReq;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerChargeReq;->getAMT()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getCHRG_AMT()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    add-double/2addr v0, v2

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT1()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    add-double/2addr v0, v2

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT2()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    add-double/2addr v0, v2

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getTAX_AMT3()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    add-double/2addr v0, v2

    iget-object v2, p0, Lad0;->w:Lcom/olive/upi/transport/model/BillerChargeRes;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerChargeRes;->getNET_CHRG_AMT()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lad0;->I:D

    .line 38
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    .line 39
    iget-wide v1, p0, Lad0;->I:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Loa0;->p(Ljava/lang/Double;)V

    .line 40
    iget-object v0, p0, Lad0;->u:Landroid/widget/TextView;

    iget-wide v1, p0, Lad0;->I:D

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final D(Ljava/lang/String;)Z
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, 0x0

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ee

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lad0;->z()V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    const/16 v0, 0x45

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    check-cast p2, Lcom/olive/upi/transport/model/BillPay;

    .line 3
    new-instance p1, Lcom/olive/upi/transport/model/BbpsPay;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BbpsPay;-><init>()V

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BillPay;->getPayRequest()Lcom/olive/upi/transport/model/PayRequest;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BbpsPay;->setPayRequest(Lcom/olive/upi/transport/model/PayRequest;)V

    .line 5
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p2

    invoke-virtual {p2}, Loa0;->c()Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BbpsPay;->setBbpspay(Lcom/olive/upi/transport/model/BillerRegEnqResponse;)V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x69

    invoke-direct {v1, v2, v0, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0075

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lad0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lad0;->B()V

    .line 3
    iget-object p1, p0, Lad0;->x:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    invoke-virtual {p0}, Lad0;->C()V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    iput-object p1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    .line 6
    iget-object p1, p0, Lad0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 11

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v1, 0x45

    if-ne p1, v1, :cond_5

    .line 6
    invoke-static {}, Leg0;->B()V

    .line 7
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_0

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 9
    :cond_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x12d

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Lmg0;->o(ILjava/lang/Object;)V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v2}, Lqa0;->Z(Ljava/util/ArrayList;)V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 12
    iget-object v1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 15
    iget-object v1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 16
    iget-object v1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 18
    :goto_0
    iget-object p1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 20
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 21
    iget-object p2, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v1, 0xb4f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 23
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    const p1, 0xb50

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const p2, 0x7f120497

    if-eqz p1, :cond_2

    .line 25
    iget-object p1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f1201be

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f1203cd

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lad0$a;

    invoke-direct {v7, p0}, Lad0$a;-><init>(Lad0;)V

    const p1, 0x7f1203d2

    .line 27
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lad0$b;

    invoke-direct {v9, p0}, Lad0$b;-><init>(Lad0;)V

    const/4 v10, 0x1

    .line 28
    invoke-static/range {v3 .. v10}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    :cond_2
    const p1, 0xb51

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 30
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12005c

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f120499

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12031e

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lad0$c;

    invoke-direct {v2, p0}, Lad0$c;-><init>(Lad0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    :cond_3
    const p1, 0xb52

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 32
    invoke-static {}, Leg0;->B()V

    .line 33
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f120206

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f1200d3

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lad0$d;

    invoke-direct {v7, p0}, Lad0$d;-><init>(Lad0;)V

    const p1, 0x7f12031d

    .line 34
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lad0$e;

    invoke-direct {v9, p0}, Lad0$e;-><init>(Lad0;)V

    const/4 v10, 0x1

    .line 35
    invoke-static/range {v3 .. v10}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 36
    :cond_4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x18

    invoke-interface {p1, p2, v2}, Lmg0;->t(ILjava/lang/Object;)V

    .line 37
    :cond_5
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

    iput-object v0, p0, Lad0;->E:Lcom/olive/upi/transport/model/Billers;

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x69

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 3
    invoke-super {p0}, Lxc0;->onResume()V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x45

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_2

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x12d

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lqa0;->Z(Ljava/util/ArrayList;)V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1}, Lua0;->f()Ljava/lang/String;

    move-result-object p1

    .line 8
    iget-object v0, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 12
    iget-object v0, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object p2, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 15
    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 16
    iget-object p2, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v0, 0xb53

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/16 p2, 0xa

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lad0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 19
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    const v0, 0xb54

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ln70;->j(Ljava/lang/String;)I

    move-result p2

    .line 20
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v2

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {v2, v0, p2}, Ln70;->v(Ljava/lang/String;I)V

    .line 21
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const/4 p2, 0x0

    const v0, 0xb55

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ln70;->A(Ljava/lang/String;Z)V

    .line 22
    invoke-static {}, Leg0;->B()V

    .line 23
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x18

    invoke-interface {p1, p2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final y(Lcom/olive/upi/transport/model/Account;)V
    .locals 4

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->m()Ldg0;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    const v1, 0xb56

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    const v1, 0xb57

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    const v1, 0xb58

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 8
    sget p1, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    const p1, 0xb59

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 10
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 11
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    const p1, 0xb5a

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefUrl(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    .line 15
    iget-wide v2, p0, Lad0;->I:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 16
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    invoke-virtual {p1}, Loa0;->g()Ljava/util/Hashtable;

    move-result-object p1

    .line 17
    invoke-static {p1}, Ljg0;->f(Ljava/util/Hashtable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBillInfoString(Ljava/lang/String;)V

    const p1, 0xb5b

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 19
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBillpayKey(Ljava/lang/String;)V

    .line 20
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x69

    const/16 v2, 0x1fe

    invoke-direct {p1, v0, v2, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0xa

    .line 21
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 22
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public final z()V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v1, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v0, v1}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    .line 3
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x50

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v2

    invoke-virtual {v2}, Loa0;->i()Lcom/olive/upi/transport/model/BillerCategory;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BillerCategory;->getCODE_VAL()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v2, :cond_2

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p0, v0}, Lad0;->y(Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f1202f0

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
