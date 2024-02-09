.class public Lxf0$c;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxf0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public final synthetic b:Lxf0;


# direct methods
.method public constructor <init>(Lxf0;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxf0$c;->b:Lxf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lxf0$c;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public initiatePayment(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p2, p0, Lxf0$c;->a:Landroid/content/Context;

    const v0, 0x22eb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 2
    iget-object p2, p0, Lxf0$c;->b:Lxf0;

    iput-object p4, p2, Lxf0;->m:Ljava/lang/String;

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p4

    invoke-virtual {p4}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p4

    iput-object p4, p2, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    .line 4
    iget-object p2, p0, Lxf0$c;->b:Lxf0;

    iget-object p2, p2, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lxf0$c;->b:Lxf0;

    iget-object p1, p1, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p5}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lxf0$c;->b:Lxf0;

    iget-object p1, p1, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    invoke-static {p3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 7
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 8
    sget-object p2, Lcom/olive/upi/transport/TransportConstants;->BILLPAY_UPIID:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    const p2, 0x22ec

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    const p3, 0x22ed

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 10
    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 11
    iget-object p3, p0, Lxf0$c;->b:Lxf0;

    iget-object p3, p3, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p3, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 12
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p3, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p3}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 13
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/4 p4, 0x1

    if-le p3, p4, :cond_0

    .line 14
    iget-object p1, p0, Lxf0$c;->b:Lxf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 p3, 0x50

    invoke-interface {p1, p3, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ne p2, p4, :cond_2

    .line 16
    iget-object p2, p0, Lxf0$c;->b:Lxf0;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Account;

    invoke-static {p2, p1}, Lxf0;->x(Lxf0;Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    .line 17
    :cond_1
    iget-object p1, p0, Lxf0$c;->b:Lxf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object p2, p0, Lxf0$c;->b:Lxf0;

    const p3, 0x7f1202ef

    invoke-virtual {p2, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public showToast(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lxf0$c;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public unload()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lxf0$c;->a:Landroid/content/Context;

    const v1, 0x22ee

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2
    iget-object v0, p0, Lxf0$c;->b:Lxf0;

    iget-object v0, v0, Lxc0;->b:Lmg0;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method
