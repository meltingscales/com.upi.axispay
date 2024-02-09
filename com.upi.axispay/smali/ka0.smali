.class public Lka0;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lka0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lka0$b;",
        ">;"
    }
.end annotation


# instance fields
.field public d:I

.field public e:Landroid/content/Context;

.field public f:Lng0;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
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
    iput-object p2, p0, Lka0;->g:Ljava/util/List;

    .line 3
    iput-object p1, p0, Lka0;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final A(Lcom/olive/upi/transport/model/TranHistory;Lka0$b;I)V
    .locals 5

    .line 1
    :try_start_0
    new-instance p3, Ljava/text/SimpleDateFormat;

    const v0, 0x12b3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p3, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 2
    new-instance p3, Ljava/util/Date;

    invoke-direct {p3}, Ljava/util/Date;-><init>()V

    invoke-static {p1, p3}, Ljg0;->z(Ljava/util/Date;Ljava/util/Date;)J

    move-result-wide v1

    const-wide/16 v3, 0x3

    cmp-long p1, v1, v3

    if-ltz p1, :cond_0

    .line 3
    iget-object p1, p2, Lka0$b;->D:Landroid/widget/TextView;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object p1, p2, Lka0$b;->D:Landroid/widget/TextView;

    const p2, 0x7f120001

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/text/ParseException;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public B(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lka0;->g:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public e()I
    .locals 2

    .line 1
    iget-object v0, p0, Lka0;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lka0;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public g(I)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lka0$b;

    invoke-virtual {p0, p1, p2}, Lka0;->x(Lka0$b;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lka0;->y(Landroid/view/ViewGroup;I)Lka0$b;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lcom/olive/upi/transport/model/TranHistory;Lka0$b;)Z
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

    const v0, 0x12b4

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

    const v3, 0x12b5

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {p2}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f120165

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 8
    :cond_0
    aget-object v0, p1, v1

    const v1, 0x12b6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    .line 9
    aget-object v1, p1, v0

    const v3, 0x12b7

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    invoke-static {p2}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f120327

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 11
    :cond_1
    aget-object v0, p1, v0

    const v1, 0x12b8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12
    invoke-static {p2}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f120280

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 13
    :cond_2
    :goto_0
    invoke-static {p2}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v0

    aget-object v1, p1, v2

    iget-object v2, p0, Lka0;->e:Landroid/content/Context;

    const v3, 0x7f06006c

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v1, v2}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    invoke-static {p2}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object p2

    const/4 v0, 0x1

    aget-object p1, p1, v0

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return v0

    :cond_3
    return v1
.end method

