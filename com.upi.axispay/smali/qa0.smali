.class public Lqa0;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqa0$d;,
        Lqa0$e;,
        Lqa0$c;
    }
.end annotation


# static fields
.field public static C:Lqa0;


# instance fields
.field public A:Lcom/olive/upi/transport/model/Bank;

.field public B:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Banner;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/olive/upi/transport/model/TransactionData;

.field public f:Z

.field public g:Ldg0;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/OperatorsLogos;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/DTHOperator;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/GCMMessage;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lqa0$e;

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Bank;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lcom/olive/upi/transport/model/GCMMessage;

.field public r:I

.field public s:Lcom/olive/upi/transport/model/MasterUpdate;

.field public t:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

.field public u:Lcom/olive/upi/transport/model/Mandate;

.field public v:Lsg0;

.field public w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
            ">;"
        }
    .end annotation
.end field

.field public x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
            ">;"
        }
    .end annotation
.end field

.field public y:Lcom/olive/upi/transport/model/BillerChargeReq;

.field public z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lqa0;->f:Z

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lqa0;->k:Ljava/util/ArrayList;

    .line 4
    sget-object v0, Lqa0$e;->c:Lqa0$e;

    iput-object v0, p0, Lqa0;->l:Lqa0$e;

    return-void
.end method

.method public static d0(Lqa0;)V
    .locals 0

    .line 1
    sput-object p0, Lqa0;->C:Lqa0;

    return-void
.end method

.method public static v()Lqa0;
    .locals 1

    .line 1
    sget-object v0, Lqa0;->C:Lqa0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lqa0;

    invoke-direct {v0}, Lqa0;-><init>()V

    sput-object v0, Lqa0;->C:Lqa0;

    .line 3
    :cond_0
    sget-object v0, Lqa0;->C:Lqa0;

    return-object v0
.end method


