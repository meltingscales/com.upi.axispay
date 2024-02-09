.class public Ld7;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "AxisPay"

# interfaces
.implements Lrb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7$f;,
        Ld7$c;,
        Ld7$d;,
        Ld7$e;,
        Ld7$g;
    }
.end annotation


# static fields
.field public static B0:Z


# instance fields
.field public A:I

.field public A0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public F:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "La7;",
            ">;"
        }
    .end annotation
.end field

.field public G:J

.field public H:F

.field public I:F

.field public J:F

.field public K:J

.field public L:F

.field public M:Z

.field public N:Z

.field public O:Ld7$f;

.field public P:I

.field public Q:Ld7$c;

.field public R:Z

.field public S:Lq6;

.field public T:Lv6;

.field public U:I

.field public V:I

.field public W:Z

.field public a0:F

.field public b0:F

.field public c0:J

.field public d0:F

.field public e0:Z

.field public f0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb7;",
            ">;"
        }
    .end annotation
.end field

.field public g0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb7;",
            ">;"
        }
    .end annotation
.end field

.field public h0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb7;",
            ">;"
        }
    .end annotation
.end field

.field public i0:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Ld7$f;",
            ">;"
        }
    .end annotation
.end field

.field public j0:I

.field public k0:J

.field public l0:F

.field public m0:I

.field public n0:F

.field public o0:Z

.field public p0:F

.field public q0:Li5;

.field public r0:Z

.field public s0:Ld7$e;

.field public t0:Ljava/lang/Runnable;

