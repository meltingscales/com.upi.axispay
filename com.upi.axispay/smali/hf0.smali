.class public Lhf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf0$b;
    }
.end annotation


# static fields
.field public static u:Ldg0;


# instance fields
.field public l:Lcom/olive/upi/transport/model/Rechargeplan;

.field public m:I

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Rechargetype;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lhf0$b;

.field public p:Landroid/view/View;

.field public q:Lcom/google/android/material/tabs/TabLayout;

.field public r:Landroidx/viewpager/widget/ViewPager;

.field public s:Landroid/widget/LinearLayout;

.field public t:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lhf0;->m:I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lhf0;->n:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic x(Lhf0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lhf0;->F(I)V

    return-void
.end method

.method public static z(Ldg0;)Lhf0;
    .locals 0

    .line 1
    sput-object p0, Lhf0;->u:Ldg0;

    .line 2
    new-instance p0, Lhf0;

    invoke-direct {p0}, Lhf0;-><init>()V

    return-object p0
.end method


# virtual methods
.method public A(Lcom/olive/upi/transport/model/Rechargeplan;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lhf0;->l:Lcom/olive/upi/transport/model/Rechargeplan;

    .line 2
    iget-object p1, p0, Lhf0;->r:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0, p1}, Lhf0;->D(Landroidx/viewpager/widget/ViewPager;)V

    .line 3
    iget-object p1, p0, Lhf0;->q:Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p0, Lhf0;->r:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method public final B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhf0;->p:Landroid/view/View;

    const v1, 0x7f0a0366

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lhf0;->r:Landroidx/viewpager/widget/ViewPager;

    .line 2
    iget-object v0, p0, Lhf0;->p:Landroid/view/View;

    const v1, 0x7f0a0368

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lhf0;->q:Lcom/google/android/material/tabs/TabLayout;

    .line 3
    iget-object v0, p0, Lhf0;->p:Landroid/view/View;

    const v1, 0x7f0a027d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lhf0;->s:Landroid/widget/LinearLayout;

    .line 4
    iget-object v0, p0, Lhf0;->p:Landroid/view/View;

    const v1, 0x7f0a01bb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lhf0;->p:Landroid/view/View;

    const v1, 0x7f0a03cb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lhf0;->t:Landroid/widget/Button;

    return-void
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhf0;->t:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final D(Landroidx/viewpager/widget/ViewPager;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lhf0;->o:Lhf0$b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lhf0$b;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lhf0$b;-><init>(Lhf0;Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lhf0;->o:Lhf0$b;

    .line 3
    :cond_0
    iget-boolean v0, p0, Lxc0;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 4
    iget v0, p0, Lhf0;->m:I

    invoke-virtual {p0, v0}, Lhf0;->F(I)V

    goto :goto_1

    .line 5
    :cond_1
    iget-object v0, p0, Lhf0;->l:Lcom/olive/upi/transport/model/Rechargeplan;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Rechargeplan;->getCircle()Lcom/olive/upi/transport/model/Circle;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 6
    iget-object v0, p0, Lhf0;->l:Lcom/olive/upi/transport/model/Rechargeplan;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Rechargeplan;->getCircle()Lcom/olive/upi/transport/model/Circle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Circle;->getRechargetype()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lhf0;->n:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    .line 7
    invoke-virtual {p0, v1}, Lhf0;->E(Z)V

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lhf0;->E(Z)V

    .line 9
    iget-object v0, p0, Lhf0;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Rechargetype;

    .line 10
    new-instance v3, Lbf0;

    invoke-direct {v3}, Lbf0;-><init>()V

    .line 11
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Rechargetype;->getRecharge()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v3, v4}, Lbf0;->x(Ljava/util/ArrayList;)V

    .line 12
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Rechargetype;->getTitle()Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 14
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Rechargetype;->getName()Ljava/lang/String;

    move-result-object v4

    .line 15
    :cond_3
    iget-object v2, p0, Lhf0;->o:Lhf0$b;

    invoke-virtual {v2, v3, v4}, Lhf0$b;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_4
    iget-object v0, p0, Lhf0;->o:Lhf0$b;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 17
    iget v0, p0, Lhf0;->m:I

    invoke-virtual {p0, v0}, Lhf0;->F(I)V

    .line 18
    :goto_1
    new-instance v0, Lhf0$a;

    invoke-direct {v0, p0}, Lhf0$a;-><init>(Lhf0;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 19
    iput-boolean v1, p0, Lxc0;->h:Z

    return-void

    .line 20
    :cond_5
    invoke-virtual {p0, v1}, Lhf0;->E(Z)V

    return-void
.end method

.method public final E(Z)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lhf0;->r:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lhf0;->q:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1, v0}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lhf0;->s:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lhf0;->r:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lhf0;->q:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lhf0;->s:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public final F(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhf0;->o:Lhf0$b;

    invoke-virtual {v0, p1}, Lhf0$b;->t(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lbf0;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lhf0;->n:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, p1, :cond_0

    .line 3
    iget-object v1, p0, Lhf0;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Rechargetype;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Rechargetype;->getRecharge()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbf0;->x(Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a03cb

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lhf0;->y()V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d009f

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lhf0;->p:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lhf0;->B()V

    .line 3
    invoke-virtual {p0}, Lhf0;->C()V

    .line 4
    iget-object p1, p0, Lhf0;->p:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    .line 2
    invoke-static {}, Leg0;->B()V

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lxc0;->h:Z

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lhf0;->E(Z)V

    return-void
.end method

.method public onResume()V
    .locals 9

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    const/16 v0, 0x53

    .line 3
    invoke-virtual {p0, v0}, Lxc0;->u(I)V

    .line 4
    sget-object v0, Lhf0;->u:Ldg0;

    invoke-virtual {v0}, Ldg0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const v1, 0x105

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x5a

    if-nez v1, :cond_1

    const v1, 0x106

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lxc0;->b:Lmg0;

    new-instance v1, Ltg0;

    const v3, 0x7f120289

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v0, v2, v1}, Lmg0;->o(ILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lxc0;->b:Lmg0;

    new-instance v1, Ltg0;

    const v3, 0x7f120162

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v0, v2, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 7
    :goto_0
    iget-object v0, p0, Lhf0;->l:Lcom/olive/upi/transport/model/Rechargeplan;

    if-nez v0, :cond_2

    .line 8
    invoke-virtual {p0}, Lhf0;->y()V

    .line 9
    :cond_2
    iget-object v0, p0, Lhf0;->l:Lcom/olive/upi/transport/model/Rechargeplan;

    invoke-virtual {p0, v0}, Lhf0;->A(Lcom/olive/upi/transport/model/Rechargeplan;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v1, 0x37

    if-eq p1, v1, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    const/4 p1, 0x0

    if-eqz v0, :cond_2

    const v1, 0x107

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/Rechargeplan;

    iput-object p2, p0, Lhf0;->l:Lcom/olive/upi/transport/model/Rechargeplan;

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lhf0;->E(Z)V

    .line 8
    iget-object p1, p0, Lhf0;->l:Lcom/olive/upi/transport/model/Rechargeplan;

    invoke-virtual {p0, p1}, Lhf0;->A(Lcom/olive/upi/transport/model/Rechargeplan;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0, p1}, Lhf0;->E(Z)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0, p1}, Lhf0;->E(Z)V

    :goto_0
    return-void
.end method

.method public final y()V
    .locals 9

    .line 1
    sget-object v0, Lhf0;->u:Ldg0;

    invoke-virtual {v0}, Ldg0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const v1, 0x108

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/16 v3, 0x37

    const/16 v4, 0x53

    if-nez v2, :cond_1

    const v1, 0x109

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    new-instance v2, Lcom/olive/upi/transport/model/RechargePlanParam;

    sget-object v5, Lhf0;->u:Ldg0;

    invoke-virtual {v5}, Ldg0;->c()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lhf0;->u:Ldg0;

    invoke-virtual {v6}, Ldg0;->d()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lhf0;->u:Ldg0;

    invoke-virtual {v7}, Ldg0;->b()Ljava/lang/String;

    move-result-object v7

    const v8, 0x10a

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v2, v8, v5, v6, v7}, Lcom/olive/upi/transport/model/RechargePlanParam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v4, v3, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    new-instance v5, Lcom/olive/upi/transport/model/RechargePlanParam;

    sget-object v6, Lhf0;->u:Ldg0;

    invoke-virtual {v6}, Ldg0;->f()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lhf0;->u:Ldg0;

    invoke-virtual {v7}, Ldg0;->d()Ljava/lang/String;

    move-result-object v7

    const v8, 0x10b

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v1, v6, v7, v8}, Lcom/olive/upi/transport/model/RechargePlanParam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v4, v3, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method