# virtual methods
.method public A(Lqa0$d;Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqa0$d;",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lqa0;->c:Ljava/util/ArrayList;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v0, p0, Lqa0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/MandatesVo;

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerStatus()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeStatus()Ljava/lang/String;

    move-result-object v3

    .line 6
    sget-object v4, Ln70;->f:Ln70$a;

    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v5, 0xd0d

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerMobile()Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeMobile()Ljava/lang/String;

    move-result-object v6

    .line 9
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object v7

    .line 10
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v8, :cond_2

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move v8, v9

    goto :goto_1

    :cond_2
    move v8, v10

    .line 11
    :goto_1
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_3

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v9

    goto :goto_2

    :cond_3
    move v4, v10

    .line 12
    :goto_2
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_4

    const v11, 0xd0e

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    move v9, v10

    :goto_3
    if-nez v5, :cond_5

    if-eqz v6, :cond_1

    .line 13
    :cond_5
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_6
    if-nez v2, :cond_7

    if-eqz v3, :cond_1

    .line 14
    :cond_7
    sget-object v5, Lqa0$d;->b:Lqa0$d;

    const v6, 0xd0f

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0xd10

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    if-ne p1, v5, :cond_f

    if-eqz v2, :cond_b

    .line 15
    invoke-virtual {v2, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_8
    if-ne v4, v8, :cond_9

    .line 16
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    if-eqz v9, :cond_a

    if-nez v4, :cond_1

    .line 17
    :cond_a
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    if-eqz v3, :cond_1

    .line 18
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_c
    if-ne v4, v8, :cond_d

    .line 19
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_d
    if-eqz v9, :cond_e

    if-nez v4, :cond_1

    .line 20
    :cond_e
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 21
    :cond_f
    sget-object v5, Lqa0$d;->g:Lqa0$d;

    if-ne p1, v5, :cond_13

    const v5, 0xd11

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v2, :cond_11

    .line 22
    invoke-virtual {v2, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_10

    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 23
    :cond_10
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getShareToPayee()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_11

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getShareToPayee()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    if-eqz v9, :cond_1

    if-eqz v4, :cond_1

    .line 24
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_11
    if-eqz v3, :cond_1

    .line 25
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 26
    :cond_12
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getShareToPayee()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandatesVo;->getShareToPayee()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v9, :cond_1

    if-eqz v4, :cond_1

    .line 27
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 28
    :cond_13
    sget-object v4, Lqa0$d;->c:Lqa0$d;

    if-eq p1, v4, :cond_1a

    sget-object v4, Lqa0$d;->d:Lqa0$d;

    if-ne p1, v4, :cond_14

    goto :goto_4

    .line 29
    :cond_14
    sget-object v4, Lqa0$d;->e:Lqa0$d;

    if-ne p1, v4, :cond_17

    .line 30
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const v5, 0xd12

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-nez v4, :cond_15

    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_15
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 31
    :cond_16
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 32
    :cond_17
    sget-object v4, Lqa0$d;->f:Lqa0$d;

    if-ne p1, v4, :cond_19

    const v4, 0xd13

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v2, :cond_18

    .line 33
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_18

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 34
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_18
    if-eqz v3, :cond_1

    .line 35
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 36
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 37
    :cond_19
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1a
    :goto_4
    const v4, 0xd14

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0xd15

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0xd16

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v2, :cond_1d

    .line 38
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1c

    .line 39
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1b

    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1c

    .line 40
    :cond_1b
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1d

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 41
    :cond_1c
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1d
    if-eqz v3, :cond_1

    .line 42
    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1f

    .line 43
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1e

    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1f

    .line 44
    :cond_1e
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 45
    :cond_1f
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_20
    return-object p2
.end method

.method public B()Lcom/olive/upi/transport/model/MasterUpdate;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->s:Lcom/olive/upi/transport/model/MasterUpdate;

    return-object v0
.end method

.method public C()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->w:Ljava/util/ArrayList;

    return-object v0
.end method

.method public D()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/OperatorsLogos;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public E()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public F()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public G()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->z:Ljava/util/ArrayList;

    return-object v0
.end method

.method public H()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->p:Ljava/util/ArrayList;

    return-object v0
.end method

.method public I()I
    .locals 1

    .line 1
    iget v0, p0, Lqa0;->r:I

    return v0
.end method

.method public J()Lcom/olive/upi/transport/model/Bank;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->A:Lcom/olive/upi/transport/model/Bank;

    return-object v0
.end method

.method public K()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->n:Ljava/util/ArrayList;

    return-object v0
.end method

.method public L()Lcom/olive/upi/transport/model/TransactionData;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->e:Lcom/olive/upi/transport/model/TransactionData;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    iput-object v0, p0, Lqa0;->e:Lcom/olive/upi/transport/model/TransactionData;

    .line 3
    :cond_0
    iget-object v0, p0, Lqa0;->e:Lcom/olive/upi/transport/model/TransactionData;

    return-object v0
.end method

.method public M()Lqa0$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->l:Lqa0$e;

    return-object v0
.end method

.method public N(Lqa0$e;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqa0$e;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lqa0;->b:Ljava/util/ArrayList;

    new-instance v2, Lqa0$a;

    invoke-direct {v2, p0}, Lqa0$a;-><init>(Lqa0;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 4
    iget-object v1, p0, Lqa0;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 5
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    .line 6
    sget-object v4, Lqa0$e;->d:Lqa0$e;

    const v5, 0xd17

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-ne p1, v4, :cond_2

    .line 7
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 8
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_2
    sget-object v4, Lqa0$e;->e:Lqa0$e;

    const v6, 0xd18

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-ne p1, v4, :cond_3

    .line 10
    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_3
    sget-object v4, Lqa0$e;->c:Lqa0$e;

    if-ne p1, v4, :cond_4

    .line 13
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method public O()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->l:Lqa0$e;

    invoke-virtual {p0, v0}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public P(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->q()Ljava/util/ArrayList;

    move-result-object v0

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    move v1, v2

    .line 4
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/olive/upi/transport/model/Collectbeneblock;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Collectbeneblock;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public Q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqa0;->f:Z

    return v0
.end method

.method public R(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Bank;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->m:Ljava/util/ArrayList;

    return-void
.end method

.method public S(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public T(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Banner;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public U(Ldg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->g:Ldg0;

    return-void
.end method

.method public V(Lcom/olive/upi/transport/model/BillPayDataMaxAmount;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->t:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    return-void
.end method

.method public W(Lcom/olive/upi/transport/model/BillerChargeReq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->y:Lcom/olive/upi/transport/model/BillerChargeReq;

    return-void
.end method

.method public X(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->j:Ljava/util/ArrayList;

    return-void
.end method

.method public Y(Lcom/olive/upi/transport/model/GCMMessage;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->q:Lcom/olive/upi/transport/model/GCMMessage;

    return-void
.end method

.method public Z(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->x:Ljava/util/ArrayList;

    return-void
.end method

.method public a(Lcom/olive/upi/transport/model/GCMMessage;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lqa0;->k:Ljava/util/ArrayList;

    .line 2
    :cond_0
    iget-object v0, p0, Lqa0;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/DTHOperator;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->i:Ljava/util/ArrayList;

    return-void
.end method

.method public b(Lcom/olive/upi/transport/model/BeneVpa;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqa0;->g(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public b0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lqa0;->f:Z

    return-void
.end method

.method public c()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lqa0;->a:Ljava/util/ArrayList;

    .line 2
    iput-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    .line 3
    iput-object v0, p0, Lqa0;->m:Ljava/util/ArrayList;

    .line 4
    iput-object v0, p0, Lqa0;->n:Ljava/util/ArrayList;

    .line 5
    iput-object v0, p0, Lqa0;->p:Ljava/util/ArrayList;

    .line 6
    iput-object v0, p0, Lqa0;->e:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Lqa0;->f:Z

    .line 8
    iput-object v0, p0, Lqa0;->g:Ldg0;

    .line 9
    iput-object v0, p0, Lqa0;->d:Ljava/util/ArrayList;

    .line 10
    iput-object v0, p0, Lqa0;->h:Ljava/util/ArrayList;

    .line 11
    iput-object v0, p0, Lqa0;->i:Ljava/util/ArrayList;

    .line 12
    iput-object v0, p0, Lqa0;->j:Ljava/util/ArrayList;

    .line 13
    iput-object v0, p0, Lqa0;->k:Ljava/util/ArrayList;

    .line 14
    iput-object v0, p0, Lqa0;->q:Lcom/olive/upi/transport/model/GCMMessage;

    .line 15
    iput-object v0, p0, Lqa0;->s:Lcom/olive/upi/transport/model/MasterUpdate;

    .line 16
    iput-object v0, p0, Lqa0;->t:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    .line 17
    iput-object v0, p0, Lqa0;->v:Lsg0;

    return-void
.end method

.method public c0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;
    .locals 5

    .line 1
    sget-object v0, Lqa0$c;->d:Lqa0$c;

    invoke-virtual {p0, v0}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-nez p1, :cond_1

    return-object v1

    .line 2
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    .line 3
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-object v2

    :cond_3
    return-object v1
.end method

.method public e(Ljava/lang/String;)Lcom/olive/upi/transport/model/Bank;
    .locals 4

    .line 1
    iget-object v0, p0, Lqa0;->m:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Bank;

    .line 3
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Bank;->getIin()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 4
    :cond_2
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Bank;->getIin()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_3
    return-object v1
.end method

.method public e0(Lcom/olive/upi/transport/model/Mandate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->u:Lcom/olive/upi/transport/model/Mandate;

    return-void
.end method

.method public f(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;
    .locals 4

    .line 1
    iget-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 3
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method public f0(Lsg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->v:Lsg0;

    return-void
.end method

.method public g(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;
    .locals 4

    .line 1
    iget-object v0, p0, Lqa0;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 3
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method public g0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public h(Lqa0$c;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqa0$c;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lqa0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/CustomerBankAccounts;

    .line 4
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->getAccounts()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    .line 5
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->getBankName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/Account;->setBankName(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->getBankCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/Account;->setIin(Ljava/lang/String;)V

    .line 7
    sget-object v5, Lqa0$c;->e:Lqa0$c;

    const v6, 0xd19

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-ne p1, v5, :cond_3

    .line 8
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 9
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_3
    sget-object v5, Lqa0$c;->c:Lqa0$c;

    if-ne p1, v5, :cond_4

    .line 11
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 12
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_4
    sget-object v5, Lqa0$c;->d:Lqa0$c;

    if-ne p1, v5, :cond_5

    .line 14
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 15
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16
    :cond_5
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->B:Lcom/olive/upi/transport/model/MandateTransactionData;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lqa0;->b0(Z)V

    :cond_0
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lqa0$c;->b:Lqa0$c;

    invoke-virtual {p0, v0}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    .line 3
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const v4, 0xd1a

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v1
.end method

.method public i0(Lcom/olive/upi/transport/model/MasterUpdate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->s:Lcom/olive/upi/transport/model/MasterUpdate;

    return-void
.end method

.method public j()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Bank;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->m:Ljava/util/ArrayList;

    return-object v0
.end method

.method public j0(Lcom/olive/upi/transport/model/BillPayDataMaxAmount;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->t:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    return-void
.end method

.method public k()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Banner;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public k0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->w:Ljava/util/ArrayList;

    return-void
.end method

.method public l(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqa0;->f(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const p1, 0xd1b

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/OperatorsLogos;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->h:Ljava/util/ArrayList;

    return-void
.end method

.method public m()Ldg0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->g:Ldg0;

    return-object v0
.end method

.method public m0(Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->a:Ljava/util/ArrayList;

    .line 2
    invoke-static {p2, p1}, Ljg0;->S(Landroid/content/Context;Ljava/util/ArrayList;)V

    return-void
.end method

.method public n()Lcom/olive/upi/transport/model/BillPayDataMaxAmount;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->t:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    return-object v0
.end method

.method public n0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public o()Lcom/olive/upi/transport/model/BillerChargeReq;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->y:Lcom/olive/upi/transport/model/BillerChargeReq;

    return-object v0
.end method

.method public o0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->z:Ljava/util/ArrayList;

    return-void
.end method

.method public p(Ljava/lang/String;)Lcom/olive/upi/transport/model/GCMMessage;
    .locals 3

    .line 1
    iget-object v0, p0, Lqa0;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lqa0;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 3
    iget-object v2, p0, Lqa0;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/GCMMessage;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/GCMMessage;->getTxnid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    iget-object p1, p0, Lqa0;->k:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/GCMMessage;

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lqa0;->Y(Lcom/olive/upi/transport/model/GCMMessage;)V

    .line 6
    iget-object v1, p0, Lqa0;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public p0(Z)V
    .locals 0

    return-void
.end method

.method public q()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->j:Ljava/util/ArrayList;

    return-object v0
.end method

.method public q0(Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->p:Ljava/util/ArrayList;

    const p2, 0xd1c

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 2
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    iget-object v0, p0, Lqa0;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lqa0;->p:Ljava/util/ArrayList;

    new-instance p2, Lqa0$b;

    invoke-direct {p2, p0}, Lqa0$b;-><init>(Lqa0;)V

    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 4
    :cond_0
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Ln70;->v(Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method public r()Lcom/olive/upi/transport/model/GCMMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->q:Lcom/olive/upi/transport/model/GCMMessage;

    return-object v0
.end method

.method public r0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqa0;->r:I

    return-void
.end method

.method public s()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->x:Ljava/util/ArrayList;

    return-object v0
.end method

.method public s0(Lcom/olive/upi/transport/model/Bank;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->A:Lcom/olive/upi/transport/model/Bank;

    return-void
.end method

.method public t()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/DTHOperator;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method public t0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->n:Ljava/util/ArrayList;

    return-void
.end method

.method public u(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->n:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    iget-object v0, p0, Lqa0;->o:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lqa0;->o:Ljava/util/ArrayList;

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 5
    :goto_0
    iget-object v0, p0, Lqa0;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/TranHistory;

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TranHistory;->getCreditAccount()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TranHistory;->getCreditAccount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TranHistory;->getDebitAccount()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TranHistory;->getDebitAccount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    :cond_4
    iget-object v2, p0, Lqa0;->o:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 8
    :cond_5
    iget-object p1, p0, Lqa0;->o:Ljava/util/ArrayList;

    return-object p1

    :cond_6
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public u0(Lcom/olive/upi/transport/model/TransactionData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->e:Lcom/olive/upi/transport/model/TransactionData;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lqa0;->b0(Z)V

    :cond_0
    return-void
.end method

.method public v0(Lqa0$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqa0;->l:Lqa0$e;

    return-void
.end method

.method public w()Lcom/olive/upi/transport/model/Mandate;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->u:Lcom/olive/upi/transport/model/Mandate;

    return-object v0
.end method

.method public w0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/UrlConfig;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public x()Lsg0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->v:Lsg0;

    return-object v0
.end method

.method public x0(Lcom/olive/upi/transport/model/Account;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lqa0;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/CustomerBankAccounts;

    .line 3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->getAccounts()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/olive/upi/transport/model/Account;

    .line 6
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 7
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/Account;->setBankName(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/Account;->setIin(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public y()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqa0;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public y0(Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_5

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lqa0;->a:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lqa0;->a:Ljava/util/ArrayList;

    .line 4
    :cond_0
    iget-object v1, p0, Lqa0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/CustomerBankAccounts;

    .line 5
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->getAccounts()Ljava/util/ArrayList;

    move-result-object v4

    .line 6
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/olive/upi/transport/model/Account;

    .line 7
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->getBankCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v4, :cond_2

    move-object v4, p1

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    :goto_0
    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->setAccounts(Ljava/util/ArrayList;)V

    move-object v0, v2

    :cond_3
    if-nez v0, :cond_4

    .line 10
    new-instance v0, Lcom/olive/upi/transport/model/CustomerBankAccounts;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/CustomerBankAccounts;-><init>()V

    .line 11
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->setBankCode(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->setBankName(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/CustomerBankAccounts;->setAccounts(Ljava/util/ArrayList;)V

    .line 14
    iget-object p1, p0, Lqa0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_4
    iget-object p1, p0, Lqa0;->a:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lqa0;->m0(Ljava/util/ArrayList;Landroid/content/Context;)V

    :cond_5
    return-void
.end method

.method public z()Lcom/olive/upi/transport/model/MandateTransactionData;
    .locals 1

    .line 1
    iget-object v0, p0, Lqa0;->B:Lcom/olive/upi/transport/model/MandateTransactionData;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;-><init>()V

    iput-object v0, p0, Lqa0;->B:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 3
    :cond_0
    iget-object v0, p0, Lqa0;->B:Lcom/olive/upi/transport/model/MandateTransactionData;

    return-object v0
.end method

.method public z0(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lqa0;->b:Ljava/util/ArrayList;

    return-void
.end method
