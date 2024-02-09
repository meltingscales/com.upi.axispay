.class public Luf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# static fields
.field public static s:I


# instance fields
.field public l:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public m:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public n:Landroid/widget/Button;

.field public o:Landroid/widget/Button;

.field public p:Landroid/view/View;

.field public q:Ljava/lang/String;

.field public r:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static B(I)Luf0;
    .locals 0

    .line 1
    sput p0, Luf0;->s:I

    .line 2
    new-instance p0, Luf0;

    invoke-direct {p0}, Luf0;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Luf0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Luf0;->y()V

    return-void
.end method

.method private synthetic z(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public synthetic A(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Luf0;->z(Landroid/view/View;)V

    return-void
.end method

.method public final C()V
    .locals 3

    .line 1
    iget-object v0, p0, Luf0;->p:Landroid/view/View;

    const v1, 0x7f0a0405

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Luf0;->r:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 3
    iget-object v0, p0, Luf0;->p:Landroid/view/View;

    const v1, 0x7f0a01c6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 4
    iget-object v0, p0, Luf0;->p:Landroid/view/View;

    const v1, 0x7f0a0134

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 5
    iget-object v0, p0, Luf0;->p:Landroid/view/View;

    const v1, 0x7f0a00c8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Luf0;->n:Landroid/widget/Button;

    .line 6
    iget-object v0, p0, Luf0;->p:Landroid/view/View;

    const v1, 0x7f0a00ca

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Luf0;->o:Landroid/widget/Button;

    .line 7
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public D()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120468

    .line 2
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120469

    .line 3
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12031e

    .line 4
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Loc0;

    invoke-direct {v4, p0}, Loc0;-><init>(Luf0;)V

    .line 5
    invoke-static {v0, v1, v2, v3, v4}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ca

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Luf0;->y()V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00b0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Luf0;->p:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Luf0;->C()V

    .line 3
    iget-object p1, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 4
    iget-object p1, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p3, 0x6

    invoke-virtual {p1, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 5
    iget-object p1, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 6
    iget-object p1, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 7
    iget-object p1, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const p2, 0x7f080243

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 8
    iget-object p1, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightIcon()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p1, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 10
    iget-object p1, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightIcon()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object p1, p0, Luf0;->n:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 12
    iget-object p1, p0, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 13
    iget-object p1, p0, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f060047

    invoke-static {p2, p3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 14
    iget-object p1, p0, Luf0;->n:Landroid/widget/Button;

    new-instance p2, Luf0$a;

    invoke-direct {p2, p0}, Luf0$a;-><init>(Luf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p1, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Luf0$b;

    invoke-direct {p2, p0}, Luf0$b;-><init>(Luf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 16
    iget-object p1, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Luf0$c;

    invoke-direct {p2, p0}, Luf0$c;-><init>(Luf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 17
    iget-object p1, p0, Luf0;->p:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    const v0, 0x7f1203af

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4b

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p2

    const/16 v0, 0x23

    if-eq p2, v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget p2, p0, Lxc0;->g:I

    if-ne p1, p2, :cond_1

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    new-instance p1, Lch0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-direct {p1, p2}, Lch0;-><init>(Landroid/content/Context;)V

    .line 6
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    sget v0, Lvg0;->d:I

    const v1, 0x2aee

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 7
    iget-object p2, p0, Luf0;->q:Ljava/lang/String;

    const/4 v0, 0x1

    const v1, 0x2aef

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2, v0}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 8
    invoke-virtual {p0}, Luf0;->D()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final y()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0b001b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    const v3, 0x2af0

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12035f

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 4
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120389

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 7
    iget-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    iget-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120351

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 10
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->E(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1202ea

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 14
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 16
    :cond_3
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->F(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 17
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1202e9

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 18
    iget-object v0, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 20
    :cond_4
    sget v0, Luf0;->s:I

    const/4 v1, 0x5

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    .line 21
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v0

    iget-object v1, p0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpa0;->e(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x25

    invoke-interface {v0, v1, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 23
    :cond_5
    new-instance v0, Lch0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1}, Lch0;-><init>(Landroid/content/Context;)V

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1, v2}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const v3, 0x2af1

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1, v2}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Leg0;->i(Landroid/app/Activity;)V

    .line 26
    new-instance v1, Lcom/olive/upi/transport/model/ChangeAppPin;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/ChangeAppPin;-><init>()V

    .line 27
    invoke-virtual {v0}, Lch0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setOldPin(Ljava/lang/String;)V

    .line 28
    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->REG_TYPE_DEVICE:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setType(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v2, p0, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Luf0;->q:Ljava/lang/String;

    .line 30
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setNewPin(Ljava/lang/String;)V

    .line 31
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x4b

    const/16 v4, 0x23

    invoke-direct {v2, v3, v4, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method
