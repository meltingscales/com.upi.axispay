.class public Lo90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo90$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lo90$b;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Landroid/content/Context;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCategory;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lng0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lng0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Lo90;->f:Lng0;

    .line 3
    iput-object p1, p0, Lo90;->d:Landroid/content/Context;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lo90;->e:Ljava/util/ArrayList;

    .line 5
    new-instance p1, Lcom/olive/upi/transport/model/BillerCategory;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BillerCategory;-><init>()V

    .line 6
    iget-object p2, p0, Lo90;->d:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f12028a

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BillerCategory;->setDSCRPTN(Ljava/lang/String;)V

    const p2, 0x7f0801fc

    .line 7
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BillerCategory;->setIconId(I)V

    const/16 p2, 0x51

    .line 8
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BillerCategory;->setFixedCategory(I)V

    .line 9
    iget-object p2, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance p1, Lcom/olive/upi/transport/model/BillerCategory;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BillerCategory;-><init>()V

    .line 11
    iget-object p2, p0, Lo90;->d:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f120163

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BillerCategory;->setDSCRPTN(Ljava/lang/String;)V

    const p2, 0x7f0800d5

    .line 12
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BillerCategory;->setIconId(I)V

    const/16 p2, 0x55

    .line 13
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BillerCategory;->setFixedCategory(I)V

    .line 14
    iget-object p2, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/BillerCategory;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BillerCategory;-><init>()V

    .line 3
    iget-object v1, p0, Lo90;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f12028a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setDSCRPTN(Ljava/lang/String;)V

    const v1, 0x7f0801fc

    .line 4
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setIconId(I)V

    const/16 v1, 0x51

    .line 5
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setFixedCategory(I)V

    .line 6
    iget-object v1, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    new-instance v0, Lcom/olive/upi/transport/model/BillerCategory;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BillerCategory;-><init>()V

    .line 8
    iget-object v1, p0, Lo90;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f120163

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setDSCRPTN(Ljava/lang/String;)V

    const v1, 0x7f0800d5

    .line 9
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setIconId(I)V

    const/16 v1, 0x55

    .line 10
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setFixedCategory(I)V

    .line 11
    iget-object v1, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    new-instance v0, Lcom/olive/upi/transport/model/BillerCategory;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BillerCategory;-><init>()V

    .line 13
    iget-object v1, p0, Lo90;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f120292

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setDSCRPTN(Ljava/lang/String;)V

    const v1, 0x7f0801fe

    .line 14
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setIconId(I)V

    const/16 v1, 0x56

    .line 15
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BillerCategory;->setFixedCategory(I)V

    .line 16
    iget-object v1, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public B(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCategory;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lo90;->A()V

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v1, :cond_2

    .line 5
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerCategory;

    .line 6
    iget-object v1, p0, Lo90;->e:Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/BillerCategory;

    .line 7
    iget-object v2, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 8
    iget-object v2, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lo90$b;

    invoke-virtual {p0, p1, p2}, Lo90;->x(Lo90$b;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lo90;->y(Landroid/view/ViewGroup;I)Lo90$b;

    move-result-object p1

    return-object p1
.end method

.method public w()I
    .locals 2

    .line 1
    iget-object v0, p0, Lo90;->d:Landroid/content/Context;

    const v1, 0xee8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 2
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 3
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 5
    iget v0, v1, Landroid/graphics/Point;->x:I

    return v0
.end method

.method public x(Lo90$b;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerCategory;

    .line 2
    invoke-static {p1}, Lo90$b;->O(Lo90$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getDSCRPTN()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getIconId()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 4
    invoke-static {p1}, Lo90$b;->P(Lo90$b;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getIconId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 6
    invoke-static {p1}, Lo90$b;->P(Lo90$b;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCategory;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0800e1

    invoke-static {v1, v2, v3}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 7
    :cond_1
    :goto_0
    invoke-static {p1}, Lo90$b;->Q(Lo90$b;)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lo90$a;

    invoke-direct {v1, p0, v0, p2}, Lo90$a;-><init>(Lo90;Lcom/olive/upi/transport/model/BillerCategory;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public y(Landroid/view/ViewGroup;I)Lo90$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0037

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lo90$b;

    invoke-direct {p2, p1}, Lo90$b;-><init>(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p0}, Lo90;->w()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    return-object p2
.end method

.method public z(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo90;->f:Lng0;

    return-void
.end method
