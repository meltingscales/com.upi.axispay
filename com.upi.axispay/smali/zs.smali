.class public Lzs;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Llu;

.field public final c:Lbt;

.field public final d:Lyu;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Llu;Lbt;Lyu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzs;->a:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Lzs;->b:Llu;

    .line 4
    iput-object p3, p0, Lzs;->c:Lbt;

    .line 5
    iput-object p4, p0, Lzs;->d:Lyu;

    return-void
.end method

.method private synthetic b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lzs;->b:Llu;

    invoke-interface {v0}, Llu;->y()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llq;

    .line 2
    iget-object v2, p0, Lzs;->c:Lbt;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Lbt;->a(Llq;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzs;->d:Lyu;

    new-instance v1, Lps;

    invoke-direct {v1, p0}, Lps;-><init>(Lzs;)V

    invoke-interface {v0, v1}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzs;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lqs;

    invoke-direct {v1, p0}, Lqs;-><init>(Lzs;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lzs;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e()V
    .locals 0

    invoke-direct {p0}, Lzs;->d()V

    return-void
.end method
