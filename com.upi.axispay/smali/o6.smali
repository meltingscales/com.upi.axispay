.class public abstract Lo6;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lc6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6$b;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lr5;

.field public c:Ll6;

.field public d:Lr5$b;

.field public e:Lf6;

.field public f:I

.field public g:Z

.field public h:Le6;

.field public i:Le6;

.field public j:Lo6$b;


# direct methods
.method public constructor <init>(Lr5;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lf6;

    invoke-direct {v0, p0}, Lf6;-><init>(Lo6;)V

    iput-object v0, p0, Lo6;->e:Lf6;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lo6;->f:I

    .line 4
    iput-boolean v0, p0, Lo6;->g:Z

    .line 5
    new-instance v0, Le6;

    invoke-direct {v0, p0}, Le6;-><init>(Lo6;)V

    iput-object v0, p0, Lo6;->h:Le6;

    .line 6
    new-instance v0, Le6;

    invoke-direct {v0, p0}, Le6;-><init>(Lo6;)V

    iput-object v0, p0, Lo6;->i:Le6;

    .line 7
    sget-object v0, Lo6$b;->b:Lo6$b;

    iput-object v0, p0, Lo6;->j:Lo6$b;

    .line 8
    iput-object p1, p0, Lo6;->b:Lr5;

    return-void
.end method


# virtual methods
.method public a(Lc6;)V
    .locals 0

    return-void
.end method

.method public final b(Le6;Le6;I)V
    .locals 1

    .line 1
    iget-object v0, p1, Le6;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iput p3, p1, Le6;->f:I

    .line 3
    iget-object p2, p2, Le6;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Le6;Le6;ILf6;)V
    .locals 2

    .line 1
    iget-object v0, p1, Le6;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p1, Le6;->l:Ljava/util/List;

    iget-object v1, p0, Lo6;->e:Lf6;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iput p3, p1, Le6;->h:I

    .line 4
    iput-object p4, p1, Le6;->i:Lf6;

    .line 5
    iget-object p2, p2, Le6;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object p2, p4, Le6;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final g(II)I
    .locals 1

    if-nez p2, :cond_1

    .line 1
    iget-object p2, p0, Lo6;->b:Lr5;

    iget v0, p2, Lr5;->x:I

    .line 2
    iget p2, p2, Lr5;->w:I

    .line 3
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    .line 4
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    .line 5
    :cond_1
    iget-object p2, p0, Lo6;->b:Lr5;

    iget v0, p2, Lr5;->A:I

    .line 6
    iget p2, p2, Lr5;->z:I

    .line 7
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method public final h(Lq5;)Le6;
    .locals 3

    .line 1
    iget-object p1, p1, Lq5;->f:Lq5;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p1, Lq5;->d:Lr5;

    .line 3
    iget-object p1, p1, Lq5;->e:Lq5$b;

    .line 4
    sget-object v2, Lo6$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, v1, Lr5;->e:Lm6;

    .line 6
    iget-object v0, p1, Lo6;->i:Le6;

    goto :goto_0

    .line 7
    :cond_2
    iget-object p1, v1, Lr5;->e:Lm6;

    .line 8
    iget-object v0, p1, Lm6;->k:Le6;

    goto :goto_0

    .line 9
    :cond_3
    iget-object p1, v1, Lr5;->e:Lm6;

    .line 10
    iget-object v0, p1, Lo6;->h:Le6;

    goto :goto_0

    .line 11
    :cond_4
    iget-object p1, v1, Lr5;->d:Lk6;

    .line 12
    iget-object v0, p1, Lo6;->i:Le6;

    goto :goto_0

    .line 13
    :cond_5
    iget-object p1, v1, Lr5;->d:Lk6;

    .line 14
    iget-object v0, p1, Lo6;->h:Le6;

    :goto_0
    return-object v0
.end method

.method public final i(Lq5;I)Le6;
    .locals 2

    .line 1
    iget-object p1, p1, Lq5;->f:Lq5;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p1, Lq5;->d:Lr5;

    if-nez p2, :cond_1

    .line 3
    iget-object p2, v1, Lr5;->d:Lk6;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Lr5;->e:Lm6;

    .line 4
    :goto_0
    iget-object p1, p1, Lq5;->e:Lq5$b;

    .line 5
    sget-object v1, Lo6$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    iget-object v0, p2, Lo6;->i:Le6;

    goto :goto_1

    .line 7
    :cond_3
    iget-object v0, p2, Lo6;->h:Le6;

    :goto_1
    return-object v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object v0, p0, Lo6;->e:Lf6;

    iget-boolean v1, v0, Le6;->j:Z

    if-eqz v1, :cond_0

    .line 2
    iget v0, v0, Le6;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo6;->g:Z

    return v0
.end method

