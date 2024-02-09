.class public Lch$h$g;
.super Lch$f;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final A:Landroid/widget/ImageView;

.field public final B:Landroid/widget/ProgressBar;

.field public final C:Landroid/widget/TextView;

.field public final D:Landroid/widget/RelativeLayout;

.field public final E:Landroid/widget/CheckBox;

.field public final F:F

.field public final G:I

.field public final H:I

.field public final I:Landroid/view/View$OnClickListener;

.field public final synthetic J:Lch$h;

.field public final z:Landroid/view/View;


# direct methods
.method public constructor <init>(Lch$h;Landroid/view/View;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lch$h$g;->J:Lch$h;

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
    new-instance v0, Lch$h$g$a;

    invoke-direct {v0, p0}, Lch$h$g$a;-><init>(Lch$h$g;)V

    iput-object v0, p0, Lch$h$g;->I:Landroid/view/View$OnClickListener;

    .line 6
    iput-object p2, p0, Lch$h$g;->z:Landroid/view/View;

    .line 7
    sget v0, Lng;->mr_cast_route_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lch$h$g;->A:Landroid/widget/ImageView;

    .line 8
    sget v0, Lng;->mr_cast_route_progress_bar:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lch$h$g;->B:Landroid/widget/ProgressBar;

    .line 9
    sget v1, Lng;->mr_cast_route_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lch$h$g;->C:Landroid/widget/TextView;

    .line 10
    sget v1, Lng;->mr_cast_volume_layout:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, p0, Lch$h$g;->D:Landroid/widget/RelativeLayout;

    .line 11
    sget v1, Lng;->mr_cast_checkbox:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/CheckBox;

    iput-object p2, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    .line 12
    iget-object v1, p1, Lch$h;->m:Lch;

    iget-object v1, v1, Lch;->l:Landroid/content/Context;

    invoke-static {v1}, Ldh;->e(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 13
    invoke-virtual {p2, v1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    iget-object p2, p1, Lch$h;->m:Lch;

    iget-object p2, p2, Lch;->l:Landroid/content/Context;

    invoke-static {p2, v0}, Ldh;->t(Landroid/content/Context;Landroid/widget/ProgressBar;)V

    .line 15
    iget-object p2, p1, Lch$h;->m:Lch;

    iget-object p2, p2, Lch;->l:Landroid/content/Context;

    invoke-static {p2}, Ldh;->h(Landroid/content/Context;)F

    move-result p2

    iput p2, p0, Lch$h$g;->F:F

    .line 16
    iget-object p1, p1, Lch$h;->m:Lch;

    iget-object p1, p1, Lch;->l:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 18
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 19
    sget v1, Llg;->mr_dynamic_dialog_row_height:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 20
    invoke-virtual {v0, p2}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lch$h$g;->G:I

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lch$h$g;->H:I

    return-void
.end method


# virtual methods
.method public S(Lch$h$f;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lch$h$f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyh$i;

    .line 2
    iget-object v0, p0, Lch$h$g;->J:Lch$h;

    iget-object v0, v0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    if-ne p1, v0, :cond_1

    invoke-virtual {p1}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyh$i;

    .line 4
    iget-object v2, p0, Lch$h$g;->J:Lch$h;

    iget-object v2, v2, Lch$h;->m:Lch;

    iget-object v2, v2, Lch;->i:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object p1, v1

    .line 5
    :cond_1
    invoke-virtual {p0, p1}, Lch$f;->O(Lyh$i;)V

    .line 6
    iget-object v0, p0, Lch$h$g;->A:Landroid/widget/ImageView;

    iget-object v1, p0, Lch$h$g;->J:Lch$h;

    invoke-virtual {v1, p1}, Lch$h;->y(Lyh$i;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object v0, p0, Lch$h$g;->C:Landroid/widget/TextView;

    invoke-virtual {p1}, Lyh$i;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 9
    invoke-virtual {p0, p1}, Lch$h$g;->U(Lyh$i;)Z

    move-result v0

    .line 10
    invoke-virtual {p0, p1}, Lch$h$g;->T(Lyh$i;)Z

    move-result p1

    .line 11
    iget-object v2, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    invoke-virtual {v2, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 12
    iget-object v2, p0, Lch$h$g;->B:Landroid/widget/ProgressBar;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 13
    iget-object v2, p0, Lch$h$g;->A:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    iget-object v2, p0, Lch$h$g;->z:Landroid/view/View;

    invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 15
    iget-object v2, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    invoke-virtual {v2, p1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 16
    iget-object v2, p0, Lch$f;->w:Landroid/widget/ImageButton;

    const/4 v3, 0x1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v4, v1

    goto :goto_1

    :cond_3
    :goto_0
    move v4, v3

    :goto_1
    invoke-virtual {v2, v4}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 17
    iget-object v2, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    if-nez p1, :cond_4

    if-eqz v0, :cond_5

    :cond_4
    move v1, v3

    :cond_5
    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 18
    iget-object v1, p0, Lch$h$g;->z:Landroid/view/View;

    iget-object v2, p0, Lch$h$g;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object v1, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    iget-object v2, p0, Lch$h$g;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object v1, p0, Lch$h$g;->D:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_6

    .line 21
    iget-object v2, p0, Lch$f;->v:Lyh$i;

    invoke-virtual {v2}, Lyh$i;->x()Z

    move-result v2

    if-nez v2, :cond_6

    .line 22
    iget v2, p0, Lch$h$g;->G:I

    goto :goto_2

    :cond_6
    iget v2, p0, Lch$h$g;->H:I

    .line 23
    :goto_2
    invoke-static {v1, v2}, Lch;->n(Landroid/view/View;I)V

    .line 24
    iget-object v1, p0, Lch$h$g;->z:Landroid/view/View;

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez p1, :cond_8

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    iget v3, p0, Lch$h$g;->F:F

    goto :goto_4

    :cond_8
    :goto_3
    move v3, v2

    :goto_4
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 25
    iget-object v1, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    if-nez p1, :cond_a

    if-nez v0, :cond_9

    goto :goto_5

    :cond_9
    iget v2, p0, Lch$h$g;->F:F

    :cond_a
    :goto_5
    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setAlpha(F)V

    return-void
.end method

.method public final T(Lyh$i;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lch$h$g;->J:Lch$h;

    iget-object v0, v0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lch$h$g;->U(Lyh$i;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lch$h$g;->J:Lch$h;

    iget-object v0, v0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    return v1

    .line 3
    :cond_1
    invoke-virtual {p0, p1}, Lch$h$g;->U(Lyh$i;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 4
    iget-object v0, p0, Lch$h$g;->J:Lch$h;

    iget-object v0, v0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    .line 5
    invoke-virtual {v0, p1}, Lyh$i;->h(Lyh$i;)Lyh$i$a;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Lyh$i$a;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    move v1, v2

    :cond_2
    return v1

    :cond_3
    return v2
.end method

.method public U(Lyh$i;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lyh$i;->B()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lch$h$g;->J:Lch$h;

    iget-object v0, v0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    .line 3
    invoke-virtual {v0, p1}, Lyh$i;->h(Lyh$i;)Lyh$i$a;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lyh$i$a;->a()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public V(ZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 2
    iget-object v0, p0, Lch$h$g;->z:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lch$h$g;->E:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    if-eqz p1, :cond_0

    .line 4
    iget-object v0, p0, Lch$h$g;->A:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lch$h$g;->B:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_0
    if-eqz p2, :cond_2

    .line 6
    iget-object p2, p0, Lch$h$g;->J:Lch$h;

    iget-object v0, p0, Lch$h$g;->D:Landroid/widget/RelativeLayout;

    if-eqz p1, :cond_1

    .line 7
    iget p1, p0, Lch$h$g;->G:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lch$h$g;->H:I

    .line 8
    :goto_0
    invoke-virtual {p2, v0, p1}, Lch$h;->w(Landroid/view/View;I)V

    :cond_2
    return-void
.end method
