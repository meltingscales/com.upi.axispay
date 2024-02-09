.class public Lw90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw90$g;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lw90$g;",
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
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lw90;->g:I

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lw90;->h:I

    .line 4
    iput-object p1, p0, Lw90;->e:Ljava/util/List;

    .line 5
    iget-object p1, p0, Lw90;->d:Landroid/content/Context;

    iput-object p1, p0, Lw90;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lw90;->e:Ljava/util/List;

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
    check-cast p1, Lw90$g;

    invoke-virtual {p0, p1, p2}, Lw90;->w(Lw90$g;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lw90;->x(Landroid/view/ViewGroup;I)Lw90$g;

    move-result-object p1

    return-object p1
.end method

.method public w(Lw90$g;I)V
    .locals 8

    .line 1
    iget-object v1, p0, Lw90;->e:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/MandatesVo;

    .line 2
    iget v2, p0, Lw90;->h:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne p2, v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    .line 3
    :goto_0
    iget-object v5, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {v5, v2}, Landroid/view/View;->setActivated(Z)V

    .line 4
    iget-object v5, p1, Lw90$g;->x:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v5, p1, Lw90$g;->z:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getAmount()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    new-instance v5, Ljava/text/SimpleDateFormat;

    const v0, 0x2a92

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 7
    new-instance v6, Ljava/text/SimpleDateFormat;

    const v0, 0x2a93

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getCreatedDate()Ljava/lang/String;

    move-result-object v7

    .line 9
    :try_start_0
    invoke-virtual {v5, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 10
    iget-object v7, p1, Lw90$g;->y:Landroid/widget/TextView;

    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    iget-object v5, p1, Lw90$g;->w:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v5, p1, Lw90$g;->A:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getRrn()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const v0, 0x2a94

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v6, :cond_1

    move-object v6, v7

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getRrn()Ljava/lang/String;

    move-result-object v6

    :goto_1
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v5, p1, Lw90$g;->B:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getUmn()Ljava/lang/String;

    move-result-object v7

    :goto_2
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v5, p1, Lw90$g;->C:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_start()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v5, p1, Lw90$g;->D:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getValidity_end()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v5, p1, Lw90$g;->E:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v5, p1, Lw90$g;->F:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerAccountName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ljg0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v5, p1, Lw90$g;->F:Landroid/widget/TextView;

    const/4 v6, 0x0

    invoke-virtual {v5, v6, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 19
    iget-object v3, p1, Lw90$g;->K:Landroid/widget/RelativeLayout;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 20
    iget-object v3, p1, Lw90$g;->G:Landroid/widget/Button;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 21
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getMerchantflag()Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    const v0, 0x2a95

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 23
    iget-object v3, p1, Lw90$g;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_3

    .line 24
    :cond_3
    iget-object v3, p1, Lw90$g;->J:Landroid/widget/LinearLayout;

    const/4 v6, 0x4

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 25
    :goto_3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeStatus()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 26
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeStatus()Ljava/lang/String;

    move-result-object v3

    const v0, 0x2a96

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 27
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeStatus()Ljava/lang/String;

    move-result-object v3

    const v0, 0x2a97

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 28
    :cond_4
    iget-object v3, p1, Lw90$g;->G:Landroid/widget/Button;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_4

    .line 29
    :cond_5
    iget-object v3, p1, Lw90$g;->G:Landroid/widget/Button;

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 30
    :goto_4
    invoke-static {p1}, Lw90$g;->O(Lw90$g;)Landroid/view/View;

    move-result-object v3

    new-instance v6, Lw90$a;

    invoke-direct {v6, p0}, Lw90$a;-><init>(Lw90;)V

    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    iget-object v3, p1, Lw90$g;->v:Landroid/widget/TextView;

    new-instance v6, Lw90$b;

    invoke-direct {v6, p0, v1}, Lw90$b;-><init>(Lw90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    iget-object v3, p1, Lw90$g;->H:Landroid/widget/LinearLayout;

    new-instance v6, Lw90$c;

    invoke-direct {v6, p0, v1}, Lw90$c;-><init>(Lw90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    iget-object v3, p1, Lw90$g;->I:Landroid/widget/LinearLayout;

    new-instance v6, Lw90$d;

    invoke-direct {v6, p0, v1}, Lw90$d;-><init>(Lw90;Lcom/olive/upi/transport/model/MandatesVo;)V

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    iget-object v1, p1, Lw90$g;->G:Landroid/widget/Button;

    new-instance v3, Lw90$e;

    invoke-direct {v3, p0, p1, v2, p2}, Lw90$e;-><init>(Lw90;Lw90$g;ZI)V

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    invoke-static {p1}, Lw90$g;->O(Lw90$g;)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lw90$f;

    invoke-direct {v1, p0}, Lw90$f;-><init>(Lw90;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 36
    iget-object p2, p1, Lw90$g;->K:Landroid/widget/RelativeLayout;

    if-eqz v2, :cond_6

    move v1, v4

    goto :goto_5

    :cond_6
    move v1, v5

    :goto_5
    invoke-virtual {p2, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 37
    iget-object p1, p1, Lw90$g;->G:Landroid/widget/Button;

    if-eqz v2, :cond_7

    move v4, v5

    :cond_7
    invoke-virtual {p1, v4}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lw90$g;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0123

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lw90$g;

    invoke-direct {p2, p0, p1}, Lw90$g;-><init>(Lw90;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw90;->f:Lng0;

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
    iput-object p1, p0, Lw90;->e:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