.method public x(Lka0$b;I)V
    .locals 12

    .line 1
    iget-object v0, p0, Lka0;->g:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/TranHistory;

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v1

    const v2, 0x12b9

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v2

    const v3, 0x12ba

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 4
    iget-object v4, p1, Lka0$b;->D:Landroid/widget/TextView;

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v4

    const v5, 0x12bb

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    const v5, 0x12bc

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    const v5, 0x12bd

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v5

    const v6, 0x12be

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getMcc()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getMcc()Ljava/lang/String;

    move-result-object v4

    const v5, 0x12bf

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 11
    invoke-virtual {p0, v0, p1, p2}, Lka0;->A(Lcom/olive/upi/transport/model/TranHistory;Lka0$b;I)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    const v5, 0x12c0

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {p0, v0, p1, p2}, Lka0;->A(Lcom/olive/upi/transport/model/TranHistory;Lka0$b;I)V

    .line 14
    :cond_3
    :goto_0
    invoke-static {p1}, Lka0$b;->O(Lka0$b;)Landroid/widget/TextView;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const v6, 0x12c1

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getAmount()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    invoke-static {p1}, Lka0$b;->O(Lka0$b;)Landroid/widget/TextView;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 16
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 17
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 18
    iget-object v4, p0, Lka0;->e:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ljg0;->w(Landroid/content/Context;Ljava/lang/String;)[I

    move-result-object v4

    .line 19
    invoke-static {p1}, Lka0$b;->Q(Lka0$b;)Landroid/widget/TextView;

    move-result-object v5

    const/4 v7, 0x0

    aget v7, v4, v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(I)V

    .line 20
    invoke-static {p1}, Lka0$b;->Q(Lka0$b;)Landroid/widget/TextView;

    move-result-object v5

    aget v4, v4, v6

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    :cond_4
    invoke-static {p1}, Lka0$b;->R(Lka0$b;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const v5, 0x12c2

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 23
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 24
    invoke-static {p1}, Lka0$b;->S(Lka0$b;)Landroid/widget/TextView;

    move-result-object v4

    const v5, 0x7f1201f7

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 25
    :cond_5
    invoke-static {p1}, Lka0$b;->S(Lka0$b;)Landroid/widget/TextView;

    move-result-object v4

    const v5, 0x7f1204f3

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    :goto_1
    const/4 v4, 0x2

    const v5, 0x7f120390

    const v7, 0x12c3

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x7f06006c

    const v9, 0x7f12042a

    const v10, 0x7f060067

    const v11, 0x12c4

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    if-eqz v1, :cond_9

    .line 26
    invoke-virtual {p0, v0, p1}, Lka0;->w(Lcom/olive/upi/transport/model/TranHistory;Lka0$b;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 27
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_2

    .line 28
    :cond_6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    .line 29
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditdebittype()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditdebittype()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 30
    invoke-virtual {v0, v11}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 31
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v3, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 32
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(I)V

    .line 34
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_2

    :cond_7
    if-eqz v1, :cond_8

    .line 35
    invoke-virtual {v0, v11}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 36
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v3, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(I)V

    .line 39
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_2

    .line 40
    :cond_8
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v3, v8}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 43
    invoke-virtual {v0, v7}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_2

    .line 45
    :cond_9
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getInitMode()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getInitMode()Ljava/lang/String;

    move-result-object v1

    const v3, 0x12c5

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 46
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    .line 47
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditdebittype()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditdebittype()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 48
    invoke-virtual {v0, v11}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 49
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v3, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(I)V

    .line 52
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_2

    :cond_a
    if-eqz v1, :cond_b

    .line 53
    invoke-virtual {v0, v11}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 54
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v3, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 55
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(I)V

    .line 57
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_2

    .line 58
    :cond_b
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v3, v8}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 61
    invoke-virtual {v0, v7}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto/16 :goto_2

    :cond_c
    if-eqz v2, :cond_f

    .line 63
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    .line 64
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditdebittype()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    const v4, 0x7f1203c2

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditdebittype()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 65
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v5, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v2, v5}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 66
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 68
    invoke-virtual {v0, v11}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto :goto_2

    .line 70
    :cond_d
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditdebittype()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_e

    if-nez v1, :cond_e

    .line 71
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v5, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v2, v5}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 72
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 74
    invoke-virtual {v0, v11}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    goto :goto_2

    .line 76
    :cond_e
    invoke-static {p1}, Lka0$b;->T(Lka0$b;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lka0;->e:Landroid/content/Context;

    invoke-static {v3, v8}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v2, v3}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    invoke-static {p1}, Lka0$b;->P(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    invoke-static {p1}, Lka0$b;->U(Lka0$b;)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f1203c7

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 79
    invoke-virtual {v0, v7}, Lcom/olive/upi/transport/model/TranHistory;->setPayType(Ljava/lang/String;)V

    const/4 v1, 0x3

    .line 80
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TranHistory;->setDirection(I)V

    .line 81
    :cond_f
    :goto_2
    invoke-static {p1}, Lka0$b;->V(Lka0$b;)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lka0$a;

    invoke-direct {v1, p0, p2, v0}, Lka0$a;-><init>(Lka0;ILcom/olive/upi/transport/model/TranHistory;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public y(Landroid/view/ViewGroup;I)Lka0$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0148

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lka0$b;

    invoke-direct {p2, p0, p1}, Lka0$b;-><init>(Lka0;Landroid/view/View;)V

    return-object p2
.end method

.method public z(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lka0;->f:Lng0;

    return-void
.end method
