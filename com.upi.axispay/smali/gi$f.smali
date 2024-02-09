.class public final Lgi$f;
.super Luh$b;
.source "AxisPay"

# interfaces
.implements Lgi$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation


# instance fields
.field public final f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:I

.field public k:I

.field public l:Lgi$a;

.field public m:I

.field public final synthetic n:Lgi;


# direct methods
.method public constructor <init>(Lgi;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgi$f;->n:Lgi;

    invoke-direct {p0}, Luh$b;-><init>()V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lgi$f;->j:I

    .line 3
    iput p1, p0, Lgi$f;->m:I

    .line 4
    iput-object p2, p0, Lgi$f;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lgi$f;->m:I

    return v0
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1}, Lgi$a;->p(I)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lgi$f;->l:Lgi$a;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lgi$f;->m:I

    :cond_0
    return-void
.end method

.method public c(Lgi$a;)V
    .locals 2

    .line 1
    new-instance v0, Lgi$f$a;

    invoke-direct {v0, p0}, Lgi$f$a;-><init>(Lgi$f;)V

    .line 2
    iput-object p1, p0, Lgi$f;->l:Lgi$a;

    .line 3
    iget-object v1, p0, Lgi$f;->f:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lgi$a;->b(Ljava/lang/String;Lyh$d;)I

    move-result v0

    iput v0, p0, Lgi$f;->m:I

    .line 4
    iget-boolean v1, p0, Lgi$f;->i:Z

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p1, v0}, Lgi$a;->r(I)V

    .line 6
    iget v0, p0, Lgi$f;->j:I

    if-ltz v0, :cond_0

    .line 7
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {p1, v1, v0}, Lgi$a;->u(II)V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lgi$f;->j:I

    .line 9
    :cond_0
    iget v0, p0, Lgi$f;->k:I

    if-eqz v0, :cond_1

    .line 10
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {p1, v1, v0}, Lgi$a;->x(II)V

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lgi$f;->k:I

    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgi$f;->n:Lgi;

    invoke-virtual {v0, p0}, Lgi;->N(Lgi$c;)V

    return-void
.end method

.method public e()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lgi$f;->i:Z

    .line 2
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 3
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1}, Lgi$a;->r(I)V

    :cond_0
    return-void
.end method

.method public f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->u(II)V

    goto :goto_0

    .line 3
    :cond_0
    iput p1, p0, Lgi$f;->j:I

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lgi$f;->k:I

    :goto_0
    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lgi$f;->h(I)V

    return-void
.end method

.method public h(I)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lgi$f;->i:Z

    .line 2
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 3
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->v(II)V

    :cond_0
    return-void
.end method

.method public i(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->x(II)V

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lgi$f;->k:I

    add-int/2addr v0, p1

    iput v0, p0, Lgi$f;->k:I

    :goto_0
    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lgi$f;->g:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lgi$f;->h:Ljava/lang/String;

    return-object v0
.end method

.method public m(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->a(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->q(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public o(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgi$f;->l:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$f;->m:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->w(ILjava/util/List;)V

    :cond_0
    return-void
.end method

.method public q(Lsh;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh;",
            "Ljava/util/List<",
            "Luh$b$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Luh$b;->l(Lsh;Ljava/util/Collection;)V

    return-void
.end method
