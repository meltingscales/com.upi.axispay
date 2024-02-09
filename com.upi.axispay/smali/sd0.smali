.class public Lsd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;
.implements Lng0;


# static fields
.field public static E:I


# instance fields
.field public A:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public B:Ls90;

.field public C:Ljava/lang/Boolean;

.field public D:Ljava/lang/Boolean;

.field public l:Landroid/view/View;

.field public m:[Ljava/lang/String;

.field public n:Landroid/widget/Button;

.field public o:Landroid/widget/Button;

.field public p:Landroid/widget/LinearLayout;

.field public q:Landroid/widget/LinearLayout;

.field public r:Landroid/widget/LinearLayout;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Lcom/upi/axispay/custom/CustomAutoComplete;

.field public x:Landroid/widget/CheckBox;

.field public y:Ljava/lang/String;

.field public z:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/MandateCreateRequest;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/MandateCreateRequest;-><init>()V

    .line 3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lsd0;->C:Ljava/lang/Boolean;

    .line 4
    iput-object v0, p0, Lsd0;->D:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic x(Lsd0;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lsd0;->n:Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic y(Lsd0;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lsd0;->o:Landroid/widget/Button;

    return-object p0
.end method

.method public static z(I)Lsd0;
    .locals 0

    .line 1
    sput p0, Lsd0;->E:I

    .line 2
    new-instance p0, Lsd0;

    invoke-direct {p0}, Lsd0;-><init>()V

    return-object p0
.end method


# virtual methods
.method public A(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030007

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lsd0;->m:[Ljava/lang/String;

    const v0, 0x7f0a0444

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 3
    iget-object v1, p0, Lsd0;->m:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    const v0, 0x7f0a0298

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lsd0;->p:Landroid/widget/LinearLayout;

    const v0, 0x7f0a01b5

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/CustomAutoComplete;

    iput-object v0, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    const v0, 0x7f0a0273

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v0, p0, Lsd0;->z:Lcom/google/android/material/textfield/TextInputLayout;

    const v0, 0x7f0a01b2

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lsd0;->q:Landroid/widget/LinearLayout;

    const v0, 0x7f0a026e

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lsd0;->r:Landroid/widget/LinearLayout;

    const v0, 0x7f0a03c4

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lsd0;->s:Landroid/widget/TextView;

    const v0, 0x7f0a04cf

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lsd0;->t:Landroid/widget/TextView;

    const v0, 0x7f0a04d0

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lsd0;->u:Landroid/widget/TextView;

    const v0, 0x7f0a00ff

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lsd0;->n:Landroid/widget/Button;

    const v1, 0x7f080069

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    const v0, 0x7f0a01d6

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lsd0;->x:Landroid/widget/CheckBox;

    const v0, 0x7f0a01cd

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lsd0;->v:Landroid/widget/TextView;

    const v0, 0x7f0a00ef

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lsd0;->o:Landroid/widget/Button;

    .line 17
    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object p1, p0, Lsd0;->n:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final B()V
    .locals 6

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v1, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {v0, v1}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lsd0;->C(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    const/4 v1, 0x1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x6a

    const/16 v4, 0x12

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public final C(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ls90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ls90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lsd0;->B:Ls90;

    .line 2
    iget-object p1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 3
    iget-object p1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    return-void
.end method

.method public final D()V
    .locals 5

    .line 1
    iget-object v0, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lsd0;->v:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v0, :cond_4

    .line 3
    iget-object v1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x3

    if-ge v1, v3, :cond_1

    .line 5
    iget-object v0, p0, Lsd0;->v:Landroid/widget/TextView;

    const v1, 0x7f1204cb

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 6
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc70;->o(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 7
    iget-object v0, p0, Lsd0;->v:Landroid/widget/TextView;

    const v1, 0x7f1201a1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 8
    :cond_2
    iget-object v1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v1, v3}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 9
    new-instance v1, Lcom/olive/upi/transport/model/VpaVerify;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/VpaVerify;-><init>()V

    .line 10
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x399a

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/VpaVerify;->setCustomerid(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/VpaVerify;->setVpa(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/VpaVerify;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 13
    new-instance v0, Lcom/olive/upi/transport/model/PayerInfo;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/PayerInfo;-><init>()V

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    sget-object v4, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v3, v4}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 15
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setPayervpa(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setAccountnumber(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setName(Ljava/lang/String;)V

    const v2, 0x399b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setMcc(Ljava/lang/String;)V

    .line 19
    :cond_3
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/VpaVerify;->setPayerInfo(Lcom/olive/upi/transport/model/PayerInfo;)V

    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 21
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x6a

    const/16 v4, 0x4f

    invoke-direct {v2, v3, v4, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 22
    :cond_4
    :goto_0
    iget-object v0, p0, Lsd0;->v:Landroid/widget/TextView;

    const v1, 0x7f12019f

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ef

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a00ff

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lsd0;->D()V

    goto/16 :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lsd0;->C:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 4
    iget-object p1, p0, Lsd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 6
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 7
    iget-object v0, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lsd0;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lsd0;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    const v0, 0x399c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x6a

    const/16 v3, 0x11

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 12
    :cond_2
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 13
    iget-object v0, p0, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lsd0;->u:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lsd0;->u:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v1, Lsd0;->E:I

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setMandateType(I)V

    .line 17
    iget-object v0, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 18
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x6c

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 19
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lsd0;->D:Ljava/lang/Boolean;

    .line 20
    invoke-virtual {p0}, Lsd0;->D()V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0082

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lsd0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0, p1}, Lsd0;->A(Landroid/view/View;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 4
    sget p1, Lsd0;->E:I

    const/4 p2, 0x1

    const/16 p3, 0x6a

    if-ne p1, p2, :cond_0

    const p1, 0x7f120114

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lxc0;->v(ILjava/lang/String;)V

    .line 6
    iget-object p1, p0, Lsd0;->z:Lcom/google/android/material/textfield/TextInputLayout;

    const p3, 0x7f12033d

    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const p1, 0x7f1203bc

    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lxc0;->v(ILjava/lang/String;)V

    .line 8
    iget-object p1, p0, Lsd0;->z:Lcom/google/android/material/textfield/TextInputLayout;

    const p3, 0x7f12033a

    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    const p1, 0x7f120290

    .line 9
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lxc0;->v(ILjava/lang/String;)V

    .line 10
    :cond_2
    :goto_0
    iget-object p1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {p1, p2}, Landroid/widget/AutoCompleteTextView;->setFocusable(Z)V

    .line 11
    iget-object p1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    new-instance p2, Lsd0$a;

    invoke-direct {p2, p0}, Lsd0$a;-><init>(Lsd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 12
    iget-object p1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    new-instance p2, Lsd0$b;

    invoke-direct {p2, p0}, Lsd0$b;-><init>(Lsd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/AutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 13
    iget-object p1, p0, Lsd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x4f

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lsd0;->v:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lsd0;->v:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    sget v0, Lsd0;->E:I

    const/4 v1, 0x1

    const/16 v2, 0x6a

    if-ne v0, v1, :cond_0

    const v0, 0x399d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v2, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 4
    iget-object v0, p0, Lsd0;->z:Lcom/google/android/material/textfield/TextInputLayout;

    const v2, 0x7f12033d

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    const v0, 0x399e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p0, v2, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 6
    iget-object v0, p0, Lsd0;->z:Lcom/google/android/material/textfield/TextInputLayout;

    const v2, 0x7f12033a

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    const v0, 0x399f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p0, v2, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 8
    :cond_2
    :goto_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v0

    iput-object v0, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 10
    invoke-virtual {p0}, Lsd0;->B()V

    .line 11
    iget-object v0, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 12
    iget-object v1, p0, Lsd0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 13
    iget-object v1, p0, Lsd0;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 14
    iget-object v1, p0, Lsd0;->n:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 15
    iget-object v1, p0, Lsd0;->s:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    iget-object v1, p0, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget-object v1, p0, Lsd0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 18
    iget-object v1, p0, Lsd0;->o:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 19
    iget-object v1, p0, Lsd0;->u:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v1, p0, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    iget-object v1, p0, Lsd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 23
    iget-object v1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 24
    iget-object v1, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 25
    iget-object v1, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    goto/16 :goto_2

    .line 26
    :cond_3
    iget-object v4, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v4

    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYER_UPDATE_MANDATE:I

    if-eq v4, v5, :cond_5

    iget-object v4, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v4

    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYEE_UPDATE_MANDATE:I

    if-ne v4, v5, :cond_4

    goto :goto_1

    .line 27
    :cond_4
    iget-object v0, p0, Lsd0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 28
    iget-object v0, p0, Lsd0;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 29
    iget-object v0, p0, Lsd0;->n:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 30
    iget-object v0, p0, Lsd0;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 31
    iget-object v0, p0, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 32
    iget-object v0, p0, Lsd0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 33
    iget-object v0, p0, Lsd0;->o:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 34
    iget-object v0, p0, Lsd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_2

    .line 35
    :cond_5
    :goto_1
    iget-object v1, p0, Lsd0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 36
    iget-object v1, p0, Lsd0;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 37
    iget-object v1, p0, Lsd0;->n:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 38
    iget-object v1, p0, Lsd0;->s:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 39
    iget-object v1, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v0, p0, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 41
    iget-object v0, p0, Lsd0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 42
    iget-object v0, p0, Lsd0;->o:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 43
    iget-object v0, p0, Lsd0;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    iget-object v0, p0, Lsd0;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x11

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    const/16 v1, 0x12

    if-eq v0, v1, :cond_4

    const/16 v1, 0x4f

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget p2, p0, Lxc0;->g:I

    if-ne p1, p2, :cond_6

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_0

    .line 5
    :cond_0
    iget-object p1, p2, Lcom/olive/upi/transport/api/Result;->mcccode:Ljava/lang/String;

    if-eqz p1, :cond_1

    const v0, 0x39a0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    :cond_1
    iget-object p1, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->isP2P(Z)V

    .line 7
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lsd0;->C:Ljava/lang/Boolean;

    .line 8
    iget-object p1, p0, Lsd0;->D:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 10
    iget-object p2, p0, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 11
    iget-object p2, p0, Lsd0;->u:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 12
    iget-object p2, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v0, p0, Lsd0;->u:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    sget v0, Lsd0;->E:I

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setMandateType(I)V

    .line 14
    iget-object p2, p0, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 15
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x6c

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 16
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lsd0;->y:Ljava/lang/String;

    .line 17
    iget-object p1, p0, Lsd0;->q:Landroid/widget/LinearLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Lsd0;->r:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 19
    iget-object p1, p0, Lsd0;->n:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 20
    iget-object p1, p0, Lsd0;->s:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    iget-object p1, p0, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object p1, p0, Lsd0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 23
    iget-object p1, p0, Lsd0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 24
    iget-object p1, p0, Lsd0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {p2}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    iget-object p1, p0, Lsd0;->t:Landroid/widget/TextView;

    iget-object p2, p0, Lsd0;->y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 26
    :cond_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 27
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqa0;->n0(Ljava/util/ArrayList;)V

    .line 28
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {p1, p2}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsd0;->C(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 29
    :cond_5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12010f

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_6
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method
