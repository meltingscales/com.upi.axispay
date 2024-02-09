.class public abstract Ld1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lo1;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/content/Context;

.field public d:Li1;

.field public e:Landroid/view/LayoutInflater;

.field public f:Lo1$a;

.field public g:I

.field public h:I

.field public i:Lp1;

.field public j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld1;->b:Landroid/content/Context;

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Ld1;->e:Landroid/view/LayoutInflater;

    .line 4
    iput p2, p0, Ld1;->g:I

    .line 5
    iput p3, p0, Ld1;->h:I

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object v0, p0, Ld1;->i:Lp1;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public b(Li1;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld1;->f:Lo1$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lo1$a;->b(Li1;Z)V

    :cond_0
    return-void
.end method

.method public abstract c(Lk1;Lp1$a;)V
.end method

.method public d(Landroid/content/Context;Li1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld1;->c:Landroid/content/Context;

    .line 2
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 3
    iput-object p2, p0, Ld1;->d:Li1;

    return-void
.end method

.method public f(Lt1;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld1;->f:Lo1$a;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Ld1;->d:Li1;

    :goto_0
    invoke-interface {v0, p1}, Lo1$a;->c(Li1;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public g(Z)V
    .locals 9

    .line 1
    iget-object p1, p0, Ld1;->i:Lp1;

    check-cast p1, Landroid/view/ViewGroup;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Ld1;->d:Li1;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 3
    invoke-virtual {v0}, Li1;->t()V

    .line 4
    iget-object v0, p0, Ld1;->d:Li1;

    invoke-virtual {v0}, Li1;->G()Ljava/util/ArrayList;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_5

    .line 6
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk1;

    .line 7
    invoke-virtual {p0, v4, v5}, Ld1;->s(ILk1;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 8
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 9
    instance-of v7, v6, Lp1$a;

    if-eqz v7, :cond_1

    .line 10
    move-object v7, v6

    check-cast v7, Lp1$a;

    invoke-interface {v7}, Lp1$a;->getItemData()Lk1;

    move-result-object v7

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 11
    :goto_1
    invoke-virtual {p0, v5, v6, p1}, Ld1;->p(Lk1;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    if-eq v5, v7, :cond_2

    .line 12
    invoke-virtual {v8, v1}, Landroid/view/View;->setPressed(Z)V

    .line 13
    invoke-virtual {v8}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    :cond_2
    if-eq v8, v6, :cond_3

    .line 14
    invoke-virtual {p0, v8, v4}, Ld1;->a(Landroid/view/View;I)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    move v1, v4

    .line 15
    :cond_6
    :goto_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_7

    .line 16
    invoke-virtual {p0, p1, v1}, Ld1;->n(Landroid/view/ViewGroup;I)Z

    move-result v0

    if-nez v0, :cond_6

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    return-void
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Ld1;->j:I

    return v0
.end method

.method public h(Landroid/view/ViewGroup;)Lp1$a;
    .locals 3

    .line 1
    iget-object v0, p0, Ld1;->e:Landroid/view/LayoutInflater;

    iget v1, p0, Ld1;->h:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lp1$a;

    return-object p1
.end method

.method public k(Li1;Lk1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public l(Li1;Lk1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public m(Lo1$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld1;->f:Lo1$a;

    return-void
.end method

.method public n(Landroid/view/ViewGroup;I)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public o()Lo1$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1;->f:Lo1$a;

    return-object v0
.end method

.method public p(Lk1;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1
    instance-of v0, p2, Lp1$a;

    if-eqz v0, :cond_0

    .line 2
    check-cast p2, Lp1$a;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p3}, Ld1;->h(Landroid/view/ViewGroup;)Lp1$a;

    move-result-object p2

    .line 4
    :goto_0
    invoke-virtual {p0, p1, p2}, Ld1;->c(Lk1;Lp1$a;)V

    .line 5
    check-cast p2, Landroid/view/View;

    return-object p2
.end method

.method public q(Landroid/view/ViewGroup;)Lp1;
    .locals 3

    .line 1
    iget-object v0, p0, Ld1;->i:Lp1;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Ld1;->e:Landroid/view/LayoutInflater;

    iget v1, p0, Ld1;->g:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lp1;

    iput-object p1, p0, Ld1;->i:Lp1;

    .line 3
    iget-object v0, p0, Ld1;->d:Li1;

    invoke-interface {p1, v0}, Lp1;->b(Li1;)V

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Ld1;->g(Z)V

    .line 5
    :cond_0
    iget-object p1, p0, Ld1;->i:Lp1;

    return-object p1
.end method

.method public r(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld1;->j:I

    return-void
.end method

.method public abstract s(ILk1;)Z
.end method
