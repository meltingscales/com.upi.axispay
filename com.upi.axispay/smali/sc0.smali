.class public Lsc0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# instance fields
.field public l:Landroid/widget/Button;

.field public m:Landroid/widget/LinearLayout;

.field public n:Landroid/widget/EditText;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/Button;

.field public q:Landroid/widget/CheckBox;

.field public r:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public s:Landroid/app/Activity;

.field public t:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lsc0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsc0;->A()V

    return-void
.end method

.method public static z()Lsc0;
    .locals 1

    .line 1
    new-instance v0, Lsc0;

    invoke-direct {v0}, Lsc0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 5

    .line 1
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12019f

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1204cb

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 5
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    iget-object v1, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa0;->P(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120500

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 7
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    iget-object v1, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa0;->f(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1204ea

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 9
    :cond_3
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc70;->o(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 10
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1201a1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 11
    :cond_4
    iget-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 12
    new-instance v0, Lcom/olive/upi/transport/model/VpaVerify;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/VpaVerify;-><init>()V

    .line 13
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x3cf0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/VpaVerify;->setCustomerid(Ljava/lang/String;)V

    .line 14
    iget-object v1, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/VpaVerify;->setVpa(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/VpaVerify;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 16
    new-instance v1, Lcom/olive/upi/transport/model/PayerInfo;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/PayerInfo;-><init>()V

    .line 17
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    sget-object v3, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v2, v3}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_5

    const/4 v3, 0x0

    .line 18
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setPayervpa(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setAccountnumber(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setName(Ljava/lang/String;)V

    const v2, 0x3cf1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setMcc(Ljava/lang/String;)V

    .line 22
    :cond_5
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/VpaVerify;->setPayerInfo(Lcom/olive/upi/transport/model/PayerInfo;)V

    .line 23
    iget-object v1, p0, Lsc0;->s:Landroid/app/Activity;

    invoke-static {v1}, Leg0;->i(Landroid/app/Activity;)V

    .line 24
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0xb

    const/16 v4, 0x4f

    invoke-direct {v2, v3, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f0a0100

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 4
    iget-object p1, p0, Lsc0;->q:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x3cf2

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const p1, 0x3cf3

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 7
    :goto_0
    iget-object v1, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lsc0;->n:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 10
    iget-object v2, p0, Lsc0;->o:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 11
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-static {v3}, Leg0;->i(Landroid/app/Activity;)V

    .line 12
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lsc0;->o:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 16
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0xb

    const/16 v3, 0x11

    invoke-direct {v1, v2, v3, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0062

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lsc0;->t:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Lsc0;->s:Landroid/app/Activity;

    .line 3
    invoke-virtual {p0}, Lsc0;->y()V

    .line 4
    iget-object p1, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 5
    iget-object p1, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lsc0$a;

    invoke-direct {p2, p0}, Lsc0$a;-><init>(Lsc0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 6
    iget-object p1, p0, Lsc0;->t:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3cf4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120213

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 6
    :cond_1
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f120098

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

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
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x11

    if-eq v0, v1, :cond_1

    const/16 v1, 0x4f

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget p2, p0, Lxc0;->g:I

    if-ne p1, p2, :cond_2

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 5
    iget-object p2, p0, Lsc0;->o:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lsc0;->m:Landroid/widget/LinearLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lsc0;->l:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 9
    iget-object p1, p0, Lsc0;->n:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lsc0;->p:Landroid/widget/Button;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lsc0;->o:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 12
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 13
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x3cf5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 15
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    const/4 p2, 0x1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0xb

    const/16 v2, 0x12

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2, v0}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12010f

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lsc0$c;

    invoke-direct {v0, p0}, Lsc0$c;-><init>(Lsc0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lsc0;->t:Landroid/view/View;

    const v1, 0x7f0a01b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 2
    iget-object v0, p0, Lsc0;->t:Landroid/view/View;

    const v1, 0x7f0a01a5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lsc0;->n:Landroid/widget/EditText;

    .line 3
    iget-object v0, p0, Lsc0;->t:Landroid/view/View;

    const v1, 0x7f0a01ff

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lsc0;->o:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lsc0;->t:Landroid/view/View;

    const v1, 0x7f0a00ff

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lsc0;->p:Landroid/widget/Button;

    const v1, 0x7f080069

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 6
    iget-object v0, p0, Lsc0;->p:Landroid/widget/Button;

    new-instance v1, Lsc0$b;

    invoke-direct {v1, p0}, Lsc0$b;-><init>(Lsc0;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v0, p0, Lsc0;->t:Landroid/view/View;

    const v1, 0x7f0a01d6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lsc0;->q:Landroid/widget/CheckBox;

    .line 8
    iget-object v0, p0, Lsc0;->t:Landroid/view/View;

    const v1, 0x7f0a0100

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lsc0;->l:Landroid/widget/Button;

    .line 9
    iget-object v0, p0, Lsc0;->t:Landroid/view/View;

    const v1, 0x7f0a0404

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lsc0;->m:Landroid/widget/LinearLayout;

    .line 10
    iget-object v0, p0, Lsc0;->l:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
