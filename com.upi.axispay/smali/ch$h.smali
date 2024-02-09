.class public final Lch$h;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch$h$c;,
        Lch$h$g;,
        Lch$h$e;,
        Lch$h$d;,
        Lch$h$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Landroidx/recyclerview/widget/RecyclerView$d0;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lch$h$f;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Landroid/view/LayoutInflater;

.field public final f:Landroid/graphics/drawable/Drawable;

.field public final g:Landroid/graphics/drawable/Drawable;

.field public final h:Landroid/graphics/drawable/Drawable;

.field public final i:Landroid/graphics/drawable/Drawable;

.field public j:Lch$h$f;

.field public final k:I

.field public final l:Landroid/view/animation/Interpolator;

.field public final synthetic m:Lch;


# direct methods
.method public constructor <init>(Lch;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lch$h;->m:Lch;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lch$h;->d:Ljava/util/ArrayList;

    .line 3
    iget-object v0, p1, Lch;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lch$h;->e:Landroid/view/LayoutInflater;

    .line 4
    iget-object v0, p1, Lch;->l:Landroid/content/Context;

    invoke-static {v0}, Ldh;->g(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lch$h;->f:Landroid/graphics/drawable/Drawable;

    .line 5
    iget-object v0, p1, Lch;->l:Landroid/content/Context;

    invoke-static {v0}, Ldh;->q(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lch$h;->g:Landroid/graphics/drawable/Drawable;

    .line 6
    iget-object v0, p1, Lch;->l:Landroid/content/Context;

    invoke-static {v0}, Ldh;->m(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lch$h;->h:Landroid/graphics/drawable/Drawable;

    .line 7
    iget-object v0, p1, Lch;->l:Landroid/content/Context;

    invoke-static {v0}, Ldh;->n(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lch$h;->i:Landroid/graphics/drawable/Drawable;

    .line 8
    iget-object p1, p1, Lch;->l:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 9
    sget v0, Log;->mr_cast_volume_slider_layout_animation_duration_ms:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lch$h;->k:I

    .line 10
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lch$h;->l:Landroid/view/animation/Interpolator;

    .line 11
    invoke-virtual {p0}, Lch$h;->D()V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public B(Lyh$i;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 3
    invoke-virtual {p1}, Lyh$i;->x()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_2

    .line 4
    invoke-virtual {p1}, Lyh$i;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyh$i;

    .line 5
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eq v3, p2, :cond_0

    if-eqz p2, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    add-int/2addr v1, v3

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    move v4, v2

    :cond_3
    add-int/2addr v1, v4

    .line 6
    :cond_4
    invoke-virtual {p0}, Lch$h;->A()Z

    move-result p1

    const/4 p2, 0x2

    const/4 v0, 0x0

    if-lt v1, p2, :cond_5

    goto :goto_2

    :cond_5
    move v2, v0

    :goto_2
    if-eq p1, v2, :cond_7

    .line 7
    iget-object p1, p0, Lch$h;->m:Lch;

    iget-object p1, p1, Lch;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object p1

    .line 9
    instance-of p2, p1, Lch$h$d;

    if-eqz p2, :cond_7

    .line 10
    check-cast p1, Lch$h$d;

    .line 11
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    if-eqz v2, :cond_6

    .line 12
    invoke-virtual {p1}, Lch$h$d;->T()I

    move-result v0

    .line 13
    :cond_6
    invoke-virtual {p0, p2, v0}, Lch$h;->w(Landroid/view/View;I)V

    :cond_7
    return-void
.end method

.method public C()V
    .locals 3

    .line 1
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v1, v0, Lch;->k:Ljava/util/List;

    iget-object v2, v0, Lch;->i:Ljava/util/List;

    .line 3
    invoke-virtual {v0}, Lch;->g()Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-static {v2, v0}, Lah;->g(Ljava/util/List;Ljava/util/List;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public D()V
    .locals 10

    .line 1
    iget-object v0, p0, Lch$h;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    new-instance v0, Lch$h$f;

    iget-object v1, p0, Lch$h;->m:Lch;

    iget-object v2, v1, Lch;->g:Lyh$i;

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v3}, Lch$h$f;-><init>(Lch$h;Ljava/lang/Object;I)V

    iput-object v0, p0, Lch$h;->j:Lch$h$f;

    .line 3
    iget-object v0, v1, Lch;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyh$i;

    .line 5
    iget-object v4, p0, Lch$h;->d:Ljava/util/ArrayList;

    new-instance v5, Lch$h$f;

    invoke-direct {v5, p0, v2, v1}, Lch$h$f;-><init>(Lch$h;Ljava/lang/Object;I)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lch$h;->d:Ljava/util/ArrayList;

    new-instance v2, Lch$h$f;

    iget-object v4, p0, Lch$h;->m:Lch;

    iget-object v4, v4, Lch;->g:Lyh$i;

    invoke-direct {v2, p0, v4, v1}, Lch$h$f;-><init>(Lch$h;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_1
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez v0, :cond_6

    .line 8
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v6, v5

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lyh$i;

    .line 9
    iget-object v8, p0, Lch$h;->m:Lch;

    iget-object v8, v8, Lch;->h:Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    if-nez v6, :cond_5

    .line 10
    iget-object v6, p0, Lch$h;->m:Lch;

    iget-object v6, v6, Lch;->g:Lyh$i;

    .line 11
    invoke-virtual {v6}, Lyh$i;->g()Luh$b;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 12
    invoke-virtual {v6}, Luh$b;->j()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_3
    move-object v6, v4

    .line 13
    :goto_2
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 14
    iget-object v6, p0, Lch$h;->m:Lch;

    iget-object v6, v6, Lch;->l:Landroid/content/Context;

    sget v8, Lrg;->mr_dialog_groupable_header:I

    invoke-virtual {v6, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 15
    :cond_4
    iget-object v8, p0, Lch$h;->d:Ljava/util/ArrayList;

    new-instance v9, Lch$h$f;

    invoke-direct {v9, p0, v6, v2}, Lch$h$f;-><init>(Lch$h;Ljava/lang/Object;I)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v3

    .line 16
    :cond_5
    iget-object v8, p0, Lch$h;->d:Ljava/util/ArrayList;

    new-instance v9, Lch$h$f;

    invoke-direct {v9, p0, v7, v1}, Lch$h$f;-><init>(Lch$h;Ljava/lang/Object;I)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 17
    :cond_6
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    .line 18
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyh$i;

    .line 19
    iget-object v6, p0, Lch$h;->m:Lch;

    iget-object v6, v6, Lch;->g:Lyh$i;

    if-eq v6, v1, :cond_7

    if-nez v5, :cond_a

    .line 20
    invoke-virtual {v6}, Lyh$i;->g()Luh$b;

    move-result-object v5

    if-eqz v5, :cond_8

    .line 21
    invoke-virtual {v5}, Luh$b;->k()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_8
    move-object v5, v4

    .line 22
    :goto_4
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 23
    iget-object v5, p0, Lch$h;->m:Lch;

    iget-object v5, v5, Lch;->l:Landroid/content/Context;

    sget v6, Lrg;->mr_dialog_transferable_header:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 24
    :cond_9
    iget-object v6, p0, Lch$h;->d:Ljava/util/ArrayList;

    new-instance v7, Lch$h$f;

    invoke-direct {v7, p0, v5, v2}, Lch$h$f;-><init>(Lch$h;Ljava/lang/Object;I)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v3

    .line 25
    :cond_a
    iget-object v6, p0, Lch$h;->d:Ljava/util/ArrayList;

    new-instance v7, Lch$h$f;

    const/4 v8, 0x4

    invoke-direct {v7, p0, v1, v8}, Lch$h$f;-><init>(Lch$h;Ljava/lang/Object;I)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 26
    :cond_b
    invoke-virtual {p0}, Lch$h;->C()V

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lch$h;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public g(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lch$h;->z(I)Lch$h$f;

    move-result-object p1

    invoke-virtual {p1}, Lch$h$f;->b()I

    move-result p1

    return p1
.end method

.method public l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lch$h;->g(I)I

    move-result v0

    .line 2
    invoke-virtual {p0, p2}, Lch$h;->z(I)Lch$h$f;

    move-result-object p2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const p1, 0x6a9

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const p2, 0x6aa

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 4
    :cond_0
    check-cast p1, Lch$h$c;

    invoke-virtual {p1, p2}, Lch$h$c;->O(Lch$h$f;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p2}, Lch$h$f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh$i;

    .line 6
    iget-object v1, p0, Lch$h;->m:Lch;

    iget-object v1, v1, Lch;->t:Ljava/util/Map;

    .line 7
    invoke-virtual {v0}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Lch$f;

    .line 8
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    check-cast p1, Lch$h$g;

    invoke-virtual {p1, p2}, Lch$h$g;->S(Lch$h$f;)V

    goto :goto_0

    .line 10
    :cond_2
    check-cast p1, Lch$h$e;

    invoke-virtual {p1, p2}, Lch$h$e;->O(Lch$h$f;)V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p2}, Lch$h$f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh$i;

    .line 12
    iget-object v1, p0, Lch$h;->m:Lch;

    iget-object v1, v1, Lch;->t:Ljava/util/Map;

    .line 13
    invoke-virtual {v0}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v0

    move-object v2, p1

    check-cast v2, Lch$f;

    .line 14
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    check-cast p1, Lch$h$d;

    invoke-virtual {p1, p2}, Lch$h$d;->S(Lch$h$f;)V

    :goto_0
    return-void
.end method

.method public n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    const p1, 0x6ab

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const p2, 0x6ac

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 1
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    iget-object p2, p0, Lch$h;->e:Landroid/view/LayoutInflater;

    sget v0, Lqg;->mr_cast_group_item:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lch$h$c;

    invoke-direct {p2, p0, p1}, Lch$h$c;-><init>(Lch$h;Landroid/view/View;)V

    return-object p2

    .line 4
    :cond_1
    iget-object p2, p0, Lch$h;->e:Landroid/view/LayoutInflater;

    sget v0, Lqg;->mr_cast_route_item:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 5
    new-instance p2, Lch$h$g;

    invoke-direct {p2, p0, p1}, Lch$h$g;-><init>(Lch$h;Landroid/view/View;)V

    return-object p2

    .line 6
    :cond_2
    iget-object p2, p0, Lch$h;->e:Landroid/view/LayoutInflater;

    sget v0, Lqg;->mr_cast_header_item:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 7
    new-instance p2, Lch$h$e;

    invoke-direct {p2, p0, p1}, Lch$h$e;-><init>(Lch$h;Landroid/view/View;)V

    return-object p2

    .line 8
    :cond_3
    iget-object p2, p0, Lch$h;->e:Landroid/view/LayoutInflater;

    sget v0, Lqg;->mr_cast_group_volume_item:I

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 9
    new-instance p2, Lch$h$d;

    invoke-direct {p2, p0, p1}, Lch$h$d;-><init>(Lch$h;Landroid/view/View;)V

    return-object p2
.end method

.method public s(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->s(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    .line 2
    iget-object v0, p0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->t:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public w(Landroid/view/View;I)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 2
    new-instance v1, Lch$h$a;

    invoke-direct {v1, p0, p2, v0, p1}, Lch$h$a;-><init>(Lch$h;IILandroid/view/View;)V

    .line 3
    new-instance p2, Lch$h$b;

    invoke-direct {p2, p0}, Lch$h$b;-><init>(Lch$h;)V

    invoke-virtual {v1, p2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 4
    iget p2, p0, Lch$h;->k:I

    int-to-long v2, p2

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 5
    iget-object p2, p0, Lch$h;->l:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, p2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 6
    invoke-virtual {p1, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final x(Lyh$i;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lyh$i;->f()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 2
    invoke-virtual {p1}, Lyh$i;->x()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lch$h;->i:Landroid/graphics/drawable/Drawable;

    return-object p1

    .line 4
    :cond_0
    iget-object p1, p0, Lch$h;->f:Landroid/graphics/drawable/Drawable;

    return-object p1

    .line 5
    :cond_1
    iget-object p1, p0, Lch$h;->h:Landroid/graphics/drawable/Drawable;

    return-object p1

    .line 6
    :cond_2
    iget-object p1, p0, Lch$h;->g:Landroid/graphics/drawable/Drawable;

    return-object p1
.end method

.method public y(Lyh$i;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lyh$i;->i()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    :try_start_0
    iget-object v2, p0, Lch$h;->m:Lch;

    iget-object v2, v2, Lch;->l:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    const/4 v3, 0x0

    .line 3
    invoke-static {v2, v3}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    return-object v1

    :catch_0
    move-exception v2

    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x6ad

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v0, 0x6ae

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lch$h;->x(Lyh$i;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public z(I)Lch$h$f;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lch$h;->j:Lch$h$f;

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lch$h;->d:Ljava/util/ArrayList;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lch$h$f;

    return-object p1
.end method
