.class public final Lo50;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final a:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x60

    new-array v0, v0, [I

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lo50;->a:[I

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0x24
        -0x1
        -0x1
        -0x1
        0x25
        0x26
        -0x1
        -0x1
        -0x1
        -0x1
        0x27
        0x28
        -0x1
        0x29
        0x2a
        0x2b
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0x2c
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
        0x1f
        0x20
        0x21
        0x22
        0x23
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method public static a(Ljava/lang/String;Lm30;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    array-length p2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    aget-byte v1, p0, v0

    const/16 v2, 0x8

    .line 3
    invoke-virtual {p1, v1, v2}, Lm30;->c(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    .line 4
    new-instance p1, Ld30;

    invoke-direct {p1, p0}, Ld30;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static b(Ljava/lang/CharSequence;Lm30;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 2
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lo50;->p(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    add-int/lit8 v4, v1, 0x1

    if-ge v4, v0, :cond_1

    .line 3
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lo50;->p(I)I

    move-result v4

    if-eq v4, v3, :cond_0

    mul-int/lit8 v2, v2, 0x2d

    add-int/2addr v2, v4

    const/16 v3, 0xb

    .line 4
    invoke-virtual {p1, v2, v3}, Lm30;->c(II)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 5
    :cond_0
    new-instance p0, Ld30;

    invoke-direct {p0}, Ld30;-><init>()V

    throw p0

    :cond_1
    const/4 v1, 0x6

    .line 6
    invoke-virtual {p1, v2, v1}, Lm30;->c(II)V

    move v1, v4

    goto :goto_0

    .line 7
    :cond_2
    new-instance p0, Ld30;

    invoke-direct {p0}, Ld30;-><init>()V

    throw p0

    :cond_3
    return-void
.end method

.method public static c(Ljava/lang/String;Lk50;Lm30;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    .line 1
    sget-object v0, Lo50$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p3, 0x4

    if-ne v0, p3, :cond_0

    .line 2
    invoke-static {p0, p2}, Lo50;->e(Ljava/lang/String;Lm30;)V

    return-void

    .line 3
    :cond_0
    new-instance p0, Ld30;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const p2, 0x37e1

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    .line 4
    :cond_1
    invoke-static {p0, p2, p3}, Lo50;->a(Ljava/lang/String;Lm30;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_2
    invoke-static {p0, p2}, Lo50;->b(Ljava/lang/CharSequence;Lm30;)V

    return-void

    .line 6
    :cond_3
    invoke-static {p0, p2}, Lo50;->h(Ljava/lang/CharSequence;Lm30;)V

    return-void
.end method

.method public static d(Lo30;Lm30;)V
    .locals 2

    .line 1
    sget-object v0, Lk50;->i:Lk50;

    invoke-virtual {v0}, Lk50;->a()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lm30;->c(II)V

    .line 2
    invoke-virtual {p0}, Lo30;->b()I

    move-result p0

    const/16 v0, 0x8

    invoke-virtual {p1, p0, v0}, Lm30;->c(II)V

    return-void
.end method

.method public static e(Ljava/lang/String;Lm30;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    :try_start_0
    const v0, 0x37e2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    array-length v1, p0

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    .line 3
    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 4
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v2, 0x1

    .line 5
    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v3, v4

    const v4, 0x8140

    const/4 v5, -0x1

    if-lt v3, v4, :cond_0

    const v6, 0x9ffc

    if-gt v3, v6, :cond_0

    :goto_1
    sub-int/2addr v3, v4

    goto :goto_2

    :cond_0
    const v4, 0xe040

    if-lt v3, v4, :cond_1

    const v4, 0xebbf

    if-gt v3, v4, :cond_1

    const v4, 0xc140

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_2
    if-eq v3, v5, :cond_2

    shr-int/lit8 v4, v3, 0x8

    mul-int/lit16 v4, v4, 0xc0

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v4, v3

    const/16 v3, 0xd

    .line 6
    invoke-virtual {p1, v4, v3}, Lm30;->c(II)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 7
    :cond_2
    new-instance p0, Ld30;

    const v0, 0x37e3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void

    .line 8
    :cond_4
    new-instance p0, Ld30;

    const v0, 0x37e4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    .line 9
    new-instance p1, Ld30;

    invoke-direct {p1, p0}, Ld30;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static f(ILl50;Lk50;Lm30;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    .line 1
    invoke-virtual {p2, p1}, Lk50;->b(Ll50;)I

    move-result p1

    const/4 p2, 0x1

    shl-int v0, p2, p1

    if-ge p0, v0, :cond_0

    .line 2
    invoke-virtual {p3, p0, p1}, Lm30;->c(II)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ld30;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p0, 0x37e5

    invoke-static {p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr v0, p2

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ld30;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static g(Lk50;Lm30;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk50;->a()I

    move-result p0

    const/4 v0, 0x4

    invoke-virtual {p1, p0, v0}, Lm30;->c(II)V

    return-void
.end method

.method public static h(Ljava/lang/CharSequence;Lm30;)V
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 2
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    add-int/lit8 v2, v2, -0x30

    add-int/lit8 v3, v1, 0x2

    if-ge v3, v0, :cond_0

    add-int/lit8 v4, v1, 0x1

    .line 3
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    add-int/lit8 v4, v4, -0x30

    .line 4
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, -0x30

    mul-int/lit8 v2, v2, 0x64

    const/16 v5, 0xa

    mul-int/2addr v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v3

    .line 5
    invoke-virtual {p1, v2, v5}, Lm30;->c(II)V

    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    if-ge v1, v0, :cond_1

    .line 6
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int/lit8 v1, v1, -0x30

    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v1

    const/4 v1, 0x7

    .line 7
    invoke-virtual {p1, v2, v1}, Lm30;->c(II)V

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x4

    .line 8
    invoke-virtual {p1, v2, v3}, Lm30;->c(II)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static i(Lk50;Lm30;Lm30;Ll50;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lm30;->g()I

    move-result p1

    invoke-virtual {p0, p3}, Lk50;->b(Ll50;)I

    move-result p0

    add-int/2addr p1, p0

    invoke-virtual {p2}, Lm30;->g()I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static j(Ln50;)I
    .locals 2

    .line 1
    invoke-static {p0}, Lp50;->a(Ln50;)I

    move-result v0

    .line 2
    invoke-static {p0}, Lp50;->c(Ln50;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3
    invoke-static {p0}, Lp50;->d(Ln50;)I

    move-result v1

    add-int/2addr v0, v1

    .line 4
    invoke-static {p0}, Lp50;->e(Ln50;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static k(Lm30;Lj50;Ll50;Ln50;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    const v0, 0x7fffffff

    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_1

    .line 1
    invoke-static {p0, p1, p2, v2, p3}, Lq50;->a(Lm30;Lj50;Ll50;ILn50;)V

    .line 2
    invoke-static {p3}, Lo50;->j(Ln50;)I

    move-result v3

    if-ge v3, v0, :cond_0

    move v1, v2

    move v0, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)Lk50;
    .locals 5

    const v0, 0x37e6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lo50;->s(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    sget-object p0, Lk50;->j:Lk50;

    return-object p0

    :cond_0
    const/4 p1, 0x0

    move v0, p1

    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p1, v2, :cond_3

    .line 4
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    const/4 v4, 0x1

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-gt v2, v3, :cond_1

    move v1, v4

    goto :goto_1

    .line 5
    :cond_1
    invoke-static {v2}, Lo50;->p(I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    move v0, v4

    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 6
    :cond_2
    sget-object p0, Lk50;->h:Lk50;

    return-object p0

    :cond_3
    if-eqz v0, :cond_4

    .line 7
    sget-object p0, Lk50;->f:Lk50;

    return-object p0

    :cond_4
    if-eqz v1, :cond_5

    .line 8
    sget-object p0, Lk50;->e:Lk50;

    return-object p0

    .line 9
    :cond_5
    sget-object p0, Lk50;->h:Lk50;

    return-object p0
.end method

.method public static m(ILj50;)Ll50;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x28

    if-gt v0, v1, :cond_1

    .line 1
    invoke-static {v0}, Ll50;->e(I)Ll50;

    move-result-object v1

    .line 2
    invoke-static {p0, v1, p1}, Lo50;->v(ILl50;Lj50;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_1
    new-instance p0, Ld30;

    const p1, 0x37e7

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(Ljava/lang/String;Lj50;Ljava/util/Map;)Lr50;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lj50;",
            "Ljava/util/Map<",
            "Ly20;",
            "*>;)",
            "Lr50;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 1
    sget-object v2, Ly20;->c:Ly20;

    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    .line 2
    sget-object v3, Ly20;->c:Ly20;

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    const v3, 0x37e8

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 3
    :goto_1
    invoke-static {p0, v3}, Lo50;->l(Ljava/lang/String;Ljava/lang/String;)Lk50;

    move-result-object v4

    .line 4
    new-instance v5, Lm30;

    invoke-direct {v5}, Lm30;-><init>()V

    .line 5
    sget-object v6, Lk50;->h:Lk50;

    if-ne v4, v6, :cond_2

    if-eqz v2, :cond_2

    .line 6
    invoke-static {v3}, Lo30;->a(Ljava/lang/String;)Lo30;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 7
    invoke-static {v2, v5}, Lo50;->d(Lo30;Lm30;)V

    :cond_2
    if-eqz p2, :cond_3

    .line 8
    sget-object v2, Ly20;->n:Ly20;

    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    if-eqz v0, :cond_4

    .line 9
    sget-object v0, Ly20;->n:Ly20;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    sget-object v0, Lk50;->k:Lk50;

    invoke-static {v0, v5}, Lo50;->g(Lk50;Lm30;)V

    .line 11
    :cond_4
    invoke-static {v4, v5}, Lo50;->g(Lk50;Lm30;)V

    .line 12
    new-instance v0, Lm30;

    invoke-direct {v0}, Lm30;-><init>()V

    .line 13
    invoke-static {p0, v4, v0, v3}, Lo50;->c(Ljava/lang/String;Lk50;Lm30;Ljava/lang/String;)V

    if-eqz p2, :cond_6

    .line 14
    sget-object v1, Ly20;->l:Ly20;

    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 16
    invoke-static {v1}, Ll50;->e(I)Ll50;

    move-result-object v1

    .line 17
    invoke-static {v4, v5, v0, v1}, Lo50;->i(Lk50;Lm30;Lm30;Ll50;)I

    move-result v2

    .line 18
    invoke-static {v2, v1, p1}, Lo50;->v(ILl50;Lj50;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_3

    .line 19
    :cond_5
    new-instance p0, Ld30;

    const p1, 0x37e9

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    .line 20
    :cond_6
    invoke-static {p1, v4, v5, v0}, Lo50;->t(Lj50;Lk50;Lm30;Lm30;)Ll50;

    move-result-object v1

    .line 21
    :goto_3
    new-instance v2, Lm30;

    invoke-direct {v2}, Lm30;-><init>()V

    .line 22
    invoke-virtual {v2, v5}, Lm30;->b(Lm30;)V

    if-ne v4, v6, :cond_7

    .line 23
    invoke-virtual {v0}, Lm30;->h()I

    move-result p0

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    .line 24
    :goto_4
    invoke-static {p0, v1, v4, v2}, Lo50;->f(ILl50;Lk50;Lm30;)V

    .line 25
    invoke-virtual {v2, v0}, Lm30;->b(Lm30;)V

    .line 26
    invoke-virtual {v1, p1}, Ll50;->c(Lj50;)Ll50$b;

    move-result-object p0

    .line 27
    invoke-virtual {v1}, Ll50;->d()I

    move-result v0

    invoke-virtual {p0}, Ll50$b;->d()I

    move-result v3

    sub-int/2addr v0, v3

    .line 28
    invoke-static {v0, v2}, Lo50;->u(ILm30;)V

    .line 29
    invoke-virtual {v1}, Ll50;->d()I

    move-result v3

    .line 30
    invoke-virtual {p0}, Ll50$b;->c()I

    move-result p0

    .line 31
    invoke-static {v2, v3, v0, p0}, Lo50;->r(Lm30;III)Lm30;

    move-result-object p0

    .line 32
    new-instance v0, Lr50;

    invoke-direct {v0}, Lr50;-><init>()V

    .line 33
    invoke-virtual {v0, p1}, Lr50;->c(Lj50;)V

    .line 34
    invoke-virtual {v0, v4}, Lr50;->f(Lk50;)V

    .line 35
    invoke-virtual {v0, v1}, Lr50;->g(Ll50;)V

    .line 36
    invoke-virtual {v1}, Ll50;->b()I

    move-result v2

    .line 37
    new-instance v3, Ln50;

    invoke-direct {v3, v2, v2}, Ln50;-><init>(II)V

    const/4 v2, -0x1

    if-eqz p2, :cond_8

    .line 38
    sget-object v4, Ly20;->m:Ly20;

    invoke-interface {p2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 39
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    .line 40
    invoke-static {p2}, Lr50;->b(I)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_5

    :cond_8
    move p2, v2

    :goto_5
    if-ne p2, v2, :cond_9

    .line 41
    invoke-static {p0, p1, v1, v3}, Lo50;->k(Lm30;Lj50;Ll50;Ln50;)I

    move-result p2

    .line 42
    :cond_9
    invoke-virtual {v0, p2}, Lr50;->d(I)V

    .line 43
    invoke-static {p0, p1, v1, p2, v3}, Lq50;->a(Lm30;Lj50;Ll50;ILn50;)V

    .line 44
    invoke-virtual {v0, v3}, Lr50;->e(Ln50;)V

    return-object v0
.end method

.method public static o([BI)[B
    .locals 5

    .line 1
    array-length v0, p0

    add-int v1, v0, p1

    .line 2
    new-array v1, v1, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    .line 3
    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_0
    new-instance p0, Lr30;

    sget-object v3, Lp30;->k:Lp30;

    invoke-direct {p0, v3}, Lr30;-><init>(Lp30;)V

    invoke-virtual {p0, v1, p1}, Lr30;->b([II)V

    .line 5
    new-array p0, p1, [B

    :goto_1
    if-ge v2, p1, :cond_1

    add-int v3, v0, v2

    .line 6
    aget v3, v1, v3

    int-to-byte v3, v3

    aput-byte v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method public static p(I)I
    .locals 2

    .line 1
    sget-object v0, Lo50;->a:[I

    array-length v1, v0

    if-ge p0, v1, :cond_0

    .line 2
    aget p0, v0, p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static q(IIII[I[I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    if-ge p3, p2, :cond_4

    .line 1
    rem-int v0, p0, p2

    sub-int v1, p2, v0

    .line 2
    div-int v2, p0, p2

    add-int/lit8 v3, v2, 0x1

    .line 3
    div-int/2addr p1, p2

    add-int/lit8 v4, p1, 0x1

    sub-int/2addr v2, p1

    sub-int/2addr v3, v4

    if-ne v2, v3, :cond_3

    add-int v5, v1, v0

    if-ne p2, v5, :cond_2

    add-int p2, p1, v2

    mul-int/2addr p2, v1

    add-int v5, v4, v3

    mul-int/2addr v5, v0

    add-int/2addr p2, v5

    if-ne p0, p2, :cond_1

    const/4 p0, 0x0

    if-ge p3, v1, :cond_0

    .line 4
    aput p1, p4, p0

    .line 5
    aput v2, p5, p0

    return-void

    .line 6
    :cond_0
    aput v4, p4, p0

    .line 7
    aput v3, p5, p0

    return-void

    .line 8
    :cond_1
    new-instance p0, Ld30;

    const p1, 0x37ea

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    .line 9
    :cond_2
    new-instance p0, Ld30;

    const p1, 0x37eb

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    .line 10
    :cond_3
    new-instance p0, Ld30;

    const p1, 0x37ec

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    .line 11
    :cond_4
    new-instance p0, Ld30;

    const p1, 0x37ed

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static r(Lm30;III)Lm30;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    .line 1
    invoke-virtual/range {p0 .. p0}, Lm30;->h()I

    move-result v0

    if-ne v0, v7, :cond_9

    .line 2
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v10, 0x0

    move v11, v10

    move v12, v11

    move v13, v12

    move v14, v13

    :goto_0
    if-ge v11, v8, :cond_0

    const/4 v0, 0x1

    new-array v15, v0, [I

    new-array v5, v0, [I

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move v3, v11

    move-object v4, v15

    move-object/from16 v16, v5

    .line 3
    invoke-static/range {v0 .. v5}, Lo50;->q(IIII[I[I)V

    .line 4
    aget v0, v15, v10

    .line 5
    new-array v1, v0, [B

    shl-int/lit8 v2, v12, 0x3

    move-object/from16 v3, p0

    .line 6
    invoke-virtual {v3, v2, v1, v10, v0}, Lm30;->j(I[BII)V

    .line 7
    aget v2, v16, v10

    invoke-static {v1, v2}, Lo50;->o([BI)[B

    move-result-object v2

    .line 8
    new-instance v4, Lm50;

    invoke-direct {v4, v1, v2}, Lm50;-><init>([B[B)V

    invoke-interface {v9, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    move-result v13

    .line 10
    array-length v0, v2

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 11
    aget v0, v15, v10

    add-int/2addr v12, v0

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    if-ne v7, v12, :cond_8

    .line 12
    new-instance v0, Lm30;

    invoke-direct {v0}, Lm30;-><init>()V

    move v1, v10

    :goto_1
    const/16 v2, 0x8

    if-ge v1, v13, :cond_3

    .line 13
    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm50;

    .line 14
    invoke-virtual {v4}, Lm50;->a()[B

    move-result-object v4

    .line 15
    array-length v5, v4

    if-ge v1, v5, :cond_1

    .line 16
    aget-byte v4, v4, v1

    invoke-virtual {v0, v4, v2}, Lm30;->c(II)V

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    if-ge v10, v14, :cond_6

    .line 17
    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm50;

    .line 18
    invoke-virtual {v3}, Lm50;->b()[B

    move-result-object v3

    .line 19
    array-length v4, v3

    if-ge v10, v4, :cond_4

    .line 20
    aget-byte v3, v3, v10

    invoke-virtual {v0, v3, v2}, Lm30;->c(II)V

    goto :goto_4

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 21
    :cond_6
    invoke-virtual {v0}, Lm30;->h()I

    move-result v1

    if-ne v6, v1, :cond_7

    return-object v0

    .line 22
    :cond_7
    new-instance v1, Ld30;

    new-instance v2, Ljava/lang/StringBuilder;

    const v3, 0x37ee

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v3, 0x37ef

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    invoke-virtual {v0}, Lm30;->h()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v0, 0x37f0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ld30;-><init>(Ljava/lang/String;)V

    throw v1

    .line 24
    :cond_8
    new-instance v0, Ld30;

    const v1, 0x37f1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ld30;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_9
    new-instance v0, Ld30;

    const v1, 0x37f2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ld30;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static s(Ljava/lang/String;)Z
    .locals 6

    const/4 v1, 0x0

    :try_start_0
    const v0, 0x37f3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 1
    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    array-length v2, p0

    .line 3
    rem-int/lit8 v3, v2, 0x2

    if-eqz v3, :cond_0

    return v1

    :cond_0
    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_4

    .line 4
    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x81

    if-lt v4, v5, :cond_1

    const/16 v5, 0x9f

    if-le v4, v5, :cond_2

    :cond_1
    const/16 v5, 0xe0

    if-lt v4, v5, :cond_3

    const/16 v5, 0xeb

    if-le v4, v5, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_3
    :goto_1
    return v1

    :cond_4
    const/4 p0, 0x1

    return p0

    :catch_0
    return v1
.end method

.method public static t(Lj50;Lk50;Lm30;Lm30;)Ll50;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, Ll50;->e(I)Ll50;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lo50;->i(Lk50;Lm30;Lm30;Ll50;)I

    move-result v0

    .line 2
    invoke-static {v0, p0}, Lo50;->m(ILj50;)Ll50;

    move-result-object v0

    .line 3
    invoke-static {p1, p2, p3, v0}, Lo50;->i(Lk50;Lm30;Lm30;Ll50;)I

    move-result p1

    .line 4
    invoke-static {p1, p0}, Lo50;->m(ILj50;)Ll50;

    move-result-object p0

    return-object p0
.end method

.method public static u(ILm30;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    shl-int/lit8 v0, p0, 0x3

    .line 1
    invoke-virtual {p1}, Lm30;->g()I

    move-result v1

    if-gt v1, v0, :cond_5

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_0

    .line 2
    invoke-virtual {p1}, Lm30;->g()I

    move-result v3

    if-ge v3, v0, :cond_0

    .line 3
    invoke-virtual {p1, v1}, Lm30;->a(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lm30;->g()I

    move-result v2

    and-int/lit8 v2, v2, 0x7

    const/16 v3, 0x8

    if-lez v2, :cond_1

    :goto_1
    if-ge v2, v3, :cond_1

    .line 5
    invoke-virtual {p1, v1}, Lm30;->a(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p1}, Lm30;->h()I

    move-result v2

    sub-int/2addr p0, v2

    :goto_2
    if-ge v1, p0, :cond_3

    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_2

    const/16 v2, 0xec

    goto :goto_3

    :cond_2
    const/16 v2, 0x11

    .line 7
    :goto_3
    invoke-virtual {p1, v2, v3}, Lm30;->c(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 8
    :cond_3
    invoke-virtual {p1}, Lm30;->g()I

    move-result p0

    if-ne p0, v0, :cond_4

    return-void

    .line 9
    :cond_4
    new-instance p0, Ld30;

    const p1, 0x37f4

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0

    .line 10
    :cond_5
    new-instance p0, Ld30;

    new-instance v1, Ljava/lang/StringBuilder;

    const v2, 0x37f5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lm30;->g()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p1, 0x37f6

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ld30;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static v(ILl50;Lj50;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ll50;->d()I

    move-result v0

    .line 2
    invoke-virtual {p1, p2}, Ll50;->c(Lj50;)Ll50$b;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Ll50$b;->d()I

    move-result p1

    sub-int/2addr v0, p1

    add-int/lit8 p0, p0, 0x7

    .line 4
    div-int/lit8 p0, p0, 0x8

    if-lt v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
