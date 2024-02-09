.class public Lyd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public l:Landroid/view/View;

.field public m:[Ljava/lang/String;

.field public n:[Ljava/lang/String;

.field public o:Landroid/widget/Button;

.field public p:Landroid/widget/EditText;

.field public q:Landroid/widget/EditText;

.field public r:Landroid/widget/EditText;

.field public s:Landroid/widget/ImageView;

.field public t:Landroid/widget/ImageView;

.field public u:Landroid/widget/Spinner;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0x3aca

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x3acb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3acc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lyd0;->n:[Ljava/lang/String;

    return-void
.end method

.method public static x()Lyd0;
    .locals 1

    .line 1
    new-instance v0, Lyd0;

    invoke-direct {v0}, Lyd0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00db

    if-eq p1, v0, :cond_2

    const v0, 0x7f0a013a

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a013f

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lyd0;->z()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0}, Lyd0;->y()V

    goto :goto_0

    .line 4
    :cond_2
    new-instance p1, Lcom/olive/upi/transport/model/Mandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/Mandate;-><init>()V

    .line 5
    iget-object v0, p0, Lyd0;->p:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Mandate;->setValiditystart(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lyd0;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Mandate;->setValidityend(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lyd0;->r:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Mandate;->setAmount(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqa0;->e0(Lcom/olive/upi/transport/model/Mandate;)V

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x74

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

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

    iput-object p1, p0, Lyd0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f030007

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lyd0;->m:[Ljava/lang/String;

    .line 3
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a0444

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 4
    iget-object p2, p0, Lyd0;->m:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a01b1

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lyd0;->p:Landroid/widget/EditText;

    .line 6
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a019f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lyd0;->q:Landroid/widget/EditText;

    .line 7
    iget-object p1, p0, Lyd0;->p:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 8
    iget-object p1, p0, Lyd0;->p:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setClickable(Z)V

    .line 9
    iget-object p1, p0, Lyd0;->q:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 10
    iget-object p1, p0, Lyd0;->q:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setClickable(Z)V

    .line 11
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a00db

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lyd0;->o:Landroid/widget/Button;

    .line 12
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a013f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lyd0;->s:Landroid/widget/ImageView;

    .line 13
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a013a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lyd0;->t:Landroid/widget/ImageView;

    .line 14
    iget-object p1, p0, Lyd0;->o:Landroid/widget/Button;

    const p2, 0x7f080096

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 15
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a0199

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lyd0;->r:Landroid/widget/EditText;

    const/4 p2, 0x2

    .line 16
    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setInputType(I)V

    .line 17
    iget-object p1, p0, Lyd0;->s:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object p1, p0, Lyd0;->t:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object p1, p0, Lyd0;->o:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    const p2, 0x7f0a041c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lyd0;->u:Landroid/widget/Spinner;

    .line 21
    new-instance p1, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    iget-object p3, p0, Lyd0;->n:[Ljava/lang/String;

    const v0, 0x1090008

    invoke-direct {p1, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const p2, 0x1090009

    .line 22
    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 23
    iget-object p2, p0, Lyd0;->u:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 24
    iget-object p1, p0, Lyd0;->u:Landroid/widget/Spinner;

    new-instance p2, Lyd0$a;

    invoke-direct {p2, p0}, Lyd0$a;-><init>(Lyd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 25
    iget-object p1, p0, Lyd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f1203bc

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x73

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    return-void
.end method

.method public final y()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v2, 0x2

    .line 4
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 6
    new-instance v0, Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    new-instance v5, Lyd0$c;

    invoke-direct {v5, p0}, Lyd0$c;-><init>(Lyd0;)V

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 7
    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    return-void
.end method

.method public final z()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/4 v2, 0x2

    .line 4
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 6
    new-instance v0, Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    new-instance v5, Lyd0$b;

    invoke-direct {v5, p0}, Lyd0$b;-><init>(Lyd0;)V

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 7
    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    return-void
.end method
