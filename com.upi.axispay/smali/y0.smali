.class public Ly0;
.super Landroid/view/ActionMode;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    .line 2
    iput-object p1, p0, Ly0;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Ly0;->b:Lu0;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->c()V

    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    .line 1
    new-instance v0, Lq1;

    iget-object v1, p0, Ly0;->a:Landroid/content/Context;

    iget-object v2, p0, Ly0;->b:Lu0;

    invoke-virtual {v2}, Lu0;->e()Landroid/view/Menu;

    move-result-object v2

    check-cast v2, Lv9;

    invoke-direct {v0, v1, v2}, Lq1;-><init>(Landroid/content/Context;Lv9;)V

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->i()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleOptionalHint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->j()Z

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->k()V

    return-void
.end method

.method public isTitleOptional()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0}, Lu0;->l()Z

    move-result v0

    return v0
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0, p1}, Lu0;->m(Landroid/view/View;)V

    return-void
.end method

.method public setSubtitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0, p1}, Lu0;->n(I)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0, p1}, Lu0;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0, p1}, Lu0;->p(Ljava/lang/Object;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0, p1}, Lu0;->q(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0, p1}, Lu0;->r(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptionalHint(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0;->b:Lu0;

    invoke-virtual {v0, p1}, Lu0;->s(Z)V

    return-void
.end method
