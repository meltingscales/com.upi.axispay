.class public Ld90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld90$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Ld90$a;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Lng0;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 5
    iput-object p1, p0, Ld90;->f:Landroid/app/Activity;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Ld90;->e:Ljava/util/ArrayList;

    .line 3
    iput-object p1, p0, Ld90;->f:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ld90;->e:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld90;->e:Ljava/util/ArrayList;

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
    check-cast p1, Ld90$a;

    invoke-virtual {p0, p1, p2}, Ld90;->x(Ld90$a;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ld90;->y(Landroid/view/ViewGroup;I)Ld90$a;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lcom/olive/upi/transport/model/TranHistory;Ld90$a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2
    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->BILLPAY_UPIID:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getRemarks()Ljava/lang/String;

    move-result-object p1

    const v0, 0xe31

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 5
    array-length v0, p1

    const/4 v2, 0x2

    if-lt v0, v2, :cond_3

    .line 6
    aget-object v0, p1, v1

    const v2, 0xe32

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p2, Ld90$a;->y:Landroid/widget/TextView;

    const v1, 0x7f120165

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 8
    iget-object v0, p2, Ld90$a;->x:Landroid/widget/TextView;

    const v1, 0x7f120160

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 9
    :cond_0
    aget-object v0, p1, v1

    const v1, 0xe33

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    .line 10
    aget-object v1, p1, v0

    const v2, 0xe34

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11
    iget-object v0, p2, Ld90$a;->y:Landroid/widget/TextView;

    const v1, 0x7f120327

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 12
    iget-object v0, p2, Ld90$a;->x:Landroid/widget/TextView;

    const v1, 0x7f120368

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 13
    :cond_1
    aget-object v0, p1, v0

    const v1, 0xe35

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    iget-object v0, p2, Ld90$a;->y:Landroid/widget/TextView;

    const v1, 0x7f120280

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 15
    iget-object v0, p2, Ld90$a;->x:Landroid/widget/TextView;

    const v1, 0x7f120285

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 16
    :cond_2
    :goto_0
    iget-object p2, p2, Ld90$a;->z:Landroid/widget/TextView;

    const/4 v0, 0x1

    aget-object p1, p1, v0

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return v0

    :cond_3
    return v1
.end method

.method public x(Ld90$a;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Ld90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/TranHistory;

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v0

    const v1, 0xe36

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v1

    const v2, 0xe37

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 6
    iget-object v3, p0, Ld90;->f:Landroid/app/Activity;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ljg0;->w(Landroid/content/Context;Ljava/lang/String;)[I

    move-result-object v3

    .line 7
    iget-object v4, p1, Ld90$a;->A:Landroid/widget/TextView;

    const/4 v5, 0x0

    aget v3, v3, v5

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(I)V

    .line 8
    iget-object v3, p1, Ld90$a;->A:Landroid/widget/TextView;

    iget-object v4, p0, Ld90;->f:Landroid/app/Activity;

    const v5, 0x7f060166

    invoke-static {v4, v5}, Lt8;->d(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    :cond_0
    iget-object v3, p1, Ld90$a;->v:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v3, p1, Ld90$a;->w:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0xe38

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getAmount()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v3, p1, Ld90$a;->x:Landroid/widget/TextView;

    const v4, 0xe39

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const v2, 0x7f1201f7

    goto :goto_0

    :cond_1
    const v2, 0x7f1204f3

    :goto_0
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(I)V

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {p0, p2, p1}, Ld90;->w(Lcom/olive/upi/transport/model/TranHistory;Ld90$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    .line 13
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_1

    .line 14
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 15
    iget-object v0, p1, Ld90$a;->z:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object p1, p1, Ld90$a;->y:Landroid/widget/TextView;

    const p2, 0x7f12042a

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 17
    :cond_3
    iget-object v0, p1, Ld90$a;->z:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object p1, p1, Ld90$a;->y:Landroid/widget/TextView;

    const p2, 0x7f120390

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_6

    .line 19
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 20
    iget-object v0, p1, Ld90$a;->z:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object p1, p1, Ld90$a;->y:Landroid/widget/TextView;

    const p2, 0x7f1203c7

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 22
    :cond_5
    iget-object v0, p1, Ld90$a;->z:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object p1, p1, Ld90$a;->y:Landroid/widget/TextView;

    const p2, 0x7f1203c2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public y(Landroid/view/ViewGroup;I)Ld90$a;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d012a

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Ld90$a;

    invoke-direct {p2, p0, p1}, Ld90$a;-><init>(Ld90;Landroid/view/View;)V

    return-object p2
.end method

.method public z(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld90;->d:Lng0;

    return-void
.end method
