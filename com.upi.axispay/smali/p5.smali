.class public Lp5;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Lr5;

.field public b:Lr5;

.field public c:Lr5;

.field public d:Lr5;

.field public e:Lr5;

.field public f:Lr5;

.field public g:Lr5;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lr5;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:I

.field public k:F

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Lr5;IZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lp5;->k:F

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lp5;->p:Z

    .line 4
    iput-object p1, p0, Lp5;->a:Lr5;

    .line 5
    iput p2, p0, Lp5;->o:I

    .line 6
    iput-boolean p3, p0, Lp5;->p:Z

    return-void
.end method

.method public static c(Lr5;I)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr5;->T()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lr5;->W:[Lr5$b;

    aget-object v0, v0, p1

    sget-object v1, Lr5$b;->d:Lr5$b;

    if-ne v0, v1, :cond_1

    iget-object p0, p0, Lr5;->v:[I

    aget v0, p0, p1

    if-eqz v0, :cond_0

    aget p0, p0, p1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp5;->t:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lp5;->b()V

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lp5;->t:Z

    return-void
.end method

.method public final b()V
    .locals 13

    .line 1
    iget v0, p0, Lp5;->o:I

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    .line 2
    iget-object v2, p0, Lp5;->a:Lr5;

    const/4 v3, 0x0

    move-object v4, v2

    move v5, v3

    :goto_0
    const/4 v6, 0x1

    if-nez v5, :cond_13

    .line 3
    iget v7, p0, Lp5;->i:I

    add-int/2addr v7, v6

    iput v7, p0, Lp5;->i:I

    .line 4
    iget-object v7, v2, Lr5;->r0:[Lr5;

    iget v8, p0, Lp5;->o:I

    const/4 v9, 0x0

    aput-object v9, v7, v8

    .line 5
    iget-object v7, v2, Lr5;->q0:[Lr5;

    aput-object v9, v7, v8

    .line 6
    invoke-virtual {v2}, Lr5;->T()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_e

    .line 7
    iget v7, p0, Lp5;->l:I

    add-int/2addr v7, v6

    iput v7, p0, Lp5;->l:I

    .line 8
    iget v7, p0, Lp5;->o:I

    invoke-virtual {v2, v7}, Lr5;->s(I)Lr5$b;

    move-result-object v7

    sget-object v8, Lr5$b;->d:Lr5$b;

    if-eq v7, v8, :cond_0

    .line 9
    iget v7, p0, Lp5;->m:I

    iget v10, p0, Lp5;->o:I

    invoke-virtual {v2, v10}, Lr5;->C(I)I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp5;->m:I

    .line 10
    :cond_0
    iget v7, p0, Lp5;->m:I

    iget-object v10, v2, Lr5;->T:[Lq5;

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lq5;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp5;->m:I

    .line 11
    iget-object v10, v2, Lr5;->T:[Lq5;

    add-int/lit8 v11, v0, 0x1

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lq5;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp5;->m:I

    .line 12
    iget v7, p0, Lp5;->n:I

    iget-object v10, v2, Lr5;->T:[Lq5;

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lq5;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp5;->n:I

    .line 13
    iget-object v10, v2, Lr5;->T:[Lq5;

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lq5;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp5;->n:I

    .line 14
    iget-object v7, p0, Lp5;->b:Lr5;

    if-nez v7, :cond_1

    .line 15
    iput-object v2, p0, Lp5;->b:Lr5;

    .line 16
    :cond_1
    iput-object v2, p0, Lp5;->d:Lr5;

    .line 17
    iget-object v7, v2, Lr5;->W:[Lr5$b;

    iget v10, p0, Lp5;->o:I

    aget-object v7, v7, v10

    if-ne v7, v8, :cond_e

    .line 18
    iget-object v7, v2, Lr5;->v:[I

    aget v8, v7, v10

    const/4 v11, 0x0

    if-eqz v8, :cond_2

    aget v8, v7, v10

    const/4 v12, 0x3

    if-eq v8, v12, :cond_2

    aget v7, v7, v10

    if-ne v7, v1, :cond_9

    .line 19
    :cond_2
    iget v7, p0, Lp5;->j:I

    add-int/2addr v7, v6

    iput v7, p0, Lp5;->j:I

    .line 20
    iget-object v7, v2, Lr5;->p0:[F

    aget v8, v7, v10

    cmpl-float v12, v8, v11

    if-lez v12, :cond_3

    .line 21
    iget v12, p0, Lp5;->k:F

    aget v7, v7, v10

    add-float/2addr v12, v7

    iput v12, p0, Lp5;->k:F

    .line 22
    :cond_3
    invoke-static {v2, v10}, Lp5;->c(Lr5;I)Z

    move-result v7

    if-eqz v7, :cond_6

    cmpg-float v7, v8, v11

    if-gez v7, :cond_4

    .line 23
    iput-boolean v6, p0, Lp5;->q:Z

    goto :goto_1

    .line 24
    :cond_4
    iput-boolean v6, p0, Lp5;->r:Z

    .line 25
    :goto_1
    iget-object v7, p0, Lp5;->h:Ljava/util/ArrayList;

    if-nez v7, :cond_5

    .line 26
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lp5;->h:Ljava/util/ArrayList;

    .line 27
    :cond_5
    iget-object v7, p0, Lp5;->h:Ljava/util/ArrayList;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    :cond_6
    iget-object v7, p0, Lp5;->f:Lr5;

    if-nez v7, :cond_7

    .line 29
    iput-object v2, p0, Lp5;->f:Lr5;

    .line 30
    :cond_7
    iget-object v7, p0, Lp5;->g:Lr5;

    if-eqz v7, :cond_8

    .line 31
    iget-object v7, v7, Lr5;->q0:[Lr5;

    iget v8, p0, Lp5;->o:I

    aput-object v2, v7, v8

    .line 32
    :cond_8
    iput-object v2, p0, Lp5;->g:Lr5;

    .line 33
    :cond_9
    iget v7, p0, Lp5;->o:I

    if-nez v7, :cond_b

    .line 34
    iget v7, v2, Lr5;->t:I

    if-eqz v7, :cond_a

    goto :goto_2

    .line 35
    :cond_a
    iget v7, v2, Lr5;->w:I

    if-nez v7, :cond_d

    iget v7, v2, Lr5;->x:I

    goto :goto_2

    .line 36
    :cond_b
    iget v7, v2, Lr5;->u:I

    if-eqz v7, :cond_c

    goto :goto_2

    .line 37
    :cond_c
    iget v7, v2, Lr5;->z:I

    if-nez v7, :cond_d

    iget v7, v2, Lr5;->A:I

    .line 38
    :cond_d
    :goto_2
    iget v7, v2, Lr5;->a0:F

    cmpl-float v7, v7, v11

    :cond_e
    if-eq v4, v2, :cond_f

    .line 39
    iget-object v4, v4, Lr5;->r0:[Lr5;

    iget v7, p0, Lp5;->o:I

    aput-object v2, v4, v7

    .line 40
    :cond_f
    iget-object v4, v2, Lr5;->T:[Lq5;

    add-int/lit8 v7, v0, 0x1

    aget-object v4, v4, v7

    iget-object v4, v4, Lq5;->f:Lq5;

    if-eqz v4, :cond_11

    .line 41
    iget-object v4, v4, Lq5;->d:Lr5;

    .line 42
    iget-object v7, v4, Lr5;->T:[Lq5;

    aget-object v8, v7, v0

    iget-object v8, v8, Lq5;->f:Lq5;

    if-eqz v8, :cond_11

    aget-object v7, v7, v0

    iget-object v7, v7, Lq5;->f:Lq5;

    iget-object v7, v7, Lq5;->d:Lr5;

    if-eq v7, v2, :cond_10

    goto :goto_3

    :cond_10
    move-object v9, v4

    :cond_11
    :goto_3
    if-eqz v9, :cond_12

    goto :goto_4

    :cond_12
    move-object v9, v2

    move v5, v6

    :goto_4
    move-object v4, v2

    move-object v2, v9

    goto/16 :goto_0

    .line 43
    :cond_13
    iget-object v1, p0, Lp5;->b:Lr5;

    if-eqz v1, :cond_14

    .line 44
    iget v4, p0, Lp5;->m:I

    iget-object v1, v1, Lr5;->T:[Lq5;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lq5;->e()I

    move-result v1

    sub-int/2addr v4, v1

    iput v4, p0, Lp5;->m:I

    .line 45
    :cond_14
    iget-object v1, p0, Lp5;->d:Lr5;

    if-eqz v1, :cond_15

    .line 46
    iget v4, p0, Lp5;->m:I

    iget-object v1, v1, Lr5;->T:[Lq5;

    add-int/2addr v0, v6

    aget-object v0, v1, v0

    invoke-virtual {v0}, Lq5;->e()I

    move-result v0

    sub-int/2addr v4, v0

    iput v4, p0, Lp5;->m:I

    .line 47
    :cond_15
    iput-object v2, p0, Lp5;->c:Lr5;

    .line 48
    iget v0, p0, Lp5;->o:I

    if-nez v0, :cond_16

    iget-boolean v0, p0, Lp5;->p:Z

    if-eqz v0, :cond_16

    .line 49
    iput-object v2, p0, Lp5;->e:Lr5;

    goto :goto_5

    .line 50
    :cond_16
    iget-object v0, p0, Lp5;->a:Lr5;

    iput-object v0, p0, Lp5;->e:Lr5;

    .line 51
    :goto_5
    iget-boolean v0, p0, Lp5;->r:Z

    if-eqz v0, :cond_17

    iget-boolean v0, p0, Lp5;->q:Z

    if-eqz v0, :cond_17

    move v3, v6

    :cond_17
    iput-boolean v3, p0, Lp5;->s:Z

    return-void
.end method
