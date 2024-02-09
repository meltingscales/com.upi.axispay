.class public Lj90$c;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/Button;

.field public y:Landroid/widget/ImageView;

.field public z:Lcom/pkmmte/view/CircularImageView;


# direct methods
.method public constructor <init>(Lj90;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a04f6

    .line 2
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lj90$c;->v:Landroid/widget/TextView;

    const p1, 0x7f0a04ba

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lj90$c;->w:Landroid/widget/TextView;

    const p1, 0x7f0a0139

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lj90$c;->y:Landroid/widget/ImageView;

    const p1, 0x7f0a00fd

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lj90$c;->x:Landroid/widget/Button;

    const p1, 0x7f0a013e

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/pkmmte/view/CircularImageView;

    iput-object p1, p0, Lj90$c;->z:Lcom/pkmmte/view/CircularImageView;

    return-void
.end method

.method public static synthetic O(Lj90$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lj90$c;->v:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic P(Lj90$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lj90$c;->w:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic Q(Lj90$c;)Lcom/pkmmte/view/CircularImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lj90$c;->z:Lcom/pkmmte/view/CircularImageView;

    return-object p0
.end method

.method public static synthetic R(Lj90$c;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lj90$c;->x:Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic S(Lj90$c;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lj90$c;->y:Landroid/widget/ImageView;

    return-object p0
.end method
