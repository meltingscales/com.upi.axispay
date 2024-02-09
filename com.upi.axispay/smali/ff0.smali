.class public Lff0;
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

.field public F:Landroid/widget/TextView;

.field public G:Landroid/widget/TextView;

.field public H:Landroid/widget/ImageView;

.field public I:Landroid/text/Spannable;

.field public J:I

.field public K:I

.field public L:Ljava/lang/String;

.field public l:Landroid/view/View;

.field public m:Landroid/widget/LinearLayout;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Lcom/olive/upi/transport/model/TransactionData;

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


# virtual methods
.method public final A()V
    .locals 5

    .line 1
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->BILLPAY_UPIID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1821

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 5
    array-length v1, v0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_3

    const/4 v1, 0x0

    .line 6
    aget-object v3, v0, v1

    const v4, 0x1822

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    aget-object v1, v0, v1

    const v3, 0x1823

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    .line 8
    aget-object v3, v0, v1

    const v4, 0x1824

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    aget-object v1, v0, v1

    const v3, 0x1825

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 10
    :cond_2
    :goto_0
    iget-object v1, p0, Lff0;->m:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11
    iget-object v1, p0, Lff0;->x:Landroid/widget/TextView;

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p0, Lff0;->y:Landroid/widget/TextView;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method public final B()V
    .locals 13

    .line 1
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_RECEIVE:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a01d1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lff0;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lff0;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getExpiry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    :goto_1
    iget-object v0, p0, Lff0;->p:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x1826

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lff0;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1827

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x1828

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_3

    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 8
    :cond_2
    iget-object v0, p0, Lff0;->q:Landroid/widget/TextView;

    iget-object v3, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 9
    :cond_3
    :goto_2
    iget-object v0, p0, Lff0;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    :goto_3
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getDescription()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    .line 11
    :cond_4
    iget-object v0, p0, Lff0;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 12
    :cond_5
    :goto_4
    iget-object v0, p0, Lff0;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    :goto_5
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    const/4 v1, 0x7

    const/4 v2, 0x6

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/16 v6, 0xa

    const/4 v7, 0x1

    if-ne v0, v6, :cond_6

    .line 14
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    const v8, 0x7f1204a7

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(I)V

    .line 15
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    const v8, 0x7f08027e

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 16
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    const v9, 0x7f06018a

    invoke-static {v8, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_6

    .line 17
    :cond_6
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    const v8, 0x7f080296

    if-ne v0, v7, :cond_7

    .line 18
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    const v9, 0x7f120498

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(I)V

    .line 19
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    const v9, 0x7f060162

    invoke-static {v8, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_6

    .line 21
    :cond_7
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    const/4 v9, 0x2

    const v10, 0x7f060184

    const v11, 0x7f080299

    const v12, 0x7f120344

    if-ne v0, v9, :cond_8

    .line 22
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(I)V

    .line 23
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v11}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 24
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    invoke-static {v8, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_6

    .line 25
    :cond_8
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v5, :cond_9

    .line 26
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(I)V

    .line 27
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v11}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 28
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    invoke-static {v8, v10}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_6

    .line 29
    :cond_9
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    const v9, 0x7f060032

    if-ne v0, v4, :cond_a

    .line 30
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    const v8, 0x7f1201b5

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(I)V

    .line 31
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    const v8, 0x7f080298

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 32
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    invoke-static {v8, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_6

    .line 33
    :cond_a
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v3, :cond_b

    .line 34
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    const v10, 0x7f1204a3

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(I)V

    .line 35
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    invoke-static {v8, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_6

    .line 37
    :cond_b
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v2, :cond_c

    .line 38
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    const v8, 0x7f1200b5

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(I)V

    .line 39
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    const v8, 0x7f080297

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 40
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    invoke-static {v8, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_6

    .line 41
    :cond_c
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v1, :cond_d

    .line 42
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    const v8, 0x7f1204bd

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(I)V

    .line 43
    iget-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    const v8, 0x7f080080

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 44
    iget-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v8

    invoke-static {v8, v9}, Lt8;->d(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 45
    :cond_d
    :goto_6
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQueryCloserComment()Ljava/lang/String;

    move-result-object v0

    const v8, 0x1829

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v0, :cond_f

    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQueryCloserComment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_7

    .line 46
    :cond_e
    iget-object v0, p0, Lff0;->F:Landroid/widget/TextView;

    iget-object v9, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v9}, Lcom/olive/upi/transport/model/TransactionData;->getQueryCloserComment()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 47
    :cond_f
    :goto_7
    iget-object v0, p0, Lff0;->F:Landroid/widget/TextView;

    const v9, 0x7f1201fc

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(I)V

    .line 48
    :goto_8
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getExpirydateTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v9, 0x182a

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-eqz v0, :cond_10

    .line 49
    iget-object v0, p0, Lff0;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 50
    :cond_10
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getExpirydateTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 51
    iget-object v0, p0, Lff0;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_9

    .line 52
    :cond_11
    iget-object v0, p0, Lff0;->E:Landroid/widget/TextView;

    iget-object v8, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getExpirydateTime()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    :goto_9
    iget-object v0, p0, Lff0;->G:Landroid/widget/TextView;

    iget-object v8, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getQueryComment()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object v0, p0, Lff0;->A:Landroid/widget/TextView;

    iget-object v8, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getQueryid()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object v0, p0, Lff0;->C:Landroid/widget/TextView;

    iget-object v8, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getQueryStatus()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v0, p0, Lff0;->D:Landroid/widget/TextView;

    iget-object v8, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getQuerydate()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 58
    iget-object v8, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v8

    .line 59
    iget-object v9, p0, Lff0;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljg0;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    iget-object v9, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v9}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v9

    sget v10, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    const v11, 0x7f1204ff

    const/4 v12, 0x0

    if-ne v9, v10, :cond_19

    .line 61
    iget-object v9, p0, Lff0;->w:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v7, :cond_12

    const v0, 0x7f120073

    new-array v1, v7, [Ljava/lang/Object;

    .line 63
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto/16 :goto_a

    .line 64
    :cond_12
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v5, :cond_13

    const v0, 0x7f120077

    new-array v1, v7, [Ljava/lang/Object;

    .line 65
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto/16 :goto_a

    .line 66
    :cond_13
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v1, :cond_14

    const v0, 0x7f120082

    new-array v1, v7, [Ljava/lang/Object;

    .line 67
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_a

    .line 68
    :cond_14
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v4, :cond_15

    const v0, 0x7f120072

    new-array v1, v7, [Ljava/lang/Object;

    .line 69
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_a

    .line 70
    :cond_15
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v6, :cond_16

    const v0, 0x7f120080

    new-array v1, v7, [Ljava/lang/Object;

    .line 71
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_a

    .line 72
    :cond_16
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v3, :cond_17

    const v0, 0x7f120071

    new-array v1, v7, [Ljava/lang/Object;

    .line 73
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_a

    .line 74
    :cond_17
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v2, :cond_18

    const v0, 0x7f12006f

    new-array v1, v7, [Ljava/lang/Object;

    .line 75
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    .line 76
    :cond_18
    :goto_a
    iget-object v0, p0, Lff0;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(I)V

    .line 77
    iget-object v0, p0, Lff0;->x:Landroid/widget/TextView;

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqa0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    iget-object v0, p0, Lff0;->y:Landroid/widget/TextView;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_b

    .line 79
    :cond_19
    iget-object v1, p0, Lff0;->w:Landroid/widget/TextView;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v1, p0, Lff0;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setText(I)V

    .line 81
    iget-object v1, p0, Lff0;->x:Landroid/widget/TextView;

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v8

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lqa0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v1, p0, Lff0;->y:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v7, :cond_1a

    const v0, 0x7f12007d

    new-array v1, v7, [Ljava/lang/Object;

    .line 84
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto/16 :goto_b

    .line 85
    :cond_1a
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v5, :cond_1b

    const v0, 0x7f12007f

    new-array v1, v7, [Ljava/lang/Object;

    .line 86
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_b

    .line 87
    :cond_1b
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v4, :cond_1c

    const v0, 0x7f12007c

    new-array v1, v7, [Ljava/lang/Object;

    .line 88
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_b

    .line 89
    :cond_1c
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v6, :cond_1d

    const v0, 0x7f12007e

    new-array v1, v7, [Ljava/lang/Object;

    .line 90
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_b

    .line 91
    :cond_1d
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v3, :cond_1e

    const v0, 0x7f12007b

    new-array v1, v7, [Ljava/lang/Object;

    .line 92
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    goto :goto_b

    .line 93
    :cond_1e
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result v0

    if-ne v0, v2, :cond_1f

    const v0, 0x7f12007a

    new-array v1, v7, [Ljava/lang/Object;

    .line 94
    iget-object v2, p0, Lff0;->L:Ljava/lang/String;

    aput-object v2, v1, v12

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lff0;->z(Ljava/lang/String;)V

    .line 95
    :cond_1f
    :goto_b
    iget-object v0, p0, Lff0;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public C()V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d0059

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 4
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    const v2, 0x7f0a0499

    .line 5
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a00e4

    .line 6
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 7
    iget-object v3, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    new-instance v2, Lff0$a;

    invoke-direct {v2, p0, v0}, Lff0$a;-><init>(Lff0;Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 10
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00a5

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lff0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lff0;->y()V

    .line 3
    invoke-virtual {p0}, Lff0;->B()V

    .line 4
    invoke-virtual {p0}, Lff0;->A()V

    .line 5
    iget-object p1, p0, Lff0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    .line 3
    invoke-static {}, Leg0;->B()V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f120381

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x46

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p2

    const/16 v0, 0x21

    if-eq p2, v0, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_1

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p0}, Lff0;->C()V

    :cond_1
    :goto_0
    return-void
.end method

.method public x(Lcom/olive/upi/transport/model/TransactionData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    return-void
.end method

.method public y()V
    .locals 4

    .line 1
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a0284

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 2
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a04e2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->n:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a04a0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->o:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v2, 0x7f0a048a

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->p:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04f1

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->q:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04c2

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->r:Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04dd

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->s:Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04d5

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->t:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04db

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->v:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04dc

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->w:Landroid/widget/TextView;

    .line 11
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04cf

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->x:Landroid/widget/TextView;

    .line 12
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04d0

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->y:Landroid/widget/TextView;

    .line 13
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a03c7

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lff0;->m:Landroid/widget/LinearLayout;

    .line 14
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04ca

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->A:Landroid/widget/TextView;

    .line 15
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04cb

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->C:Landroid/widget/TextView;

    .line 16
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v3, 0x7f0a04c9

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->D:Landroid/widget/TextView;

    .line 17
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->E:Landroid/widget/TextView;

    .line 18
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a0490

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->F:Landroid/widget/TextView;

    .line 19
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a04cc

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->G:Landroid/widget/TextView;

    .line 20
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a0498

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->z:Landroid/widget/TextView;

    .line 21
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a0237

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lff0;->H:Landroid/widget/ImageView;

    .line 22
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->p:Landroid/widget/TextView;

    .line 23
    iget-object v0, p0, Lff0;->l:Landroid/view/View;

    const v1, 0x7f0a048b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lff0;->B:Landroid/widget/TextView;

    .line 24
    iget-object v0, p0, Lff0;->u:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljg0;->a(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lff0;->L:Ljava/lang/String;

    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lff0;->L:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lff0;->J:I

    .line 2
    iget-object v1, p0, Lff0;->L:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lff0;->K:I

    .line 3
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lff0;->I:Landroid/text/Spannable;

    .line 4
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f060048

    invoke-static {v1, v2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {p1, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget v1, p0, Lff0;->J:I

    iget v2, p0, Lff0;->K:I

    const/16 v3, 0x21

    invoke-interface {v0, p1, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 5
    iget-object p1, p0, Lff0;->I:Landroid/text/Spannable;

    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget v1, p0, Lff0;->J:I

    iget v2, p0, Lff0;->K:I

    invoke-interface {p1, v0, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 6
    iget-object p1, p0, Lff0;->I:Landroid/text/Spannable;

    new-instance v0, Landroid/text/style/RelativeSizeSpan;

    const v1, 0x3f99999a    # 1.2f

    invoke-direct {v0, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    iget v1, p0, Lff0;->J:I

    iget v2, p0, Lff0;->K:I

    invoke-interface {p1, v0, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 7
    iget-object p1, p0, Lff0;->B:Landroid/widget/TextView;

    iget-object v0, p0, Lff0;->I:Landroid/text/Spannable;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
