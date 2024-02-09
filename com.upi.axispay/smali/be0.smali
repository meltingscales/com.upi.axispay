.class public Lbe0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;
.implements Lng0;


# instance fields
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

.field public v:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public w:Landroid/widget/CheckBox;

.field public x:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lbe0;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lbe0;->n:Landroid/widget/Button;

    return-object p0
.end method

.method public static y()Lbe0;
    .locals 1

    .line 1
    new-instance v0, Lbe0;

    invoke-direct {v0}, Lbe0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ef

    const/4 v1, 0x0

    const/16 v2, 0x73

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a00ff

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lbe0;->w:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 5
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 6
    iget-object v0, p0, Lbe0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lbe0;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lbe0;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    const v0, 0x2ce

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setFavorite(Ljava/lang/String;)V

    .line 10
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x72

    const/16 v5, 0x11

    invoke-direct {v3, v4, v5, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 11
    :cond_2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

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

    iput-object p1, p0, Lbe0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0, p1}, Lbe0;->z(Landroid/view/View;)V

    .line 3
    iget-object p1, p0, Lbe0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lbe0$a;

    invoke-direct {p2, p0}, Lbe0$a;-><init>(Lbe0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 4
    iget-object p1, p0, Lbe0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x11

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4f

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lbe0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12010f

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 6
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x73

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f1203bc

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x72

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
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x11

    const/4 v2, 0x0

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

    iput-object p1, p0, Lbe0;->x:Ljava/lang/String;

    .line 5
    iget-object p1, p0, Lbe0;->q:Landroid/widget/LinearLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lbe0;->r:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lbe0;->n:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lbe0;->s:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lbe0;->t:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lbe0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lbe0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lbe0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lbe0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object p1, p0, Lbe0;->t:Landroid/widget/TextView;

    iget-object p2, p0, Lbe0;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12010f

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 15
    :cond_2
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public z(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030007

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbe0;->m:[Ljava/lang/String;

    const v0, 0x7f0a0444

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 3
    iget-object v1, p0, Lbe0;->m:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    const v0, 0x7f0a0298

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lbe0;->p:Landroid/widget/LinearLayout;

    const v0, 0x7f0a01b5

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lbe0;->v:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f0a01b2

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lbe0;->q:Landroid/widget/LinearLayout;

    const v0, 0x7f0a026e

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lbe0;->r:Landroid/widget/LinearLayout;

    const v0, 0x7f0a03c4

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbe0;->s:Landroid/widget/TextView;

    const v0, 0x7f0a04cf

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbe0;->t:Landroid/widget/TextView;

    const v0, 0x7f0a04d0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbe0;->u:Landroid/widget/TextView;

    const v0, 0x7f0a00ff

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lbe0;->n:Landroid/widget/Button;

    const v1, 0x7f080069

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    const v0, 0x7f0a01d6

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lbe0;->w:Landroid/widget/CheckBox;

    const v0, 0x7f0a00ef

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lbe0;->o:Landroid/widget/Button;

    .line 15
    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object p1, p0, Lbe0;->n:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
