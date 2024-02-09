.class public final Lq40;
.super Lx40;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx40;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;)[Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xc

    if-eq v1, v2, :cond_2

    const/16 v3, 0xd

    if-ne v1, v3, :cond_1

    .line 2
    :try_start_0
    invoke-static {p1}, Lw40;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x2531

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lz20; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x2532

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x2533

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_2
    :try_start_1
    invoke-static {p1}, Lw40;->b(Ljava/lang/CharSequence;)I

    move-result v1
    :try_end_1
    .catch Lz20; {:try_start_1 .. :try_end_1} :catch_1

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    :goto_0
    invoke-static {p1}, Lu40;->c(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    .line 10
    sget-object v5, Lp40;->f:[I

    aget v3, v5, v3

    const/16 v5, 0x5f

    new-array v5, v5, [Z

    .line 11
    sget-object v6, Lw40;->a:[I

    const/4 v7, 0x1

    invoke-static {v5, v1, v6, v7}, Lu40;->b([ZI[IZ)I

    move-result v6

    add-int/2addr v6, v1

    move v8, v7

    :goto_1
    const/4 v9, 0x6

    if-gt v8, v9, :cond_4

    .line 12
    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v9

    rsub-int/lit8 v10, v8, 0x6

    shr-int v10, v3, v10

    and-int/2addr v10, v7

    if-ne v10, v7, :cond_3

    add-int/lit8 v9, v9, 0xa

    .line 13
    :cond_3
    sget-object v10, Lw40;->e:[[I

    aget-object v9, v10, v9

    invoke-static {v5, v6, v9, v1}, Lu40;->b([ZI[IZ)I

    move-result v9

    add-int/2addr v6, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 14
    :cond_4
    sget-object v3, Lw40;->b:[I

    invoke-static {v5, v6, v3, v1}, Lu40;->b([ZI[IZ)I

    move-result v1

    add-int/2addr v6, v1

    const/4 v1, 0x7

    :goto_2
    if-gt v1, v2, :cond_5

    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    .line 16
    sget-object v8, Lw40;->d:[[I

    aget-object v3, v8, v3

    invoke-static {v5, v6, v3, v7}, Lu40;->b([ZI[IZ)I

    move-result v3

    add-int/2addr v6, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 17
    :cond_5
    sget-object p1, Lw40;->a:[I

    invoke-static {v5, v6, p1, v7}, Lu40;->b([ZI[IZ)I

    return-object v5

    :catch_1
    move-exception p1

    .line 18
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public f()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lw20;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lw20;->i:Lw20;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