.method public final l(II)V
    .locals 7

    .line 1
    iget v0, p0, Lo6;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    iget-object v0, p0, Lo6;->b:Lr5;

    iget-object v3, v0, Lr5;->d:Lk6;

    iget-object v4, v3, Lo6;->d:Lr5$b;

    sget-object v5, Lr5$b;->d:Lr5$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, Lo6;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, Lr5;->e:Lm6;

    iget-object v6, v4, Lo6;->d:Lr5$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, Lo6;->a:I

    if-ne v4, p2, :cond_1

    goto/16 :goto_3

    :cond_1
    if-nez p1, :cond_2

    .line 3
    iget-object v3, v0, Lr5;->e:Lm6;

    .line 4
    :cond_2
    iget-object p2, v3, Lo6;->e:Lf6;

    iget-boolean p2, p2, Le6;->j:Z

    if-eqz p2, :cond_9

    .line 5
    invoke-virtual {v0}, Lr5;->t()F

    move-result p2

    if-ne p1, v1, :cond_3

    .line 6
    iget-object p1, v3, Lo6;->e:Lf6;

    iget p1, p1, Le6;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    .line 7
    :cond_3
    iget-object p1, v3, Lo6;->e:Lf6;

    iget p1, p1, Le6;->g:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    .line 8
    :goto_0
    iget-object p2, p0, Lo6;->e:Lf6;

    invoke-virtual {p2, p1}, Lf6;->d(I)V

    goto :goto_3

    .line 9
    :cond_4
    iget-object p2, p0, Lo6;->b:Lr5;

    invoke-virtual {p2}, Lr5;->I()Lr5;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    .line 10
    iget-object p2, p2, Lr5;->d:Lk6;

    goto :goto_1

    :cond_5
    iget-object p2, p2, Lr5;->e:Lm6;

    .line 11
    :goto_1
    iget-object p2, p2, Lo6;->e:Lf6;

    iget-boolean v0, p2, Le6;->j:Z

    if-eqz v0, :cond_9

    .line 12
    iget-object v0, p0, Lo6;->b:Lr5;

    if-nez p1, :cond_6

    iget v0, v0, Lr5;->y:F

    goto :goto_2

    :cond_6
    iget v0, v0, Lr5;->B:F

    .line 13
    :goto_2
    iget p2, p2, Le6;->g:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    .line 14
    iget-object v0, p0, Lo6;->e:Lf6;

    invoke-virtual {p0, p2, p1}, Lo6;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lf6;->d(I)V

    goto :goto_3

    .line 15
    :cond_7
    iget-object v0, p0, Lo6;->e:Lf6;

    iget v0, v0, Lf6;->m:I

    invoke-virtual {p0, v0, p1}, Lo6;->g(II)I

    move-result p1

    .line 16
    iget-object v0, p0, Lo6;->e:Lf6;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lf6;->d(I)V

    goto :goto_3

    .line 17
    :cond_8
    iget-object v0, p0, Lo6;->e:Lf6;

    invoke-virtual {p0, p2, p1}, Lo6;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lf6;->d(I)V

    :cond_9
    :goto_3
    return-void
.end method

.method public abstract m()Z
.end method

.method public n(Lc6;Lq5;Lq5;I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Lo6;->h(Lq5;)Le6;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p3}, Lo6;->h(Lq5;)Le6;

    move-result-object v0

    .line 3
    iget-boolean v1, p1, Le6;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Le6;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget v1, p1, Le6;->g:I

    invoke-virtual {p2}, Lq5;->e()I

    move-result p2

    add-int/2addr v1, p2

    .line 5
    iget p2, v0, Le6;->g:I

    invoke-virtual {p3}, Lq5;->e()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    .line 6
    iget-object v2, p0, Lo6;->e:Lf6;

    iget-boolean v2, v2, Le6;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lo6;->d:Lr5$b;

    sget-object v3, Lr5$b;->d:Lr5$b;

    if-ne v2, v3, :cond_1

    .line 7
    invoke-virtual {p0, p4, p3}, Lo6;->l(II)V

    .line 8
    :cond_1
    iget-object v2, p0, Lo6;->e:Lf6;

    iget-boolean v3, v2, Le6;->j:Z

    if-nez v3, :cond_2

    return-void

    .line 9
    :cond_2
    iget v2, v2, Le6;->g:I

    if-ne v2, p3, :cond_3

    .line 10
    iget-object p1, p0, Lo6;->h:Le6;

    invoke-virtual {p1, v1}, Le6;->d(I)V

    .line 11
    iget-object p1, p0, Lo6;->i:Le6;

    invoke-virtual {p1, p2}, Le6;->d(I)V

    return-void

    .line 12
    :cond_3
    iget-object p3, p0, Lo6;->b:Lr5;

    if-nez p4, :cond_4

    invoke-virtual {p3}, Lr5;->w()F

    move-result p3

    goto :goto_0

    .line 13
    :cond_4
    invoke-virtual {p3}, Lr5;->P()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    .line 14
    iget v1, p1, Le6;->g:I

    .line 15
    iget p2, v0, Le6;->g:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    .line 16
    iget-object p1, p0, Lo6;->e:Lf6;

    iget p1, p1, Le6;->g:I

    sub-int/2addr p2, p1

    .line 17
    iget-object p1, p0, Lo6;->h:Le6;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Le6;->d(I)V

    .line 18
    iget-object p1, p0, Lo6;->i:Le6;

    iget-object p2, p0, Lo6;->h:Le6;

    iget p2, p2, Le6;->g:I

    iget-object p3, p0, Lo6;->e:Lf6;

    iget p3, p3, Le6;->g:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Le6;->d(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public o(Lc6;)V
    .locals 0

    return-void
.end method

.method public p(Lc6;)V
    .locals 0

    return-void
.end method
