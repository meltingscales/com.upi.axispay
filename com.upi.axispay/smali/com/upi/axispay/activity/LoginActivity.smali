.class public Lcom/upi/axispay/activity/LoginActivity;
.super Lc90;
.source "AxisPay"

# interfaces
.implements Lmg0;


# instance fields
.field public D:I

.field public E:Landroidx/fragment/app/Fragment;

.field public F:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc90;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/upi/axispay/activity/LoginActivity;->E:Landroidx/fragment/app/Fragment;

    .line 3
    iput-object v0, p0, Lcom/upi/axispay/activity/LoginActivity;->F:Landroidx/fragment/app/Fragment;

    return-void
.end method


# virtual methods
.method public final d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/upi/axispay/activity/LoginActivity;->e0(Ljava/lang/String;Landroidx/fragment/app/Fragment;Z)V

    return-void
.end method

.method public final e0(Ljava/lang/String;Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    iput-object p2, p0, Lcom/upi/axispay/activity/LoginActivity;->F:Landroidx/fragment/app/Fragment;

    .line 2
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/activity/LoginActivity;->E:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lcom/upi/axispay/activity/LoginActivity;->F:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0, v0, v1}, Lc90;->a0(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V

    .line 4
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p2

    if-eqz p3, :cond_0

    .line 5
    invoke-virtual {p2, p1}, Lje;->h(Ljava/lang/String;)Lje;

    :cond_0
    const p3, 0x7f0a01f9

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/activity/LoginActivity;->F:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, p3, v0, p1}, Lje;->s(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;

    .line 7
    invoke-virtual {p2}, Lje;->k()I

    .line 8
    iget-object p1, p0, Lcom/upi/axispay/activity/LoginActivity;->F:Landroidx/fragment/app/Fragment;

    iput-object p1, p0, Lcom/upi/axispay/activity/LoginActivity;->E:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const v1, 0x29f2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/upi/axispay/activity/LoginActivity;->t(ILjava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x4

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/upi/axispay/activity/LoginActivity;->t(ILjava/lang/Object;)V

    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    const/high16 v1, 0x4000000

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public m(ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/upi/axispay/activity/LoginActivity;->D:I

    return-void
.end method

.method public o(ILjava/lang/Object;)V
    .locals 0

    const/16 p2, 0xc9

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget p1, p0, Lc90;->t:I

    invoke-virtual {p0, p1}, Lc90;->b0(I)V

    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o0()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_3

    .line 2
    iget v0, p0, Lcom/upi/axispay/activity/LoginActivity;->D:I

    const/16 v1, 0x25

    if-ne v0, v1, :cond_0

    .line 3
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x29f3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/16 v1, 0x37

    if-eq v0, v1, :cond_2

    const/16 v1, 0x41

    if-eq v0, v1, :cond_2

    const/16 v1, 0x36

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_2

    .line 5
    :cond_2
    :goto_1
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    return-void

    .line 6
    :cond_3
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lc90;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Lxg0;->b(Landroid/content/Context;)Landroid/content/Context;

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    const v0, 0x7f0d0026

    .line 4
    invoke-virtual {p0, v0}, Lz;->setContentView(I)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Lcom/upi/axispay/activity/LoginActivity;->f0(Landroid/os/Bundle;)V

    .line 7
    invoke-static {p0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v3, 0x56

    const/16 v4, 0x50

    invoke-direct {v1, v3, v4, v2, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lsd;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/LoginActivity;->f0(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3
    :catch_0
    invoke-virtual {p0}, Lcom/upi/axispay/activity/LoginActivity;->g0()V

    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lc90;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    .line 3
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x29f4

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x2

    if-le v1, v3, :cond_0

    .line 4
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public t(ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/upi/axispay/activity/LoginActivity;->D:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/upi/axispay/activity/LoginActivity;->D:I

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lc90;->r:I

    const/4 v2, 0x4

    if-eq p1, v2, :cond_c

    const/16 v2, 0xd

    if-eq p1, v2, :cond_b

    const/16 v2, 0x16

    if-eq p1, v2, :cond_9

    const/16 v2, 0x25

    if-eq p1, v2, :cond_8

    const/16 v2, 0x41

    if-eq p1, v2, :cond_6

    const/16 v1, 0x48

    if-eq p1, v1, :cond_5

    const/16 v1, 0x36

    if-eq p1, v1, :cond_4

    const/16 v1, 0x37

    if-eq p1, v1, :cond_3

    const/16 v1, 0x4a

    if-eq p1, v1, :cond_2

    const/16 v1, 0x4b

    if-eq p1, v1, :cond_1

    .line 5
    new-instance p2, Lrd0;

    invoke-direct {p2}, Lrd0;-><init>()V

    .line 6
    invoke-virtual {p2, p1}, Lrd0;->L(I)V

    .line 7
    invoke-virtual {p0, v0, p2}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_2

    .line 8
    :cond_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Luf0;->B(I)Luf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_2

    .line 9
    :cond_2
    invoke-static {}, Lnf0;->z()Lnf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    .line 10
    :cond_3
    check-cast p2, Lhg0;

    invoke-static {p2}, Ldf0;->C(Lhg0;)Ldf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    .line 11
    :cond_4
    invoke-static {}, Lcf0;->G()Lcf0;

    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Lcf0;->M(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    .line 14
    :cond_5
    invoke-static {}, Ljd0;->C()Ljd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    :cond_6
    if-nez p2, :cond_7

    goto :goto_0

    .line 15
    :cond_7
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 16
    :goto_0
    invoke-static {}, Lqe0;->z()Lqe0;

    move-result-object p1

    .line 17
    invoke-virtual {p1, v1}, Lqe0;->C(I)V

    .line 18
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    .line 19
    :cond_8
    check-cast p2, Lcom/olive/upi/transport/model/Registration;

    .line 20
    invoke-static {p2}, Ljf0;->E(Lcom/olive/upi/transport/model/Registration;)Ljf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    .line 21
    :cond_9
    iput v2, p0, Lc90;->r:I

    if-nez p2, :cond_a

    goto :goto_1

    .line 22
    :cond_a
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 23
    :goto_1
    invoke-static {v1}, Lhe0;->S(I)Lhe0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    .line 24
    :cond_b
    new-instance p1, Lmf0;

    invoke-direct {p1}, Lmf0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/LoginActivity;->d0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_2

    .line 25
    :cond_c
    new-instance p1, Lrd0;

    invoke-direct {p1}, Lrd0;-><init>()V

    .line 26
    invoke-virtual {p0, v0, p1, v1}, Lcom/upi/axispay/activity/LoginActivity;->e0(Ljava/lang/String;Landroidx/fragment/app/Fragment;Z)V

    :goto_2
    return-void
.end method
