.class public Lk90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk90$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lk90$e;",
        ">;"
    }
.end annotation


# instance fields
.field public d:I

.field public e:Lng0;

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field

.field public g:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Lk90;->f:Ljava/util/ArrayList;

    .line 3
    iput-object p1, p0, Lk90;->g:Landroid/content/Context;

    .line 4
    iput p3, p0, Lk90;->d:I

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk90;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lk90$e;

    invoke-virtual {p0, p1, p2}, Lk90;->w(Lk90$e;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lk90;->x(Landroid/view/ViewGroup;I)Lk90$e;

    move-result-object p1

    return-object p1
.end method

.method public w(Lk90$e;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk90;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BeneVpa;

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getNickname()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 5
    iget-object v5, p1, Lk90$e;->z:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v5, p1, Lk90$e;->z:Landroid/widget/TextView;

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    :goto_0
    iget-object v5, p1, Lk90$e;->x:Landroid/widget/TextView;

    invoke-static {v2}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v2, p1, Lk90$e;->z:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 10
    iget-object v2, p1, Lk90$e;->y:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p1, Lk90$e;->w:Landroid/view/View;

    new-instance v2, Lk90$a;

    invoke-direct {v2, p0, v0}, Lk90$a;-><init>(Lk90;Lcom/olive/upi/transport/model/BeneVpa;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object v1, p1, Lk90$e;->v:Landroid/view/View;

    new-instance v2, Lk90$b;

    invoke-direct {v2, p0, p2, v0}, Lk90$b;-><init>(Lk90;ILcom/olive/upi/transport/model/BeneVpa;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 13
    invoke-static {p1}, Lk90$e;->O(Lk90$e;)Landroid/widget/ImageView;

    move-result-object p2

    new-instance v1, Lk90$c;

    invoke-direct {v1, p0, v0}, Lk90$c;-><init>(Lk90;Lcom/olive/upi/transport/model/BeneVpa;)V

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object p2, p0, Lk90;->g:Landroid/content/Context;

    if-eqz p2, :cond_1

    .line 15
    iget-object p2, p1, Lk90$e;->B:Lcom/pkmmte/view/CircularImageView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lk90;->g:Landroid/content/Context;

    const v5, 0x7f060067

    invoke-static {v2, v5}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v1, v2}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 16
    :cond_1
    iget p2, p0, Lk90;->d:I

    const/4 v1, 0x5

    if-ne p2, v1, :cond_6

    .line 17
    iget-object p2, p1, Lk90$e;->A:Landroid/widget/ImageView;

    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 18
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    const p2, 0x3c83

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object p2

    :goto_1
    const v1, 0x3c84

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 20
    iget-object p2, p1, Lk90$e;->A:Landroid/widget/ImageView;

    const v1, 0x7f0800e2

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 21
    :cond_3
    iget-object p2, p1, Lk90$e;->A:Landroid/widget/ImageView;

    const v1, 0x7f0800e1

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 22
    :goto_2
    iget-object p2, p1, Lk90$e;->A:Landroid/widget/ImageView;

    new-instance v1, Lk90$d;

    invoke-direct {v1, p0, v0}, Lk90$d;-><init>(Lk90;Lcom/olive/upi/transport/model/BeneVpa;)V

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    invoke-static {p1}, Lk90$e;->O(Lk90$e;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 24
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->isBlocked()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 25
    iget-object p2, p1, Lk90$e;->A:Landroid/widget/ImageView;

    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    iget-object p2, p1, Lk90$e;->v:Landroid/view/View;

    invoke-virtual {p2, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    iget-object p2, p1, Lk90$e;->v:Landroid/view/View;

    invoke-virtual {p2, v4}, Landroid/view/View;->setClickable(Z)V

    .line 28
    iget-object p1, p1, Lk90$e;->v:Landroid/view/View;

    iget-object p2, p0, Lk90;->g:Landroid/content/Context;

    const v0, 0x7f0600bc

    invoke-static {p2, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_3

    .line 29
    :cond_4
    iget-object p2, p0, Lk90;->g:Landroid/content/Context;

    if-eqz p2, :cond_5

    .line 30
    iget-object v0, p1, Lk90$e;->v:Landroid/view/View;

    const v1, 0x7f060193

    invoke-static {p2, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 31
    :cond_5
    iget-object p1, p1, Lk90$e;->A:Landroid/widget/ImageView;

    invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 32
    :cond_6
    iget-object p2, p1, Lk90$e;->A:Landroid/widget/ImageView;

    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 33
    invoke-static {p1}, Lk90$e;->O(Lk90$e;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lk90$e;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0036

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lk90$e;

    invoke-direct {p2, p0, p1}, Lk90$e;-><init>(Lk90;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk90;->e:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lk90;->f:Ljava/util/ArrayList;

    .line 2
    iput p2, p0, Lk90;->d:I

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
