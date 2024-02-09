.class public Lz90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz90$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lz90$b;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Lng0;

.field public e:Landroid/content/Context;

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lng0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;",
            "Lng0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p1, p0, Lz90;->f:Ljava/util/ArrayList;

    .line 3
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 4
    iput-object p2, p0, Lz90;->d:Lng0;

    return-void
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lz90;->f:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lz90;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lz90$b;

    invoke-virtual {p0, p1, p2}, Lz90;->x(Lz90$b;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz90;->y(Landroid/view/ViewGroup;I)Lz90$b;

    move-result-object p1

    return-object p1
.end method

.method public w()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lz90;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public x(Lz90$b;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lz90;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/PendingReqVo;

    .line 2
    invoke-static {p1}, Lz90$b;->O(Lz90$b;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0xee9

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getAmount()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-static {p1}, Lz90$b;->P(Lz90$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getExpdate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-static {p1}, Lz90$b;->Q(Lz90$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-static {p1}, Lz90$b;->R(Lz90$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lz90;->e:Landroid/content/Context;

    const v4, 0x7f06016c

    invoke-static {v3, v4}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    invoke-static {p1}, Lz90$b;->S(Lz90$b;)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lz90$a;

    invoke-direct {v1, p0, p2, v0}, Lz90$a;-><init>(Lz90;ILcom/olive/upi/transport/model/PendingReqVo;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public y(Landroid/view/ViewGroup;I)Lz90$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lz90;->e:Landroid/content/Context;

    .line 2
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0113

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lz90$b;

    invoke-direct {p2, p0, p1}, Lz90$b;-><init>(Lz90;Landroid/view/View;)V

    return-object p2
.end method

.method public z(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz90;->d:Lng0;

    return-void
.end method
