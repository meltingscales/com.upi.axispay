.class public Lv90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv90$j;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lv90$j;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Landroid/content/Context;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lng0;

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lv90;->g:I

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lv90;->h:I

    .line 4
    iput-object p1, p0, Lv90;->e:Ljava/util/List;

    .line 5
    iput-object p2, p0, Lv90;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv90;->e:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public g(I)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lv90$j;

    invoke-virtual {p0, p1, p2}, Lv90;->w(Lv90$j;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lv90;->x(Landroid/view/ViewGroup;I)Lv90$j;

    move-result-object p1

    return-object p1
.end method

.method public w(Lv90$j;I)V
    .locals 12

    .line 1
    iget-object v1, p0, Lv90;->e:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/olive/upi/transport/model/MandatesVo;

    .line 2
    iget-object v1, p1, Lv90$j;->A:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget v1, p0, Lv90;->h:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p2, v1, :cond_0

    move v7, v2

    goto :goto_0

    :cond_0
    move v7, v3

    .line 4
    :goto_0
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {v1, v7}, Landroid/view/View;->setActivated(Z)V

    .line 5
    new-instance v1, Ljava/text/SimpleDateFormat;

    const v0, 0x3c8a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 6
    new-instance v4, Ljava/text/SimpleDateFormat;

    const v0, 0x3c8b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getCreatedDate()Ljava/lang/String;

    move-result-object v6

    .line 8
    :try_start_0
    invoke-virtual {v1, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 9
    iget-object v6, p1, Lv90$j;->z:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :catch_0
    iget-object v1, p1, Lv90$j;->B:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getRrn()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const v0, 0x3c8c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v4, :cond_1

    move-object v4, v6

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getRrn()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p1, Lv90$j;->C:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v6

    :goto_2
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p1, Lv90$j;->D:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_start()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v1, p1, Lv90$j;->E:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v1, p1, Lv90$j;->F:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v1, p1, Lv90$j;->G:Landroid/widget/TextView;

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 16
    iget-object v1, p1, Lv90$j;->S:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 17
    iget-object v1, p1, Lv90$j;->I:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 18
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getRefUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 19
    iget-object v1, p1, Lv90$j;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 20
    :cond_3
    iget-object v1, p1, Lv90$j;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    :goto_3
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v1

    const v0, 0x3c8d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 22
    iget-object v1, p1, Lv90$j;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 23
    iget-object v1, p1, Lv90$j;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_4

    .line 24
    :cond_4
    iget-object v1, v5, Lcom/olive/upi/transport/model/MandatesVo;->mandateType:Ljava/lang/String;

    const v0, 0x3c8e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 25
    iget-object v1, p1, Lv90$j;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 26
    iget-object v1, p1, Lv90$j;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_4

    .line 27
    :cond_5
    iget-object v1, p1, Lv90$j;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 28
    iget-object v1, p1, Lv90$j;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 29
    :goto_4
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getMerchantflag()Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    const v0, 0x3c8f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 31
    iget-object v1, p1, Lv90$j;->N:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_5

    .line 32
    :cond_6
    iget-object v1, p1, Lv90$j;->N:Landroid/widget/LinearLayout;

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 33
    :goto_5
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerMobile()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeMobile()Ljava/lang/String;

    move-result-object v1

    .line 35
    sget-object v6, Ln70;->f:Ln70$a;

    invoke-virtual {v6}, Ln70$a;->a()Ln70;

    move-result-object v8

    const v0, 0x3c90

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 36
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 37
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v10

    const v0, 0x3c91

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    .line 38
    :cond_7
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_9

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    .line 39
    :cond_8
    iget-object v8, p1, Lv90$j;->x:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v8, p1, Lv90$j;->y:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    iget-object v8, p1, Lv90$j;->G:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Ljg0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 42
    :cond_9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_a

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v10

    const v0, 0x3c92

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    .line 43
    :cond_a
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerMobile()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_c

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerMobile()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    .line 44
    :cond_b
    iget-object v8, p1, Lv90$j;->x:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    iget-object v8, p1, Lv90$j;->y:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    iget-object v8, p1, Lv90$j;->G:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Ljg0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 47
    :cond_c
    iget-object v8, p1, Lv90$j;->x:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object v8, p1, Lv90$j;->y:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v8, p1, Lv90$j;->G:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeAccountName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Ljg0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object v8, p1, Lv90$j;->R:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 51
    :goto_6
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_d

    invoke-virtual {v6}, Ln70$a;->a()Ln70;

    move-result-object v8

    invoke-virtual {v8, v9}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    .line 52
    iget-object v1, p1, Lv90$j;->P:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 53
    iget-object v1, p1, Lv90$j;->O:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_7

    .line 54
    :cond_d
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_e

    invoke-virtual {v6}, Ln70$a;->a()Ln70;

    move-result-object v6

    invoke-virtual {v6, v9}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 55
    iget-object v1, p1, Lv90$j;->P:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 56
    iget-object v1, p1, Lv90$j;->O:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 57
    iget-object v1, p1, Lv90$j;->w:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 58
    :cond_e
    :goto_7
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeStatus()Ljava/lang/String;

    move-result-object v1

    .line 59
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerStatus()Ljava/lang/String;

    move-result-object v6

    .line 60
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    const v0, 0x3c93

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v0, 0x3c94

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v0, 0x3c95

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    if-nez v8, :cond_f

    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_10

    .line 61
    invoke-virtual {v1, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_10

    .line 62
    invoke-virtual {v1, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_10

    .line 63
    :cond_f
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_11

    invoke-virtual {v6, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_10

    .line 64
    invoke-virtual {v6, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_10

    .line 65
    invoke-virtual {v6, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_11

    .line 66
    :cond_10
    iget-object v1, p1, Lv90$j;->I:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 67
    iget-object v1, p1, Lv90$j;->w:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 68
    iget-object v1, p1, Lv90$j;->S:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 69
    iget-object v1, p1, Lv90$j;->R:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 70
    iget-object v1, p1, Lv90$j;->Q:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lv90;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f0600be

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 71
    iget-object v1, p1, Lv90$j;->S:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lv90;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 72
    iget-object v1, p1, Lv90$j;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_b

    .line 73
    :cond_11
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_15

    const v0, 0x3c96

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_12

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_15

    .line 74
    invoke-virtual {v6, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 75
    :cond_12
    iget-object v1, p1, Lv90$j;->I:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 76
    iget-object v1, p1, Lv90$j;->R:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 77
    iget-object v1, p1, Lv90$j;->w:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 78
    iget-object v1, p1, Lv90$j;->S:Landroid/widget/RelativeLayout;

    if-eqz v7, :cond_13

    move v6, v3

    goto :goto_8

    :cond_13
    move v6, v2

    :goto_8
    invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 79
    iget-object v1, p1, Lv90$j;->I:Landroid/widget/Button;

    if-eqz v7, :cond_14

    move v3, v2

    :cond_14
    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_b

    .line 80
    :cond_15
    iget-object v1, p1, Lv90$j;->I:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 81
    iget-object v1, p1, Lv90$j;->w:Landroid/widget/TextView;

    if-eqz v7, :cond_16

    move v6, v3

    goto :goto_9

    :cond_16
    move v6, v2

    :goto_9
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 82
    iget-object v1, p1, Lv90$j;->S:Landroid/widget/RelativeLayout;

    if-eqz v7, :cond_17

    move v6, v3

    goto :goto_a

    :cond_17
    move v6, v2

    :goto_a
    invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 83
    iget-object v1, p1, Lv90$j;->I:Landroid/widget/Button;

    if-eqz v7, :cond_18

    move v3, v2

    :cond_18
    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 84
    :goto_b
    iget-object v1, v5, Lcom/olive/upi/transport/model/MandatesVo;->amountRule:Ljava/lang/String;

    const v0, 0x3c97

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_19

    .line 85
    iget-object v1, p1, Lv90$j;->H:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_c

    .line 86
    :cond_19
    iget-object v1, p1, Lv90$j;->H:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 87
    :goto_c
    iget-object v1, p1, Lv90$j;->v:Landroid/widget/TextView;

    new-instance v2, Lv90$a;

    invoke-direct {v2, p0, v5}, Lv90$a;-><init>(Lv90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    invoke-static {p1}, Lv90$j;->O(Lv90$j;)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lv90$b;

    invoke-direct {v2, p0}, Lv90$b;-><init>(Lv90;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    iget-object v1, p1, Lv90$j;->L:Landroid/widget/LinearLayout;

    new-instance v2, Lv90$c;

    invoke-direct {v2, p0, v5}, Lv90$c;-><init>(Lv90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    iget-object v1, p1, Lv90$j;->J:Landroid/widget/LinearLayout;

    new-instance v2, Lv90$d;

    invoke-direct {v2, p0, v5}, Lv90$d;-><init>(Lv90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    iget-object v1, p1, Lv90$j;->K:Landroid/widget/LinearLayout;

    new-instance v2, Lv90$e;

    invoke-direct {v2, p0, v5}, Lv90$e;-><init>(Lv90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    iget-object v1, p1, Lv90$j;->w:Landroid/widget/TextView;

    new-instance v2, Lv90$f;

    invoke-direct {v2, p0, v5}, Lv90$f;-><init>(Lv90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    iget-object v1, p1, Lv90$j;->M:Landroid/widget/LinearLayout;

    new-instance v2, Lv90$g;

    invoke-direct {v2, p0, v5}, Lv90$g;-><init>(Lv90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    iget-object v1, p1, Lv90$j;->I:Landroid/widget/Button;

    new-instance v9, Lv90$h;

    move-object v2, v9

    move-object v3, p0

    move-object v6, p1

    move v8, p2

    invoke-direct/range {v2 .. v8}, Lv90$h;-><init>(Lv90;Ljava/lang/String;Lcom/olive/upi/transport/model/MandatesVo;Lv90$j;ZI)V

    invoke-virtual {v1, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    invoke-static {p1}, Lv90$j;->O(Lv90$j;)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lv90$i;

    invoke-direct {p2, p0}, Lv90$i;-><init>(Lv90;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lv90$j;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0021

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lv90$j;

    invoke-direct {p2, p0, p1}, Lv90$j;-><init>(Lv90;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv90;->f:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lv90;->e:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
