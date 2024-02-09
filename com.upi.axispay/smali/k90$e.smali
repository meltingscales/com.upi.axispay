.class public Lk90$e;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public A:Landroid/widget/ImageView;

.field public B:Lcom/pkmmte/view/CircularImageView;

.field public C:Landroid/widget/ImageView;

.field public final v:Landroid/view/View;

.field public w:Landroid/view/View;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lk90;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p2, p0, Lk90$e;->v:Landroid/view/View;

    const p1, 0x7f0a00ad

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lk90$e;->w:Landroid/view/View;

    const p1, 0x7f0a013b

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lk90$e;->x:Landroid/widget/TextView;

    const p1, 0x7f0a013c

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lk90$e;->z:Landroid/widget/TextView;

    const p1, 0x7f0a0140

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lk90$e;->y:Landroid/widget/TextView;

    const p1, 0x7f0a0139

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lk90$e;->C:Landroid/widget/ImageView;

    const p1, 0x7f0a01d6

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lk90$e;->A:Landroid/widget/ImageView;

    const p1, 0x7f0a013e

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/pkmmte/view/CircularImageView;

    iput-object p1, p0, Lk90$e;->B:Lcom/pkmmte/view/CircularImageView;

    return-void
.end method

.method public static synthetic O(Lk90$e;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lk90$e;->C:Landroid/widget/ImageView;

    return-object p0
.end method
