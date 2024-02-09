.class public Loe0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroidx/recyclerview/widget/RecyclerView;

.field public n:Landroid/widget/TextView;

.field public o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public q:Lcom/olive/upi/transport/model/DeviceDetails;

.field public r:Lw90;

.field public s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;"
        }
    .end annotation
.end field

.field public t:Landroid/graphics/Bitmap;

.field public u:Landroid/graphics/Bitmap;

.field public v:Landroid/view/LayoutInflater;

.field public w:Landroid/view/ViewGroup;

.field public x:Lcom/olive/upi/transport/model/BeneVpa;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Loe0;->o:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Loe0;->s:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    iput-object v0, p0, Loe0;->x:Lcom/olive/upi/transport/model/BeneVpa;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    iget-object v0, p0, Loe0;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Loe0;->m:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Loe0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Loe0;->m:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Loe0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public final B(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Loe0;->r:Lw90;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lw90;

    invoke-direct {v0, p1}, Lw90;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Loe0;->r:Lw90;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lw90;->z(Ljava/util/ArrayList;)V

    .line 4
    :goto_0
    iget-object p1, p0, Loe0;->r:Lw90;

    invoke-virtual {p1, p0}, Lw90;->y(Lng0;)V

    .line 5
    iget-object p1, p0, Loe0;->m:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Loe0;->r:Lw90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 6
    iget-object p1, p0, Loe0;->r:Lw90;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public C(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Loe0;->o:Ljava/util/ArrayList;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Loe0;->s:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 4
    iget-object p1, p0, Loe0;->s:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Loe0;->B(Ljava/util/ArrayList;)V

    .line 5
    iget-object p1, p0, Loe0;->m:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Loe0;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Loe0;->m:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Loe0;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Loe0;->m:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Loe0;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

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

    .line 1
    iput-object p1, p0, Loe0;->v:Landroid/view/LayoutInflater;

    .line 2
    iput-object p2, p0, Loe0;->w:Landroid/view/ViewGroup;

    const p3, 0x7f0d008e

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Loe0;->l:Landroid/view/View;

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object p1

    iput-object p1, p0, Loe0;->q:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 6
    iget-object p1, p0, Loe0;->l:Landroid/view/View;

    const p2, 0x7f0a01bb

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Loe0;->n:Landroid/widget/TextView;

    const p2, 0x34b9

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p0, Loe0;->l:Landroid/view/View;

    const p2, 0x7f0a006e

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Loe0;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 10
    iget-object p1, p0, Loe0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual {p0}, Loe0;->A()V

    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 17

    move-object/from16 v10, p0

    move/from16 v0, p1

    .line 1
    move-object/from16 v11, p2

    check-cast v11, Lcom/olive/upi/transport/model/MandatesVo;

    .line 2
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 3
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_start()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 4
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 5
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 6
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v2

    const v16, 0x34ba

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    if-eqz v2, :cond_0

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v12

    :goto_0
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 7
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setOccurence(Ljava/lang/String;)V

    .line 8
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 9
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getTxnid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 10
    iget-object v1, v10, Loe0;->x:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 11
    iget-object v1, v10, Loe0;->x:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 12
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 13
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v2, v10, Loe0;->x:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 14
    iget-object v1, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmountRule()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 16
    new-instance v1, Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/UpdateMandate;-><init>()V

    const v1, 0x7f0a00de

    const v16, 0x34bb

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    const v16, 0x34bc

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    const v16, 0x34bd

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    if-eq v0, v1, :cond_6

    const v1, 0x7f0a00e2

    if-eq v0, v1, :cond_2

    const v1, 0x7f0a0407

    if-eq v0, v1, :cond_1

    goto/16 :goto_3

    .line 17
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    invoke-static {v0}, Lig0;->a(Lcom/olive/upi/transport/model/MandateTransactionData;)Ljava/lang/String;

    move-result-object v0

    .line 18
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    const/16 v2, 0xfa

    invoke-static {v0, v1, v2}, Ljg0;->e(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v10, Loe0;->t:Landroid/graphics/Bitmap;

    .line 19
    iget-object v0, v10, Loe0;->v:Landroid/view/LayoutInflater;

    iget-object v1, v10, Loe0;->w:Landroid/view/ViewGroup;

    invoke-virtual {v10, v0, v1}, Loe0;->y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 20
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, v10, Loe0;->u:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lyg0;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;
    :try_end_0
    .catch Ld30; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :cond_2
    const v1, 0x7f0800de

    const v0, 0x7f1201b0

    .line 21
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v4

    .line 22
    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmountRule()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v11, Lcom/olive/upi/transport/model/MandatesVo;->validity_start:Ljava/lang/String;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v9

    const v16, 0x34be

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    .line 23
    invoke-virtual/range {v0 .. v9}, Loe0;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MANDATE_EXECUTE:I

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 25
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_start()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 26
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 27
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 28
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setRecurrence(Ljava/lang/String;)V

    .line 29
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v12

    :cond_3
    invoke-virtual {v0, v12}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 30
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 31
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 32
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 33
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerMobile()Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeMobile()Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v15}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 37
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 38
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 39
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 40
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    goto :goto_1

    .line 41
    :cond_4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v15}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 42
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 43
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 44
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 45
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 46
    :cond_5
    :goto_1
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_6
    const v1, 0x7f0800de

    const v0, 0x7f120139

    .line 47
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v4

    .line 48
    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmountRule()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v11, Lcom/olive/upi/transport/model/MandatesVo;->validity_start:Ljava/lang/String;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v9

    const v16, 0x34bf

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    .line 49
    invoke-virtual/range {v0 .. v9}, Loe0;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MANDATE_DECLINE:I

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 51
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_start()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 52
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 53
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 54
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setRecurrence(Ljava/lang/String;)V

    .line 55
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getRemarks()Ljava/lang/String;

    move-result-object v12

    :cond_7
    invoke-virtual {v0, v12}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 56
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 57
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 58
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 59
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerMobile()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeMobile()Ljava/lang/String;

    move-result-object v1

    .line 62
    iget-object v2, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 63
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v15}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 64
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 65
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 66
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 67
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    goto :goto_2

    .line 68
    :cond_8
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v15}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 69
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayerVpa(Ljava/lang/String;)V

    .line 70
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeVpa(Ljava/lang/String;)V

    .line 71
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 72
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 73
    :cond_9
    :goto_2
    iget-object v0, v10, Loe0;->p:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v11}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    :catch_0
    :goto_3
    return-void
