.class public Lbh$d$c;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbh$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final v:Landroid/view/View;

.field public final w:Landroid/widget/ImageView;

.field public final x:Landroid/widget/ProgressBar;

.field public final y:Landroid/widget/TextView;

.field public final synthetic z:Lbh$d;


# direct methods
.method public constructor <init>(Lbh$d;Landroid/view/View;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lbh$d$c;->z:Lbh$d;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 3
    iput-object p2, p0, Lbh$d$c;->v:Landroid/view/View;

    .line 4
    sget v0, Lng;->mr_picker_route_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lbh$d$c;->w:Landroid/widget/ImageView;

    .line 5
    sget v0, Lng;->mr_picker_route_progress_bar:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lbh$d$c;->x:Landroid/widget/ProgressBar;

    .line 6
    sget v1, Lng;->mr_picker_route_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lbh$d$c;->y:Landroid/widget/TextView;

    .line 7
    iget-object p1, p1, Lbh$d;->j:Lbh;

    iget-object p1, p1, Lbh;->f:Landroid/content/Context;

    invoke-static {p1, v0}, Ldh;->t(Landroid/content/Context;Landroid/widget/ProgressBar;)V

    return-void
.end method


# virtual methods
.method public O(Lbh$d$b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lbh$d$b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyh$i;

    .line 2
    iget-object v0, p0, Lbh$d$c;->v:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lbh$d$c;->x:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lbh$d$c;->v:Landroid/view/View;

    new-instance v1, Lbh$d$c$a;

    invoke-direct {v1, p0, p1}, Lbh$d$c$a;-><init>(Lbh$d$c;Lyh$i;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lbh$d$c;->y:Landroid/widget/TextView;

    invoke-virtual {p1}, Lyh$i;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lbh$d$c;->w:Landroid/widget/ImageView;

    iget-object v1, p0, Lbh$d$c;->z:Lbh$d;

    invoke-virtual {v1, p1}, Lbh$d;->x(Lyh$i;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
