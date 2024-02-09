.class public Lxs;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lwq;

.field public final c:Llu;

.field public final d:Lbt;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lyu;

.field public final g:Lzu;

.field public final h:Lzu;

.field public final i:Lku;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lwq;Llu;Lbt;Ljava/util/concurrent/Executor;Lyu;Lzu;Lzu;Lku;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxs;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lxs;->b:Lwq;

    .line 4
    iput-object p3, p0, Lxs;->c:Llu;

    .line 5
    iput-object p4, p0, Lxs;->d:Lbt;

    .line 6
    iput-object p5, p0, Lxs;->e:Ljava/util/concurrent/Executor;

    .line 7
    iput-object p6, p0, Lxs;->f:Lyu;

    .line 8
    iput-object p7, p0, Lxs;->g:Lzu;

    .line 9
    iput-object p8, p0, Lxs;->h:Lzu;

    .line 10
    iput-object p9, p0, Lxs;->i:Lku;

    return-void
.end method

.method private synthetic c(Llq;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lxs;->c:Llu;

    invoke-interface {v0, p1}, Llu;->E(Llq;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic e(Llq;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    iget-object v0, p0, Lxs;->c:Llu;

    invoke-interface {v0, p1}, Llu;->o(Llq;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic g(Ljava/lang/Iterable;Llq;J)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lxs;->c:Llu;

    invoke-interface {v0, p1}, Llu;->I(Ljava/lang/Iterable;)V

    .line 2
    iget-object p1, p0, Lxs;->c:Llu;

    iget-object v0, p0, Lxs;->g:Lzu;

    .line 3
    invoke-interface {v0}, Lzu;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    .line 4
    invoke-interface {p1, p2, v0, v1}, Llu;->t(Llq;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic i(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxs;->c:Llu;

    invoke-interface {v0, p1}, Llu;->f(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxs;->i:Lku;

    invoke-interface {v0}, Lku;->m()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic m(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2
    iget-object v1, p0, Lxs;->i:Lku;

    .line 3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lmr$b;->h:Lmr$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    invoke-interface {v1, v2, v3, v4, v0}, Lku;->k(JLmr$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Llq;J)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lxs;->c:Llu;

    iget-object v1, p0, Lxs;->g:Lzu;

    .line 2
    invoke-interface {v1}, Lzu;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    .line 3
    invoke-interface {v0, p1, v1, v2}, Llu;->t(Llq;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic q(Llq;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxs;->d:Lbt;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lbt;->a(Llq;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(Llq;ILjava/lang/Runnable;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lxs;->f:Lyu;

    iget-object v1, p0, Lxs;->c:Llu;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Les;

    invoke-direct {v2, v1}, Les;-><init>(Llu;)V

    invoke-interface {v0, v2}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Lxs;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lxs;->f:Lyu;

    new-instance v1, Lns;

    invoke-direct {v1, p0, p1, p2}, Lns;-><init>(Lxs;Llq;I)V

    invoke-interface {v0, v1}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p2}, Lxs;->u(Llq;I)V
    :try_end_0
    .catch Lxu; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :catch_0
    :try_start_1
    iget-object v0, p0, Lxs;->d:Lbt;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lbt;->a(Llq;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 7
    throw p1
.end method


# virtual methods
.method public a(Ler;)Lfq;
    .locals 4

    .line 1
    iget-object v0, p0, Lxs;->f:Lyu;

    iget-object v1, p0, Lxs;->i:Lku;

    .line 2
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lrs;

    invoke-direct {v2, v1}, Lrs;-><init>(Lku;)V

    invoke-interface {v0, v2}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkr;

    .line 3
    invoke-static {}, Lfq;->a()Lfq$a;

    move-result-object v1

    iget-object v2, p0, Lxs;->g:Lzu;

    .line 4
    invoke-interface {v2}, Lzu;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lfq$a;->i(J)Lfq$a;

    iget-object v2, p0, Lxs;->h:Lzu;

    .line 5
    invoke-interface {v2}, Lzu;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lfq$a;->k(J)Lfq$a;

    const v2, 0x1ab8

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v2}, Lfq$a;->j(Ljava/lang/String;)Lfq$a;

    new-instance v2, Leq;

    const v3, 0x1ab9

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-static {v3}, Lvo;->b(Ljava/lang/String;)Lvo;

    move-result-object v3

    invoke-virtual {v0}, Lkr;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Leq;-><init>(Lvo;[B)V

    .line 8
    invoke-virtual {v1, v2}, Lfq$a;->h(Leq;)Lfq$a;

    .line 9
    invoke-virtual {v1}, Lfq$a;->d()Lfq;

    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Ler;->a(Lfq;)Lfq;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lxs;->a:Landroid/content/Context;

    const v1, 0x1aba

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 3
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public synthetic d(Llq;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lxs;->c(Llq;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public synthetic f(Llq;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Lxs;->e(Llq;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public synthetic h(Ljava/lang/Iterable;Llq;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lxs;->g(Ljava/lang/Iterable;Llq;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic j(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lxs;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic l()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lxs;->k()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic n(Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lxs;->m(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic p(Llq;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lxs;->o(Llq;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic r(Llq;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lxs;->q(Llq;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic t(Llq;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lxs;->s(Llq;ILjava/lang/Runnable;)V

    return-void
.end method

.method public u(Llq;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lxs;->b:Lwq;

    invoke-virtual {p1}, Llq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lwq;->a(Ljava/lang/String;)Ler;

    move-result-object v0

    const-wide/16 v1, 0x0

    :cond_0
    :goto_0
    move-wide v7, v1

    .line 2
    :cond_1
    :goto_1
    iget-object v1, p0, Lxs;->f:Lyu;

    new-instance v2, Lhs;

    invoke-direct {v2, p0, p1}, Lhs;-><init>(Lxs;Llq;)V

    invoke-interface {v1, v2}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 3
    iget-object v1, p0, Lxs;->f:Lyu;

    new-instance v2, Ljs;

    invoke-direct {v2, p0, p1}, Ljs;-><init>(Lxs;Llq;)V

    .line 4
    invoke-interface {v1, v2}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    .line 5
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    if-nez v0, :cond_3

    const v1, 0x1abb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x1abc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v1, v2, p1}, Lqr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    invoke-static {}, Lyq;->a()Lyq;

    move-result-object v1

    goto :goto_3

    .line 8
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsu;

    .line 10
    invoke-virtual {v3}, Lsu;->b()Lfq;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 11
    :cond_4
    invoke-virtual {p1}, Llq;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 12
    invoke-virtual {p0, v0}, Lxs;->a(Ler;)Lfq;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_5
    invoke-static {}, Lxq;->a()Lxq$a;

    move-result-object v2

    .line 14
    invoke-virtual {v2, v1}, Lxq$a;->b(Ljava/lang/Iterable;)Lxq$a;

    .line 15
    invoke-virtual {p1}, Llq;->c()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Lxq$a;->c([B)Lxq$a;

    .line 16
    invoke-virtual {v2}, Lxq$a;->a()Lxq;

    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ler;->b(Lxq;)Lyq;

    move-result-object v1

    .line 18
    :goto_3
    invoke-virtual {v1}, Lyq;->c()Lyq$a;

    move-result-object v2

    sget-object v3, Lyq$a;->c:Lyq$a;

    const/4 v9, 0x1

    if-ne v2, v3, :cond_6

    .line 19
    iget-object v0, p0, Lxs;->f:Lyu;

    new-instance v1, Lks;

    move-object v3, v1

    move-object v4, p0

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Lks;-><init>(Lxs;Ljava/lang/Iterable;Llq;J)V

    invoke-interface {v0, v1}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    .line 20
    iget-object v0, p0, Lxs;->d:Lbt;

    add-int/2addr p2, v9

    invoke-interface {v0, p1, p2, v9}, Lbt;->b(Llq;IZ)V

    return-void

    .line 21
    :cond_6
    iget-object v2, p0, Lxs;->f:Lyu;

    new-instance v3, Lms;

    invoke-direct {v3, p0, v5}, Lms;-><init>(Lxs;Ljava/lang/Iterable;)V

    invoke-interface {v2, v3}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    .line 22
    invoke-virtual {v1}, Lyq;->c()Lyq$a;

    move-result-object v2

    sget-object v3, Lyq$a;->b:Lyq$a;

    if-ne v2, v3, :cond_7

    .line 23
    invoke-virtual {v1}, Lyq;->b()J

    move-result-wide v1

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 24
    invoke-virtual {p1}, Llq;->e()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 25
    iget-object v3, p0, Lxs;->f:Lyu;

    new-instance v4, Los;

    invoke-direct {v4, p0}, Los;-><init>(Lxs;)V

    invoke-interface {v3, v4}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 26
    :cond_7
    invoke-virtual {v1}, Lyq;->c()Lyq$a;

    move-result-object v1

    sget-object v2, Lyq$a;->e:Lyq$a;

    if-ne v1, v2, :cond_1

    .line 27
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 28
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsu;

    .line 29
    invoke-virtual {v3}, Lsu;->b()Lfq;

    move-result-object v3

    invoke-virtual {v3}, Lfq;->j()Ljava/lang/String;

    move-result-object v3

    .line 30
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 31
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 32
    :cond_8
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v4, v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 33
    :cond_9
    iget-object v2, p0, Lxs;->f:Lyu;

    new-instance v3, Lis;

    invoke-direct {v3, p0, v1}, Lis;-><init>(Lxs;Ljava/util/Map;)V

    invoke-interface {v2, v3}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 34
    :cond_a
    iget-object p2, p0, Lxs;->f:Lyu;

    new-instance v0, Lls;

    invoke-direct {v0, p0, p1, v7, v8}, Lls;-><init>(Lxs;Llq;J)V

    invoke-interface {p2, v0}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    return-void
.end method

.method public v(Llq;ILjava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxs;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lgs;

    invoke-direct {v1, p0, p1, p2, p3}, Lgs;-><init>(Lxs;Llq;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
