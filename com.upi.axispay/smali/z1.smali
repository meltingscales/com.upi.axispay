.class public Lz1;
.super Landroid/widget/CheckBox;
.source "AxisPay"

# interfaces
.implements Lcd;
.implements Lzb;


# instance fields
.field public final b:Lb2;

.field public final c:Ly1;

.field public final d:Lq2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Ll;->checkboxStyle:I

    invoke-direct {p0, p1, p2, v0}, Lz1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-static {p1}, Ll3;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lj3;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 4
    new-instance p1, Lb2;

    invoke-direct {p1, p0}, Lb2;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Lz1;->b:Lb2;

    .line 5
    invoke-virtual {p1, p2, p3}, Lb2;->e(Landroid/util/AttributeSet;I)V

    .line 6
    new-instance p1, Ly1;

    invoke-direct {p1, p0}, Ly1;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lz1;->c:Ly1;

    .line 7
    invoke-virtual {p1, p2, p3}, Ly1;->e(Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p1, Lq2;

    invoke-direct {p1, p0}, Lq2;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lz1;->d:Lq2;

    .line 9
    invoke-virtual {p1, p2, p3}, Lq2;->m(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/CheckBox;->drawableStateChanged()V

    .line 2
    iget-object v0, p0, Lz1;->c:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ly1;->b()V

    .line 4
    :cond_0
    iget-object v0, p0, Lz1;->d:Lq2;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lq2;->b()V

    :cond_1
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/CheckBox;->getCompoundPaddingLeft()I

    move-result v0

    .line 2
    iget-object v1, p0, Lz1;->b:Lb2;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, v0}, Lb2;->b(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lz1;->c:Ly1;

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
    iget-object v0, p0, Lz1;->c:Ly1;

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

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lz1;->b:Lb2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lb2;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lz1;->b:Lb2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lb2;->d()Landroid/graphics/PorterDuff$Mode;

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
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lz1;->c:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ly1;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lz1;->c:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ly1;->g(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lk0;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz1;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lz1;->b:Lb2;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lb2;->f()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz1;->c:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ly1;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz1;->c:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ly1;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz1;->b:Lb2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lb2;->g(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz1;->b:Lb2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lb2;->h(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
