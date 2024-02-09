.class public Lwd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public A:Landroid/widget/Spinner;

.field public B:Lcom/olive/upi/transport/model/Account;

.field public C:I

.field public D:Landroid/widget/TextView;

.field public l:Landroid/view/View;

.field public m:Landroid/widget/Button;

.field public n:Landroid/widget/EditText;

.field public o:[Ljava/lang/String;

.field public p:Landroid/widget/Spinner;

.field public q:Landroid/widget/Spinner;

.field public r:[Ljava/lang/String;

.field public s:[Ljava/lang/String;

.field public t:Lcom/kofigyan/stateprogressbar/StateProgressBar;

.field public u:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public v:Landroid/widget/LinearLayout;

.field public w:Landroid/widget/LinearLayout;

.field public x:Landroid/widget/CheckBox;

.field public y:Landroidx/appcompat/widget/SwitchCompat;

.field public z:Le90;


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0xad9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0xada

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0xadb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwd0;->r:[Ljava/lang/String;

    const v1, 0xadc

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0xadd

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0xade

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0xadf

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0xae0

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0xae1

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0xae2

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0xae3

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0xae4

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0xae5

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 3
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwd0;->s:[Ljava/lang/String;

    .line 4
    new-instance v0, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Account;-><init>()V

    iput-object v0, p0, Lwd0;->B:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public static x()Lwd0;
    .locals 1

    .line 1
    new-instance v0, Lwd0;

    invoke-direct {v0}, Lwd0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final A(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lwd0;->z:Le90;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Le90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Le90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lwd0;->z:Le90;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Le90;->c(Ljava/util/ArrayList;)V

    .line 4
    :goto_0
    iget-object v0, p0, Lwd0;->A:Landroid/widget/Spinner;

    iget-object v1, p0, Lwd0;->z:Le90;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 5
    iget-object v0, p0, Lwd0;->B:Lcom/olive/upi/transport/model/Account;

    if-eqz v0, :cond_1

    .line 6
    iget-object v1, p0, Lwd0;->A:Landroid/widget/Spinner;

    iget-object v2, p0, Lwd0;->z:Le90;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Le90;->b(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_1

    .line 7
    :cond_1
    iget v0, p0, Lwd0;->C:I

    iget-object v1, p0, Lwd0;->z:Le90;

    invoke-virtual {v1}, Le90;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 8
    iget-object v0, p0, Lwd0;->A:Landroid/widget/Spinner;

    iget v1, p0, Lwd0;->C:I

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_1

    .line 9
    :cond_2
    iget-object v0, p0, Lwd0;->A:Landroid/widget/Spinner;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 10
    :goto_1
    iget-object v0, p0, Lwd0;->A:Landroid/widget/Spinner;

    new-instance v1, Lwd0$d;

    invoke-direct {v1, p0, p1}, Lwd0$d;-><init>(Lwd0;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00db

    if-eq p1, v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    iget-object p1, p0, Lwd0;->A:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result p1

    if-nez p1, :cond_1

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f1203f6

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setOccurence(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setTransactionOn(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lwd0;->n:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const v0, 0xae6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    :cond_2
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionNote(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lwd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0xae7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setSharetoPayee(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const v0, 0xae8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setSharetoPayee(Ljava/lang/String;)V

    .line 14
    :goto_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 15
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x6b

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const p3, 0x7f0d0085

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lwd0;->l:Landroid/view/View;

    const p2, 0x7f0a0424

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lwd0;->A:Landroid/widget/Spinner;

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwd0;->A(Ljava/util/ArrayList;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f030007

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwd0;->o:[Ljava/lang/String;

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 6
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p1

    const/16 p2, 0x6d

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    const p1, 0x7f1203bc

    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p1

    const/4 p3, 0x3

    if-ne p1, p3, :cond_1

    const p1, 0x7f120290

    .line 9
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    const p1, 0x7f120114

    .line 10
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lxc0;->v(ILjava/lang/String;)V

    .line 11
    :goto_0
    invoke-virtual {p0}, Lwd0;->z()V

    .line 12
    invoke-virtual {p0}, Lwd0;->y()V

    .line 13
    iget-object p1, p0, Lwd0;->t:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    iget-object p2, p0, Lwd0;->o:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lwd0;->m:Landroid/widget/Button;

    const p2, 0x7f080096

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 15
    new-instance p1, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    iget-object p3, p0, Lwd0;->r:[Ljava/lang/String;

    const v1, 0x1090008

    invoke-direct {p1, p2, v1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const p2, 0x1090009

    .line 16
    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 17
    new-instance p3, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    iget-object v3, p0, Lwd0;->s:[Ljava/lang/String;

    invoke-direct {p3, v2, v1, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 18
    invoke-virtual {p3, p2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 19
    iget-object p2, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p2, p3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 20
    iget-object p2, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 21
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const p2, 0xae9

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->isP2P()Z

    move-result p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->isP2P()Z

    move-result p1

    const p3, 0xaea

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->isP2P()Z

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    iget-object p1, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 25
    iget-object p1, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p1, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 26
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 27
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setEnabled(Z)V

    .line 28
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setBlockFund(Ljava/lang/String;)V

    .line 29
    :cond_2
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    new-instance p2, Lwd0$a;

    invoke-direct {p2, p0}, Lwd0$a;-><init>(Lwd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 30
    iget-object p1, p0, Lwd0;->D:Landroid/widget/TextView;

    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    iget-object p1, p0, Lwd0;->q:Landroid/widget/Spinner;

    new-instance p2, Lwd0$b;

    invoke-direct {p2, p0}, Lwd0$b;-><init>(Lwd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 32
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget p2, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYER_UPDATE_MANDATE:I

    const v2, 0xaeb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0xaec

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0xaed

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0xaee

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-eq p1, p2, :cond_a

    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget p2, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYEE_UPDATE_MANDATE:I

    if-ne p1, p2, :cond_3

    goto/16 :goto_5

    .line 33
    :cond_3
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget p2, Lcom/olive/upi/transport/model/TransactionData;->MODE_CREATE_MANDATE:I

    if-ne p1, p2, :cond_9

    .line 34
    iget-object p1, p0, Lwd0;->n:Landroid/widget/EditText;

    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object p1, p0, Lwd0;->n:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 36
    iget-object p1, p0, Lwd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 37
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 38
    iget-object p1, p0, Lwd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    .line 39
    :cond_4
    iget-object p1, p0, Lwd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 40
    :goto_1
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setClickable(Z)V

    .line 41
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setEnabled(Z)V

    .line 42
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getBlockFund()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 43
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 44
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setBlockFund(Ljava/lang/String;)V

    goto :goto_2

    .line 45
    :cond_5
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setBlockFund(Ljava/lang/String;)V

    .line 46
    :goto_2
    iget-object p1, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 47
    iget-object p1, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setClickable(Z)V

    .line 48
    iget-object p1, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p1, v1}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 49
    iget-object p1, p0, Lwd0;->A:Landroid/widget/Spinner;

    invoke-virtual {p1, v1}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 50
    iget-object p1, p0, Lwd0;->A:Landroid/widget/Spinner;

    iget-object p2, p0, Lwd0;->z:Le90;

    iget-object p3, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getPayerVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Le90;->b(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 51
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 52
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 53
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lwd0;->s:[Ljava/lang/String;

    array-length p3, p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move p1, v0

    .line 54
    :goto_3
    iget-object p2, p0, Lwd0;->s:[Ljava/lang/String;

    array-length p2, p2

    if-ge p1, p2, :cond_7

    .line 55
    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lwd0;->s:[Ljava/lang/String;

    aget-object p3, p3, p1

    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 56
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 57
    iget-object p2, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 58
    :cond_7
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_10

    move p1, v0

    .line 59
    :goto_4
    iget-object p2, p0, Lwd0;->r:[Ljava/lang/String;

    array-length p2, p2

    if-le p2, p1, :cond_10

    .line 60
    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lwd0;->r:[Ljava/lang/String;

    aget-object p3, p3, p1

    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 61
    iget-object p2, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setClickable(Z)V

    .line 62
    iget-object p2, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 63
    iget-object p2, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_8
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 64
    :cond_9
    iget-object p1, p0, Lwd0;->p:Landroid/widget/Spinner;

    new-instance p2, Lwd0$c;

    invoke-direct {p2, p0}, Lwd0$c;-><init>(Lwd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    goto/16 :goto_a

    .line 65
    :cond_a
    :goto_5
    iget-object p1, p0, Lwd0;->n:Landroid/widget/EditText;

    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object p1, p0, Lwd0;->n:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 67
    iget-object p1, p0, Lwd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 68
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 69
    iget-object p1, p0, Lwd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_6

    .line 70
    :cond_b
    iget-object p1, p0, Lwd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 71
    :goto_6
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setClickable(Z)V

    .line 72
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setEnabled(Z)V

    .line 73
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getBlockFund()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 74
    iget-object p1, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 75
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setBlockFund(Ljava/lang/String;)V

    goto :goto_7

    .line 76
    :cond_c
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->setBlockFund(Ljava/lang/String;)V

    .line 77
    :goto_7
    iget-object p1, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 78
    iget-object p1, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setClickable(Z)V

    .line 79
    iget-object p1, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 80
    iget-object p1, p0, Lwd0;->A:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 81
    iget-object p1, p0, Lwd0;->A:Landroid/widget/Spinner;

    iget-object p2, p0, Lwd0;->z:Le90;

    iget-object p3, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getPayerVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Le90;->b(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 82
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 83
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_e

    .line 84
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lwd0;->s:[Ljava/lang/String;

    array-length p3, p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move p1, v0

    .line 85
    :goto_8
    iget-object p2, p0, Lwd0;->s:[Ljava/lang/String;

    array-length p2, p2

    if-ge p1, p2, :cond_e

    .line 86
    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lwd0;->s:[Ljava/lang/String;

    aget-object p3, p3, p1

    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_d

    .line 87
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 88
    iget-object p2, p0, Lwd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_d
    add-int/lit8 p1, p1, 0x1

    goto :goto_8

    .line 89
    :cond_e
    iget-object p1, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_10

    move p1, v0

    .line 90
    :goto_9
    iget-object p2, p0, Lwd0;->r:[Ljava/lang/String;

    array-length p2, p2

    if-le p2, p1, :cond_10

    .line 91
    iget-object p2, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lwd0;->r:[Ljava/lang/String;

    aget-object p3, p3, p1

    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_f

    .line 92
    iget-object p2, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setClickable(Z)V

    .line 93
    iget-object p2, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 94
    iget-object p2, p0, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_f
    add-int/lit8 p1, p1, 0x1

    goto :goto_9

    .line 95
    :cond_10
    :goto_a
    iget-object p1, p0, Lwd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    iget-object v0, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v0

    const/16 v1, 0x6d

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const v0, 0x7f1203bc

    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    const v0, 0x7f120290

    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    const v0, 0x7f120114

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwd0;->m:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lwd0;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a0444

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    iput-object v0, p0, Lwd0;->t:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 2
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a00db

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lwd0;->m:Landroid/widget/Button;

    .line 3
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a0427

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    .line 4
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a0420

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lwd0;->p:Landroid/widget/Spinner;

    .line 5
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a0421

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lwd0;->q:Landroid/widget/Spinner;

    .line 6
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a019e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lwd0;->n:Landroid/widget/EditText;

    .line 7
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a027e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lwd0;->v:Landroid/widget/LinearLayout;

    .line 8
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a0291

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lwd0;->w:Landroid/widget/LinearLayout;

    .line 9
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a0115

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lwd0;->x:Landroid/widget/CheckBox;

    .line 10
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a0156

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lwd0;->D:Landroid/widget/TextView;

    .line 11
    iget-object v0, p0, Lwd0;->l:Landroid/view/View;

    const v1, 0x7f0a044e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SwitchCompat;

    iput-object v0, p0, Lwd0;->y:Landroidx/appcompat/widget/SwitchCompat;

    .line 12
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    iput-object v0, p0, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    return-void
.end method
