.class public final Lokhttp3/logging/internal/Utf8Kt;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static final isProbablyUtf8(Lokio/Buffer;)Z
    .locals 9

    const v0, 0x30f2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 1
    :try_start_0
    new-instance v8, Lokio/Buffer;

    invoke-direct {v8}, Lokio/Buffer;-><init>()V

    .line 2
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x40

    invoke-static {v2, v3, v4, v5}, Ltm0;->d(JJ)J

    move-result-wide v6

    const-wide/16 v4, 0x0

    move-object v2, p0

    move-object v3, v8

    .line 3
    invoke-virtual/range {v2 .. v7}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    const/16 p0, 0x10

    move v2, v1

    :goto_0
    if-ge v2, p0, :cond_2

    .line 4
    invoke-virtual {v8}, Lokio/Buffer;->exhausted()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {v8}, Lokio/Buffer;->readUtf8CodePoint()I

    move-result v3

    .line 6
    invoke-static {v3}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v3
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0

    :catch_0
    return v1
.end method
