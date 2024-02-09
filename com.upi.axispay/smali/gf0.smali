.class public Lgf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;


# instance fields
.field public l:Lcom/upi/axispay/custom/NonScrollListView;

.field public m:Lha0;

.field public n:Lng0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0129

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a03bf

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/NonScrollListView;

    iput-object p2, p0, Lgf0;->l:Lcom/upi/axispay/custom/NonScrollListView;

    .line 3
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    const p2, 0x7f0a01bb

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    return-object p1
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgf0;->n:Lng0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lng0;->s(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgf0;->m:Lha0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    :cond_0
    return-void
.end method
