.class public Lyc0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lgd0;
.implements Lua0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyc0$c;
    }
.end annotation


# static fields
.field public static A:Lma0;


# instance fields
.field public l:[Ljava/lang/Integer;

.field public m:Lcom/olive/upi/transport/model/BeneVpa;

.field public n:Lcom/olive/upi/transport/model/Collectbeneblock;

.field public o:I

.field public p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lyc0$c;

.field public s:Lcom/olive/upi/transport/model/TransactionData;

.field public t:Ltc0;

.field public u:Ltc0;

.field public v:Ldd0;

.field public w:I

.field public x:Ltc0;

.field public y:Lcom/google/android/material/tabs/TabLayout;

.field public z:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    const v1, 0x7f0802a1

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f0801cf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const v1, 0x7f080081

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const v1, 0x7f0800e3

    .line 3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    iput-object v0, p0, Lyc0;->l:[Ljava/lang/Integer;

    .line 4
    iput v2, p0, Lyc0;->o:I

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyc0;->p:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyc0;->q:Ljava/util/ArrayList;

    .line 7
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    return-void
.end method

.method public static synthetic A(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method

.method public static B(Lma0;)Lyc0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lma0;->b()I

    .line 2
    invoke-virtual {p0}, Lma0;->a()I

    .line 3
    sput-object p0, Lyc0;->A:Lma0;

    .line 4
    new-instance p0, Lyc0;

    invoke-direct {p0}, Lyc0;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Lyc0;ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    return-void
.end method

.method public static synthetic y(Lyc0;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public final C(ILjava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lyc0;->u:Ltc0;

    if-eqz p1, :cond_4

    .line 2
    invoke-virtual {p0, p2}, Lyc0;->z(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Ltc0;->H(Ljava/util/ArrayList;I)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lyc0;->v:Ldd0;

    if-eqz p1, :cond_4

    .line 4
    invoke-virtual {p1}, Ldd0;->E()V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p1, p0, Lyc0;->x:Ltc0;

    if-eqz p1, :cond_4

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    sget-object v0, Lqa0$e;->d:Lqa0$e;

    invoke-virtual {p2, v0}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Ltc0;->H(Ljava/util/ArrayList;I)V

    goto :goto_0

    .line 7
    :cond_3
    iget-object p1, p0, Lyc0;->t:Ltc0;

    if-eqz p1, :cond_4

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    sget-object v1, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {p2, v1}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Ltc0;->H(Ljava/util/ArrayList;I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public D(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lyc0;->p:Ljava/util/ArrayList;

    .line 2
    iget-object p1, p0, Lyc0;->z:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0, p1}, Lyc0;->E(Landroidx/viewpager/widget/ViewPager;)V

    .line 3
    iget-object p1, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    iget-object v1, p0, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 4
    iget-object p1, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    iget-object v1, p0, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 5
    iget-object p1, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    iget-object v1, p0, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 6
    iget-object p1, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    iget-object v1, p0, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    return-void
.end method

.method public final E(Landroidx/viewpager/widget/ViewPager;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lyc0;->r:Lyc0$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lyc0$c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lyc0$c;-><init>(Lyc0;Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lyc0;->r:Lyc0$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lyc0;->t:Ltc0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ltc0;

    invoke-direct {v0}, Ltc0;-><init>()V

    iput-object v0, p0, Lyc0;->t:Ltc0;

    .line 5
    sget-object v3, Lyc0;->A:Lma0;

    invoke-virtual {v0, v3}, Ltc0;->E(Lma0;)V

    .line 6
    iget-object v0, p0, Lyc0;->t:Ltc0;

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    sget-object v4, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {v3, v4}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ltc0;->C(Ljava/util/ArrayList;I)V

    .line 7
    iget-object v0, p0, Lyc0;->t:Ltc0;

    invoke-virtual {v0, v1}, Ltc0;->F(Z)V

    .line 8
    iget-object v0, p0, Lyc0;->t:Ltc0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 9
    iget-object v0, p0, Lyc0;->r:Lyc0$c;

    iget-object v3, p0, Lyc0;->t:Ltc0;

    const v4, 0x31b9

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lyc0$c;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    sget-object v4, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {v3, v4}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ltc0;->C(Ljava/util/ArrayList;I)V

    .line 11
    :goto_0
    iget-object v0, p0, Lyc0;->x:Ltc0;

    const/4 v3, 0x2

    if-nez v0, :cond_2

    .line 12
    new-instance v0, Ltc0;

    invoke-direct {v0}, Ltc0;-><init>()V

    iput-object v0, p0, Lyc0;->x:Ltc0;

    .line 13
    sget-object v4, Lyc0;->A:Lma0;

    invoke-virtual {v0, v4}, Ltc0;->E(Lma0;)V

    .line 14
    iget-object v0, p0, Lyc0;->x:Ltc0;

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v4

    sget-object v5, Lqa0$e;->d:Lqa0$e;

    invoke-virtual {v4, v5}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ltc0;->C(Ljava/util/ArrayList;I)V

    .line 15
    iget-object v0, p0, Lyc0;->x:Ltc0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 16
    iget-object v0, p0, Lyc0;->r:Lyc0$c;

    iget-object v3, p0, Lyc0;->x:Ltc0;

    const v4, 0x31ba

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lyc0$c;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    goto :goto_1

    .line 17
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v4

    sget-object v5, Lqa0$e;->d:Lqa0$e;

    invoke-virtual {v4, v5}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ltc0;->C(Ljava/util/ArrayList;I)V

    .line 18
    :goto_1
    iget-object v0, p0, Lyc0;->v:Ldd0;

    if-nez v0, :cond_3

    .line 19
    new-instance v0, Ldd0;

    invoke-direct {v0}, Ldd0;-><init>()V

    iput-object v0, p0, Lyc0;->v:Ldd0;

    .line 20
    sget-object v3, Lyc0;->A:Lma0;

    invoke-virtual {v0, v3}, Ldd0;->C(Lma0;)V

    .line 21
    iget-object v0, p0, Lyc0;->v:Ldd0;

    iget-object v3, p0, Lyc0;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ldd0;->A(Ljava/util/ArrayList;)V

    .line 22
    iget-object v0, p0, Lyc0;->v:Ldd0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 23
    iget-object v0, p0, Lyc0;->r:Lyc0$c;

    iget-object v3, p0, Lyc0;->v:Ldd0;

    const v4, 0x7f1200b5

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lyc0$c;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    goto :goto_2

    .line 24
    :cond_3
    iget-object v3, p0, Lyc0;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ldd0;->A(Ljava/util/ArrayList;)V

    .line 25
    :goto_2
    iget-object v0, p0, Lyc0;->u:Ltc0;

    if-nez v0, :cond_4

    .line 26
    new-instance v0, Ltc0;

    invoke-direct {v0}, Ltc0;-><init>()V

    iput-object v0, p0, Lyc0;->u:Ltc0;

    .line 27
    sget-object v3, Lyc0;->A:Lma0;

    invoke-virtual {v0, v3}, Ltc0;->E(Lma0;)V

    .line 28
    iget-object v0, p0, Lyc0;->u:Ltc0;

    iget-object v3, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, v3}, Lyc0;->z(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ltc0;->C(Ljava/util/ArrayList;I)V

    .line 29
    iget-object v0, p0, Lyc0;->u:Ltc0;

    invoke-virtual {v0, v2}, Ltc0;->F(Z)V

    .line 30
    iget-object v0, p0, Lyc0;->u:Ltc0;

    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 31
    iget-object v0, p0, Lyc0;->r:Lyc0$c;

    iget-object v1, p0, Lyc0;->u:Ltc0;

    const v3, 0x7f1201c5

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lyc0$c;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    goto :goto_3

    .line 32
    :cond_4
    iget-object v3, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, v3}, Lyc0;->z(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ltc0;->C(Ljava/util/ArrayList;I)V

    .line 33
    :goto_3
    iget-object v0, p0, Lyc0;->t:Ltc0;

    invoke-virtual {v0, p0}, Ltc0;->D(Lyc0;)V

    .line 34
    iget-object v0, p0, Lyc0;->x:Ltc0;

    invoke-virtual {v0, p0}, Ltc0;->D(Lyc0;)V

    .line 35
    iget-object v0, p0, Lyc0;->v:Ldd0;

    invoke-virtual {v0, p0}, Ldd0;->B(Lyc0;)V

    .line 36
    iget-object v0, p0, Lyc0;->u:Ltc0;

    invoke-virtual {v0, p0}, Ltc0;->D(Lyc0;)V

    .line 37
    iget-object v0, p0, Lyc0;->r:Lyc0$c;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 38
    iget v0, p0, Lyc0;->o:I

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 39
    iget-object v0, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1, v2}, Lcom/google/android/material/tabs/TabLayout;->K(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 40
    iget-object v0, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    iget v1, p0, Lyc0;->o:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout$g;->l()V

    .line 41
    new-instance v0, Lyc0$a;

    invoke-direct {v0, p0}, Lyc0$a;-><init>(Lyc0;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 42
    iget-object p1, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    new-instance v0, Lyc0$b;

    invoke-direct {v0, p0}, Lyc0$b;-><init>(Lyc0;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->d(Lcom/google/android/material/tabs/TabLayout$d;)V

    return-void
.end method

.method public F()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f1204ba

    .line 2
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f12046c

    .line 3
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12031e

    .line 4
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lhb0;->b:Lhb0;

    .line 5
    invoke-static {v0, v1, v2, v3, v4}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public g(ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyc0;->w:I

    const/4 p3, 0x1

    if-eq p1, p3, :cond_0

    .line 2
    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    iput-object p2, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    goto :goto_0

    .line 3
    :cond_0
    check-cast p2, Lcom/olive/upi/transport/model/Collectbeneblock;

    iput-object p2, p0, Lyc0;->n:Lcom/olive/upi/transport/model/Collectbeneblock;

    :goto_0
    return-void
.end method

.method public h()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x11

    const/16 v3, 0x12

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 5
    :cond_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x35

    const/4 v6, 0x1

    invoke-direct {v1, v2, v5, v4, v6}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v0, v3, v1}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    :cond_1
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0069

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    invoke-virtual {p2, p0}, Lua0;->u(Lua0$e;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    iput-object p2, p0, Lyc0;->s:Lcom/olive/upi/transport/model/TransactionData;

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    const p2, 0x7f0a0558

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/viewpager/widget/ViewPager;

    iput-object p2, p0, Lyc0;->z:Landroidx/viewpager/widget/ViewPager;

    const p2, 0x7f0a0454

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/tabs/TabLayout;

    iput-object p2, p0, Lyc0;->y:Lcom/google/android/material/tabs/TabLayout;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 p2, 0x11

    if-eq p1, p2, :cond_1

    const/16 p2, 0x12

    if-eq p1, p2, :cond_0

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 5
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 6
    iget p1, p0, Lyc0;->o:I

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->O()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    goto :goto_2

    .line 7
    :cond_1
    iget-object p1, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const p2, 0x31bb

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    if-nez p1, :cond_2

    iget-object p1, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    iget-object p1, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    const p2, 0x31bc

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 10
    :goto_0
    iget-object p1, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    iget-object v0, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    goto :goto_1

    .line 13
    :cond_4
    invoke-static {}, Leg0;->B()V

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lqa0;->z0(Ljava/util/ArrayList;)V

    .line 15
    iget p1, p0, Lyc0;->o:I

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    .line 16
    :cond_5
    :goto_2
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 7

    const v0, 0x7f120248

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

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
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->O()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lyc0;->D(Ljava/util/ArrayList;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->F()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 8
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v4, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x12

    invoke-direct {v4, v1, v5, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v3, v4}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 9
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 11
    :cond_2
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v4, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x35

    const/4 v6, 0x1

    invoke-direct {v4, v1, v5, v2, v6}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v0, v3, v4}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 12
    :cond_3
    iget-object v0, p0, Lyc0;->z:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lno;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 13
    iget-object v0, p0, Lyc0;->z:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lno;

    move-result-object v0

    invoke-virtual {v0}, Lno;->j()V

    :cond_4
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-nez v0, :cond_b

    if-eqz p2, :cond_b

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p2

    const/16 v0, 0x11

    if-eq p2, v0, :cond_7

    const/16 v1, 0x12

    if-eq p2, v1, :cond_6

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x35

    if-eq p2, v1, :cond_3

    const/16 v1, 0x34

    if-eq p2, v1, :cond_2

    if-eq p2, v4, :cond_1

    .line 4
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_b

    .line 5
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 6
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lyc0;->q:Ljava/util/ArrayList;

    .line 8
    iget p1, p0, Lyc0;->o:I

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    goto/16 :goto_2

    .line 9
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lyc0;->q:Ljava/util/ArrayList;

    .line 11
    iget-object p2, p0, Lyc0;->n:Lcom/olive/upi/transport/model/Collectbeneblock;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v0, v4, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v3, p2}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 14
    invoke-virtual {p0}, Lyc0;->F()V

    goto/16 :goto_2

    .line 15
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f1200a7

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lyc0;->p:Ljava/util/ArrayList;

    iget-object p2, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lqa0;->z0(Ljava/util/ArrayList;)V

    .line 19
    iget p1, p0, Lyc0;->w:I

    const/4 p2, 0x2

    if-ne p1, p2, :cond_5

    .line 20
    iget-object p1, p0, Lyc0;->q:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    .line 21
    iget-object p1, p0, Lyc0;->q:Ljava/util/ArrayList;

    iget-object p2, p0, Lyc0;->n:Lcom/olive/upi/transport/model/Collectbeneblock;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 22
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lyc0;->q:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lqa0;->X(Ljava/util/ArrayList;)V

    .line 23
    iget p1, p0, Lyc0;->o:I

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    goto/16 :goto_2

    .line 24
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 25
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v0, v4, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v3, p2}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_2

    .line 26
    :cond_5
    iget p1, p0, Lyc0;->o:I

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    goto/16 :goto_2

    .line 27
    :cond_6
    invoke-static {}, Leg0;->B()V

    .line 28
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->O()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lyc0;->p:Ljava/util/ArrayList;

    .line 29
    iget p1, p0, Lyc0;->o:I

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->O()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    goto :goto_2

    .line 30
    :cond_7
    invoke-static {}, Leg0;->B()V

    .line 31
    iget-object p1, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/olive/upi/transport/model/BeneVpa;->FAVORITE:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 32
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120408

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 33
    :cond_8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120409

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 34
    :goto_0
    iget-object p1, p0, Lyc0;->p:Ljava/util/ArrayList;

    if-eqz p1, :cond_a

    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 36
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 37
    iget-object v0, p0, Lyc0;->m:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    goto :goto_1

    .line 38
    :cond_a
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lqa0;->z0(Ljava/util/ArrayList;)V

    .line 39
    iget p1, p0, Lyc0;->o:I

    iget-object p2, p0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lyc0;->C(ILjava/util/ArrayList;)V

    :cond_b
    :goto_2
    return-void
.end method

.method public final z(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/BeneVpa;

    .line 3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object v2

    const v3, 0x31bd

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
