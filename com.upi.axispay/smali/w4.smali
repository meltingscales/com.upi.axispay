.class public Lw4;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lx4$a;


# static fields
.field public static l:F


# instance fields
.field public a:I

.field public final b:Lx4;

.field public final c:Ly4;

.field public d:I

.field public e:Le5;

.field public f:[I

.field public g:[I

.field public h:[F

.field public i:I

.field public j:I

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lw4;

    const v1, 0x181

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Lx4;Ly4;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lw4;->a:I

    const/16 v1, 0x8

    .line 3
    iput v1, p0, Lw4;->d:I

    const/4 v2, 0x0

    .line 4
    iput-object v2, p0, Lw4;->e:Le5;

    new-array v2, v1, [I

    .line 5
    iput-object v2, p0, Lw4;->f:[I

    new-array v2, v1, [I

    .line 6
    iput-object v2, p0, Lw4;->g:[I

    new-array v1, v1, [F

    .line 7
    iput-object v1, p0, Lw4;->h:[F

    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lw4;->i:I

    .line 9
    iput v1, p0, Lw4;->j:I

    .line 10
    iput-boolean v0, p0, Lw4;->k:Z

    .line 11
    iput-object p1, p0, Lw4;->b:Lx4;

    .line 12
    iput-object p2, p0, Lw4;->c:Ly4;

    return-void
.end method


# virtual methods
.method public a(I)F
    .locals 3

    .line 1
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    .line 2
    iget v2, p0, Lw4;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    .line 3
    iget-object p1, p0, Lw4;->h:[F

    aget p1, p1, v0

    return p1

    .line 4
    :cond_0
    iget-object v2, p0, Lw4;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Le5;Z)F
    .locals 8

    .line 1
    iget-object v0, p0, Lw4;->e:Le5;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw4;->e:Le5;

    .line 3
    :cond_0
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-eq v0, v2, :cond_6

    .line 4
    iget v5, p0, Lw4;->a:I

    if-ge v3, v5, :cond_6

    .line 5
    iget-object v5, p0, Lw4;->f:[I

    aget v5, v5, v0

    .line 6
    iget v6, p1, Le5;->d:I

    if-ne v5, v6, :cond_5

    .line 7
    iget v1, p0, Lw4;->i:I

    if-ne v0, v1, :cond_2

    .line 8
    iget-object v1, p0, Lw4;->g:[I

    aget v1, v1, v0

    iput v1, p0, Lw4;->i:I

    goto :goto_1

    .line 9
    :cond_2
    iget-object v1, p0, Lw4;->g:[I

    aget v3, v1, v0

    aput v3, v1, v4

    :goto_1
    if-eqz p2, :cond_3

    .line 10
    iget-object p2, p0, Lw4;->b:Lx4;

    invoke-virtual {p1, p2}, Le5;->d(Lx4;)V

    .line 11
    :cond_3
    iget p2, p1, Le5;->n:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Le5;->n:I

    .line 12
    iget p1, p0, Lw4;->a:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lw4;->a:I

    .line 13
    iget-object p1, p0, Lw4;->f:[I

    aput v2, p1, v0

    .line 14
    iget-boolean p1, p0, Lw4;->k:Z

    if-eqz p1, :cond_4

    .line 15
    iput v0, p0, Lw4;->j:I

    .line 16
    :cond_4
    iget-object p1, p0, Lw4;->h:[F

    aget p1, p1, v0

    return p1

    .line 17
    :cond_5
    iget-object v4, p0, Lw4;->g:[I

    aget v4, v4, v0

    add-int/lit8 v3, v3, 0x1

    move v7, v4

    move v4, v0

    move v0, v7

    goto :goto_0

    :cond_6
    return v1
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lw4;->a:I

    return v0
.end method

.method public final clear()V
    .locals 5

    .line 1
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    .line 2
    iget v4, p0, Lw4;->a:I

    if-ge v2, v4, :cond_1

    .line 3
    iget-object v3, p0, Lw4;->c:Ly4;

    iget-object v3, v3, Ly4;->d:[Le5;

    iget-object v4, p0, Lw4;->f:[I

    aget v4, v4, v0

    aget-object v3, v3, v4

    if-eqz v3, :cond_0

    .line 4
    iget-object v4, p0, Lw4;->b:Lx4;

    invoke-virtual {v3, v4}, Le5;->d(Lx4;)V

    .line 5
    :cond_0
    iget-object v3, p0, Lw4;->g:[I

    aget v0, v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_1
    iput v3, p0, Lw4;->i:I

    .line 7
    iput v3, p0, Lw4;->j:I

    .line 8
    iput-boolean v1, p0, Lw4;->k:Z

    .line 9
    iput v1, p0, Lw4;->a:I

    return-void
.end method

.method public final d(Le5;)F
    .locals 4

    .line 1
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    .line 2
    iget v2, p0, Lw4;->a:I

    if-ge v1, v2, :cond_1

    .line 3
    iget-object v2, p0, Lw4;->f:[I

    aget v2, v2, v0

    iget v3, p1, Le5;->d:I

    if-ne v2, v3, :cond_0

    .line 4
    iget-object p1, p0, Lw4;->h:[F

    aget p1, p1, v0

    return p1

    .line 5
    :cond_0
    iget-object v2, p0, Lw4;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public e(Le5;)Z
    .locals 6

    .line 1
    iget v0, p0, Lw4;->i:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    move v3, v2

    :goto_0
    if-eq v0, v1, :cond_2

    .line 2
    iget v4, p0, Lw4;->a:I

    if-ge v3, v4, :cond_2

    .line 3
    iget-object v4, p0, Lw4;->f:[I

    aget v4, v4, v0

    iget v5, p1, Le5;->d:I

    if-ne v4, v5, :cond_1

    const/4 p1, 0x1

    return p1

    .line 4
    :cond_1
    iget-object v4, p0, Lw4;->g:[I

    aget v0, v4, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public f(Lx4;Z)F
    .locals 5

    .line 1
    iget-object v0, p1, Lx4;->a:Le5;

    invoke-virtual {p0, v0}, Lw4;->d(Le5;)F

    move-result v0

    .line 2
    iget-object v1, p1, Lx4;->a:Le5;

    invoke-virtual {p0, v1, p2}, Lw4;->b(Le5;Z)F

    .line 3
    iget-object p1, p1, Lx4;->e:Lx4$a;

    .line 4
    invoke-interface {p1}, Lx4$a;->c()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 5
    invoke-interface {p1, v2}, Lx4$a;->h(I)Le5;

    move-result-object v3

    .line 6
    invoke-interface {p1, v3}, Lx4$a;->d(Le5;)F

    move-result v4

    mul-float/2addr v4, v0

    .line 7
    invoke-virtual {p0, v3, v4, p2}, Lw4;->i(Le5;FZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final g(Le5;F)V
    .locals 9

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 1
    invoke-virtual {p0, p1, v1}, Lw4;->b(Le5;Z)F

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lw4;->i:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    .line 3
    iput v2, p0, Lw4;->i:I

    .line 4
    iget-object v0, p0, Lw4;->h:[F

    aput p2, v0, v2

    .line 5
    iget-object p2, p0, Lw4;->f:[I

    iget v0, p1, Le5;->d:I

    aput v0, p2, v2

    .line 6
    iget-object p2, p0, Lw4;->g:[I

    aput v3, p2, v2

    .line 7
    iget p2, p1, Le5;->n:I

    add-int/2addr p2, v1

    iput p2, p1, Le5;->n:I

    .line 8
    iget-object p2, p0, Lw4;->b:Lx4;

    invoke-virtual {p1, p2}, Le5;->a(Lx4;)V

    .line 9
    iget p1, p0, Lw4;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Lw4;->a:I

    .line 10
    iget-boolean p1, p0, Lw4;->k:Z

    if-nez p1, :cond_1

    .line 11
    iget p1, p0, Lw4;->j:I

    add-int/2addr p1, v1

    iput p1, p0, Lw4;->j:I

    .line 12
    iget-object p2, p0, Lw4;->f:[I

    array-length v0, p2

    if-lt p1, v0, :cond_1

    .line 13
    iput-boolean v1, p0, Lw4;->k:Z

    .line 14
    array-length p1, p2

    sub-int/2addr p1, v1

    iput p1, p0, Lw4;->j:I

    :cond_1
    return-void

    :cond_2
    move v4, v2

    move v5, v3

    :goto_0
    if-eq v0, v3, :cond_5

    .line 15
    iget v6, p0, Lw4;->a:I

    if-ge v4, v6, :cond_5

    .line 16
    iget-object v6, p0, Lw4;->f:[I

    aget v7, v6, v0

    iget v8, p1, Le5;->d:I

    if-ne v7, v8, :cond_3

    .line 17
    iget-object p1, p0, Lw4;->h:[F

    aput p2, p1, v0

    return-void

    .line 18
    :cond_3
    aget v6, v6, v0

    if-ge v6, v8, :cond_4

    move v5, v0

    .line 19
    :cond_4
    iget-object v6, p0, Lw4;->g:[I

    aget v0, v6, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 20
    :cond_5
    iget v0, p0, Lw4;->j:I

    add-int/lit8 v4, v0, 0x1

    .line 21
    iget-boolean v6, p0, Lw4;->k:Z

    if-eqz v6, :cond_7

    .line 22
    iget-object v4, p0, Lw4;->f:[I

    aget v6, v4, v0

    if-ne v6, v3, :cond_6

    goto :goto_1

    .line 23
    :cond_6
    array-length v0, v4

    goto :goto_1

    :cond_7
    move v0, v4

    .line 24
    :goto_1
    iget-object v4, p0, Lw4;->f:[I

    array-length v6, v4

    if-lt v0, v6, :cond_9

    .line 25
    iget v6, p0, Lw4;->a:I

    array-length v4, v4

    if-ge v6, v4, :cond_9

    move v4, v2

    .line 26
    :goto_2
    iget-object v6, p0, Lw4;->f:[I

    array-length v7, v6

    if-ge v4, v7, :cond_9

    .line 27
    aget v6, v6, v4

    if-ne v6, v3, :cond_8

    move v0, v4

    goto :goto_3

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 28
    :cond_9
    :goto_3
    iget-object v4, p0, Lw4;->f:[I

    array-length v6, v4

    if-lt v0, v6, :cond_a

    .line 29
    array-length v0, v4

    .line 30
    iget v4, p0, Lw4;->d:I

    mul-int/lit8 v4, v4, 0x2

    iput v4, p0, Lw4;->d:I

    .line 31
    iput-boolean v2, p0, Lw4;->k:Z

    add-int/lit8 v2, v0, -0x1

    .line 32
    iput v2, p0, Lw4;->j:I

    .line 33
    iget-object v2, p0, Lw4;->h:[F

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v2

    iput-object v2, p0, Lw4;->h:[F

    .line 34
    iget-object v2, p0, Lw4;->f:[I

    iget v4, p0, Lw4;->d:I

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lw4;->f:[I

    .line 35
    iget-object v2, p0, Lw4;->g:[I

    iget v4, p0, Lw4;->d:I

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lw4;->g:[I

    .line 36
    :cond_a
    iget-object v2, p0, Lw4;->f:[I

    iget v4, p1, Le5;->d:I

    aput v4, v2, v0

    .line 37
    iget-object v2, p0, Lw4;->h:[F

    aput p2, v2, v0

    if-eq v5, v3, :cond_b

    .line 38
    iget-object p2, p0, Lw4;->g:[I

    aget v2, p2, v5

    aput v2, p2, v0

    .line 39
    aput v0, p2, v5

    goto :goto_4

    .line 40
    :cond_b
    iget-object p2, p0, Lw4;->g:[I

    iget v2, p0, Lw4;->i:I

    aput v2, p2, v0

    .line 41
    iput v0, p0, Lw4;->i:I

    .line 42
    :goto_4
    iget p2, p1, Le5;->n:I

    add-int/2addr p2, v1

    iput p2, p1, Le5;->n:I

    .line 43
    iget-object p2, p0, Lw4;->b:Lx4;

    invoke-virtual {p1, p2}, Le5;->a(Lx4;)V

    .line 44
    iget p1, p0, Lw4;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Lw4;->a:I

    .line 45
    iget-boolean p2, p0, Lw4;->k:Z

    if-nez p2, :cond_c

    .line 46
    iget p2, p0, Lw4;->j:I

    add-int/2addr p2, v1

    iput p2, p0, Lw4;->j:I

    .line 47
    :cond_c
    iget-object p2, p0, Lw4;->f:[I

    array-length v0, p2

    if-lt p1, v0, :cond_d

    .line 48
    iput-boolean v1, p0, Lw4;->k:Z

    .line 49
    :cond_d
    iget p1, p0, Lw4;->j:I

    array-length v0, p2

    if-lt p1, v0, :cond_e

    .line 50
    iput-boolean v1, p0, Lw4;->k:Z

    .line 51
    array-length p1, p2

    sub-int/2addr p1, v1

    iput p1, p0, Lw4;->j:I

    :cond_e
    return-void
.end method

.method public h(I)Le5;
    .locals 3

    .line 1
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    .line 2
    iget v2, p0, Lw4;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    .line 3
    iget-object p1, p0, Lw4;->c:Ly4;

    iget-object p1, p1, Ly4;->d:[Le5;

    iget-object v1, p0, Lw4;->f:[I

    aget v0, v1, v0

    aget-object p1, p1, v0

    return-object p1

    .line 4
    :cond_0
    iget-object v2, p0, Lw4;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public i(Le5;FZ)V
    .locals 9

    .line 1
    sget v0, Lw4;->l:F

    neg-float v1, v0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    .line 3
    iput v1, p0, Lw4;->i:I

    .line 4
    iget-object p3, p0, Lw4;->h:[F

    aput p2, p3, v1

    .line 5
    iget-object p2, p0, Lw4;->f:[I

    iget p3, p1, Le5;->d:I

    aput p3, p2, v1

    .line 6
    iget-object p2, p0, Lw4;->g:[I

    aput v2, p2, v1

    .line 7
    iget p2, p1, Le5;->n:I

    add-int/2addr p2, v3

    iput p2, p1, Le5;->n:I

    .line 8
    iget-object p2, p0, Lw4;->b:Lx4;

    invoke-virtual {p1, p2}, Le5;->a(Lx4;)V

    .line 9
    iget p1, p0, Lw4;->a:I

    add-int/2addr p1, v3

    iput p1, p0, Lw4;->a:I

    .line 10
    iget-boolean p1, p0, Lw4;->k:Z

    if-nez p1, :cond_1

    .line 11
    iget p1, p0, Lw4;->j:I

    add-int/2addr p1, v3

    iput p1, p0, Lw4;->j:I

    .line 12
    iget-object p2, p0, Lw4;->f:[I

    array-length p3, p2

    if-lt p1, p3, :cond_1

    .line 13
    iput-boolean v3, p0, Lw4;->k:Z

    .line 14
    array-length p1, p2

    sub-int/2addr p1, v3

    iput p1, p0, Lw4;->j:I

    :cond_1
    return-void

    :cond_2
    move v4, v1

    move v5, v2

    :goto_0
    if-eq v0, v2, :cond_a

    .line 15
    iget v6, p0, Lw4;->a:I

    if-ge v4, v6, :cond_a

    .line 16
    iget-object v6, p0, Lw4;->f:[I

    aget v7, v6, v0

    .line 17
    iget v8, p1, Le5;->d:I

    if-ne v7, v8, :cond_8

    .line 18
    iget-object v1, p0, Lw4;->h:[F

    aget v2, v1, v0

    add-float/2addr v2, p2

    .line 19
    sget p2, Lw4;->l:F

    neg-float v4, p2

    cmpl-float v4, v2, v4

    const/4 v6, 0x0

    if-lez v4, :cond_3

    cmpg-float p2, v2, p2

    if-gez p2, :cond_3

    move v2, v6

    .line 20
    :cond_3
    aput v2, v1, v0

    cmpl-float p2, v2, v6

    if-nez p2, :cond_7

    .line 21
    iget p2, p0, Lw4;->i:I

    if-ne v0, p2, :cond_4

    .line 22
    iget-object p2, p0, Lw4;->g:[I

    aget p2, p2, v0

    iput p2, p0, Lw4;->i:I

    goto :goto_1

    .line 23
    :cond_4
    iget-object p2, p0, Lw4;->g:[I

    aget v1, p2, v0

    aput v1, p2, v5

    :goto_1
    if-eqz p3, :cond_5

    .line 24
    iget-object p2, p0, Lw4;->b:Lx4;

    invoke-virtual {p1, p2}, Le5;->d(Lx4;)V

    .line 25
    :cond_5
    iget-boolean p2, p0, Lw4;->k:Z

    if-eqz p2, :cond_6

    .line 26
    iput v0, p0, Lw4;->j:I

    .line 27
    :cond_6
    iget p2, p1, Le5;->n:I

    sub-int/2addr p2, v3

    iput p2, p1, Le5;->n:I

    .line 28
    iget p1, p0, Lw4;->a:I

    sub-int/2addr p1, v3

    iput p1, p0, Lw4;->a:I

    :cond_7
    return-void

    .line 29
    :cond_8
    aget v6, v6, v0

    if-ge v6, v8, :cond_9

    move v5, v0

    .line 30
    :cond_9
    iget-object v6, p0, Lw4;->g:[I

    aget v0, v6, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 31
    :cond_a
    iget p3, p0, Lw4;->j:I

    add-int/lit8 v0, p3, 0x1

    .line 32
    iget-boolean v4, p0, Lw4;->k:Z

    if-eqz v4, :cond_c

    .line 33
    iget-object v0, p0, Lw4;->f:[I

    aget v4, v0, p3

    if-ne v4, v2, :cond_b

    goto :goto_2

    .line 34
    :cond_b
    array-length p3, v0

    goto :goto_2

    :cond_c
    move p3, v0

    .line 35
    :goto_2
    iget-object v0, p0, Lw4;->f:[I

    array-length v4, v0

    if-lt p3, v4, :cond_e

    .line 36
    iget v4, p0, Lw4;->a:I

    array-length v0, v0

    if-ge v4, v0, :cond_e

    move v0, v1

    .line 37
    :goto_3
    iget-object v4, p0, Lw4;->f:[I

    array-length v6, v4

    if-ge v0, v6, :cond_e

    .line 38
    aget v4, v4, v0

    if-ne v4, v2, :cond_d

    move p3, v0

    goto :goto_4

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 39
    :cond_e
    :goto_4
    iget-object v0, p0, Lw4;->f:[I

    array-length v4, v0

    if-lt p3, v4, :cond_f

    .line 40
    array-length p3, v0

    .line 41
    iget v0, p0, Lw4;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lw4;->d:I

    .line 42
    iput-boolean v1, p0, Lw4;->k:Z

    add-int/lit8 v1, p3, -0x1

    .line 43
    iput v1, p0, Lw4;->j:I

    .line 44
    iget-object v1, p0, Lw4;->h:[F

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Lw4;->h:[F

    .line 45
    iget-object v0, p0, Lw4;->f:[I

    iget v1, p0, Lw4;->d:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lw4;->f:[I

    .line 46
    iget-object v0, p0, Lw4;->g:[I

    iget v1, p0, Lw4;->d:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lw4;->g:[I

    .line 47
    :cond_f
    iget-object v0, p0, Lw4;->f:[I

    iget v1, p1, Le5;->d:I

    aput v1, v0, p3

    .line 48
    iget-object v0, p0, Lw4;->h:[F

    aput p2, v0, p3

    if-eq v5, v2, :cond_10

    .line 49
    iget-object p2, p0, Lw4;->g:[I

    aget v0, p2, v5

    aput v0, p2, p3

    .line 50
    aput p3, p2, v5

    goto :goto_5

    .line 51
    :cond_10
    iget-object p2, p0, Lw4;->g:[I

    iget v0, p0, Lw4;->i:I

    aput v0, p2, p3

    .line 52
    iput p3, p0, Lw4;->i:I

    .line 53
    :goto_5
    iget p2, p1, Le5;->n:I

    add-int/2addr p2, v3

    iput p2, p1, Le5;->n:I

    .line 54
    iget-object p2, p0, Lw4;->b:Lx4;

    invoke-virtual {p1, p2}, Le5;->a(Lx4;)V

    .line 55
    iget p1, p0, Lw4;->a:I

    add-int/2addr p1, v3

    iput p1, p0, Lw4;->a:I

    .line 56
    iget-boolean p1, p0, Lw4;->k:Z

    if-nez p1, :cond_11

    .line 57
    iget p1, p0, Lw4;->j:I

    add-int/2addr p1, v3

    iput p1, p0, Lw4;->j:I

    .line 58
    :cond_11
    iget p1, p0, Lw4;->j:I

    iget-object p2, p0, Lw4;->f:[I

    array-length p3, p2

    if-lt p1, p3, :cond_12

    .line 59
    iput-boolean v3, p0, Lw4;->k:Z

    .line 60
    array-length p1, p2

    sub-int/2addr p1, v3

    iput p1, p0, Lw4;->j:I

    :cond_12
    return-void
.end method

.method public j(F)V
    .locals 4

    .line 1
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 2
    iget v2, p0, Lw4;->a:I

    if-ge v1, v2, :cond_0

    .line 3
    iget-object v2, p0, Lw4;->h:[F

    aget v3, v2, v0

    div-float/2addr v3, p1

    aput v3, v2, v0

    .line 4
    iget-object v2, p0, Lw4;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k()V
    .locals 5

    .line 1
    iget v0, p0, Lw4;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 2
    iget v2, p0, Lw4;->a:I

    if-ge v1, v2, :cond_0

    .line 3
    iget-object v2, p0, Lw4;->h:[F

    aget v3, v2, v0

    const/high16 v4, -0x40800000    # -1.0f

    mul-float/2addr v3, v4

    aput v3, v2, v0

    .line 4
    iget-object v2, p0, Lw4;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lw4;->i:I

    const v1, 0x1001

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    .line 2
    iget v3, p0, Lw4;->a:I

    if-ge v2, v3, :cond_0

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x1002

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw4;->h:[F

    aget v1, v1, v0

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const v1, 0x1003

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw4;->c:Ly4;

    iget-object v1, v1, Ly4;->d:[Le5;

    iget-object v4, p0, Lw4;->f:[I

    aget v4, v4, v0

    aget-object v1, v1, v4

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 6
    iget-object v3, p0, Lw4;->g:[I

    aget v0, v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
