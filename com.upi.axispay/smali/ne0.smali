.class public Lne0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne0$j;
    }
.end annotation


# instance fields
.field public l:I

.field public m:Lke0;

.field public n:Lle0;

.field public o:Lme0;

.field public p:Loe0;

.field public q:Lne0$j;

.field public r:Landroid/view/View;

.field public s:Lcom/google/android/material/tabs/TabLayout;

.field public t:Landroidx/viewpager/widget/ViewPager;

.field public u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;"
        }
    .end annotation
.end field

.field public v:Lcom/olive/upi/transport/model/MandateTransactionData;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lne0;->l:I

    return-void
.end method

.method public static A()Lne0;
    .locals 1

    .line 1
    new-instance v0, Lne0;

    invoke-direct {v0}, Lne0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lne0;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method public static synthetic y(Lne0;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lne0;->u:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic z(Lne0;ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lne0;->B(ILjava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public final B(ILjava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lne0;->n:Lle0;

    if-eqz p1, :cond_4

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    sget-object v0, Lqa0$d;->c:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lle0;->z(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lne0;->o:Lme0;

    if-eqz p1, :cond_4

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    sget-object v0, Lqa0$d;->f:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lme0;->z(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p1, p0, Lne0;->p:Loe0;

    if-eqz p1, :cond_4

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    sget-object v0, Lqa0$d;->g:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Loe0;->C(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 7
    :cond_3
    iget-object p1, p0, Lne0;->m:Lke0;

    if-eqz p1, :cond_4

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    sget-object v0, Lqa0$d;->b:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lke0;->B(Ljava/util/ArrayList;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public C(Ljava/util/ArrayList;)V
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
    iput-object p1, p0, Lne0;->u:Ljava/util/ArrayList;

    .line 2
    iget-object p1, p0, Lne0;->t:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0, p1}, Lne0;->D(Landroidx/viewpager/widget/ViewPager;)V

    .line 3
    iget-object p1, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    const v0, 0x7f080056

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 4
    iget-object p1, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    const v0, 0x7f0801cd

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 5
    iget-object p1, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    const v0, 0x7f0800b7

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 6
    iget-object p1, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    const v0, 0x7f080098

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    return-void
.end method

.method public final D(Landroidx/viewpager/widget/ViewPager;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lne0;->q:Lne0$j;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lne0$j;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lne0$j;-><init>(Lne0;Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lne0;->q:Lne0$j;

    .line 3
    :cond_0
    iget-object v0, p0, Lne0;->m:Lke0;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Lke0;

    invoke-direct {v0}, Lke0;-><init>()V

    iput-object v0, p0, Lne0;->m:Lke0;

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    sget-object v2, Lqa0$d;->b:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lke0;->y(Ljava/util/ArrayList;)V

    .line 6
    iget-object v0, p0, Lne0;->m:Lke0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 7
    iget-object v0, p0, Lne0;->q:Lne0$j;

    iget-object v1, p0, Lne0;->m:Lke0;

    const v2, 0x37f7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lne0$j;->w(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lne0;->p:Loe0;

    if-nez v0, :cond_2

    .line 9
    new-instance v0, Loe0;

    invoke-direct {v0}, Loe0;-><init>()V

    iput-object v0, p0, Lne0;->p:Loe0;

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    sget-object v2, Lqa0$d;->g:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Loe0;->z(Ljava/util/ArrayList;)V

    .line 11
    iget-object v0, p0, Lne0;->p:Loe0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 12
    iget-object v0, p0, Lne0;->q:Lne0$j;

    iget-object v1, p0, Lne0;->p:Loe0;

    const v2, 0x37f8

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lne0$j;->w(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 13
    :cond_2
    iget-object v0, p0, Lne0;->o:Lme0;

    if-nez v0, :cond_3

    .line 14
    new-instance v0, Lme0;

    invoke-direct {v0}, Lme0;-><init>()V

    iput-object v0, p0, Lne0;->o:Lme0;

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    sget-object v2, Lqa0$d;->f:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lme0;->x(Ljava/util/ArrayList;)V

    .line 16
    iget-object v0, p0, Lne0;->o:Lme0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 17
    iget-object v0, p0, Lne0;->q:Lne0$j;

    iget-object v1, p0, Lne0;->o:Lme0;

    const v2, 0x37f9

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lne0$j;->w(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 18
    :cond_3
    iget-object v0, p0, Lne0;->n:Lle0;

    if-nez v0, :cond_4

    .line 19
    new-instance v0, Lle0;

    invoke-direct {v0}, Lle0;-><init>()V

    iput-object v0, p0, Lne0;->n:Lle0;

    .line 20
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    sget-object v2, Lqa0$d;->c:Lqa0$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lqa0;->A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lle0;->x(Ljava/util/ArrayList;)V

    .line 21
    iget-object v0, p0, Lne0;->n:Lle0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 22
    iget-object v0, p0, Lne0;->q:Lne0$j;

    iget-object v1, p0, Lne0;->n:Lle0;

    const v2, 0x37fa

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lne0$j;->w(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 23
    :cond_4
    iget-object v0, p0, Lne0;->q:Lne0$j;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 24
    iget v0, p0, Lne0;->l:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lne0;->B(ILjava/util/ArrayList;)V

    .line 25
    iget v0, p0, Lne0;->l:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 26
    iget-object v0, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/tabs/TabLayout;->K(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 27
    iget-object v0, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    new-instance v1, Lne0$g;

    invoke-direct {v1, p0}, Lne0$g;-><init>(Lne0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->d(Lcom/google/android/material/tabs/TabLayout$d;)V

    .line 28
    new-instance v0, Lne0$h;

    invoke-direct {v0, p0}, Lne0$h;-><init>(Lne0;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 29
    iget-object p1, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    new-instance v0, Lne0$i;

    invoke-direct {v0, p0}, Lne0$i;-><init>(Lne0;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->d(Lcom/google/android/material/tabs/TabLayout$d;)V

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 4

    const/16 v0, 0x4c

    if-ne p1, v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    new-instance p1, Lcom/olive/upi/transport/model/UpdateMandateRequest;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;-><init>()V

    .line 3
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x37fb

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setAppId(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x37fc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setCustomerId(Ljava/lang/String;)V

    .line 5
    check-cast p2, Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setUpdateMandate(Lcom/olive/upi/transport/model/UpdateMandate;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x71

    invoke-direct {v1, v2, v0, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d008d

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lne0;->r:Landroid/view/View;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 3
    iget-object p1, p0, Lne0;->r:Landroid/view/View;

    const p2, 0x7f0a0558

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/viewpager/widget/ViewPager;

    iput-object p1, p0, Lne0;->t:Landroidx/viewpager/widget/ViewPager;

    .line 4
    iget-object p1, p0, Lne0;->r:Landroid/view/View;

    const p2, 0x7f0a0454

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    iput-object p1, p0, Lne0;->s:Lcom/google/android/material/tabs/TabLayout;

    .line 5
    iget-object p1, p0, Lne0;->r:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual/range {p0 .. p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    const/16 v2, 0x4c

    const/4 v3, 0x1

    const v4, 0x37fd

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x37fe

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x6e

    const v8, 0x37ff

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    if-eq v1, v2, :cond_6

    const/16 v2, 0x4e

    if-eq v1, v2, :cond_5

    const/16 v2, 0x52

    if-eq v1, v2, :cond_0

    goto/16 :goto_3

    .line 4
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3800

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 8
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 9
    iget-object v1, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v8

    :goto_0
    invoke-virtual {v1, v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 11
    iget-object v1, v0, Lxc0;->b:Lmg0;

    invoke-interface {v1, v7, v6}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    const v2, 0x3801

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lne0$a;

    invoke-direct {v3, v0}, Lne0$a;-><init>(Lne0;)V

    invoke-static {v1, v5, v2, v4, v3}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3

    .line 14
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 15
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 16
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 17
    iget-object v1, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 18
    iget-object v1, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v8

    :goto_1
    invoke-virtual {v1, v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 20
    iget-object v1, v0, Lxc0;->b:Lmg0;

    invoke-interface {v1, v7, v6}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 21
    :cond_5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->y()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lne0;->C(Ljava/util/ArrayList;)V

    .line 22
    iget v1, v0, Lne0;->l:I

    iget-object v2, v0, Lne0;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lne0;->B(ILjava/util/ArrayList;)V

    goto/16 :goto_3

    .line 23
    :cond_6
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3802

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f120497

    if-eqz v1, :cond_7

    .line 24
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v9

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    const v1, 0x7f1201be

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v1, 0x3803

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lne0$b;

    invoke-direct {v13, v0}, Lne0$b;-><init>(Lne0;)V

    const v1, 0x3804

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Lne0$c;

    invoke-direct {v15, v0}, Lne0$c;-><init>(Lne0;)V

    const/16 v16, 0x1

    .line 26
    invoke-static/range {v9 .. v16}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 27
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    const v9, 0x3805

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 28
    invoke-static {}, Leg0;->B()V

    .line 29
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    new-instance v2, Lne0$d;

    invoke-direct {v2, v0}, Lne0$d;-><init>(Lne0;)V

    const v3, 0x3806

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v5, v3, v4, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 30
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    const v4, 0x3807

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 31
    invoke-static {}, Leg0;->B()V

    .line 32
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v9

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    const v1, 0x7f120206

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v1, 0x3808

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lne0$e;

    invoke-direct {v13, v0}, Lne0$e;-><init>(Lne0;)V

    new-instance v15, Lne0$f;

    invoke-direct {v15, v0}, Lne0$f;-><init>(Lne0;)V

    const/16 v16, 0x1

    const v14, 0x3809

    invoke-static {v14}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 33
    :cond_9
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 34
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 35
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_REVOKE_MANDATE:I

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 36
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 37
    iget-object v1, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_2

    :cond_a
    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v8

    :goto_2
    invoke-virtual {v1, v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 38
    iget-object v1, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 39
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, v0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 40
    iget-object v1, v0, Lxc0;->b:Lmg0;

    invoke-interface {v1, v7, v6}, Lmg0;->t(ILjava/lang/Object;)V

    .line 41
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    :cond_b
    return-void
.end method

.method public onResume()V
    .locals 9

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    iget-object v0, p0, Lxc0;->b:Lmg0;

    new-instance v7, Ltg0;

    const v8, 0x7f1202da

    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    const/16 v1, 0x5a

    invoke-interface {v0, v1, v7}, Lmg0;->o(ILjava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 4
    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x71

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->y()Ljava/util/ArrayList;

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 7
    new-instance v0, Lcom/olive/upi/transport/model/ReqMandateTxn;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/ReqMandateTxn;-><init>()V

    .line 8
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x380a

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/ReqMandateTxn;->setCustomerid(Ljava/lang/String;)V

    .line 9
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    const v4, 0x380b

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/ReqMandateTxn;->setTimestamp(Ljava/lang/String;)V

    const v3, 0x380c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/ReqMandateTxn;->setPageSize(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x380d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/ReqMandateTxn;->setAppid(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v2

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x4e

    invoke-direct {v3, v1, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 14
    iget v0, p0, Lne0;->l:I

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->y()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lne0;->B(ILjava/util/ArrayList;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 7

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v1, 0x4c

    const/4 v2, 0x0

    const/16 v3, 0x6e

    const v0, 0x380e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xa

    const v0, 0x380f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eq p1, v1, :cond_4

    const/16 v1, 0x4e

    if-eq p1, v1, :cond_3

    const/16 v1, 0x52

    if-eq p1, v1, :cond_1

    const/16 v1, 0x53

    if-eq p1, v1, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 4
    :try_start_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    .line 5
    invoke-static {p1, p2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 6
    new-instance p2, Ljava/lang/String;

    const v0, 0x3810

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 7
    iget-object p1, p0, Lne0;->m:Lke0;

    invoke-virtual {p1, p2}, Lke0;->z(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    .line 8
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 9
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 10
    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, v5}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 11
    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 14
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v3, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 15
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lne0;->u:Ljava/util/ArrayList;

    .line 17
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lne0;->u:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lqa0;->g0(Ljava/util/ArrayList;)V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->y()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lne0;->C(Ljava/util/ArrayList;)V

    .line 19
    iget p1, p0, Lne0;->l:I

    iget-object p2, p0, Lne0;->u:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lne0;->B(ILjava/util/ArrayList;)V

    goto :goto_2

    .line 20
    :cond_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 21
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 22
    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_REVOKE_MANDATE:I

    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3811

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, v5}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 25
    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 26
    iget-object p1, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 27
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lne0;->v:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 28
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v3, v2}, Lmg0;->t(ILjava/lang/Object;)V

    :catch_0
    :cond_6
    :goto_2
    return-void
.end method
