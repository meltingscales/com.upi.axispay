.class public final Lq30;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Lp30;

.field public final b:[I


# direct methods
.method public constructor <init>(Lp30;[I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    array-length v0, p2

    if-eqz v0, :cond_3

    .line 3
    iput-object p1, p0, Lq30;->a:Lp30;

    .line 4
    array-length p1, p2

    const/4 v0, 0x1

    if-le p1, v0, :cond_2

    const/4 v1, 0x0

    .line 5
    aget v2, p2, v1

    if-nez v2, :cond_2

    move v2, v0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 6
    aget v3, p2, v2

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-ne v2, p1, :cond_1

    new-array p1, v0, [I

    aput v1, p1, v1

    .line 7
    iput-object p1, p0, Lq30;->b:[I

    return-void

    :cond_1
    sub-int/2addr p1, v2

    .line 8
    new-array p1, p1, [I

    iput-object p1, p0, Lq30;->b:[I

    .line 9
    array-length v0, p1

    invoke-static {p2, v2, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 10
    :cond_2
    iput-object p2, p0, Lq30;->b:[I

    return-void

    .line 11
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(Lq30;)Lq30;
    .locals 7

    .line 1
    iget-object v0, p0, Lq30;->a:Lp30;

    iget-object v1, p1, Lq30;->a:Lp30;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    invoke-virtual {p0}, Lq30;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lq30;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 4
    :cond_1
    iget-object v0, p0, Lq30;->b:[I

    .line 5
    iget-object p1, p1, Lq30;->b:[I

    .line 6
    array-length v1, v0

    array-length v2, p1

    if-le v1, v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    .line 7
    :goto_0
    array-length v1, v0

    new-array v1, v1, [I

    .line 8
    array-length v2, v0

    array-length v3, p1

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    .line 9
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v3, v2

    .line 10
    :goto_1
    array-length v4, v0

    if-ge v3, v4, :cond_3

    sub-int v4, v3, v2

    .line 11
    aget v4, p1, v4

    aget v5, v0, v3

    invoke-static {v4, v5}, Lp30;->a(II)I

    move-result v4

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 12
    :cond_3
    new-instance p1, Lq30;

    iget-object v0, p0, Lq30;->a:Lp30;

    invoke-direct {p1, v0, v1}, Lq30;-><init>(Lp30;[I)V

    return-object p1

    .line 13
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x187b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lq30;)[Lq30;
    .locals 7

    .line 1
    iget-object v0, p0, Lq30;->a:Lp30;

    iget-object v1, p1, Lq30;->a:Lp30;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p1}, Lq30;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lq30;->a:Lp30;

    invoke-virtual {v0}, Lp30;->e()Lq30;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lq30;->e()I

    move-result v1

    invoke-virtual {p1, v1}, Lq30;->c(I)I

    move-result v1

    .line 5
    iget-object v2, p0, Lq30;->a:Lp30;

    invoke-virtual {v2, v1}, Lp30;->f(I)I

    move-result v1

    move-object v2, p0

    .line 6
    :goto_0
    invoke-virtual {v2}, Lq30;->e()I

    move-result v3

    invoke-virtual {p1}, Lq30;->e()I

    move-result v4

    if-lt v3, v4, :cond_0

    invoke-virtual {v2}, Lq30;->f()Z

    move-result v3

    if-nez v3, :cond_0

    .line 7
    invoke-virtual {v2}, Lq30;->e()I

    move-result v3

    invoke-virtual {p1}, Lq30;->e()I

    move-result v4

    sub-int/2addr v3, v4

    .line 8
    iget-object v4, p0, Lq30;->a:Lp30;

    invoke-virtual {v2}, Lq30;->e()I

    move-result v5

    invoke-virtual {v2, v5}, Lq30;->c(I)I

    move-result v5

    invoke-virtual {v4, v5, v1}, Lp30;->h(II)I

    move-result v4

    .line 9
    invoke-virtual {p1, v3, v4}, Lq30;->h(II)Lq30;

    move-result-object v5

    .line 10
    iget-object v6, p0, Lq30;->a:Lp30;

    invoke-virtual {v6, v3, v4}, Lp30;->b(II)Lq30;

    move-result-object v3

    .line 11
    invoke-virtual {v0, v3}, Lq30;->a(Lq30;)Lq30;

    move-result-object v0

    .line 12
    invoke-virtual {v2, v5}, Lq30;->a(Lq30;)Lq30;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Lq30;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const/4 v0, 0x1

    aput-object v2, p1, v0

    return-object p1

    .line 13
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x187c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x187d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lq30;->b:[I

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    aget p1, v0, v1

    return p1
.end method

.method public d()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lq30;->b:[I

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq30;->b:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public f()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq30;->b:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public g(Lq30;)Lq30;
    .locals 12

    .line 1
    iget-object v0, p0, Lq30;->a:Lp30;

    iget-object v1, p1, Lq30;->a:Lp30;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    invoke-virtual {p0}, Lq30;->f()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lq30;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    iget-object v0, p0, Lq30;->b:[I

    .line 4
    array-length v1, v0

    .line 5
    iget-object p1, p1, Lq30;->b:[I

    .line 6
    array-length v2, p1

    add-int v3, v1, v2

    add-int/lit8 v3, v3, -0x1

    .line 7
    new-array v3, v3, [I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_2

    .line 8
    aget v6, v0, v5

    move v7, v4

    :goto_1
    if-ge v7, v2, :cond_1

    add-int v8, v5, v7

    .line 9
    aget v9, v3, v8

    iget-object v10, p0, Lq30;->a:Lp30;

    aget v11, p1, v7

    .line 10
    invoke-virtual {v10, v6, v11}, Lp30;->h(II)I

    move-result v10

    .line 11
    invoke-static {v9, v10}, Lp30;->a(II)I

    move-result v9

    aput v9, v3, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 12
    :cond_2
    new-instance p1, Lq30;

    iget-object v0, p0, Lq30;->a:Lp30;

    invoke-direct {p1, v0, v3}, Lq30;-><init>(Lp30;[I)V

    return-object p1

    .line 13
    :cond_3
    :goto_2
    iget-object p1, p0, Lq30;->a:Lp30;

    invoke-virtual {p1}, Lp30;->e()Lq30;

    move-result-object p1

    return-object p1

    .line 14
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x187e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(II)Lq30;
    .locals 4

    if-ltz p1, :cond_2

    if-nez p2, :cond_0

    .line 1
    iget-object p1, p0, Lq30;->a:Lp30;

    invoke-virtual {p1}, Lp30;->e()Lq30;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lq30;->b:[I

    array-length v0, v0

    add-int/2addr p1, v0

    .line 3
    new-array p1, p1, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    iget-object v2, p0, Lq30;->a:Lp30;

    iget-object v3, p0, Lq30;->b:[I

    aget v3, v3, v1

    invoke-virtual {v2, v3, p2}, Lp30;->h(II)I

    move-result v2

    aput v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 5
    :cond_1
    new-instance p2, Lq30;

    iget-object v0, p0, Lq30;->a:Lp30;

    invoke-direct {p2, v0, p1}, Lq30;-><init>(Lp30;[I)V

    return-object p2

    .line 6
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lq30;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x187f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lq30;->e()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3
    invoke-virtual {p0}, Lq30;->e()I

    move-result v1

    :goto_0
    if-ltz v1, :cond_a

    .line 4
    invoke-virtual {p0, v1}, Lq30;->c(I)I

    move-result v2

    if-eqz v2, :cond_9

    if-gez v2, :cond_2

    .line 5
    invoke-virtual {p0}, Lq30;->e()I

    move-result v3

    if-ne v1, v3, :cond_1

    const v3, 0x1880

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const v3, 0x1881

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    neg-int v2, v2

    goto :goto_2

    .line 8
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_3

    const v3, 0x1882

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_2
    const/4 v3, 0x1

    if-eqz v1, :cond_4

    if-eq v2, v3, :cond_7

    .line 10
    :cond_4
    iget-object v4, p0, Lq30;->a:Lp30;

    invoke-virtual {v4, v2}, Lp30;->g(I)I

    move-result v2

    if-nez v2, :cond_5

    const/16 v2, 0x31

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    if-ne v2, v3, :cond_6

    const/16 v2, 0x61

    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    const v4, 0x1883

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_7
    :goto_3
    if-eqz v1, :cond_9

    if-ne v1, v3, :cond_8

    const/16 v2, 0x78

    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_8
    const v2, 0x1884

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_9
    :goto_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 18
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
