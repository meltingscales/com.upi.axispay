.class public Ljf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public A:I

.field public l:Lcom/olive/upi/transport/model/Registration;

.field public m:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public n:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public o:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public p:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public q:Landroid/widget/Button;

.field public r:Landroid/widget/CheckBox;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/view/View;

.field public v:Landroid/widget/LinearLayout;

.field public w:Z

.field public x:Z

.field public y:I

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljf0;->y:I

    const/16 v0, 0x6c

    .line 3
    iput v0, p0, Ljf0;->A:I

    return-void
.end method

.method private synthetic C(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static E(Lcom/olive/upi/transport/model/Registration;)Ljf0;
    .locals 0

    .line 1
    new-instance p0, Ljf0;

    invoke-direct {p0}, Ljf0;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Ljf0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljf0;->A()V

    return-void
.end method

.method public static synthetic y(Ljf0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljf0;->H()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12018b

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1201a2

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120506

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->H(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 9
    iget-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12020e

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 10
    iget-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x2b10

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object v0, p0, Ljf0;->r:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-nez v0, :cond_4

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f12005b

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_4
    invoke-virtual {p0}, Ljf0;->I()V

    :goto_0
    return-void
.end method

.method public final B(I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz p1, :cond_0

    const v1, 0x2b11

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public synthetic D(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljf0;->C(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public final F()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a03fe

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ljf0;->t:Landroid/widget/TextView;

    .line 2
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a01c8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Ljf0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 3
    iget-object v0, p0, Ljf0;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 4
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a01c5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 5
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a01c4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 6
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a025d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Ljf0;->r:Landroid/widget/CheckBox;

    .line 7
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a04e5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ljf0;->s:Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a01c7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 9
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a0213

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Ljf0;->v:Landroid/widget/LinearLayout;

    .line 10
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a00c8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Ljf0;->q:Landroid/widget/Button;

    const v1, 0x7f1200fe

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 12
    iget-object v0, p0, Ljf0;->u:Landroid/view/View;

    const v1, 0x7f0a03fa

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 13
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v0

    invoke-virtual {v0}, Lpa0;->d()I

    move-result v0

    const v1, 0x7f0a03f3

    if-ne v0, v1, :cond_0

    .line 14
    iget-object v0, p0, Ljf0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1203e0

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 15
    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->REG_TYPE_DEVICE:Ljava/lang/String;

    iput-object v0, p0, Ljf0;->z:Ljava/lang/String;

    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Ljf0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1203f1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 17
    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->REG_TYPE_PASSCODE:Ljava/lang/String;

    iput-object v0, p0, Ljf0;->z:Ljava/lang/String;

    .line 18
    :goto_0
    iget-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    return-void
.end method

.method public G()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x25

    const/16 v3, 0xf

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public final H()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Ljf0;->q:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Ljf0;->q:Landroid/widget/Button;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f060049

    invoke-static {v1, v2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Ljf0;->q:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 5
    iget-object v0, p0, Ljf0;->q:Landroid/widget/Button;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f060047

    invoke-static {v1, v2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    :goto_1
    return-void
.end method

.method public final I()V
    .locals 11

    .line 1
    iget-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/16 v2, 0x25

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    new-instance v0, Lcom/olive/upi/transport/model/UserRegister;

    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v1

    invoke-virtual {v1}, Lpa0;->b()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Ljf0;->z:Ljava/lang/String;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/olive/upi/transport/model/UserRegister;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v3, v2, v2, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x1

    const v4, 0x7f120210

    if-le v1, v3, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x3

    if-ge v1, v3, :cond_1

    .line 7
    iget-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 8
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc70;->o(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 9
    iget-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x1e

    if-le v1, v3, :cond_3

    .line 11
    iget-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const v1, 0x2b12

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 13
    iget-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v5

    const v0, 0x7f120454

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    const v0, 0x7f120110

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljf0$g;

    invoke-direct {v10, p0}, Ljf0$g;-><init>(Ljf0;)V

    invoke-static/range {v5 .. v10}, Leg0;->u(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 15
    :cond_4
    iget-object v0, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x39

    iget-object v4, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v4}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0213

    if-eq p1, v0, :cond_6

    const v0, 0x7f0a0549

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v1, 0x7f120211

    if-eqz v0, :cond_1

    .line 4
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    const v0, 0x2b13

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_3

    .line 8
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f1204cb

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc70;->o(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 10
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f1201a1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_4
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 12
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x25

    const/16 v2, 0x39

    iget-object v3, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 15
    :cond_5
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f120191

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    goto :goto_0

    .line 16
    :cond_6
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00a7

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ljf0;->u:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Ljf0;->F()V

    .line 3
    iget-object p1, p0, Ljf0;->l:Lcom/olive/upi/transport/model/Registration;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Registration;->getType()Ljava/lang/String;

    move-result-object p1

    const p2, 0x2b14

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Ljf0;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Ljf0;->v:Landroid/widget/LinearLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :goto_0
    iget-object p1, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 7
    iget-object p1, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/16 p2, 0x14

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 8
    iget-object p1, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setSingleLine()V

    .line 9
    iget-object p1, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const p2, 0x7f080229

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 10
    iget-object p1, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const p2, 0x7f0800dc

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 11
    iget-object p1, p0, Ljf0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const p2, 0x7f0801d6

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 12
    iget-object p1, p0, Ljf0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setActive(Z)V

    .line 13
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const p2, 0x7f080252

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 14
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Ljf0$a;

    invoke-direct {p2, p0}, Ljf0$a;-><init>(Ljf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 15
    iget-object p1, p0, Ljf0;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightText()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    invoke-virtual {p0}, Ljf0;->z()V

    .line 18
    iget-object p1, p0, Ljf0;->s:Landroid/widget/TextView;

    new-instance p2, Ljf0$b;

    invoke-direct {p2, p0}, Ljf0$b;-><init>(Ljf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object p1, p0, Ljf0;->q:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 20
    iget-object p1, p0, Ljf0;->q:Landroid/widget/Button;

    new-instance p2, Ljf0$c;

    invoke-direct {p2, p0}, Ljf0$c;-><init>(Ljf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object p1, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Ljf0$d;

    invoke-direct {p2, p0}, Ljf0$d;-><init>(Ljf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 22
    iget-object p1, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Ljf0$e;

    invoke-direct {p2, p0}, Ljf0$e;-><init>(Ljf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 23
    invoke-virtual {p0}, Ljf0;->H()V

    .line 24
    iget-object p1, p0, Ljf0;->u:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 10

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x39

    const v2, 0x7f120008

    const/4 v3, 0x1

    if-ne v0, v1, :cond_4

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const v1, 0x2b15

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_1
    const v1, 0x2b16

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_0

    :pswitch_2
    const v1, 0x2b17

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_1

    goto :goto_1

    .line 5
    :pswitch_3
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Leg0;->B()V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    const p1, 0x7f120454

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const p1, 0x7f120110

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljf0$f;

    invoke-direct {v9, p0}, Ljf0$f;-><init>(Ljf0;)V

    invoke-static/range {v4 .. v9}, Leg0;->u(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 8
    :goto_1
    iget p1, p0, Ljf0;->y:I

    if-le p1, v3, :cond_3

    .line 9
    invoke-static {}, Leg0;->B()V

    .line 10
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_3
    add-int/2addr p1, v3

    .line 11
    iput p1, p0, Ljf0;->y:I

    .line 12
    invoke-virtual {p0}, Ljf0;->I()V

    goto/16 :goto_2

    .line 13
    :cond_4
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x25

    if-ne v0, v1, :cond_7

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const v0, 0x2b18

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 16
    iget p1, p0, Ljf0;->y:I

    if-le p1, v3, :cond_5

    .line 17
    invoke-static {}, Leg0;->B()V

    .line 18
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    add-int/2addr p1, v3

    .line 19
    iput p1, p0, Ljf0;->y:I

    .line 20
    invoke-virtual {p0}, Ljf0;->I()V

    goto :goto_2

    .line 21
    :cond_6
    invoke-static {}, Leg0;->B()V

    .line 22
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f1201b3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lmc0;

    invoke-direct {v1, p0}, Lmc0;-><init>(Ljf0;)V

    const v2, 0x2b19

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, p2, v0, v1}, Leg0;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_2

    .line 23
    :cond_7
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_8

    const/16 p1, 0x3a

    .line 24
    invoke-virtual {p0, p1}, Ljf0;->B(I)V

    goto :goto_2

    .line 25
    :cond_8
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_a

    .line 26
    invoke-static {}, Leg0;->B()V

    .line 27
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const p2, 0x2b1a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 28
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Ljg0;->W(Landroid/app/Activity;)V

    goto :goto_2

    .line 29
    :cond_9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_2

    .line 30
    :cond_a
    invoke-static {}, Leg0;->B()V

    .line 31
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_b
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x252324
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    const v0, 0x7f1203af

    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x25

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 4
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v0

    invoke-virtual {v0}, Lpa0;->c()Lcom/olive/upi/transport/model/Registration;

    move-result-object v0

    iput-object v0, p0, Ljf0;->l:Lcom/olive/upi/transport/model/Registration;

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/16 v2, 0x25

    if-eq p1, v0, :cond_4

    const/16 v0, 0xf

    const/4 v3, 0x0

    if-eq p1, v0, :cond_2

    const/16 v0, 0x17

    if-eq p1, v0, :cond_4

    if-eq p1, v2, :cond_1

    const/16 v0, 0x39

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iput v3, p0, Ljf0;->y:I

    .line 3
    iget-object p1, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f06015c

    invoke-virtual {p1, p2, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;I)V

    .line 4
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object p1

    invoke-virtual {p1}, Lpa0;->b()Ljava/lang/String;

    move-result-object v4

    .line 5
    new-instance p1, Lcom/olive/upi/transport/model/UserRegister;

    iget-object p2, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v5

    iget-object p2, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v6

    iget-object p2, p0, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Ljf0;->z:Ljava/lang/String;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/olive/upi/transport/model/UserRegister;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v0, v2, v2, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 7
    :cond_1
    iput v3, p0, Ljf0;->y:I

    .line 8
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    iget-object p2, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p2

    const v3, 0x2b1b

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3, p2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object p2

    invoke-virtual {p2}, Lpa0;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 10
    new-instance p2, Lcom/olive/upi/transport/model/Authenticate;

    invoke-direct {p2, p1}, Lcom/olive/upi/transport/model/Authenticate;-><init>(Ljava/lang/String;)V

    const v3, 0x2b1c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-virtual {p2, v3}, Lcom/olive/upi/transport/model/Authenticate;->setAppVersion(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/model/Authenticate;->setType(I)V

    .line 13
    new-instance v3, Lch0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-direct {v3, v4}, Lch0;-><init>(Landroid/content/Context;)V

    const v4, 0x2b1d

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-virtual {v3, v4, p1, v1}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 15
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v1, v2, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 16
    :cond_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    .line 18
    invoke-virtual {p0, v3}, Ljf0;->B(I)V

    goto/16 :goto_0

    :cond_3
    const/16 p1, 0x3a

    .line 19
    invoke-virtual {p0, p1}, Ljf0;->B(I)V

    goto/16 :goto_0

    .line 20
    :cond_4
    invoke-virtual {p0}, Ljf0;->G()V

    .line 21
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    iget-object v3, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v3

    const v4, 0x2b1e

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v3, 0x2b1f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ln70;->A(Ljava/lang/String;Z)V

    .line 23
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v3, 0x2b20

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ln70;->A(Ljava/lang/String;Z)V

    .line 24
    invoke-static {}, Leg0;->B()V

    .line 25
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/TokenResponse;

    if-eqz p2, :cond_5

    .line 26
    new-instance v0, Lcom/olive/upi/transport/model/MasterUpdate;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/MasterUpdate;-><init>()V

    .line 27
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getBannerVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setBanner(I)V

    .line 28
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getEncryptionFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setEncryptionFlag(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getBannerVersion()I

    move-result v3

    const v4, 0x2b21

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 30
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getDthOperatorVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setDthOperator(I)V

    .line 31
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getDthOperatorVersion()I

    move-result v3

    const v4, 0x2b22

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 32
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getMobOperatorVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setMobileOperator(I)V

    .line 33
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getMobOperatorVersion()I

    move-result v3

    const v4, 0x2b23

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 34
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getBillpayMaxAmtVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setBill_pay_max(I)V

    .line 35
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getBillpayMaxAmtVersion()I

    move-result v3

    const v4, 0x2b24

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 36
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getAsap()Ljava/lang/String;

    move-result-object v3

    const v4, 0x2b25

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TokenResponse;->getChecksumWebUrl()Ljava/lang/String;

    move-result-object p2

    const v1, 0x2b26

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lqa0;->i0(Lcom/olive/upi/transport/model/MasterUpdate;)V

    .line 39
    :cond_5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const p2, 0x2b27

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x2b28

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p2, 0x7f1203af

    .line 41
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x2b29

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x2b2a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 43
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-direct {p2, v2, v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public z()V
    .locals 7

    .line 1
    iget v0, p0, Ljf0;->A:I

    const v1, 0x2b2b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x2b2c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid/provider/ContactsContract$Profile;->CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x2b2d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    iget-object v2, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-static {v1}, Ljg0;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 7
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Ljf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 10
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    .line 11
    iget-object v4, v3, Landroid/accounts/Account;->type:Ljava/lang/String;

    const v5, 0x2b2e

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 13
    iget-object v0, v3, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 14
    iget-object v1, p0, Ljf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method
