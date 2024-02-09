.class public Lo90$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/ImageView;

.field public x:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lo90$b;->x:Landroid/view/View;

    const v0, 0x7f0a020b

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo90$b;->w:Landroid/widget/ImageView;

    const v0, 0x7f0a020d

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lo90$b;->v:Landroid/widget/TextView;

    return-void
.end method

.method public static synthetic O(Lo90$b;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lo90$b;->v:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic P(Lo90$b;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lo90$b;->w:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic Q(Lo90$b;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lo90$b;->x:Landroid/view/View;

    return-object p0
.end method
