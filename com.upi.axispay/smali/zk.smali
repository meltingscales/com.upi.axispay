.class public final Lzk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lfm;


# instance fields
.field public final b:Lfm;

.field public final c:Lbl$f;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lfm;Lbl$f;Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzk;->e:Ljava/util/List;

    .line 3
    iput-object p1, p0, Lzk;->b:Lfm;

    .line 4
    iput-object p2, p0, Lzk;->c:Lbl$f;

    .line 5
    iput-object p3, p0, Lzk;->d:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lzk;->f:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private synthetic b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lzk;->c:Lbl$f;

    iget-object v1, p0, Lzk;->d:Ljava/lang/String;

    iget-object v2, p0, Lzk;->e:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lbl$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lzk;->c:Lbl$f;

    iget-object v1, p0, Lzk;->d:Ljava/lang/String;

    iget-object v2, p0, Lzk;->e:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lbl$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public C(IJ)V
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lzk;->r(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0, p1, p2, p3}, Ldm;->C(IJ)V

    return-void
.end method

.method public H(I[B)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lzk;->r(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0, p1, p2}, Ldm;->H(I[B)V

    return-void
.end method

.method public L()J
    .locals 2

    .line 1
    iget-object v0, p0, Lzk;->f:Ljava/util/concurrent/Executor;

    new-instance v1, Lak;

    invoke-direct {v1, p0}, Lak;-><init>(Lzk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0}, Lfm;->L()J

    move-result-wide v0

    return-wide v0
.end method

.method public a(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lzk;->r(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0, p1, p2}, Ldm;->a(ILjava/lang/String;)V

    return-void
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public synthetic j()V
    .locals 0

    invoke-direct {p0}, Lzk;->b()V

    return-void
.end method

.method public l()I
    .locals 2

    .line 1
    iget-object v0, p0, Lzk;->f:Ljava/util/concurrent/Executor;

    new-instance v1, Lbk;

    invoke-direct {v1, p0}, Lbk;-><init>(Lzk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0}, Lfm;->l()I

    move-result v0

    return v0
.end method

.method public synthetic m()V
    .locals 0

    invoke-direct {p0}, Lzk;->k()V

    return-void
.end method

.method public q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzk;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lzk;->r(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0, p1}, Ldm;->q(I)V

    return-void
.end method

.method public final r(ILjava/lang/Object;)V
    .locals 3

    add-int/lit8 p1, p1, -0x1

    .line 1
    iget-object v0, p0, Lzk;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lzk;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-gt v0, p1, :cond_0

    .line 3
    iget-object v1, p0, Lzk;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lzk;->e:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public s(ID)V
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lzk;->r(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lzk;->b:Lfm;

    invoke-interface {v0, p1, p2, p3}, Ldm;->s(ID)V

    return-void
.end method
