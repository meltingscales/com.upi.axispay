.class public Lq90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq90$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lq90$d;",
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
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p1, p0, Lq90;->e:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lq90;->f:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq90;->f:Ljava/util/ArrayList;

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
    check-cast p1, Lq90$d;

    invoke-virtual {p0, p1, p2}, Lq90;->w(Lq90$d;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lq90;->x(Landroid/view/ViewGroup;I)Lq90$d;

    move-result-object p1

    return-object p1
.end method

.method public w(Lq90$d;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lq90;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Inbox;

    .line 2
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v1, p1, Lq90$d;->w:Landroid/widget/TextView;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 4
    iget-object v1, p1, Lq90$d;->A:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Inbox;->getCreatedDate()Ljava/lang/String;

    move-result-object v3

    const v4, 0x3191

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ljg0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v1, p1, Lq90$d;->x:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Inbox;->getShortdiscription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, p1, Lq90$d;->y:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Inbox;->getLongdiscription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v1, p1, Lq90$d;->w:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Inbox;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/Inbox;->setSelectPosition(I)V

    .line 9
    iget-object p2, p1, Lq90$d;->z:Landroid/widget/TextView;

    new-instance v1, Lq90$a;

    invoke-direct {v1, p0, p1, v0}, Lq90$a;-><init>(Lq90;Lq90$d;Lcom/olive/upi/transport/model/Inbox;)V

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Inbox;->getIsRead()Ljava/lang/String;

    move-result-object p2

    const/16 v1, 0x8

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Inbox;->getIsRead()Ljava/lang/String;

    move-result-object p2

    const v3, 0x3192

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 11
    iget-object p2, p1, Lq90$d;->x:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p2, p1, Lq90$d;->y:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object p2, p1, Lq90$d;->z:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    invoke-static {p1}, Lq90$d;->O(Lq90$d;)Landroid/view/View;

    move-result-object p2

    iget-object v1, p0, Lq90;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600bc

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 15
    iget-object p2, p1, Lq90$d;->B:Landroid/widget/ImageView;

    const v1, 0x7f0801e1

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 16
    :cond_0
    iget-object p2, p1, Lq90$d;->x:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget-object p2, p1, Lq90$d;->y:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object p2, p1, Lq90$d;->z:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    invoke-static {p1}, Lq90$d;->O(Lq90$d;)Landroid/view/View;

    move-result-object p2

    iget-object v1, p0, Lq90;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060193

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 20
    iget-object p2, p1, Lq90$d;->B:Landroid/widget/ImageView;

    const v1, 0x7f0801e0

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 21
    :goto_0
    invoke-static {p1}, Lq90$d;->O(Lq90$d;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lq90$b;

    invoke-direct {v1, p0, v0}, Lq90$b;-><init>(Lq90;Lcom/olive/upi/transport/model/Inbox;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iget-object p1, p1, Lq90$d;->C:Landroid/widget/ImageView;

    new-instance p2, Lq90$c;

    invoke-direct {p2, p0, v0}, Lq90$c;-><init>(Lq90;Lcom/olive/upi/transport/model/Inbox;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lq90$d;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d007c

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lq90$d;

    invoke-direct {p2, p0, p1}, Lq90$d;-><init>(Lq90;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq90;->d:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lq90;->f:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
