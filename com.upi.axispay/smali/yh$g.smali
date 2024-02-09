.class public final Lyh$g;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:Luh$e;

.field public final b:I

.field public final c:Lyh$i;

.field public final d:Lyh$i;

.field public final e:Lyh$i;

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Luh$b$c;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lyh$e;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lj00;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj00<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Lyh$e;Lyh$i;Luh$e;ILyh$i;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyh$e;",
            "Lyh$i;",
            "Luh$e;",
            "I",
            "Lyh$i;",
            "Ljava/util/Collection<",
            "Luh$b$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lyh$g;->h:Lj00;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lyh$g;->i:Z

    .line 4
    iput-boolean v1, p0, Lyh$g;->j:Z

    .line 5
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lyh$g;->g:Ljava/lang/ref/WeakReference;

    .line 6
    iput-object p2, p0, Lyh$g;->d:Lyh$i;

    .line 7
    iput-object p3, p0, Lyh$g;->a:Luh$e;

    .line 8
    iput p4, p0, Lyh$g;->b:I

    .line 9
    iget-object p2, p1, Lyh$e;->r:Lyh$i;

    iput-object p2, p0, Lyh$g;->c:Lyh$i;

    .line 10
    iput-object p5, p0, Lyh$g;->e:Lyh$i;

    if-nez p6, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    iput-object v0, p0, Lyh$g;->f:Ljava/util/List;

    .line 12
    iget-object p1, p1, Lyh$e;->k:Lyh$e$b;

    new-instance p2, Lhh;

    invoke-direct {p2, p0}, Lhh;-><init>(Lyh$g;)V

    const-wide/16 p3, 0x3a98

    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private synthetic c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyh$g;->b()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyh$g;->i:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lyh$g;->j:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyh$g;->j:Z

    .line 3
    iget-object v0, p0, Lyh$g;->a:Luh$e;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Luh$e;->h(I)V

    .line 5
    iget-object v0, p0, Lyh$g;->a:Luh$e;

    invoke-virtual {v0}, Luh$e;->d()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    iget-boolean v0, p0, Lyh$g;->i:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lyh$g;->j:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, Lyh$g;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh$e;

    if-eqz v0, :cond_2

    .line 4
    iget-object v1, v0, Lyh$e;->A:Lyh$g;

    if-ne v1, p0, :cond_2

    iget-object v1, p0, Lyh$g;->h:Lj00;

    if-eqz v1, :cond_1

    .line 5
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Lyh$g;->i:Z

    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lyh$e;->A:Lyh$g;

    .line 8
    invoke-virtual {p0}, Lyh$g;->g()V

    .line 9
    invoke-virtual {p0}, Lyh$g;->e()V

    return-void

    .line 10
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lyh$g;->a()V

    :cond_3
    :goto_1
    return-void
.end method

.method public synthetic d()V
    .locals 0

    invoke-direct {p0}, Lyh$g;->c()V

    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lyh$g;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh$e;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lyh$g;->d:Lyh$i;

    iput-object v1, v0, Lyh$e;->r:Lyh$i;

    .line 3
    iget-object v2, p0, Lyh$g;->a:Luh$e;

    iput-object v2, v0, Lyh$e;->s:Luh$e;

    .line 4
    iget-object v2, p0, Lyh$g;->e:Lyh$i;

    if-nez v2, :cond_1

    .line 5
    iget-object v2, v0, Lyh$e;->k:Lyh$e$b;

    const/16 v3, 0x106

    new-instance v4, Lza;

    iget-object v5, p0, Lyh$g;->c:Lyh$i;

    invoke-direct {v4, v5, v1}, Lza;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v1, p0, Lyh$g;->b:I

    invoke-virtual {v2, v3, v4, v1}, Lyh$e$b;->c(ILjava/lang/Object;I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v3, v0, Lyh$e;->k:Lyh$e$b;

    const/16 v4, 0x108

    new-instance v5, Lza;

    invoke-direct {v5, v2, v1}, Lza;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v1, p0, Lyh$g;->b:I

    invoke-virtual {v3, v4, v5, v1}, Lyh$e$b;->c(ILjava/lang/Object;I)V

    .line 7
    :goto_0
    iget-object v1, v0, Lyh$e;->v:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 8
    invoke-virtual {v0}, Lyh$e;->A()V

    .line 9
    invoke-virtual {v0}, Lyh$e;->L()V

    .line 10
    iget-object v1, p0, Lyh$g;->f:Ljava/util/List;

    if-eqz v1, :cond_2

    .line 11
    iget-object v0, v0, Lyh$e;->r:Lyh$i;

    invoke-virtual {v0, v1}, Lyh$i;->K(Ljava/util/Collection;)V

    :cond_2
    return-void
.end method

.method public f(Lj00;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj00<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lyh$g;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh$e;

    if-eqz v0, :cond_2

    .line 2
    iget-object v1, v0, Lyh$e;->A:Lyh$g;

    if-eq v1, p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lyh$g;->h:Lj00;

    if-nez v1, :cond_1

    .line 4
    iput-object p1, p0, Lyh$g;->h:Lj00;

    .line 5
    new-instance v1, Leh;

    invoke-direct {v1, p0}, Leh;-><init>(Lyh$g;)V

    iget-object v0, v0, Lyh$e;->k:Lyh$e$b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lih;

    invoke-direct {v2, v0}, Lih;-><init>(Lyh$e$b;)V

    invoke-interface {p1, v1, v2}, Lj00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0xc2a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const p1, 0xc2b

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0xc2c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-virtual {p0}, Lyh$g;->a()V

    return-void
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyh$g;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh$e;

    if-eqz v0, :cond_4

    .line 2
    iget-object v1, v0, Lyh$e;->r:Lyh$i;

    iget-object v2, p0, Lyh$g;->c:Lyh$i;

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, v0, Lyh$e;->k:Lyh$e$b;

    const/16 v3, 0x107

    iget v4, p0, Lyh$g;->b:I

    invoke-virtual {v1, v3, v2, v4}, Lyh$e$b;->c(ILjava/lang/Object;I)V

    .line 4
    iget-object v1, v0, Lyh$e;->s:Luh$e;

    if-eqz v1, :cond_1

    .line 5
    iget v2, p0, Lyh$g;->b:I

    invoke-virtual {v1, v2}, Luh$e;->h(I)V

    .line 6
    iget-object v1, v0, Lyh$e;->s:Luh$e;

    invoke-virtual {v1}, Luh$e;->d()V

    .line 7
    :cond_1
    iget-object v1, v0, Lyh$e;->v:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 8
    iget-object v1, v0, Lyh$e;->v:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luh$e;

    .line 9
    iget v3, p0, Lyh$g;->b:I

    invoke-virtual {v2, v3}, Luh$e;->h(I)V

    .line 10
    invoke-virtual {v2}, Luh$e;->d()V

    goto :goto_0

    .line 11
    :cond_2
    iget-object v1, v0, Lyh$e;->v:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    :cond_3
    const/4 v1, 0x0

    .line 12
    iput-object v1, v0, Lyh$e;->s:Luh$e;

    :cond_4
    :goto_1
    return-void
.end method
