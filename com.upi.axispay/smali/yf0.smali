.class public Lyf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/widget/TextView;

.field public E:Landroid/widget/TextView;

.field public F:Lcom/olive/upi/transport/model/TransactionData;

.field public G:Landroid/widget/EditText;

.field public H:Landroid/widget/TextView;

.field public I:Landroid/widget/TextView;

.field public J:Landroid/widget/TextView;

.field public K:Landroid/widget/TextView;

.field public L:Landroid/widget/TextView;

.field public M:Landroid/widget/TextView;

.field public N:Landroid/widget/TextView;

.field public O:Landroid/widget/TextView;

.field public P:Landroid/widget/TextView;

.field public Q:Landroid/text/Spannable;

.field public R:Landroid/widget/RelativeLayout;

.field public S:Lcom/olive/upi/transport/model/Udir;

.field public T:Lcom/kofigyan/stateprogressbar/StateProgressBar;

.field public U:I

.field public V:I

.field public W:Landroid/widget/RelativeLayout;

.field public X:Landroid/widget/RelativeLayout;

.field public Y:Landroid/widget/RelativeLayout;

.field public Z:Landroid/widget/RelativeLayout;

.field public a0:Landroid/widget/RelativeLayout;

.field public b0:Landroid/widget/RelativeLayout;

.field public c0:Landroid/widget/TextView;

.field public d0:Landroid/widget/TextView;

.field public e0:Landroid/widget/TextView;

.field public f0:Landroid/widget/TextView;

.field public g0:Landroid/widget/TextView;

.field public h0:Landroid/widget/TextView;

.field public i0:Landroid/widget/TextView;

.field public j0:Landroid/widget/TextView;

.field public k0:Landroid/widget/TextView;

.field public l:Landroid/widget/ImageView;

.field public l0:Landroid/widget/TextView;

.field public m:Landroid/widget/LinearLayout;

.field public m0:Landroid/widget/TextView;

.field public n:Landroid/widget/LinearLayout;

.field public n0:Landroid/widget/TextView;

.field public o:Landroid/widget/LinearLayout;

.field public o0:Landroid/widget/TextView;

.field public p:Landroid/view/View;

.field public p0:Landroid/widget/RelativeLayout;

.field public q:Landroid/widget/Button;

.field public q0:Landroid/widget/RelativeLayout;

.field public r:Landroid/widget/Button;

.field public r0:Ljava/lang/String;

.field public s:Landroid/widget/TextView;

.field public s0:I

.field public t:Landroid/widget/TextView;

