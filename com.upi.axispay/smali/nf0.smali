.class public Lnf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static u:I


# instance fields
.field public l:Landroid/widget/RadioGroup;

.field public m:Landroid/widget/Button;

.field public n:Landroid/view/View;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/RadioButton;

.field public q:Landroid/widget/RadioButton;

.field public r:Landroid/app/Activity;

.field public s:Z

.field public t:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lnf0;->s:Z

    return-void
.end method

.method public static A(I)Lnf0;
    .locals 0

    .line 1
    sput p0, Lnf0;->u:I

    .line 2
    new-instance p0, Lnf0;

    invoke-direct {p0}, Lnf0;-><init>()V

    return-object p0
.end method

.method private synthetic x(Landroid/view/View;)V
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

.method public static z()Lnf0;
    .locals 1

    const/4 v0, -0x1

    .line 1
    sput v0, Lnf0;->u:I

    .line 2
    new-instance v0, Lnf0;

    invoke-direct {v0}, Lnf0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public B()V
    .locals 5

    .line 1
    iget-object v0, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const v3, 0x7f0a03f3

    if-ne v0, v3, :cond_3

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-ge v0, v4, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f1201c7

    invoke-static {v0, v1}, Leg0;->z(Landroid/content/Context;I)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v0

    invoke-virtual {v0, v3}, Lpa0;->g(I)V

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v3, 0x3b1

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    if-eqz v0, :cond_7

    .line 6
    invoke-virtual {v0}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result v3

    if-nez v3, :cond_1

    .line 7
    iput-boolean v2, p0, Lnf0;->s:Z

    .line 8
    new-instance v0, Landroid/content/Intent;

    const v1, 0x3b2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x65

    .line 9
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 10
    :cond_1
    invoke-static {}, Ljg0;->D()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 11
    sget v2, Lnf0;->u:I

    const/16 v3, 0x64

    const v4, 0x7f12008a

    if-eq v2, v1, :cond_2

    .line 12
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1204c0

    .line 13
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/app/KeyguardManager;->createConfirmDeviceCredentialIntent(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 15
    invoke-virtual {p0, v0, v3}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 16
    :cond_2
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f12026f

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/KeyguardManager;->createConfirmDeviceCredentialIntent(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 17
    invoke-virtual {p0, v0, v3}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 18
    :cond_3
    iget-object v0, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    const v3, 0x7f0a03f4

    if-ne v0, v3, :cond_6

    .line 19
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v0

    invoke-virtual {v0, v3}, Lpa0;->g(I)V

    .line 20
    sget v0, Lnf0;->u:I

    const/16 v2, 0x4b

    const v3, 0x3b3

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eq v0, v1, :cond_4

    .line 21
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    sget v1, Lvg0;->d:I

    invoke-virtual {v0, v3, v1}, Ln70;->v(Ljava/lang/String;I)V

    .line 22
    iget-object v0, p0, Lxc0;->b:Lmg0;

    sget v1, Lnf0;->u:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 23
    :cond_4
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v3}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    .line 24
    sget v1, Lvg0;->d:I

    if-ne v0, v1, :cond_5

    .line 25
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x2b

    sget v2, Lnf0;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 26
    :cond_5
    iget-object v0, p0, Lxc0;->b:Lmg0;

    sget v1, Lnf0;->u:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 27
    :cond_6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120405

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_7
    :goto_0
    return-void
.end method

.method public final C()V
    .locals 6

    .line 1
    sget v0, Lnf0;->u:I

    const v1, 0x3b4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const v3, 0x3b5

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x5

    if-eq v0, v4, :cond_0

    .line 2
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v4

    invoke-virtual {v4, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    sget v4, Lvg0;->e:I

    const v5, 0x3b6

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 4
    new-instance v0, Lch0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-direct {v0, v4}, Lch0;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-static {v1}, Lc70;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object v4

    invoke-virtual {v4, v1}, Lpa0;->e(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-static {v4, v1}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v4}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 8
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x25

    invoke-interface {v0, v1, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lch0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-direct {v0, v4}, Lch0;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-static {v4, v2}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v2, v4}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 12
    new-instance v2, Lcom/olive/upi/transport/model/ChangeAppPin;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/ChangeAppPin;-><init>()V

    .line 13
    invoke-virtual {v0}, Lch0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setOldPin(Ljava/lang/String;)V

    .line 14
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v0}, Lc70;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1, v0}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnf0;->t:Ljava/lang/String;

    .line 17
    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setNewPin(Ljava/lang/String;)V

    .line 18
    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->REG_TYPE_DEVICE:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setType(Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x4b

    const/16 v4, 0x23

    invoke-direct {v1, v3, v4, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public final D()V
    .locals 4

    .line 1
    iget-object v0, p0, Lnf0;->n:Landroid/view/View;

    const v1, 0x7f0a03f8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    .line 2
    iget-object v0, p0, Lnf0;->n:Landroid/view/View;

    const v1, 0x7f0a03f9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lnf0;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 4
    iget-object v0, p0, Lnf0;->n:Landroid/view/View;

    const v3, 0x7f0a03f3

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lnf0;->p:Landroid/widget/RadioButton;

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 6
    iget-object v0, p0, Lnf0;->n:Landroid/view/View;

    const v3, 0x7f0a03f4

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lnf0;->q:Landroid/widget/RadioButton;

    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 8
    iget-object v0, p0, Lnf0;->n:Landroid/view/View;

    const v1, 0x7f0a00c5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lnf0;->m:Landroid/widget/Button;

    .line 9
    iget-object v0, p0, Lnf0;->n:Landroid/view/View;

    const v1, 0x7f0a03f6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v0, p0, Lnf0;->n:Landroid/view/View;

    const v1, 0x7f0a03f7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    sget v0, Lnf0;->u:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 12
    iget-object v0, p0, Lnf0;->m:Landroid/widget/Button;

    iget-object v1, p0, Lnf0;->r:Landroid/app/Activity;

    const v2, 0x7f12036b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 13
    :cond_0
    iget-object v0, p0, Lnf0;->m:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    .line 15
    iget-object v0, p0, Lnf0;->p:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setEnabled(Z)V

    :cond_1
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    const/4 p3, 0x1

    const/4 v0, -0x1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_1

    if-eq p2, v0, :cond_0

    if-ne p2, p3, :cond_5

    .line 1
    :cond_0
    invoke-virtual {p0}, Lnf0;->C()V

    goto :goto_1

    :cond_1
    const/16 v1, 0x65

    if-ne p1, v1, :cond_5

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x3b7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/KeyguardManager;

    if-eq p2, v0, :cond_4

    if-ne p2, p3, :cond_2

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_5

    .line 3
    iget-boolean p2, p0, Lnf0;->s:Z

    invoke-virtual {p1}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result p1

    if-eq p2, p1, :cond_5

    .line 4
    invoke-virtual {p0}, Lnf0;->C()V

    goto :goto_1

    .line 5
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lnf0;->C()V

    :cond_5
    :goto_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 2
    :sswitch_0
    iget-object p1, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    const v0, 0x7f0a03f4

    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_0

    .line 3
    :sswitch_1
    iget-object p1, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    const v0, 0x7f0a03f3

    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-virtual {p0}, Lnf0;->B()V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a00c5 -> :sswitch_2
        0x7f0a03f6 -> :sswitch_1
        0x7f0a03f7 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const p3, 0x7f0d00a9

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lnf0;->n:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Lnf0;->r:Landroid/app/Activity;

    .line 3
    iget-object p1, p0, Lxc0;->b:Lmg0;

    new-instance p2, Ltg0;

    const p3, 0x7f1200cc

    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    const/16 p3, 0x5a

    invoke-interface {p1, p3, p2}, Lmg0;->o(ILjava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Lnf0;->D()V

    .line 5
    iget-object p1, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 6
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const p2, 0x3b8

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln70;->j(Ljava/lang/String;)I

    move-result p1

    const p2, 0x7f0a03f3

    if-eqz p1, :cond_1

    .line 7
    iget-object p3, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    sget v0, Lvg0;->e:I

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x7f0a03f4

    :goto_0
    invoke-virtual {p3, p2}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, Lnf0;->l:Landroid/widget/RadioGroup;

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->check(I)V

    .line 9
    :goto_1
    iget-object p1, p0, Lnf0;->n:Landroid/view/View;

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

    const/16 v1, 0x4a

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 p2, 0x23

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 3
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    sget p2, Lvg0;->e:I

    const v0, 0x3b9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ln70;->v(Ljava/lang/String;I)V

    .line 4
    new-instance p1, Lch0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-direct {p1, p2}, Lch0;-><init>(Landroid/content/Context;)V

    .line 5
    iget-object p2, p0, Lnf0;->t:Ljava/lang/String;

    const/4 v0, 0x1

    const v1, 0x3ba

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2, v0}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120468

    .line 7
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f120469

    .line 8
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12031e

    .line 9
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lnc0;

    invoke-direct {v2, p0}, Lnc0;-><init>(Lnf0;)V

    .line 10
    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public synthetic y(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lnf0;->x(Landroid/view/View;)V

    return-void
.end method
