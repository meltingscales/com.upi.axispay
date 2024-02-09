.class public Li4;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ll4;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lk4;)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4;->o(Lk4;)Lm4;

    move-result-object p1

    invoke-virtual {p1}, Lm4;->c()F

    move-result p1

    return p1
.end method

.method public b(Lk4;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4;->o(Lk4;)Lm4;

    move-result-object p1

    invoke-virtual {p1}, Lm4;->b()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public c(Lk4;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V
    .locals 0

    .line 1
    new-instance p2, Lm4;

    invoke-direct {p2, p3, p4}, Lm4;-><init>(Landroid/content/res/ColorStateList;F)V

    .line 2
    invoke-interface {p1, p2}, Lk4;->d(Landroid/graphics/drawable/Drawable;)V

    .line 3
    invoke-interface {p1}, Lk4;->b()Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x1

    .line 4
    invoke-virtual {p2, p3}, Landroid/view/View;->setClipToOutline(Z)V

    .line 5
    invoke-virtual {p2, p5}, Landroid/view/View;->setElevation(F)V

    .line 6
    invoke-virtual {p0, p1, p6}, Li4;->n(Lk4;F)V

    return-void
.end method

.method public d(Lk4;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4;->o(Lk4;)Lm4;

    move-result-object p1

    invoke-virtual {p1, p2}, Lm4;->h(F)V

    return-void
.end method

.method public e(Lk4;)F
    .locals 0

    .line 1
    invoke-interface {p1}, Lk4;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g(Lk4;)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4;->o(Lk4;)Lm4;

    move-result-object p1

    invoke-virtual {p1}, Lm4;->d()F

    move-result p1

    return p1
.end method

.method public h(Lk4;)F
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Li4;->g(Lk4;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public i(Lk4;)F
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Li4;->g(Lk4;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public j(Lk4;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Li4;->a(Lk4;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Li4;->n(Lk4;F)V

    return-void
.end method

.method public k(Lk4;F)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lk4;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public l(Lk4;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Li4;->a(Lk4;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Li4;->n(Lk4;F)V

    return-void
.end method

.method public m(Lk4;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4;->o(Lk4;)Lm4;

    move-result-object p1

    invoke-virtual {p1, p2}, Lm4;->f(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public n(Lk4;F)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Li4;->o(Lk4;)Lm4;

    move-result-object v0

    .line 2
    invoke-interface {p1}, Lk4;->f()Z

    move-result v1

    invoke-interface {p1}, Lk4;->e()Z

    move-result v2

    .line 3
    invoke-virtual {v0, p2, v1, v2}, Lm4;->g(FZZ)V

    .line 4
    invoke-virtual {p0, p1}, Li4;->p(Lk4;)V

    return-void
.end method

.method public final o(Lk4;)Lm4;
    .locals 0

    .line 1
    invoke-interface {p1}, Lk4;->g()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lm4;

    return-object p1
.end method

.method public p(Lk4;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lk4;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, v0, v0, v0}, Lk4;->a(IIII)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Li4;->a(Lk4;)F

    move-result v0

    .line 4
    invoke-virtual {p0, p1}, Li4;->g(Lk4;)F

    move-result v1

    .line 5
    invoke-interface {p1}, Lk4;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, Ln4;->c(FFZ)F

    move-result v2

    float-to-double v2, v2

    .line 6
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 7
    invoke-interface {p1}, Lk4;->e()Z

    move-result v3

    invoke-static {v0, v1, v3}, Ln4;->d(FFZ)F

    move-result v0

    float-to-double v0, v0

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 9
    invoke-interface {p1, v2, v0, v2, v0}, Lk4;->a(IIII)V

    return-void
.end method