.field public t0:Landroid/app/Dialog;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lyf0;)Lcom/olive/upi/transport/model/TransactionData;
    .locals 0

    .line 1
    iget-object p0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTipAmount()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    .line 2
    iget-object v3, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getTipAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iget-object v5, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    add-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v0, v2

    const v3, 0x367

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lyf0;->r0:Ljava/lang/String;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljg0;->a(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lyf0;->r0:Ljava/lang/String;

    .line 5
    :goto_0
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 6
    iget-object v0, p0, Lyf0;->W:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lyf0;->j0:Landroid/widget/TextView;

    iget-object v3, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lyf0;->k0:Landroid/widget/TextView;

    iget-object v3, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceNo()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceDate()Ljava/lang/String;

    move-result-object v0

    .line 10
    iget-object v3, p0, Lyf0;->c0:Landroid/widget/TextView;

    const/16 v4, 0xa

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lyf0;->d0:Landroid/widget/TextView;

    iget-object v3, p0, Lyf0;->r0:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getGstBrkUp()Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    if-eqz v0, :cond_5

    const v4, 0x368

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    const v6, 0x369

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-nez v5, :cond_3

    .line 15
    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 16
    aget-object v4, v0, v2

    aget-object v0, v0, v1

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x36a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 18
    iget-object v1, p0, Lyf0;->Z:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 19
    iget-object v1, p0, Lyf0;->g0:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setIGST(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    const v0, 0x36b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 22
    iget-object v1, p0, Lyf0;->b0:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 23
    iget-object v1, p0, Lyf0;->i0:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setCESS(Ljava/lang/String;)V

    goto :goto_1

    .line 25
    :cond_2
    iget-object v0, p0, Lyf0;->a0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 26
    iget-object v0, p0, Lyf0;->h0:Landroid/widget/TextView;

    const v1, 0x36c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setGST(Ljava/lang/String;)V

    goto :goto_1

    .line 28
    :cond_3
    iget-object v3, p0, Lyf0;->X:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 29
    iget-object v3, p0, Lyf0;->Y:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 30
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 31
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v3, v1

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 34
    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v3, v1

    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v2, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 36
    iget-object v3, p0, Lyf0;->f0:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    iget-object v3, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3, v2}, Lcom/olive/upi/transport/model/TransactionData;->setCGST(Ljava/lang/String;)V

    add-int/2addr v4, v1

    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lyf0;->e0:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setSGST(Ljava/lang/String;)V

    goto :goto_1

    .line 41
    :cond_4
    iget-object v0, p0, Lyf0;->W:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public B()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0284

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lyf0;->m:Landroid/widget/LinearLayout;

    .line 2
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a03c7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lyf0;->n:Landroid/widget/LinearLayout;

    .line 3
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0440

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 4
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04dd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->v:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a0498

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->D:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a0444

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    iput-object v0, p0, Lyf0;->T:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 7
    iget-object v0, p0, Lyf0;->D:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a0116

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->m0:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a04e2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->s:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a0441

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->R:Landroid/widget/RelativeLayout;

    .line 11
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a0117

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->p0:Landroid/widget/RelativeLayout;

    .line 12
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a03b7

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    .line 13
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a04e3

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    .line 14
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a014e

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->o0:Landroid/widget/TextView;

    .line 15
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a03b6

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->n0:Landroid/widget/TextView;

    .line 16
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a0237

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lyf0;->l:Landroid/widget/ImageView;

    .line 17
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a0494

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->t:Landroid/widget/TextView;

    .line 18
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v2, 0x7f0a049f

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->u:Landroid/widget/TextView;

    .line 19
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v3, 0x7f0a04f1

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->z:Landroid/widget/TextView;

    .line 20
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v3, 0x7f0a04c2

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->A:Landroid/widget/TextView;

    .line 21
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->B:Landroid/widget/TextView;

    .line 22
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04d5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->C:Landroid/widget/TextView;

    .line 23
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a019e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lyf0;->G:Landroid/widget/EditText;

    .line 24
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a00f7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lyf0;->r:Landroid/widget/Button;

    .line 25
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a00f0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lyf0;->q:Landroid/widget/Button;

    .line 26
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04db

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->H:Landroid/widget/TextView;

    .line 27
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04dc

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->J:Landroid/widget/TextView;

    .line 28
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04cf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->K:Landroid/widget/TextView;

    .line 29
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04d0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->L:Landroid/widget/TextView;

    .line 30
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04d9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->y:Landroid/widget/TextView;

    .line 31
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a048a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->x:Landroid/widget/TextView;

    .line 32
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0497

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->E:Landroid/widget/TextView;

    .line 33
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04c8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->M:Landroid/widget/TextView;

    .line 34
    iget-object v0, p0, Lyf0;->K:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 35
    iget-object v0, p0, Lyf0;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 36
    iget-object v0, p0, Lyf0;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 37
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a015d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->w:Landroid/widget/TextView;

    .line 38
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a01d1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 39
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a049e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lyf0;->o:Landroid/widget/LinearLayout;

    .line 40
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a049d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->N:Landroid/widget/TextView;

    .line 41
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->O:Landroid/widget/TextView;

    .line 42
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a03a5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->W:Landroid/widget/RelativeLayout;

    .line 43
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04b2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->j0:Landroid/widget/TextView;

    .line 44
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04b3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->k0:Landroid/widget/TextView;

    .line 45
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0483

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 46
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04b1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->c0:Landroid/widget/TextView;

    .line 47
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0491

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->d0:Landroid/widget/TextView;

    .line 48
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0484

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->e0:Landroid/widget/TextView;

    .line 49
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0480

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->f0:Landroid/widget/TextView;

    .line 50
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0482

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->g0:Landroid/widget/TextView;

    .line 51
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0481

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->h0:Landroid/widget/TextView;

    .line 52
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a047f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->i0:Landroid/widget/TextView;

    .line 53
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0015

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->X:Landroid/widget/RelativeLayout;

    .line 54
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0006

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->Y:Landroid/widget/RelativeLayout;

    .line 55
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a0004

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->b0:Landroid/widget/RelativeLayout;

    .line 56
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a000b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->a0:Landroid/widget/RelativeLayout;

    .line 57
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a000e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lyf0;->Z:Landroid/widget/RelativeLayout;

    .line 58
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a04d6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->P:Landroid/widget/TextView;

    .line 59
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a048b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lyf0;->I:Landroid/widget/TextView;

    .line 60
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a053e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 61
    iget-object v0, p0, Lyf0;->p:Landroid/view/View;

    const v1, 0x7f0a053d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-void
.end method

.method public C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyf0;->q:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lyf0;->r:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lyf0;->M:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lyf0;->p0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final D(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyf0;->r0:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lyf0;->U:I

    .line 2
    iget-object v1, p0, Lyf0;->r0:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lyf0;->V:I

    .line 3
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lyf0;->Q:Landroid/text/Spannable;

    .line 4
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060048

    invoke-static {v1, v2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {p1, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget v1, p0, Lyf0;->U:I

    iget v2, p0, Lyf0;->V:I

    const/16 v3, 0x21

    invoke-interface {v0, p1, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 5
    iget-object p1, p0, Lyf0;->Q:Landroid/text/Spannable;

    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget v1, p0, Lyf0;->U:I

    iget v2, p0, Lyf0;->V:I

    invoke-interface {p1, v0, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 6
    iget-object p1, p0, Lyf0;->Q:Landroid/text/Spannable;

    new-instance v0, Landroid/text/style/RelativeSizeSpan;

    const v1, 0x3f99999a    # 1.2f

    invoke-direct {v0, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    iget v1, p0, Lyf0;->U:I

    iget v2, p0, Lyf0;->V:I

    invoke-interface {p1, v0, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 7
    iget-object p1, p0, Lyf0;->I:Landroid/widget/TextView;

    iget-object v0, p0, Lyf0;->Q:Landroid/text/Spannable;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final E()V
    .locals 4

    .line 1
    iget v0, p0, Lyf0;->s0:I

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-eq v0, v1, :cond_6

    const/4 v3, 0x4

    if-eq v0, v3, :cond_6

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    goto :goto_1

    :cond_0
    const/16 v3, 0xa

    if-ne v0, v3, :cond_2

    .line 2
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const v1, 0x36d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lyf0;->y()V

    goto :goto_2

    .line 5
    :cond_1
    iget-object v0, p0, Lyf0;->R:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 6
    :cond_2
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getDirection()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_5

    .line 7
    iget v0, p0, Lyf0;->s0:I

    if-eq v0, v3, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 8
    :cond_4
    iget-object v0, p0, Lyf0;->R:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 9
    :cond_5
    invoke-virtual {p0}, Lyf0;->y()V

    goto :goto_2

    .line 10
    :cond_6
    :goto_1
    iget-object v0, p0, Lyf0;->R:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method public final F()V
    .locals 10

    .line 1
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->BILLPAY_UPIID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3
    iget-object v0, p0, Lyf0;->w:Landroid/widget/TextView;

    const v1, 0x7f120507

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 4
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lyf0;->v:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getDebitBankName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x36e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    const v1, 0x36f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 8
    array-length v1, v0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_5

    .line 9
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v1

    .line 10
    iget-object v3, p0, Lyf0;->x:Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object v3, p0, Lyf0;->y:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v3, 0x0

    .line 12
    aget-object v5, v0, v3

    const v6, 0x370

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    const/16 v6, 0xa

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    .line 13
    iget-object v5, p0, Lyf0;->K:Landroid/widget/TextView;

    aget-object v8, v0, v7

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v5, p0, Lyf0;->L:Landroid/widget/TextView;

    aget-object v0, v0, v2

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ne v1, v6, :cond_0

    const v0, 0x7f120168

    new-array v1, v7, [Ljava/lang/Object;

    .line 15
    iget-object v2, p0, Lyf0;->r0:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const v0, 0x7f120167

    new-array v1, v7, [Ljava/lang/Object;

    .line 16
    iget-object v2, p0, Lyf0;->r0:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_1
    aget-object v5, v0, v3

    const v8, 0x371

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x4

    .line 18
    aget-object v8, v0, v5

    const v9, 0x372

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_0

    .line 19
    :cond_2
    aget-object v5, v0, v5

    const v8, 0x373

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 20
    iget-object v5, p0, Lyf0;->K:Landroid/widget/TextView;

    aget-object v8, v0, v7

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v5, p0, Lyf0;->L:Landroid/widget/TextView;

    aget-object v0, v0, v2

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ne v1, v6, :cond_3

    const v0, 0x7f120282

    new-array v1, v7, [Ljava/lang/Object;

    .line 22
    iget-object v2, p0, Lyf0;->r0:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const v0, 0x7f120281

    new-array v1, v7, [Ljava/lang/Object;

    .line 23
    iget-object v2, p0, Lyf0;->r0:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lyf0;->D(Ljava/lang/String;)V

    .line 24
    :cond_4
    :goto_0
    iget-object v0, p0, Lyf0;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_5
    return-void
.end method

.method public final G()V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lxc0;->r()V

    .line 2
    :cond_0
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getUdir()Lcom/olive/upi/transport/model/Udir;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 3
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getUdir()Lcom/olive/upi/transport/model/Udir;

    move-result-object v1

    iput-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    .line 4
    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    const v2, 0x374

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, v0, Lyf0;->T:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    sget-object v2, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->FOUR:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-virtual {v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setCurrentStateNumber(Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;)V

    goto/16 :goto_0

    .line 6
    :cond_1
    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v3, 0x375

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_2

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, v0, Lyf0;->T:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    sget-object v2, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->ONE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-virtual {v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setCurrentStateNumber(Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    iget-object v1, v0, Lyf0;->T:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    sget-object v2, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->TWO:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-virtual {v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setCurrentStateNumber(Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v1, v1, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    iget-object v1, v0, Lyf0;->T:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    sget-object v2, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->THREE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-virtual {v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setCurrentStateNumber(Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;)V

    .line 12
    :cond_4
    :goto_0
    iget-object v1, v0, Lyf0;->o:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 13
    iget-object v1, v0, Lyf0;->t:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v1, v0, Lyf0;->H:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    const v4, 0x376

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eq v1, v3, :cond_6

    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_RECEIVE:I

    if-ne v1, v3, :cond_5

    goto :goto_1

    .line 16
    :cond_5
    iget-object v1, v0, Lyf0;->p:Landroid/view/View;

    const v3, 0x7f0a01d1

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 17
    :cond_6
    :goto_1
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 18
    iget-object v1, v0, Lyf0;->u:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 19
    :cond_7
    iget-object v1, v0, Lyf0;->u:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    :goto_2
    iget-object v1, v0, Lyf0;->C:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_3

    .line 22
    :cond_8
    iget-object v1, v0, Lyf0;->z:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 23
    :cond_9
    :goto_3
    iget-object v1, v0, Lyf0;->z:Landroid/widget/TextView;

    const v3, 0x7f1202e1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 24
    :goto_4
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v1

    .line 25
    iget-object v3, v0, Lyf0;->E:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v3, 0x2

    const/4 v4, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/16 v8, 0xa

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x1

    if-ne v1, v8, :cond_a

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v12

    const/high16 v13, 0x7f110000

    invoke-static {v12, v13}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v12

    .line 27
    invoke-virtual {v12}, Landroid/media/MediaPlayer;->start()V

    .line 28
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    const v13, 0x7f1204a7

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(I)V

    .line 29
    iget-object v12, v0, Lyf0;->l:Landroid/widget/ImageView;

    const v13, 0x7f08027e

    invoke-virtual {v12, v13}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 30
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v13

    const v14, 0x7f06018a

    invoke-static {v13, v14}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_5

    :cond_a
    const v12, 0x7f080296

    const v13, 0x7f060032

    if-ne v1, v11, :cond_b

    .line 31
    iget-object v14, v0, Lyf0;->s:Landroid/widget/TextView;

    const v15, 0x7f120498

    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(I)V

    .line 32
    iget-object v14, v0, Lyf0;->l:Landroid/widget/ImageView;

    invoke-virtual {v14, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 33
    iget-object v12, v0, Lyf0;->D:Landroid/widget/TextView;

    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 34
    iget-object v12, v0, Lyf0;->D:Landroid/widget/TextView;

    iget-object v14, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/TransactionData;->getDescription()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v14

    invoke-static {v14, v13}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_5

    :cond_b
    const v14, 0x7f060184

    const v15, 0x7f080299

    if-ne v1, v3, :cond_c

    .line 36
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    const v13, 0x7f12048d

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(I)V

    .line 37
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    const/4 v13, 0x0

    invoke-virtual {v12, v13, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 38
    iget-object v12, v0, Lyf0;->l:Landroid/widget/ImageView;

    invoke-virtual {v12, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 39
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v13

    invoke-static {v13, v14}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_5

    :cond_c
    if-ne v1, v10, :cond_d

    .line 40
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    const v13, 0x7f120344

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(I)V

    .line 41
    iget-object v12, v0, Lyf0;->l:Landroid/widget/ImageView;

    invoke-virtual {v12, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 42
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v13

    invoke-static {v13, v14}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_5

    :cond_d
    if-ne v1, v4, :cond_e

    .line 43
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    const v14, 0x7f1204a1

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(I)V

    .line 44
    iget-object v12, v0, Lyf0;->E:Landroid/widget/TextView;

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 45
    iget-object v12, v0, Lyf0;->l:Landroid/widget/ImageView;

    invoke-virtual {v12, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 46
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v14

    invoke-static {v14, v13}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_5

    :cond_e
    if-ne v1, v9, :cond_f

    .line 47
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    const v14, 0x7f1201b5

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(I)V

    .line 48
    iget-object v12, v0, Lyf0;->l:Landroid/widget/ImageView;

    const v14, 0x7f080298

    invoke-virtual {v12, v14}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 49
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v14

    invoke-static {v14, v13}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_5

    :cond_f
    if-ne v1, v7, :cond_10

    .line 50
    iget-object v14, v0, Lyf0;->s:Landroid/widget/TextView;

    const v15, 0x7f1204a3

    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(I)V

    .line 51
    iget-object v14, v0, Lyf0;->l:Landroid/widget/ImageView;

    invoke-virtual {v14, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 52
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v14

    invoke-static {v14, v13}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_5

    :cond_10
    if-ne v1, v6, :cond_11

    .line 53
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    const v14, 0x7f1200b5

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(I)V

    .line 54
    iget-object v12, v0, Lyf0;->l:Landroid/widget/ImageView;

    const v14, 0x7f080297

    invoke-virtual {v12, v14}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 55
    iget-object v12, v0, Lyf0;->s:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v14

    invoke-static {v14, v13}, Lt8;->d(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 56
    :cond_11
    :goto_5
    iget-object v12, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v12}, Lcom/olive/upi/transport/model/TransactionData;->getDirection()I

    move-result v12

    .line 57
    iget-object v13, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v13

    .line 58
    iget-object v14, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v14

    .line 59
    iget-object v15, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v15}, Lcom/olive/upi/transport/model/TransactionData;->getDebitBankName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    const v8, 0x377

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v15, :cond_12

    .line 60
    iget-object v15, v0, Lyf0;->B:Landroid/widget/TextView;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 61
    :cond_12
    iget-object v7, v0, Lyf0;->B:Landroid/widget/TextView;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getDebitBankName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getDestAccount()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    :goto_6
    iget-object v6, v0, Lyf0;->w:Landroid/widget/TextView;

    const v7, 0x7f120507

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(I)V

    if-eq v12, v11, :cond_33

    const v6, 0x7f12007f

    const v15, 0x378

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    const v7, 0x7f1203b0

    if-eq v12, v3, :cond_28

    if-eq v12, v10, :cond_1d

    if-eq v12, v9, :cond_13

    goto/16 :goto_15

    .line 63
    :cond_13
    iget-object v3, v0, Lyf0;->M:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 64
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    if-eqz v2, :cond_14

    .line 65
    iget-object v3, v0, Lyf0;->B:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/TransactionData;->getDebitBankName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    :cond_14
    iget-object v2, v0, Lyf0;->J:Landroid/widget/TextView;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ne v1, v10, :cond_15

    const v1, 0x7f120078

    new-array v2, v11, [Ljava/lang/Object;

    .line 67
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_15
    if-ne v1, v4, :cond_16

    const v1, 0x7f120078

    new-array v2, v11, [Ljava/lang/Object;

    .line 68
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_7

    :cond_16
    const/4 v2, 0x6

    if-ne v1, v2, :cond_17

    const v1, 0x7f12006e

    new-array v2, v11, [Ljava/lang/Object;

    .line 69
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_7

    :cond_17
    const/4 v2, 0x5

    if-ne v1, v2, :cond_18

    const v1, 0x7f120070

    new-array v2, v11, [Ljava/lang/Object;

    .line 70
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_7

    :cond_18
    if-ne v1, v9, :cond_19

    const v1, 0x7f12006c

    new-array v2, v11, [Ljava/lang/Object;

    .line 71
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_7

    :cond_19
    if-ne v1, v11, :cond_1a

    const v1, 0x7f12006d

    new-array v2, v11, [Ljava/lang/Object;

    .line 72
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_7

    :cond_1a
    const/16 v2, 0xa

    if-ne v1, v2, :cond_1b

    const v1, 0x7f120080

    new-array v2, v11, [Ljava/lang/Object;

    .line 73
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    .line 74
    :cond_1b
    :goto_7
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneficiaryName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqa0;->l(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_8

    :cond_1c
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneficiaryName()Ljava/lang/String;

    .line 75
    :goto_8
    iget-object v1, v0, Lyf0;->K:Landroid/widget/TextView;

    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneficiaryName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v1, v0, Lyf0;->L:Landroid/widget/TextView;

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_15

    .line 77
    :cond_1d
    iget-object v4, v0, Lyf0;->J:Landroid/widget/TextView;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ne v1, v10, :cond_1f

    new-array v1, v11, [Ljava/lang/Object;

    .line 78
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v1, v5

    invoke-virtual {v0, v6, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    .line 79
    iget-object v1, v0, Lyf0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 80
    iget-object v1, v0, Lyf0;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 81
    iget-object v1, v0, Lyf0;->N:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    .line 82
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 83
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 84
    :cond_1e
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    :goto_9
    iget-object v1, v0, Lyf0;->P:Landroid/widget/TextView;

    const v3, 0x7f1203b9

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 86
    iget-object v1, v0, Lyf0;->C:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_b

    :cond_1f
    if-ne v1, v3, :cond_20

    new-array v1, v11, [Ljava/lang/Object;

    .line 87
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v1, v5

    invoke-virtual {v0, v6, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_20
    const/4 v3, 0x6

    if-ne v1, v3, :cond_21

    const v1, 0x7f120075

    new-array v3, v11, [Ljava/lang/Object;

    .line 88
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_21
    const/4 v3, 0x5

    if-ne v1, v3, :cond_22

    const v1, 0x7f12007b

    new-array v3, v11, [Ljava/lang/Object;

    .line 89
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_22
    if-ne v1, v9, :cond_24

    const v1, 0x7f12007c

    new-array v3, v11, [Ljava/lang/Object;

    .line 90
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    .line 91
    iget-object v1, v0, Lyf0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 92
    iget-object v1, v0, Lyf0;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 93
    iget-object v1, v0, Lyf0;->N:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    .line 94
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 95
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    .line 96
    :cond_23
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    :goto_a
    iget-object v1, v0, Lyf0;->P:Landroid/widget/TextView;

    const v3, 0x7f1203b9

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 98
    iget-object v1, v0, Lyf0;->C:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_b

    :cond_24
    const/16 v3, 0xa

    if-ne v1, v3, :cond_25

    const v1, 0x7f120081

    new-array v3, v11, [Ljava/lang/Object;

    .line 99
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_b

    :cond_25
    if-ne v1, v11, :cond_26

    const v1, 0x7f12007d

    new-array v3, v11, [Ljava/lang/Object;

    .line 100
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    .line 101
    :cond_26
    :goto_b
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lqa0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :cond_27
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterName()Ljava/lang/String;

    move-result-object v1

    .line 102
    :goto_c
    iget-object v3, v0, Lyf0;->K:Landroid/widget/TextView;

    invoke-static {v1}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    iget-object v1, v0, Lyf0;->L:Landroid/widget/TextView;

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    iget-object v1, v0, Lyf0;->M:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_15

    .line 105
    :cond_28
    iget-object v3, v0, Lyf0;->J:Landroid/widget/TextView;

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    iget-object v3, v0, Lyf0;->v:Landroid/widget/TextView;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v14, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/TransactionData;->getDebitBankName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getDestAccount()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lqa0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_d

    :cond_29
    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterName()Ljava/lang/String;

    move-result-object v3

    .line 108
    :goto_d
    iget-object v8, v0, Lyf0;->K:Landroid/widget/TextView;

    invoke-static {v3}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v3, v0, Lyf0;->L:Landroid/widget/TextView;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ne v1, v11, :cond_2a

    const v1, 0x7f120074

    new-array v3, v11, [Ljava/lang/Object;

    .line 110
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto/16 :goto_11

    :cond_2a
    if-eq v1, v10, :cond_30

    if-ne v1, v4, :cond_2b

    goto/16 :goto_f

    :cond_2b
    if-ne v1, v9, :cond_2d

    const v1, 0x7f12007c

    new-array v3, v11, [Ljava/lang/Object;

    .line 111
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    .line 112
    iget-object v1, v0, Lyf0;->N:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    .line 113
    iget-object v1, v0, Lyf0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 114
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2c

    .line 115
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_e

    .line 116
    :cond_2c
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    :goto_e
    iget-object v1, v0, Lyf0;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 118
    iget-object v1, v0, Lyf0;->P:Landroid/widget/TextView;

    const v3, 0x7f1203b9

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 119
    iget-object v1, v0, Lyf0;->C:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_11

    :cond_2d
    const/16 v3, 0xa

    if-ne v1, v3, :cond_2e

    const v1, 0x7f120081

    new-array v3, v11, [Ljava/lang/Object;

    .line 120
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto/16 :goto_11

    :cond_2e
    const/4 v3, 0x5

    if-ne v1, v3, :cond_2f

    const v1, 0x7f12007b

    new-array v3, v11, [Ljava/lang/Object;

    .line 121
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_11

    :cond_2f
    const/4 v3, 0x6

    if-ne v1, v3, :cond_32

    const v1, 0x7f12007a

    new-array v3, v11, [Ljava/lang/Object;

    .line 122
    iget-object v4, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_11

    :cond_30
    :goto_f
    new-array v1, v11, [Ljava/lang/Object;

    .line 123
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v1, v5

    invoke-virtual {v0, v6, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    .line 124
    iget-object v1, v0, Lyf0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 125
    iget-object v1, v0, Lyf0;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 126
    iget-object v1, v0, Lyf0;->N:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    .line 127
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_31

    .line 128
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_10

    .line 129
    :cond_31
    iget-object v1, v0, Lyf0;->O:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    :goto_10
    iget-object v1, v0, Lyf0;->P:Landroid/widget/TextView;

    const v3, 0x7f1203b9

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 131
    iget-object v1, v0, Lyf0;->C:Landroid/widget/TextView;

    iget-object v3, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    :cond_32
    :goto_11
    iget-object v1, v0, Lyf0;->M:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_15

    .line 133
    :cond_33
    iget-object v3, v0, Lyf0;->M:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 134
    iget-object v2, v0, Lyf0;->J:Landroid/widget/TextView;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ne v1, v11, :cond_34

    const v1, 0x7f120073

    new-array v2, v11, [Ljava/lang/Object;

    .line 135
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto/16 :goto_12

    :cond_34
    if-ne v1, v10, :cond_35

    const v1, 0x7f120077

    new-array v2, v11, [Ljava/lang/Object;

    .line 136
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_12

    :cond_35
    if-ne v1, v4, :cond_36

    const v1, 0x7f120077

    new-array v2, v11, [Ljava/lang/Object;

    .line 137
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_12

    :cond_36
    if-ne v1, v9, :cond_37

    const v1, 0x7f120072

    new-array v2, v11, [Ljava/lang/Object;

    .line 138
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_12

    :cond_37
    const/16 v2, 0xa

    if-ne v1, v2, :cond_38

    const v1, 0x7f120080

    new-array v2, v11, [Ljava/lang/Object;

    .line 139
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_12

    :cond_38
    const/4 v2, 0x5

    if-ne v1, v2, :cond_39

    const v1, 0x7f120070

    new-array v2, v11, [Ljava/lang/Object;

    .line 140
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    goto :goto_12

    :cond_39
    const/4 v2, 0x6

    if-ne v1, v2, :cond_3a

    const v1, 0x7f12006e

    new-array v2, v11, [Ljava/lang/Object;

    .line 141
    iget-object v3, v0, Lyf0;->r0:Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf0;->D(Ljava/lang/String;)V

    .line 142
    :cond_3a
    :goto_12
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getDebitBankName()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3b

    .line 144
    iget-object v1, v0, Lyf0;->v:Landroid/widget/TextView;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_13

    .line 145
    :cond_3b
    iget-object v2, v0, Lyf0;->v:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    :goto_13
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneficiaryName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3c

    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_14

    :cond_3c
    iget-object v1, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneficiaryName()Ljava/lang/String;

    move-result-object v1

    .line 147
    :goto_14
    iget-object v2, v0, Lyf0;->K:Landroid/widget/TextView;

    invoke-static {v1}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v1, v0, Lyf0;->L:Landroid/widget/TextView;

    invoke-virtual {v14}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    :goto_15
    iget-object v1, v0, Lyf0;->A:Landroid/widget/TextView;

    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public H(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f12047c

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f12050a

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const v2, 0x7f1201f1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lyf0$a;

    invoke-direct {v3, p0}, Lyf0$a;-><init>(Lyf0;)V

    invoke-static {v0, v1, p1, v2, v3}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public I()V
    .locals 17
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NonConstantResourceId"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Landroid/app/Dialog;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    const v3, 0x7f130246

    invoke-direct {v1, v2, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v1, v0, Lyf0;->t0:Landroid/app/Dialog;

    .line 2
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/Window;->requestFeature(I)Z

    .line 3
    iget-object v1, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v3, 0x7f0d0057

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    iget-object v1, v0, Lyf0;->t0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-virtual {v1, v3, v4}, Landroid/view/Window;->setLayout(II)V

    .line 5
    iget-object v1, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v3, 0x7f0a016f

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 6
    iget-object v3, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v4, 0x7f0a00eb

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 7
    iget-object v4, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v5, 0x7f0a0102

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 8
    iget-object v5, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v6, 0x7f0a04ef

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 9
    iget-object v6, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v7, 0x7f0a04ee

    invoke-virtual {v6, v7}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 10
    iget-object v7, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v8, 0x7f0a04f0

    invoke-virtual {v7, v8}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 11
    iget-object v8, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v9, 0x7f0a04d7

    invoke-virtual {v8, v9}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 12
    iget-object v9, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v10, 0x7f0a03b2

    invoke-virtual {v9, v10}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/RadioGroup;

    .line 13
    iget-object v10, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v11, 0x7f0a0207

    invoke-virtual {v10, v11}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/RadioButton;

    .line 14
    iget-object v11, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v12, 0x7f0a014d

    invoke-virtual {v11, v12}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/RadioButton;

    .line 15
    iget-object v12, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v13, 0x7f0a0040

    invoke-virtual {v12, v13}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/RadioButton;

    .line 16
    iget-object v13, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v14, 0x7f0a0191

    invoke-virtual {v13, v14}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/RadioButton;

    .line 17
    iget-object v14, v0, Lyf0;->t0:Landroid/app/Dialog;

    const v15, 0x7f0a03b4

    invoke-virtual {v14, v15}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/LinearLayout;

    .line 18
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 19
    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionDate()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v15

    const v15, 0x379

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 20
    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionDate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionDate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v2, v0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v2, v2, Lcom/olive/upi/transport/model/Udir;->reasons:Ljava/util/List;

    if-eqz v2, :cond_0

    move-object v15, v2

    goto :goto_0

    :cond_0
    move-object/from16 v15, v16

    .line 25
    :goto_0
    iget-object v2, v0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    const v5, 0x37a

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget v2, v0, Lyf0;->s0:I

    const/16 v5, 0xa

    if-ne v2, v5, :cond_1

    const/4 v2, 0x0

    .line 27
    invoke-virtual {v14, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    if-eqz v15, :cond_2

    .line 28
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x4

    if-lt v5, v6, :cond_2

    .line 29
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/UdirReasons;

    iget-object v2, v2, Lcom/olive/upi/transport/model/UdirReasons;->reason:Ljava/lang/String;

    invoke-virtual {v10, v2}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x1

    .line 30
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/olive/upi/transport/model/UdirReasons;

    iget-object v2, v5, Lcom/olive/upi/transport/model/UdirReasons;->reason:Ljava/lang/String;

    invoke-virtual {v11, v2}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x2

    .line 31
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/UdirReasons;

    iget-object v2, v2, Lcom/olive/upi/transport/model/UdirReasons;->reason:Ljava/lang/String;

    invoke-virtual {v12, v2}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x3

    .line 32
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/UdirReasons;

    iget-object v2, v2, Lcom/olive/upi/transport/model/UdirReasons;->reason:Ljava/lang/String;

    invoke-virtual {v13, v2}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    .line 33
    invoke-virtual {v14, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 34
    :cond_2
    :goto_1
    iget-object v2, v0, Lyf0;->t0:Landroid/app/Dialog;

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 35
    iget-object v2, v0, Lyf0;->t0:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 36
    new-instance v2, Lyf0$b;

    invoke-direct {v2, v0}, Lyf0$b;-><init>(Lyf0;)V

    invoke-virtual {v3, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    new-instance v2, Lyf0$c;

    invoke-direct {v2, v0, v9, v15}, Lyf0$c;-><init>(Lyf0;Landroid/widget/RadioGroup;Ljava/util/List;)V

    invoke-virtual {v4, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    new-instance v2, Lyf0$d;

    invoke-direct {v2, v0}, Lyf0$d;-><init>(Lyf0;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/olive/upi/transport/model/Udir;->isChkTxnInitiated:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lyf0;->p0:Landroid/widget/RelativeLayout;

    const v1, 0x7f080083

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 3
    iget-object v0, p0, Lyf0;->m0:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060049

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lyf0;->p0:Landroid/widget/RelativeLayout;

    const v1, 0x7f080084

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 5
    iget-object v0, p0, Lyf0;->m0:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060193

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method

.method public final K()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    if-eqz v0, :cond_2

    .line 2
    iget-boolean v1, v0, Lcom/olive/upi/transport/model/Udir;->isChkTxnInitiated:Z

    const v2, 0x7f060049

    const v3, 0x7f080083

    if-nez v1, :cond_0

    iget-boolean v1, v0, Lcom/olive/upi/transport/model/Udir;->isComplaintRaised:Z

    if-nez v1, :cond_0

    .line 3
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 4
    iget-object v0, p0, Lyf0;->n0:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lyf0;->o0:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_0
    iget-boolean v0, v0, Lcom/olive/upi/transport/model/Udir;->isComplaintRaised:Z

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 9
    iget-object v0, p0, Lyf0;->n0:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lyf0;->o0:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    const v1, 0x7f1200f9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 13
    :cond_1
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    const v1, 0x7f080084

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 14
    iget-object v0, p0, Lyf0;->n0:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060193

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final L(Lcom/olive/upi/transport/model/TranHistory;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getRefid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 2
    :cond_1
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x37b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto/16 :goto_0

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x37c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 6
    :cond_3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x37d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 7
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 8
    :cond_4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x37e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 9
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 10
    :cond_5
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x37f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 11
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 12
    :cond_6
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x380

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 13
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    goto :goto_0

    .line 14
    :cond_7
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v0

    const v1, 0x381

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 15
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 16
    :cond_8
    :goto_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getUdir()Lcom/olive/upi/transport/model/Udir;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 17
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setUdir(Lcom/olive/upi/transport/model/Udir;)V

    .line 18
    :cond_9
    iget-object p1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p1

    iput p1, p0, Lyf0;->s0:I

    :cond_a
    :goto_1
    return-void
.end method

.method public final M()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getUdir()Lcom/olive/upi/transport/model/Udir;

    move-result-object v0

    iput-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    if-eqz v0, :cond_6

    .line 2
    iget-boolean v0, v0, Lcom/olive/upi/transport/model/Udir;->isChkTxnInitiated:Z

    if-eqz v0, :cond_6

    .line 3
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lyf0;->o0:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    const v2, 0x382

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v3, 0x8

    const v4, 0x383

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f1204a8

    if-eqz v0, :cond_1

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 7
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v6, 0x384

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v0, :cond_2

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    const v1, 0x7f12049c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    const v1, 0x7f120490

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 14
    :cond_3
    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnInitiated:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtDebited:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->amtCredit:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iget-object v0, v0, Lcom/olive/upi/transport/model/Udir;->txnComplete:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 16
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 17
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 18
    :cond_4
    iget-object v0, p0, Lyf0;->q0:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 19
    :cond_5
    iget-object v0, p0, Lyf0;->l0:Landroid/widget/TextView;

    const v1, 0x385

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/16 v0, 0x18

    const/4 v1, 0x0

    const/4 v2, 0x0

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 2
    :sswitch_0
    iget-object p1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne p1, v0, :cond_0

    .line 3
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 4
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-static {v0}, Ljg0;->r(Lcom/olive/upi/transport/model/TransactionData;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x386

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lyf0;->m:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lyf0;->G:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 7
    iget-object p1, p0, Lyf0;->r:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    goto/16 :goto_0

    .line 8
    :sswitch_1
    iget-object p1, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    if-eqz p1, :cond_3

    iget-boolean v0, p1, Lcom/olive/upi/transport/model/Udir;->isComplaintRaised:Z

    if-nez v0, :cond_3

    iget-boolean p1, p1, Lcom/olive/upi/transport/model/Udir;->isChkTxnInitiated:Z

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {p0}, Lyf0;->I()V

    goto/16 :goto_0

    .line 10
    :sswitch_2
    iget-object p1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRefUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 12
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lna0;->e(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x45

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 14
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x387

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 15
    :sswitch_3
    iget-object p1, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    if-eqz p1, :cond_3

    iget-boolean p1, p1, Lcom/olive/upi/transport/model/Udir;->isChkTxnInitiated:Z

    if-nez p1, :cond_3

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 17
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x5f

    iget-object v3, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v1, v0, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 18
    :sswitch_4
    iget-object p1, p0, Lyf0;->G:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lyf0;->G:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    .line 19
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 20
    new-instance p1, Lcom/olive/upi/transport/model/TranHistory;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/TranHistory;-><init>()V

    .line 21
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TranHistory;->setAmount(Ljava/lang/String;)V

    .line 22
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TranHistory;->setTranid(Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TranHistory;->setRefid(Ljava/lang/String;)V

    .line 24
    iget-object v1, p0, Lyf0;->G:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TranHistory;->setQuery(Ljava/lang/String;)V

    .line 25
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x21

    invoke-direct {v2, v0, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 26
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f1201a3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Leg0;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 27
    :sswitch_5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    :cond_3
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a00f0 -> :sswitch_5
        0x7f0a00f7 -> :sswitch_4
        0x7f0a0117 -> :sswitch_3
        0x7f0a024d -> :sswitch_2
        0x7f0a03b7 -> :sswitch_1
        0x7f0a04c8 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00b5

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lyf0;->p:Landroid/view/View;

    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/String;

    const p2, 0x7f1204b1

    .line 2
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, p1, v0

    const p2, 0x7f120134

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    const p2, 0x7f1204b2

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    aput-object p2, p1, p3

    const p2, 0x7f1200fa

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x3

    aput-object p2, p1, p3

    .line 3
    invoke-virtual {p0}, Lyf0;->B()V

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    iput-object p2, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p2

    iput p2, p0, Lyf0;->s0:I

    .line 6
    iget-object p2, p0, Lyf0;->T:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-virtual {p2, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lyf0;->z()V

    .line 8
    iget-object p1, p0, Lyf0;->p:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x21

    if-eq p1, v0, :cond_2

    const/16 v0, 0x5f

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x60

    if-eq p1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p2, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p2, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f12005c

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    const v1, 0x7f12037e

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, Leg0;->t(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_3
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f1204a5

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x21

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_3

    const/16 v1, 0x5f

    if-eq v0, v1, :cond_1

    const/16 v1, 0x60

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_4

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    iget-object p1, p2, Lcom/olive/upi/transport/api/Result;->data:Ljava/lang/Object;

    check-cast p1, Lcom/olive/upi/transport/model/ComplaintResponse;

    .line 6
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/ComplaintResponse;->getCrn()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 7
    iget-object p2, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    iput-boolean v3, p2, Lcom/olive/upi/transport/model/Udir;->isComplaintRaised:Z

    .line 8
    iget-object p2, p0, Lyf0;->o0:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x388

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/ComplaintResponse;->getCrn()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-virtual {p0}, Lyf0;->z()V

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 11
    iget-object p1, p2, Lcom/olive/upi/transport/api/Result;->data:Ljava/lang/Object;

    check-cast p1, Lcom/olive/upi/transport/model/TranHistory;

    if-eqz p1, :cond_4

    .line 12
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x12d

    invoke-interface {p2, v0, v2}, Lmg0;->o(ILjava/lang/Object;)V

    .line 13
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TranHistory;->getUdir()Lcom/olive/upi/transport/model/Udir;

    move-result-object p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lyf0;->S:Lcom/olive/upi/transport/model/Udir;

    if-eqz p2, :cond_2

    .line 14
    iput-boolean v3, p2, Lcom/olive/upi/transport/model/Udir;->isChkTxnInitiated:Z

    .line 15
    iget-object v0, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/TransactionData;->setUdir(Lcom/olive/upi/transport/model/Udir;)V

    .line 16
    :cond_2
    invoke-virtual {p0, p1}, Lyf0;->L(Lcom/olive/upi/transport/model/TranHistory;)V

    .line 17
    invoke-virtual {p0}, Lyf0;->z()V

    goto :goto_0

    .line 18
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 19
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    const/4 v0, 0x0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x18

    const/16 v5, 0x22

    invoke-direct {v1, v4, v5, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {p1, v0, v1}, Lua0;->g(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lyf0;->H(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public y()V
    .locals 5

    .line 1
    iget-object v1, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getCuurentTime()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 2
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    const v0, 0x389

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lyf0;->F:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getCuurentTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 3
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-static {v1, v2}, Ljg0;->z(Ljava/util/Date;Ljava/util/Date;)J

    move-result-wide v1

    const-wide/16 v3, 0x3

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    .line 4
    iget-object v1, p0, Lyf0;->R:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    invoke-virtual {p0}, Lyf0;->J()V

    .line 6
    invoke-virtual {p0}, Lyf0;->M()V

    .line 7
    invoke-virtual {p0}, Lyf0;->K()V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lyf0;->R:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 9
    invoke-virtual {v1}, Ljava/text/ParseException;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final z()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyf0;->A()V

    .line 2
    invoke-virtual {p0}, Lyf0;->C()V

    .line 3
    invoke-virtual {p0}, Lyf0;->G()V

    .line 4
    invoke-virtual {p0}, Lyf0;->E()V

    .line 5
    invoke-virtual {p0}, Lyf0;->F()V

    return-void
.end method