.end method

.method public x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    .line 1
    new-instance v10, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f130246

    invoke-direct {v10, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x7f0d0054

    .line 3
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-virtual {v0, v2, v3}, Landroid/view/Window;->setLayout(II)V

    const v0, 0x7f0a00ec

    .line 5
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/Button;

    const v0, 0x7f0a016f

    .line 6
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    const v0, 0x7f0a0172

    .line 7
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v2, p2

    .line 8
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a0171

    .line 9
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move v2, p1

    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const v3, 0x7f060049

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 12
    invoke-virtual {v10, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 13
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    const v0, 0x34c0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {v11, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 15
    invoke-virtual {v11, v0}, Landroid/widget/Button;->setAllCaps(Z)V

    .line 16
    new-instance v13, Loe0$a;

    move-object v0, v13

    move-object v1, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object v9, v10

    invoke-direct/range {v0 .. v9}, Loe0$a;-><init>(Loe0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Dialog;)V

    invoke-virtual {v11, v13}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    new-instance v0, Loe0$b;

    invoke-direct {v0, p0, v10}, Loe0$b;-><init>(Loe0;Landroid/app/Dialog;)V

    invoke-virtual {v12, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 4

    const v0, 0x7f0d00bf

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a035f

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const p2, 0x7f0a023b

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Loe0;->t:Landroid/graphics/Bitmap;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 6
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 8
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 9
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {p1, v1, v1, v2, v0}, Landroid/view/View;->layout(IIII)V

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->buildDrawingCache(Z)V

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Loe0;->u:Landroid/graphics/Bitmap;

    .line 12
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    return-void
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Loe0;->o:Ljava/util/ArrayList;

    return-void
.end method