.field public u0:[I

.field public v:Lf7;

.field public v0:I

.field public w:Landroid/view/animation/Interpolator;

.field public w0:Z

.field public x:Landroid/view/animation/Interpolator;

.field public x0:Ld7$g;

.field public y:F

.field public y0:Ld7$d;

.field public z:I

.field public z0:Z


# direct methods
.method public static synthetic B(Ld7;)Ld7$e;
    .locals 0

    .line 1
    iget-object p0, p0, Ld7;->s0:Ld7$e;

    return-object p0
.end method

.method public static synthetic C(Ld7;)I
    .locals 0

    .line 1
    iget p0, p0, Ld7;->B:I

    return p0
.end method

.method public static synthetic D(Ld7;)I
    .locals 0

    .line 1
    iget p0, p0, Ld7;->z:I

    return p0
.end method


# virtual methods
.method public E(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Ld7;->J:F

    iget v2, p0, Ld7;->I:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ld7;->M:Z

    if-eqz v1, :cond_1

    .line 3
    iput v2, p0, Ld7;->J:F

    .line 4
    :cond_1
    iget v1, p0, Ld7;->J:F

    cmpl-float v1, v1, p1

    if-nez v1, :cond_2

    return-void

    :cond_2
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Ld7;->R:Z

    .line 6
    iput p1, p0, Ld7;->L:F

    .line 7
    invoke-virtual {v0}, Lf7;->e()I

    const/4 p1, 0x0

    throw p1
.end method

.method public F(Z)V
    .locals 23

    move-object/from16 v0, p0

    .line 1
    iget-wide v1, v0, Ld7;->K:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 2
    invoke-virtual/range {p0 .. p0}, Ld7;->getNanoTime()J

    move-result-wide v1

    iput-wide v1, v0, Ld7;->K:J

    .line 3
    :cond_0
    iget v1, v0, Ld7;->J:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    const/4 v4, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    if-lez v3, :cond_1

    cmpg-float v3, v1, v5

    if-gez v3, :cond_1

    .line 4
    iput v4, v0, Ld7;->A:I

    .line 5
    :cond_1
    iget-boolean v3, v0, Ld7;->e0:Z

    const/4 v7, 0x0

    if-nez v3, :cond_3

    iget-boolean v3, v0, Ld7;->N:Z

    if-eqz v3, :cond_2

    if-nez p1, :cond_3

    iget v3, v0, Ld7;->L:F

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x1

    goto/16 :goto_f

    .line 6
    :cond_3
    :goto_0
    iget v3, v0, Ld7;->L:F

    sub-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v1

    .line 7
    invoke-virtual/range {p0 .. p0}, Ld7;->getNanoTime()J

    move-result-wide v8

    .line 8
    iget-object v3, v0, Ld7;->w:Landroid/view/animation/Interpolator;

    instance-of v10, v3, Lc7;

    const v11, 0x3089705f    # 1.0E-9f

    if-nez v10, :cond_4

    .line 9
    iget-wide v12, v0, Ld7;->K:J

    sub-long v12, v8, v12

    long-to-float v10, v12

    mul-float/2addr v10, v1

    mul-float/2addr v10, v11

    iget v12, v0, Ld7;->H:F

    div-float/2addr v10, v12

    goto :goto_1

    :cond_4
    move v10, v2

    .line 10
    :goto_1
    iget v12, v0, Ld7;->J:F

    add-float/2addr v12, v10

    .line 11
    iget-boolean v13, v0, Ld7;->M:Z

    if-eqz v13, :cond_5

    .line 12
    iget v12, v0, Ld7;->L:F

    :cond_5
    cmpl-float v13, v1, v2

    if-lez v13, :cond_6

    .line 13
    iget v14, v0, Ld7;->L:F

    cmpl-float v14, v12, v14

    if-gez v14, :cond_7

    :cond_6
    cmpg-float v14, v1, v2

    if-gtz v14, :cond_8

    iget v14, v0, Ld7;->L:F

    cmpg-float v14, v12, v14

    if-gtz v14, :cond_8

    .line 14
    :cond_7
    iget v12, v0, Ld7;->L:F

    .line 15
    iput-boolean v7, v0, Ld7;->N:Z

    const/4 v14, 0x1

    goto :goto_2

    :cond_8
    move v14, v7

    .line 16
    :goto_2
    iput v12, v0, Ld7;->J:F

    .line 17
    iput v12, v0, Ld7;->I:F

    .line 18
    iput-wide v8, v0, Ld7;->K:J

    const v15, 0x3727c5ac    # 1.0E-5f

    const/16 v16, 0x0

    if-eqz v3, :cond_e

    if-nez v14, :cond_e

    .line 19
    iget-boolean v14, v0, Ld7;->R:Z

    if-eqz v14, :cond_b

    .line 20
    iget-wide v6, v0, Ld7;->G:J

    sub-long v6, v8, v6

    long-to-float v6, v6

    mul-float/2addr v6, v11

    .line 21
    invoke-interface {v3, v6}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    .line 22
    iget-object v6, v0, Ld7;->w:Landroid/view/animation/Interpolator;

    iget-object v7, v0, Ld7;->S:Lq6;

    if-eq v6, v7, :cond_a

    .line 23
    iput v3, v0, Ld7;->J:F

    .line 24
    iput-wide v8, v0, Ld7;->K:J

    .line 25
    instance-of v7, v6, Lc7;

    if-eqz v7, :cond_d

    .line 26
    check-cast v6, Lc7;

    invoke-virtual {v6}, Lc7;->a()F

    move-result v6

    .line 27
    iput v6, v0, Ld7;->y:F

    .line 28
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v7

    iget v8, v0, Ld7;->H:F

    mul-float/2addr v7, v8

    cmpg-float v7, v7, v15

    cmpl-float v7, v6, v2

    if-lez v7, :cond_9

    cmpl-float v7, v3, v5

    if-ltz v7, :cond_9

    .line 29
    iput v5, v0, Ld7;->J:F

    const/4 v7, 0x0

    .line 30
    iput-boolean v7, v0, Ld7;->N:Z

    move v3, v5

    goto :goto_3

    :cond_9
    const/4 v7, 0x0

    :goto_3
    cmpg-float v6, v6, v2

    if-gez v6, :cond_d

    cmpg-float v6, v3, v2

    if-gtz v6, :cond_d

    .line 31
    iput v2, v0, Ld7;->J:F

    .line 32
    iput-boolean v7, v0, Ld7;->N:Z

    move v12, v2

    goto :goto_5

    .line 33
    :cond_a
    invoke-virtual {v7}, Lq6;->b()Z

    throw v16

    .line 34
    :cond_b
    invoke-interface {v3, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    .line 35
    iget-object v6, v0, Ld7;->w:Landroid/view/animation/Interpolator;

    instance-of v7, v6, Lc7;

    if-eqz v7, :cond_c

    .line 36
    check-cast v6, Lc7;

    invoke-virtual {v6}, Lc7;->a()F

    move-result v6

    iput v6, v0, Ld7;->y:F

    goto :goto_4

    :cond_c
    add-float/2addr v12, v10

    .line 37
    invoke-interface {v6, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v6

    sub-float/2addr v6, v3

    mul-float/2addr v6, v1

    div-float/2addr v6, v10

    .line 38
    iput v6, v0, Ld7;->y:F

    :cond_d
    :goto_4
    move v12, v3

    goto :goto_5

    .line 39
    :cond_e
    iput v10, v0, Ld7;->y:F

    .line 40
    :goto_5
    iget v3, v0, Ld7;->y:F

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v3, v3, v15

    if-lez v3, :cond_f

    .line 41
    sget-object v3, Ld7$g;->d:Ld7$g;

    invoke-virtual {v0, v3}, Ld7;->setState(Ld7$g;)V

    :cond_f
    if-lez v13, :cond_10

    .line 42
    iget v3, v0, Ld7;->L:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_11

    :cond_10
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_12

    iget v3, v0, Ld7;->L:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_12

    .line 43
    :cond_11
    iget v12, v0, Ld7;->L:F

    const/4 v3, 0x0

    .line 44
    iput-boolean v3, v0, Ld7;->N:Z

    :cond_12
    cmpl-float v3, v12, v5

    if-gez v3, :cond_14

    cmpg-float v3, v12, v2

    if-gtz v3, :cond_13

    goto :goto_6

    :cond_13
    const/4 v7, 0x0

    goto :goto_7

    :cond_14
    :goto_6
    const/4 v7, 0x0

    .line 45
    iput-boolean v7, v0, Ld7;->N:Z

    .line 46
    sget-object v3, Ld7$g;->e:Ld7$g;

    invoke-virtual {v0, v3}, Ld7;->setState(Ld7$g;)V

    .line 47
    :goto_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    .line 48
    iput-boolean v7, v0, Ld7;->e0:Z

    .line 49
    invoke-virtual/range {p0 .. p0}, Ld7;->getNanoTime()J

    move-result-wide v8

    .line 50
    iput v12, v0, Ld7;->p0:F

    .line 51
    iget-object v6, v0, Ld7;->x:Landroid/view/animation/Interpolator;

    if-nez v6, :cond_15

    move v6, v12

    goto :goto_8

    :cond_15
    invoke-interface {v6, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v6

    .line 52
    :goto_8
    iget-object v10, v0, Ld7;->x:Landroid/view/animation/Interpolator;

    if-eqz v10, :cond_16

    .line 53
    iget v11, v0, Ld7;->H:F

    div-float v11, v1, v11

    add-float/2addr v11, v12

    invoke-interface {v10, v11}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v10

    iput v10, v0, Ld7;->y:F

    .line 54
    iget-object v11, v0, Ld7;->x:Landroid/view/animation/Interpolator;

    invoke-interface {v11, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v11

    sub-float/2addr v10, v11

    iput v10, v0, Ld7;->y:F

    :cond_16
    move v10, v7

    :goto_9
    if-ge v10, v3, :cond_18

    .line 55
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 56
    iget-object v15, v0, Ld7;->F:Ljava/util/HashMap;

    invoke-virtual {v15, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v17, v15

    check-cast v17, La7;

    if-eqz v17, :cond_17

    .line 57
    iget-boolean v15, v0, Ld7;->e0:Z

    iget-object v7, v0, Ld7;->q0:Li5;

    move-object/from16 v18, v11

    move/from16 v19, v6

    move-wide/from16 v20, v8

    move-object/from16 v22, v7

    invoke-virtual/range {v17 .. v22}, La7;->c(Landroid/view/View;FJLi5;)Z

    move-result v7

    or-int/2addr v7, v15

    iput-boolean v7, v0, Ld7;->e0:Z

    :cond_17
    add-int/lit8 v10, v10, 0x1

    const/4 v7, 0x0

    goto :goto_9

    :cond_18
    if-lez v13, :cond_19

    .line 58
    iget v3, v0, Ld7;->L:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_1a

    :cond_19
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_1b

    iget v3, v0, Ld7;->L:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_1b

    :cond_1a
    const/4 v7, 0x1

    goto :goto_a

    :cond_1b
    const/4 v7, 0x0

    .line 59
    :goto_a
    iget-boolean v3, v0, Ld7;->e0:Z

    if-nez v3, :cond_1c

    iget-boolean v3, v0, Ld7;->N:Z

    if-nez v3, :cond_1c

    if-eqz v7, :cond_1c

    .line 60
    sget-object v3, Ld7$g;->e:Ld7$g;

    invoke-virtual {v0, v3}, Ld7;->setState(Ld7$g;)V

    .line 61
    :cond_1c
    iget-boolean v3, v0, Ld7;->o0:Z

    if-eqz v3, :cond_1d

    .line 62
    invoke-virtual/range {p0 .. p0}, Ld7;->requestLayout()V

    .line 63
    :cond_1d
    iget-boolean v3, v0, Ld7;->e0:Z

    const/4 v6, 0x1

    xor-int/2addr v7, v6

    or-int/2addr v3, v7

    iput-boolean v3, v0, Ld7;->e0:Z

    cmpg-float v7, v12, v2

    if-gtz v7, :cond_1f

    .line 64
    iget v7, v0, Ld7;->z:I

    if-eq v7, v4, :cond_1f

    .line 65
    iget v4, v0, Ld7;->A:I

    if-ne v4, v7, :cond_1e

    goto :goto_b

    .line 66
    :cond_1e
    iput v7, v0, Ld7;->A:I

    .line 67
    iget-object v1, v0, Ld7;->v:Lf7;

    invoke-virtual {v1, v7}, Lf7;->b(I)Ll7;

    throw v16

    :cond_1f
    :goto_b
    float-to-double v7, v12

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v7, v9

    if-ltz v4, :cond_21

    .line 68
    iget v4, v0, Ld7;->A:I

    iget v7, v0, Ld7;->B:I

    if-ne v4, v7, :cond_20

    goto :goto_c

    .line 69
    :cond_20
    iput v7, v0, Ld7;->A:I

    .line 70
    iget-object v1, v0, Ld7;->v:Lf7;

    invoke-virtual {v1, v7}, Lf7;->b(I)Ll7;

    throw v16

    :cond_21
    :goto_c
    if-nez v3, :cond_25

    .line 71
    iget-boolean v3, v0, Ld7;->N:Z

    if-eqz v3, :cond_22

    goto :goto_d

    :cond_22
    if-lez v13, :cond_23

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_24

    :cond_23
    cmpg-float v3, v1, v2

    if-gez v3, :cond_26

    cmpl-float v3, v12, v2

    if-nez v3, :cond_26

    .line 72
    :cond_24
    sget-object v3, Ld7$g;->e:Ld7$g;

    invoke-virtual {v0, v3}, Ld7;->setState(Ld7$g;)V

    goto :goto_e

    .line 73
    :cond_25
    :goto_d
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->invalidate()V

    .line 74
    :cond_26
    :goto_e
    iget-boolean v3, v0, Ld7;->e0:Z

    if-nez v3, :cond_29

    iget-boolean v3, v0, Ld7;->N:Z

    if-nez v3, :cond_29

    if-lez v13, :cond_27

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_28

    :cond_27
    cmpg-float v1, v1, v2

    if-gez v1, :cond_29

    cmpl-float v1, v12, v2

    if-nez v1, :cond_29

    .line 75
    :cond_28
    invoke-virtual/range {p0 .. p0}, Ld7;->J()V

    .line 76
    :cond_29
    :goto_f
    iget v1, v0, Ld7;->J:F

    cmpl-float v3, v1, v5

    if-ltz v3, :cond_2b

    .line 77
    iget v1, v0, Ld7;->A:I

    iget v2, v0, Ld7;->B:I

    if-eq v1, v2, :cond_2a

    goto :goto_10

    :cond_2a
    const/4 v6, 0x0

    .line 78
    :goto_10
    iput v2, v0, Ld7;->A:I

    :goto_11
    move v7, v6

    goto :goto_13

    :cond_2b
    cmpg-float v1, v1, v2

    if-gtz v1, :cond_2d

    .line 79
    iget v1, v0, Ld7;->A:I

    iget v2, v0, Ld7;->z:I

    if-eq v1, v2, :cond_2c

    goto :goto_12

    :cond_2c
    const/4 v6, 0x0

    .line 80
    :goto_12
    iput v2, v0, Ld7;->A:I

    goto :goto_11

    :cond_2d
    const/4 v7, 0x0

    .line 81
    :goto_13
    iget-boolean v1, v0, Ld7;->z0:Z

    or-int/2addr v1, v7

    iput-boolean v1, v0, Ld7;->z0:Z

    if-eqz v7, :cond_2e

    .line 82
    iget-boolean v1, v0, Ld7;->r0:Z

    if-nez v1, :cond_2e

    .line 83
    invoke-virtual/range {p0 .. p0}, Ld7;->requestLayout()V

    .line 84
    :cond_2e
    iget v1, v0, Ld7;->J:F

    iput v1, v0, Ld7;->I:F

    return-void
.end method

.method public final G()V
    .locals 5

    .line 1
    iget-object v0, p0, Ld7;->O:Ld7$f;

    if-nez v0, :cond_0

    iget-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2
    :cond_0
    iget v0, p0, Ld7;->n0:F

    iget v1, p0, Ld7;->I:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    .line 3
    iget v0, p0, Ld7;->m0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 4
    iget-object v0, p0, Ld7;->O:Ld7$f;

    if-eqz v0, :cond_1

    .line 5
    iget v2, p0, Ld7;->z:I

    iget v3, p0, Ld7;->B:I

    invoke-interface {v0, p0, v2, v3}, Ld7$f;->b(Ld7;II)V

    .line 6
    :cond_1
    iget-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld7$f;

    .line 8
    iget v3, p0, Ld7;->z:I

    iget v4, p0, Ld7;->B:I

    invoke-interface {v2, p0, v3, v4}, Ld7$f;->b(Ld7;II)V

    goto :goto_0

    .line 9
    :cond_2
    iput v1, p0, Ld7;->m0:I

    .line 10
    iget v0, p0, Ld7;->I:F

    iput v0, p0, Ld7;->n0:F

    .line 11
    iget-object v1, p0, Ld7;->O:Ld7$f;

    if-eqz v1, :cond_3

    .line 12
    iget v2, p0, Ld7;->z:I

    iget v3, p0, Ld7;->B:I

    invoke-interface {v1, p0, v2, v3, v0}, Ld7$f;->a(Ld7;IIF)V

    .line 13
    :cond_3
    iget-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7$f;

    .line 15
    iget v2, p0, Ld7;->z:I

    iget v3, p0, Ld7;->B:I

    iget v4, p0, Ld7;->I:F

    invoke-interface {v1, p0, v2, v3, v4}, Ld7$f;->a(Ld7;IIF)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public H()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld7;->O:Ld7$f;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    :cond_0
    iget v0, p0, Ld7;->m0:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 3
    iget v0, p0, Ld7;->A:I

    iput v0, p0, Ld7;->m0:I

    .line 4
    iget-object v0, p0, Ld7;->A0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Ld7;->A0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    .line 6
    :goto_0
    iget v3, p0, Ld7;->A:I

    if-eq v0, v3, :cond_2

    if-eq v3, v2, :cond_2

    .line 7
    iget-object v0, p0, Ld7;->A0:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_2
    invoke-virtual {p0}, Ld7;->K()V

    .line 9
    iget-object v0, p0, Ld7;->t0:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    .line 10
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 11
    :cond_3
    iget-object v0, p0, Ld7;->u0:[I

    if-eqz v0, :cond_4

    iget v2, p0, Ld7;->v0:I

    if-lez v2, :cond_4

    const/4 v2, 0x0

    .line 12
    aget v0, v0, v2

    invoke-virtual {p0, v0}, Ld7;->Q(I)V

    .line 13
    iget-object v0, p0, Ld7;->u0:[I

    array-length v3, v0

    sub-int/2addr v3, v1

    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    iget v0, p0, Ld7;->v0:I

    sub-int/2addr v0, v1

    iput v0, p0, Ld7;->v0:I

    :cond_4
    return-void
.end method

.method public I(I)Lf7$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    invoke-virtual {v0, p1}, Lf7;->h(I)Lf7$a;

    const/4 p1, 0x0

    throw p1
.end method

.method public J()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Ld7;->A:I

    invoke-virtual {v0, p0, v1}, Lf7;->a(Ld7;I)Z

    const/4 v0, 0x0

    throw v0
.end method

.method public final K()V
    .locals 5

    .line 1
    iget-object v0, p0, Ld7;->O:Ld7$f;

    if-nez v0, :cond_1

    iget-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 2
    :cond_1
    iget-object v0, p0, Ld7;->A0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 3
    iget-object v2, p0, Ld7;->O:Ld7$f;

    if-eqz v2, :cond_3

    .line 4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2, p0, v3}, Ld7$f;->c(Ld7;I)V

    .line 5
    :cond_3
    iget-object v2, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld7$f;

    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3, p0, v4}, Ld7$f;->c(Ld7;I)V

    goto :goto_0

    .line 8
    :cond_4
    iget-object v0, p0, Ld7;->A0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public L()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->y0:Ld7$d;

    invoke-virtual {v0}, Ld7$d;->a()V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public M(FF)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld7;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ld7$e;

    invoke-direct {v0, p0}, Ld7$e;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->s0:Ld7$e;

    .line 4
    :cond_0
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0, p1}, Ld7$e;->e(F)V

    .line 5
    iget-object p1, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {p1, p2}, Ld7$e;->h(F)V

    return-void

    .line 6
    :cond_1
    invoke-virtual {p0, p1}, Ld7;->setProgress(F)V

    .line 7
    sget-object v0, Ld7$g;->d:Ld7$g;

    invoke-virtual {p0, v0}, Ld7;->setState(Ld7$g;)V

    .line 8
    iput p2, p0, Ld7;->y:F

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_3

    if-lez p2, :cond_2

    move v0, v1

    .line 9
    :cond_2
    invoke-virtual {p0, v0}, Ld7;->E(F)V

    goto :goto_0

    :cond_3
    cmpl-float p2, p1, v0

    if-eqz p2, :cond_5

    cmpl-float p2, p1, v1

    if-eqz p2, :cond_5

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_4

    move v0, v1

    .line 10
    :cond_4
    invoke-virtual {p0, v0}, Ld7;->E(F)V

    :cond_5
    :goto_0
    return-void
.end method

.method public N(III)V
    .locals 1

    .line 1
    sget-object v0, Ld7$g;->c:Ld7$g;

    invoke-virtual {p0, v0}, Ld7;->setState(Ld7$g;)V

    .line 2
    iput p1, p0, Ld7;->A:I

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Ld7;->z:I

    .line 4
    iput v0, p0, Ld7;->B:I

    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lk7;

    if-eqz v0, :cond_0

    int-to-float p2, p2

    int-to-float p3, p3

    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lk7;->d(IFF)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p2, p0, Ld7;->v:Lf7;

    if-nez p2, :cond_1

    :goto_0
    return-void

    .line 8
    :cond_1
    invoke-virtual {p2, p1}, Lf7;->b(I)Ll7;

    const/4 p1, 0x0

    throw p1
.end method

.method public O(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld7;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ld7$e;

    invoke-direct {v0, p0}, Ld7$e;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->s0:Ld7$e;

    .line 4
    :cond_0
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0, p1}, Ld7$e;->f(I)V

    .line 5
    iget-object p1, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {p1, p2}, Ld7$e;->d(I)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_2

    return-void

    .line 7
    :cond_2
    iput p1, p0, Ld7;->z:I

    .line 8
    iput p2, p0, Ld7;->B:I

    .line 9
    invoke-virtual {v0, p1, p2}, Lf7;->l(II)V

    const/4 p1, 0x0

    throw p1
.end method

.method public P()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1
    invoke-virtual {p0, v0}, Ld7;->E(F)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ld7;->t0:Ljava/lang/Runnable;

    return-void
.end method

.method public Q(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld7;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ld7$e;

    invoke-direct {v0, p0}, Ld7$e;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->s0:Ld7$e;

    .line 4
    :cond_0
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0, p1}, Ld7$e;->d(I)V

    return-void

    :cond_1
    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0, p1, v0, v0}, Ld7;->R(III)V

    return-void
.end method

.method public R(III)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Ld7;->S(IIII)V

    return-void
.end method

.method public S(IIII)V
    .locals 4

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v0, Lf7;->a:Ls7;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget p4, p0, Ld7;->A:I

    int-to-float p2, p2

    int-to-float p3, p3

    invoke-virtual {v0, p4, p1, p2, p3}, Ls7;->a(IIFF)I

    throw v1

    .line 3
    :cond_1
    :goto_0
    iget p2, p0, Ld7;->A:I

    if-ne p2, p1, :cond_2

    return-void

    .line 4
    :cond_2
    iget p3, p0, Ld7;->z:I

    const/high16 v0, 0x447a0000    # 1000.0f

    const/4 v2, 0x0

    if-ne p3, p1, :cond_4

    .line 5
    invoke-virtual {p0, v2}, Ld7;->E(F)V

    if-lez p4, :cond_3

    int-to-float p1, p4

    div-float/2addr p1, v0

    .line 6
    iput p1, p0, Ld7;->H:F

    :cond_3
    return-void

    .line 7
    :cond_4
    iget p3, p0, Ld7;->B:I

    const/high16 v3, 0x3f800000    # 1.0f

    if-ne p3, p1, :cond_6

    .line 8
    invoke-virtual {p0, v3}, Ld7;->E(F)V

    if-lez p4, :cond_5

    int-to-float p1, p4

    div-float/2addr p1, v0

    .line 9
    iput p1, p0, Ld7;->H:F

    :cond_5
    return-void

    .line 10
    :cond_6
    iput p1, p0, Ld7;->B:I

    const/4 p3, -0x1

    if-eq p2, p3, :cond_8

    .line 11
    invoke-virtual {p0, p2, p1}, Ld7;->O(II)V

    .line 12
    invoke-virtual {p0, v3}, Ld7;->E(F)V

    .line 13
    iput v2, p0, Ld7;->J:F

    .line 14
    invoke-virtual {p0}, Ld7;->P()V

    if-lez p4, :cond_7

    int-to-float p1, p4

    div-float/2addr p1, v0

    .line 15
    iput p1, p0, Ld7;->H:F

    :cond_7
    return-void

    :cond_8
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Ld7;->R:Z

    .line 17
    iput v3, p0, Ld7;->L:F

    .line 18
    iput v2, p0, Ld7;->I:F

    .line 19
    iput v2, p0, Ld7;->J:F

    .line 20
    invoke-virtual {p0}, Ld7;->getNanoTime()J

    move-result-wide v2

    iput-wide v2, p0, Ld7;->K:J

    .line 21
    invoke-virtual {p0}, Ld7;->getNanoTime()J

    move-result-wide v2

    iput-wide v2, p0, Ld7;->G:J

    .line 22
    iput-boolean p1, p0, Ld7;->M:Z

    .line 23
    iput-object v1, p0, Ld7;->w:Landroid/view/animation/Interpolator;

    if-ne p4, p3, :cond_9

    .line 24
    iget-object p1, p0, Ld7;->v:Lf7;

    invoke-virtual {p1}, Lf7;->e()I

    throw v1

    .line 25
    :cond_9
    iput p3, p0, Ld7;->z:I

    .line 26
    iget-object p1, p0, Ld7;->v:Lf7;

    iget p2, p0, Ld7;->B:I

    invoke-virtual {p1, p3, p2}, Lf7;->l(II)V

    throw v1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    iget-object v0, p0, Ld7;->h0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb7;

    .line 3
    invoke-virtual {v1, p1}, Lb7;->x(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Ld7;->F(Z)V

    .line 5
    iget-object v1, p0, Ld7;->v:Lf7;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, v1, Lf7;->c:Lh7;

    if-nez v1, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {v1}, Lh7;->a()V

    throw v2

    .line 7
    :cond_2
    :goto_1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 8
    iget-object v1, p0, Ld7;->v:Lf7;

    if-nez v1, :cond_3

    return-void

    .line 9
    :cond_3
    iget v1, p0, Ld7;->P:I

    const/4 v3, 0x1

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_7

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_7

    .line 11
    iget v1, p0, Ld7;->j0:I

    add-int/2addr v1, v3

    iput v1, p0, Ld7;->j0:I

    .line 12
    invoke-virtual {p0}, Ld7;->getNanoTime()J

    move-result-wide v4

    .line 13
    iget-wide v6, p0, Ld7;->k0:J

    const-wide/16 v8, -0x1

    cmp-long v1, v6, v8

    if-eqz v1, :cond_4

    sub-long v6, v4, v6

    const-wide/32 v8, 0xbebc200

    cmp-long v1, v6, v8

    if-lez v1, :cond_5

    .line 14
    iget v1, p0, Ld7;->j0:I

    int-to-float v1, v1

    long-to-float v6, v6

    const v7, 0x3089705f    # 1.0E-9f

    mul-float/2addr v6, v7

    div-float/2addr v1, v6

    const/high16 v6, 0x42c80000    # 100.0f

    mul-float/2addr v1, v6

    float-to-int v1, v1

    int-to-float v1, v1

    div-float/2addr v1, v6

    .line 15
    iput v1, p0, Ld7;->l0:F

    .line 16
    iput v0, p0, Ld7;->j0:I

    .line 17
    iput-wide v4, p0, Ld7;->k0:J

    goto :goto_2

    .line 18
    :cond_4
    iput-wide v4, p0, Ld7;->k0:J

    .line 19
    :cond_5
    :goto_2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/high16 v1, 0x42280000    # 42.0f

    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 21
    invoke-virtual {p0}, Ld7;->getProgress()F

    move-result v1

    const/high16 v4, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v4

    float-to-int v1, v1

    int-to-float v1, v1

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v1, v4

    .line 22
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, Ld7;->l0:F

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const v6, 0xa10

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Ld7;->z:I

    invoke-static {p0, v6}, Lu6;->c(Ld7;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v6, 0xa11

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, Ld7;->B:I

    invoke-static {p0, v5}, Lu6;->c(Ld7;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v5, 0xa12

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const v1, 0xa13

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    iget v1, p0, Ld7;->A:I

    const/4 v5, -0x1

    if-ne v1, v5, :cond_6

    const v1, 0xa14

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_6
    invoke-static {p0, v1}, Lu6;->c(Ld7;I)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v5, -0x1000000

    .line 25
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v5, 0x41300000    # 11.0f

    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v6

    add-int/lit8 v6, v6, -0x1d

    int-to-float v6, v6

    invoke-virtual {p1, v1, v5, v6, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const v5, -0x77ff78

    .line 27
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    add-int/lit8 v5, v5, -0x1e

    int-to-float v5, v5

    invoke-virtual {p1, v1, v4, v5, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 29
    :cond_7
    iget v0, p0, Ld7;->P:I

    if-le v0, v3, :cond_9

    .line 30
    iget-object p1, p0, Ld7;->Q:Ld7$c;

    if-nez p1, :cond_8

    .line 31
    new-instance p1, Ld7$c;

    invoke-direct {p1, p0}, Ld7$c;-><init>(Ld7;)V

    iput-object p1, p0, Ld7;->Q:Ld7$c;

    .line 32
    :cond_8
    iget-object p1, p0, Ld7;->v:Lf7;

    invoke-virtual {p1}, Lf7;->e()I

    throw v2

    .line 33
    :cond_9
    iget-object v0, p0, Ld7;->h0:Ljava/util/ArrayList;

    if-eqz v0, :cond_a

    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb7;

    .line 35
    invoke-virtual {v1, p1}, Lb7;->w(Landroid/graphics/Canvas;)V

    goto :goto_4

    :cond_a
    return-void
.end method

.method public getConstraintSetIds()[I
    .locals 2

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lf7;->c()[I

    throw v1
.end method

.method public getCurrentState()I
    .locals 1

    .line 1
    iget v0, p0, Ld7;->A:I

    return v0
.end method

.method public getDefinedTransitions()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lf7$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lf7;->d()Ljava/util/ArrayList;

    throw v1
.end method

.method public getDesignTool()Lv6;
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->T:Lv6;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lv6;

    invoke-direct {v0, p0}, Lv6;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->T:Lv6;

    .line 3
    :cond_0
    iget-object v0, p0, Ld7;->T:Lv6;

    return-object v0
.end method

.method public getEndState()I
    .locals 1

    .line 1
    iget v0, p0, Ld7;->B:I

    return v0
.end method

.method public getNanoTime()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Ld7;->J:F

    return v0
.end method

.method public getScene()Lf7;
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    return-object v0
.end method

.method public getStartState()I
    .locals 1

    .line 1
    iget v0, p0, Ld7;->z:I

    return v0
.end method

.method public getTargetPosition()F
    .locals 1

    .line 1
    iget v0, p0, Ld7;->L:F

    return v0
.end method

.method public getTransitionState()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ld7$e;

    invoke-direct {v0, p0}, Ld7$e;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->s0:Ld7$e;

    .line 3
    :cond_0
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0}, Ld7$e;->c()V

    .line 4
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0}, Ld7$e;->b()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getTransitionTimeMs()J
    .locals 2

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Ld7;->H:F

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    return-wide v0

    .line 3
    :cond_0
    invoke-virtual {v0}, Lf7;->e()I

    const/4 v0, 0x0

    throw v0
.end method

.method public getVelocity()F
    .locals 1

    .line 1
    iget v0, p0, Ld7;->y:F

    return v0
.end method

.method public h(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ld7;->getNanoTime()J

    move-result-wide p1

    iput-wide p1, p0, Ld7;->c0:J

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Ld7;->d0:F

    .line 3
    iput p1, p0, Ld7;->a0:F

    .line 4
    iput p1, p0, Ld7;->b0:F

    return-void
.end method

.method public i(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Ld7;->v:Lf7;

    if-eqz p1, :cond_1

    iget p2, p0, Ld7;->d0:F

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget v0, p0, Ld7;->a0:F

    div-float/2addr v0, p2

    iget v1, p0, Ld7;->b0:F

    div-float/2addr v1, p2

    invoke-virtual {p1, v0, v1}, Lf7;->i(FF)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public isAttachedToWindow()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2
    invoke-super {p0}, Landroid/view/ViewGroup;->isAttachedToWindow()Z

    move-result v0

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Landroid/view/View;II[II)V
    .locals 0

    .line 1
    iget-object p1, p0, Ld7;->v:Lf7;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p1, Lf7;->b:Lf7$a;

    if-nez p1, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p1}, Lf7$a;->d()Z

    const/4 p1, 0x0

    throw p1
.end method

.method public m(Landroid/view/View;IIIII[I)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Ld7;->W:Z

    const/4 p6, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    .line 2
    :cond_0
    aget p1, p7, p6

    add-int/2addr p1, p4

    aput p1, p7, p6

    const/4 p1, 0x1

    .line 3
    aget p2, p7, p1

    add-int/2addr p2, p5

    aput p2, p7, p1

    .line 4
    :cond_1
    iput-boolean p6, p0, Ld7;->W:Z

    return-void
.end method

.method public n(Landroid/view/View;IIIII)V
    .locals 0

    return-void
.end method

.method public o(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    iget-object p1, p0, Ld7;->v:Lf7;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lf7;->b:Lf7$a;

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lf7$a;->c()Lg7;

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 5
    :cond_0
    iget-object v0, p0, Ld7;->v:Lf7;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget v2, p0, Ld7;->A:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0, v2}, Lf7;->b(I)Ll7;

    throw v1

    .line 7
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ld7;->J()V

    .line 8
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-eqz v0, :cond_4

    .line 9
    iget-boolean v1, p0, Ld7;->w0:Z

    if-eqz v1, :cond_3

    .line 10
    new-instance v0, Ld7$a;

    invoke-direct {v0, p0}, Ld7$a;-><init>(Ld7;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 11
    :cond_3
    invoke-virtual {v0}, Ld7$e;->a()V

    goto :goto_1

    .line 12
    :cond_4
    iget-object v0, p0, Ld7;->v:Lf7;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lf7;->b:Lf7$a;

    if-nez v0, :cond_5

    goto :goto_1

    .line 13
    :cond_5
    invoke-virtual {v0}, Lf7$a;->a()I

    throw v1

    :cond_6
    :goto_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Ld7;->E:Z

    if-nez v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v2, v0, Lf7;->c:Lh7;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    .line 3
    iget-object p1, v0, Lf7;->b:Lf7$a;

    if-nez p1, :cond_1

    return v1

    .line 4
    :cond_1
    invoke-virtual {p1}, Lf7$a;->d()Z

    throw v3

    .line 5
    :cond_2
    invoke-virtual {v2, p1}, Lh7;->b(Landroid/view/MotionEvent;)V

    throw v3

    :cond_3
    :goto_0
    return v1
.end method

.method public onLayout(ZIIII)V
    .locals 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Ld7;->r0:Z

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object v2, p0, Ld7;->v:Lf7;

    if-nez v2, :cond_0

    .line 3
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    iput-boolean v1, p0, Ld7;->r0:Z

    return-void

    :cond_0
    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 5
    :try_start_1
    iget p1, p0, Ld7;->U:I

    if-ne p1, p4, :cond_1

    iget p1, p0, Ld7;->V:I

    if-eq p1, p5, :cond_2

    .line 6
    :cond_1
    invoke-virtual {p0}, Ld7;->L()V

    .line 7
    invoke-virtual {p0, v0}, Ld7;->F(Z)V

    .line 8
    :cond_2
    iput p4, p0, Ld7;->U:I

    .line 9
    iput p5, p0, Ld7;->V:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    iput-boolean v1, p0, Ld7;->r0:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Ld7;->r0:Z

    .line 11
    throw p1
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    return-void

    .line 3
    :cond_0
    iget v0, p0, Ld7;->C:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Ld7;->D:I

    .line 4
    :cond_1
    iget-boolean v0, p0, Ld7;->z0:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ld7;->z0:Z

    .line 6
    invoke-virtual {p0}, Ld7;->J()V

    .line 7
    invoke-virtual {p0}, Ld7;->K()V

    .line 8
    :cond_2
    iget-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    .line 9
    iput p1, p0, Ld7;->C:I

    .line 10
    iput p2, p0, Ld7;->D:I

    .line 11
    iget-object p1, p0, Ld7;->v:Lf7;

    invoke-virtual {p1}, Lf7;->g()I

    const/4 p1, 0x0

    throw p1
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Ld7;->v:Lf7;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->r()Z

    move-result v0

    invoke-virtual {p1, v0}, Lf7;->k(Z)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Ld7;->E:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf7;->n()Z

    const/4 p1, 0x0

    throw p1

    .line 2
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    .line 2
    instance-of v0, p1, Lb7;

    if-eqz v0, :cond_6

    .line 3
    check-cast p1, Lb7;

    .line 4
    iget-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    :cond_0
    iget-object v0, p0, Ld7;->i0:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {p1}, Lb7;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Ld7;->f0:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld7;->f0:Ljava/util/ArrayList;

    .line 10
    :cond_1
    iget-object v0, p0, Ld7;->f0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_2
    invoke-virtual {p1}, Lb7;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12
    iget-object v0, p0, Ld7;->g0:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld7;->g0:Ljava/util/ArrayList;

    .line 14
    :cond_3
    iget-object v0, p0, Ld7;->g0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_4
    invoke-virtual {p1}, Lb7;->t()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16
    iget-object v0, p0, Ld7;->h0:Ljava/util/ArrayList;

    if-nez v0, :cond_5

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld7;->h0:Ljava/util/ArrayList;

    .line 18
    :cond_5
    iget-object v0, p0, Ld7;->h0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Ld7;->f0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    :cond_0
    iget-object v0, p0, Ld7;->g0:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public requestLayout()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld7;->o0:Z

    if-nez v0, :cond_1

    .line 2
    iget v0, p0, Ld7;->A:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ld7;->v:Lf7;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lf7;->b:Lf7$a;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Lf7$a;->b()I

    const/4 v0, 0x0

    throw v0

    .line 4
    :cond_1
    :goto_0
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setDebugMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld7;->P:I

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setDelayedApplicationOfInitialState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ld7;->w0:Z

    return-void
.end method

.method public setInteractionEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ld7;->E:Z

    return-void
.end method

.method public setInterpolatedProgress(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Ld7;->setProgress(F)V

    return-void

    .line 3
    :cond_0
    sget-object p1, Ld7$g;->d:Ld7$g;

    invoke-virtual {p0, p1}, Ld7;->setState(Ld7$g;)V

    .line 4
    iget-object p1, p0, Ld7;->v:Lf7;

    invoke-virtual {p1}, Lf7;->f()Landroid/view/animation/Interpolator;

    const/4 p1, 0x0

    throw p1
.end method

.method public setOnHide(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld7;->g0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Ld7;->g0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb7;

    .line 4
    invoke-virtual {v2, p1}, Lb7;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setOnShow(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld7;->f0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Ld7;->f0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb7;

    .line 4
    invoke-virtual {v2, p1}, Lb7;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 5

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v1, :cond_0

    cmpl-float v3, p1, v2

    if-lez v3, :cond_1

    :cond_0
    const v3, 0xa15

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0xa16

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 1
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :cond_1
    invoke-virtual {p0}, Ld7;->isAttachedToWindow()Z

    move-result v3

    if-nez v3, :cond_3

    .line 3
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-nez v0, :cond_2

    .line 4
    new-instance v0, Ld7$e;

    invoke-direct {v0, p0}, Ld7$e;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->s0:Ld7$e;

    .line 5
    :cond_2
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0, p1}, Ld7$e;->e(F)V

    return-void

    :cond_3
    if-gtz v1, :cond_5

    .line 6
    iget v1, p0, Ld7;->J:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_4

    iget v1, p0, Ld7;->A:I

    iget v2, p0, Ld7;->B:I

    if-ne v1, v2, :cond_4

    .line 7
    sget-object v1, Ld7$g;->d:Ld7$g;

    invoke-virtual {p0, v1}, Ld7;->setState(Ld7$g;)V

    .line 8
    :cond_4
    iget v1, p0, Ld7;->z:I

    iput v1, p0, Ld7;->A:I

    .line 9
    iget v1, p0, Ld7;->J:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_8

    .line 10
    sget-object v0, Ld7$g;->e:Ld7$g;

    invoke-virtual {p0, v0}, Ld7;->setState(Ld7$g;)V

    goto :goto_0

    :cond_5
    cmpl-float v1, p1, v2

    if-ltz v1, :cond_7

    .line 11
    iget v1, p0, Ld7;->J:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_6

    iget v0, p0, Ld7;->A:I

    iget v1, p0, Ld7;->z:I

    if-ne v0, v1, :cond_6

    .line 12
    sget-object v0, Ld7$g;->d:Ld7$g;

    invoke-virtual {p0, v0}, Ld7;->setState(Ld7$g;)V

    .line 13
    :cond_6
    iget v0, p0, Ld7;->B:I

    iput v0, p0, Ld7;->A:I

    .line 14
    iget v0, p0, Ld7;->J:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_8

    .line 15
    sget-object v0, Ld7$g;->e:Ld7$g;

    invoke-virtual {p0, v0}, Ld7;->setState(Ld7$g;)V

    goto :goto_0

    :cond_7
    const/4 v0, -0x1

    .line 16
    iput v0, p0, Ld7;->A:I

    .line 17
    sget-object v0, Ld7$g;->d:Ld7$g;

    invoke-virtual {p0, v0}, Ld7;->setState(Ld7$g;)V

    .line 18
    :cond_8
    :goto_0
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_9

    return-void

    :cond_9
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Ld7;->M:Z

    .line 20
    iput p1, p0, Ld7;->L:F

    .line 21
    iput p1, p0, Ld7;->I:F

    const-wide/16 v1, -0x1

    .line 22
    iput-wide v1, p0, Ld7;->K:J

    .line 23
    iput-wide v1, p0, Ld7;->G:J

    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Ld7;->w:Landroid/view/animation/Interpolator;

    .line 25
    iput-boolean v0, p0, Ld7;->N:Z

    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setScene(Lf7;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->r()Z

    move-result v0

    invoke-virtual {p1, v0}, Lf7;->k(Z)V

    const/4 p1, 0x0

    throw p1
.end method

.method public setStartState(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld7;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ld7$e;

    invoke-direct {v0, p0}, Ld7$e;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->s0:Ld7$e;

    .line 4
    :cond_0
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0, p1}, Ld7$e;->f(I)V

    .line 5
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0, p1}, Ld7$e;->d(I)V

    return-void

    .line 6
    :cond_1
    iput p1, p0, Ld7;->A:I

    return-void
.end method

.method public setState(Ld7$g;)V
    .locals 4

    .line 1
    sget-object v0, Ld7$g;->e:Ld7$g;

    if-ne p1, v0, :cond_0

    iget v1, p0, Ld7;->A:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Ld7;->x0:Ld7$g;

    .line 3
    iput-object p1, p0, Ld7;->x0:Ld7$g;

    .line 4
    sget-object v2, Ld7$g;->d:Ld7$g;

    if-ne v1, v2, :cond_1

    if-ne p1, v2, :cond_1

    .line 5
    invoke-virtual {p0}, Ld7;->G()V

    .line 6
    :cond_1
    sget-object v3, Ld7$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    if-ne p1, v0, :cond_5

    .line 7
    invoke-virtual {p0}, Ld7;->H()V

    goto :goto_0

    :cond_3
    if-ne p1, v2, :cond_4

    .line 8
    invoke-virtual {p0}, Ld7;->G()V

    :cond_4
    if-ne p1, v0, :cond_5

    .line 9
    invoke-virtual {p0}, Ld7;->H()V

    :cond_5
    :goto_0
    return-void
.end method

.method public setTransition(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Ld7;->I(I)Lf7$a;

    const/4 p1, 0x0

    throw p1
.end method

.method public setTransition(Lf7$a;)V
    .locals 1

    .line 3
    iget-object v0, p0, Ld7;->v:Lf7;

    invoke-virtual {v0, p1}, Lf7;->m(Lf7$a;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public setTransitionDuration(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->v:Lf7;

    if-nez v0, :cond_0

    const p1, 0xa17

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0xa18

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lf7;->j(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public setTransitionListener(Ld7$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld7;->O:Ld7$f;

    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ld7$e;

    invoke-direct {v0, p0}, Ld7$e;-><init>(Ld7;)V

    iput-object v0, p0, Ld7;->s0:Ld7$e;

    .line 3
    :cond_0
    iget-object v0, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {v0, p1}, Ld7$e;->g(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Ld7;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Ld7;->s0:Ld7$e;

    invoke-virtual {p1}, Ld7$e;->a()V

    :cond_1
    return-void
.end method

.method public t(I)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lk7;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Ld7;->z:I

    invoke-static {v0, v2}, Lu6;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0xa19

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ld7;->B:I

    .line 3
    invoke-static {v0, v2}, Lu6;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0xa1a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ld7;->J:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const v0, 0xa1b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ld7;->y:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
