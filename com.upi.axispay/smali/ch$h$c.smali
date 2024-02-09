.class public Lch$h$c;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public A:Lyh$i;

.field public final synthetic B:Lch$h;

.field public final v:Landroid/view/View;

.field public final w:Landroid/widget/ImageView;

.field public final x:Landroid/widget/ProgressBar;

.field public final y:Landroid/widget/TextView;

.field public final z:F


# direct methods
.method public constructor <init>(Lch$h;Landroid/view/View;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lch$h$c;->B:Lch$h;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 3
    iput-object p2, p0, Lch$h$c;->v:Landroid/view/View;

    .line 4
    sget v0, Lng;->mr_cast_group_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lch$h$c;->w:Landroid/widget/ImageView;

    .line 5
    sget v0, Lng;->mr_cast_group_progress_bar:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lch$h$c;->x:Landroid/widget/ProgressBar;

    .line 6
    sget v1, Lng;->mr_cast_group_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lch$h$c;->y:Landroid/widget/TextView;

    .line 7
    iget-object p2, p1, Lch$h;->m:Lch;

    iget-object p2, p2, Lch;->l:Landroid/content/Context;

    invoke-static {p2}, Ldh;->h(Landroid/content/Context;)F

    move-result p2

    iput p2, p0, Lch$h$c;->z:F

    .line 8
    iget-object p1, p1, Lch$h;->m:Lch;

    iget-object p1, p1, Lch;->l:Landroid/content/Context;

    invoke-static {p1, v0}, Ldh;->t(Landroid/content/Context;Landroid/widget/ProgressBar;)V

    return-void
.end method


# virtual methods
.method public O(Lch$h$f;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lch$h$f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyh$i;

    .line 2
    iput-object p1, p0, Lch$h$c;->A:Lyh$i;

    .line 3
    iget-object v0, p0, Lch$h$c;->w:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lch$h$c;->x:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 5
    invoke-virtual {p0, p1}, Lch$h$c;->P(Lyh$i;)Z

    move-result v0

    .line 6
    iget-object v1, p0, Lch$h$c;->v:Landroid/view/View;

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    iget v0, p0, Lch$h$c;->z:F

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 7
    iget-object v0, p0, Lch$h$c;->v:Landroid/view/View;

    new-instance v1, Lch$h$c$a;

    invoke-direct {v1, p0}, Lch$h$c$a;-><init>(Lch$h$c;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v0, p0, Lch$h$c;->w:Landroid/widget/ImageView;

    iget-object v1, p0, Lch$h$c;->B:Lch$h;

    invoke-virtual {v1, p1}, Lch$h;->y(Lyh$i;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    iget-object v0, p0, Lch$h$c;->y:Landroid/widget/TextView;

    invoke-virtual {p1}, Lyh$i;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final P(Lyh$i;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lch$h$c;->B:Lch$h;

    iget-object v0, v0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    .line 2
    invoke-virtual {v0}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    return v2
.end method
