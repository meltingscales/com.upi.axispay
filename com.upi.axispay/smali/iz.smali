.class public Liz;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static a(I)Lez;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    .line 1
    invoke-static {}, Liz;->b()Lez;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Lfz;

    invoke-direct {p0}, Lfz;-><init>()V

    return-object p0

    .line 3
    :cond_1
    new-instance p0, Lkz;

    invoke-direct {p0}, Lkz;-><init>()V

    return-object p0
.end method

.method public static b()Lez;
    .locals 1

    .line 1
    new-instance v0, Lkz;

    invoke-direct {v0}, Lkz;-><init>()V

    return-object v0
.end method

.method public static c()Lgz;
    .locals 1

    .line 1
    new-instance v0, Lgz;

    invoke-direct {v0}, Lgz;-><init>()V

    return-object v0
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 2
    instance-of v0, p0, Lhz;

    if-eqz v0, :cond_0

    .line 3
    check-cast p0, Lhz;

    invoke-virtual {p0, p1}, Lhz;->W(F)V

    :cond_0
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lhz;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lhz;

    invoke-static {p0, v0}, Liz;->f(Landroid/view/View;Lhz;)V

    :cond_0
    return-void
.end method

.method public static f(Landroid/view/View;Lhz;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lhz;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lny;->c(Landroid/view/View;)F

    move-result p0

    invoke-virtual {p1, p0}, Lhz;->a0(F)V

    :cond_0
    return-void
.end method
