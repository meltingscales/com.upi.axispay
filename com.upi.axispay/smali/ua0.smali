.class public Lua0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/OliveUpiEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lua0$e;
    }
.end annotation


# static fields
.field public static e:Lua0;


# instance fields
.field public b:Landroid/app/Activity;

.field public c:Lcom/olive/upi/transport/OliveUpiManager;

.field public d:Lua0$e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lua0;
    .locals 1

    .line 1
    sget-object v0, Lua0;->e:Lua0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lua0;

    invoke-direct {v0}, Lua0;-><init>()V

    sput-object v0, Lua0;->e:Lua0;

    .line 3
    :cond_0
    sget-object v0, Lua0;->e:Lua0;

    return-object v0
.end method

.method public static e(Landroid/app/Activity;)Lua0;
    .locals 1

    .line 1
    sget-object v0, Lua0;->e:Lua0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lua0;

    invoke-direct {v0}, Lua0;-><init>()V

    sput-object v0, Lua0;->e:Lua0;

    .line 3
    :cond_0
    sget-object v0, Lua0;->e:Lua0;

    invoke-virtual {v0, p0}, Lua0;->t(Landroid/app/Activity;)V

    .line 4
    sget-object p0, Lua0;->e:Lua0;

    return-object p0
.end method


# virtual methods
.method public a(ZLcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const p2, 0x1ef6

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Lua0;->d:Lua0$e;

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x35

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p2, v0, p1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public b(ZLcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->E()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const p2, 0x1ef7

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Lua0;->d:Lua0$e;

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p2, v0, p1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->K()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p4, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const p2, 0x1ef8

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Lua0;->d:Lua0$e;

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    const/16 p4, 0x1a

    invoke-direct {p3, p4}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p4

    invoke-virtual {p4, p1, p2, p3, p5}, Lcom/olive/upi/transport/OliveUpiManager;->getAllTransactionHistory(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_1
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(ZLcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->G()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v1, 0x1ef9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p2, p1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public h(ZLcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->j()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const p2, 0x1efa

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Lua0;->d:Lua0$e;

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p2, v0, p1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public final i()Lcom/olive/upi/transport/OliveUpiManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lua0;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    iput-object v0, p0, Lua0;->c:Lcom/olive/upi/transport/OliveUpiManager;

    return-object v0
.end method

.method public j(ZLcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->F()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const p2, 0x1efb

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Lua0;->d:Lua0$e;

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p2, v0, p1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public k()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->isPaymentServiceInitialised()Z

    move-result v0

    return v0
.end method

.method public final l(II)Z
    .locals 0

    if-le p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public m(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->B()Lcom/olive/upi/transport/model/MasterUpdate;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MasterUpdate;->getBanner()I

    move-result v0

    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x1efc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lua0;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x2e

    .line 3
    invoke-virtual {p0, v0}, Lua0;->r(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Lua0$a;

    invoke-direct {v2, p0}, Lua0$a;-><init>(Lua0;)V

    .line 5
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v2, 0x1efd

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 11
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa0;->T(Ljava/util/ArrayList;)V

    .line 12
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, v1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_2

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_2

    .line 14
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_2
    return-void
.end method

.method public n(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->B()Lcom/olive/upi/transport/model/MasterUpdate;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MasterUpdate;->getBill_pay_max()I

    move-result v0

    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x1efe

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lua0;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    invoke-virtual {p0, v0}, Lua0;->r(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Lua0$b;

    invoke-direct {v2, p0}, Lua0$b;-><init>(Lua0;)V

    .line 5
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    if-eqz v0, :cond_1

    .line 7
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v2, 0x1eff

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa0;->V(Lcom/olive/upi/transport/model/BillPayDataMaxAmount;)V

    .line 11
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, v1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public o(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->B()Lcom/olive/upi/transport/model/MasterUpdate;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MasterUpdate;->getDthOperator()I

    move-result v0

    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x1f00

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lua0;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    invoke-virtual {p0, v0}, Lua0;->r(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Lua0$d;

    invoke-direct {v2, p0}, Lua0$d;-><init>(Lua0;)V

    .line 5
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v2, 0x1f01

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 11
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa0;->a0(Ljava/util/ArrayList;)V

    .line 12
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, v1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_2

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_2

    .line 14
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_2
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onCommonLibResponse(ILjava/lang/Object;)V

    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x27

    if-eq v0, v1, :cond_2

    const/16 v1, 0x33

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3d

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p2, p0, Lua0;->d:Lua0$e;

    invoke-interface {p2, p1, v2}, Lua0$e;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, v2}, Lua0$e;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    .line 5
    :cond_2
    new-instance p1, Landroid/content/Intent;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x1f02

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    iget-object v0, p2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    const v1, 0x1f03

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    iget-object p2, p2, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    const v0, 0x1f04

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    iget-object p2, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->B()Lcom/olive/upi/transport/model/MasterUpdate;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    const/16 v2, 0xf

    if-eq v1, v2, :cond_17

    const/16 v2, 0x12

    if-eq v1, v2, :cond_15

    const/16 v2, 0x15

    if-eq v1, v2, :cond_14

    const/16 v2, 0x1f

    if-eq v1, v2, :cond_13

    const/16 v2, 0x22

    if-eq v1, v2, :cond_12

    const/16 v2, 0x27

    if-eq v1, v2, :cond_11

    const/16 v2, 0x2e

    if-eq v1, v2, :cond_f

    const/16 v2, 0x35

    if-eq v1, v2, :cond_e

    const/16 v2, 0x48

    if-eq v1, v2, :cond_d

    const/16 v2, 0x230

    if-eq v1, v2, :cond_c

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_b

    const/16 v2, 0x1b

    if-eq v1, v2, :cond_9

    const/16 v2, 0x32

    if-eq v1, v2, :cond_7

    const/16 v2, 0x33

    if-eq v1, v2, :cond_5

    const/16 v2, 0x3c

    if-eq v1, v2, :cond_4

    const/16 v2, 0x3d

    if-eq v1, v2, :cond_2

    packed-switch v1, :pswitch_data_0

    .line 3
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 4
    :pswitch_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 6
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    invoke-virtual {v1, v0}, Loa0;->n(Lcom/olive/upi/transport/model/BillerRegEnqResponse;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 8
    :pswitch_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 9
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Loa0;->l(Ljava/util/ArrayList;)V

    .line 10
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 11
    :pswitch_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 12
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 13
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Loa0;->m(Ljava/util/ArrayList;)V

    .line 14
    :cond_1
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 15
    :pswitch_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 16
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Loa0;->o(Ljava/util/ArrayList;)V

    .line 17
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 18
    :pswitch_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 19
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Loa0;->k(Ljava/util/ArrayList;)V

    .line 20
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lua0;->s(Ljava/lang/String;I)V

    .line 21
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 22
    :cond_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 23
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lqa0;->l0(Ljava/util/ArrayList;)V

    .line 24
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lua0;->s(Ljava/lang/String;I)V

    if-eqz v0, :cond_3

    .line 25
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MasterUpdate;->getMobileOperator()I

    move-result v0

    const v2, 0x1f05

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 26
    :cond_3
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 27
    :cond_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 28
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->k0(Ljava/util/ArrayList;)V

    .line 29
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 30
    :cond_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 31
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lqa0;->a0(Ljava/util/ArrayList;)V

    .line 32
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lua0;->s(Ljava/lang/String;I)V

    if-eqz v0, :cond_6

    .line 33
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MasterUpdate;->getDthOperator()I

    move-result v0

    const v2, 0x1f06

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 34
    :cond_6
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 35
    :cond_7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    .line 36
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lqa0;->j0(Lcom/olive/upi/transport/model/BillPayDataMaxAmount;)V

    .line 37
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lua0;->s(Ljava/lang/String;I)V

    if-eqz v0, :cond_8

    .line 38
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MasterUpdate;->getBill_pay_max()I

    move-result v0

    const v2, 0x1f07

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 39
    :cond_8
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 40
    :cond_9
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_a

    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_a

    .line 42
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 43
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {v1, v0, v2}, Lqa0;->q0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 44
    :cond_a
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 45
    :cond_b
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 46
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->t0(Ljava/util/ArrayList;)V

    .line 47
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 48
    :cond_c
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 49
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->Z(Ljava/util/ArrayList;)V

    .line 50
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 51
    :cond_d
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 52
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->c0(Ljava/util/ArrayList;)V

    .line 53
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 54
    :cond_e
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 55
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->X(Ljava/util/ArrayList;)V

    .line 56
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 57
    :cond_f
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 58
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lqa0;->T(Ljava/util/ArrayList;)V

    .line 59
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lua0;->s(Ljava/lang/String;I)V

    if-eqz v0, :cond_10

    .line 60
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MasterUpdate;->getBanner()I

    move-result v0

    const v2, 0x1f08

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 61
    :cond_10
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_0

    .line 62
    :cond_11
    new-instance p1, Landroid/content/Intent;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1f09

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const p2, 0x1f0a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x1f0b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    iget-object p2, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 65
    :cond_12
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 66
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->o0(Ljava/util/ArrayList;)V

    .line 67
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 68
    :cond_13
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 69
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {v1, v0, v2}, Lqa0;->m0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 70
    iget-object v1, p0, Lua0;->b:Landroid/app/Activity;

    invoke-static {v1, v0}, Ljg0;->S(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 71
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 72
    :cond_14
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 73
    sget-object v1, Lcom/olive/upi/transport/model/Bank;->bankNameComparator:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 74
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->R(Ljava/util/ArrayList;)V

    .line 75
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 76
    :cond_15
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_16

    .line 77
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->n0(Ljava/util/ArrayList;)V

    .line 78
    :cond_16
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 79
    :cond_17
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_18

    .line 80
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    iget-object v2, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {v1, v0, v2}, Lqa0;->m0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 81
    :cond_18
    iget-object v0, p0, Lua0;->d:Lua0$e;

    invoke-interface {v0, p1, p2}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3f
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->B()Lcom/olive/upi/transport/model/MasterUpdate;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 2
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MasterUpdate;->getMobileOperator()I

    move-result v1

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v0, 0x1f0c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->j(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lua0;->l(II)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    invoke-virtual {p0, v1}, Lua0;->r(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    :try_start_0
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v4, Lua0$c;

    invoke-direct {v4, p0}, Lua0$c;-><init>(Lua0;)V

    .line 5
    invoke-virtual {v4}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v4

    .line 6
    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v1

    :catch_0
    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v0, 0x1f0d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 11
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    invoke-virtual {v3, v2}, Lqa0;->l0(Ljava/util/ArrayList;)V

    .line 12
    iget-object v2, p0, Lua0;->d:Lua0$e;

    invoke-interface {v2, p1, v1}, Lua0$e;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_2

    .line 13
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_2

    .line 14
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_2
    return-void
.end method

.method public q(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public r(I)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1f0e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1f0f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 6
    :try_start_0
    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, p1}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 7
    new-instance p1, Ljava/io/BufferedReader;

    invoke-direct {p1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 8
    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1f10

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 10
    :catch_0
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lua0;->b:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1f11

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1f12

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 5
    :try_start_0
    new-instance v1, Ljava/io/FileWriter;

    invoke-direct {v1, p2}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    .line 6
    new-instance p2, Ljava/io/BufferedWriter;

    invoke-direct {p2, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 7
    invoke-virtual {p2, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Ljava/io/BufferedWriter;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public t(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lua0;->b:Landroid/app/Activity;

    return-void
.end method

.method public u(Lua0$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lua0;->d:Lua0$e;

    .line 2
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/olive/upi/transport/OliveUpiManager;->setListener(Lcom/olive/upi/transport/OliveUpiEventListener;)V

    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->setToken(Ljava/lang/String;)V

    return-void
.end method

.method public w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->userDeRegister()V

    return-void
.end method

.method public x()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lua0;->i()Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->userLogout()V

    return-void
.end method
