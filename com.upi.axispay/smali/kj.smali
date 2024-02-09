.class public Lkj;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkj$a;,
        Lkj$b;
    }
.end annotation


# instance fields
.field public final a:Lu4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu4<",
            "Landroidx/recyclerview/widget/RecyclerView$d0;",
            "Lkj$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lr4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr4<",
            "Landroidx/recyclerview/widget/RecyclerView$d0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lu4;

    invoke-direct {v0}, Lu4;-><init>()V

    iput-object v0, p0, Lkj;->a:Lu4;

    .line 3
    new-instance v0, Lr4;

    invoke-direct {v0}, Lr4;-><init>()V

    iput-object v0, p0, Lkj;->b:Lr4;

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj$a;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lkj$a;->b()Lkj$a;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lkj;->a:Lu4;

    invoke-virtual {v1, p1, v0}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    iget p1, v0, Lkj$a;->a:I

    or-int/lit8 p1, p1, 0x2

    iput p1, v0, Lkj$a;->a:I

    .line 5
    iput-object p2, v0, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj$a;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lkj$a;->b()Lkj$a;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lkj;->a:Lu4;

    invoke-virtual {v1, p1, v0}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    iget p1, v0, Lkj$a;->a:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Lkj$a;->a:I

    return-void
.end method

.method public c(JLandroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkj;->b:Lr4;

    invoke-virtual {v0, p1, p2, p3}, Lr4;->i(JLjava/lang/Object;)V

    return-void
.end method

.method public d(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj$a;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lkj$a;->b()Lkj$a;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lkj;->a:Lu4;

    invoke-virtual {v1, p1, v0}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    iput-object p2, v0, Lkj$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 5
    iget p1, v0, Lkj$a;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v0, Lkj$a;->a:I

    return-void
.end method

.method public e(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj$a;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lkj$a;->b()Lkj$a;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lkj;->a:Lu4;

    invoke-virtual {v1, p1, v0}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    iput-object p2, v0, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 5
    iget p1, v0, Lkj$a;->a:I

    or-int/lit8 p1, p1, 0x4

    iput p1, v0, Lkj$a;->a:I

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0}, Lu4;->clear()V

    .line 2
    iget-object v0, p0, Lkj;->b:Lr4;

    invoke-virtual {v0}, Lr4;->b()V

    return-void
.end method

.method public g(J)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lkj;->b:Lr4;

    invoke-virtual {v0, p1, p2}, Lr4;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$d0;

    return-object p1
.end method

.method public h(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkj$a;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 2
    iget p1, p1, Lkj$a;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkj$a;

    if-eqz p1, :cond_0

    .line 2
    iget p1, p1, Lkj$a;->a:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public j()V
    .locals 0

    .line 1
    invoke-static {}, Lkj$a;->a()V

    return-void
.end method

.method public k(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkj;->p(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method

.method public final l(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$m$c;
    .locals 4

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->f(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p0, Lkj;->a:Lu4;

    invoke-virtual {v1, p1}, Lu4;->m(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkj$a;

    if-eqz v1, :cond_4

    .line 3
    iget v2, v1, Lkj$a;->a:I

    and-int v3, v2, p2

    if-eqz v3, :cond_4

    not-int v0, p2

    and-int/2addr v0, v2

    .line 4
    iput v0, v1, Lkj$a;->a:I

    const/4 v2, 0x4

    if-ne p2, v2, :cond_1

    .line 5
    iget-object p2, v1, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    if-ne p2, v2, :cond_3

    .line 6
    iget-object p2, v1, Lkj$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    :goto_0
    and-int/lit8 v0, v0, 0xc

    if-nez v0, :cond_2

    .line 7
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->k(I)Ljava/lang/Object;

    .line 8
    invoke-static {v1}, Lkj$a;->c(Lkj$a;)V

    :cond_2
    return-object p2

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0x2af2

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v0
.end method

.method public m(Landroidx/recyclerview/widget/RecyclerView$d0;)Landroidx/recyclerview/widget/RecyclerView$m$c;
    .locals 1

    const/16 v0, 0x8

    .line 1
    invoke-virtual {p0, p1, v0}, Lkj;->l(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$m$c;

    move-result-object p1

    return-object p1
.end method

.method public n(Landroidx/recyclerview/widget/RecyclerView$d0;)Landroidx/recyclerview/widget/RecyclerView$m$c;
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-virtual {p0, p1, v0}, Lkj;->l(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$m$c;

    move-result-object p1

    return-object p1
.end method

.method public o(Lkj$b;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0}, Lu4;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_7

    .line 2
    iget-object v1, p0, Lkj;->a:Lu4;

    invoke-virtual {v1, v0}, Lu4;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$d0;

    .line 3
    iget-object v2, p0, Lkj;->a:Lu4;

    invoke-virtual {v2, v0}, Lu4;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkj$a;

    .line 4
    iget v3, v2, Lkj$a;->a:I

    and-int/lit8 v4, v3, 0x3

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    .line 5
    invoke-interface {p1, v1}, Lkj$b;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_2

    .line 6
    iget-object v3, v2, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    if-nez v3, :cond_1

    .line 7
    invoke-interface {p1, v1}, Lkj$b;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    goto :goto_1

    .line 8
    :cond_1
    iget-object v4, v2, Lkj$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    invoke-interface {p1, v1, v3, v4}, Lkj$b;->c(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    goto :goto_1

    :cond_2
    and-int/lit8 v4, v3, 0xe

    const/16 v5, 0xe

    if-ne v4, v5, :cond_3

    .line 9
    iget-object v3, v2, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    iget-object v4, v2, Lkj$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    invoke-interface {p1, v1, v3, v4}, Lkj$b;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    goto :goto_1

    :cond_3
    and-int/lit8 v4, v3, 0xc

    const/16 v5, 0xc

    if-ne v4, v5, :cond_4

    .line 10
    iget-object v3, v2, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    iget-object v4, v2, Lkj$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    invoke-interface {p1, v1, v3, v4}, Lkj$b;->d(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    goto :goto_1

    :cond_4
    and-int/lit8 v4, v3, 0x4

    if-eqz v4, :cond_5

    .line 11
    iget-object v3, v2, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    const/4 v4, 0x0

    invoke-interface {p1, v1, v3, v4}, Lkj$b;->c(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    goto :goto_1

    :cond_5
    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_6

    .line 12
    iget-object v3, v2, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    iget-object v4, v2, Lkj$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    invoke-interface {p1, v1, v3, v4}, Lkj$b;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    .line 13
    :cond_6
    :goto_1
    invoke-static {v2}, Lkj$a;->c(Lkj$a;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public p(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkj$a;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p1, Lkj$a;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Lkj$a;->a:I

    return-void
.end method

.method public q(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkj;->b:Lr4;

    invoke-virtual {v0}, Lr4;->l()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    iget-object v1, p0, Lkj;->b:Lr4;

    invoke-virtual {v1, v0}, Lr4;->m(I)Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 3
    iget-object v1, p0, Lkj;->b:Lr4;

    invoke-virtual {v1, v0}, Lr4;->k(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4
    :cond_1
    :goto_1
    iget-object v0, p0, Lkj;->a:Lu4;

    invoke-virtual {v0, p1}, Lu4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkj$a;

    if-eqz p1, :cond_2

    .line 5
    invoke-static {p1}, Lkj$a;->c(Lkj$a;)V

    :cond_2
    return-void
.end method
