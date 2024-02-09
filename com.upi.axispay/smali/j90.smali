.class public Lj90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj90$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lj90$c;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroid/content/Context;

.field public f:Lng0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Lj90;->d:Ljava/util/ArrayList;

    .line 3
    iput-object p1, p0, Lj90;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lj90;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

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
    check-cast p1, Lj90$c;

    invoke-virtual {p0, p1, p2}, Lj90;->w(Lj90$c;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lj90;->x(Landroid/view/ViewGroup;I)Lj90$c;

    move-result-object p1

    return-object p1
.end method

.method public w(Lj90$c;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj90;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/Collectbeneblock;

    .line 2
    invoke-static {p1}, Lj90$c;->O(Lj90$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Collectbeneblock;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Collectbeneblock;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa0;->f(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, Lj90$c;->P(Lj90$c;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, Lj90$c;->P(Lj90$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Collectbeneblock;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-static {p1}, Lj90$c;->O(Lj90$c;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x143

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :goto_0
    invoke-static {p1}, Lj90$c;->Q(Lj90$c;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Collectbeneblock;->getVpa()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lj90;->e:Landroid/content/Context;

    const v3, 0x7f06006c

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v1, v2}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    invoke-static {p1}, Lj90$c;->R(Lj90$c;)Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lj90$a;

    invoke-direct {v1, p0, p2}, Lj90$a;-><init>(Lj90;Lcom/olive/upi/transport/model/Collectbeneblock;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-static {p1}, Lj90$c;->S(Lj90$c;)Landroid/widget/ImageView;

    move-result-object p1

    new-instance v0, Lj90$b;

    invoke-direct {v0, p0, p2}, Lj90$b;-><init>(Lj90;Lcom/olive/upi/transport/model/Collectbeneblock;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lj90$c;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0039

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lj90$c;

    invoke-direct {p2, p0, p1}, Lj90$c;-><init>(Lj90;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj90;->f:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lj90;->d:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
