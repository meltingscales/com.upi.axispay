.class public abstract Lokhttp3/internal/concurrent/Task;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field private final cancelable:Z

.field private final name:Ljava/lang/String;

.field private nextExecuteNanoTime:J

.field private queue:Lokhttp3/internal/concurrent/TaskQueue;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const v0, 0x1feb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/concurrent/Task;->name:Ljava/lang/String;

    iput-boolean p2, p0, Lokhttp3/internal/concurrent/Task;->cancelable:Z

    const-wide/16 p1, -0x1

    .line 2
    iput-wide p1, p0, Lokhttp3/internal/concurrent/Task;->nextExecuteNanoTime:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZILvl0;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/concurrent/Task;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final getCancelable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/concurrent/Task;->cancelable:Z

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/concurrent/Task;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextExecuteNanoTime$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/concurrent/Task;->nextExecuteNanoTime:J

    return-wide v0
.end method

.method public final getQueue$okhttp()Lokhttp3/internal/concurrent/TaskQueue;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/concurrent/Task;->queue:Lokhttp3/internal/concurrent/TaskQueue;

    return-object v0
.end method

.method public final initQueue$okhttp(Lokhttp3/internal/concurrent/TaskQueue;)V
    .locals 1

    const v0, 0x1fec

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lokhttp3/internal/concurrent/Task;->queue:Lokhttp3/internal/concurrent/TaskQueue;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 2
    iput-object p1, p0, Lokhttp3/internal/concurrent/Task;->queue:Lokhttp3/internal/concurrent/TaskQueue;

    return-void

    .line 3
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x1fed

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract runOnce()J
.end method

.method public final setNextExecuteNanoTime$okhttp(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lokhttp3/internal/concurrent/Task;->nextExecuteNanoTime:J

    return-void
.end method

.method public final setQueue$okhttp(Lokhttp3/internal/concurrent/TaskQueue;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/concurrent/Task;->queue:Lokhttp3/internal/concurrent/TaskQueue;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/concurrent/Task;->name:Ljava/lang/String;

    return-object v0
.end method
