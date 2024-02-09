.class public Ley$h;
.super Lfj;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ley;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public final synthetic f:Ley;


# direct methods
.method public constructor <init>(Ley;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ley$h;->f:Ley;

    .line 2
    invoke-direct {p0, p2}, Lfj;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Llc;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lfj;->g(Landroid/view/View;Llc;)V

    .line 2
    iget-object p1, p0, Ley$h;->f:Ley;

    iget-object p1, p1, Ley;->g:Ley$c;

    invoke-virtual {p1}, Ley$c;->z()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Llc$b;->a(IIZ)Llc$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Llc;->c0(Ljava/lang/Object;)V

    return-void
.end method
