.class public Lxf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxf0$c;,
        Lxf0$b;
    }
.end annotation


# instance fields
.field public l:Landroid/webkit/WebView;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Lcom/olive/upi/transport/model/TransactionData;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0xed4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lxf0;->m:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lxf0;->n:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lxf0;->o:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lxf0;->p:Ljava/lang/String;

    return-void
.end method

.method public static synthetic x(Lxf0;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxf0;->y(Lcom/olive/upi/transport/model/Account;)V

    return-void
.end method


# virtual methods
.method public final A(Lcom/olive/upi/transport/api/Result;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lxf0;->p:Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxf0;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    iget-object v1, p0, Lxf0;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    iget-object v1, p0, Lxf0;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const v2, 0xed5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 6
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    .line 8
    iget-object v2, p1, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    const v3, 0xed6

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_0

    const p1, 0xed7

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array v2, v5, [Ljava/lang/Object;

    .line 9
    iget-object v6, p1, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    aput-object v6, v2, v4

    iget-object p1, p1, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    aput-object p1, v2, v3

    const p1, 0xed8

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 v2, 0x7

    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    iget-object v6, p0, Lxf0;->m:Ljava/lang/String;

    aput-object v6, v2, v4

    aput-object p1, v2, v3

    iget-object p1, p0, Lxf0;->n:Ljava/lang/String;

    aput-object p1, v2, v5

    const/4 p1, 0x3

    iget-object v3, p0, Lxf0;->p:Ljava/lang/String;

    aput-object v3, v2, p1

    const/4 p1, 0x4

    aput-object v0, v2, p1

    const/4 p1, 0x5

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, p1

    const/4 p1, 0x6

    iget-object v0, p0, Lxf0;->o:Ljava/lang/String;

    aput-object v0, v2, p1

    const p1, 0xed9

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lxf0;->B(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxf0;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 3
    iget-object v0, p0, Lxf0;->l:Landroid/webkit/WebView;

    new-instance v1, Lxf0$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lxf0$b;-><init>(Lxf0;Lxf0$a;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 4
    iget-object v0, p0, Lxf0;->l:Landroid/webkit/WebView;

    new-instance v1, Landroid/webkit/WebChromeClient;

    invoke-direct {v1}, Landroid/webkit/WebChromeClient;-><init>()V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 5
    iget-object v0, p0, Lxf0;->l:Landroid/webkit/WebView;

    new-instance v1, Lxf0$c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lxf0$c;-><init>(Lxf0;Landroid/content/Context;)V

    const v2, 0xeda

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lxf0;->l:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lxf0;->l:Landroid/webkit/WebView;

    new-instance v0, Lxf0$a;

    invoke-direct {v0, p0}, Lxf0$a;-><init>(Lxf0;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x97

    const/16 v1, 0xa

    if-eq p1, v1, :cond_1

    const/16 v1, 0x2d

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0071

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a0565

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebView;

    iput-object p2, p0, Lxf0;->l:Landroid/webkit/WebView;

    .line 3
    invoke-virtual {p0}, Lxf0;->z()V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    .line 4
    invoke-virtual {p0, p2}, Lxf0;->A(Lcom/olive/upi/transport/api/Result;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    const/16 v0, 0x97

    const v1, 0xedb

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
    .locals 2

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x66

    if-ne v0, v1, :cond_0

    .line 3
    iget-object p1, p2, Lcom/olive/upi/transport/api/Result;->data:Ljava/lang/Object;

    check-cast p1, Lcom/olive/upi/transport/model/SetuResponse;

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/SetuResponse;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lxf0;->B(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0xa

    if-ne p1, v0, :cond_1

    .line 6
    invoke-virtual {p0, p2}, Lxf0;->A(Lcom/olive/upi/transport/api/Result;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lxc0;->p(Ljava/lang/Object;)V

    .line 2
    check-cast p1, Lcom/olive/upi/transport/model/Account;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lxf0;->y(Lcom/olive/upi/transport/model/Account;)V

    :cond_0
    return-void
.end method

.method public final y(Lcom/olive/upi/transport/model/Account;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 2
    iget-object p1, p0, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 3
    iget-object p1, p0, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 4
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    iget-object v0, p0, Lxf0;->q:Lcom/olive/upi/transport/model/TransactionData;

    const/16 v1, 0x97

    const/16 v2, 0x1fe

    invoke-direct {p1, v1, v2, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v0, 0x5

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public z()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const v1, 0xedc

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v1, 0xedd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0xede

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v1, 0xedf

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x45

    const/16 v4, 0x66

    invoke-direct {v2, v3, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
