.class public abstract Lch$f;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "f"
.end annotation


# instance fields
.field public v:Lyh$i;

.field public final w:Landroid/widget/ImageButton;

.field public final x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

.field public final synthetic y:Lch;


# direct methods
.method public constructor <init>(Lch;Landroid/view/View;Landroid/widget/ImageButton;Landroidx/mediarouter/app/MediaRouteVolumeSlider;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch$f;->y:Lch;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 3
    iput-object p3, p0, Lch$f;->w:Landroid/widget/ImageButton;

    .line 4
    iput-object p4, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    .line 5
    iget-object p2, p1, Lch;->l:Landroid/content/Context;

    invoke-static {p2}, Ldh;->k(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 6
    invoke-virtual {p3, p2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object p1, p1, Lch;->l:Landroid/content/Context;

    invoke-static {p1, p4}, Ldh;->v(Landroid/content/Context;Landroidx/mediarouter/app/MediaRouteVolumeSlider;)V

    return-void
.end method


# virtual methods
.method public O(Lyh$i;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lch$f;->v:Lyh$i;

    .line 2
    invoke-virtual {p1}, Lyh$i;->r()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lch$f;->w:Landroid/widget/ImageButton;

    invoke-virtual {v2, v1}, Landroid/widget/ImageButton;->setActivated(Z)V

    .line 4
    iget-object v1, p0, Lch$f;->w:Landroid/widget/ImageButton;

    new-instance v2, Lch$f$a;

    invoke-direct {v2, p0}, Lch$f$a;-><init>(Lch$f;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v1, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    iget-object v2, p0, Lch$f;->v:Lyh$i;

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v1, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    invoke-virtual {p1}, Lyh$i;->t()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 7
    iget-object p1, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 8
    iget-object p1, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    iget-object v0, p0, Lch$f;->y:Lch;

    iget-object v0, v0, Lch;->s:Lch$j;

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method

.method public P()I
    .locals 2

    .line 1
    iget-object v0, p0, Lch$f;->y:Lch;

    iget-object v0, v0, Lch;->v:Ljava/util/Map;

    iget-object v1, p0, Lch$f;->v:Lyh$i;

    invoke-virtual {v1}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    return v1
.end method

.method public Q(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lch$f;->w:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->isActivated()Z

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lch$f;->w:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setActivated(Z)V

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lch$f;->y:Lch;

    iget-object p1, p1, Lch;->v:Ljava/util/Map;

    iget-object v0, p0, Lch$f;->v:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lch$f;->y:Lch;

    iget-object p1, p1, Lch;->v:Ljava/util/Map;

    iget-object v0, p0, Lch$f;->v:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public R()V
    .locals 2

    .line 1
    iget-object v0, p0, Lch$f;->v:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->r()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0, v1}, Lch$f;->Q(Z)V

    .line 3
    iget-object v1, p0, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    return-void
.end method
