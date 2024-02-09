.class public Lrd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/LinearLayout;

.field public o:Landroid/widget/LinearLayout;

.field public p:Landroid/app/Activity;

.field public q:I

.field public r:Lcom/upi/axispay/custom/PinEntryView;

.field public s:I

.field public t:Landroid/widget/RelativeLayout;

.field public u:Landroid/widget/ImageView;

.field public v:Z

.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/16 v0, 0x6c

    .line 2
    iput v0, p0, Lrd0;->s:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lrd0;->v:Z

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lrd0;->w:Z

    return-void
.end method

.method private synthetic B(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic D(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic F(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static H()Lrd0;
    .locals 1

    .line 1
    new-instance v0, Lrd0;

    invoke-direct {v0}, Lrd0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lrd0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lrd0;->I(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    instance-of v0, v0, Lcom/upi/axispay/activity/MainActivity;

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    goto :goto_1

    .line 3
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const-class v2, Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    .line 4
    sput-boolean v1, Lvg0;->a:Z

    const v1, 0xdcf

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 6
    sput-boolean p1, Lvg0;->a:Z

    .line 7
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 8
    iget-object p1, p0, Lrd0;->p:Landroid/app/Activity;

    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 9
    iget-object p1, p0, Lrd0;->p:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void
.end method

.method public synthetic C(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lrd0;->B(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public synthetic E(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lrd0;->D(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public synthetic G(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lrd0;->F(Landroid/view/View;)V

    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lrd0;->J(Ljava/lang/String;I)V

    return-void
.end method

.method public final J(Ljava/lang/String;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lrd0;->v:Z

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0xdd0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const v4, 0xdd1

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0xdd2

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0xdd3

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v2, v6}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 9
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v2, v6}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    :cond_1
    :goto_0
    new-instance v0, Lcom/olive/upi/transport/model/Authenticate;

    invoke-direct {v0, p1}, Lcom/olive/upi/transport/model/Authenticate;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/Authenticate;->setAppVersion(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/Authenticate;->setType(I)V

    .line 14
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/4 p2, 0x4

    const/16 v1, 0x17

    invoke-direct {p1, p2, v1, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 15
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public K(Lcom/olive/upi/transport/model/TokenResponse;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/MasterUpdate;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/MasterUpdate;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getBannerVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setBanner(I)V

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getEncryptionFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setEncryptionFlag(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getDthOperatorVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setDthOperator(I)V

    .line 5
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getMobOperatorVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setMobileOperator(I)V

    .line 6
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getBillpayMaxAmtVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MasterUpdate;->setBill_pay_max(I)V

    .line 7
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getBannerVersion()I

    move-result v3

    const v4, 0xdd4

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 8
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getDthOperatorVersion()I

    move-result v3

    const v4, 0xdd5

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 9
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getMobOperatorVersion()I

    move-result v3

    const v4, 0xdd6

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 10
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getBillpayMaxAmtVersion()I

    move-result v3

    const v4, 0xdd7

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 11
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getAsap()Ljava/lang/String;

    move-result-object v3

    const v4, 0xdd8

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TokenResponse;->getChecksumWebUrl()Ljava/lang/String;

    move-result-object p1

    const v2, 0xdd9

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lqa0;->i0(Lcom/olive/upi/transport/model/MasterUpdate;)V

    return-void
.end method

.method public L(I)V
    .locals 0

    .line 1
    iput p1, p0, Lrd0;->q:I

    return-void
.end method

.method public final M()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Lua0;->r(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Lrd0$c;

    invoke-direct {v2, p0}, Lrd0$c;-><init>(Lrd0;)V

    .line 3
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Banner;

    .line 7
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Banner;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 8
    iget-object v1, p0, Lrd0;->u:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Banner;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f080072

    invoke-static {v1, v0, v2}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    const/4 p3, -0x1

    const v0, 0xdda

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0xddb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0xddc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x64

    if-ne p1, v5, :cond_2

    if-ne p2, p3, :cond_1

    .line 1
    new-instance p1, Lch0;

    iget-object p2, p0, Lrd0;->p:Landroid/app/Activity;

    invoke-direct {p1, p2}, Lch0;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p1, v2, v1, v4}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 3
    invoke-virtual {p1}, Lch0;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lch0;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Lrd0;->J(Ljava/lang/String;I)V

    goto/16 :goto_1

    .line 6
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto/16 :goto_1

    :cond_2
    const/16 v5, 0x65

    if-ne p1, v5, :cond_9

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v5, 0xddd

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/KeyguardManager;

    if-eq p2, p3, :cond_7

    if-ne p2, v3, :cond_3

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_6

    .line 8
    iget-boolean p2, p0, Lrd0;->w:Z

    invoke-virtual {p1}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result p1

    if-eq p2, p1, :cond_6

    .line 9
    new-instance p1, Lch0;

    iget-object p2, p0, Lrd0;->p:Landroid/app/Activity;

    invoke-direct {p1, p2}, Lch0;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-virtual {p1, v2, v1, v4}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    invoke-virtual {p1}, Lch0;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 13
    :cond_5
    invoke-virtual {p1}, Lch0;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Lrd0;->J(Ljava/lang/String;I)V

    goto :goto_1

    .line 14
    :cond_6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_1

    .line 15
    :cond_7
    :goto_0
    new-instance p1, Lch0;

    iget-object p2, p0, Lrd0;->p:Landroid/app/Activity;

    invoke-direct {p1, p2}, Lch0;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-virtual {p1, v2, v1, v4}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 17
    invoke-virtual {p1}, Lch0;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 18
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 19
    :cond_8
    invoke-virtual {p1}, Lch0;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Lrd0;->J(Ljava/lang/String;I)V

    :cond_9
    :goto_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/16 v0, 0x16

    const/4 v1, 0x4

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 3
    :sswitch_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x36

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    :sswitch_1
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lqa0;->d0(Lqa0;)V

    .line 5
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0xdde

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->c(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lxc0;->b:Lmg0;

    invoke-interface {v1, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 7
    :sswitch_2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 8
    :sswitch_3
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x41

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a0201 -> :sswitch_3
        0x7f0a02ad -> :sswitch_2
        0x7f0a02b1 -> :sswitch_1
        0x7f0a03dc -> :sswitch_0
    .end sparse-switch
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lxc0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d010d

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p2

    iput-object p2, p0, Lrd0;->p:Landroid/app/Activity;

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    invoke-virtual {p2, p0}, Lua0;->u(Lua0$e;)V

    const p2, 0x7f0a02ae

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const p2, 0x7f0a03a7

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const p2, 0x7f0a0190

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout;

    iput-object p2, p0, Lrd0;->t:Landroid/widget/RelativeLayout;

    .line 7
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const p3, 0xddf

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ln70;->j(Ljava/lang/String;)I

    move-result p2

    .line 8
    sget p3, Lvg0;->e:I

    const/16 v1, 0x8

    if-ne p2, p3, :cond_0

    .line 9
    invoke-virtual {p0}, Lrd0;->y()V

    const p2, 0x7f0a0226

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lrd0;->u:Landroid/widget/ImageView;

    .line 11
    iget-object p2, p0, Lrd0;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 12
    invoke-virtual {p0}, Lrd0;->M()V

    goto :goto_0

    .line 13
    :cond_0
    iget-object p2, p0, Lrd0;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_0
    const p2, 0x7f0a02b2

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ScrollView;

    const p2, 0x7f0a02ad

    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lrd0;->l:Landroid/widget/TextView;

    const p2, 0x7f0a054b

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v0, 0xde0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const p3, 0x7f0a02b1

    .line 19
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lrd0;->m:Landroid/widget/TextView;

    .line 20
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 21
    iget-object p3, p0, Lrd0;->p:Landroid/app/Activity;

    invoke-static {p3}, Lah0;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f0a038a

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/PinEntryView;

    iput-object p2, p0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    .line 23
    new-instance p3, Lrd0$a;

    invoke-direct {p3, p0}, Lrd0$a;-><init>(Lrd0;)V

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/PinEntryView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 24
    iget-object p2, p0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/PinEntryView;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    new-instance p3, Lrd0$b;

    invoke-direct {p3, p0}, Lrd0$b;-><init>(Lrd0;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 25
    iget-object p2, p0, Lrd0;->l:Landroid/widget/TextView;

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    iget-object p2, p0, Lrd0;->m:Landroid/widget/TextView;

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0a03dc

    .line 27
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lrd0;->n:Landroid/widget/LinearLayout;

    .line 28
    invoke-virtual {p2, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0a0201

    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lrd0;->o:Landroid/widget/LinearLayout;

    .line 30
    invoke-virtual {p2, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0xde1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    .line 4
    iget-object v1, p0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/PinEntryView;->clearText()V

    .line 5
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v1, 0x17

    if-ne p1, v1, :cond_6

    .line 8
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    .line 9
    iget-object p2, p0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/PinEntryView;->clearText()V

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 p2, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const v1, 0xde2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x4

    goto :goto_0

    :sswitch_1
    const v1, 0xde3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x3

    goto :goto_0

    :sswitch_2
    const v1, 0xde4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p2, 0x2

    goto :goto_0

    :sswitch_3
    const v1, 0xde5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p2, 0x1

    goto :goto_0

    :sswitch_4
    const v1, 0xde6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 p2, 0x0

    :goto_0
    const p1, 0x7f1201b3

    const v1, 0xde7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x7f120126

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcc0;

    invoke-direct {v2, p0}, Lcc0;-><init>(Lrd0;)V

    invoke-static {p2, v1, v0, p1, v2}, Leg0;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_1

    .line 12
    :pswitch_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Ljg0;->V(Landroid/app/Activity;)V

    goto :goto_1

    .line 13
    :pswitch_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Ljg0;->W(Landroid/app/Activity;)V

    goto :goto_1

    .line 14
    :pswitch_3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x7f120151

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ldc0;

    invoke-direct {v2, p0}, Ldc0;-><init>(Lrd0;)V

    invoke-static {p2, v1, v0, p1, v2}, Leg0;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_1

    .line 15
    :pswitch_4
    sget p1, Lvg0;->e:I

    if-ne v0, p1, :cond_8

    .line 16
    invoke-virtual {p0}, Lrd0;->y()V

    goto :goto_1

    .line 17
    :cond_6
    iget-object p1, p0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinEntryView;->clearText()V

    goto :goto_1

    .line 18
    :cond_7
    sget p1, Lvg0;->e:I

    if-ne v0, p1, :cond_8

    .line 19
    invoke-virtual {p0}, Lrd0;->y()V

    .line 20
    :cond_8
    :goto_1
    iget-object p1, p0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinEntryView;->clearText()V

    :cond_9
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x601 -> :sswitch_4
        0x620 -> :sswitch_3
        0x640 -> :sswitch_2
        0x641 -> :sswitch_1
        0x71f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lua0;->v(Ljava/lang/String;)V

    .line 4
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0xde8

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->j(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 5
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const/4 v2, 0x0

    const v3, 0xde9

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ln70;->v(Ljava/lang/String;I)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lrd0;->z()V

    const/4 v0, 0x4

    const v2, 0x7f120233

    .line 7
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lxc0;->v(ILjava/lang/String;)V

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa0;->t0(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 16

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 2
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const v5, 0x7f120348

    const/16 v6, 0x1f

    const/16 v8, 0x38

    const/16 v10, 0x24

    const v11, 0xdea

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x5

    const v15, 0xdeb

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    const v7, 0xdec

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    if-eq v2, v3, :cond_c

    const/16 v3, 0x17

    const v9, 0xded

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-eq v2, v3, :cond_3

    const/16 v1, 0x27

    if-eq v2, v1, :cond_1

    .line 4
    iget v1, v0, Lxc0;->g:I

    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result v2

    if-ne v1, v2, :cond_13

    .line 5
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_4

    .line 6
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->c()V

    .line 8
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f12005c

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12046a

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f12031e

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lec0;

    invoke-direct {v5, v0}, Lec0;-><init>(Lrd0;)V

    invoke-static {v1, v2, v3, v4, v5}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 9
    :cond_2
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_4

    .line 10
    :cond_3
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 11
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v11, v13}, Ln70;->A(Ljava/lang/String;Z)V

    .line 12
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0xdee

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v12}, Ln70;->v(Ljava/lang/String;I)V

    .line 13
    iget-object v1, v0, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/PinEntryView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 15
    new-instance v2, Lch0;

    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-direct {v2, v3}, Lch0;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-static {v3, v1}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v3, 0xdef

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1, v13}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 17
    :cond_4
    iget v1, v0, Lrd0;->q:I

    if-eq v1, v10, :cond_9

    if-ne v1, v8, :cond_5

    goto :goto_0

    :cond_5
    if-ne v1, v6, :cond_7

    .line 18
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2, v15, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 21
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    instance-of v1, v1, Lcom/upi/axispay/activity/MainActivity;

    if-eqz v1, :cond_6

    .line 22
    iget-object v1, v0, Lxc0;->b:Lmg0;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v14, v2}, Lmg0;->t(ILjava/lang/Object;)V

    .line 23
    iget-object v1, v0, Lxc0;->b:Lmg0;

    iget v2, v0, Lrd0;->q:I

    invoke-interface {v1, v2, v4}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 24
    :cond_6
    iget v1, v0, Lrd0;->q:I

    invoke-virtual {v0, v1}, Lrd0;->A(I)V

    goto :goto_1

    :cond_7
    const/16 v2, 0x1e

    if-ne v1, v2, :cond_8

    .line 25
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const v2, 0x7f120148

    .line 26
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2, v15, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 28
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    invoke-virtual {v1}, Lua0;->w()V

    goto :goto_1

    .line 29
    :cond_8
    invoke-virtual {v0, v12}, Lrd0;->A(I)V

    goto :goto_1

    .line 30
    :cond_9
    :goto_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const v2, 0x7f12041c

    .line 31
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2, v15, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 33
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    instance-of v1, v1, Lcom/upi/axispay/activity/MainActivity;

    if-eqz v1, :cond_a

    .line 34
    iget-object v1, v0, Lxc0;->b:Lmg0;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v14, v2}, Lmg0;->t(ILjava/lang/Object;)V

    .line 35
    iget-object v1, v0, Lxc0;->b:Lmg0;

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    invoke-interface {v1, v3, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 36
    :cond_a
    iget v1, v0, Lrd0;->q:I

    invoke-virtual {v0, v1}, Lrd0;->A(I)V

    .line 37
    :cond_b
    :goto_1
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_4

    .line 38
    :cond_c
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/TokenResponse;

    if-eqz v1, :cond_d

    .line 39
    invoke-virtual {v0, v1}, Lrd0;->K(Lcom/olive/upi/transport/model/TokenResponse;)V

    .line 40
    :cond_d
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v11, v13}, Ln70;->A(Ljava/lang/String;Z)V

    .line 41
    iget v1, v0, Lrd0;->q:I

    if-eq v1, v10, :cond_11

    if-ne v1, v8, :cond_e

    goto :goto_2

    :cond_e
    if-ne v1, v6, :cond_10

    .line 42
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 43
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2, v15, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 45
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    instance-of v1, v1, Lcom/upi/axispay/activity/MainActivity;

    if-eqz v1, :cond_f

    .line 46
    iget-object v1, v0, Lxc0;->b:Lmg0;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v14, v2}, Lmg0;->t(ILjava/lang/Object;)V

    .line 47
    iget-object v1, v0, Lxc0;->b:Lmg0;

    iget v2, v0, Lrd0;->q:I

    invoke-interface {v1, v2, v4}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_3

    .line 48
    :cond_f
    iget v1, v0, Lrd0;->q:I

    invoke-virtual {v0, v1}, Lrd0;->A(I)V

    goto :goto_3

    .line 49
    :cond_10
    invoke-virtual {v0, v12}, Lrd0;->A(I)V

    goto :goto_3

    .line 50
    :cond_11
    :goto_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const v2, 0x7f12041c

    .line 51
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2, v15, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 53
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    instance-of v1, v1, Lcom/upi/axispay/activity/MainActivity;

    if-eqz v1, :cond_12

    .line 54
    iget-object v1, v0, Lxc0;->b:Lmg0;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v14, v2}, Lmg0;->t(ILjava/lang/Object;)V

    .line 55
    iget-object v1, v0, Lxc0;->b:Lmg0;

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    invoke-interface {v1, v3, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_3

    .line 56
    :cond_12
    iget v1, v0, Lrd0;->q:I

    invoke-virtual {v0, v1}, Lrd0;->A(I)V

    .line 57
    :goto_3
    invoke-static {}, Leg0;->B()V

    :cond_13
    :goto_4
    return-void

    .line 58
    :cond_14
    :goto_5
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public final y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrd0;->p:Landroid/app/Activity;

    const v1, 0xdf0    # 5.0E-42f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lrd0;->w:Z

    .line 4
    new-instance v0, Landroid/content/Intent;

    const v1, 0xdf1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x65

    .line 5
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ljg0;->D()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f12008a

    .line 7
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1204bf

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/KeyguardManager;->createConfirmDeviceCredentialIntent(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    iget-boolean v1, p0, Lrd0;->v:Z

    if-nez v1, :cond_1

    const/16 v1, 0x64

    .line 9
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lrd0;->v:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public z()V
    .locals 3

    .line 1
    iget v0, p0, Lrd0;->s:I

    const v1, 0xdf2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lxc0;->f:I

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    .line 3
    invoke-virtual {p0, v1}, Lxc0;->q(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0xc9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lmg0;->o(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
