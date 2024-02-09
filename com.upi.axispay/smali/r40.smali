.class public final Lr40;
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
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x7

    if-eq v1, v2, :cond_2

    const/16 v3, 0x8

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

    const v0, 0x108a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lz20; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x108b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x108c

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

    const/16 v1, 0x43

    new-array v1, v1, [Z

    .line 9
    sget-object v3, Lw40;->a:[I

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v4, v3, v5}, Lu40;->b([ZI[IZ)I

    move-result v3

    add-int/2addr v3, v4

    move v6, v4

    :goto_1
    const/4 v7, 0x3

    const/16 v8, 0xa

    if-gt v6, v7, :cond_3

    .line 10
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v8}, Ljava/lang/Character;->digit(CI)I

    move-result v7

    .line 11
    sget-object v8, Lw40;->d:[[I

    aget-object v7, v8, v7

    invoke-static {v1, v3, v7, v4}, Lu40;->b([ZI[IZ)I

    move-result v7

    add-int/2addr v3, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 12
    :cond_3
    sget-object v6, Lw40;->b:[I

    invoke-static {v1, v3, v6, v4}, Lu40;->b([ZI[IZ)I

    move-result v4

    add-int/2addr v3, v4

    const/4 v4, 0x4

    :goto_2
    if-gt v4, v2, :cond_4

    .line 13
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6, v8}, Ljava/lang/Character;->digit(CI)I

    move-result v6

    .line 14
    sget-object v7, Lw40;->d:[[I

    aget-object v6, v7, v6

    invoke-static {v1, v3, v6, v5}, Lu40;->b([ZI[IZ)I

    move-result v6

    add-int/2addr v3, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 15
    :cond_4
    sget-object p1, Lw40;->a:[I

    invoke-static {v1, v3, p1, v5}, Lu40;->b([ZI[IZ)I

    return-object v1

    :catch_1
    move-exception p1

    .line 16
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
    sget-object v0, Lw20;->h:Lw20;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
