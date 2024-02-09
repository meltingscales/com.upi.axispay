.class public Ld6;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Ls5;

.field public b:Z

.field public c:Z

.field public d:Ls5;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo6;",
            ">;"
        }
    .end annotation
.end field

.field public f:La6$b;

.field public g:La6$a;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ll6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls5;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ld6;->b:Z

    .line 3
    iput-boolean v0, p0, Ld6;->c:Z

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld6;->e:Ljava/util/ArrayList;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Ld6;->f:La6$b;

    .line 7
    new-instance v0, La6$a;

    invoke-direct {v0}, La6$a;-><init>()V

    iput-object v0, p0, Ld6;->g:La6$a;

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld6;->h:Ljava/util/ArrayList;

    .line 9
    iput-object p1, p0, Ld6;->a:Ls5;

    .line 10
    iput-object p1, p0, Ld6;->d:Ls5;

    return-void
.end method


# virtual methods
.method public final a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le6;",
            "II",
            "Le6;",
            "Ljava/util/ArrayList<",
            "Ll6;",
            ">;",
            "Ll6;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p1, p1, Le6;->d:Lo6;

    .line 2
    iget-object v0, p1, Lo6;->c:Ll6;

    if-nez v0, :cond_c

    iget-object v0, p0, Ld6;->a:Ls5;

    iget-object v1, v0, Lr5;->d:Lk6;

    if-eq p1, v1, :cond_c

    iget-object v0, v0, Lr5;->e:Lm6;

    if-ne p1, v0, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p6, :cond_1

    .line 3
    new-instance p6, Ll6;

    invoke-direct {p6, p1, p3}, Ll6;-><init>(Lo6;I)V

    .line 4
    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_1
    iput-object p6, p1, Lo6;->c:Ll6;

    .line 6
    invoke-virtual {p6, p1}, Ll6;->a(Lo6;)V

    .line 7
    iget-object p3, p1, Lo6;->h:Le6;

    iget-object p3, p3, Le6;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc6;

    .line 8
    instance-of v1, v0, Le6;

    if-eqz v1, :cond_2

    .line 9
    move-object v1, v0

    check-cast v1, Le6;

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object p3, p1, Lo6;->i:Le6;

    iget-object p3, p3, Le6;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc6;

    .line 11
    instance-of v1, v0, Le6;

    if-eqz v1, :cond_4

    .line 12
    move-object v1, v0

    check-cast v1, Le6;

    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_1

    :cond_5
    const/4 p3, 0x1

    if-ne p2, p3, :cond_7

    .line 13
    instance-of v0, p1, Lm6;

    if-eqz v0, :cond_7

    .line 14
    move-object v0, p1

    check-cast v0, Lm6;

    iget-object v0, v0, Lm6;->k:Le6;

    iget-object v0, v0, Le6;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_6
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc6;

    .line 15
    instance-of v1, v0, Le6;

    if-eqz v1, :cond_6

    .line 16
    move-object v1, v0

    check-cast v1, Le6;

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_2

    .line 17
    :cond_7
    iget-object v0, p1, Lo6;->h:Le6;

    iget-object v0, v0, Le6;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le6;

    if-ne v1, p4, :cond_8

    .line 18
    iput-boolean p3, p6, Ll6;->a:Z

    :cond_8
    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 19
    invoke-virtual/range {v0 .. v6}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_3

    .line 20
    :cond_9
    iget-object v0, p1, Lo6;->i:Le6;

    iget-object v0, v0, Le6;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le6;

    if-ne v1, p4, :cond_a

    .line 21
    iput-boolean p3, p6, Ll6;->a:Z

    :cond_a
    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 22
    invoke-virtual/range {v0 .. v6}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_4

    :cond_b
    if-ne p2, p3, :cond_c

    .line 23
    instance-of p3, p1, Lm6;

    if-eqz p3, :cond_c

    .line 24
    check-cast p1, Lm6;

    iget-object p1, p1, Lm6;->k:Le6;

    iget-object p1, p1, Le6;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Le6;

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 25
    invoke-virtual/range {v0 .. v6}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_5

    :cond_c
    :goto_6
    return-void
.end method

