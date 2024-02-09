.class public Lwc0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# instance fields
.field public l:Landroidx/viewpager/widget/ViewPager;

.field public m:I

.field public n:I

.field public final o:Landroid/os/Handler;

.field public p:Lcom/viewpagerindicator/CirclePageIndicator;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Banner;",
            ">;"
        }
    .end annotation
.end field

.field public r:Landroid/view/View;

.field public s:I

.field public t:J

.field public u:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwc0;->m:I

    .line 3
    iput v0, p0, Lwc0;->n:I

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lwc0;->o:Landroid/os/Handler;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwc0;->q:Ljava/util/ArrayList;

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lwc0;->t:J

    .line 7
    new-instance v0, Lwc0$a;

    invoke-direct {v0, p0}, Lwc0$a;-><init>(Lwc0;)V

    iput-object v0, p0, Lwc0;->u:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic A(Lwc0;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    iget-object p0, p0, Lwc0;->l:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method public static synthetic B(Lwc0;)I
    .locals 0

    .line 1
    iget p0, p0, Lwc0;->n:I

    return p0
.end method

.method public static C()Lwc0;
    .locals 1

    .line 1
    new-instance v0, Lwc0;

    invoke-direct {v0}, Lwc0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lwc0;)I
    .locals 0

    .line 1
    iget p0, p0, Lwc0;->m:I

    return p0
.end method

.method public static synthetic y(Lwc0;I)I
    .locals 0

    .line 1
    iput p1, p0, Lwc0;->m:I

    return p1
.end method

.method public static synthetic z(Lwc0;)I
    .locals 2

    .line 1
    iget v0, p0, Lwc0;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lwc0;->m:I

    return v0
.end method


# virtual methods
.method public final D()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    iget-object v0, p0, Lwc0;->o:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lwc0;->u:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 4
    :cond_1
    iget-object v0, p0, Lwc0;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->k()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f080072

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 7
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 8
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/olive/upi/transport/model/Banner;

    .line 9
    invoke-virtual {v3, v1}, Lcom/olive/upi/transport/model/Banner;->setDefaultImg(I)V

    .line 10
    iget-object v4, p0, Lwc0;->q:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 11
    :cond_3
    :goto_1
    new-instance v0, Lcom/olive/upi/transport/model/Banner;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Banner;-><init>()V

    .line 12
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Banner;->setDefaultImg(I)V

    .line 13
    iget-object v1, p0, Lwc0;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_4
    invoke-virtual {p0}, Lwc0;->G()V

    .line 15
    new-instance v0, Lp90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    iget-object v2, p0, Lwc0;->q:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lp90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 16
    invoke-virtual {v0, p0}, Lp90;->t(Lng0;)V

    .line 17
    iget-object v1, p0, Lwc0;->l:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 18
    iget-object v0, p0, Lwc0;->p:Lcom/viewpagerindicator/CirclePageIndicator;

    iget-object v1, p0, Lwc0;->l:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lcom/viewpagerindicator/CirclePageIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 19
    iget-object v0, p0, Lwc0;->p:Lcom/viewpagerindicator/CirclePageIndicator;

    new-instance v1, Lwc0$b;

    invoke-direct {v1, p0}, Lwc0$b;-><init>(Lwc0;)V

    invoke-virtual {v0, v1}, Lcom/viewpagerindicator/CirclePageIndicator;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final E()V
    .locals 0

    return-void
.end method

.method public final F()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwc0;->r:Landroid/view/View;

    const v1, 0x7f0a0364

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lwc0;->l:Landroidx/viewpager/widget/ViewPager;

    .line 2
    iget-object v0, p0, Lwc0;->r:Landroid/view/View;

    const v1, 0x7f0a017e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/viewpagerindicator/CirclePageIndicator;

    iput-object v0, p0, Lwc0;->p:Lcom/viewpagerindicator/CirclePageIndicator;

    return-void
.end method

.method public final G()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwc0;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lwc0;->n:I

    .line 2
    iget-object v0, p0, Lwc0;->o:Landroid/os/Handler;

    iget-object v1, p0, Lwc0;->u:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public H()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lwc0;->D()V

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

    const p3, 0x7f0d0067

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lwc0;->r:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    .line 3
    invoke-virtual {p0}, Lwc0;->E()V

    .line 4
    invoke-virtual {p0}, Lwc0;->F()V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const p2, 0x700

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 7
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lwc0;->s:I

    .line 8
    :cond_0
    iget-object p1, p0, Lwc0;->r:Landroid/view/View;

    return-object p1
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lxc0;->onPause()V

    .line 2
    iget-object v0, p0, Lwc0;->o:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lwc0;->u:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->k()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lwc0;->D()V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    iget v2, p0, Lwc0;->s:I

    const/16 v3, 0x2e

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->m(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 2

    const v0, 0x7f0a0226

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    check-cast p2, Lcom/olive/upi/transport/model/Banner;

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getActionType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getClickUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lxc0;->b:Lmg0;

    invoke-static {p1, v0, v1}, Ljg0;->P(Ljava/lang/String;Ljava/lang/String;Lmg0;)V

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 4
    iget-object v0, p0, Lxc0;->d:Ljava/lang/String;

    const v1, 0x701

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getClickUrl()Ljava/lang/String;

    move-result-object p2

    const v0, 0x702

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x703

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :goto_0
    return-void
.end method
