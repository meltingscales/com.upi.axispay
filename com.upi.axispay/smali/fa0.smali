.class public Lfa0;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfa0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lfa0$c;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Landroid/content/Context;

.field public e:Lng0;

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
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
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Lfa0;->f:Ljava/util/ArrayList;

    .line 3
    iput-object p1, p0, Lfa0;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public A(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfa0;->e:Lng0;

    return-void
.end method

.method public B(Ljava/util/ArrayList;)V
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
    iput-object p1, p0, Lfa0;->f:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lfa0;->f:Ljava/util/ArrayList;

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
    check-cast p1, Lfa0$c;

    invoke-virtual {p0, p1, p2}, Lfa0;->y(Lfa0$c;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfa0;->z(Landroid/view/ViewGroup;I)Lfa0$c;

    move-result-object p1

    return-object p1
.end method

.method public final w(Ljava/lang/String;)[I
    .locals 3

    const v0, 0xd1d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/high16 v1, -0x10000

    if-eqz v0, :cond_0

    const p1, 0x7f120461

    .line 2
    iget-object v0, p0, Lfa0;->d:Landroid/content/Context;

    const v1, 0x7f06018a

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    goto :goto_0

    :cond_0
    const v0, 0xd1e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p1, 0x7f120344

    .line 4
    iget-object v0, p0, Lfa0;->d:Landroid/content/Context;

    const v1, 0x7f060189

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    goto :goto_0

    :cond_1
    const v0, 0xd1f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const p1, 0x7f12013b

    goto :goto_0

    :cond_2
    const v0, 0xd20

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f1201b5

    goto :goto_0

    :cond_3
    const p1, 0x7f1201c1

    :goto_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v2, 0x0

    aput p1, v0, v2

    const/4 p1, 0x1

    aput v1, v0, p1

    return-object v0
.end method

.method public final x(Lcom/olive/upi/transport/model/TranHistory;Lfa0$c;)Z
    .locals 4

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

    const v0, 0xd21

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

    const v3, 0xd22

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {p2}, Lfa0$c;->O(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f120165

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 8
    :cond_0
    aget-object v0, p1, v1

    const v1, 0xd23

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    .line 9
    aget-object v1, p1, v0

    const v3, 0xd24

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    invoke-static {p2}, Lfa0$c;->O(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f120327

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 11
    :cond_1
    aget-object v0, p1, v0

    const v1, 0xd25

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12
    invoke-static {p2}, Lfa0$c;->O(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f120280

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 13
    :cond_2
    :goto_0
    invoke-static {p2}, Lfa0$c;->P(Lfa0$c;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v0

    aget-object v1, p1, v2

    iget-object v2, p0, Lfa0;->d:Landroid/content/Context;

    const v3, 0x7f06006c

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v1, v2}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    invoke-static {p2}, Lfa0$c;->T(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    invoke-static {p2}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_3
    return v1
.end method

.method public y(Lfa0$c;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lfa0;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/TranHistory;

    .line 2
    invoke-static {p1}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditBankName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-static {p1}, Lfa0$c;->V(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRefid()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getTranid()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getRefid()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-static {p1}, Lfa0$c;->W(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getExpirydateTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-static {p1}, Lfa0$c;->X(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getQuerydate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    invoke-static {p1}, Lfa0$c;->Y(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0xd26

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 9
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lfa0;->w(Ljava/lang/String;)[I

    move-result-object v0

    .line 10
    invoke-static {p1}, Lfa0$c;->Z(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v2

    aget v3, v0, v1

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 11
    invoke-static {p1}, Lfa0$c;->Z(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v2

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    :cond_2
    invoke-static {p1}, Lfa0$c;->P(Lfa0$c;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditBankName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lfa0;->d:Landroid/content/Context;

    const v4, 0x7f06016c

    invoke-static {v3, v4}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 14
    invoke-virtual {p0, p2, p1}, Lfa0;->x(Lcom/olive/upi/transport/model/TranHistory;Lfa0$c;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto/16 :goto_3

    :cond_3
    const/16 v2, 0x8

    if-eqz v0, :cond_5

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lqa0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 18
    invoke-static {p1}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 19
    :cond_4
    invoke-static {p1}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    invoke-static {p1}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :goto_1
    invoke-static {p1}, Lfa0$c;->T(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 22
    :cond_5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lqa0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v3

    .line 24
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 25
    invoke-static {p1}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    move-object v0, v3

    goto :goto_2

    .line 26
    :cond_6
    invoke-static {p1}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 27
    invoke-static {p1}, Lfa0$c;->U(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    :goto_2
    invoke-static {p1}, Lfa0$c;->P(Lfa0$c;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    iget-object v2, p0, Lfa0;->d:Landroid/content/Context;

    const v3, 0x7f06006c

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v0, v2}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    invoke-static {p1}, Lfa0$c;->T(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :goto_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getQueryStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0xd27

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v1, 0x7f0800f4

    if-eqz v0, :cond_7

    .line 31
    invoke-static {p1}, Lfa0$c;->a0(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    const v2, 0xd28

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    invoke-static {p1}, Lfa0$c;->Q(Lfa0$c;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 33
    invoke-static {p1}, Lfa0$c;->R(Lfa0$c;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080249

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    .line 34
    :cond_7
    invoke-static {p1}, Lfa0$c;->a0(Lfa0$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TranHistory;->getExpirydateTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    invoke-static {p1}, Lfa0$c;->R(Lfa0$c;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    invoke-static {p1}, Lfa0$c;->Q(Lfa0$c;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f0800f3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 37
    :goto_4
    invoke-static {p1}, Lfa0$c;->S(Lfa0$c;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lfa0$a;

    invoke-direct {v1, p0, p2}, Lfa0$a;-><init>(Lfa0;Lcom/olive/upi/transport/model/TranHistory;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    invoke-static {p1}, Lfa0$c;->S(Lfa0$c;)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lfa0$b;

    invoke-direct {v0, p0, p2}, Lfa0$b;-><init>(Lfa0;Lcom/olive/upi/transport/model/TranHistory;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public z(Landroid/view/ViewGroup;I)Lfa0$c;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0126

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lfa0$c;

    invoke-direct {p2, p0, p1}, Lfa0$c;-><init>(Lfa0;Landroid/view/View;)V

    return-object p2
.end method
