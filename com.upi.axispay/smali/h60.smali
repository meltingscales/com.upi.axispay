.class public Lh60;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh60$a;
    }
.end annotation


# direct methods
.method public static a()Ls60;
    .locals 1

    .line 1
    new-instance v0, Lu60;

    invoke-direct {v0}, Lu60;-><init>()V

    return-object v0
.end method

.method public static b(Landroid/content/Context;La60;JI)Lt50;
    .locals 9

    .line 1
    invoke-static {p0}, Lh60;->h(Landroid/content/Context;)Ljava/io/File;

    move-result-object v7

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    if-lez p4, :cond_1

    .line 2
    :cond_0
    invoke-static {p0}, La70;->d(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    .line 3
    :try_start_0
    new-instance v8, Lx50;

    move-object v0, v8

    move-object v2, v7

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lx50;-><init>(Ljava/io/File;Ljava/io/File;La60;JI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v8

    :catch_0
    move-exception p2

    .line 4
    invoke-static {p2}, Ly60;->b(Ljava/lang/Throwable;)V

    .line 5
    :cond_1
    invoke-static {p0}, La70;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    .line 6
    new-instance p2, Lv50;

    invoke-direct {p2, p0, v7, p1}, Lv50;-><init>(Ljava/io/File;Ljava/io/File;La60;)V

    return-object p2
.end method

.method public static c(IILn60;)Ljava/util/concurrent/Executor;
    .locals 8

    .line 1
    sget-object v0, Ln60;->c:Ln60;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 2
    new-instance p2, Lo60;

    invoke-direct {p2}, Lo60;-><init>()V

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p2}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    :goto_1
    move-object v6, p2

    .line 3
    new-instance p2, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v3, 0x0

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const v0, 0x14cb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lh60;->j(ILjava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    move-object v0, p2

    move v1, p0

    move v2, p0

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    return-object p2
.end method

.method public static d()La60;
    .locals 1

    .line 1
    new-instance v0, Lb60;

    invoke-direct {v0}, Lb60;-><init>()V

    return-object v0
.end method

.method public static e(Z)Lr60;
    .locals 1

    .line 1
    new-instance v0, Lq60;

    invoke-direct {v0, p0}, Lq60;-><init>(Z)V

    return-object v0
.end method

.method public static f(Landroid/content/Context;)Lw60;
    .locals 1

    .line 1
    new-instance v0, Lv60;

    invoke-direct {v0, p0}, Lv60;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static g(Landroid/content/Context;I)Ld60;
    .locals 2

    if-nez p1, :cond_1

    const p1, 0x14cc

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    .line 2
    invoke-virtual {p1}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0

    .line 3
    invoke-static {}, Lh60;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lh60;->m(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 4
    invoke-static {p1}, Lh60;->k(Landroid/app/ActivityManager;)I

    move-result v0

    :cond_0
    const/high16 p0, 0x100000

    mul-int/2addr v0, p0

    .line 5
    div-int/lit8 p1, v0, 0x8

    .line 6
    :cond_1
    new-instance p0, Lf60;

    invoke-direct {p0, p1}, Lf60;-><init>(I)V

    return-object p0
.end method

.method public static h(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, La70;->b(Landroid/content/Context;Z)Ljava/io/File;

    move-result-object p0

    .line 2
    new-instance v0, Ljava/io/File;

    const v1, 0x14cd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move-object p0, v0

    :cond_1
    return-object p0
.end method

.method public static i()Ljava/util/concurrent/Executor;
    .locals 2

    const/4 v0, 0x5

    const v1, 0x14ce

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-static {v0, v1}, Lh60;->j(ILjava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static j(ILjava/lang/String;)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .line 1
    new-instance v0, Lh60$a;

    invoke-direct {v0, p0, p1}, Lh60$a;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static k(Landroid/app/ActivityManager;)I
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    move-result p0

    return p0
.end method

.method public static l()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static m(Landroid/content/Context;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v0, 0x100000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
