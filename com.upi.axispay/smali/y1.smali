.class public Ly1;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lc2;

.field public c:I

.field public d:Lm3;

.field public e:Lm3;

.field public f:Lm3;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Ly1;->c:I

    .line 3
    iput-object p1, p0, Ly1;->a:Landroid/view/View;

    .line 4
    invoke-static {}, Lc2;->b()Lc2;

    move-result-object p1

    iput-object p1, p0, Ly1;->b:Lc2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly1;->f:Lm3;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm3;

    invoke-direct {v0}, Lm3;-><init>()V

    iput-object v0, p0, Ly1;->f:Lm3;

    .line 3
    :cond_0
    iget-object v0, p0, Ly1;->f:Lm3;

    .line 4
    invoke-virtual {v0}, Lm3;->a()V

    .line 5
    iget-object v1, p0, Ly1;->a:Landroid/view/View;

    invoke-static {v1}, Lac;->s(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 6
    iput-boolean v2, v0, Lm3;->d:Z

    .line 7
    iput-object v1, v0, Lm3;->a:Landroid/content/res/ColorStateList;

    .line 8
    :cond_1
    iget-object v1, p0, Ly1;->a:Landroid/view/View;

    invoke-static {v1}, Lac;->t(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 9
    iput-boolean v2, v0, Lm3;->c:Z

    .line 10
    iput-object v1, v0, Lm3;->b:Landroid/graphics/PorterDuff$Mode;

    .line 11
    :cond_2
    iget-boolean v1, v0, Lm3;->d:Z

    if-nez v1, :cond_4

    iget-boolean v1, v0, Lm3;->c:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    .line 12
    :cond_4
    :goto_0
    iget-object v1, p0, Ly1;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-static {p1, v0, v1}, Lc2;->i(Landroid/graphics/drawable/Drawable;Lm3;[I)V

    return v2
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p0}, Ly1;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Ly1;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Ly1;->e:Lm3;

    if-eqz v1, :cond_1

    .line 5
    iget-object v2, p0, Ly1;->a:Landroid/view/View;

    .line 6
    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    .line 7
    invoke-static {v0, v1, v2}, Lc2;->i(Landroid/graphics/drawable/Drawable;Lm3;[I)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Ly1;->d:Lm3;

    if-eqz v1, :cond_2

    .line 9
    iget-object v2, p0, Ly1;->a:Landroid/view/View;

    .line 10
    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    .line 11
    invoke-static {v0, v1, v2}, Lc2;->i(Landroid/graphics/drawable/Drawable;Lm3;[I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public c()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1;->e:Lm3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm3;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public d()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1;->e:Lm3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm3;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e(Landroid/util/AttributeSet;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Ly1;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lu;->ViewBackgroundHelper:[I

    const/4 v1, 0x0

    invoke-static {v0, p1, v3, p2, v1}, Lo3;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo3;

    move-result-object v0

    .line 2
    iget-object v1, p0, Ly1;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 3
    invoke-virtual {v0}, Lo3;->r()Landroid/content/res/TypedArray;

    move-result-object v5

    const/4 v7, 0x0

    move-object v4, p1

    move v6, p2

    .line 4
    invoke-static/range {v1 .. v7}, Lac;->o0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 5
    :try_start_0
    sget p1, Lu;->ViewBackgroundHelper_android_background:I

    invoke-virtual {v0, p1}, Lo3;->s(I)Z

    move-result p2

    const/4 v1, -0x1

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {v0, p1, v1}, Lo3;->n(II)I

    move-result p1

    iput p1, p0, Ly1;->c:I

    .line 7
    iget-object p1, p0, Ly1;->b:Lc2;

    iget-object p2, p0, Ly1;->a:Landroid/view/View;

    .line 8
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iget v2, p0, Ly1;->c:I

    invoke-virtual {p1, p2, v2}, Lc2;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Ly1;->h(Landroid/content/res/ColorStateList;)V

    .line 10
    :cond_0
    sget p1, Lu;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {v0, p1}, Lo3;->s(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 11
    iget-object p2, p0, Ly1;->a:Landroid/view/View;

    .line 12
    invoke-virtual {v0, p1}, Lo3;->c(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 13
    invoke-static {p2, p1}, Lac;->v0(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 14
    :cond_1
    sget p1, Lu;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {v0, p1}, Lo3;->s(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 15
    iget-object p2, p0, Ly1;->a:Landroid/view/View;

    .line 16
    invoke-virtual {v0, p1, v1}, Lo3;->k(II)I

    move-result p1

    const/4 v1, 0x0

    .line 17
    invoke-static {p1, v1}, Lv2;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    .line 18
    invoke-static {p2, p1}, Lac;->w0(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :cond_2
    invoke-virtual {v0}, Lo3;->w()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lo3;->w()V

    .line 20
    throw p1
.end method

.method public f(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, -0x1

    .line 1
    iput p1, p0, Ly1;->c:I

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ly1;->h(Landroid/content/res/ColorStateList;)V

    .line 3
    invoke-virtual {p0}, Ly1;->b()V

    return-void
.end method

.method public g(I)V
    .locals 2

    .line 1
    iput p1, p0, Ly1;->c:I

    .line 2
    iget-object v0, p0, Ly1;->b:Lc2;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Ly1;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lc2;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0, p1}, Ly1;->h(Landroid/content/res/ColorStateList;)V

    .line 5
    invoke-virtual {p0}, Ly1;->b()V

    return-void
.end method

.method public h(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Ly1;->d:Lm3;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm3;

    invoke-direct {v0}, Lm3;-><init>()V

    iput-object v0, p0, Ly1;->d:Lm3;

    .line 3
    :cond_0
    iget-object v0, p0, Ly1;->d:Lm3;

    iput-object p1, v0, Lm3;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, v0, Lm3;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Ly1;->d:Lm3;

    .line 6
    :goto_0
    invoke-virtual {p0}, Ly1;->b()V

    return-void
.end method

.method public i(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1;->e:Lm3;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm3;

    invoke-direct {v0}, Lm3;-><init>()V

    iput-object v0, p0, Ly1;->e:Lm3;

    .line 3
    :cond_0
    iget-object v0, p0, Ly1;->e:Lm3;

    iput-object p1, v0, Lm3;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, v0, Lm3;->d:Z

    .line 5
    invoke-virtual {p0}, Ly1;->b()V

    return-void
.end method

.method public j(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1;->e:Lm3;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm3;

    invoke-direct {v0}, Lm3;-><init>()V

    iput-object v0, p0, Ly1;->e:Lm3;

    .line 3
    :cond_0
    iget-object v0, p0, Ly1;->e:Lm3;

    iput-object p1, v0, Lm3;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, v0, Lm3;->c:Z

    .line 5
    invoke-virtual {p0}, Ly1;->b()V

    return-void
.end method

.method public final k()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x15

    if-le v0, v3, :cond_1

    .line 2
    iget-object v0, p0, Ly1;->d:Lm3;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    if-ne v0, v3, :cond_2

    return v1

    :cond_2
    return v2
.end method
