.class public Lvd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public l:Landroid/view/View;

.field public m:[Ljava/lang/String;

.field public n:[Ljava/lang/String;

.field public o:Landroid/widget/Button;

.field public p:Landroidx/appcompat/widget/SwitchCompat;

.field public q:Landroid/widget/Spinner;

.field public r:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public s:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public t:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public u:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public v:Landroid/widget/LinearLayout;

.field public w:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0x1f60

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1f61

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x1f62

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lvd0;->n:[Ljava/lang/String;

    return-void
.end method

.method public static x()Lvd0;
    .locals 1

    .line 1
    new-instance v0, Lvd0;

    invoke-direct {v0}, Lvd0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final A(I)V
    .locals 14

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    const/4 v3, 0x1

    .line 3
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v5, 0x2

    .line 4
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/4 v8, 0x4

    if-ne p1, v3, :cond_0

    .line 6
    iget-object v9, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v9}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 7
    iget-object v4, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v4}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 9
    invoke-virtual {v4, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sub-int/2addr v7, v3

    .line 10
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    :goto_0
    move v13, v2

    move v11, v6

    move v12, v7

    goto :goto_1

    :cond_0
    if-ne p1, v5, :cond_1

    .line 11
    iget-object v9, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v9}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 12
    iget-object v4, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v4}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 14
    invoke-virtual {v4, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sub-int/2addr v7, v3

    .line 15
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_1
    move v11, v4

    move v12, v6

    move v13, v7

    .line 16
    :goto_1
    new-instance v2, Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v9

    new-instance v10, Lvd0$d;

    invoke-direct {v10, p0, p1}, Lvd0$d;-><init>(Lvd0;I)V

    move-object v8, v2

    invoke-direct/range {v8 .. v13}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    if-ne p1, v3, :cond_2

    .line 17
    invoke-virtual {v2}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object p1

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/widget/DatePicker;->setMinDate(J)V

    goto :goto_2

    .line 18
    :cond_2
    iget-object p1, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    const v0, 0x1f63

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {p1, v0}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 20
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 22
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->add(II)V

    const/16 p1, 0xc

    const/4 v1, -0x1

    .line 23
    invoke-virtual {v0, p1, v1}, Ljava/util/Calendar;->add(II)V

    .line 24
    invoke-virtual {v2}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object p1

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 25
    :goto_2
    invoke-virtual {v2}, Landroid/app/DatePickerDialog;->show()V

    return-void
.end method

.method public final B()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f120195

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 5
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f120186

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    return v1

    .line 6
    :cond_1
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v2, 0x7f12017f

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 8
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    return v1

    :cond_2
    const-wide/16 v3, 0x0

    .line 9
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 10
    :try_start_0
    iget-object v5, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v5}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    cmpl-double v3, v5, v3

    if-nez v3, :cond_3

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v1

    .line 13
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v2, v4

    if-gez v0, :cond_4

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v2, 0x7f120085

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v1

    .line 15
    :cond_4
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 16
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 17
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    const/4 v0, 0x1

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00db

    if-eq p1, v0, :cond_3

    const v0, 0x7f0a013a

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a013f

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lvd0;->A(I)V

    goto/16 :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x2

    .line 4
    invoke-virtual {p0, p1}, Lvd0;->A(I)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p1, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f120195

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_3
    invoke-virtual {p0}, Lvd0;->B()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    .line 8
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 11
    iget-object v0, p0, Lvd0;->q:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setLimitTranx(Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 13
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x6d

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0084

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lvd0;->l:Landroid/view/View;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f030007

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lvd0;->m:[Ljava/lang/String;

    .line 4
    iget-object p1, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p1

    const/4 p2, 0x2

    const/16 p3, 0x6c

    if-ne p1, p2, :cond_0

    const p1, 0x7f1203bc

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    const p1, 0x7f120290

    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    const p1, 0x7f120114

    .line 8
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lxc0;->v(ILjava/lang/String;)V

    .line 9
    :goto_0
    iget-object p1, p0, Lvd0;->l:Landroid/view/View;

    const p3, 0x7f0a0444

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 10
    iget-object p3, p0, Lvd0;->m:[Ljava/lang/String;

    invoke-virtual {p1, p3}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lvd0;->y()V

    .line 12
    invoke-virtual {p0}, Lvd0;->z()V

    .line 13
    iget-object p1, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    new-instance p3, Lbg0;

    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-direct {p3, v0, p2}, Lbg0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p1, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 14
    iget-object p1, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 15
    iget-object p1, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 16
    iget-object p1, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lvd0$a;

    invoke-direct {p2, p0}, Lvd0$a;-><init>(Lvd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 17
    new-instance p1, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const p3, 0x1090008

    iget-object v0, p0, Lvd0;->n:[Ljava/lang/String;

    invoke-direct {p1, p2, p3, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const p2, 0x1090009

    .line 18
    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 19
    iget-object p2, p0, Lvd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 20
    iget-object p1, p0, Lvd0;->q:Landroid/widget/Spinner;

    new-instance p2, Lvd0$b;

    invoke-direct {p2, p0}, Lvd0$b;-><init>(Lvd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 21
    iget-object p1, p0, Lvd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    iput-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v0

    const/16 v1, 0x6c

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const v0, 0x7f1203bc

    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    const v0, 0x7f120290

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    const v0, 0x7f120114

    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final y()V
    .locals 7

    .line 1
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v1, 0x7f0a041c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lvd0;->q:Landroid/widget/Spinner;

    .line 2
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v1, 0x7f0a043c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 3
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v1, 0x7f0a044e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SwitchCompat;

    iput-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    .line 4
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 5
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setClickable(Z)V

    .line 6
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v2, 0x7f0a007e

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lvd0;->v:Landroid/widget/LinearLayout;

    .line 7
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v2, 0x7f0a0291

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lvd0;->w:Landroid/widget/LinearLayout;

    .line 8
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v2, 0x7f0a01bf

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 9
    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 10
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setClickable(Z)V

    .line 11
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v2, 0x7f0a01c3

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 12
    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setInputType(I)V

    .line 13
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    const v3, 0x1f64

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 14
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setRawInputType(I)V

    .line 15
    iget-object v0, p0, Lvd0;->l:Landroid/view/View;

    const v2, 0x7f0a00db

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lvd0;->o:Landroid/widget/Button;

    .line 16
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYER_UPDATE_MANDATE:I

    const/4 v3, 0x1

    const v4, 0x1f65

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x1f66

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYEE_UPDATE_MANDATE:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_CREATE_MANDATE:I

    if-ne v0, v2, :cond_4

    .line 18
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v2, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightIcon()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v2, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v2, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setClickable(Z)V

    .line 23
    iget-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setEnabled(Z)V

    .line 24
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    iget-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 26
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    goto :goto_1

    .line 27
    :cond_1
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v2, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightIcon()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 30
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v2, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lvd0;->u:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v2, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setClickable(Z)V

    .line 33
    iget-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setEnabled(Z)V

    .line 34
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 35
    iget-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 36
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    goto :goto_1

    .line 37
    :cond_3
    iget-object v0, p0, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    .line 38
    :cond_4
    :goto_1
    iget-object v0, p0, Lvd0;->p:Landroidx/appcompat/widget/SwitchCompat;

    new-instance v1, Lvd0$c;

    invoke-direct {v1, p0}, Lvd0$c;-><init>(Lvd0;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public final z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightIcon()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightIcon()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lvd0;->o:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
