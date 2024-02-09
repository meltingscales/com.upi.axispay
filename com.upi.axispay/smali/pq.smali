.class public Lpq;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Loq;


# static fields
.field public static volatile e:Lqq;


# instance fields
.field public final a:Lzu;

.field public final b:Lzu;

.field public final c:Lyr;

.field public final d:Lxs;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lzu;Lzu;Lyr;Lxs;Lzs;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpq;->a:Lzu;

    .line 3
    iput-object p2, p0, Lpq;->b:Lzu;

    .line 4
    iput-object p3, p0, Lpq;->c:Lyr;

    .line 5
    iput-object p4, p0, Lpq;->d:Lxs;

    .line 6
    invoke-virtual {p5}, Lzs;->a()V

    return-void
.end method

.method public static c()Lpq;
    .locals 2

    .line 1
    sget-object v0, Lpq;->e:Lqq;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lqq;->j()Lpq;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const v1, 0x3cc0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lcq;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq;",
            ")",
            "Ljava/util/Set<",
            "Lvo;",
            ">;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Ldq;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Ldq;

    .line 3
    invoke-interface {p0}, Ldq;->b()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const p0, 0x3cc1

    invoke-static {p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {p0}, Lvo;->b(Ljava/lang/String;)Lvo;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lpq;->e:Lqq;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lpq;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lpq;->e:Lqq;

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Lbq;->k()Lqq$a;

    move-result-object v1

    .line 5
    invoke-interface {v1, p0}, Lqq$a;->b(Landroid/content/Context;)Lqq$a;

    .line 6
    invoke-interface {v1}, Lqq$a;->a()Lqq;

    move-result-object p0

    sput-object p0, Lpq;->e:Lqq;

    .line 7
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lkq;Lbp;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lpq;->c:Lyr;

    .line 2
    invoke-virtual {p1}, Lkq;->f()Llq;

    move-result-object v1

    invoke-virtual {p1}, Lkq;->c()Lwo;

    move-result-object v2

    invoke-virtual {v2}, Lwo;->c()Lxo;

    move-result-object v2

    invoke-virtual {v1, v2}, Llq;->f(Lxo;)Llq;

    move-result-object v1

    .line 3
    invoke-virtual {p0, p1}, Lpq;->b(Lkq;)Lfq;

    move-result-object p1

    .line 4
    invoke-interface {v0, v1, p1, p2}, Lyr;->a(Llq;Lfq;Lbp;)V

    return-void
.end method

.method public final b(Lkq;)Lfq;
    .locals 4

    .line 1
    invoke-static {}, Lfq;->a()Lfq$a;

    move-result-object v0

    iget-object v1, p0, Lpq;->a:Lzu;

    .line 2
    invoke-interface {v1}, Lzu;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lfq$a;->i(J)Lfq$a;

    iget-object v1, p0, Lpq;->b:Lzu;

    .line 3
    invoke-interface {v1}, Lzu;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lfq$a;->k(J)Lfq$a;

    .line 4
    invoke-virtual {p1}, Lkq;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfq$a;->j(Ljava/lang/String;)Lfq$a;

    new-instance v1, Leq;

    .line 5
    invoke-virtual {p1}, Lkq;->b()Lvo;

    move-result-object v2

    invoke-virtual {p1}, Lkq;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Leq;-><init>(Lvo;[B)V

    invoke-virtual {v0, v1}, Lfq$a;->h(Leq;)Lfq$a;

    .line 6
    invoke-virtual {p1}, Lkq;->c()Lwo;

    move-result-object p1

    invoke-virtual {p1}, Lwo;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lfq$a;->g(Ljava/lang/Integer;)Lfq$a;

    .line 7
    invoke-virtual {v0}, Lfq$a;->d()Lfq;

    move-result-object p1

    return-object p1
.end method

.method public e()Lxs;
    .locals 1

    .line 1
    iget-object v0, p0, Lpq;->d:Lxs;

    return-object v0
.end method

.method public g(Lcq;)Lap;
    .locals 4

    .line 1
    new-instance v0, Lmq;

    .line 2
    invoke-static {p1}, Lpq;->d(Lcq;)Ljava/util/Set;

    move-result-object v1

    .line 3
    invoke-static {}, Llq;->a()Llq$a;

    move-result-object v2

    .line 4
    invoke-interface {p1}, Lcq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Llq$a;->b(Ljava/lang/String;)Llq$a;

    .line 5
    invoke-interface {p1}, Lcq;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Llq$a;->c([B)Llq$a;

    .line 6
    invoke-virtual {v2}, Llq$a;->a()Llq;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lmq;-><init>(Ljava/util/Set;Llq;Loq;)V

    return-object v0
.end method