.method public final b(Ls5;)Z
    .locals 16

    move-object/from16 v0, p1

    .line 1
    iget-object v1, v0, Ly5;->v0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr5;

    .line 2
    iget-object v4, v2, Lr5;->W:[Lr5$b;

    aget-object v5, v4, v3

    const/4 v10, 0x1

    .line 3
    aget-object v4, v4, v10

    .line 4
    invoke-virtual {v2}, Lr5;->T()I

    move-result v6

    const/16 v7, 0x8

    if-ne v6, v7, :cond_1

    .line 5
    iput-boolean v10, v2, Lr5;->a:Z

    goto :goto_0

    .line 6
    :cond_1
    iget v6, v2, Lr5;->y:F

    const/high16 v11, 0x3f800000    # 1.0f

    cmpg-float v6, v6, v11

    const/4 v7, 0x2

    if-gez v6, :cond_2

    sget-object v6, Lr5$b;->d:Lr5$b;

    if-ne v5, v6, :cond_2

    .line 7
    iput v7, v2, Lr5;->t:I

    .line 8
    :cond_2
    iget v6, v2, Lr5;->B:F

    cmpg-float v6, v6, v11

    if-gez v6, :cond_3

    sget-object v6, Lr5$b;->d:Lr5$b;

    if-ne v4, v6, :cond_3

    .line 9
    iput v7, v2, Lr5;->u:I

    .line 10
    :cond_3
    invoke-virtual {v2}, Lr5;->t()F

    move-result v6

    const/4 v8, 0x0

    cmpl-float v6, v6, v8

    const/4 v8, 0x3

    if-lez v6, :cond_9

    .line 11
    sget-object v6, Lr5$b;->d:Lr5$b;

    if-ne v5, v6, :cond_5

    sget-object v9, Lr5$b;->c:Lr5$b;

    if-eq v4, v9, :cond_4

    sget-object v9, Lr5$b;->b:Lr5$b;

    if-ne v4, v9, :cond_5

    .line 12
    :cond_4
    iput v8, v2, Lr5;->t:I

    goto :goto_1

    :cond_5
    if-ne v4, v6, :cond_7

    .line 13
    sget-object v9, Lr5$b;->c:Lr5$b;

    if-eq v5, v9, :cond_6

    sget-object v9, Lr5$b;->b:Lr5$b;

    if-ne v5, v9, :cond_7

    .line 14
    :cond_6
    iput v8, v2, Lr5;->u:I

    goto :goto_1

    :cond_7
    if-ne v5, v6, :cond_9

    if-ne v4, v6, :cond_9

    .line 15
    iget v6, v2, Lr5;->t:I

    if-nez v6, :cond_8

    .line 16
    iput v8, v2, Lr5;->t:I

    .line 17
    :cond_8
    iget v6, v2, Lr5;->u:I

    if-nez v6, :cond_9

    .line 18
    iput v8, v2, Lr5;->u:I

    .line 19
    :cond_9
    :goto_1
    sget-object v6, Lr5$b;->d:Lr5$b;

    if-ne v5, v6, :cond_b

    iget v9, v2, Lr5;->t:I

    if-ne v9, v10, :cond_b

    .line 20
    iget-object v9, v2, Lr5;->L:Lq5;

    iget-object v9, v9, Lq5;->f:Lq5;

    if-eqz v9, :cond_a

    iget-object v9, v2, Lr5;->N:Lq5;

    iget-object v9, v9, Lq5;->f:Lq5;

    if-nez v9, :cond_b

    .line 21
    :cond_a
    sget-object v5, Lr5$b;->c:Lr5$b;

    :cond_b
    move-object v9, v5

    if-ne v4, v6, :cond_d

    .line 22
    iget v5, v2, Lr5;->u:I

    if-ne v5, v10, :cond_d

    .line 23
    iget-object v5, v2, Lr5;->M:Lq5;

    iget-object v5, v5, Lq5;->f:Lq5;

    if-eqz v5, :cond_c

    iget-object v5, v2, Lr5;->O:Lq5;

    iget-object v5, v5, Lq5;->f:Lq5;

    if-nez v5, :cond_d

    .line 24
    :cond_c
    sget-object v4, Lr5$b;->c:Lr5$b;

    :cond_d
    move-object v12, v4

    .line 25
    iget-object v4, v2, Lr5;->d:Lk6;

    iput-object v9, v4, Lo6;->d:Lr5$b;

    .line 26
    iget v5, v2, Lr5;->t:I

    iput v5, v4, Lo6;->a:I

    .line 27
    iget-object v4, v2, Lr5;->e:Lm6;

    iput-object v12, v4, Lo6;->d:Lr5$b;

    .line 28
    iget v13, v2, Lr5;->u:I

    iput v13, v4, Lo6;->a:I

    .line 29
    sget-object v4, Lr5$b;->e:Lr5$b;

    if-eq v9, v4, :cond_e

    sget-object v14, Lr5$b;->b:Lr5$b;

    if-eq v9, v14, :cond_e

    sget-object v14, Lr5$b;->c:Lr5$b;

    if-ne v9, v14, :cond_f

    :cond_e
    if-eq v12, v4, :cond_23

    sget-object v14, Lr5$b;->b:Lr5$b;

    if-eq v12, v14, :cond_23

    sget-object v14, Lr5$b;->c:Lr5$b;

    if-ne v12, v14, :cond_f

    goto/16 :goto_3

    :cond_f
    const/high16 v14, 0x3f000000    # 0.5f

    if-ne v9, v6, :cond_17

    .line 30
    sget-object v15, Lr5$b;->c:Lr5$b;

    if-eq v12, v15, :cond_10

    sget-object v11, Lr5$b;->b:Lr5$b;

    if-ne v12, v11, :cond_17

    :cond_10
    if-ne v5, v8, :cond_12

    if-ne v12, v15, :cond_11

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    move-object v8, v15

    .line 31
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 32
    :cond_11
    invoke-virtual {v2}, Lr5;->v()I

    move-result v9

    int-to-float v3, v9

    .line 33
    iget v4, v2, Lr5;->a0:F

    mul-float/2addr v3, v4

    add-float/2addr v3, v14

    float-to-int v7, v3

    .line 34
    sget-object v8, Lr5$b;->b:Lr5$b;

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 35
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 36
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 37
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    :cond_12
    if-ne v5, v10, :cond_13

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    move-object v8, v12

    .line 38
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 39
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v2

    iput v2, v3, Lf6;->m:I

    goto/16 :goto_0

    :cond_13
    if-ne v5, v7, :cond_15

    .line 40
    iget-object v11, v0, Lr5;->W:[Lr5$b;

    aget-object v15, v11, v3

    sget-object v7, Lr5$b;->b:Lr5$b;

    if-eq v15, v7, :cond_14

    aget-object v11, v11, v3

    if-ne v11, v4, :cond_17

    .line 41
    :cond_14
    iget v3, v2, Lr5;->y:F

    .line 42
    invoke-virtual/range {p1 .. p1}, Lr5;->U()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    add-float/2addr v3, v14

    float-to-int v3, v3

    .line 43
    invoke-virtual {v2}, Lr5;->v()I

    move-result v9

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v7

    move v7, v3

    move-object v8, v12

    .line 44
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 45
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 46
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 47
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    .line 48
    :cond_15
    iget-object v7, v2, Lr5;->T:[Lq5;

    aget-object v11, v7, v3

    iget-object v11, v11, Lq5;->f:Lq5;

    if-eqz v11, :cond_16

    aget-object v7, v7, v10

    iget-object v7, v7, Lq5;->f:Lq5;

    if-nez v7, :cond_17

    :cond_16
    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    move-object v8, v12

    .line 49
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 50
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 51
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 52
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    :cond_17
    if-ne v12, v6, :cond_20

    .line 53
    sget-object v11, Lr5$b;->c:Lr5$b;

    if-eq v9, v11, :cond_18

    sget-object v7, Lr5$b;->b:Lr5$b;

    if-ne v9, v7, :cond_20

    :cond_18
    if-ne v13, v8, :cond_1b

    if-ne v9, v11, :cond_19

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v11

    move-object v8, v11

    .line 54
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 55
    :cond_19
    invoke-virtual {v2}, Lr5;->U()I

    move-result v7

    .line 56
    iget v3, v2, Lr5;->a0:F

    .line 57
    invoke-virtual {v2}, Lr5;->u()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1a

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v3, v4, v3

    :cond_1a
    int-to-float v4, v7

    mul-float/2addr v4, v3

    add-float/2addr v4, v14

    float-to-int v9, v4

    .line 58
    sget-object v8, Lr5$b;->b:Lr5$b;

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 59
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 60
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 61
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    :cond_1b
    if-ne v13, v10, :cond_1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v9

    move-object v8, v11

    move v9, v3

    .line 62
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 63
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v2

    iput v2, v3, Lf6;->m:I

    goto/16 :goto_0

    :cond_1c
    const/4 v7, 0x2

    if-ne v13, v7, :cond_1e

    .line 64
    iget-object v7, v0, Lr5;->W:[Lr5$b;

    aget-object v8, v7, v10

    sget-object v11, Lr5$b;->b:Lr5$b;

    if-eq v8, v11, :cond_1d

    aget-object v7, v7, v10

    if-ne v7, v4, :cond_20

    .line 65
    :cond_1d
    iget v3, v2, Lr5;->B:F

    .line 66
    invoke-virtual {v2}, Lr5;->U()I

    move-result v7

    .line 67
    invoke-virtual/range {p1 .. p1}, Lr5;->v()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    add-float/2addr v3, v14

    float-to-int v3, v3

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v9

    move-object v8, v11

    move v9, v3

    .line 68
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 69
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 70
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 71
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    .line 72
    :cond_1e
    iget-object v4, v2, Lr5;->T:[Lq5;

    const/4 v7, 0x2

    aget-object v15, v4, v7

    iget-object v7, v15, Lq5;->f:Lq5;

    if-eqz v7, :cond_1f

    aget-object v4, v4, v8

    iget-object v4, v4, Lq5;->f:Lq5;

    if-nez v4, :cond_20

    :cond_1f
    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v11

    move-object v8, v12

    .line 73
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 74
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 75
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 76
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    :cond_20
    if-ne v9, v6, :cond_0

    if-ne v12, v6, :cond_0

    if-eq v5, v10, :cond_22

    if-ne v13, v10, :cond_21

    goto :goto_2

    :cond_21
    const/4 v4, 0x2

    if-ne v13, v4, :cond_0

    if-ne v5, v4, :cond_0

    .line 77
    iget-object v4, v0, Lr5;->W:[Lr5$b;

    aget-object v3, v4, v3

    sget-object v8, Lr5$b;->b:Lr5$b;

    if-ne v3, v8, :cond_0

    aget-object v3, v4, v10

    if-ne v3, v8, :cond_0

    .line 78
    iget v3, v2, Lr5;->y:F

    .line 79
    iget v4, v2, Lr5;->B:F

    .line 80
    invoke-virtual/range {p1 .. p1}, Lr5;->U()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v3, v5

    add-float/2addr v3, v14

    float-to-int v7, v3

    .line 81
    invoke-virtual/range {p1 .. p1}, Lr5;->v()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v4, v3

    add-float/2addr v4, v14

    float-to-int v9, v4

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    .line 82
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 83
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 84
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 85
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    .line 86
    :cond_22
    :goto_2
    sget-object v8, Lr5$b;->c:Lr5$b;

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 87
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    iput v4, v3, Lf6;->m:I

    .line 88
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v2

    iput v2, v3, Lf6;->m:I

    goto/16 :goto_0

    .line 89
    :cond_23
    :goto_3
    invoke-virtual {v2}, Lr5;->U()I

    move-result v3

    if-ne v9, v4, :cond_24

    .line 90
    invoke-virtual/range {p1 .. p1}, Lr5;->U()I

    move-result v3

    iget-object v5, v2, Lr5;->L:Lq5;

    iget v5, v5, Lq5;->g:I

    sub-int/2addr v3, v5

    iget-object v5, v2, Lr5;->N:Lq5;

    iget v5, v5, Lq5;->g:I

    sub-int/2addr v3, v5

    .line 91
    sget-object v5, Lr5$b;->b:Lr5$b;

    move v7, v3

    move-object v6, v5

    goto :goto_4

    :cond_24
    move v7, v3

    move-object v6, v9

    .line 92
    :goto_4
    invoke-virtual {v2}, Lr5;->v()I

    move-result v3

    if-ne v12, v4, :cond_25

    .line 93
    invoke-virtual/range {p1 .. p1}, Lr5;->v()I

    move-result v3

    iget-object v4, v2, Lr5;->M:Lq5;

    iget v4, v4, Lq5;->g:I

    sub-int/2addr v3, v4

    iget-object v4, v2, Lr5;->O:Lq5;

    iget v4, v4, Lq5;->g:I

    sub-int/2addr v3, v4

    .line 94
    sget-object v4, Lr5$b;->b:Lr5$b;

    move v9, v3

    move-object v8, v4

    goto :goto_5

    :cond_25
    move v9, v3

    move-object v8, v12

    :goto_5
    move-object/from16 v4, p0

    move-object v5, v2

    .line 95
    invoke-virtual/range {v4 .. v9}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 96
    iget-object v3, v2, Lr5;->d:Lk6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->U()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 97
    iget-object v3, v2, Lr5;->e:Lm6;

    iget-object v3, v3, Lo6;->e:Lf6;

    invoke-virtual {v2}, Lr5;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lf6;->d(I)V

    .line 98
    iput-boolean v10, v2, Lr5;->a:Z

    goto/16 :goto_0

    :cond_26
    return v3
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld6;->e:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ld6;->d(Ljava/util/ArrayList;)V

    .line 2
    iget-object v0, p0, Ld6;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 3
    sput v0, Ll6;->d:I

    .line 4
    iget-object v1, p0, Ld6;->a:Ls5;

    iget-object v1, v1, Lr5;->d:Lk6;

    iget-object v2, p0, Ld6;->h:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v0, v2}, Ld6;->i(Lo6;ILjava/util/ArrayList;)V

    .line 5
    iget-object v1, p0, Ld6;->a:Ls5;

    iget-object v1, v1, Lr5;->e:Lm6;

    iget-object v2, p0, Ld6;->h:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v3, v2}, Ld6;->i(Lo6;ILjava/util/ArrayList;)V

    .line 6
    iput-boolean v0, p0, Ld6;->b:Z

    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo6;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 2
    iget-object v0, p0, Ld6;->d:Ls5;

    iget-object v0, v0, Lr5;->d:Lk6;

    invoke-virtual {v0}, Lk6;->f()V

    .line 3
    iget-object v0, p0, Ld6;->d:Ls5;

    iget-object v0, v0, Lr5;->e:Lm6;

    invoke-virtual {v0}, Lm6;->f()V

    .line 4
    iget-object v0, p0, Ld6;->d:Ls5;

    iget-object v0, v0, Lr5;->d:Lk6;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Ld6;->d:Ls5;

    iget-object v0, v0, Lr5;->e:Lm6;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Ld6;->d:Ls5;

    iget-object v0, v0, Ly5;->v0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr5;

    .line 7
    instance-of v3, v2, Lt5;

    if-eqz v3, :cond_1

    .line 8
    new-instance v3, Li6;

    invoke-direct {v3, v2}, Li6;-><init>(Lr5;)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v2}, Lr5;->g0()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 10
    iget-object v3, v2, Lr5;->b:Lb6;

    if-nez v3, :cond_2

    .line 11
    new-instance v3, Lb6;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lb6;-><init>(Lr5;I)V

    iput-object v3, v2, Lr5;->b:Lb6;

    :cond_2
    if-nez v1, :cond_3

    .line 12
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 13
    :cond_3
    iget-object v3, v2, Lr5;->b:Lb6;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 14
    :cond_4
    iget-object v3, v2, Lr5;->d:Lk6;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    :goto_1
    invoke-virtual {v2}, Lr5;->i0()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 16
    iget-object v3, v2, Lr5;->c:Lb6;

    if-nez v3, :cond_5

    .line 17
    new-instance v3, Lb6;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lb6;-><init>(Lr5;I)V

    iput-object v3, v2, Lr5;->c:Lb6;

    :cond_5
    if-nez v1, :cond_6

    .line 18
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 19
    :cond_6
    iget-object v3, v2, Lr5;->c:Lb6;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 20
    :cond_7
    iget-object v3, v2, Lr5;->e:Lm6;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    :goto_2
    instance-of v3, v2, Lv5;

    if-eqz v3, :cond_0

    .line 22
    new-instance v3, Lj6;

    invoke-direct {v3, v2}, Lj6;-><init>(Lr5;)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    if-eqz v1, :cond_9

    .line 23
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 24
    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo6;

    .line 25
    invoke-virtual {v1}, Lo6;->f()V

    goto :goto_3

    .line 26
    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo6;

    .line 27
    iget-object v1, v0, Lo6;->b:Lr5;

    iget-object v2, p0, Ld6;->d:Ls5;

    if-ne v1, v2, :cond_b

    goto :goto_4

    .line 28
    :cond_b
    invoke-virtual {v0}, Lo6;->d()V

    goto :goto_4

    :cond_c
    return-void
.end method

.method public final e(Ls5;I)I
    .locals 6

    .line 1
    iget-object v0, p0, Ld6;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 2
    iget-object v4, p0, Ld6;->h:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll6;

    .line 3
    invoke-virtual {v4, p1, p2}, Ll6;->b(Ls5;I)J

    move-result-wide v4

    .line 4
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    long-to-int p1, v1

    return p1
.end method

.method public f(Z)Z
    .locals 9

    const/4 v0, 0x1

    and-int/2addr p1, v0

    .line 1
    iget-boolean v1, p0, Ld6;->b:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ld6;->c:Z

    if-eqz v1, :cond_2

    .line 2
    :cond_0
    iget-object v1, p0, Ld6;->a:Ls5;

    iget-object v1, v1, Ly5;->v0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr5;

    .line 3
    invoke-virtual {v3}, Lr5;->l()V

    .line 4
    iput-boolean v2, v3, Lr5;->a:Z

    .line 5
    iget-object v4, v3, Lr5;->d:Lk6;

    invoke-virtual {v4}, Lk6;->r()V

    .line 6
    iget-object v3, v3, Lr5;->e:Lm6;

    invoke-virtual {v3}, Lm6;->q()V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, p0, Ld6;->a:Ls5;

    invoke-virtual {v1}, Lr5;->l()V

    .line 8
    iget-object v1, p0, Ld6;->a:Ls5;

    iput-boolean v2, v1, Lr5;->a:Z

    .line 9
    iget-object v1, v1, Lr5;->d:Lk6;

    invoke-virtual {v1}, Lk6;->r()V

    .line 10
    iget-object v1, p0, Ld6;->a:Ls5;

    iget-object v1, v1, Lr5;->e:Lm6;

    invoke-virtual {v1}, Lm6;->q()V

    .line 11
    iput-boolean v2, p0, Ld6;->c:Z

    .line 12
    :cond_2
    iget-object v1, p0, Ld6;->d:Ls5;

    invoke-virtual {p0, v1}, Ld6;->b(Ls5;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v2

    .line 13
    :cond_3
    iget-object v1, p0, Ld6;->a:Ls5;

    invoke-virtual {v1, v2}, Lr5;->j1(I)V

    .line 14
    iget-object v1, p0, Ld6;->a:Ls5;

    invoke-virtual {v1, v2}, Lr5;->k1(I)V

    .line 15
    iget-object v1, p0, Ld6;->a:Ls5;

    invoke-virtual {v1, v2}, Lr5;->s(I)Lr5$b;

    move-result-object v1

    .line 16
    iget-object v3, p0, Ld6;->a:Ls5;

    invoke-virtual {v3, v0}, Lr5;->s(I)Lr5$b;

    move-result-object v3

    .line 17
    iget-boolean v4, p0, Ld6;->b:Z

    if-eqz v4, :cond_4

    .line 18
    invoke-virtual {p0}, Ld6;->c()V

    .line 19
    :cond_4
    iget-object v4, p0, Ld6;->a:Ls5;

    invoke-virtual {v4}, Lr5;->V()I

    move-result v4

    .line 20
    iget-object v5, p0, Ld6;->a:Ls5;

    invoke-virtual {v5}, Lr5;->W()I

    move-result v5

    .line 21
    iget-object v6, p0, Ld6;->a:Ls5;

    iget-object v6, v6, Lr5;->d:Lk6;

    iget-object v6, v6, Lo6;->h:Le6;

    invoke-virtual {v6, v4}, Le6;->d(I)V

    .line 22
    iget-object v6, p0, Ld6;->a:Ls5;

    iget-object v6, v6, Lr5;->e:Lm6;

    iget-object v6, v6, Lo6;->h:Le6;

    invoke-virtual {v6, v5}, Le6;->d(I)V

    .line 23
    invoke-virtual {p0}, Ld6;->m()V

    .line 24
    sget-object v6, Lr5$b;->c:Lr5$b;

    if-eq v1, v6, :cond_5

    if-ne v3, v6, :cond_9

    :cond_5
    if-eqz p1, :cond_7

    .line 25
    iget-object v6, p0, Ld6;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo6;

    .line 26
    invoke-virtual {v7}, Lo6;->m()Z

    move-result v7

    if-nez v7, :cond_6

    move p1, v2

    :cond_7
    if-eqz p1, :cond_8

    .line 27
    sget-object v6, Lr5$b;->c:Lr5$b;

    if-ne v1, v6, :cond_8

    .line 28
    iget-object v6, p0, Ld6;->a:Ls5;

    sget-object v7, Lr5$b;->b:Lr5$b;

    invoke-virtual {v6, v7}, Lr5;->M0(Lr5$b;)V

    .line 29
    iget-object v6, p0, Ld6;->a:Ls5;

    invoke-virtual {p0, v6, v2}, Ld6;->e(Ls5;I)I

    move-result v7

    invoke-virtual {v6, v7}, Lr5;->h1(I)V

    .line 30
    iget-object v6, p0, Ld6;->a:Ls5;

    iget-object v7, v6, Lr5;->d:Lk6;

    iget-object v7, v7, Lo6;->e:Lf6;

    invoke-virtual {v6}, Lr5;->U()I

    move-result v6

    invoke-virtual {v7, v6}, Lf6;->d(I)V

    :cond_8
    if-eqz p1, :cond_9

    .line 31
    sget-object p1, Lr5$b;->c:Lr5$b;

    if-ne v3, p1, :cond_9

    .line 32
    iget-object p1, p0, Ld6;->a:Ls5;

    sget-object v6, Lr5$b;->b:Lr5$b;

    invoke-virtual {p1, v6}, Lr5;->d1(Lr5$b;)V

    .line 33
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p0, p1, v0}, Ld6;->e(Ls5;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lr5;->I0(I)V

    .line 34
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object v6, p1, Lr5;->e:Lm6;

    iget-object v6, v6, Lo6;->e:Lf6;

    invoke-virtual {p1}, Lr5;->v()I

    move-result p1

    invoke-virtual {v6, p1}, Lf6;->d(I)V

    .line 35
    :cond_9
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object v6, p1, Lr5;->W:[Lr5$b;

    aget-object v7, v6, v2

    sget-object v8, Lr5$b;->b:Lr5$b;

    if-eq v7, v8, :cond_b

    aget-object v6, v6, v2

    sget-object v7, Lr5$b;->e:Lr5$b;

    if-ne v6, v7, :cond_a

    goto :goto_1

    :cond_a
    move p1, v2

    goto :goto_2

    .line 36
    :cond_b
    :goto_1
    invoke-virtual {p1}, Lr5;->U()I

    move-result p1

    add-int/2addr p1, v4

    .line 37
    iget-object v6, p0, Ld6;->a:Ls5;

    iget-object v6, v6, Lr5;->d:Lk6;

    iget-object v6, v6, Lo6;->i:Le6;

    invoke-virtual {v6, p1}, Le6;->d(I)V

    .line 38
    iget-object v6, p0, Ld6;->a:Ls5;

    iget-object v6, v6, Lr5;->d:Lk6;

    iget-object v6, v6, Lo6;->e:Lf6;

    sub-int/2addr p1, v4

    invoke-virtual {v6, p1}, Lf6;->d(I)V

    .line 39
    invoke-virtual {p0}, Ld6;->m()V

    .line 40
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object v4, p1, Lr5;->W:[Lr5$b;

    aget-object v6, v4, v0

    if-eq v6, v8, :cond_c

    aget-object v4, v4, v0

    sget-object v6, Lr5$b;->e:Lr5$b;

    if-ne v4, v6, :cond_d

    .line 41
    :cond_c
    invoke-virtual {p1}, Lr5;->v()I

    move-result p1

    add-int/2addr p1, v5

    .line 42
    iget-object v4, p0, Ld6;->a:Ls5;

    iget-object v4, v4, Lr5;->e:Lm6;

    iget-object v4, v4, Lo6;->i:Le6;

    invoke-virtual {v4, p1}, Le6;->d(I)V

    .line 43
    iget-object v4, p0, Ld6;->a:Ls5;

    iget-object v4, v4, Lr5;->e:Lm6;

    iget-object v4, v4, Lo6;->e:Lf6;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Lf6;->d(I)V

    .line 44
    :cond_d
    invoke-virtual {p0}, Ld6;->m()V

    move p1, v0

    .line 45
    :goto_2
    iget-object v4, p0, Ld6;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo6;

    .line 46
    iget-object v6, v5, Lo6;->b:Lr5;

    iget-object v7, p0, Ld6;->a:Ls5;

    if-ne v6, v7, :cond_e

    iget-boolean v6, v5, Lo6;->g:Z

    if-nez v6, :cond_e

    goto :goto_3

    .line 47
    :cond_e
    invoke-virtual {v5}, Lo6;->e()V

    goto :goto_3

    .line 48
    :cond_f
    iget-object v4, p0, Ld6;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_10
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo6;

    if-nez p1, :cond_11

    .line 49
    iget-object v6, v5, Lo6;->b:Lr5;

    iget-object v7, p0, Ld6;->a:Ls5;

    if-ne v6, v7, :cond_11

    goto :goto_4

    .line 50
    :cond_11
    iget-object v6, v5, Lo6;->h:Le6;

    iget-boolean v6, v6, Le6;->j:Z

    if-nez v6, :cond_12

    :goto_5
    move v0, v2

    goto :goto_6

    .line 51
    :cond_12
    iget-object v6, v5, Lo6;->i:Le6;

    iget-boolean v6, v6, Le6;->j:Z

    if-nez v6, :cond_13

    instance-of v6, v5, Li6;

    if-nez v6, :cond_13

    goto :goto_5

    .line 52
    :cond_13
    iget-object v6, v5, Lo6;->e:Lf6;

    iget-boolean v6, v6, Le6;->j:Z

    if-nez v6, :cond_10

    instance-of v6, v5, Lb6;

    if-nez v6, :cond_10

    instance-of v5, v5, Li6;

    if-nez v5, :cond_10

    goto :goto_5

    .line 53
    :cond_14
    :goto_6
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p1, v1}, Lr5;->M0(Lr5$b;)V

    .line 54
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p1, v3}, Lr5;->d1(Lr5$b;)V

    return v0
.end method

.method public g(Z)Z
    .locals 4

    .line 1
    iget-boolean p1, p0, Ld6;->b:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object p1, p1, Ly5;->v0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr5;

    .line 3
    invoke-virtual {v1}, Lr5;->l()V

    .line 4
    iput-boolean v0, v1, Lr5;->a:Z

    .line 5
    iget-object v2, v1, Lr5;->d:Lk6;

    iget-object v3, v2, Lo6;->e:Lf6;

    iput-boolean v0, v3, Le6;->j:Z

    .line 6
    iput-boolean v0, v2, Lo6;->g:Z

    .line 7
    invoke-virtual {v2}, Lk6;->r()V

    .line 8
    iget-object v1, v1, Lr5;->e:Lm6;

    iget-object v2, v1, Lo6;->e:Lf6;

    iput-boolean v0, v2, Le6;->j:Z

    .line 9
    iput-boolean v0, v1, Lo6;->g:Z

    .line 10
    invoke-virtual {v1}, Lm6;->q()V

    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p1}, Lr5;->l()V

    .line 12
    iget-object p1, p0, Ld6;->a:Ls5;

    iput-boolean v0, p1, Lr5;->a:Z

    .line 13
    iget-object p1, p1, Lr5;->d:Lk6;

    iget-object v1, p1, Lo6;->e:Lf6;

    iput-boolean v0, v1, Le6;->j:Z

    .line 14
    iput-boolean v0, p1, Lo6;->g:Z

    .line 15
    invoke-virtual {p1}, Lk6;->r()V

    .line 16
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object p1, p1, Lr5;->e:Lm6;

    iget-object v1, p1, Lo6;->e:Lf6;

    iput-boolean v0, v1, Le6;->j:Z

    .line 17
    iput-boolean v0, p1, Lo6;->g:Z

    .line 18
    invoke-virtual {p1}, Lm6;->q()V

    .line 19
    invoke-virtual {p0}, Ld6;->c()V

    .line 20
    :cond_1
    iget-object p1, p0, Ld6;->d:Ls5;

    invoke-virtual {p0, p1}, Ld6;->b(Ls5;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    .line 21
    :cond_2
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p1, v0}, Lr5;->j1(I)V

    .line 22
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p1, v0}, Lr5;->k1(I)V

    .line 23
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object p1, p1, Lr5;->d:Lk6;

    iget-object p1, p1, Lo6;->h:Le6;

    invoke-virtual {p1, v0}, Le6;->d(I)V

    .line 24
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object p1, p1, Lr5;->e:Lm6;

    iget-object p1, p1, Lo6;->h:Le6;

    invoke-virtual {p1, v0}, Le6;->d(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public h(ZI)Z
    .locals 9

    const/4 v0, 0x1

    and-int/2addr p1, v0

    .line 1
    iget-object v1, p0, Ld6;->a:Ls5;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lr5;->s(I)Lr5$b;

    move-result-object v1

    .line 2
    iget-object v3, p0, Ld6;->a:Ls5;

    invoke-virtual {v3, v0}, Lr5;->s(I)Lr5$b;

    move-result-object v3

    .line 3
    iget-object v4, p0, Ld6;->a:Ls5;

    invoke-virtual {v4}, Lr5;->V()I

    move-result v4

    .line 4
    iget-object v5, p0, Ld6;->a:Ls5;

    invoke-virtual {v5}, Lr5;->W()I

    move-result v5

    if-eqz p1, :cond_4

    .line 5
    sget-object v6, Lr5$b;->c:Lr5$b;

    if-eq v1, v6, :cond_0

    if-ne v3, v6, :cond_4

    .line 6
    :cond_0
    iget-object v6, p0, Ld6;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo6;

    .line 7
    iget v8, v7, Lo6;->f:I

    if-ne v8, p2, :cond_1

    .line 8
    invoke-virtual {v7}, Lo6;->m()Z

    move-result v7

    if-nez v7, :cond_1

    move p1, v2

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    .line 9
    sget-object p1, Lr5$b;->c:Lr5$b;

    if-ne v1, p1, :cond_4

    .line 10
    iget-object p1, p0, Ld6;->a:Ls5;

    sget-object v6, Lr5$b;->b:Lr5$b;

    invoke-virtual {p1, v6}, Lr5;->M0(Lr5$b;)V

    .line 11
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p0, p1, v2}, Ld6;->e(Ls5;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lr5;->h1(I)V

    .line 12
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object v6, p1, Lr5;->d:Lk6;

    iget-object v6, v6, Lo6;->e:Lf6;

    invoke-virtual {p1}, Lr5;->U()I

    move-result p1

    invoke-virtual {v6, p1}, Lf6;->d(I)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    .line 13
    sget-object p1, Lr5$b;->c:Lr5$b;

    if-ne v3, p1, :cond_4

    .line 14
    iget-object p1, p0, Ld6;->a:Ls5;

    sget-object v6, Lr5$b;->b:Lr5$b;

    invoke-virtual {p1, v6}, Lr5;->d1(Lr5$b;)V

    .line 15
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p0, p1, v0}, Ld6;->e(Ls5;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lr5;->I0(I)V

    .line 16
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object v6, p1, Lr5;->e:Lm6;

    iget-object v6, v6, Lo6;->e:Lf6;

    invoke-virtual {p1}, Lr5;->v()I

    move-result p1

    invoke-virtual {v6, p1}, Lf6;->d(I)V

    :cond_4
    :goto_0
    if-nez p2, :cond_6

    .line 17
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object v5, p1, Lr5;->W:[Lr5$b;

    aget-object v6, v5, v2

    sget-object v7, Lr5$b;->b:Lr5$b;

    if-eq v6, v7, :cond_5

    aget-object v5, v5, v2

    sget-object v6, Lr5$b;->e:Lr5$b;

    if-ne v5, v6, :cond_7

    .line 18
    :cond_5
    invoke-virtual {p1}, Lr5;->U()I

    move-result p1

    add-int/2addr p1, v4

    .line 19
    iget-object v5, p0, Ld6;->a:Ls5;

    iget-object v5, v5, Lr5;->d:Lk6;

    iget-object v5, v5, Lo6;->i:Le6;

    invoke-virtual {v5, p1}, Le6;->d(I)V

    .line 20
    iget-object v5, p0, Ld6;->a:Ls5;

    iget-object v5, v5, Lr5;->d:Lk6;

    iget-object v5, v5, Lo6;->e:Lf6;

    sub-int/2addr p1, v4

    invoke-virtual {v5, p1}, Lf6;->d(I)V

    goto :goto_2

    .line 21
    :cond_6
    iget-object p1, p0, Ld6;->a:Ls5;

    iget-object v4, p1, Lr5;->W:[Lr5$b;

    aget-object v6, v4, v0

    sget-object v7, Lr5$b;->b:Lr5$b;

    if-eq v6, v7, :cond_8

    aget-object v4, v4, v0

    sget-object v6, Lr5$b;->e:Lr5$b;

    if-ne v4, v6, :cond_7

    goto :goto_1

    :cond_7
    move p1, v2

    goto :goto_3

    .line 22
    :cond_8
    :goto_1
    invoke-virtual {p1}, Lr5;->v()I

    move-result p1

    add-int/2addr p1, v5

    .line 23
    iget-object v4, p0, Ld6;->a:Ls5;

    iget-object v4, v4, Lr5;->e:Lm6;

    iget-object v4, v4, Lo6;->i:Le6;

    invoke-virtual {v4, p1}, Le6;->d(I)V

    .line 24
    iget-object v4, p0, Ld6;->a:Ls5;

    iget-object v4, v4, Lr5;->e:Lm6;

    iget-object v4, v4, Lo6;->e:Lf6;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Lf6;->d(I)V

    :goto_2
    move p1, v0

    .line 25
    :goto_3
    invoke-virtual {p0}, Ld6;->m()V

    .line 26
    iget-object v4, p0, Ld6;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo6;

    .line 27
    iget v6, v5, Lo6;->f:I

    if-eq v6, p2, :cond_9

    goto :goto_4

    .line 28
    :cond_9
    iget-object v6, v5, Lo6;->b:Lr5;

    iget-object v7, p0, Ld6;->a:Ls5;

    if-ne v6, v7, :cond_a

    iget-boolean v6, v5, Lo6;->g:Z

    if-nez v6, :cond_a

    goto :goto_4

    .line 29
    :cond_a
    invoke-virtual {v5}, Lo6;->e()V

    goto :goto_4

    .line 30
    :cond_b
    iget-object v4, p0, Ld6;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo6;

    .line 31
    iget v6, v5, Lo6;->f:I

    if-eq v6, p2, :cond_d

    goto :goto_5

    :cond_d
    if-nez p1, :cond_e

    .line 32
    iget-object v6, v5, Lo6;->b:Lr5;

    iget-object v7, p0, Ld6;->a:Ls5;

    if-ne v6, v7, :cond_e

    goto :goto_5

    .line 33
    :cond_e
    iget-object v6, v5, Lo6;->h:Le6;

    iget-boolean v6, v6, Le6;->j:Z

    if-nez v6, :cond_f

    :goto_6
    move v0, v2

    goto :goto_7

    .line 34
    :cond_f
    iget-object v6, v5, Lo6;->i:Le6;

    iget-boolean v6, v6, Le6;->j:Z

    if-nez v6, :cond_10

    goto :goto_6

    .line 35
    :cond_10
    instance-of v6, v5, Lb6;

    if-nez v6, :cond_c

    iget-object v5, v5, Lo6;->e:Lf6;

    iget-boolean v5, v5, Le6;->j:Z

    if-nez v5, :cond_c

    goto :goto_6

    .line 36
    :cond_11
    :goto_7
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p1, v1}, Lr5;->M0(Lr5$b;)V

    .line 37
    iget-object p1, p0, Ld6;->a:Ls5;

    invoke-virtual {p1, v3}, Lr5;->d1(Lr5$b;)V

    return v0
.end method

.method public final i(Lo6;ILjava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo6;",
            "I",
            "Ljava/util/ArrayList<",
            "Ll6;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lo6;->h:Le6;

    iget-object v0, v0, Le6;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc6;

    .line 2
    instance-of v2, v1, Le6;

    if-eqz v2, :cond_1

    .line 3
    move-object v4, v1

    check-cast v4, Le6;

    const/4 v6, 0x0

    .line 4
    iget-object v7, p1, Lo6;->i:Le6;

    const/4 v9, 0x0

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-virtual/range {v3 .. v9}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_0

    .line 5
    :cond_1
    instance-of v2, v1, Lo6;

    if-eqz v2, :cond_0

    .line 6
    check-cast v1, Lo6;

    .line 7
    iget-object v3, v1, Lo6;->h:Le6;

    const/4 v5, 0x0

    iget-object v6, p1, Lo6;->i:Le6;

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-virtual/range {v2 .. v8}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p1, Lo6;->i:Le6;

    iget-object v0, v0, Le6;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc6;

    .line 9
    instance-of v2, v1, Le6;

    if-eqz v2, :cond_4

    .line 10
    move-object v4, v1

    check-cast v4, Le6;

    const/4 v6, 0x1

    .line 11
    iget-object v7, p1, Lo6;->h:Le6;

    const/4 v9, 0x0

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-virtual/range {v3 .. v9}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_1

    .line 12
    :cond_4
    instance-of v2, v1, Lo6;

    if-eqz v2, :cond_3

    .line 13
    check-cast v1, Lo6;

    .line 14
    iget-object v3, v1, Lo6;->i:Le6;

    const/4 v5, 0x1

    iget-object v6, p1, Lo6;->h:Le6;

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-virtual/range {v2 .. v8}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_7

    .line 15
    check-cast p1, Lm6;

    iget-object p1, p1, Lm6;->k:Le6;

    iget-object p1, p1, Le6;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc6;

    .line 16
    instance-of v1, v0, Le6;

    if-eqz v1, :cond_6

    .line 17
    move-object v3, v0

    check-cast v3, Le6;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    .line 18
    invoke-virtual/range {v2 .. v8}, Ld6;->a(Le6;IILe6;Ljava/util/ArrayList;Ll6;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Ld6;->b:Z

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Ld6;->c:Z

    return-void
.end method

.method public final l(Lr5;Lr5$b;ILr5$b;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld6;->g:La6$a;

    iput-object p2, v0, La6$a;->a:Lr5$b;

    .line 2
    iput-object p4, v0, La6$a;->b:Lr5$b;

    .line 3
    iput p3, v0, La6$a;->c:I

    .line 4
    iput p5, v0, La6$a;->d:I

    .line 5
    iget-object p2, p0, Ld6;->f:La6$b;

    invoke-interface {p2, p1, v0}, La6$b;->b(Lr5;La6$a;)V

    .line 6
    iget-object p2, p0, Ld6;->g:La6$a;

    iget p2, p2, La6$a;->e:I

    invoke-virtual {p1, p2}, Lr5;->h1(I)V

    .line 7
    iget-object p2, p0, Ld6;->g:La6$a;

    iget p2, p2, La6$a;->f:I

    invoke-virtual {p1, p2}, Lr5;->I0(I)V

    .line 8
    iget-object p2, p0, Ld6;->g:La6$a;

    iget-boolean p2, p2, La6$a;->h:Z

    invoke-virtual {p1, p2}, Lr5;->H0(Z)V

    .line 9
    iget-object p2, p0, Ld6;->g:La6$a;

    iget p2, p2, La6$a;->g:I

    invoke-virtual {p1, p2}, Lr5;->x0(I)V

    return-void
.end method

.method public m()V
    .locals 12

    .line 1
    iget-object v0, p0, Ld6;->a:Ls5;

    iget-object v0, v0, Ly5;->v0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr5;

    .line 2
    iget-boolean v2, v1, Lr5;->a:Z

    if-eqz v2, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v2, v1, Lr5;->W:[Lr5$b;

    const/4 v3, 0x0

    aget-object v8, v2, v3

    const/4 v9, 0x1

    .line 4
    aget-object v10, v2, v9

    .line 5
    iget v2, v1, Lr5;->t:I

    .line 6
    iget v4, v1, Lr5;->u:I

    .line 7
    sget-object v6, Lr5$b;->c:Lr5$b;

    if-eq v8, v6, :cond_3

    sget-object v5, Lr5$b;->d:Lr5$b;

    if-ne v8, v5, :cond_2

    if-ne v2, v9, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v9

    :goto_2
    if-eq v10, v6, :cond_4

    .line 8
    sget-object v5, Lr5$b;->d:Lr5$b;

    if-ne v10, v5, :cond_5

    if-ne v4, v9, :cond_5

    :cond_4
    move v3, v9

    .line 9
    :cond_5
    iget-object v4, v1, Lr5;->d:Lk6;

    iget-object v4, v4, Lo6;->e:Lf6;

    iget-boolean v5, v4, Le6;->j:Z

    .line 10
    iget-object v7, v1, Lr5;->e:Lm6;

    iget-object v7, v7, Lo6;->e:Lf6;

    iget-boolean v11, v7, Le6;->j:Z

    if-eqz v5, :cond_6

    if-eqz v11, :cond_6

    .line 11
    sget-object v6, Lr5$b;->b:Lr5$b;

    iget v5, v4, Le6;->g:I

    iget v7, v7, Le6;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    invoke-virtual/range {v2 .. v7}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 12
    iput-boolean v9, v1, Lr5;->a:Z

    goto :goto_3

    :cond_6
    if-eqz v5, :cond_8

    if-eqz v3, :cond_8

    .line 13
    sget-object v5, Lr5$b;->b:Lr5$b;

    iget v8, v4, Le6;->g:I

    iget v7, v7, Le6;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v5

    move v5, v8

    invoke-virtual/range {v2 .. v7}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 14
    sget-object v2, Lr5$b;->d:Lr5$b;

    if-ne v10, v2, :cond_7

    .line 15
    iget-object v2, v1, Lr5;->e:Lm6;

    iget-object v2, v2, Lo6;->e:Lf6;

    invoke-virtual {v1}, Lr5;->v()I

    move-result v3

    iput v3, v2, Lf6;->m:I

    goto :goto_3

    .line 16
    :cond_7
    iget-object v2, v1, Lr5;->e:Lm6;

    iget-object v2, v2, Lo6;->e:Lf6;

    invoke-virtual {v1}, Lr5;->v()I

    move-result v3

    invoke-virtual {v2, v3}, Lf6;->d(I)V

    .line 17
    iput-boolean v9, v1, Lr5;->a:Z

    goto :goto_3

    :cond_8
    if-eqz v11, :cond_a

    if-eqz v2, :cond_a

    .line 18
    iget v5, v4, Le6;->g:I

    sget-object v10, Lr5$b;->b:Lr5$b;

    iget v7, v7, Le6;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    move-object v6, v10

    invoke-virtual/range {v2 .. v7}, Ld6;->l(Lr5;Lr5$b;ILr5$b;I)V

    .line 19
    sget-object v2, Lr5$b;->d:Lr5$b;

    if-ne v8, v2, :cond_9

    .line 20
    iget-object v2, v1, Lr5;->d:Lk6;

    iget-object v2, v2, Lo6;->e:Lf6;

    invoke-virtual {v1}, Lr5;->U()I

    move-result v3

    iput v3, v2, Lf6;->m:I

    goto :goto_3

    .line 21
    :cond_9
    iget-object v2, v1, Lr5;->d:Lk6;

    iget-object v2, v2, Lo6;->e:Lf6;

    invoke-virtual {v1}, Lr5;->U()I

    move-result v3

    invoke-virtual {v2, v3}, Lf6;->d(I)V

    .line 22
    iput-boolean v9, v1, Lr5;->a:Z

    .line 23
    :cond_a
    :goto_3
    iget-boolean v2, v1, Lr5;->a:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lr5;->e:Lm6;

    iget-object v2, v2, Lm6;->l:Lf6;

    if-eqz v2, :cond_0

    .line 24
    invoke-virtual {v1}, Lr5;->n()I

    move-result v1

    invoke-virtual {v2, v1}, Lf6;->d(I)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public n(La6$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld6;->f:La6$b;

    return-void
.end method
