.class public Lqd;
.super Lpe;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd$m;,
        Lqd$k;,
        Lqd$l;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lpe;-><init>(Landroid/view/ViewGroup;)V

    return-void
.end method


# virtual methods
.method public f(Ljava/util/List;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpe$e;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v6, v1

    move-object v7, v6

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpe$e;

    .line 2
    invoke-virtual {v1}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v3

    iget-object v3, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-static {v3}, Lpe$e$c;->c(Landroid/view/View;)Lpe$e$c;

    move-result-object v3

    .line 3
    sget-object v4, Lqd$a;->a:[I

    invoke-virtual {v1}, Lpe$e;->e()Lpe$e$c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v2, :cond_2

    const/4 v2, 0x2

    if-eq v4, v2, :cond_2

    const/4 v2, 0x3

    if-eq v4, v2, :cond_2

    const/4 v2, 0x4

    if-eq v4, v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    sget-object v2, Lpe$e$c;->c:Lpe$e$c;

    if-eq v3, v2, :cond_0

    move-object v7, v1

    goto :goto_0

    .line 5
    :cond_2
    sget-object v2, Lpe$e$c;->c:Lpe$e$c;

    if-ne v3, v2, :cond_0

    if-nez v6, :cond_0

    move-object v6, v1

    goto :goto_0

    .line 6
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpe$e;

    .line 10
    new-instance v5, Laa;

    invoke-direct {v5}, Laa;-><init>()V

    .line 11
    invoke-virtual {v4, v5}, Lpe$e;->j(Laa;)V

    .line 12
    new-instance v8, Lqd$k;

    invoke-direct {v8, v4, v5, p2}, Lqd$k;-><init>(Lpe$e;Laa;Z)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    new-instance v5, Laa;

    invoke-direct {v5}, Laa;-><init>()V

    .line 14
    invoke-virtual {v4, v5}, Lpe$e;->j(Laa;)V

    .line 15
    new-instance v8, Lqd$m;

    const/4 v9, 0x0

    if-eqz p2, :cond_4

    if-ne v4, v6, :cond_5

    goto :goto_2

    :cond_4
    if-ne v4, v7, :cond_5

    :goto_2
    move v9, v2

    .line 16
    :cond_5
    invoke-direct {v8, v4, v5, p2, v9}, Lqd$m;-><init>(Lpe$e;Laa;ZZ)V

    .line 17
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance v5, Lqd$b;

    invoke-direct {v5, p0, v1, v4}, Lqd$b;-><init>(Lqd;Ljava/util/List;Lpe$e;)V

    invoke-virtual {v4, v5}, Lpe$e;->a(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_6
    move-object v2, p0

    move-object v4, v1

    move v5, p2

    .line 19
    invoke-virtual/range {v2 .. v7}, Lqd;->x(Ljava/util/List;Ljava/util/List;ZLpe$e;Lpe$e;)Ljava/util/Map;

    move-result-object p1

    .line 20
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p2

    .line 21
    invoke-virtual {p0, v0, v1, p2, p1}, Lqd;->w(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V

    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpe$e;

    .line 23
    invoke-virtual {p0, p2}, Lqd;->s(Lpe$e;)V

    goto :goto_3

    .line 24
    :cond_7
    invoke-interface {v1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public s(Lpe$e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 2
    invoke-virtual {p1}, Lpe$e;->e()Lpe$e$c;

    move-result-object p1

    invoke-virtual {p1, v0}, Lpe$e$c;->a(Landroid/view/View;)V

    return-void
.end method

.method public t(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 2
    move-object v0, p2

    check-cast v0, Landroid/view/ViewGroup;

    .line 3
    invoke-static {v0}, Lcc;->a(Landroid/view/ViewGroup;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 5
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_3

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 8
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 9
    invoke-virtual {p0, p1, v2}, Lqd;->t(Ljava/util/ArrayList;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 11
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public u(Ljava/util/Map;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lac;->M(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 4
    check-cast p2, Landroid/view/ViewGroup;

    .line 5
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 8
    invoke-virtual {p0, p1, v2}, Lqd;->u(Ljava/util/Map;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public v(Lo4;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo4<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lo4;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 2
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lac;->M(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final w(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lqd$k;",
            ">;",
            "Ljava/util/List<",
            "Lpe$e;",
            ">;Z",
            "Ljava/util/Map<",
            "Lpe$e;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v7, p0

    .line 1
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v8

    .line 2
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v9

    .line 3
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v13, 0x0

    move v0, v13

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lqd$k;

    .line 5
    invoke-virtual {v14}, Lqd$l;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v14}, Lqd$l;->a()V

    :goto_1
    move-object/from16 v6, p4

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v14, v9}, Lqd$k;->e(Landroid/content/Context;)Ltd$d;

    move-result-object v1

    if-nez v1, :cond_1

    .line 8
    invoke-virtual {v14}, Lqd$l;->a()V

    goto :goto_1

    .line 9
    :cond_1
    iget-object v15, v1, Ltd$d;->b:Landroid/animation/Animator;

    if-nez v15, :cond_2

    .line 10
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 11
    :cond_2
    invoke-virtual {v14}, Lqd$l;->b()Lpe$e;

    move-result-object v5

    .line 12
    invoke-virtual {v5}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 13
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v6, p4

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 14
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->I0(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x8c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x8d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    :cond_3
    invoke-virtual {v14}, Lqd$l;->a()V

    goto :goto_0

    .line 17
    :cond_4
    invoke-virtual {v5}, Lpe$e;->e()Lpe$e$c;

    move-result-object v0

    sget-object v2, Lpe$e$c;->d:Lpe$e$c;

    if-ne v0, v2, :cond_5

    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    move v4, v13

    :goto_2
    move-object/from16 v3, p2

    if-eqz v4, :cond_6

    .line 18
    invoke-interface {v3, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 19
    :cond_6
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 20
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 21
    new-instance v1, Lqd$c;

    move-object v0, v1

    move-object v12, v1

    move-object/from16 v1, p0

    move-object/from16 v16, v2

    move-object v2, v8

    move-object/from16 v3, v16

    move-object v6, v14

    invoke-direct/range {v0 .. v6}, Lqd$c;-><init>(Lqd;Landroid/view/ViewGroup;Landroid/view/View;ZLpe$e;Lqd$k;)V

    invoke-virtual {v15, v12}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object/from16 v0, v16

    .line 22
    invoke-virtual {v15, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 23
    invoke-virtual {v15}, Landroid/animation/Animator;->start()V

    .line 24
    invoke-virtual {v14}, Lqd$l;->c()Laa;

    move-result-object v0

    .line 25
    new-instance v1, Lqd$d;

    invoke-direct {v1, v7, v15}, Lqd$d;-><init>(Lqd;Landroid/animation/Animator;)V

    invoke-virtual {v0, v1}, Laa;->c(Laa$a;)V

    const/4 v0, 0x1

    goto/16 :goto_0

    .line 26
    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqd$k;

    .line 27
    invoke-virtual {v3}, Lqd$l;->b()Lpe$e;

    move-result-object v4

    .line 28
    invoke-virtual {v4}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v5

    const v6, 0x8e

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz p3, :cond_9

    .line 29
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->I0(I)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v5, 0x8f

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    :cond_8
    invoke-virtual {v3}, Lqd$l;->a()V

    goto :goto_3

    :cond_9
    if-eqz v0, :cond_b

    .line 32
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->I0(I)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v5, 0x90

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    :cond_a
    invoke-virtual {v3}, Lqd$l;->a()V

    goto :goto_3

    .line 35
    :cond_b
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 36
    invoke-virtual {v3, v9}, Lqd$k;->e(Landroid/content/Context;)Ltd$d;

    move-result-object v6

    invoke-static {v6}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v6, Ltd$d;

    iget-object v6, v6, Ltd$d;->a:Landroid/view/animation/Animation;

    .line 37
    invoke-static {v6}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v6, Landroid/view/animation/Animation;

    .line 38
    invoke-virtual {v4}, Lpe$e;->e()Lpe$e$c;

    move-result-object v4

    .line 39
    sget-object v10, Lpe$e$c;->b:Lpe$e$c;

    if-eq v4, v10, :cond_c

    .line 40
    invoke-virtual {v5, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 41
    invoke-virtual {v3}, Lqd$l;->a()V

    goto :goto_4

    .line 42
    :cond_c
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 43
    new-instance v4, Ltd$e;

    invoke-direct {v4, v6, v8, v5}, Ltd$e;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 44
    new-instance v6, Lqd$e;

    invoke-direct {v6, v7, v8, v5, v3}, Lqd$e;-><init>(Lqd;Landroid/view/ViewGroup;Landroid/view/View;Lqd$k;)V

    invoke-virtual {v4, v6}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 45
    invoke-virtual {v5, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 46
    :goto_4
    invoke-virtual {v3}, Lqd$l;->c()Laa;

    move-result-object v4

    .line 47
    new-instance v6, Lqd$f;

    invoke-direct {v6, v7, v5, v8, v3}, Lqd$f;-><init>(Lqd;Landroid/view/View;Landroid/view/ViewGroup;Lqd$k;)V

    invoke-virtual {v4, v6}, Laa;->c(Laa$a;)V

    goto/16 :goto_3

    :cond_d
    return-void
.end method

.method public final x(Ljava/util/List;Ljava/util/List;ZLpe$e;Lpe$e;)Ljava/util/Map;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lqd$m;",
            ">;",
            "Ljava/util/List<",
            "Lpe$e;",
            ">;Z",
            "Lpe$e;",
            "Lpe$e;",
            ")",
            "Ljava/util/Map<",
            "Lpe$e;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    .line 1
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v15, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqd$m;

    .line 3
    invoke-virtual {v1}, Lqd$l;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {v1}, Lqd$m;->e()Lme;

    move-result-object v2

    if-nez v15, :cond_2

    move-object v15, v2

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_0

    if-ne v15, v2, :cond_3

    goto :goto_0

    .line 5
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x91

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v1}, Lqd$l;->b()Lpe$e;

    move-result-object v3

    invoke-virtual {v3}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v3, 0x92

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {v1}, Lqd$m;->h()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x93

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-nez v15, :cond_6

    .line 8
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqd$m;

    .line 9
    invoke-virtual {v1}, Lqd$l;->b()Lpe$e;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {v1}, Lqd$l;->a()V

    goto :goto_1

    :cond_5
    return-object v10

    .line 11
    :cond_6
    new-instance v14, Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v14, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 12
    new-instance v13, Landroid/graphics/Rect;

    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 13
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 14
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 15
    new-instance v4, Lo4;

    invoke-direct {v4}, Lo4;-><init>()V

    .line 16
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/16 v21, 0x0

    :goto_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqd$m;

    .line 17
    invoke-virtual {v1}, Lqd$m;->i()Z

    move-result v16

    if-eqz v16, :cond_16

    if-eqz v8, :cond_16

    if-eqz v9, :cond_16

    .line 18
    invoke-virtual {v1}, Lqd$m;->g()Ljava/lang/Object;

    move-result-object v0

    .line 19
    invoke-virtual {v15, v0}, Lme;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 20
    invoke-virtual {v15, v0}, Lme;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 21
    invoke-virtual/range {p5 .. p5}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v0

    .line 23
    invoke-virtual/range {p4 .. p4}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v16

    .line 24
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v3

    .line 25
    invoke-virtual/range {p4 .. p4}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v16

    .line 26
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v11

    move-object/from16 v16, v1

    move-object/from16 v18, v2

    const/4 v1, 0x0

    .line 27
    :goto_3
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 28
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v19, v11

    const/4 v11, -0x1

    if-eq v2, v11, :cond_7

    .line 29
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v2, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_7
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v11, v19

    goto :goto_3

    .line 30
    :cond_8
    invoke-virtual/range {p5 .. p5}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v11

    if-nez v7, :cond_9

    .line 32
    invoke-virtual/range {p4 .. p4}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Lr8;

    move-result-object v1

    .line 33
    invoke-virtual/range {p5 .. p5}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lr8;

    move-result-object v2

    goto :goto_4

    .line 34
    :cond_9
    invoke-virtual/range {p4 .. p4}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lr8;

    move-result-object v1

    .line 35
    invoke-virtual/range {p5 .. p5}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Lr8;

    move-result-object v2

    .line 36
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v3, :cond_a

    .line 37
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v23, v3

    move-object/from16 v3, v19

    check-cast v3, Ljava/lang/String;

    .line 38
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v8, v19

    check-cast v8, Ljava/lang/String;

    .line 39
    invoke-virtual {v4, v3, v8}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v8, p4

    move/from16 v3, v23

    goto :goto_5

    .line 40
    :cond_a
    new-instance v8, Lo4;

    invoke-direct {v8}, Lo4;-><init>()V

    .line 41
    invoke-virtual/range {p4 .. p4}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v3

    iget-object v3, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v6, v8, v3}, Lqd;->u(Ljava/util/Map;Landroid/view/View;)V

    .line 42
    invoke-virtual {v8, v0}, Lo4;->o(Ljava/util/Collection;)Z

    if-eqz v1, :cond_e

    .line 43
    invoke-virtual {v1, v0, v8}, Lr8;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    :goto_6
    if-ltz v1, :cond_d

    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 46
    invoke-virtual {v8, v3}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    if-nez v9, :cond_b

    .line 47
    invoke-virtual {v4, v3}, Lu4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v0

    goto :goto_7

    :cond_b
    move-object/from16 v19, v0

    .line 48
    invoke-static {v9}, Lac;->M(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 49
    invoke-virtual {v4, v3}, Lu4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 50
    invoke-static {v9}, Lac;->M(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v0}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    :goto_7
    add-int/lit8 v1, v1, -0x1

    move-object/from16 v0, v19

    goto :goto_6

    :cond_d
    move-object/from16 v19, v0

    goto :goto_8

    :cond_e
    move-object/from16 v19, v0

    .line 51
    invoke-virtual {v8}, Lo4;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo4;->o(Ljava/util/Collection;)Z

    .line 52
    :goto_8
    new-instance v9, Lo4;

    invoke-direct {v9}, Lo4;-><init>()V

    .line 53
    invoke-virtual/range {p5 .. p5}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v6, v9, v0}, Lqd;->u(Ljava/util/Map;Landroid/view/View;)V

    .line 54
    invoke-virtual {v9, v11}, Lo4;->o(Ljava/util/Collection;)Z

    .line 55
    invoke-virtual {v4}, Lo4;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo4;->o(Ljava/util/Collection;)Z

    if-eqz v2, :cond_11

    .line 56
    invoke-virtual {v2, v11, v9}, Lr8;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 57
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_9
    if-ltz v0, :cond_12

    .line 58
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 59
    invoke-virtual {v9, v1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-nez v2, :cond_f

    .line 60
    invoke-static {v4, v1}, Lke;->q(Lo4;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 61
    invoke-virtual {v4, v1}, Lu4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 62
    :cond_f
    invoke-static {v2}, Lac;->M(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    .line 63
    invoke-static {v4, v1}, Lke;->q(Lo4;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 64
    invoke-static {v2}, Lac;->M(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    .line 65
    invoke-virtual {v4, v1, v2}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    :goto_a
    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    .line 66
    :cond_11
    invoke-static {v4, v9}, Lke;->y(Lo4;Lo4;)V

    .line 67
    :cond_12
    invoke-virtual {v4}, Lo4;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v6, v8, v0}, Lqd;->v(Lo4;Ljava/util/Collection;)V

    .line 68
    invoke-virtual {v4}, Lo4;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v6, v9, v0}, Lqd;->v(Lo4;Ljava/util/Collection;)V

    .line 69
    invoke-virtual {v4}, Lu4;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 70
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 71
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    move-object/from16 v3, p4

    move-object/from16 v26, v4

    move-object v1, v5

    move-object v5, v6

    move-object v4, v12

    move-object v8, v13

    move-object v9, v14

    move-object v11, v15

    move-object/from16 v2, v18

    const/4 v0, 0x0

    const/4 v6, 0x0

    move-object/from16 v15, p5

    goto/16 :goto_d

    .line 72
    :cond_13
    invoke-virtual/range {p5 .. p5}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual/range {p4 .. p4}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    const/4 v3, 0x1

    .line 73
    invoke-static {v0, v1, v7, v8, v3}, Lke;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLo4;Z)V

    .line 74
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v2

    new-instance v1, Lqd$g;

    move-object/from16 v22, v19

    move-object v0, v1

    move-object/from16 v23, v10

    move-object/from16 v7, v16

    move-object v10, v1

    move-object/from16 v1, p0

    move-object/from16 v16, v14

    move-object/from16 v24, v18

    move-object v14, v2

    move-object/from16 v2, p5

    move/from16 v25, v3

    const/4 v6, 0x0

    move-object/from16 v3, p4

    move-object/from16 v26, v4

    move/from16 v4, p3

    move-object/from16 v27, v5

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lqd$g;-><init>(Lqd;Lpe$e;Lpe$e;ZLo4;)V

    invoke-static {v14, v10}, Lxb;->a(Landroid/view/View;Ljava/lang/Runnable;)Lxb;

    .line 75
    invoke-virtual {v8}, Lo4;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 76
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    move-object/from16 v0, v22

    .line 77
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 78
    invoke-virtual {v8, v0}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 79
    invoke-virtual {v15, v7, v0}, Lme;->v(Ljava/lang/Object;Landroid/view/View;)V

    move-object v2, v0

    goto :goto_b

    :cond_14
    move-object/from16 v2, v24

    .line 80
    :goto_b
    invoke-virtual {v9}, Lo4;->values()Ljava/util/Collection;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 81
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    .line 82
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 83
    invoke-virtual {v9, v0}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_15

    .line 84
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v3

    new-instance v4, Lqd$h;

    move-object/from16 v5, p0

    invoke-direct {v4, v5, v15, v0, v13}, Lqd$h;-><init>(Lqd;Lme;Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v3, v4}, Lxb;->a(Landroid/view/View;Ljava/lang/Runnable;)Lxb;

    move-object/from16 v0, v16

    move/from16 v21, v25

    goto :goto_c

    :cond_15
    move-object/from16 v5, p0

    move-object/from16 v0, v16

    .line 85
    :goto_c
    invoke-virtual {v15, v7, v0, v12}, Lme;->z(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v4, v12

    move-object v12, v15

    move-object v8, v13

    move-object v13, v7

    move-object v9, v0

    move-object v11, v15

    move-object v15, v3

    move-object/from16 v18, v7

    move-object/from16 v19, v1

    .line 86
    invoke-virtual/range {v12 .. v19}, Lme;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 87
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v3, p4

    move-object/from16 v10, v23

    invoke-interface {v10, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v15, p5

    .line 88
    invoke-interface {v10, v15, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v7

    goto :goto_d

    :cond_16
    move-object/from16 v24, v2

    move-object/from16 v26, v4

    move-object v1, v5

    move-object v5, v6

    move-object v3, v8

    move-object v4, v12

    move-object v8, v13

    move-object v11, v15

    const/4 v6, 0x0

    move-object v15, v9

    move-object v9, v14

    move-object/from16 v2, v24

    :goto_d
    move/from16 v7, p3

    move-object v12, v4

    move-object v6, v5

    move-object v13, v8

    move-object v14, v9

    move-object v9, v15

    move-object/from16 v4, v26

    move-object v5, v1

    move-object v8, v3

    move-object v15, v11

    goto/16 :goto_2

    :cond_17
    move-object/from16 v24, v2

    move-object/from16 v26, v4

    move-object v1, v5

    move-object v5, v6

    move-object v3, v8

    move-object v4, v12

    move-object v8, v13

    move-object v11, v15

    const/4 v6, 0x0

    const/16 v25, 0x1

    move-object v15, v9

    move-object v9, v14

    .line 89
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 90
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_24

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v20, v12

    check-cast v20, Lqd$m;

    .line 91
    invoke-virtual/range {v20 .. v20}, Lqd$l;->d()Z

    move-result v12

    if-eqz v12, :cond_18

    .line 92
    invoke-virtual/range {v20 .. v20}, Lqd$l;->b()Lpe$e;

    move-result-object v12

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v12, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    invoke-virtual/range {v20 .. v20}, Lqd$l;->a()V

    const/4 v6, 0x0

    goto :goto_e

    .line 94
    :cond_18
    invoke-virtual/range {v20 .. v20}, Lqd$m;->h()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v11, v6}, Lme;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 95
    invoke-virtual/range {v20 .. v20}, Lqd$l;->b()Lpe$e;

    move-result-object v12

    if-eqz v0, :cond_1a

    if-eq v12, v3, :cond_19

    if-ne v12, v15, :cond_1a

    :cond_19
    move/from16 v16, v25

    goto :goto_f

    :cond_1a
    const/16 v16, 0x0

    :goto_f
    if-nez v6, :cond_1c

    if-nez v16, :cond_1b

    .line 96
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v12, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-virtual/range {v20 .. v20}, Lqd$l;->a()V

    :cond_1b
    move-object/from16 v12, p2

    move-object/from16 v30, v1

    move-object/from16 v29, v4

    move-object/from16 p3, v7

    move-object/from16 v27, v9

    move-object v6, v13

    move-object v1, v15

    move-object/from16 v7, v24

    const/4 v13, 0x0

    goto/16 :goto_13

    :cond_1c
    move-object/from16 p3, v7

    .line 98
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v17, v13

    .line 99
    invoke-virtual {v12}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v13

    iget-object v13, v13, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 100
    invoke-virtual {v5, v7, v13}, Lqd;->t(Ljava/util/ArrayList;Landroid/view/View;)V

    if-eqz v16, :cond_1e

    if-ne v12, v3, :cond_1d

    .line 101
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_10

    .line 102
    :cond_1d
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 103
    :cond_1e
    :goto_10
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_1f

    .line 104
    invoke-virtual {v11, v6, v9}, Lme;->a(Ljava/lang/Object;Landroid/view/View;)V

    move-object/from16 v30, v1

    move-object/from16 v29, v4

    move-object/from16 v27, v9

    move-object v13, v12

    move-object v4, v14

    move-object v1, v15

    move-object/from16 v9, v17

    move-object/from16 v12, p2

    goto :goto_11

    .line 105
    :cond_1f
    invoke-virtual {v11, v6, v7}, Lme;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    move-object v13, v12

    move-object v12, v11

    move-object/from16 v27, v9

    move-object/from16 v28, v13

    move-object/from16 v9, v17

    move-object v13, v6

    move-object/from16 v29, v4

    move-object v4, v14

    move-object v14, v6

    move-object/from16 v30, v1

    move-object v1, v15

    move-object v15, v7

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v23

    .line 106
    invoke-virtual/range {v12 .. v19}, Lme;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 107
    invoke-virtual/range {v28 .. v28}, Lpe$e;->e()Lpe$e$c;

    move-result-object v12

    sget-object v13, Lpe$e$c;->d:Lpe$e$c;

    if-ne v12, v13, :cond_20

    move-object/from16 v12, p2

    move-object/from16 v13, v28

    .line 108
    invoke-interface {v12, v13}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 109
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 110
    invoke-virtual {v13}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v15

    iget-object v15, v15, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 111
    invoke-virtual {v13}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v15

    iget-object v15, v15, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 112
    invoke-virtual {v11, v6, v15, v14}, Lme;->r(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 113
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v14

    new-instance v15, Lqd$i;

    invoke-direct {v15, v5, v7}, Lqd$i;-><init>(Lqd;Ljava/util/ArrayList;)V

    invoke-static {v14, v15}, Lxb;->a(Landroid/view/View;Ljava/lang/Runnable;)Lxb;

    goto :goto_11

    :cond_20
    move-object/from16 v12, p2

    move-object/from16 v13, v28

    .line 114
    :goto_11
    invoke-virtual {v13}, Lpe$e;->e()Lpe$e$c;

    move-result-object v14

    sget-object v15, Lpe$e$c;->c:Lpe$e$c;

    if-ne v14, v15, :cond_22

    .line 115
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v21, :cond_21

    .line 116
    invoke-virtual {v11, v6, v8}, Lme;->u(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_21
    move-object/from16 v7, v24

    goto :goto_12

    :cond_22
    move-object/from16 v7, v24

    .line 117
    invoke-virtual {v11, v6, v7}, Lme;->v(Ljava/lang/Object;Landroid/view/View;)V

    .line 118
    :goto_12
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v10, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    invoke-virtual/range {v20 .. v20}, Lqd$m;->j()Z

    move-result v13

    if-eqz v13, :cond_23

    const/4 v13, 0x0

    .line 120
    invoke-virtual {v11, v4, v6, v13}, Lme;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    move-object v6, v9

    goto :goto_13

    :cond_23
    const/4 v13, 0x0

    .line 121
    invoke-virtual {v11, v9, v6, v13}, Lme;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v4

    :goto_13
    move-object v15, v1

    move-object v13, v6

    move-object/from16 v24, v7

    move-object/from16 v9, v27

    move-object/from16 v4, v29

    move-object/from16 v1, v30

    const/4 v6, 0x0

    move-object/from16 v7, p3

    goto/16 :goto_e

    :cond_24
    move-object/from16 v30, v1

    move-object/from16 v29, v4

    move-object v9, v13

    move-object v4, v14

    move-object v1, v15

    .line 122
    invoke-virtual {v11, v4, v9, v0}, Lme;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 123
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_25
    :goto_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqd$m;

    .line 124
    invoke-virtual {v7}, Lqd$l;->d()Z

    move-result v8

    if-eqz v8, :cond_26

    goto :goto_14

    .line 125
    :cond_26
    invoke-virtual {v7}, Lqd$m;->h()Ljava/lang/Object;

    move-result-object v8

    .line 126
    invoke-virtual {v7}, Lqd$l;->b()Lpe$e;

    move-result-object v9

    if-eqz v0, :cond_28

    if-eq v9, v3, :cond_27

    if-ne v9, v1, :cond_28

    :cond_27
    move/from16 v12, v25

    goto :goto_15

    :cond_28
    const/4 v12, 0x0

    :goto_15
    if-nez v8, :cond_29

    if-eqz v12, :cond_25

    .line 127
    :cond_29
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v8

    invoke-static {v8}, Lac;->V(Landroid/view/View;)Z

    move-result v8

    if-nez v8, :cond_2b

    const/4 v8, 0x2

    .line 128
    invoke-static {v8}, Landroidx/fragment/app/FragmentManager;->I0(I)Z

    move-result v8

    if-eqz v8, :cond_2a

    .line 129
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const v12, 0x94

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v12, 0x95

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    :cond_2a
    invoke-virtual {v7}, Lqd$l;->a()V

    goto :goto_14

    .line 132
    :cond_2b
    invoke-virtual {v7}, Lqd$l;->b()Lpe$e;

    move-result-object v8

    invoke-virtual {v8}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v8

    .line 133
    invoke-virtual {v7}, Lqd$l;->c()Laa;

    move-result-object v9

    new-instance v12, Lqd$j;

    invoke-direct {v12, v5, v7}, Lqd$j;-><init>(Lqd;Lqd$m;)V

    .line 134
    invoke-virtual {v11, v8, v4, v9, v12}, Lme;->w(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Laa;Ljava/lang/Runnable;)V

    goto :goto_14

    .line 135
    :cond_2c
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-static {v1}, Lac;->V(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_2d

    return-object v10

    :cond_2d
    const/4 v1, 0x4

    .line 136
    invoke-static {v2, v1}, Lke;->B(Ljava/util/ArrayList;I)V

    move-object/from16 v1, v30

    .line 137
    invoke-virtual {v11, v1}, Lme;->o(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v16

    .line 138
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v3

    invoke-virtual {v11, v3, v4}, Lme;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 139
    invoke-virtual/range {p0 .. p0}, Lpe;->m()Landroid/view/ViewGroup;

    move-result-object v13

    move-object v12, v11

    move-object/from16 v14, v29

    move-object v15, v1

    move-object/from16 v17, v26

    invoke-virtual/range {v12 .. v17}, Lme;->y(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    const/4 v3, 0x0

    .line 140
    invoke-static {v2, v3}, Lke;->B(Ljava/util/ArrayList;I)V

    move-object/from16 v2, v29

    .line 141
    invoke-virtual {v11, v0, v2, v1}, Lme;->A(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v10
.end method
