.class public Lze0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Lng0;


# instance fields
.field public l:Landroid/app/Activity;

.field public m:Landroid/view/View;

.field public n:Landroidx/recyclerview/widget/RecyclerView;

.field public o:Lca0;

.field public p:Lcom/olive/upi/transport/model/GetMandate;

.field public q:Landroid/widget/TextView;

.field public r:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public s:Z

.field public t:Z

.field public u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;"
        }
    .end annotation
.end field

.field public v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lze0;->s:Z

    iput-boolean v0, p0, Lze0;->t:Z

    return-void
.end method

.method public static synthetic A(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    return-void
.end method

.method private synthetic B(Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x81

    const/16 v1, 0x4d

    invoke-direct {p3, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static D()Lze0;
    .locals 1

    .line 1
    new-instance v0, Lze0;

    invoke-direct {v0}, Lze0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lze0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lze0;->E()V

    return-void
.end method


# virtual methods
.method public synthetic C(Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lze0;->B(Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;Landroid/view/View;)V

    return-void
.end method

.method public final E()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x3462

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public F(Log0;)V
    .locals 0

    return-void
.end method

.method public final G(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lze0;->o:Lca0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lca0;

    invoke-direct {v0, p1}, Lca0;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lze0;->o:Lca0;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lca0;->z(Ljava/util/ArrayList;)V

    .line 4
    :goto_0
    iget-object p1, p0, Lze0;->o:Lca0;

    invoke-virtual {p1, p0}, Lca0;->y(Lng0;)V

    .line 5
    iget-object p1, p0, Lze0;->n:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lze0;->o:Lca0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 6
    iget-object p1, p0, Lze0;->o:Lca0;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public H(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lze0;->u:Ljava/util/ArrayList;

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 3
    iget-object p1, p0, Lze0;->u:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lze0;->G(Ljava/util/ArrayList;)V

    .line 4
    iget-object p1, p0, Lze0;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lze0;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lze0;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lze0;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;-><init>()V

    iput-object v0, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    const v0, 0x3463

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4d

    if-ne p1, v1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCustomerid(Ljava/lang/String;)V

    .line 5
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setTxnid(Ljava/lang/String;)V

    .line 6
    iget-object v2, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 7
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    iget-object v3, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    .line 9
    :goto_0
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 10
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAction(Ljava/lang/String;)V

    .line 11
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 12
    iget-object v2, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCreds(Lcom/olive/upi/transport/model/Cred;)V

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 14
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v2

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x81

    iget-object v5, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {v3, v4, v1, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_1
    const/16 v1, 0x5c

    if-ne p1, v1, :cond_2

    .line 15
    new-instance p1, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;-><init>()V

    .line 16
    new-instance p1, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;-><init>()V

    .line 17
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setTxnid(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setAction(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayervpa(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getPayees()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Payee;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayeevpa(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setCred(Lcom/olive/upi/transport/model/Cred;)V

    .line 22
    iget-object p2, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getUmn()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setUmn(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    .line 24
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x71

    invoke-direct {v0, v2, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_2
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d009c

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lze0;->m:Landroid/view/View;

    const p2, 0x7f0a0380

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lze0;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    iget-object p1, p0, Lze0;->m:Landroid/view/View;

    const p2, 0x7f0a01bb

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lze0;->q:Landroid/widget/TextView;

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lua0;->u(Lua0$e;)V

    .line 5
    invoke-static {}, Leg0;->c()V

    .line 6
    new-instance p1, Lcom/olive/upi/transport/model/GetMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/GetMandate;-><init>()V

    iput-object p1, p0, Lze0;->p:Lcom/olive/upi/transport/model/GetMandate;

    .line 7
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p3

    const v0, 0x3464

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/GetMandate;->setCustomerid(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lze0;->p:Lcom/olive/upi/transport/model/GetMandate;

    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/GetMandate;->setUmn(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lze0;->p:Lcom/olive/upi/transport/model/GetMandate;

    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/olive/upi/transport/model/GetMandate;->setTxnid(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lze0;->p:Lcom/olive/upi/transport/model/GetMandate;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const p3, 0x3465

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/GetMandate;->setAppid(Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    iget-object p3, p0, Lze0;->p:Lcom/olive/upi/transport/model/GetMandate;

    const/16 v0, 0x81

    const/16 v1, 0x4b

    invoke-direct {p2, v0, v1, p3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 12
    iget-object p1, p0, Lze0;->n:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 13
    new-instance p1, Lca0;

    iget-object p2, p0, Lze0;->l:Landroid/app/Activity;

    invoke-direct {p1, p2}, Lca0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lze0;->o:Lca0;

    .line 14
    iget-object p2, p0, Lze0;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 16
    iget-object p1, p0, Lze0;->m:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x4d

    const v1, 0x7f080296

    if-eq p1, v0, :cond_1

    const/16 v0, 0x5c

    if-eq p1, v0, :cond_0

    const/16 v0, 0x5d

    if-eq p1, v0, :cond_0

    goto/16 :goto_1

    .line 3
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lze0;->y(ILjava/lang/String;)V

    goto :goto_1

    .line 4
    :cond_1
    iget-boolean p1, p0, Lze0;->s:Z

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lze0$a;

    invoke-direct {v0, p0}, Lze0$a;-><init>(Lze0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 6
    :cond_2
    iget-boolean p1, p0, Lze0;->t:Z

    if-eqz p1, :cond_3

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lze0$b;

    invoke-direct {v0, p0}, Lze0$b;-><init>(Lze0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 9
    invoke-virtual {p0}, Lze0;->E()V

    .line 10
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 11
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x3466

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v0}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 15
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lze0;->y(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public onResume()V
    .locals 8

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    iget-object v0, p0, Lxc0;->b:Lmg0;

    new-instance v7, Ltg0;

    const v1, 0x7f1203c1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    const/16 v1, 0x5a

    invoke-interface {v0, v1, v7}, Lmg0;->o(ILjava/lang/Object;)V

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

    move-result p1

    const/16 v0, 0x4b

    const v1, 0x3467

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eq p1, v0, :cond_7

    const/16 v0, 0x4d

    const v2, 0x7f0801ef

    if-eq p1, v0, :cond_1

    const/16 v0, 0x5c

    if-eq p1, v0, :cond_0

    const/16 v0, 0x5d

    if-eq p1, v0, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 4
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lze0;->y(ILjava/lang/String;)V

    goto/16 :goto_3

    .line 6
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 7
    invoke-virtual {p0}, Lze0;->E()V

    .line 8
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 9
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x3468

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 12
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v0}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 14
    iget-boolean p1, p0, Lze0;->s:Z

    const v0, 0x7f080098

    if-nez p1, :cond_6

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const v1, 0x3469

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    .line 15
    :cond_3
    iget-boolean p1, p0, Lze0;->t:Z

    if-nez p1, :cond_5

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const p2, 0x346a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    .line 16
    :cond_4
    invoke-static {}, Leg0;->B()V

    const p1, 0x346b

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-virtual {p0, v2, p1}, Lze0;->y(ILjava/lang/String;)V

    goto :goto_3

    .line 18
    :cond_5
    :goto_1
    invoke-static {}, Leg0;->B()V

    const p1, 0x7f12047d

    .line 19
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lze0;->y(ILjava/lang/String;)V

    goto :goto_3

    .line 20
    :cond_6
    :goto_2
    invoke-static {}, Leg0;->B()V

    const p1, 0x7f12047e

    .line 21
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lze0;->y(ILjava/lang/String;)V

    goto :goto_3

    .line 22
    :cond_7
    invoke-static {}, Leg0;->B()V

    .line 23
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 24
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lze0;->u:Ljava/util/ArrayList;

    .line 25
    invoke-virtual {p0, p1}, Lze0;->H(Ljava/util/ArrayList;)V

    :cond_8
    :goto_3
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;-><init>()V

    iput-object v0, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x346c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setCustomerid(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getTxnid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setTxnid(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getUmn()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getUmn()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getUmn()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setUmn(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v1, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->getUmn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    const v0, 0x346d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x81

    const/4 v3, 0x1

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 10
    :sswitch_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getRefurl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 11
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 12
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getRefurl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lna0;->e(Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x45

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 14
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x346e

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_1

    .line 15
    :sswitch_1
    new-instance p1, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;-><init>()V

    .line 16
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayervpa(Ljava/lang/String;)V

    .line 17
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payeeVpa:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayeevpa(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setAction(Ljava/lang/String;)V

    .line 19
    iget-object v0, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->txnid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setTxnid(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getUmn()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setUmn(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p2

    invoke-static {p2}, Leg0;->i(Landroid/app/Activity;)V

    .line 22
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x5d

    invoke-direct {v0, v2, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 23
    :sswitch_2
    new-instance p1, Lcom/olive/upi/transport/model/ExecuteData;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/ExecuteData;-><init>()V

    .line 24
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    .line 25
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payerVpa:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/ExecuteData;->setPayervpa(Ljava/lang/String;)V

    .line 26
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payeeVpa:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/ExecuteData;->setPayeevpa(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/ExecuteData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    const v1, 0x346f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/ExecuteData;->setAction(Ljava/lang/String;)V

    .line 29
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->txnid:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/ExecuteData;->setTxnid(Ljava/lang/String;)V

    .line 30
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->umn:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/ExecuteData;->setUmnid(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 32
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 33
    iget-object v1, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->payeeVpa:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 34
    iget-object v1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 35
    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 36
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 37
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    iget-object v0, p2, Lcom/olive/upi/transport/model/PendingMandateReqVo;->txnid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 38
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    const v0, 0x3470

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getUmn()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setUmn(Ljava/lang/String;)V

    .line 40
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/16 p2, 0x250

    iget-object v0, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {p1, v2, p2, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 p2, 0xe

    .line 41
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 42
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 43
    :sswitch_3
    iput-boolean v3, p0, Lze0;->s:Z

    .line 44
    iget-object p1, p0, Lze0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    const p2, 0x3471

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAcceptType(Ljava/lang/String;)V

    .line 45
    iget-object p1, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAction(Ljava/lang/String;)V

    .line 46
    iget-object p1, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {p0, p1}, Lze0;->z(Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)V

    goto/16 :goto_1

    .line 47
    :sswitch_4
    iput-boolean v3, p0, Lze0;->t:Z

    .line 48
    iget-object p1, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    const p2, 0x3472

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;->setAction(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 50
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x4d

    iget-object v1, p0, Lze0;->v:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-direct {p2, v2, v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 51
    :sswitch_5
    new-instance p1, Landroid/app/Dialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v2, 0x7f130246

    invoke-direct {p1, v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 52
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x7f0d0054

    .line 53
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 54
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v2, -0x1

    const/4 v4, -0x2

    invoke-virtual {v0, v2, v4}, Landroid/view/Window;->setLayout(II)V

    const v0, 0x7f0a00ec

    .line 55
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const v2, 0x7f0a016f

    .line 56
    invoke-virtual {p1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v4, 0x7f0a0172

    .line 57
    invoke-virtual {p1, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f1202d7

    .line 58
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v4, 0x7f0a0171

    .line 59
    invoke-virtual {p1, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f0800de

    .line 60
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 61
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v5

    const v6, 0x7f060049

    invoke-static {v5, v6}, Lt8;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 62
    invoke-virtual {p1, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 63
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    const v3, 0x7f12036b

    .line 64
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 65
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setAllCaps(Z)V

    .line 66
    new-instance v1, Lze0$c;

    invoke-direct {v1, p0, p1, p2}, Lze0$c;-><init>(Lze0;Landroid/app/Dialog;Lcom/olive/upi/transport/model/PendingMandateReqVo;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    new-instance p2, Lze0$d;

    invoke-direct {p2, p0, p1}, Lze0$d;-><init>(Lze0;Landroid/app/Dialog;)V

    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a00d2 -> :sswitch_5
        0x7f0a00d3 -> :sswitch_5
        0x7f0a00d4 -> :sswitch_4
        0x7f0a00d5 -> :sswitch_4
        0x7f0a00de -> :sswitch_3
        0x7f0a00df -> :sswitch_3
        0x7f0a00e2 -> :sswitch_2
        0x7f0a00f6 -> :sswitch_1
        0x7f0a024d -> :sswitch_0
    .end sparse-switch
.end method

.method public y(ILjava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

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

    const p1, 0x7f12031d

    .line 11
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 13
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 14
    new-instance p1, Lze0$f;

    invoke-direct {p1, p0, v0}, Lze0$f;-><init>(Lze0;Landroid/app/Dialog;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    new-instance p1, Lze0$g;

    invoke-direct {p1, p0, v0}, Lze0$g;-><init>(Lze0;Landroid/app/Dialog;)V

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public z(Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

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
    new-instance v2, Lkc0;

    invoke-direct {v2, v0}, Lkc0;-><init>(Landroid/app/Dialog;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    new-instance v1, Llc0;

    invoke-direct {v1, p0, v0, p1}, Llc0;-><init>(Lze0;Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)V

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    new-instance p1, Lze0$e;

    invoke-direct {p1, p0, v0}, Lze0$e;-><init>(Lze0;Landroid/app/Dialog;)V

    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
