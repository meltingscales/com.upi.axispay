.class public abstract Lhl;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Lbl;

.field public volatile c:Lfm;


# direct methods
.method public constructor <init>(Lbl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lhl;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    iput-object p1, p0, Lhl;->b:Lbl;

    return-void
.end method


# virtual methods
.method public a()Lfm;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lhl;->b()V

    .line 2
    iget-object v0, p0, Lhl;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lhl;->e(Z)Lfm;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhl;->b:Lbl;

    invoke-virtual {v0}, Lbl;->a()V

    return-void
.end method

.method public final c()Lfm;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lhl;->d()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lhl;->b:Lbl;

    invoke-virtual {v1, v0}, Lbl;->d(Ljava/lang/String;)Lfm;

    move-result-object v0

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public final e(Z)Lfm;
    .locals 0

    if-eqz p1, :cond_1

    .line 1
    iget-object p1, p0, Lhl;->c:Lfm;

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lhl;->c()Lfm;

    move-result-object p1

    iput-object p1, p0, Lhl;->c:Lfm;

    .line 3
    :cond_0
    iget-object p1, p0, Lhl;->c:Lfm;

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lhl;->c()Lfm;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public f(Lfm;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lhl;->c:Lfm;

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lhl;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
