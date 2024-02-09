.class public Lof0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# static fields
.field public static G:Lcom/olive/upi/transport/model/Account;


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Ljava/lang/String;

.field public C:Landroid/widget/LinearLayout;

.field public D:Landroid/widget/Spinner;

.field public E:Lla0;

.field public F:Lcom/olive/upi/transport/model/Account;

.field public l:Lcom/olive/upi/transport/model/TransactionData;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:Lcom/olive/upi/transport/model/BeneVpa;

.field public r:Landroid/widget/CheckBox;

.field public s:Landroid/view/View;

.field public t:Landroid/widget/LinearLayout;

.field public u:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public v:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public w:Landroid/widget/EditText;

.field public x:Lcom/google/android/material/textfield/TextInputLayout;

.field public y:Landroid/widget/Button;

.field public z:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0x315c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lof0;->m:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lof0;->n:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lof0;->o:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v0, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Account;-><init>()V

    iput-object v0, p0, Lof0;->F:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public static synthetic A(Lof0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lof0;->I()V

    return-void
.end method

.method public static synthetic B(Lof0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lof0;->H()V

    return-void
.end method

.method public static G(Lcom/olive/upi/transport/model/Account;)Lof0;
    .locals 0

    .line 1
    sput-object p0, Lof0;->G:Lcom/olive/upi/transport/model/Account;

    .line 2
    new-instance p0, Lof0;

    invoke-direct {p0}, Lof0;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Lof0;)Lcom/upi/axispay/custom/FloatingInputLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    return-object p0
.end method

.method public static synthetic y(Lof0;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lof0;->y:Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic z(Lof0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lof0;->J()V

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1
    new-instance v6, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f130246

    invoke-direct {v6, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {v6}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x7f0d0050

    .line 3
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    invoke-virtual {v6}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    const v0, 0x7f0a03b5

    .line 5
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/RadioGroup;

    const v0, 0x7f0a00d4

    .line 6
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/Button;

    const v0, 0x7f0a00d5

    .line 7
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/Button;

    const v0, 0x7f0a0107

    .line 8
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    .line 9
    new-instance v11, Lof0$q;

    move-object v0, v11

    move-object v1, p0

    move-object v2, v6

    move-object v3, v7

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lof0$q;-><init>(Lof0;Landroid/app/Dialog;Landroid/widget/RadioGroup;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    new-instance v8, Lof0$r;

    move-object v0, v8

    invoke-direct/range {v0 .. v5}, Lof0$r;-><init>(Lof0;Landroid/app/Dialog;Landroid/widget/RadioGroup;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    new-instance p1, Lof0$s;

    invoke-direct {p1, p0, v6}, Lof0$s;-><init>(Lof0;Landroid/app/Dialog;)V

    invoke-virtual {v10, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x0

    .line 12
    invoke-virtual {v6, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 13
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public D()V
    .locals 8

    .line 1
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 3
    :cond_0
    iget-object v3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_5

    iget-object v3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 4
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v3, v6, v1

    if-eqz v3, :cond_5

    iget-object v3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 5
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v3, v6, v1

    if-nez v3, :cond_1

    goto/16 :goto_1

    .line 6
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v3, v6, v1

    if-nez v3, :cond_2

    .line 7
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v3, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 9
    :goto_0
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v0, v6, v1

    if-ltz v0, :cond_3

    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v0, v6, v1

    if-nez v0, :cond_3

    .line 10
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setEnabled(Z)V

    goto :goto_2

    .line 11
    :cond_3
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-nez v0, :cond_4

    .line 12
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setEnabled(Z)V

    goto :goto_2

    .line 13
    :cond_4
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setEnabled(Z)V

    goto :goto_2

    .line 14
    :cond_5
    :goto_1
    iget-object v3, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 15
    iget-object v3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v3, v6, v1

    if-eqz v3, :cond_7

    .line 16
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v1, v6, v1

    if-nez v1, :cond_6

    .line 17
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto :goto_2

    .line 18
    :cond_6
    iget-object v1, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 19
    :cond_7
    :goto_2
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 20
    iget-object v0, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setEnabled(Z)V

    goto :goto_3

    .line 21
    :cond_8
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-ne v0, v1, :cond_a

    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    const v1, 0x315d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 22
    iget-object v0, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 23
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    const v2, 0x315e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 25
    iget-object v0, p0, Lof0;->w:Landroid/widget/EditText;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 26
    :cond_9
    iget-object v1, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 27
    :cond_a
    iget-object v0, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 28
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 29
    iget-object v0, p0, Lof0;->w:Landroid/widget/EditText;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 30
    :cond_b
    iget-object v0, p0, Lof0;->w:Landroid/widget/EditText;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    return-void
.end method

.method public final E()V
    .locals 5

    .line 1
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f1203c6

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lof0$h;

    invoke-direct {v2, p0}, Lof0$h;-><init>(Lof0;)V

    invoke-static {v0, v1, v2}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x9

    const/16 v2, 0x1fe

    iget-object v3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v1, 0x6

    .line 4
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 5
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public final F()V
    .locals 11

    .line 1
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lof0;->E()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x5

    const/16 v3, 0x1fe

    const/16 v4, 0x9

    if-ne v0, v1, :cond_1

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 6
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0, v4, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 7
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 8
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const v1, 0x315f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v5, 0x0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setEnTips(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTipAmount(Ljava/lang/Double;)V

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 13
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTipAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    add-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 14
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0, v4, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 15
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 16
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 17
    :cond_2
    iget-object v0, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v9, 0x0

    .line 19
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v0, v9

    const v9, 0x3160

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    cmpl-double v0, v7, v5

    if-ltz v0, :cond_3

    const-wide v5, 0x40f86a0000000000L    # 100000.0

    cmpg-double v0, v7, v5

    if-gez v0, :cond_3

    .line 20
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setEnTips(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    iget-object v1, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTipAmount(Ljava/lang/Double;)V

    .line 22
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTipAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    add-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 23
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 24
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0, v4, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 25
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 26
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 27
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const v1, 0x3161

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final H()V
    .locals 6

    .line 1
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 3
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lof0;->M()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lxc0;->c:Lz;

    const v2, 0x3162

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    .line 7
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120427

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 10
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqa0;->P(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f1204ec

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 12
    :cond_3
    invoke-virtual {p0}, Lof0;->M()Z

    move-result v0

    if-nez v0, :cond_4

    return-void

    .line 13
    :cond_4
    iget-object v0, p0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 14
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 15
    iget-object v2, p0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 16
    iget-object v2, p0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 17
    iget-object v2, p0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    const v2, 0x3163

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v2

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x9

    const/16 v5, 0x11

    invoke-direct {v3, v4, v5, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 20
    :cond_5
    iget-object v0, p0, Lof0;->z:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 21
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 22
    iget-object v0, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 23
    iget-object v0, p0, Lof0;->D:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 24
    iget-object v0, p0, Lof0;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 25
    iget-object v0, p0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    return-void

    .line 26
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final I()V
    .locals 3

    .line 1
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v0, v1, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 3
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-static {v1}, Ljg0;->r(Lcom/olive/upi/transport/model/TransactionData;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3164

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 6
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x3165

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ln70;->v(Ljava/lang/String;I)V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final J()V
    .locals 2

    .line 1
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f130246

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/Window;->requestFeature(I)Z

    const v1, 0x7f0d0052

    .line 4
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-virtual {v1, v3, v4}, Landroid/view/Window;->setLayout(II)V

    const v1, 0x7f0a00ec

    .line 6
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v3, 0x7f0a016f

    .line 7
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0a0172

    .line 8
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v4, 0x7f0a0173

    .line 9
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 10
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 12
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 13
    new-instance p1, Lof0$i;

    invoke-direct {p1, p0, v0}, Lof0$i;-><init>(Lof0;Landroid/app/Dialog;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    new-instance p1, Lof0$j;

    invoke-direct {p1, p0, v0}, Lof0$j;-><init>(Lof0;Landroid/app/Dialog;)V

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final L(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lof0;->E:Lla0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lla0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lla0;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lof0;->E:Lla0;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lla0;->c(Ljava/util/ArrayList;)V

    .line 4
    :goto_0
    iget-object p1, p0, Lof0;->D:Landroid/widget/Spinner;

    iget-object v0, p0, Lof0;->E:Lla0;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public final M()Z
    .locals 14

    .line 1
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v1

    const-wide/16 v2, 0x0

    .line 2
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    .line 3
    :try_start_0
    iget-object v5, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v5}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v5, v4

    .line 4
    :goto_0
    :try_start_1
    iget-object v6, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v6}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 5
    :catch_1
    iget-object v6, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v6}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const v7, 0x7f120085

    const v8, 0x7f12017f

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    const/4 v11, 0x0

    if-nez v6, :cond_1

    .line 6
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    cmpl-double v6, v12, v2

    if-nez v6, :cond_0

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v11

    .line 8
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    cmpg-double v4, v12, v9

    if-gez v4, :cond_1

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v11

    .line 10
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    cmpl-double v4, v12, v2

    if-nez v4, :cond_2

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v11

    .line 12
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    cmpg-double v4, v12, v9

    if-gez v4, :cond_3

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v11

    .line 14
    :cond_3
    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v4

    sget v6, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    if-eq v4, v6, :cond_4

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 15
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v4

    sget v6, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-eq v4, v6, :cond_4

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 16
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v4

    sget v6, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-eq v4, v6, :cond_4

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 17
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v4

    sget v6, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    if-eq v4, v6, :cond_4

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 18
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v4

    sget v6, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v4, v6, :cond_7

    .line 19
    :cond_4
    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 20
    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v4, v6, v2

    if-lez v4, :cond_6

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v4, v6, v2

    if-lez v4, :cond_6

    .line 21
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Double;->compare(DD)I

    move-result v4

    const v0, 0x3166

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-gez v4, :cond_5

    .line 22
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0x3167

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0x3168

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v11

    .line 23
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Double;->compare(DD)I

    move-result v4

    if-lez v4, :cond_6

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0x3169

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v11

    .line 25
    :cond_6
    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v4, v6, v2

    if-nez v4, :cond_7

    iget-object v4, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v2, v6, v2

    if-lez v2, :cond_7

    .line 26
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-gez v1, :cond_7

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x316a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v11

    .line 28
    :cond_7
    iget-object v1, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 29
    iget-object v1, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lof0;->B:Ljava/lang/String;

    .line 30
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setEditedRemarks(Ljava/lang/String;)V

    goto :goto_1

    .line 31
    :cond_8
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    const v2, 0x7f120140

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setEditedRemarks(Ljava/lang/String;)V

    .line 32
    :goto_1
    iget-object v1, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    .line 33
    :try_start_2
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    .line 34
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->isFromIntent()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 35
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const v0, 0x316b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_9

    :try_start_3
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    move-result-object v2

    const v0, 0x316c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 36
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 37
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v2, v4, v6

    if-lez v2, :cond_c

    .line 38
    iget-object v1, p0, Lxc0;->c:Lz;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0x316d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lof0$o;

    invoke-direct {v3, p0}, Lof0$o;-><init>(Lof0;)V

    invoke-static {v1, v2, v3}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return v11

    .line 39
    :cond_9
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getIsVerified()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getIsVerified()Ljava/lang/String;

    move-result-object v2

    const v0, 0x316e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_a
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getIsVerified()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_c

    .line 40
    :cond_b
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 41
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v2, v4, v6

    if-lez v2, :cond_c

    .line 42
    iget-object v1, p0, Lxc0;->c:Lz;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0x316f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lof0$p;

    invoke-direct {v3, p0}, Lof0$p;-><init>(Lof0;)V

    invoke-static {v1, v2, v3}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return v11

    .line 43
    :cond_c
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setEditedAmount(Ljava/lang/Double;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 44
    :catch_2
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const v0, 0x3170

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 45
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 46
    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setCuurentTime(Ljava/lang/String;)V

    .line 47
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, v2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    const/4 v1, 0x1

    return v1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 2
    :sswitch_0
    iget-object p1, p0, Lof0;->D:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->performClick()Z

    goto/16 :goto_0

    .line 3
    :sswitch_1
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x45

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    .line 4
    :sswitch_2
    invoke-virtual {p0}, Lof0;->H()V

    goto/16 :goto_0

    .line 5
    :sswitch_3
    new-instance p1, Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PendingReqVo;-><init>()V

    .line 6
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PendingReqVo;->setAmount(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PendingReqVo;->setPayeevpa(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PendingReqVo;->setTxnid(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PendingReqVo;->setPayerVpa(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PendingReqVo;->setRefid(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PendingReqVo;->setNotes(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v0, 0x7f120136

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f120493

    .line 13
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lof0$m;

    invoke-direct {v5, p0, p1}, Lof0$m;-><init>(Lof0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    const v0, 0x7f120138

    .line 15
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lof0$n;

    invoke-direct {v7, p0, p1}, Lof0$n;-><init>(Lof0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    .line 16
    invoke-static/range {v1 .. v7}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 17
    :sswitch_4
    new-instance p1, Lcom/olive/upi/transport/model/LimitCheckReq;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/LimitCheckReq;-><init>()V

    .line 18
    sget-object v0, Lof0;->G:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 19
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 20
    new-instance v0, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 21
    iget-object v1, p0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 22
    iget-object v1, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 23
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/LimitCheckReq;->setPayees(Ljava/util/List;)V

    .line 26
    iget-object v0, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setAmount(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x9

    const/16 v3, 0x62

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/OliveUpiManager;->verifyLimit(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 28
    :sswitch_5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lqa0;->P(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 29
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f1204cf

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 30
    :cond_0
    invoke-virtual {p0}, Lof0;->H()V

    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a00d1 -> :sswitch_5
        0x7f0a00da -> :sswitch_4
        0x7f0a00dd -> :sswitch_3
        0x7f0a00ef -> :sswitch_2
        0x7f0a024d -> :sswitch_1
        0x7f0a0560 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x9

    const/16 v1, 0xa

    if-eq p1, v1, :cond_1

    const/16 v1, 0x18

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const p3, 0x7f0d010f

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lof0;->s:Landroid/view/View;

    const p2, 0x7f0a026e

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lof0;->t:Landroid/widget/LinearLayout;

    .line 3
    iget-object p1, p0, Lof0;->s:Landroid/view/View;

    const p2, 0x7f0a026c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 4
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const p3, 0x7f0a01b3

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object p2, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 5
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const p3, 0x7f0a01ca

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 6
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const p3, 0x7f0a019a

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object p2, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p3, 0x6

    .line 7
    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 8
    iget-object p2, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 9
    iget-object p2, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f0b002e

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    invoke-virtual {p2, p3, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftImageSize(II)V

    .line 10
    iget-object p2, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    const/high16 p3, 0x41b00000    # 22.0f

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setTextSize(F)V

    .line 11
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const p3, 0x7f0a01ae

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lof0;->w:Landroid/widget/EditText;

    .line 12
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const p3, 0x7f0a03c7

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Lof0;->x:Lcom/google/android/material/textfield/TextInputLayout;

    .line 13
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const p3, 0x7f0a00ef

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lof0;->y:Landroid/widget/Button;

    .line 14
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const p3, 0x7f0a00da

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lof0;->z:Landroid/widget/Button;

    .line 15
    iget-object p2, p0, Lof0;->y:Landroid/widget/Button;

    const p3, 0x7f080069

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 16
    iget-object p2, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setClickable(Z)V

    .line 17
    iget-object p2, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 18
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const v1, 0x7f0a024d

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lof0;->A:Landroid/widget/TextView;

    .line 19
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const v1, 0x7f0a0377

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 20
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const v1, 0x7f0a00dd

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    .line 21
    iget-object v1, p0, Lof0;->s:Landroid/view/View;

    const v2, 0x7f0a00d1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 22
    iget-object v2, p0, Lof0;->s:Landroid/view/View;

    const v3, 0x7f0a0115

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lof0;->r:Landroid/widget/CheckBox;

    .line 23
    iget-object v2, p0, Lof0;->s:Landroid/view/View;

    const v3, 0x7f0a0424

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lof0;->D:Landroid/widget/Spinner;

    .line 24
    iget-object v2, p0, Lof0;->s:Landroid/view/View;

    const v3, 0x7f0a0560

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lof0;->C:Landroid/widget/LinearLayout;

    .line 25
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v2

    iput-object v2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 26
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getEnTips()Ljava/lang/String;

    move-result-object v2

    const v3, 0x3171

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x1

    if-eqz v2, :cond_1

    .line 27
    iget-object v2, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 28
    iget-object v2, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 29
    iget-object v2, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2, v4, v6}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 30
    iget-object v2, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {v2, p3}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 31
    iget-object p3, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p3, v0}, Landroid/widget/Button;->setClickable(Z)V

    .line 32
    iget-object p3, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p3, v0}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0

    .line 33
    :cond_0
    iget-object p3, p0, Lof0;->y:Landroid/widget/Button;

    const v2, 0x7f080067

    invoke-virtual {p3, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 34
    iget-object p3, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p3, v6}, Landroid/widget/Button;->setClickable(Z)V

    .line 35
    iget-object p3, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p3, v6}, Landroid/widget/Button;->setEnabled(Z)V

    .line 36
    iget-object p3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p3, v3}, Lcom/olive/upi/transport/model/TransactionData;->setEnTips(Ljava/lang/String;)V

    .line 37
    iget-object p3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    iget-object v2, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/olive/upi/transport/model/TransactionData;->setEdittipamount(Ljava/lang/String;)V

    goto :goto_0

    .line 38
    :cond_1
    iget-object p3, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p3, v5}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 39
    :goto_0
    iget-object p3, p0, Lof0;->C:Landroid/widget/LinearLayout;

    invoke-virtual {p3, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    iget-object p3, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    iget-object p3, p0, Lof0;->z:Landroid/widget/Button;

    invoke-virtual {p3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    if-eq p2, p3, :cond_5

    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 45
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND_VIA_IFSC:I

    if-eq p2, p3, :cond_5

    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 46
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-eq p2, p3, :cond_5

    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 47
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne p2, p3, :cond_2

    goto :goto_2

    .line 48
    :cond_2
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-ne p2, p3, :cond_4

    .line 49
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 50
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getMerchantflag()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getMerchantflag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 51
    iget-object p1, p0, Lof0;->x:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 52
    :cond_3
    iget-object p1, p0, Lof0;->x:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 53
    :goto_1
    iget-object p1, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_2

    .line 54
    :cond_4
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 55
    invoke-virtual {p1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 56
    iget-object p1, p0, Lof0;->y:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 57
    :cond_5
    :goto_2
    iget-object p1, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lbg0;

    iget-object p3, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p3

    invoke-direct {p2, p3, v6}, Lbg0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 58
    iget-object p1, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v4, v6}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 59
    iget-object p1, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lof0$k;

    invoke-direct {p2, p0}, Lof0$k;-><init>(Lof0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 60
    iget-object p1, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lbg0;

    iget-object p3, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p3

    invoke-direct {p2, p3, v6}, Lbg0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 61
    iget-object p1, p0, Lof0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v4, v6}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 62
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getMerchantflag()Ljava/lang/String;

    move-result-object p1

    .line 63
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_6

    const p2, 0x3172

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 64
    iget-object p1, p0, Lof0;->A:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 65
    :cond_6
    iget-object p1, p0, Lof0;->A:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 66
    :goto_3
    iget-object p1, p0, Lof0;->A:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lof0;->L(Ljava/util/ArrayList;)V

    .line 68
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    .line 69
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 70
    iget-object p1, p0, Lof0;->D:Landroid/widget/Spinner;

    iget-object p2, p0, Lof0;->E:Lla0;

    iget-object p3, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p3

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lla0;->b(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 71
    :cond_7
    iget-object p1, p0, Lof0;->D:Landroid/widget/Spinner;

    new-instance p2, Lof0$l;

    invoke-direct {p2, p0}, Lof0$l;-><init>(Lof0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 72
    iget-object p1, p0, Lof0;->s:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 12

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_e

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x3173

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    iget-object v1, p0, Lxc0;->b:Lmg0;

    if-nez v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    check-cast v1, Lcom/upi/axispay/activity/MainActivity;

    iput-object v1, p0, Lxc0;->b:Lmg0;

    .line 5
    :cond_1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v1, 0xa

    const/16 v2, 0x18

    const/4 v3, 0x0

    if-eq p1, v1, :cond_6

    const/16 v1, 0x11

    if-eq p1, v1, :cond_5

    if-eq p1, v2, :cond_6

    const/16 v0, 0x1d

    const/16 v1, 0xb

    if-eq p1, v0, :cond_4

    const/16 v0, 0x34

    if-eq p1, v0, :cond_3

    const/16 v0, 0x62

    if-eq p1, v0, :cond_2

    .line 6
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_3

    .line 7
    :cond_2
    iget-object p1, p0, Lxc0;->c:Lz;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_3

    .line 8
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v3}, Lmg0;->o(ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 11
    :cond_4
    invoke-static {}, Leg0;->B()V

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v3}, Lmg0;->o(ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 14
    :cond_5
    invoke-static {}, Leg0;->B()V

    .line 15
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x3174

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_3

    .line 17
    :cond_6
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x12d

    invoke-interface {p1, v1, v3}, Lmg0;->o(ILjava/lang/Object;)V

    .line 18
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 19
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 21
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 22
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    goto :goto_1

    .line 24
    :cond_7
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 25
    :goto_1
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 26
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 27
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v4, 0x3175

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 28
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 29
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    const p1, 0x3176

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const p2, 0x7f120497

    const v4, 0x7f12031e

    const v5, 0x7f12005c

    if-eqz p1, :cond_9

    .line 32
    invoke-static {}, Leg0;->B()V

    .line 33
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne p1, v0, :cond_8

    .line 34
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f12049a

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lof0$b;

    invoke-direct {v2, p0}, Lof0$b;-><init>(Lof0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 35
    :cond_8
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f1201be

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    const p1, 0x7f1203cd

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lof0$c;

    invoke-direct {v8, p0}, Lof0$c;-><init>(Lof0;)V

    const p1, 0x7f1203d2

    .line 37
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lof0$d;

    invoke-direct {v10, p0}, Lof0$d;-><init>(Lof0;)V

    const/4 v11, 0x1

    .line 38
    invoke-static/range {v4 .. v11}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    :goto_2
    return-void

    :cond_9
    const p1, 0x3177

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 40
    invoke-virtual {p0}, Lof0;->J()V

    .line 41
    invoke-static {}, Leg0;->B()V

    .line 42
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f120499

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lof0$e;

    invoke-direct {v2, p0}, Lof0$e;-><init>(Lof0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    :cond_a
    const p1, 0x3178

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 44
    sget-object p1, Lcom/olive/upi/transport/TransportConstants;->FLRESPDESC:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lof0;->K(Ljava/lang/String;)V

    return-void

    :cond_b
    const p1, 0x3179

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 46
    sget-object p1, Lcom/olive/upi/transport/TransportConstants;->FPRESPDESC:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lof0;->K(Ljava/lang/String;)V

    return-void

    :cond_c
    const p1, 0x317a

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 48
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 49
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 50
    invoke-static {}, Leg0;->B()V

    .line 51
    invoke-virtual {p0}, Lof0;->J()V

    .line 52
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f120206

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const p1, 0x7f1200d3

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lof0$f;

    invoke-direct {v5, p0}, Lof0$f;-><init>(Lof0;)V

    const p1, 0x7f12031d

    .line 53
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lof0$g;

    invoke-direct {v7, p0}, Lof0$g;-><init>(Lof0;)V

    const/4 v8, 0x1

    .line 54
    invoke-static/range {v1 .. v8}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 55
    :cond_d
    invoke-virtual {p0}, Lof0;->J()V

    .line 56
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 57
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 58
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setIsfromSendMoney(Z)V

    .line 59
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 60
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v3}, Lmg0;->t(ILjava/lang/Object;)V

    .line 61
    :cond_e
    :goto_3
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 18

    move-object/from16 v0, p0

    .line 1
    invoke-super/range {p0 .. p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lua0;->u(Lua0$e;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object v1

    .line 4
    iget-object v2, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    iput-object v2, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    const/16 v2, 0x9

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    iget-boolean v1, v0, Lxc0;->h:Z

    if-eqz v1, :cond_1

    .line 6
    :cond_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v5, Lcom/olive/upi/transport/OliveRequest;

    const/16 v6, 0x35

    const/4 v7, 0x0

    invoke-direct {v5, v2, v6, v7, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v1, v4, v5}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 7
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v1

    iput-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 8
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    iput v1, v0, Lof0;->p:I

    .line 9
    iget-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getMinimumAmount()Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_2

    .line 10
    iget-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/olive/upi/transport/model/TransactionData;->setMinimumAmount(Ljava/lang/Double;)V

    .line 11
    :cond_2
    iget v1, v0, Lof0;->p:I

    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    const v6, 0x317b

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f12041f

    const/16 v8, 0x8

    const/16 v9, 0x5a

    if-ne v1, v5, :cond_4

    .line 12
    iget-object v1, v0, Lxc0;->b:Lmg0;

    new-instance v5, Ltg0;

    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v15}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v9, v5}, Lmg0;->o(ILjava/lang/Object;)V

    .line 13
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->m:Ljava/lang/String;

    const v1, 0x7f120415

    .line 14
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->n:Ljava/lang/String;

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v5, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lqa0;->f(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 16
    iget-object v1, v0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 17
    iget-object v1, v0, Lof0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 18
    :cond_3
    iget-object v1, v0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 19
    iget-object v1, v0, Lof0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 20
    :goto_0
    iput-object v6, v0, Lof0;->o:Ljava/lang/String;

    goto/16 :goto_3

    .line 21
    :cond_4
    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND_VIA_IFSC:I

    if-ne v1, v5, :cond_5

    .line 22
    iget-object v1, v0, Lxc0;->b:Lmg0;

    new-instance v4, Ltg0;

    const v5, 0x7f12041e

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object v10, v4

    invoke-direct/range {v10 .. v15}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v9, v4}, Lmg0;->o(ILjava/lang/Object;)V

    .line 23
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->m:Ljava/lang/String;

    const v1, 0x7f120418

    .line 24
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->n:Ljava/lang/String;

    const v1, 0x317c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 25
    iput-object v1, v0, Lof0;->o:Ljava/lang/String;

    goto/16 :goto_3

    .line 26
    :cond_5
    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    if-eq v1, v5, :cond_a

    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-ne v1, v5, :cond_6

    goto/16 :goto_2

    .line 27
    :cond_6
    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v1, v5, :cond_7

    .line 28
    iget-object v1, v0, Lxc0;->b:Lmg0;

    new-instance v5, Ltg0;

    const v7, 0x7f12041c

    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v15}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v9, v5}, Lmg0;->o(ILjava/lang/Object;)V

    .line 29
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->m:Ljava/lang/String;

    const v1, 0x7f120207

    .line 30
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->n:Ljava/lang/String;

    .line 31
    iput-object v6, v0, Lof0;->o:Ljava/lang/String;

    .line 32
    iget-object v1, v0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 33
    iget-object v1, v0, Lof0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_3

    .line 34
    :cond_7
    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    const v6, 0x7f120346

    const v10, 0x317d

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f120348

    if-ne v1, v5, :cond_9

    .line 35
    iget-object v1, v0, Lxc0;->b:Lmg0;

    new-instance v5, Ltg0;

    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v12, v5

    invoke-direct/range {v12 .. v17}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v9, v5}, Lmg0;->o(ILjava/lang/Object;)V

    .line 36
    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->m:Ljava/lang/String;

    .line 37
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v5, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lqa0;->f(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 38
    iget-object v1, v0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 39
    iget-object v1, v0, Lof0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 40
    :cond_8
    iget-object v1, v0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 41
    iget-object v1, v0, Lof0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 42
    :goto_1
    iput-object v10, v0, Lof0;->o:Ljava/lang/String;

    .line 43
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->n:Ljava/lang/String;

    goto :goto_3

    .line 44
    :cond_9
    iget-object v1, v0, Lxc0;->b:Lmg0;

    new-instance v4, Ltg0;

    const v5, 0x7f12034a

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v12, v4

    invoke-direct/range {v12 .. v17}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v9, v4}, Lmg0;->o(ILjava/lang/Object;)V

    .line 45
    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->m:Ljava/lang/String;

    .line 46
    iput-object v10, v0, Lof0;->o:Ljava/lang/String;

    .line 47
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->n:Ljava/lang/String;

    goto :goto_3

    .line 48
    :cond_a
    :goto_2
    iget-object v1, v0, Lxc0;->b:Lmg0;

    new-instance v5, Ltg0;

    const v6, 0x7f1203dc

    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v15}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v9, v5}, Lmg0;->o(ILjava/lang/Object;)V

    const v1, 0x7f120377

    .line 49
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->n:Ljava/lang/String;

    .line 50
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lof0;->m:Ljava/lang/String;

    const v1, 0x317e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 51
    iput-object v1, v0, Lof0;->o:Ljava/lang/String;

    .line 52
    iget-object v1, v0, Lof0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 53
    iget-object v1, v0, Lof0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 54
    :goto_3
    iget-object v1, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    if-eqz v1, :cond_b

    .line 55
    iget-object v1, v0, Lof0;->s:Landroid/view/View;

    const v4, 0x7f0a04cf

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 56
    iget-object v4, v0, Lof0;->s:Landroid/view/View;

    const v5, 0x7f0a04d0

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 57
    iget-object v5, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object v1, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object v1, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 61
    iget-object v1, v0, Lof0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    .line 62
    :cond_b
    iget-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 63
    iget-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    if-eq v1, v3, :cond_c

    iget-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 64
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-eq v1, v3, :cond_c

    iget-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 65
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-eq v1, v3, :cond_c

    iget-object v1, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    .line 66
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v1, v3, :cond_d

    .line 67
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lof0;->D()V

    .line 68
    :cond_d
    iget-object v1, v0, Lof0;->m:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lxc0;->v(ILjava/lang/String;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, -0x64

    if-eq v0, v1, :cond_a

    const/16 v1, 0x12d

    const/16 v2, 0x18

    const/16 v3, 0xa

    const v4, 0x317f

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x3180

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x3181

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v0, v3, :cond_7

    const/16 v10, 0xf

    if-eq v0, v10, :cond_5

    const/16 v10, 0x11

    const/16 v11, 0x9

    if-eq v0, v10, :cond_4

    if-eq v0, v2, :cond_7

    const/16 v2, 0x1d

    const/16 v3, 0xb

    const v10, 0x3182

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    if-eq v0, v2, :cond_3

    const/16 v1, 0x34

    if-eq v0, v1, :cond_2

    const/16 v1, 0x62

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p1, v11, :cond_b

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :cond_0
    iget-object p1, p2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    invoke-virtual {p1, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lof0;->F()V

    goto/16 :goto_1

    .line 6
    :cond_1
    iget-object p1, p0, Lxc0;->c:Lz;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_1

    .line 7
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v3, v8}, Lmg0;->o(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 10
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f12030d

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v8}, Lmg0;->o(ILjava/lang/Object;)V

    .line 13
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v8}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 16
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lqa0;->q0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 17
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v3, v8}, Lmg0;->o(ILjava/lang/Object;)V

    .line 18
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 19
    iget-object v0, p0, Lof0;->n:Ljava/lang/String;

    invoke-virtual {p1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljg0;->l(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x3183

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, v9}, Lah0;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Z)V

    .line 23
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 24
    new-instance v0, Lcom/google/android/gms/analytics/ecommerce/Product;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/ecommerce/Product;-><init>()V

    .line 25
    invoke-virtual {v0, p2}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->setName(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 27
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/ecommerce/Product;->setPrice(D)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 28
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 29
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v1, v0, p1}, Lah0;->e(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/analytics/ecommerce/Product;Ljava/util/Map;)V

    goto/16 :goto_1

    .line 30
    :cond_4
    invoke-static {}, Leg0;->B()V

    .line 31
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12010f

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 32
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 33
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x3184

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 34
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x12

    invoke-direct {p2, v11, v0, v8}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v9, p2}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 35
    :cond_5
    invoke-static {}, Leg0;->B()V

    .line 36
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    .line 37
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    if-eqz p1, :cond_6

    .line 38
    iget-object p2, p0, Lof0;->s:Landroid/view/View;

    const v0, 0x7f0a04dc

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 39
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 40
    :cond_6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f1203c6

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-array v0, v9, [Ljava/lang/Object;

    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v7

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lof0$a;

    invoke-direct {v0, p0}, Lof0$a;-><init>(Lof0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 41
    :cond_7
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v8}, Lmg0;->o(ILjava/lang/Object;)V

    .line 42
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 43
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 45
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 46
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 47
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 49
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 50
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 51
    :cond_8
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 52
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v1, 0x3185

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 53
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 54
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 55
    iget-object p1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v9}, Lcom/olive/upi/transport/model/TransactionData;->setIsfromSendMoney(Z)V

    .line 56
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 57
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x3186

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v0, v9

    invoke-virtual {p2, v1, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 58
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const p2, 0x3187

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v7}, Ln70;->A(Ljava/lang/String;Z)V

    .line 59
    invoke-static {}, Leg0;->B()V

    .line 60
    invoke-virtual {p0}, Lof0;->J()V

    .line 61
    iget-object p1, p0, Lxc0;->b:Lmg0;

    sget-object p2, Lof0;->G:Lcom/olive/upi/transport/model/Account;

    invoke-interface {p1, v2, p2}, Lmg0;->t(ILjava/lang/Object;)V

    .line 62
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->Q()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 63
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 64
    iget-object p2, p0, Lof0;->n:Ljava/lang/String;

    invoke-virtual {p1, v6, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Ljg0;->l(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x3188

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1, v9}, Lah0;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Z)V

    .line 68
    new-instance p2, Lcom/google/android/gms/analytics/ecommerce/Product;

    invoke-direct {p2}, Lcom/google/android/gms/analytics/ecommerce/Product;-><init>()V

    .line 69
    iget-object v1, p0, Lof0;->n:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->setName(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 70
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/analytics/ecommerce/Product;->setPrice(D)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 71
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 72
    iget-object v1, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->setBrand(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 73
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1, v0, p2, p1}, Lah0;->e(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/analytics/ecommerce/Product;Ljava/util/Map;)V

    goto :goto_0

    .line 74
    :cond_9
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 75
    iget-object p2, p0, Lof0;->n:Ljava/lang/String;

    invoke-virtual {p1, v6, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Ljg0;->l(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    iget-object p2, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    iget-object v0, p0, Lof0;->o:Ljava/lang/String;

    invoke-static {p2, v0, p1, v9}, Lah0;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Z)V

    .line 79
    new-instance p2, Lcom/google/android/gms/analytics/ecommerce/Product;

    invoke-direct {p2}, Lcom/google/android/gms/analytics/ecommerce/Product;-><init>()V

    .line 80
    iget-object v0, p0, Lof0;->o:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/analytics/ecommerce/Product;->setName(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 81
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->setPrice(D)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 82
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 83
    iget-object v0, p0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/analytics/ecommerce/Product;->setBrand(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 84
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lof0;->o:Ljava/lang/String;

    invoke-static {v0, v1, p2, p1}, Lah0;->e(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/analytics/ecommerce/Product;Ljava/util/Map;)V

    .line 85
    :goto_0
    iget-object p1, p0, Lof0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p2, 0x3189

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 86
    iget-object p1, p0, Lof0;->w:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    goto :goto_1

    .line 87
    :cond_a
    invoke-static {}, Leg0;->B()V

    .line 88
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1}, Lcom/upi/axispay/activity/MainActivity;->q0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_b

    .line 89
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const/4 p2, 0x3

    const v0, 0x318a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ln70;->v(Ljava/lang/String;I)V

    :cond_b
    :goto_1
    return-void
.end method
