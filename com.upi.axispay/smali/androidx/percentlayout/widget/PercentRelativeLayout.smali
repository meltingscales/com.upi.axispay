.class public Landroidx/percentlayout/widget/PercentRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/percentlayout/widget/PercentRelativeLayout$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final b:Lri;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Lri;

    invoke-direct {p1, p0}, Lri;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Landroidx/percentlayout/widget/PercentRelativeLayout;->b:Lri;

    return-void
.end method


# virtual methods
.method public a()Landroidx/percentlayout/widget/PercentRelativeLayout$a;
    .locals 2

    .line 1
    new-instance v0, Landroidx/percentlayout/widget/PercentRelativeLayout$a;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroidx/percentlayout/widget/PercentRelativeLayout$a;-><init>(II)V

    return-object v0
.end method

.method public b(Landroid/util/AttributeSet;)Landroidx/percentlayout/widget/PercentRelativeLayout$a;
    .locals 2

    .line 1
    new-instance v0, Landroidx/percentlayout/widget/PercentRelativeLayout$a;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/percentlayout/widget/PercentRelativeLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/percentlayout/widget/PercentRelativeLayout;->a()Landroidx/percentlayout/widget/PercentRelativeLayout$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/percentlayout/widget/PercentRelativeLayout;->b(Landroid/util/AttributeSet;)Landroidx/percentlayout/widget/PercentRelativeLayout$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/RelativeLayout$LayoutParams;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/percentlayout/widget/PercentRelativeLayout;->b(Landroid/util/AttributeSet;)Landroidx/percentlayout/widget/PercentRelativeLayout$a;

    move-result-object p1

    return-object p1
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 2
    iget-object p1, p0, Landroidx/percentlayout/widget/PercentRelativeLayout;->b:Lri;

    invoke-virtual {p1}, Lri;->e()V

    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentRelativeLayout;->b:Lri;

    invoke-virtual {v0, p1, p2}, Lri;->a(II)V

    .line 2
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 3
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentRelativeLayout;->b:Lri;

    invoke-virtual {v0}, Lri;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    :cond_0
    return-void
.end method
