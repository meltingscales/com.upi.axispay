.class public Lz90$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Lcom/pkmmte/view/CircularImageView;

.field public z:Landroid/view/View;


# direct methods
.method public constructor <init>(Lz90;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p2, p0, Lz90$b;->z:Landroid/view/View;

    const p1, 0x7f0a0515

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lz90$b;->x:Landroid/widget/TextView;

    const p1, 0x7f0a0514

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/pkmmte/view/CircularImageView;

    iput-object p1, p0, Lz90$b;->y:Lcom/pkmmte/view/CircularImageView;

    const p1, 0x7f0a0495

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lz90$b;->w:Landroid/widget/TextView;

    const p1, 0x7f0a0513

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lz90$b;->v:Landroid/widget/TextView;

    return-void
.end method

.method public static synthetic O(Lz90$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lz90$b;->v:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic P(Lz90$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lz90$b;->w:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic Q(Lz90$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lz90$b;->x:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic R(Lz90$b;)Lcom/pkmmte/view/CircularImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lz90$b;->y:Lcom/pkmmte/view/CircularImageView;

    return-object p0
.end method

.method public static synthetic S(Lz90$b;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lz90$b;->z:Landroid/view/View;

    return-object p0
.end method
