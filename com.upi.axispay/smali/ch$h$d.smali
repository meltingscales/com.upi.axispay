.class public Lch$h$d;
.super Lch$f;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final A:I

.field public final synthetic B:Lch$h;

.field public final z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lch$h;Landroid/view/View;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lch$h$d;->B:Lch$h;

    .line 2
    iget-object v0, p1, Lch$h;->m:Lch;

    sget v1, Lng;->mr_cast_mute_button:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    sget v2, Lng;->mr_cast_volume_slider:I

    .line 3
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    .line 4
    invoke-direct {p0, v0, p2, v1, v2}, Lch$f;-><init>(Lch;Landroid/view/View;Landroid/widget/ImageButton;Landroidx/mediarouter/app/MediaRouteVolumeSlider;)V

    .line 5
    sget v0, Lng;->mr_group_volume_route_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lch$h$d;->z:Landroid/widget/TextView;

    .line 6
    iget-object p1, p1, Lch$h;->m:Lch;

    iget-object p1, p1, Lch;->l:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 8
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 9
    sget v1, Llg;->mr_dynamic_volume_group_list_item_height:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 10
    invoke-virtual {v0, p2}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lch$h$d;->A:I

    return-void
.end method


# virtual methods
.method public S(Lch$h$f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    iget-object v1, p0, Lch$h$d;->B:Lch$h;

    invoke-virtual {v1}, Lch$h;->A()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lch$h$d;->A:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lch;->n(Landroid/view/View;I)V

    .line 2
    invoke-virtual {p1}, Lch$h$f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyh$i;

    .line 3
    invoke-super {p0, p1}, Lch$f;->O(Lyh$i;)V

    .line 4
    iget-object v0, p0, Lch$h$d;->z:Landroid/widget/TextView;

    invoke-virtual {p1}, Lyh$i;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public T()I
    .locals 1

    .line 1
    iget v0, p0, Lch$h$d;->A:I

    return v0
.end method
