.class public Lt5;
.super Lr5;
.source "AxisPay"


# instance fields
.field public A0:Z

.field public v0:F

.field public w0:I

.field public x0:I

.field public y0:Lq5;

.field public z0:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lr5;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    iput v0, p0, Lt5;->v0:F

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lt5;->w0:I

    .line 4
    iput v0, p0, Lt5;->x0:I

    .line 5
    iget-object v0, p0, Lr5;->M:Lq5;

    iput-object v0, p0, Lt5;->y0:Lq5;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lt5;->z0:I

    .line 7
    iget-object v1, p0, Lr5;->U:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 8
    iget-object v1, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v2, p0, Lt5;->y0:Lq5;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object v1, p0, Lr5;->T:[Lq5;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 10
    iget-object v2, p0, Lr5;->T:[Lq5;

    iget-object v3, p0, Lt5;->y0:Lq5;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public g(Lz4;Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lr5;->I()Lr5;

    move-result-object p2

    check-cast p2, Ls5;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lq5$b;->c:Lq5$b;

    invoke-virtual {p2, v0}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v0

    .line 3
    sget-object v1, Lq5$b;->e:Lq5$b;

    invoke-virtual {p2, v1}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lr5;->X:Lr5;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, Lr5;->W:[Lr5$b;

    aget-object v2, v2, v4

    sget-object v5, Lr5$b;->c:Lr5$b;

    if-ne v2, v5, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    .line 5
    :goto_0
    iget v5, p0, Lt5;->z0:I

    if-nez v5, :cond_3

    .line 6
    sget-object v0, Lq5$b;->d:Lq5$b;

    invoke-virtual {p2, v0}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v0

    .line 7
    sget-object v1, Lq5$b;->f:Lq5$b;

    invoke-virtual {p2, v1}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v1

    .line 8
    iget-object p2, p0, Lr5;->X:Lr5;

    if-eqz p2, :cond_2

    iget-object p2, p2, Lr5;->W:[Lr5$b;

    aget-object p2, p2, v3

    sget-object v2, Lr5$b;->c:Lr5$b;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    move v2, v3

    .line 9
    :cond_3
    iget-boolean p2, p0, Lt5;->A0:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, Lt5;->y0:Lq5;

    invoke-virtual {p2}, Lq5;->m()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 10
    iget-object p2, p0, Lt5;->y0:Lq5;

    invoke-virtual {p1, p2}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object p2

    .line 11
    iget-object v6, p0, Lt5;->y0:Lq5;

    invoke-virtual {v6}, Lq5;->d()I

    move-result v6

    invoke-virtual {p1, p2, v6}, Lz4;->f(Le5;I)V

    .line 12
    iget v6, p0, Lt5;->w0:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Lz4;->h(Le5;Le5;II)V

    goto :goto_2

    .line 14
    :cond_4
    iget v6, p0, Lt5;->x0:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    .line 15
    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v1

    .line 16
    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Lz4;->h(Le5;Le5;II)V

    .line 17
    invoke-virtual {p1, v1, p2, v4, v5}, Lz4;->h(Le5;Le5;II)V

    .line 18
    :cond_5
    :goto_2
    iput-boolean v4, p0, Lt5;->A0:Z

    return-void

    .line 19
    :cond_6
    iget p2, p0, Lt5;->w0:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    .line 20
    iget-object p2, p0, Lt5;->y0:Lq5;

    invoke-virtual {p1, p2}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object p2

    .line 21
    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    .line 22
    iget v3, p0, Lt5;->w0:I

    invoke-virtual {p1, p2, v0, v3, v6}, Lz4;->e(Le5;Le5;II)Lx4;

    if-eqz v2, :cond_9

    .line 23
    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Lz4;->h(Le5;Le5;II)V

    goto :goto_3

    .line 24
    :cond_7
    iget p2, p0, Lt5;->x0:I

    if-eq p2, v3, :cond_8

    .line 25
    iget-object p2, p0, Lt5;->y0:Lq5;

    invoke-virtual {p1, p2}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object p2

    .line 26
    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v1

    .line 27
    iget v3, p0, Lt5;->x0:I

    neg-int v3, v3

    invoke-virtual {p1, p2, v1, v3, v6}, Lz4;->e(Le5;Le5;II)Lx4;

    if-eqz v2, :cond_9

    .line 28
    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Lz4;->h(Le5;Le5;II)V

    .line 29
    invoke-virtual {p1, v1, p2, v4, v5}, Lz4;->h(Le5;Le5;II)V

    goto :goto_3

    .line 30
    :cond_8
    iget p2, p0, Lt5;->v0:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_9

    .line 31
    iget-object p2, p0, Lt5;->y0:Lq5;

    invoke-virtual {p1, p2}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object p2

    .line 32
    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    .line 33
    iget v1, p0, Lt5;->v0:F

    .line 34
    invoke-static {p1, p2, v0, v1}, Lz4;->s(Lz4;Le5;Le5;F)Lx4;

    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lz4;->d(Lx4;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt5;->A0:Z

    return v0
.end method

.method public m(Lq5$b;)Lq5;
    .locals 2

    .line 1
    sget-object v0, Lt5$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget p1, p0, Lt5;->z0:I

    if-nez p1, :cond_2

    .line 3
    iget-object p1, p0, Lt5;->y0:Lq5;

    return-object p1

    .line 4
    :cond_1
    iget p1, p0, Lt5;->z0:I

    if-ne p1, v0, :cond_2

    .line 5
    iget-object p1, p0, Lt5;->y0:Lq5;

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt5;->A0:Z

    return v0
.end method

.method public n1(Lz4;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr5;->I()Lr5;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p2, p0, Lt5;->y0:Lq5;

    invoke-virtual {p1, p2}, Lz4;->x(Ljava/lang/Object;)I

    move-result p1

    .line 3
    iget p2, p0, Lt5;->z0:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Lr5;->j1(I)V

    .line 5
    invoke-virtual {p0, v1}, Lr5;->k1(I)V

    .line 6
    invoke-virtual {p0}, Lr5;->I()Lr5;

    move-result-object p1

    invoke-virtual {p1}, Lr5;->v()I

    move-result p1

    invoke-virtual {p0, p1}, Lr5;->I0(I)V

    .line 7
    invoke-virtual {p0, v1}, Lr5;->h1(I)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v1}, Lr5;->j1(I)V

    .line 9
    invoke-virtual {p0, p1}, Lr5;->k1(I)V

    .line 10
    invoke-virtual {p0}, Lr5;->I()Lr5;

    move-result-object p1

    invoke-virtual {p1}, Lr5;->U()I

    move-result p1

    invoke-virtual {p0, p1}, Lr5;->h1(I)V

    .line 11
    invoke-virtual {p0, v1}, Lr5;->I0(I)V

    :goto_0
    return-void
.end method

.method public o1()Lq5;
    .locals 1

    .line 1
    iget-object v0, p0, Lt5;->y0:Lq5;

    return-object v0
.end method

.method public p1()I
    .locals 1

    .line 1
    iget v0, p0, Lt5;->z0:I

    return v0
.end method

.method public q1()I
    .locals 1

    .line 1
    iget v0, p0, Lt5;->w0:I

    return v0
.end method

.method public r1()I
    .locals 1

    .line 1
    iget v0, p0, Lt5;->x0:I

    return v0
.end method

.method public s1()F
    .locals 1

    .line 1
    iget v0, p0, Lt5;->v0:F

    return v0
.end method

.method public t1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt5;->y0:Lq5;

    invoke-virtual {v0, p1}, Lq5;->s(I)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lt5;->A0:Z

    return-void
.end method

.method public u1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 1
    iput v1, p0, Lt5;->v0:F

    .line 2
    iput p1, p0, Lt5;->w0:I

    .line 3
    iput v0, p0, Lt5;->x0:I

    :cond_0
    return-void
.end method

.method public v1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 1
    iput v1, p0, Lt5;->v0:F

    .line 2
    iput v0, p0, Lt5;->w0:I

    .line 3
    iput p1, p0, Lt5;->x0:I

    :cond_0
    return-void
.end method

.method public w1(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 1
    iput p1, p0, Lt5;->v0:F

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lt5;->w0:I

    .line 3
    iput p1, p0, Lt5;->x0:I

    :cond_0
    return-void
.end method

.method public x1(I)V
    .locals 3

    .line 1
    iget v0, p0, Lt5;->z0:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lt5;->z0:I

    .line 3
    iget-object p1, p0, Lr5;->U:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget p1, p0, Lt5;->z0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lr5;->L:Lq5;

    iput-object p1, p0, Lt5;->y0:Lq5;

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lr5;->M:Lq5;

    iput-object p1, p0, Lt5;->y0:Lq5;

    .line 7
    :goto_0
    iget-object p1, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v0, p0, Lt5;->y0:Lq5;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p1, p0, Lr5;->T:[Lq5;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    .line 9
    iget-object v1, p0, Lr5;->T:[Lq5;

    iget-object v2, p0, Lt5;->y0:Lq5;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
