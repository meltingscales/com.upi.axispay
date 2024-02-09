.class public Lfa0$c;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfa0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/widget/TextView;

.field public E:Landroid/view/View;

.field public F:Landroid/widget/ImageView;

.field public G:Landroid/widget/ImageView;

.field public H:Lcom/pkmmte/view/CircularImageView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lfa0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p2, p0, Lfa0$c;->E:Landroid/view/View;

    const p1, 0x7f0a0516

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->w:Landroid/widget/TextView;

    const p1, 0x7f0a04ce

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->v:Landroid/widget/TextView;

    const p1, 0x7f0a04d0

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->C:Landroid/widget/TextView;

    const p1, 0x7f0a03ab

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->B:Landroid/widget/TextView;

    const p1, 0x7f0a03aa

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->D:Landroid/widget/TextView;

    const p1, 0x7f0a04f1

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->z:Landroid/widget/TextView;

    const p1, 0x7f0a0520

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->A:Landroid/widget/TextView;

    const p1, 0x7f0a04e9

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->x:Landroid/widget/TextView;

    const p1, 0x7f0a04ed

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfa0$c;->y:Landroid/widget/TextView;

    const p1, 0x7f0a03af

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lfa0$c;->F:Landroid/widget/ImageView;

    const p1, 0x7f0a03ae

    .line 13
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lfa0$c;->G:Landroid/widget/ImageView;

    const p1, 0x7f0a0514

    .line 14
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/pkmmte/view/CircularImageView;

    iput-object p1, p0, Lfa0$c;->H:Lcom/pkmmte/view/CircularImageView;

    return-void
.end method

.method public static synthetic O(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->w:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic P(Lfa0$c;)Lcom/pkmmte/view/CircularImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->H:Lcom/pkmmte/view/CircularImageView;

    return-object p0
.end method

.method public static synthetic Q(Lfa0$c;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->G:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic R(Lfa0$c;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->F:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic S(Lfa0$c;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->E:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic T(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->C:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic U(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->v:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic V(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->z:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic W(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->A:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic X(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->B:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic Y(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->x:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic Z(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->y:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic a0(Lfa0$c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa0$c;->D:Landroid/widget/TextView;

    return-object p0
.end method
