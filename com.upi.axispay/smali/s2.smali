.class public Ls2;
.super Landroid/widget/ToggleButton;
.source "AxisPay"

# interfaces
.implements Lzb;


# instance fields
.field public final b:Ly1;

.field public final c:Lq2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x101004b

    .line 1
    invoke-direct {p0, p1, p2, v0}, Ls2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/ToggleButton;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lj3;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 4
    new-instance p1, Ly1;

    invoke-direct {p1, p0}, Ly1;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ls2;->b:Ly1;

    .line 5
    invoke-virtual {p1, p2, p3}, Ly1;->e(Landroid/util/AttributeSet;I)V

    .line 6
    new-instance p1, Lq2;

    invoke-direct {p1, p0}, Lq2;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ls2;->c:Lq2;

    .line 7
    invoke-virtual {p1, p2, p3}, Lq2;->m(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/ToggleButton;->drawableStateChanged()V

    .line 2
    iget-object v0, p0, Ls2;->b:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ly1;->b()V

    .line 4
    :cond_0
    iget-object v0, p0, Ls2;->c:Lq2;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lq2;->b()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ls2;->b:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ly1;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Ls2;->b:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ly1;->d()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Ls2;->b:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ly1;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Ls2;->b:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ly1;->g(I)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls2;->b:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ly1;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls2;->b:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ly1;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
