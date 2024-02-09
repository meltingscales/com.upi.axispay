.class public Lmf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;


# instance fields
.field public l:Lcom/upi/axispay/custom/PinFieldLayout;

.field public m:Lcom/upi/axispay/custom/PinFieldLayout;

.field public n:Landroid/widget/Button;

.field public o:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method


# virtual methods
.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00a8

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a01c6

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/PinFieldLayout;

    iput-object p2, p0, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    const p2, 0x7f0a03b9

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/PinFieldLayout;

    iput-object p2, p0, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    const p2, 0x7f0a025d

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/CheckBox;

    iput-object p2, p0, Lmf0;->o:Landroid/widget/CheckBox;

    .line 5
    iget-object p2, p0, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f12018c

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/PinFieldLayout;->setPinTextHint(Ljava/lang/String;)V

    .line 6
    iget-object p2, p0, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f120389

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/PinFieldLayout;->setPinTextHint(Ljava/lang/String;)V

    .line 7
    iget-object p2, p0, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f1202eb

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/PinFieldLayout;->setEditTextImeOptions(Ljava/lang/String;)V

    .line 8
    iget-object p2, p0, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f120159

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/PinFieldLayout;->setEditTextImeOptions(Ljava/lang/String;)V

    const p2, 0x7f0a00cb

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lmf0;->n:Landroid/widget/Button;

    .line 10
    new-instance p3, Lmf0$a;

    invoke-direct {p3, p0}, Lmf0$a;-><init>(Lmf0;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object p2, p0, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/PinFieldLayout;->getTextField()Landroid/widget/EditText;

    move-result-object p2

    new-instance p3, Lmf0$b;

    invoke-direct {p3, p0}, Lmf0$b;-><init>(Lmf0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 12
    iget-object p2, p0, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/PinFieldLayout;->getTextField()Landroid/widget/EditText;

    move-result-object p2

    new-instance p3, Lmf0$c;

    invoke-direct {p3, p0}, Lmf0$c;-><init>(Lmf0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    const v0, 0x7f1203cb

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 p2, 0x23

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lmf0;->x()V

    .line 4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0xb

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lmg0;->o(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public x()V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d0122

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0a0449

    .line 3
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    const v3, 0x7f0a016f

    .line 4
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 6
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 7
    new-instance v1, Lmf0$d;

    invoke-direct {v1, p0, v0}, Lmf0$d;-><init>(Lmf0;Landroid/app/AlertDialog;)V

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    new-instance v1, Lmf0$e;

    invoke-direct {v1, p0, v0}, Lmf0$e;-><init>(Lmf0;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 10
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
