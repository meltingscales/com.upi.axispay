.class public Lh6;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr5;",
            "I",
            "Ljava/util/ArrayList<",
            "Ln6;",
            ">;",
            "Ln6;",
            ")",
            "Ln6;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1
    iget v0, p0, Lr5;->s0:I

    goto :goto_0

    .line 2
    :cond_0
    iget v0, p0, Lr5;->t0:I

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-eqz p3, :cond_1

    .line 3
    iget v3, p3, Ln6;->b:I

    if-eq v0, v3, :cond_4

    :cond_1
    move v3, v1

    .line 4
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 5
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln6;

    .line 6
    invoke-virtual {v4}, Ln6;->c()I

    move-result v5

    if-ne v5, v0, :cond_3

    if-eqz p3, :cond_2

    .line 7
    invoke-virtual {p3, p1, v4}, Ln6;->g(ILn6;)V

    .line 8
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    move-object p3, v4

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v0, v2, :cond_5

    return-object p3

    :cond_5
    :goto_2
    if-nez p3, :cond_9

    .line 9
    instance-of v0, p0, Lv5;

    if-eqz v0, :cond_7

    .line 10
    move-object v0, p0

    check-cast v0, Lv5;

    .line 11
    invoke-virtual {v0, p1}, Lv5;->p1(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    move v2, v1

    .line 12
    :goto_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_7

    .line 13
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6;

    .line 14
    invoke-virtual {v3}, Ln6;->c()I

    move-result v4

    if-ne v4, v0, :cond_6

    move-object p3, v3

    goto :goto_4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-nez p3, :cond_8

    .line 15
    new-instance p3, Ln6;

    invoke-direct {p3, p1}, Ln6;-><init>(I)V

    .line 16
    :cond_8
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_9
    invoke-virtual {p3, p0}, Ln6;->a(Lr5;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 18
    instance-of v0, p0, Lt5;

    if-eqz v0, :cond_b

    .line 19
    move-object v0, p0

    check-cast v0, Lt5;

    .line 20
    invoke-virtual {v0}, Lt5;->o1()Lq5;

    move-result-object v2

    invoke-virtual {v0}, Lt5;->p1()I

    move-result v0

    if-nez v0, :cond_a

    const/4 v1, 0x1

    :cond_a
    invoke-virtual {v2, v1, p2, p3}, Lq5;->b(ILjava/util/ArrayList;Ln6;)V

    :cond_b
    if-nez p1, :cond_c

    .line 21
    invoke-virtual {p3}, Ln6;->c()I

    move-result v0

    iput v0, p0, Lr5;->s0:I

    .line 22
    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {v0, p1, p2, p3}, Lq5;->b(ILjava/util/ArrayList;Ln6;)V

    .line 23
    iget-object v0, p0, Lr5;->N:Lq5;

    invoke-virtual {v0, p1, p2, p3}, Lq5;->b(ILjava/util/ArrayList;Ln6;)V

    goto :goto_5

    .line 24
    :cond_c
    invoke-virtual {p3}, Ln6;->c()I

    move-result v0

    iput v0, p0, Lr5;->t0:I

    .line 25
    iget-object v0, p0, Lr5;->M:Lq5;

    invoke-virtual {v0, p1, p2, p3}, Lq5;->b(ILjava/util/ArrayList;Ln6;)V

    .line 26
    iget-object v0, p0, Lr5;->P:Lq5;

    invoke-virtual {v0, p1, p2, p3}, Lq5;->b(ILjava/util/ArrayList;Ln6;)V

    .line 27
    iget-object v0, p0, Lr5;->O:Lq5;

    invoke-virtual {v0, p1, p2, p3}, Lq5;->b(ILjava/util/ArrayList;Ln6;)V

    .line 28
    :goto_5
    iget-object p0, p0, Lr5;->S:Lq5;

    invoke-virtual {p0, p1, p2, p3}, Lq5;->b(ILjava/util/ArrayList;Ln6;)V

    :cond_d
    return-object p3
.end method

.method public static b(Ljava/util/ArrayList;I)Ln6;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ln6;",
            ">;I)",
            "Ln6;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6;

    .line 3
    iget v3, v2, Ln6;->b:I

    if-ne p1, v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Ls5;La6$b;)Z
    .locals 16

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p0 .. p0}, Ly5;->o1()Ljava/util/ArrayList;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    .line 3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr5;

    .line 4
    invoke-virtual/range {p0 .. p0}, Lr5;->y()Lr5$b;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lr5;->R()Lr5$b;

    move-result-object v7

    .line 5
    invoke-virtual {v5}, Lr5;->y()Lr5$b;

    move-result-object v8

    invoke-virtual {v5}, Lr5;->R()Lr5$b;

    move-result-object v5

    .line 6
    invoke-static {v6, v7, v8, v5}, Lh6;->d(Lr5$b;Lr5$b;Lr5$b;Lr5$b;)Z

    move-result v5

    if-nez v5, :cond_0

    return v3

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v4, v0, Ls5;->B0:La5;

    if-eqz v4, :cond_2

    .line 8
    iget-wide v5, v4, La5;->A:J

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    iput-wide v5, v4, La5;->A:J

    :cond_2
    move v5, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v5, v2, :cond_13

    .line 9
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lr5;

    .line 10
    invoke-virtual/range {p0 .. p0}, Lr5;->y()Lr5$b;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lr5;->R()Lr5$b;

    move-result-object v15

    .line 11
    invoke-virtual {v13}, Lr5;->y()Lr5$b;

    move-result-object v4

    invoke-virtual {v13}, Lr5;->R()Lr5$b;

    move-result-object v12

    .line 12
    invoke-static {v14, v15, v4, v12}, Lh6;->d(Lr5$b;Lr5$b;Lr5$b;Lr5$b;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 13
    iget-object v4, v0, Ls5;->R0:La6$a;

    sget v12, La6$a;->k:I

    move-object/from16 v14, p1

    invoke-static {v3, v13, v14, v4, v12}, Ls5;->O1(ILr5;La6$b;La6$a;I)Z

    goto :goto_2

    :cond_3
    move-object/from16 v14, p1

    .line 14
    :goto_2
    instance-of v4, v13, Lt5;

    if-eqz v4, :cond_7

    .line 15
    move-object v12, v13

    check-cast v12, Lt5;

    .line 16
    invoke-virtual {v12}, Lt5;->p1()I

    move-result v15

    if-nez v15, :cond_5

    if-nez v8, :cond_4

    .line 17
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 18
    :cond_4
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_5
    invoke-virtual {v12}, Lt5;->p1()I

    move-result v15

    const/4 v3, 0x1

    if-ne v15, v3, :cond_7

    if-nez v6, :cond_6

    .line 20
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 21
    :cond_6
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_7
    instance-of v3, v13, Lv5;

    if-eqz v3, :cond_e

    .line 23
    instance-of v3, v13, Ln5;

    if-eqz v3, :cond_b

    .line 24
    move-object v3, v13

    check-cast v3, Ln5;

    .line 25
    invoke-virtual {v3}, Ln5;->u1()I

    move-result v12

    if-nez v12, :cond_9

    if-nez v7, :cond_8

    .line 26
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 27
    :cond_8
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    :cond_9
    invoke-virtual {v3}, Ln5;->u1()I

    move-result v12

    const/4 v15, 0x1

    if-ne v12, v15, :cond_e

    if-nez v9, :cond_a

    .line 29
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 30
    :cond_a
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 31
    :cond_b
    move-object v3, v13

    check-cast v3, Lv5;

    if-nez v7, :cond_c

    .line 32
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 33
    :cond_c
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v9, :cond_d

    .line 34
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 35
    :cond_d
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    :cond_e
    :goto_3
    iget-object v3, v13, Lr5;->L:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-nez v3, :cond_10

    iget-object v3, v13, Lr5;->N:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-nez v3, :cond_10

    if-nez v4, :cond_10

    instance-of v3, v13, Ln5;

    if-nez v3, :cond_10

    if-nez v10, :cond_f

    .line 37
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 38
    :cond_f
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    :cond_10
    iget-object v3, v13, Lr5;->M:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-nez v3, :cond_12

    iget-object v3, v13, Lr5;->O:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-nez v3, :cond_12

    iget-object v3, v13, Lr5;->P:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-nez v3, :cond_12

    if-nez v4, :cond_12

    instance-of v3, v13, Ln5;

    if-nez v3, :cond_12

    if-nez v11, :cond_11

    .line 40
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v3

    .line 41
    :cond_11
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    add-int/lit8 v5, v5, 0x1

    const/4 v3, 0x0

    goto/16 :goto_1

    .line 42
    :cond_13
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v6, :cond_14

    .line 43
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt5;

    const/4 v6, 0x0

    const/4 v12, 0x0

    .line 44
    invoke-static {v5, v6, v3, v12}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_4

    :cond_14
    const/4 v6, 0x0

    const/4 v12, 0x0

    if-eqz v7, :cond_15

    .line 45
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv5;

    .line 46
    invoke-static {v5, v6, v3, v12}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    move-result-object v7

    .line 47
    invoke-virtual {v5, v3, v6, v7}, Lv5;->o1(Ljava/util/ArrayList;ILn6;)V

    .line 48
    invoke-virtual {v7, v3}, Ln6;->b(Ljava/util/ArrayList;)V

    const/4 v6, 0x0

    const/4 v12, 0x0

    goto :goto_5

    .line 49
    :cond_15
    sget-object v4, Lq5$b;->c:Lq5$b;

    invoke-virtual {v0, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_16

    .line 51
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq5;

    .line 52
    iget-object v5, v5, Lq5;->d:Lr5;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_6

    .line 53
    :cond_16
    sget-object v4, Lq5$b;->e:Lq5$b;

    invoke-virtual {v0, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    .line 54
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_17

    .line 55
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq5;

    .line 56
    iget-object v5, v5, Lq5;->d:Lr5;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_7

    .line 57
    :cond_17
    sget-object v4, Lq5$b;->h:Lq5$b;

    invoke-virtual {v0, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    .line 58
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_18

    .line 59
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq5;

    .line 60
    iget-object v5, v5, Lq5;->d:Lr5;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_8

    :cond_18
    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v10, :cond_19

    .line 61
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr5;

    .line 62
    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_9

    :cond_19
    if-eqz v8, :cond_1a

    .line 63
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt5;

    const/4 v6, 0x1

    .line 64
    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_a

    :cond_1a
    const/4 v6, 0x1

    if-eqz v9, :cond_1b

    .line 65
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv5;

    .line 66
    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    move-result-object v8

    .line 67
    invoke-virtual {v5, v3, v6, v8}, Lv5;->o1(Ljava/util/ArrayList;ILn6;)V

    .line 68
    invoke-virtual {v8, v3}, Ln6;->b(Ljava/util/ArrayList;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_b

    .line 69
    :cond_1b
    sget-object v4, Lq5$b;->d:Lq5$b;

    invoke-virtual {v0, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    .line 70
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_1c

    .line 71
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq5;

    .line 72
    iget-object v5, v5, Lq5;->d:Lr5;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_c

    .line 73
    :cond_1c
    sget-object v4, Lq5$b;->g:Lq5$b;

    invoke-virtual {v0, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    .line 74
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_1d

    .line 75
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq5;

    .line 76
    iget-object v5, v5, Lq5;->d:Lr5;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_d

    .line 77
    :cond_1d
    sget-object v4, Lq5$b;->f:Lq5$b;

    invoke-virtual {v0, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    .line 78
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_1e

    .line 79
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq5;

    .line 80
    iget-object v5, v5, Lq5;->d:Lr5;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_e

    .line 81
    :cond_1e
    sget-object v4, Lq5$b;->h:Lq5$b;

    invoke-virtual {v0, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    .line 82
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_1f

    .line 83
    invoke-virtual {v4}, Lq5;->c()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq5;

    .line 84
    iget-object v5, v5, Lq5;->d:Lr5;

    const/4 v6, 0x1

    const/4 v12, 0x0

    invoke-static {v5, v6, v3, v12}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_f

    :cond_1f
    const/4 v6, 0x1

    const/4 v12, 0x0

    if-eqz v11, :cond_20

    .line 85
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr5;

    .line 86
    invoke-static {v5, v6, v3, v12}, Lh6;->a(Lr5;ILjava/util/ArrayList;Ln6;)Ln6;

    goto :goto_10

    :cond_20
    const/4 v4, 0x0

    :goto_11
    if-ge v4, v2, :cond_22

    .line 87
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr5;

    .line 88
    invoke-virtual {v5}, Lr5;->q0()Z

    move-result v6

    if-eqz v6, :cond_21

    .line 89
    iget v6, v5, Lr5;->s0:I

    invoke-static {v3, v6}, Lh6;->b(Ljava/util/ArrayList;I)Ln6;

    move-result-object v6

    .line 90
    iget v5, v5, Lr5;->t0:I

    invoke-static {v3, v5}, Lh6;->b(Ljava/util/ArrayList;I)Ln6;

    move-result-object v5

    if-eqz v6, :cond_21

    if-eqz v5, :cond_21

    const/4 v7, 0x0

    .line 91
    invoke-virtual {v6, v7, v5}, Ln6;->g(ILn6;)V

    const/4 v7, 0x2

    .line 92
    invoke-virtual {v5, v7}, Ln6;->i(I)V

    .line 93
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_21
    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    .line 94
    :cond_22
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_23

    const/4 v1, 0x0

    return v1

    .line 95
    :cond_23
    invoke-virtual/range {p0 .. p0}, Lr5;->y()Lr5$b;

    move-result-object v1

    sget-object v2, Lr5$b;->c:Lr5$b;

    if-ne v1, v2, :cond_27

    .line 96
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v12

    const/4 v6, 0x0

    :cond_24
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln6;

    .line 97
    invoke-virtual {v4}, Ln6;->d()I

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_25

    goto :goto_12

    :cond_25
    const/4 v5, 0x0

    .line 98
    invoke-virtual {v4, v5}, Ln6;->h(Z)V

    .line 99
    invoke-virtual/range {p0 .. p0}, Ls5;->H1()Lz4;

    move-result-object v7

    invoke-virtual {v4, v7, v5}, Ln6;->f(Lz4;I)I

    move-result v7

    if-le v7, v6, :cond_24

    move-object v2, v4

    move v6, v7

    goto :goto_12

    :cond_26
    if-eqz v2, :cond_27

    .line 100
    sget-object v1, Lr5$b;->b:Lr5$b;

    invoke-virtual {v0, v1}, Lr5;->M0(Lr5$b;)V

    .line 101
    invoke-virtual {v0, v6}, Lr5;->h1(I)V

    const/4 v1, 0x1

    .line 102
    invoke-virtual {v2, v1}, Ln6;->h(Z)V

    goto :goto_13

    :cond_27
    move-object v2, v12

    .line 103
    :goto_13
    invoke-virtual/range {p0 .. p0}, Lr5;->R()Lr5$b;

    move-result-object v1

    sget-object v4, Lr5$b;->c:Lr5$b;

    if-ne v1, v4, :cond_2b

    .line 104
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v3, v12

    const/4 v6, 0x0

    :cond_28
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln6;

    .line 105
    invoke-virtual {v4}, Ln6;->d()I

    move-result v5

    if-nez v5, :cond_29

    goto :goto_14

    :cond_29
    const/4 v5, 0x0

    .line 106
    invoke-virtual {v4, v5}, Ln6;->h(Z)V

    .line 107
    invoke-virtual/range {p0 .. p0}, Ls5;->H1()Lz4;

    move-result-object v7

    const/4 v8, 0x1

    invoke-virtual {v4, v7, v8}, Ln6;->f(Lz4;I)I

    move-result v7

    if-le v7, v6, :cond_28

    move-object v3, v4

    move v6, v7

    goto :goto_14

    :cond_2a
    const/4 v5, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_2c

    .line 108
    sget-object v1, Lr5$b;->b:Lr5$b;

    invoke-virtual {v0, v1}, Lr5;->d1(Lr5$b;)V

    .line 109
    invoke-virtual {v0, v6}, Lr5;->I0(I)V

    .line 110
    invoke-virtual {v3, v8}, Ln6;->h(Z)V

    move-object v4, v3

    goto :goto_15

    :cond_2b
    const/4 v5, 0x0

    const/4 v8, 0x1

    :cond_2c
    move-object v4, v12

    :goto_15
    if-nez v2, :cond_2e

    if-eqz v4, :cond_2d

    goto :goto_16

    :cond_2d
    move v3, v5

    goto :goto_17

    :cond_2e
    :goto_16
    move v3, v8

    :goto_17
    return v3
.end method

.method public static d(Lr5$b;Lr5$b;Lr5$b;Lr5$b;)Z
    .locals 5

    .line 1
    sget-object v0, Lr5$b;->b:Lr5$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_1

    sget-object v3, Lr5$b;->c:Lr5$b;

    if-eq p2, v3, :cond_1

    sget-object v4, Lr5$b;->e:Lr5$b;

    if-ne p2, v4, :cond_0

    if-eq p0, v3, :cond_0

    goto :goto_0

    :cond_0
    move p0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move p0, v2

    :goto_1
    if-eq p3, v0, :cond_3

    .line 2
    sget-object p2, Lr5$b;->c:Lr5$b;

    if-eq p3, p2, :cond_3

    sget-object v0, Lr5$b;->e:Lr5$b;

    if-ne p3, v0, :cond_2

    if-eq p1, p2, :cond_2

    goto :goto_2

    :cond_2
    move p1, v1

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v2

    :goto_3
    if-nez p0, :cond_5

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    return v1

    :cond_5
    :goto_4
    return v2
.end method
