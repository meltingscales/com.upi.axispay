.class public Lud0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Lng0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud0$a;
    }
.end annotation


# static fields
.field public static t:Lud0;


# instance fields
.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Landroid/app/Activity;

.field public n:Landroid/view/View;

.field public o:Lr90;

.field public p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lrg0;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lcom/olive/upi/transport/model/GetMandate;

.field public r:I

.field public s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
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

.method public static y()Lud0;
    .locals 1

    .line 1
    sget-object v0, Lud0;->t:Lud0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lud0;

    invoke-direct {v0}, Lud0;-><init>()V

    sput-object v0, Lud0;->t:Lud0;

    .line 3
    :cond_0
    sget-object v0, Lud0;->t:Lud0;

    return-object v0
.end method


# virtual methods
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
    .locals 10

    const p3, 0x7f0d00c5

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lud0;->n:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Lud0;->m:Landroid/app/Activity;

    .line 3
    iget-object p1, p0, Lud0;->n:Landroid/view/View;

    const p2, 0x7f0a03bf

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lud0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    const/4 p3, 0x2

    invoke-direct {p1, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 5
    iget-object p2, p0, Lud0;->l:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 6
    iget-object p1, p0, Lud0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lud0$a;

    invoke-virtual {p0, p3}, Lud0;->x(I)I

    move-result p3

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0, p3, v0}, Lud0$a;-><init>(Lud0;IIZ)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 7
    iget-object p1, p0, Lud0;->l:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lxi;

    invoke-direct {p2}, Lxi;-><init>()V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lud0;->p:Ljava/util/ArrayList;

    .line 9
    new-instance p2, Lrg0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    const v9, 0x7f060193

    invoke-static {p3, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    const v1, 0x2337

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0800bd

    const v3, 0x7f0800c0

    const/4 v4, 0x1

    const/16 v5, 0x6a

    const/4 v6, 0x1

    const v7, 0x7f0802a5

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lrg0;-><init>(Ljava/lang/String;IIZIIII)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object p1, p0, Lud0;->p:Ljava/util/ArrayList;

    new-instance p2, Lrg0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v7

    const v1, 0x2338

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f080266

    const v3, 0x7f0801ed

    const/16 v5, 0x85

    const v6, 0x7f0802a5

    const/4 v8, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lrg0;-><init>(Ljava/lang/String;IIZIIIZ)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object p1, p0, Lud0;->p:Ljava/util/ArrayList;

    new-instance p2, Lrg0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    const v9, 0x7f0600bc

    invoke-static {p3, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v7

    const v1, 0x2339

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f080226

    const v3, 0x7f0801f0

    const/16 v5, 0x71

    const v6, 0x7f080091

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lrg0;-><init>(Ljava/lang/String;IIZIIIZ)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    iget-object p1, p0, Lud0;->p:Ljava/util/ArrayList;

    new-instance p2, Lrg0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v7

    const v1, 0x233a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f08024f

    const/16 v5, 0x81

    const/4 v8, 0x1

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lrg0;-><init>(Ljava/lang/String;IIZIIIZ)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object p1, p0, Lud0;->o:Lr90;

    if-nez p1, :cond_0

    .line 14
    new-instance p1, Lr90;

    iget-object p2, p0, Lud0;->m:Landroid/app/Activity;

    iget-object p3, p0, Lud0;->p:Ljava/util/ArrayList;

    invoke-direct {p1, p2, p3}, Lr90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object p1, p0, Lud0;->o:Lr90;

    goto :goto_0

    .line 15
    :cond_0
    iget-object p2, p0, Lud0;->p:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lr90;->A(Ljava/util/ArrayList;)V

    .line 16
    :goto_0
    iget-object p1, p0, Lud0;->l:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, Lud0;->o:Lr90;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 17
    iget-object p1, p0, Lud0;->o:Lr90;

    invoke-virtual {p1, p0}, Lr90;->y(Lng0;)V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 19
    iget-object p1, p0, Lud0;->n:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 5

    const v0, 0x7f12024c

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x77

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    new-instance v0, Lcom/olive/upi/transport/model/GetMandate;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/GetMandate;-><init>()V

    iput-object v0, p0, Lud0;->q:Lcom/olive/upi/transport/model/GetMandate;

    .line 4
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x233b

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/GetMandate;->setCustomerid(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lud0;->q:Lcom/olive/upi/transport/model/GetMandate;

    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/GetMandate;->setUmn(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lud0;->q:Lcom/olive/upi/transport/model/GetMandate;

    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/GetMandate;->setTxnid(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lud0;->q:Lcom/olive/upi/transport/model/GetMandate;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x233c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/GetMandate;->setAppid(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 10
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    iget-object v3, p0, Lud0;->q:Lcom/olive/upi/transport/model/GetMandate;

    const/16 v4, 0x4b

    invoke-direct {v2, v1, v4, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x4b

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget p2, p0, Lxc0;->g:I

    if-ne p1, p2, :cond_2

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x233d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lud0;->s:Ljava/util/ArrayList;

    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Lud0;->r:I

    .line 8
    iget-object p1, p0, Lud0;->o:Lr90;

    if-nez p1, :cond_1

    .line 9
    new-instance p1, Lr90;

    invoke-direct {p1}, Lr90;-><init>()V

    iput-object p1, p0, Lud0;->o:Lr90;

    .line 10
    :cond_1
    iget-object p1, p0, Lud0;->o:Lr90;

    iget p2, p0, Lud0;->r:I

    invoke-virtual {p1, p2}, Lr90;->z(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    const v0, 0x7f0a020c

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    check-cast p2, Lrg0;

    .line 2
    invoke-virtual {p2}, Lrg0;->b()I

    move-result p1

    const/16 v0, 0x85

    if-ne p1, v0, :cond_2

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f1202ef

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-virtual {p2}, Lrg0;->b()I

    move-result v0

    invoke-virtual {p2}, Lrg0;->e()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final x(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    int-to-float p1, p1

    .line 2
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method
