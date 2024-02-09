.class public Luk;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public c:I

.field public final d:Ltk;

.field public final e:Ltk$c;

.field public f:Lqk;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lpk;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:Landroid/content/ServiceConnection;

.field public final k:Ljava/lang/Runnable;

.field public final l:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ltk;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Luk$a;

    invoke-direct {v0, p0}, Luk$a;-><init>(Luk;)V

    iput-object v0, p0, Luk;->h:Lpk;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Luk;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    new-instance v0, Luk$b;

    invoke-direct {v0, p0}, Luk$b;-><init>(Luk;)V

    iput-object v0, p0, Luk;->j:Landroid/content/ServiceConnection;

    .line 5
    new-instance v2, Luk$c;

    invoke-direct {v2, p0}, Luk$c;-><init>(Luk;)V

    iput-object v2, p0, Luk;->k:Ljava/lang/Runnable;

    .line 6
    new-instance v2, Luk$d;

    invoke-direct {v2, p0}, Luk$d;-><init>(Luk;)V

    iput-object v2, p0, Luk;->l:Ljava/lang/Runnable;

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Luk;->a:Landroid/content/Context;

    .line 8
    iput-object p2, p0, Luk;->b:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Luk;->d:Ltk;

    .line 10
    iput-object p5, p0, Luk;->g:Ljava/util/concurrent/Executor;

    .line 11
    iget-object p2, p4, Ltk;->a:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    .line 12
    new-instance p4, Luk$e;

    new-array p5, v1, [Ljava/lang/String;

    invoke-interface {p2, p5}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p4, p0, p2}, Luk$e;-><init>(Luk;[Ljava/lang/String;)V

    iput-object p4, p0, Luk;->e:Ltk$c;

    const/4 p2, 0x1

    .line 13
    invoke-virtual {p1, p3, v0, p2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method
