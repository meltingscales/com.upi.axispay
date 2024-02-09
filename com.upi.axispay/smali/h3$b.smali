.class public Lh3$b;
.super Landroid/widget/BaseAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:Lh3;


# direct methods
.method public constructor <init>(Lh3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh3$b;->b:Lh3;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh3$b;->b:Lh3;

    iget-object v0, v0, Lh3;->d:Lz2;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh3$b;->b:Lh3;

    iget-object v0, v0, Lh3;->d:Lz2;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lh3$d;

    invoke-virtual {p1}, Lh3$d;->b()Lv$c;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    if-nez p2, :cond_0

    .line 1
    iget-object p2, p0, Lh3$b;->b:Lh3;

    invoke-virtual {p0, p1}, Lh3$b;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv$c;

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, Lh3;->c(Lv$c;Z)Lh3$d;

    move-result-object p2

    goto :goto_0

    .line 2
    :cond_0
    move-object p3, p2

    check-cast p3, Lh3$d;

    invoke-virtual {p0, p1}, Lh3$b;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv$c;

    invoke-virtual {p3, p1}, Lh3$d;->a(Lv$c;)V

    :goto_0
    return-object p2
.end method
