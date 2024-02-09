.class public Led0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;


# static fields
.field public static p:I


# instance fields
.field public l:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public m:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public n:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public o:Landroid/widget/Button;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static B()Led0;
    .locals 1

    .line 1
    new-instance v0, Led0;

    invoke-direct {v0}, Led0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Led0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Led0;->y()V

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

    invoke-direct {p0, p1}, Led0;->z(Landroid/view/View;)V

    return-void
.end method

.method public C()V
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

    new-instance v4, Lkb0;

    invoke-direct {v4, p0}, Lkb0;-><init>(Led0;)V

    .line 5
    invoke-static {v0, v1, v2, v3, v4}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d006d

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a01a6

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object p2, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p2, 0x7f0a01a4

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object p2, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p2, 0x7f0a01ad

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object p2, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p2, 0x7f0a00dc

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Led0;->o:Landroid/widget/Button;

    .line 6
    new-instance p3, Led0$a;

    invoke-direct {p3, p0}, Led0$a;-><init>(Led0;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object p2, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p3, 0x4

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 8
    iget-object p2, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0b001b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 9
    iget-object p2, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 10
    iget-object p2, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 11
    iget-object p2, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 12
    iget-object p2, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 13
    iget-object p2, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p3, 0x7f080243

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftIcon(I)V

    .line 14
    iget-object p2, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftIcon(I)V

    .line 15
    iget-object p2, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftIcon(I)V

    .line 16
    iget-object p2, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p3, 0x257d

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setEditTextImeOptions(Ljava/lang/String;)V

    .line 17
    iget-object p2, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setEditTextImeOptions(Ljava/lang/String;)V

    .line 18
    iget-object p2, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p3, 0x257e

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setEditTextImeOptions(Ljava/lang/String;)V

    .line 19
    iget-object p2, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    new-instance p3, Led0$b;

    invoke-direct {p3, p0}, Led0$b;-><init>(Led0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 20
    iget-object p2, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    new-instance p3, Led0$c;

    invoke-direct {p3, p0}, Led0$c;-><init>(Led0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 21
    iget-object p2, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    new-instance p3, Led0$d;

    invoke-direct {p3, p0}, Led0$d;-><init>(Led0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

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

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const p2, 0x257f

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    sget p1, Led0;->p:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Led0;->p:I

    .line 6
    iget-object p1, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p2, 0x2580

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestFocus()Z

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const/4 p2, 0x0

    const v0, 0x7f120008

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Leg0;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f1200ca

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2b

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

    :cond_0
    const/4 p1, 0x0

    .line 4
    sput p1, Led0;->p:I

    .line 5
    invoke-static {}, Leg0;->B()V

    .line 6
    new-instance p1, Lch0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-direct {p1, p2}, Lch0;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    const v1, 0x2581

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2, v0}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 8
    invoke-virtual {p0}, Led0;->C()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final y()V
    .locals 5

    .line 1
    iget-object v0, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0b001b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    const v3, 0x2582

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12018f

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12018c

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 8
    iget-object v0, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120389

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return-void

    .line 10
    :cond_2
    iget-object v0, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1202e8

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return-void

    .line 14
    :cond_3
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 15
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120351

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return-void

    .line 18
    :cond_4
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->J(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 19
    iget-object v0, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1204f7

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return-void

    .line 20
    :cond_5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 21
    new-instance v0, Lcom/olive/upi/transport/model/ChangeAppPin;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/ChangeAppPin;-><init>()V

    .line 22
    iget-object v1, p0, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/ChangeAppPin;->setOldPin(Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/ChangeAppPin;->setNewPin(Ljava/lang/String;)V

    .line 24
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x2b

    const/16 v4, 0x23

    invoke-direct {v2, v3, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
