.class public Lda0;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lda0$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lda0$f;",
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
            "Lcom/olive/upi/transport/model/PendingReqVo;",
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
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p1, p0, Lda0;->d:Landroid/content/Context;

    .line 3
    invoke-virtual {p0, p2}, Lda0;->A(Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lda0;->f:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lda0$a;

    invoke-direct {v0, p0}, Lda0$a;-><init>(Lda0;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lda0;->f:Ljava/util/ArrayList;

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

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lda0$f;

    invoke-virtual {p0, p1, p2}, Lda0;->w(Lda0$f;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lda0;->x(Landroid/view/ViewGroup;I)Lda0$f;

    move-result-object p1

    return-object p1
.end method

.method public w(Lda0$f;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lda0;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/PendingReqVo;

    .line 2
    invoke-static {p1}, Lda0$f;->O(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f120007

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayerVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-static {p1}, Lda0$f;->P(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x25df

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-static {p1}, Lda0$f;->Q(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-static {p1}, Lda0$f;->O(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-static {p1}, Lda0$f;->R(Lda0$f;)Lcom/pkmmte/view/CircularImageView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getBeneName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lda0;->d:Landroid/content/Context;

    const v3, 0x7f06006c

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v1, v2}, Ljg0;->y(Ljava/lang/String;I)Lqo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    invoke-static {p1}, Lda0$f;->S(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getExpdate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getMerchantflag()Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/16 v2, 0x8

    if-nez v1, :cond_1

    const v1, 0x25e0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-static {p1}, Lda0$f;->T(Lda0$f;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getInvoiceurl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    invoke-static {p1}, Lda0$f;->U(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Lda0$f;->U(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-static {p1}, Lda0$f;->T(Lda0$f;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 15
    invoke-static {p1}, Lda0$f;->U(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    :goto_0
    invoke-static {p1}, Lda0$f;->V(Lda0$f;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lda0$b;

    invoke-direct {v1, p0, p2}, Lda0$b;-><init>(Lda0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    invoke-static {p1}, Lda0$f;->W(Lda0$f;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lda0$c;

    invoke-direct {v1, p0, p2}, Lda0$c;-><init>(Lda0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    invoke-static {p1}, Lda0$f;->X(Lda0$f;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lda0$d;

    invoke-direct {v1, p0, p2}, Lda0$d;-><init>(Lda0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    invoke-static {p1}, Lda0$f;->U(Lda0$f;)Landroid/widget/TextView;

    move-result-object p1

    new-instance v0, Lda0$e;

    invoke-direct {v0, p0, p2}, Lda0$e;-><init>(Lda0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lda0$f;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d009b

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lda0$f;

    invoke-direct {p2, p0, p1}, Lda0$f;-><init>(Lda0;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lda0;->e:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lda0;->A(Ljava/util/ArrayList;)V

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
