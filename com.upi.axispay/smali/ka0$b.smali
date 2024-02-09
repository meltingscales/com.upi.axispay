.class public Lka0$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Lcom/pkmmte/view/CircularImageView;

.field public C:Landroid/view/View;

.field public D:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lka0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p2, p0, Lka0$b;->C:Landroid/view/View;

    const p1, 0x7f0a0516

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lka0$b;->v:Landroid/widget/TextView;

    const p1, 0x7f0a00fb

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lka0$b;->D:Landroid/widget/TextView;

    const p1, 0x7f0a00d9

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const p1, 0x7f0a04ed

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lka0$b;->y:Landroid/widget/TextView;

    const p1, 0x7f0a04ec

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lka0$b;->z:Landroid/widget/TextView;

    const p1, 0x7f0a0514

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/pkmmte/view/CircularImageView;

    iput-object p1, p0, Lka0$b;->B:Lcom/pkmmte/view/CircularImageView;

    const p1, 0x7f0a04eb

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lka0$b;->A:Landroid/widget/TextView;

    const p1, 0x7f0a04e9

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lka0$b;->w:Landroid/widget/TextView;

    const p1, 0x7f0a04ea

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lka0$b;->x:Landroid/widget/TextView;

    return-void
.end method

.method public static synthetic O(Lka0$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->w:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic P(Lka0$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->z:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic Q(Lka0$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->y:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic R(Lka0$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->A:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic S(Lka0$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->x:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->B:Lcom/pkmmte/view/CircularImageView;

    return-object p0
.end method

.method public static synthetic U(Lka0$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->v:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic V(Lka0$b;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lka0$b;->C:Landroid/view/View;

    return-object p0
.end method
