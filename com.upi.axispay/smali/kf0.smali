.class public Lkf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# instance fields
.field public l:Landroid/widget/Button;

.field public m:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public n:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public o:Landroid/widget/LinearLayout;

.field public p:Landroid/widget/CheckBox;

.field public q:Landroid/widget/ImageView;

.field public r:Lcom/olive/upi/transport/model/TransactionData;

.field public s:Landroid/view/View;

.field public t:Landroid/widget/EditText;

.field public u:Landroid/widget/LinearLayout;

.field public v:Landroid/widget/Spinner;

.field public w:Lla0;

.field public x:Lcom/olive/upi/transport/model/Account;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Account;-><init>()V

    iput-object v0, p0, Lkf0;->x:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public static synthetic x(Lkf0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkf0;->C()V

    return-void
.end method

.method public static synthetic y(Lkf0;)Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf0;->t:Landroid/widget/EditText;

    return-object p0
.end method

.method public static z(Lcom/olive/upi/transport/model/Account;)Lkf0;
    .locals 0

    .line 1
    new-instance p0, Lkf0;

    invoke-direct {p0}, Lkf0;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lkf0;->t:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final B()V
    .locals 4

    .line 1
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a01ca

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a019a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 v1, 0x6

    .line 3
    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 4
    iget-object v0, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0b002e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftImageSize(II)V

    .line 5
    iget-object v0, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v0

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextSize(F)V

    .line 6
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a01af

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lkf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/16 v1, 0x14

    .line 7
    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 8
    iget-object v0, p0, Lkf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 9
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a019c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkf0;->t:Landroid/widget/EditText;

    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 11
    iget-object v0, p0, Lkf0;->t:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setClickable(Z)V

    .line 12
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v2, 0x7f0a00ef

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lkf0;->l:Landroid/widget/Button;

    const v2, 0x7f080069

    .line 13
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 14
    iget-object v0, p0, Lkf0;->l:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 15
    iget-object v0, p0, Lkf0;->l:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 16
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a026e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lkf0;->o:Landroid/widget/LinearLayout;

    .line 17
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a0115

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lkf0;->p:Landroid/widget/CheckBox;

    .line 18
    iget-object v0, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a0104

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lkf0;->q:Landroid/widget/ImageView;

    return-void
.end method

.method public final C()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 3
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v3, 0x2

    .line 4
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 6
    new-instance v0, Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    new-instance v5, Lkf0$d;

    invoke-direct {v5, p0}, Lkf0$d;-><init>(Lkf0;)V

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 7
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    const/16 v4, 0x2c

    .line 8
    invoke-virtual {v3, v1, v4}, Ljava/util/Calendar;->add(II)V

    .line 9
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 10
    invoke-virtual {v4, v1, v2}, Ljava/util/Calendar;->add(II)V

    const/16 v1, 0xc

    const/4 v2, -0x1

    .line 11
    invoke-virtual {v4, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 12
    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v1

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/widget/DatePicker;->setMaxDate(J)V

    .line 13
    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v1

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 14
    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    return-void
.end method

.method public final D(Ljava/util/ArrayList;)V
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
    iget-object v0, p0, Lkf0;->w:Lla0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lla0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lla0;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lkf0;->w:Lla0;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lla0;->c(Ljava/util/ArrayList;)V

    .line 4
    :goto_0
    iget-object p1, p0, Lkf0;->v:Landroid/widget/Spinner;

    iget-object v0, p0, Lkf0;->w:Lla0;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v1, 0x7f0a00ef

    if-eq p1, v1, :cond_2

    const v1, 0x7f0a0104

    if-eq p1, v1, :cond_1

    const v1, 0x7f0a0560

    if-eq p1, v1, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    iget-object p1, p0, Lkf0;->v:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->performClick()Z

    goto/16 :goto_1

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 4
    invoke-virtual {p0}, Lkf0;->C()V

    goto/16 :goto_1

    .line 5
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 6
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    .line 7
    iget-object v1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v1

    if-nez p1, :cond_3

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x7f1203f6

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_3
    if-nez v1, :cond_4

    return-void

    .line 9
    :cond_4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x7f120427

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_5
    const-wide/16 v2, 0x0

    .line 13
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    .line 14
    :try_start_0
    iget-object v2, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    .line 15
    iget-object v2, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :catch_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, v2, v4

    if-gez p1, :cond_6

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x7f12017f

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 18
    :cond_6
    iget-object p1, p0, Lkf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 19
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    iget-object v2, p0, Lkf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    goto :goto_0

    .line 20
    :cond_7
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    const v2, 0x7f120140

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 21
    :goto_0
    iget-object p1, p0, Lkf0;->p:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    const/16 v2, 0x32

    if-eqz p1, :cond_8

    .line 22
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 23
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    const v0, 0x261b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 27
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x11

    invoke-direct {v3, v2, v4, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 28
    :cond_8
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_RECEIVE:I

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 29
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p0}, Lkf0;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setExpiry(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 31
    new-instance p1, Lcom/olive/upi/transport/model/CollectRequest;

    iget-object v1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    iget-object v1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v5

    iget-object v1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v6

    iget-object v1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lkf0;->A()Ljava/lang/String;

    move-result-object v8

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/olive/upi/transport/model/CollectRequest;-><init>(Lcom/olive/upi/transport/model/Account;Lcom/olive/upi/transport/model/BeneVpa;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0xb

    invoke-direct {v3, v2, v4, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d00aa

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lkf0;->s:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lkf0;->B()V

    .line 3
    iget-object p1, p0, Lkf0;->l:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object p1, p0, Lkf0;->q:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    iput-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    .line 6
    iget-object p1, p0, Lkf0;->s:Landroid/view/View;

    const p2, 0x7f0a0424

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lkf0;->v:Landroid/widget/Spinner;

    .line 7
    iget-object p1, p0, Lkf0;->s:Landroid/view/View;

    const p2, 0x7f0a0560

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lkf0;->u:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->d:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkf0;->D(Ljava/util/ArrayList;)V

    .line 10
    iget-object p1, p0, Lkf0;->v:Landroid/widget/Spinner;

    iget-object p2, p0, Lkf0;->w:Lla0;

    iget-object p3, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p3

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lla0;->b(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 11
    iget-object p1, p0, Lkf0;->v:Landroid/widget/Spinner;

    new-instance p2, Lkf0$a;

    invoke-direct {p2, p0}, Lkf0$a;-><init>(Lkf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 12
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 13
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    iget-object p2, p0, Lkf0;->s:Landroid/view/View;

    const p3, 0x7f0a04cf

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 15
    iget-object p3, p0, Lkf0;->s:Landroid/view/View;

    const v1, 0x7f0a04d0

    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 16
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljg0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const/16 p2, 0xb

    const/16 p3, 0x17

    .line 19
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->set(II)V

    const/16 p2, 0xc

    const/16 p3, 0x3b

    .line 20
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->set(II)V

    const/16 p2, 0xd

    .line 21
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->set(II)V

    const/4 p2, 0x5

    const/4 p3, 0x1

    .line 22
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->add(II)V

    .line 23
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const p2, 0x261c

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 24
    invoke-static {p1, p2}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    iget-object p2, p0, Lkf0;->t:Landroid/widget/EditText;

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 26
    iget-object p2, p0, Lkf0;->t:Landroid/widget/EditText;

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setVisibility(I)V

    .line 27
    iget-object p2, p0, Lkf0;->t:Landroid/widget/EditText;

    new-instance v0, Lkf0$b;

    invoke-direct {v0, p0}, Lkf0$b;-><init>(Lkf0;)V

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 28
    iget-object p2, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setExpiry(Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lbg0;

    iget-object v0, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v0

    invoke-direct {p2, v0, p3}, Lbg0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 30
    iget-object p1, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lkf0$c;

    invoke-direct {p2, p0}, Lkf0$c;-><init>(Lkf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 31
    iget-object p1, p0, Lkf0;->s:Landroid/view/View;

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

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :cond_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x12d

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p0}, Lkf0;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 10
    :goto_0
    invoke-static {}, Leg0;->B()V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 13
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionNote(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterName(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setBeneficiaryName(Ljava/lang/String;)V

    .line 16
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 17
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_2

    .line 18
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 19
    :cond_2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x18

    invoke-interface {p1, p2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    .line 20
    :cond_3
    :goto_1
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 3

    const v0, 0x7f1203be

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x32

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 4
    iget-object v0, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    .line 5
    iget-object v0, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 6
    invoke-static {}, Lcom/olive/upi/transport/model/TransactionData;->isSelectedFromList()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lkf0;->o:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lkf0;->p:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lkf0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lkf0;->p:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    :goto_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0xb

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_1

    const/16 p2, 0x11

    if-eq p1, p2, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x261d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 4
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x32

    const/16 v3, 0x12

    invoke-direct {p2, v0, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2, p2}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 5
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 6
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 9
    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 10
    iget-object v0, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v3, 0x261e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p0}, Lkf0;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setExpiry(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 14
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x12d

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 15
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_3

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 17
    :cond_3
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x261f

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->j(Ljava/lang/String;)I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v0, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 18
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const/4 v0, 0x0

    const v3, 0x2620

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3, v0}, Ln70;->A(Ljava/lang/String;Z)V

    .line 19
    invoke-static {}, Leg0;->B()V

    .line 20
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x18

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    .line 21
    iget-object p1, p0, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 22
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->Q()Z

    move-result p1

    const v0, 0x2621

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2622

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x7f1203be

    const v4, 0x2623

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    if-eqz p1, :cond_4

    .line 23
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 24
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iget-object v3, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Ljg0;->l(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    iget-object v1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x2624

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, v2}, Lah0;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Z)V

    .line 28
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 29
    new-instance v0, Lcom/google/android/gms/analytics/ecommerce/Product;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/ecommerce/Product;-><init>()V

    .line 30
    iget-object v2, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/ecommerce/Product;->setPrice(D)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 31
    invoke-virtual {v0, p2}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 32
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v1, v0, p1}, Lah0;->e(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/analytics/ecommerce/Product;Ljava/util/Map;)V

    goto :goto_1

    .line 33
    :cond_4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 34
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    iget-object v2, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Ljg0;->l(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    iget-object v1, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x2625

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 38
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 39
    new-instance v0, Lcom/google/android/gms/analytics/ecommerce/Product;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/ecommerce/Product;-><init>()V

    .line 40
    iget-object v2, p0, Lkf0;->r:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/ecommerce/Product;->setPrice(D)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 41
    invoke-virtual {v0, p2}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 42
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v1, v0, p1}, Lah0;->e(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/analytics/ecommerce/Product;Ljava/util/Map;)V

    :goto_1
    return-void
.end method
