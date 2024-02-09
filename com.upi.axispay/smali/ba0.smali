.class public Lba0;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lba0$b;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lng0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Lba0;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lba0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lba0$b;

    invoke-virtual {p0, p1, p2}, Lba0;->w(Lba0$b;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lba0;->x(Landroid/view/ViewGroup;I)Lba0$b;

    move-result-object p1

    return-object p1
.end method

.method public w(Lba0$b;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lba0;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Billers;

    .line 2
    iget-object v1, p1, Lba0$b;->v:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v1, p1, Lba0$b;->w:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ljg0;->M(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p1, Lba0$b;->x:Landroid/view/View;

    new-instance v1, Lba0$a;

    invoke-direct {v1, p0, p2, v0}, Lba0$a;-><init>(Lba0;ILcom/olive/upi/transport/model/Billers;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lba0$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d00b7

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lba0$b;

    invoke-direct {p2, p0, p1}, Lba0$b;-><init>(Lba0;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lba0;->e:Lng0;

    return-void
.end method

.method public z(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lba0;->d:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
