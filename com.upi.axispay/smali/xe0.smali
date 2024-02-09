.class public Lxe0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Log0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe0$j;
    }
.end annotation


# instance fields
.field public l:Ljava/lang/String;

.field public m:Lcom/google/android/material/tabs/TabLayout;

.field public n:Lxe0$j;

.field public o:Lye0;

.field public p:Laf0;

.field public q:Lqd0;

.field public r:Lze0;

.field public s:Lcom/olive/upi/transport/model/TransactionData;

.field public t:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation
.end field

.field public v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0xbad

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lxe0;->l:Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe0;->u:Ljava/util/ArrayList;

    return-void
.end method

.method public static A()Lxe0;
    .locals 1

    .line 1
    new-instance v0, Lxe0;

    invoke-direct {v0}, Lxe0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lxe0;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lxe0;->m:Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method public static synthetic y(Lxe0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxe0;->I(I)V

    return-void
.end method


# virtual methods
.method public B(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lxe0;->u:Ljava/util/ArrayList;

    return-void
.end method

.method public C(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxe0;->w:I

    return-void
.end method

.method public final D(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxe0;->n:Lxe0$j;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lxe0$j;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lxe0$j;-><init>(Lxe0;Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lxe0;->n:Lxe0$j;

    .line 3
    :cond_0
    iget-object v0, p0, Lxe0;->p:Laf0;

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lxe0;->u:Ljava/util/ArrayList;

    invoke-static {v0}, Laf0;->B(Ljava/util/ArrayList;)Laf0;

    move-result-object v0

    iput-object v0, p0, Lxe0;->p:Laf0;

    .line 5
    invoke-virtual {v0, p0}, Laf0;->E(Log0;)V

    .line 6
    iget-object v0, p0, Lxe0;->p:Laf0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Laf0;->D(I)V

    .line 7
    iget-object v0, p0, Lxe0;->p:Laf0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 8
    iget-object v0, p0, Lxe0;->n:Lxe0$j;

    iget-object v1, p0, Lxe0;->p:Laf0;

    const v2, 0x7f12034a

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lxe0$j;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 9
    :cond_1
    iget-object v0, p0, Lxe0;->q:Lqd0;

    if-nez v0, :cond_2

    .line 10
    invoke-static {}, Lqd0;->B()Lqd0;

    move-result-object v0

    iput-object v0, p0, Lxe0;->q:Lqd0;

    .line 11
    invoke-virtual {v0, p0}, Lqd0;->C(Log0;)V

    .line 12
    iget-object v0, p0, Lxe0;->q:Lqd0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 13
    iget-object v0, p0, Lxe0;->n:Lxe0$j;

    iget-object v1, p0, Lxe0;->q:Lqd0;

    const v2, 0x7f1201fd

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lxe0$j;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 14
    :cond_2
    iget-object v0, p0, Lxe0;->o:Lye0;

    if-nez v0, :cond_3

    .line 15
    invoke-static {}, Lye0;->y()Lye0;

    move-result-object v0

    iput-object v0, p0, Lxe0;->o:Lye0;

    .line 16
    invoke-virtual {v0, p0}, Lye0;->z(Log0;)V

    .line 17
    iget-object v0, p0, Lxe0;->o:Lye0;

    iget-object v1, p0, Lxe0;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lye0;->A(Ljava/util/ArrayList;)V

    .line 18
    iget-object v0, p0, Lxe0;->o:Lye0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 19
    iget-object v0, p0, Lxe0;->n:Lxe0$j;

    iget-object v1, p0, Lxe0;->o:Lye0;

    const v2, 0x7f12031a

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lxe0$j;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 20
    :cond_3
    iget-object v0, p0, Lxe0;->r:Lze0;

    if-nez v0, :cond_4

    .line 21
    invoke-static {}, Lze0;->D()Lze0;

    move-result-object v0

    iput-object v0, p0, Lxe0;->r:Lze0;

    .line 22
    invoke-virtual {v0, p0}, Lze0;->F(Log0;)V

    .line 23
    iget-object v0, p0, Lxe0;->r:Lze0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 24
    iget-object v0, p0, Lxe0;->n:Lxe0$j;

    iget-object v1, p0, Lxe0;->r:Lze0;

    const v2, 0xbae

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lxe0$j;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 25
    :cond_4
    iget-object v0, p0, Lxe0;->n:Lxe0$j;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 26
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->isThroughNotificationCrossSell()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x2

    .line 27
    iput v0, p0, Lxe0;->w:I

    .line 28
    :cond_5
    iget v0, p0, Lxe0;->w:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 29
    iget v0, p0, Lxe0;->w:I

    invoke-virtual {p0, v0}, Lxe0;->I(I)V

    .line 30
    iget-object v0, p0, Lxe0;->m:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/tabs/TabLayout;->K(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 31
    iget-object v0, p0, Lxe0;->m:Lcom/google/android/material/tabs/TabLayout;

    new-instance v1, Lxe0$a;

    invoke-direct {v1, p0}, Lxe0$a;-><init>(Lxe0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->d(Lcom/google/android/material/tabs/TabLayout$d;)V

    .line 32
    new-instance v0, Lxe0$b;

    invoke-direct {v0, p0}, Lxe0$b;-><init>(Lxe0;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    return-void
.end method

.method public E(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lxe0;->o:Lye0;

    invoke-virtual {v0, p1}, Lye0;->A(Ljava/util/ArrayList;)V

    return-void
.end method

.method public F(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lxe0;->q:Lqd0;

    invoke-virtual {v0, p1}, Lqd0;->x(Ljava/util/ArrayList;)V

    return-void
.end method

.method public G(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lxe0;->r:Lze0;

    invoke-virtual {v0, p1}, Lze0;->H(Ljava/util/ArrayList;)V

    return-void
.end method

.method public H(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lxe0;->u:Ljava/util/ArrayList;

    .line 2
    iget-object v0, p0, Lxe0;->p:Laf0;

    invoke-virtual {v0, p1}, Laf0;->H(Ljava/util/ArrayList;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lxe0;->u:Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lqa0;->q0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method

.method public final I(I)V
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x47

    const/16 v3, 0x5a

    if-eqz p1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    new-instance v0, Ltg0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v5, 0xbaf

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {p1, v3, v0}, Lmg0;->o(ILjava/lang/Object;)V

    .line 2
    new-instance p1, Lcom/olive/upi/transport/model/GetMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/GetMandate;-><init>()V

    .line 3
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v3, 0xbb0

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/GetMandate;->setCustomerid(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/GetMandate;->setUmn(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/GetMandate;->setTxnid(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0xbb1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/GetMandate;->setAppid(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 9
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x4b

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lxc0;->b:Lmg0;

    new-instance v0, Ltg0;

    const v4, 0x7f120372

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {p1, v3, v0}, Lmg0;->o(ILjava/lang/Object;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x55

    invoke-direct {v0, v2, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    new-instance v0, Ltg0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v5, 0xbb2

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {p1, v3, v0}, Lmg0;->o(ILjava/lang/Object;)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x48

    invoke-direct {v0, v2, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    :cond_3
    const p1, 0x7f120348

    .line 14
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 15
    iget-object p1, p0, Lxc0;->b:Lmg0;

    new-instance v10, Ltg0;

    const v4, 0x7f12034a

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {p1, v3, v10}, Lmg0;->o(ILjava/lang/Object;)V

    .line 16
    iget-object p1, p0, Lxe0;->p:Laf0;

    invoke-virtual {p1, v0}, Laf0;->G(Z)V

    .line 17
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x1b

    invoke-direct {v0, v2, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public i(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxe0;->I(I)V

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x18

    if-eq p1, v0, :cond_3

    const v0, 0xbb3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4d

    if-eq p1, v1, :cond_1

    const/16 v1, 0x5c

    if-eq p1, v1, :cond_0

    goto/16 :goto_1

    .line 1
    :cond_0
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    .line 2
    new-instance p1, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;-><init>()V

    .line 3
    new-instance p1, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;-><init>()V

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setTxnid(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setAction(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayervpa(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getPayees()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Payee;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayeevpa(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setCred(Lcom/olive/upi/transport/model/Cred;)V

    .line 9
    iget-object p2, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getUmn()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setUmn(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x71

    invoke-direct {v0, v2, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 12
    :cond_1
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    .line 13
    new-instance p1, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;-><init>()V

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 15
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCustomerid(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setTxnid(Ljava/lang/String;)V

    .line 17
    iget-object v2, p0, Lxe0;->t:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lxe0;->t:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 18
    iget-object v2, p0, Lxe0;->t:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_2
    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    .line 20
    :goto_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 21
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAction(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 23
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCreds(Lcom/olive/upi/transport/model/Cred;)V

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    .line 25
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x81

    invoke-direct {v0, v2, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 26
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x47

    invoke-direct {v1, v2, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lxc0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lxe0;->v:Ljava/util/ArrayList;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0099

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    iput-object p2, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p2

    iput-object p2, p0, Lxe0;->t:Lcom/olive/upi/transport/model/MandateTransactionData;

    const p2, 0x7f0a0558

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/viewpager/widget/ViewPager;

    const p3, 0x7f0a0454

    .line 5
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/google/android/material/tabs/TabLayout;

    iput-object p3, p0, Lxe0;->m:Lcom/google/android/material/tabs/TabLayout;

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-static {p3}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p3

    invoke-virtual {p3, p0}, Lua0;->u(Lua0$e;)V

    .line 7
    invoke-virtual {p0, p2}, Lxe0;->D(Landroidx/viewpager/widget/ViewPager;)V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 11

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    const/16 v1, 0x1b

    if-nez v0, :cond_b

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0xbb4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    const/16 v3, 0xa

    const/16 v4, 0x18

    if-eq v2, v3, :cond_2

    if-eq v2, v4, :cond_2

    if-eq v2, v1, :cond_1

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_3

    .line 5
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 6
    iget-object p1, p0, Lxe0;->p:Laf0;

    invoke-virtual {p1}, Laf0;->F()V

    goto/16 :goto_3

    .line 7
    :cond_2
    iget-object v1, p0, Lxc0;->b:Lmg0;

    const/16 v2, 0x12d

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lmg0;->o(ILjava/lang/Object;)V

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v1

    iput-object v1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    .line 9
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 10
    iget-object v1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    .line 11
    iget-object v2, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    :cond_3
    const v1, 0xbb5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f12031e

    const v3, 0x7f12005c

    if-eqz v1, :cond_5

    .line 13
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const p2, 0x7f12049a

    if-ne p1, v4, :cond_4

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lxe0$g;

    invoke-direct {v2, p0}, Lxe0$g;-><init>(Lxe0;)V

    invoke-static {p1, v0, p2, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 15
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_5
    const v1, 0xbb6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f120499

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lxe0$h;

    invoke-direct {v2, p0}, Lxe0$h;-><init>(Lxe0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    :cond_6
    const v1, 0xbb7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 19
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v4, :cond_7

    .line 20
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v5

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lxe0$i;

    invoke-direct {v9, p0}, Lxe0$i;-><init>(Lxe0;)V

    const/4 v10, 0x1

    invoke-static/range {v5 .. v10}, Leg0;->q(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    goto :goto_2

    .line 21
    :cond_7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_2
    return-void

    .line 22
    :cond_8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 23
    iget-object v1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 24
    iget-object v1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 26
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 27
    iget-object v2, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 28
    :cond_9
    iget-object v1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 31
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v1, 0xbb8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 32
    iget-object p1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 33
    iget-object p1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 34
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 35
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_a

    .line 36
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 37
    :cond_a
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object p2, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-interface {p1, v4, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_3

    .line 38
    :cond_b
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v1, :cond_c

    .line 39
    iget-object p1, p0, Lxe0;->p:Laf0;

    invoke-virtual {p1}, Laf0;->F()V

    .line 40
    :cond_c
    invoke-static {}, Leg0;->B()V

    :goto_3
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    iput-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    iput-object v0, p0, Lxe0;->t:Lcom/olive/upi/transport/model/MandateTransactionData;

    const v0, 0x7f12030e

    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x47

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 4
    invoke-super {p0}, Lxc0;->onResume()V

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const v1, 0xbb9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x1b

    const/4 v4, 0x1

    const/16 v5, 0x12d

    const/16 v6, 0x47

    const/4 v7, 0x0

    sparse-switch v0, :sswitch_data_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_7

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :sswitch_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqa0;->S(Ljava/util/ArrayList;)V

    .line 7
    invoke-virtual {p0, p1}, Lxe0;->E(Ljava/util/ArrayList;)V

    goto/16 :goto_1

    .line 8
    :sswitch_1
    invoke-static {}, Leg0;->B()V

    .line 9
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const v0, 0xbba

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    const v0, 0x7f080098

    if-eqz p1, :cond_0

    .line 10
    invoke-static {}, Leg0;->B()V

    const p1, 0x7f12047e

    .line 11
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lxe0;->z(ILjava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const p2, 0xbbb

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 13
    invoke-static {}, Leg0;->B()V

    const p1, 0x7f12047d

    .line 14
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lxe0;->z(ILjava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-static {}, Leg0;->B()V

    const p1, 0x7f0801ef

    const p2, 0xbbc

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-virtual {p0, p1, p2}, Lxe0;->z(ILjava/lang/String;)V

    .line 17
    :goto_0
    :sswitch_2
    invoke-static {}, Leg0;->B()V

    .line 18
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x48

    invoke-direct {p2, v6, v0, v7}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 19
    :sswitch_3
    invoke-static {}, Leg0;->B()V

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 21
    invoke-virtual {p0, p1}, Lxe0;->G(Ljava/util/ArrayList;)V

    goto/16 :goto_1

    .line 22
    :sswitch_4
    invoke-static {}, Leg0;->B()V

    .line 23
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 24
    invoke-virtual {p0, p1}, Lxe0;->F(Ljava/util/ArrayList;)V

    goto/16 :goto_1

    .line 25
    :sswitch_5
    invoke-static {}, Leg0;->B()V

    .line 26
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v5, v7}, Lmg0;->o(ILjava/lang/Object;)V

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120137

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lxe0$d;

    invoke-direct {v0, p0}, Lxe0$d;-><init>(Lxe0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 28
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x35

    invoke-direct {p2, v6, v0, v7, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {p1, v4, p2}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 29
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v6, v3, v7}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 30
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_7

    .line 31
    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V

    goto/16 :goto_1

    .line 32
    :sswitch_6
    invoke-static {}, Leg0;->B()V

    .line 33
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v5, v7}, Lmg0;->o(ILjava/lang/Object;)V

    .line 34
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f12030d

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lxe0$c;

    invoke-direct {v1, p0}, Lxe0$c;-><init>(Lxe0;)V

    invoke-static {p1, v0, v1}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 35
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 36
    invoke-virtual {p0, p1}, Lxe0;->H(Ljava/util/ArrayList;)V

    goto/16 :goto_1

    .line 37
    :sswitch_7
    invoke-static {}, Leg0;->B()V

    .line 38
    iget-object p1, p0, Lxe0;->p:Laf0;

    invoke-virtual {p1, v2}, Laf0;->G(Z)V

    .line 39
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 40
    invoke-virtual {p0, p1}, Lxe0;->H(Ljava/util/ArrayList;)V

    goto/16 :goto_1

    .line 41
    :sswitch_8
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v8, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v8, v6, v3, v7}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v8}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 42
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    iput-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    .line 43
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object v0

    .line 44
    iget-object v3, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 45
    iget-object v3, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 46
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 47
    iget-object v6, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v6, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 49
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 50
    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 51
    iget-object v3, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const v6, 0xbbd

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 53
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 54
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 55
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object v0

    .line 56
    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v6, 0xbbe

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ln70;->j(Ljava/lang/String;)I

    move-result v3

    .line 57
    invoke-virtual {v0, v6, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 58
    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const v0, 0xbbf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ln70;->A(Ljava/lang/String;Z)V

    .line 59
    invoke-static {}, Leg0;->B()V

    .line 60
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f120348

    .line 61
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0xbc0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljg0;->l(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v0

    const v2, 0xbc1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 64
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xbc2

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const v3, 0xbc3

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, p2, v4}, Lah0;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Z)V

    .line 66
    new-instance v2, Lcom/google/android/gms/analytics/ecommerce/Product;

    invoke-direct {v2}, Lcom/google/android/gms/analytics/ecommerce/Product;-><init>()V

    .line 67
    invoke-virtual {v2, v3}, Lcom/google/android/gms/analytics/ecommerce/Product;->setName(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 68
    iget-object v4, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/analytics/ecommerce/Product;->setPrice(D)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 69
    iget-object v4, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    if-eqz v0, :cond_4

    .line 70
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/analytics/ecommerce/Product;->setBrand(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 71
    :cond_4
    iget-object v0, p0, Lxc0;->b:Lmg0;

    invoke-interface {v0, v5, v7}, Lmg0;->o(ILjava/lang/Object;)V

    .line 72
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v3, v2, p2}, Lah0;->e(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/analytics/ecommerce/Product;Ljava/util/Map;)V

    .line 73
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 p2, 0x18

    if-ne p1, p2, :cond_5

    .line 74
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_5

    .line 75
    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V

    .line 76
    :cond_5
    iget-object p1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 77
    iget-object p1, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    .line 78
    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 79
    :cond_6
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object v0, p0, Lxe0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 80
    :sswitch_9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1}, Lcom/upi/axispay/activity/MainActivity;->q0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 81
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const/4 p2, 0x3

    const v0, 0xbc4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ln70;->v(Ljava/lang/String;I)V

    :cond_7
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x64 -> :sswitch_9
        0xa -> :sswitch_8
        0x18 -> :sswitch_8
        0x1b -> :sswitch_7
        0x1d -> :sswitch_6
        0x34 -> :sswitch_5
        0x48 -> :sswitch_4
        0x4b -> :sswitch_3
        0x4d -> :sswitch_1
        0x51 -> :sswitch_2
        0x55 -> :sswitch_0
    .end sparse-switch
.end method

.method public z(ILjava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    const v2, 0x7f130246

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/Window;->requestFeature(I)Z

    const v1, 0x7f0d0054

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-virtual {v1, v3, v4}, Landroid/view/Window;->setLayout(II)V

    const v1, 0x7f0a00ec

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v3, 0x7f0a016f

    .line 6
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0a0172

    .line 7
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 8
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f0a0171

    .line 9
    invoke-virtual {v0, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 10
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    const p1, 0x7f12031d

    .line 11
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 13
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 14
    new-instance p1, Lxe0$e;

    invoke-direct {p1, p0, v0}, Lxe0$e;-><init>(Lxe0;Landroid/app/Dialog;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    new-instance p1, Lxe0$f;

    invoke-direct {p1, p0, v0}, Lxe0$f;-><init>(Lxe0;Landroid/app/Dialog;)V

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
