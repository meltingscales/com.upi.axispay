.class public Lca0;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lca0$k;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lca0$k;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroid/content/Context;

.field public f:Lng0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p1, p0, Lca0;->e:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 4
    iput-object p1, p0, Lca0;->d:Ljava/util/List;

    .line 5
    iget-object p1, p0, Lca0;->e:Landroid/content/Context;

    iput-object p1, p0, Lca0;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lca0;->d:Ljava/util/List;

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

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lca0$k;

    invoke-virtual {p0, p1, p2}, Lca0;->w(Lca0$k;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lca0;->x(Landroid/view/ViewGroup;I)Lca0$k;

    move-result-object p1

    return-object p1
.end method

.method public w(Lca0$k;I)V
    .locals 6

    .line 1
    iget-object v1, p0, Lca0;->d:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;

    .line 2
    iget-object v1, p1, Lca0$k;->y:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v1, p1, Lca0$k;->A:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    new-instance v1, Ljava/text/SimpleDateFormat;

    const v0, 0x2a58

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v2, Ljava/text/SimpleDateFormat;

    const v0, 0x2a59

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getExpdate()Ljava/lang/String;

    move-result-object v3

    .line 7
    :try_start_0
    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 8
    iget-object v3, p1, Lca0$k;->z:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x2a5a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :catch_0
    iget-object v1, p1, Lca0$k;->x:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v1, p1, Lca0$k;->B:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getValidity_start()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p1, Lca0$k;->C:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getValidity_end()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p1, Lca0$k;->D:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getRecurrencePattern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v1, p1, Lca0$k;->w:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getRefid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getMerchantflag()Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPurposecode()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPurposecode()Ljava/lang/String;

    move-result-object v2

    const v0, 0x2a5b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getMandatetype()Ljava/lang/String;

    move-result-object v2

    const v0, 0x2a5c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 16
    iget-object v2, p1, Lca0$k;->S:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 17
    iget-object v2, p1, Lca0$k;->R:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 18
    iget-object v2, p1, Lca0$k;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 19
    iget-object v2, p1, Lca0$k;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 20
    iget-object v2, p1, Lca0$k;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 21
    :cond_0
    iget-object v2, p1, Lca0$k;->S:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 22
    iget-object v2, p1, Lca0$k;->R:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 23
    iget-object v2, p1, Lca0$k;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    iget-object v2, p1, Lca0$k;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 25
    iget-object v2, p1, Lca0$k;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 26
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const v0, 0x2a5d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 27
    iget-object v1, p1, Lca0$k;->Q:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 28
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getRefurl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 29
    iget-object v1, p1, Lca0$k;->G:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 30
    :cond_1
    iget-object v1, p1, Lca0$k;->G:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 31
    :goto_1
    iget-object v1, p1, Lca0$k;->N:Landroid/widget/LinearLayout;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 32
    iget-object v1, p1, Lca0$k;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 33
    :cond_2
    iget-object v1, p1, Lca0$k;->Q:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 34
    iget-object v1, p1, Lca0$k;->N:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 35
    iget-object v1, p1, Lca0$k;->J:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 36
    :goto_2
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->amountRule:Ljava/lang/String;

    const v0, 0x2a5e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 37
    iget-object v1, p1, Lca0$k;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 38
    :cond_3
    iget-object v1, p1, Lca0$k;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 39
    :goto_3
    iget-object v1, p1, Lca0$k;->E:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getNotes()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v1, p1, Lca0$k;->F:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    iget-object v1, p1, Lca0$k;->F:Landroid/widget/TextView;

    const/4 v2, 0x0

    const/4 v5, 0x1

    invoke-virtual {v1, v2, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 42
    iget-object v1, p1, Lca0$k;->J:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$b;

    invoke-direct {v2, p0, p2}, Lca0$b;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    iget-object v1, p1, Lca0$k;->N:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$c;

    invoke-direct {v2, p0, p2}, Lca0$c;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    iget-object v1, p1, Lca0$k;->O:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$d;

    invoke-direct {v2, p0, p2}, Lca0$d;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    iget-object v1, p1, Lca0$k;->K:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$e;

    invoke-direct {v2, p0, p2}, Lca0$e;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    iget-object v1, p1, Lca0$k;->L:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$f;

    invoke-direct {v2, p0, p2}, Lca0$f;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    iget-object v1, p1, Lca0$k;->P:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$g;

    invoke-direct {v2, p0, p2}, Lca0$g;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    iget-object v1, p1, Lca0$k;->R:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$h;

    invoke-direct {v2, p0, p2}, Lca0$h;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    iget-object v1, p1, Lca0$k;->S:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$i;

    invoke-direct {v2, p0, p2}, Lca0$i;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    iget-object v1, p1, Lca0$k;->T:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 51
    iget-object v1, p1, Lca0$k;->H:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 52
    iget-object v1, p1, Lca0$k;->I:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 53
    iget-object v1, p1, Lca0$k;->M:Landroid/widget/LinearLayout;

    new-instance v2, Lca0$j;

    invoke-direct {v2, p0, p2, p1}, Lca0$j;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;Lca0$k;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    iget-object p1, p1, Lca0$k;->G:Landroid/widget/TextView;

    new-instance v1, Lca0$a;

    invoke-direct {v1, p0, p2}, Lca0$a;-><init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lca0$k;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d002f

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lca0$k;

    invoke-direct {p2, p0, p1}, Lca0$k;-><init>(Lca0;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lca0;->f:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lca0;->d:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
