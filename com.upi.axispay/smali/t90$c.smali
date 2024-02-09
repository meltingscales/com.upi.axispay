.class public Lt90$c;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public v:Landroid/widget/TextView;

.field public w:Landroid/view/View;


# direct methods
.method public constructor <init>(Lt90;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p2, p0, Lt90$c;->w:Landroid/view/View;

    const p1, 0x7f0a00a1

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const p1, 0x7f0a048f

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lt90$c;->v:Landroid/widget/TextView;

    return-void
.end method

.method public static synthetic O(Lt90$c;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lt90$c;->w:Landroid/view/View;

    return-object p0
.end method
