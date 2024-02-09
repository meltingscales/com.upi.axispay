.class public Lce0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# static fields
.field public static z:Lce0;


# instance fields
.field public l:Landroid/view/View;

.field public m:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/LinearLayout;

.field public w:Landroid/widget/LinearLayout;

.field public x:Landroid/widget/LinearLayout;

.field public y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method private synthetic B(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    return-void
.end method

.method public static synthetic D(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    return-void
.end method

.method private synthetic E(Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x84

    const/16 v1, 0x4d

    invoke-direct {p3, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static G()Lce0;
    .locals 1

    .line 1
    sget-object v0, Lce0;->z:Lce0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lce0;

    invoke-direct {v0}, Lce0;-><init>()V

    sput-object v0, Lce0;->z:Lce0;

    .line 3
    :cond_0
    sget-object v0, Lce0;->z:Lce0;

    return-object v0
.end method

.method private synthetic z(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public synthetic A(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lce0;->z(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public synthetic C(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lce0;->B(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public synthetic F(Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lce0;->E(Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;Landroid/view/View;)V

    return-void
.end method

.method public H()V
    .locals 2

    .line 1
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a0230

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->n:Landroid/widget/TextView;

    .line 2
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a04a8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->o:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a04ba

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->p:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a0494

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->q:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a048a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->r:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a04f4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a043b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->s:Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a01be

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->t:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a04a3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lce0;->u:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a00d3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lce0;->x:Landroid/widget/LinearLayout;

    .line 11
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a00d5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lce0;->v:Landroid/widget/LinearLayout;

    .line 12
    iget-object v0, p0, Lce0;->l:Landroid/view/View;

    const v1, 0x7f0a00df

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lce0;->w:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00d3

    if-eq p1, v0, :cond_2

    const v0, 0x7f0a00d5

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a00df

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    const v0, 0x3819

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAction(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p0, p1}, Lce0;->y(Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)V

    goto/16 :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    const v0, 0x381a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAction(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x84

    const/16 v2, 0x4d

    iget-object v3, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 7
    :cond_2
    new-instance p1, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f130246

    invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 8
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x7f0d0054

    .line 9
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 10
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-virtual {v0, v2, v3}, Landroid/view/Window;->setLayout(II)V

    const v0, 0x7f0a00ec

    .line 11
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const v2, 0x7f0a016f

    .line 12
    invoke-virtual {p1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f0a0172

    .line 13
    invoke-virtual {p1, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f120033

    .line 14
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v3, 0x7f0a0171

    .line 15
    invoke-virtual {p1, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0801d4

    .line 16
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 18
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    const v1, 0x7f12036b

    .line 19
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setAllCaps(Z)V

    .line 21
    new-instance v1, Lce0$a;

    invoke-direct {v1, p0, p1}, Lce0$a;-><init>(Lce0;Landroid/app/Dialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    new-instance v0, Lce0$b;

    invoke-direct {v0, p0, p1}, Lce0$b;-><init>(Lce0;Landroid/app/Dialog;)V

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;-><init>()V

    iput-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCustomerid(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setTxnid(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 8
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    const v0, 0x381b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAction(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 10
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCreds(Lcom/olive/upi/transport/model/Cred;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x84

    const/16 v1, 0x4d

    iget-object v2, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {p2, v0, v1, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const p3, 0x7f0d00c8

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lce0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lce0;->H()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lua0;->u(Lua0$e;)V

    .line 4
    iget-object p1, p0, Lce0;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lce0;->w:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object p1, p0, Lce0;->x:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const v0, 0x381c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const v0, 0x381d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const v0, 0x381e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 11
    new-instance v2, Lcom/olive/upi/transport/model/VpaVerify;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/VpaVerify;-><init>()V

    .line 12
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, p2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/VpaVerify;->setCustomerid(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v2, p1}, Lcom/olive/upi/transport/model/VpaVerify;->setVpa(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/olive/upi/transport/model/VpaVerify;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 15
    new-instance p1, Lcom/olive/upi/transport/model/PayerInfo;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PayerInfo;-><init>()V

    .line 16
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    sget-object v4, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v3, v4}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 17
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setPayervpa(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setAccountnumber(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayerInfo;->setName(Ljava/lang/String;)V

    const v0, 0x381f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 20
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayerInfo;->setMcc(Ljava/lang/String;)V

    .line 21
    :cond_0
    invoke-virtual {v2, p1}, Lcom/olive/upi/transport/model/VpaVerify;->setPayerInfo(Lcom/olive/upi/transport/model/PayerInfo;)V

    .line 22
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 23
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x84

    const/16 v5, 0x4f

    invoke-direct {v3, v4, v5, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 24
    iget-object p1, p0, Lce0;->n:Landroid/widget/TextView;

    iget-object v2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    iget-object p1, p0, Lce0;->o:Landroid/widget/TextView;

    iget-object v2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    :cond_1
    iget-object p1, p0, Lce0;->p:Landroid/widget/TextView;

    iget-object v2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget-object p1, p0, Lce0;->r:Landroid/widget/TextView;

    iget-object v2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object p1, p0, Lce0;->s:Landroid/widget/TextView;

    iget-object v2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    iget-object p1, p0, Lce0;->t:Landroid/widget/TextView;

    iget-object v2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object p1, p0, Lce0;->u:Landroid/widget/TextView;

    iget-object v2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    new-instance p1, Ljava/text/SimpleDateFormat;

    const v0, 0x3820

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 32
    new-instance v2, Ljava/text/SimpleDateFormat;

    const v0, 0x3821

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 33
    iget-object v3, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v3

    .line 34
    :try_start_0
    invoke-virtual {p1, v3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, p3

    .line 35
    :goto_0
    iget-object v3, p0, Lce0;->q:Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object v2, Lqa0$c;->b:Lqa0$c;

    invoke-virtual {p1, v2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    .line 37
    new-instance v2, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;-><init>()V

    iput-object v2, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    if-eqz p1, :cond_3

    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_3

    .line 39
    iget-object p3, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p3, p1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 40
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    sget-object p3, Ln70;->f:Ln70$a;

    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object p3

    invoke-virtual {p3, p2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCustomerid(Ljava/lang/String;)V

    .line 41
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    iget-object p2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setTxnid(Ljava/lang/String;)V

    .line 42
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    .line 43
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    goto :goto_1

    .line 44
    :cond_3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x15

    const/16 v3, 0xf

    invoke-direct {p2, v2, v3, p3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1, p2}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 45
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x3822

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 46
    :goto_1
    iget-object p1, p0, Lce0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 p2, 0x4f

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    const p2, 0x7f120213

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    const/16 v0, 0x84

    const v1, 0x3823

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-virtual {p0, v0, v1}, Lxc0;->v(ILjava/lang/String;)V

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
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0xf

    if-eq p1, v0, :cond_4

    const/16 v0, 0x4d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4f

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 5
    iget-object p2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 6
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3824

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const v0, 0x7f080098

    if-eqz p1, :cond_2

    const p1, 0x7f12047e

    .line 8
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lce0;->x(ILjava/lang/String;)V

    goto/16 :goto_0

    .line 9
    :cond_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const p2, 0x3825

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f12047d

    .line 10
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lce0;->x(ILjava/lang/String;)V

    goto :goto_0

    :cond_3
    const p1, 0x7f0801ef

    const p2, 0x7f120502

    .line 11
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lce0;->x(ILjava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-static {}, Leg0;->B()V

    .line 13
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_5

    .line 14
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    sget-object v0, Lqa0$c;->d:Lqa0$c;

    invoke-virtual {p2, v0}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 15
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const v0, 0x3826

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCustomerid(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    iget-object p2, p0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setTxnid(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lce0;->y:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public x(ILjava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f130246

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/Window;->requestFeature(I)Z

    const v1, 0x7f0d0054

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-virtual {v1, v3, v4}, Landroid/view/Window;->setLayout(II)V

    const v1, 0x7f0a00ec

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v3, 0x7f0a016f

    .line 6
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0a0172

    .line 7
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 8
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f0a0171

    .line 9
    invoke-virtual {v0, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 10
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 11
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 12
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 13
    new-instance p1, Lfc0;

    invoke-direct {p1, p0, v0}, Lfc0;-><init>(Lce0;Landroid/app/Dialog;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    new-instance p1, Lhc0;

    invoke-direct {p1, p0, v0}, Lhc0;-><init>(Lce0;Landroid/app/Dialog;)V

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public y(Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f130246

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/Window;->requestFeature(I)Z

    const v1, 0x7f0d0053

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-virtual {v1, v3, v4}, Landroid/view/Window;->setLayout(II)V

    const v1, 0x7f0a019e

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    const v1, 0x7f0a00eb

    .line 6
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v3, 0x7f0a0102

    .line 7
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const v4, 0x7f0a016f

    .line 8
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 9
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 11
    new-instance v2, Lic0;

    invoke-direct {v2, v0}, Lic0;-><init>(Landroid/app/Dialog;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    new-instance v1, Lgc0;

    invoke-direct {v1, p0, v0, p1}, Lgc0;-><init>(Lce0;Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)V

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    new-instance p1, Lce0$c;

    invoke-direct {p1, p0, v0}, Lce0$c;-><init>(Lce0;Landroid/app/Dialog;)V

    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
