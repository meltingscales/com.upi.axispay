.class public final Lik;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Lcm;

.field public final b:Landroid/os/Handler;

.field public c:Ljava/lang/Runnable;

.field public final d:Ljava/lang/Object;

.field public final e:J

.field public final f:Ljava/util/concurrent/Executor;

.field public g:I

.field public h:J

.field public i:Lbm;

.field public j:Z

.field public final k:Ljava/lang/Runnable;

.field public final l:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lik;->a:Lcm;

    .line 3
    new-instance v1, Landroid/os/Handler;

    .line 4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lik;->b:Landroid/os/Handler;

    .line 5
    iput-object v0, p0, Lik;->c:Ljava/lang/Runnable;

    .line 6
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lik;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lik;->g:I

    .line 8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lik;->h:J

    .line 9
    iput-boolean v0, p0, Lik;->j:Z

    .line 10
    new-instance v0, Lik$a;

    invoke-direct {v0, p0}, Lik$a;-><init>(Lik;)V

    iput-object v0, p0, Lik;->k:Ljava/lang/Runnable;

    .line 11
    new-instance v0, Lik$b;

    invoke-direct {v0, p0}, Lik$b;-><init>(Lik;)V

    iput-object v0, p0, Lik;->l:Ljava/lang/Runnable;

    .line 12
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lik;->e:J

    .line 13
    iput-object p4, p0, Lik;->f:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lik;->d:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lik;->j:Z

    .line 3
    iget-object v1, p0, Lik;->i:Lbm;

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    :cond_0
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lik;->i:Lbm;

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b()V
    .locals 6

    .line 1
    iget-object v1, p0, Lik;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 2
    :try_start_0
    iget v2, p0, Lik;->g:I

    if-lez v2, :cond_2

    add-int/lit8 v2, v2, -0x1

    .line 3
    iput v2, p0, Lik;->g:I

    if-nez v2, :cond_1

    .line 4
    iget-object v2, p0, Lik;->i:Lbm;

    if-nez v2, :cond_0

    .line 5
    monitor-exit v1

    return-void

    .line 6
    :cond_0
    iget-object v2, p0, Lik;->b:Landroid/os/Handler;

    iget-object v3, p0, Lik;->k:Ljava/lang/Runnable;

    iget-wide v4, p0, Lik;->e:J

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 7
    :cond_1
    monitor-exit v1

    return-void

    .line 8
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const v0, 0x236f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception v2

    .line 9
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public c(Lb4;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lb4<",
            "Lbm;",
            "TV;>;)TV;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lik;->e()Lbm;

    move-result-object v0

    .line 2
    invoke-interface {p1, v0}, Lb4;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    invoke-virtual {p0}, Lik;->b()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lik;->b()V

    .line 4
    throw p1
.end method

.method public d()Lbm;
    .locals 2

    .line 1
    iget-object v0, p0, Lik;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lik;->i:Lbm;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e()Lbm;
    .locals 4

    .line 1
    iget-object v1, p0, Lik;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 2
    :try_start_0
    iget-object v2, p0, Lik;->b:Landroid/os/Handler;

    iget-object v3, p0, Lik;->k:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3
    iget v2, p0, Lik;->g:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lik;->g:I

    .line 4
    iget-boolean v2, p0, Lik;->j:Z

    if-nez v2, :cond_2

    .line 5
    iget-object v2, p0, Lik;->i:Lbm;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lbm;->isOpen()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    iget-object v2, p0, Lik;->i:Lbm;

    monitor-exit v1

    return-object v2

    .line 7
    :cond_0
    iget-object v2, p0, Lik;->a:Lcm;

    if-eqz v2, :cond_1

    .line 8
    invoke-interface {v2}, Lcm;->K()Lbm;

    move-result-object v2

    iput-object v2, p0, Lik;->i:Lbm;

    .line 9
    monitor-exit v1

    return-object v2

    .line 10
    :cond_1
    new-instance v2, Ljava/lang/IllegalStateException;

    const v0, 0x2370

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 11
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const v0, 0x2371

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception v2

    .line 12
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public f(Lcm;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lik;->a:Lcm;

    if-eqz v0, :cond_0

    const p1, 0x2372

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x2373

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    iput-object p1, p0, Lik;->a:Lcm;

    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lik;->j:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public h(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lik;->c:Ljava/lang/Runnable;

    return-void
.end method
