.class public abstract Luh$b;
.super Luh$e;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luh$b$c;,
        Luh$b$d;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ljava/util/concurrent/Executor;

.field public c:Luh$b$d;

.field public d:Lsh;

.field public e:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Luh$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Luh$e;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Luh$b;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public j()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(Lsh;Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh;",
            "Ljava/util/Collection<",
            "Luh$b$c;",
            ">;)V"
        }
    .end annotation

    const v0, 0x304c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const v0, 0x304d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {p2, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    iget-object v1, p0, Luh$b;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, Luh$b;->b:Ljava/util/concurrent/Executor;

    if-eqz v2, :cond_0

    .line 5
    iget-object v3, p0, Luh$b;->c:Luh$b$d;

    .line 6
    new-instance v4, Luh$b$b;

    invoke-direct {v4, p0, v3, p1, p2}, Luh$b$b;-><init>(Luh$b;Luh$b$d;Lsh;Ljava/util/Collection;)V

    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 7
    :cond_0
    iput-object p1, p0, Luh$b;->d:Lsh;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Luh$b;->e:Ljava/util/Collection;

    .line 9
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public abstract m(Ljava/lang/String;)V
.end method

.method public abstract n(Ljava/lang/String;)V
.end method

.method public abstract o(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public p(Ljava/util/concurrent/Executor;Luh$b$d;)V
    .locals 5

    .line 1
    iget-object v1, p0, Luh$b;->a:Ljava/lang/Object;

    monitor-enter v1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 2
    :try_start_0
    iput-object p1, p0, Luh$b;->b:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Luh$b;->c:Luh$b$d;

    .line 4
    iget-object p1, p0, Luh$b;->e:Ljava/util/Collection;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Luh$b;->d:Lsh;

    .line 6
    iget-object v2, p0, Luh$b;->e:Ljava/util/Collection;

    const/4 v3, 0x0

    .line 7
    iput-object v3, p0, Luh$b;->d:Lsh;

    .line 8
    iput-object v3, p0, Luh$b;->e:Ljava/util/Collection;

    .line 9
    iget-object v3, p0, Luh$b;->b:Ljava/util/concurrent/Executor;

    new-instance v4, Luh$b$a;

    invoke-direct {v4, p0, p2, p1, v2}, Luh$b$a;-><init>(Luh$b;Luh$b$d;Lsh;Ljava/util/Collection;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 10
    :cond_0
    monitor-exit v1

    return-void

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const v0, 0x304e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const v0, 0x304f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 13
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
