.class public Lik$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lik;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lik;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>(Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lik$b;->b:Lik;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v1, p0, Lik$b;->b:Lik;

    iget-object v1, v1, Lik;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 2
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lik$b;->b:Lik;

    iget-wide v5, v4, Lik;->h:J

    sub-long/2addr v2, v5

    iget-wide v5, v4, Lik;->e:J

    cmp-long v2, v2, v5

    if-gez v2, :cond_0

    .line 3
    monitor-exit v1

    return-void

    .line 4
    :cond_0
    iget v2, v4, Lik;->g:I

    if-eqz v2, :cond_1

    .line 5
    monitor-exit v1

    return-void

    .line 6
    :cond_1
    iget-object v2, v4, Lik;->c:Ljava/lang/Runnable;

    if-eqz v2, :cond_3

    .line 7
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 8
    iget-object v2, p0, Lik$b;->b:Lik;

    iget-object v2, v2, Lik;->i:Lbm;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Lbm;->isOpen()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    .line 9
    :try_start_1
    iget-object v3, p0, Lik$b;->b:Lik;

    iget-object v3, v3, Lik;->i:Lbm;

    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    :try_start_2
    iget-object v3, p0, Lik$b;->b:Lik;

    iput-object v2, v3, Lik;->i:Lbm;

    goto :goto_0

    :catch_0
    move-exception v3

    .line 11
    invoke-static {v3}, Lpl;->a(Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .line 12
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v1

    return-void

    .line 13
    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    const v0, 0x2cc9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception v2

    .line 14
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v2
.end method
