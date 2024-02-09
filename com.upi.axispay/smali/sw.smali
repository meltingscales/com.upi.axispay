.class public Lsw;
.super Landroid/widget/FrameLayout;
.source "AxisPay"

# interfaces
.implements Luw;


# instance fields
.field public final b:Ltw;


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0}, Ltw;->b()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0}, Ltw;->a()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ltw;->c(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method

.method public getCircularRevealOverlayDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0}, Ltw;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getCircularRevealScrimColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0}, Ltw;->e()I

    move-result v0

    return v0
.end method

.method public getRevealInfo()Luw$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0}, Ltw;->f()Luw$e;

    move-result-object v0

    return-object v0
.end method

.method public isOpaque()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ltw;->g()Z

    move-result v0

    return v0

    .line 3
    :cond_0
    invoke-super {p0}, Landroid/widget/FrameLayout;->isOpaque()Z

    move-result v0

    return v0
.end method

.method public setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0, p1}, Ltw;->h(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCircularRevealScrimColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0, p1}, Ltw;->i(I)V

    return-void
.end method

.method public setRevealInfo(Luw$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsw;->b:Ltw;

    invoke-virtual {v0, p1}, Ltw;->j(Luw$e;)V

    return-void
.end method
