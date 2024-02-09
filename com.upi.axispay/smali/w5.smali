.class public Lw5;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static a:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    .line 1
    sput-object v0, Lw5;->a:[Z

    return-void
.end method

.method public static a(Ls5;Lz4;Lr5;)V
    .locals 6

    const/4 v0, -0x1

    .line 1
    iput v0, p2, Lr5;->q:I

    .line 2
    iput v0, p2, Lr5;->r:I

    .line 3
    iget-object v0, p0, Lr5;->W:[Lr5$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Lr5$b;->c:Lr5$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Lr5;->W:[Lr5$b;

    aget-object v0, v0, v1

    sget-object v1, Lr5$b;->e:Lr5$b;

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p2, Lr5;->L:Lq5;

    iget v0, v0, Lq5;->g:I

    .line 5
    invoke-virtual {p0}, Lr5;->U()I

    move-result v1

    iget-object v4, p2, Lr5;->N:Lq5;

    iget v4, v4, Lq5;->g:I

    sub-int/2addr v1, v4

    .line 6
    iget-object v4, p2, Lr5;->L:Lq5;

    invoke-virtual {p1, v4}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v5

    iput-object v5, v4, Lq5;->i:Le5;

    .line 7
    iget-object v4, p2, Lr5;->N:Lq5;

    invoke-virtual {p1, v4}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v5

    iput-object v5, v4, Lq5;->i:Le5;

    .line 8
    iget-object v4, p2, Lr5;->L:Lq5;

    iget-object v4, v4, Lq5;->i:Le5;

    invoke-virtual {p1, v4, v0}, Lz4;->f(Le5;I)V

    .line 9
    iget-object v4, p2, Lr5;->N:Lq5;

    iget-object v4, v4, Lq5;->i:Le5;

    invoke-virtual {p1, v4, v1}, Lz4;->f(Le5;I)V

    .line 10
    iput v3, p2, Lr5;->q:I

    .line 11
    invoke-virtual {p2, v0, v1}, Lr5;->L0(II)V

    .line 12
    :cond_0
    iget-object v0, p0, Lr5;->W:[Lr5$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Lr5;->W:[Lr5$b;

    aget-object v0, v0, v1

    sget-object v1, Lr5$b;->e:Lr5$b;

    if-ne v0, v1, :cond_3

    .line 13
    iget-object v0, p2, Lr5;->M:Lq5;

    iget v0, v0, Lq5;->g:I

    .line 14
    invoke-virtual {p0}, Lr5;->v()I

    move-result p0

    iget-object v1, p2, Lr5;->O:Lq5;

    iget v1, v1, Lq5;->g:I

    sub-int/2addr p0, v1

    .line 15
    iget-object v1, p2, Lr5;->M:Lq5;

    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v2

    iput-object v2, v1, Lq5;->i:Le5;

    .line 16
    iget-object v1, p2, Lr5;->O:Lq5;

    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v2

    iput-object v2, v1, Lq5;->i:Le5;

    .line 17
    iget-object v1, p2, Lr5;->M:Lq5;

    iget-object v1, v1, Lq5;->i:Le5;

    invoke-virtual {p1, v1, v0}, Lz4;->f(Le5;I)V

    .line 18
    iget-object v1, p2, Lr5;->O:Lq5;

    iget-object v1, v1, Lq5;->i:Le5;

    invoke-virtual {p1, v1, p0}, Lz4;->f(Le5;I)V

    .line 19
    iget v1, p2, Lr5;->e0:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Lr5;->T()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    .line 20
    :cond_1
    iget-object v1, p2, Lr5;->P:Lq5;

    invoke-virtual {p1, v1}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v2

    iput-object v2, v1, Lq5;->i:Le5;

    .line 21
    iget-object v1, p2, Lr5;->P:Lq5;

    iget-object v1, v1, Lq5;->i:Le5;

    iget v2, p2, Lr5;->e0:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Lz4;->f(Le5;I)V

    .line 22
    :cond_2
    iput v3, p2, Lr5;->r:I

    .line 23
    invoke-virtual {p2, v0, p0}, Lr5;->c1(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
