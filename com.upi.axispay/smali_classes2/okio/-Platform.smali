.class public final Lokio/-Platform;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static final asUtf8ToByteArray(Ljava/lang/String;)[B
    .locals 1

    const v0, 0xb5e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lqn0;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const v0, 0xb5f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final synchronized(Ljava/lang/Object;Lsk0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lsk0<",
            "+TR;>;)TR;"
        }
    .end annotation

    const v0, 0xb60

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xb61

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    monitor-enter p0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {p1}, Lsk0;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Lxl0;->b(I)V

    monitor-exit p0

    invoke-static {v1}, Lxl0;->a(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v1}, Lxl0;->b(I)V

    monitor-exit p0

    invoke-static {v1}, Lxl0;->a(I)V

    throw p1
.end method

.method public static final toUtf8String([B)Ljava/lang/String;
    .locals 2

    const v0, 0xb62

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lqn0;->b:Ljava/nio/charset/Charset;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1
.end method
