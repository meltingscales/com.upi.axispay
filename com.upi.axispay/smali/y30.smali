.class public final Ly30;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lz30;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(CLjava/lang/StringBuilder;)V
    .locals 2

    const/16 v0, 0x20

    if-lt p0, v0, :cond_0

    const/16 v0, 0x3f

    if-gt p0, v0, :cond_0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const/16 v0, 0x40

    if-lt p0, v0, :cond_1

    const/16 v1, 0x5e

    if-gt p0, v1, :cond_1

    sub-int/2addr p0, v0

    int-to-char p0, p0

    .line 2
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 3
    :cond_1
    invoke-static {p0}, Lc40;->e(C)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static c(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    .line 2
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/4 v3, 0x2

    if-lt v0, v3, :cond_0

    const/4 v4, 0x1

    .line 3
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    const/4 v5, 0x3

    if-lt v0, v5, :cond_1

    .line 4
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    goto :goto_1

    :cond_1
    move v6, v1

    :goto_1
    const/4 v7, 0x4

    if-lt v0, v7, :cond_2

    .line 5
    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    :cond_2
    shl-int/lit8 p0, v2, 0x12

    shl-int/lit8 v2, v4, 0xc

    add-int/2addr p0, v2

    shl-int/lit8 v2, v6, 0x6

    add-int/2addr p0, v2

    add-int/2addr p0, v1

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-char v1, v1

    shr-int/lit8 v2, p0, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-char v2, v2

    and-int/lit16 p0, p0, 0xff

    int-to-char p0, p0

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 7
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-lt v0, v3, :cond_3

    .line 8
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    if-lt v0, v5, :cond_4

    .line 9
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 11
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const v0, 0x3dc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(La40;Ljava/lang/CharSequence;)V
    .locals 8

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 2
    invoke-virtual {p0, v1}, La40;->o(I)V

    return-void

    :cond_0
    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    .line 3
    :try_start_1
    invoke-virtual {p0}, La40;->p()V

    .line 4
    invoke-virtual {p0}, La40;->g()Ld40;

    move-result-object v5

    invoke-virtual {v5}, Ld40;->a()I

    move-result v5

    invoke-virtual {p0}, La40;->a()I

    move-result v6

    sub-int/2addr v5, v6

    .line 5
    invoke-virtual {p0}, La40;->f()I

    move-result v6

    if-le v6, v5, :cond_1

    .line 6
    invoke-virtual {p0}, La40;->a()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {p0, v5}, La40;->q(I)V

    .line 7
    invoke-virtual {p0}, La40;->g()Ld40;

    move-result-object v5

    invoke-virtual {v5}, Ld40;->a()I

    move-result v5

    invoke-virtual {p0}, La40;->a()I

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-int/2addr v5, v7

    :cond_1
    if-gt v6, v5, :cond_2

    if-gt v5, v3, :cond_2

    .line 8
    invoke-virtual {p0, v1}, La40;->o(I)V

    return-void

    :cond_2
    const/4 v5, 0x4

    if-gt v2, v5, :cond_6

    sub-int/2addr v2, v4

    .line 9
    :try_start_2
    invoke-static {p1}, Ly30;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {p0}, La40;->i()Z

    move-result v5

    xor-int/2addr v5, v4

    if-eqz v5, :cond_3

    if-gt v2, v3, :cond_3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    if-gt v2, v3, :cond_4

    .line 11
    invoke-virtual {p0}, La40;->a()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {p0, v3}, La40;->q(I)V

    .line 12
    invoke-virtual {p0}, La40;->g()Ld40;

    move-result-object v3

    invoke-virtual {v3}, Ld40;->a()I

    move-result v3

    invoke-virtual {p0}, La40;->a()I

    move-result v5

    sub-int/2addr v3, v5

    const/4 v5, 0x3

    if-lt v3, v5, :cond_4

    .line 13
    invoke-virtual {p0}, La40;->a()I

    move-result v3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p0, v3}, La40;->q(I)V

    move v4, v1

    :cond_4
    if-eqz v4, :cond_5

    .line 14
    invoke-virtual {p0}, La40;->k()V

    .line 15
    iget p1, p0, La40;->f:I

    sub-int/2addr p1, v2

    iput p1, p0, La40;->f:I

    goto :goto_1

    .line 16
    :cond_5
    invoke-virtual {p0, p1}, La40;->s(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17
    :goto_1
    invoke-virtual {p0, v1}, La40;->o(I)V

    return-void

    .line 18
    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x3dd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 19
    invoke-virtual {p0, v1}, La40;->o(I)V

    .line 20
    throw p1
.end method


# virtual methods
.method public a(La40;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    :cond_0
    invoke-virtual {p1}, La40;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p1}, La40;->c()C

    move-result v1

    .line 4
    invoke-static {v1, v0}, Ly30;->b(CLjava/lang/StringBuilder;)V

    .line 5
    iget v1, p1, La40;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, La40;->f:I

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    .line 7
    invoke-static {v0}, Ly30;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, La40;->s(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {p1}, La40;->d()Ljava/lang/String;

    move-result-object v2

    iget v3, p1, La40;->f:I

    invoke-virtual {p0}, Ly30;->d()I

    move-result v4

    invoke-static {v2, v3, v4}, Lc40;->n(Ljava/lang/CharSequence;II)I

    move-result v2

    .line 10
    invoke-virtual {p0}, Ly30;->d()I

    move-result v3

    if-eq v2, v3, :cond_0

    .line 11
    invoke-virtual {p1, v1}, La40;->o(I)V

    :cond_1
    const/16 v1, 0x1f

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    invoke-static {p1, v0}, Ly30;->e(La40;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
