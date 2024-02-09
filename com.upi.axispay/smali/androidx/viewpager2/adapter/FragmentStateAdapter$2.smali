.class public Landroidx/viewpager2/adapter/FragmentStateAdapter$2;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcf;


# instance fields
.field public final synthetic a:Lpo;

.field public final synthetic b:Loo;


# virtual methods
.method public d(Lef;Lbf$b;)V
    .locals 0

    .line 1
    iget-object p2, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->b:Loo;

    invoke-virtual {p2}, Loo;->w()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {p1}, Lef;->getLifecycle()Lbf;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbf;->c(Ldf;)V

    .line 3
    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->a:Lpo;

    invoke-virtual {p1}, Lpo;->O()Landroid/widget/FrameLayout;

    const/4 p1, 0x0

    throw p1
.end method
