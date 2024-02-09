.class public Laa0;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laa0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Laa0$b;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Landroid/content/Context;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lng0;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Laa0;->e:Ljava/util/ArrayList;

    .line 3
    iput-object p1, p0, Laa0;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Laa0;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public g(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Laa0$b;

    invoke-virtual {p0, p1, p2}, Laa0;->w(Laa0$b;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Laa0;->x(Landroid/view/ViewGroup;I)Laa0$b;

    move-result-object p1

    return-object p1
.end method

.method public w(Laa0$b;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Laa0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/BannerOffersVo;

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BannerOffersVo;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v1, 0x7f080072

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p1, Laa0$b;->v:Landroid/widget/ImageView;

    iget-object v2, p0, Laa0;->d:Landroid/content/Context;

    invoke-static {v2, v1}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p1, Laa0$b;->v:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BannerOffersVo;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 5
    :goto_0
    iget-object v0, p1, Laa0$b;->v:Landroid/widget/ImageView;

    new-instance v1, Laa0$a;

    invoke-direct {v1, p0, p2}, Laa0$a;-><init>(Laa0;Lcom/olive/upi/transport/model/BannerOffersVo;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object p1, p1, Laa0$b;->w:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BannerOffersVo;->getOffertext()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Laa0$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0034

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Laa0$b;

    invoke-direct {p2, p0, p1}, Laa0$b;-><init>(Laa0;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laa0;->f:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Laa0;->e:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
