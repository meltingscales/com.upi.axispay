.class public Lf90$a;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const v0, 0x7f0a01d8

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lf90$a;->v:Landroid/widget/TextView;

    const v0, 0x7f0a01d9

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lf90$a;->w:Landroid/widget/TextView;

    return-void
.end method

.method public static synthetic O(Lf90$a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lf90$a;->v:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic P(Lf90$a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lf90$a;->w:Landroid/widget/TextView;

    return-object p0
.end method
