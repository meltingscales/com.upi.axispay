.class public Lce0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lce0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/app/Dialog;

.field public final synthetic c:Lce0;


# direct methods
.method public constructor <init>(Lce0;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lce0$a;->c:Lce0;

    iput-object p2, p0, Lce0$a;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object v0, Lqa0$c;->b:Lqa0$c;

    invoke-virtual {p1, v0}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 3
    iget-object v0, p0, Lce0$a;->c:Lce0;

    iget-object v0, v0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 4
    new-instance p1, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 5
    iget-object v0, p0, Lce0$a;->c:Lce0;

    iget-object v0, v0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lce0$a;->c:Lce0;

    iget-object v0, v0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lce0$a;->c:Lce0;

    iget-object v0, v0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->setPayeeData(Lcom/olive/upi/transport/model/Payee;)V

    .line 8
    new-instance p1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 9
    iget-object v0, p0, Lce0$a;->c:Lce0;

    iget-object v0, v0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lce0$a;->c:Lce0;

    iget-object v0, v0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 11
    iget-object p1, p0, Lce0$a;->c:Lce0;

    iget-object p1, p1, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 12
    iget-object p1, p0, Lce0$a;->c:Lce0;

    iget-object p1, p1, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x2586

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lce0$a;->c:Lce0;

    iget-object p1, p1, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p1

    .line 13
    :goto_0
    iget-object v0, p0, Lce0$a;->c:Lce0;

    iget-object v0, v0, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lce0$a;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 15
    iget-object p1, p0, Lce0$a;->c:Lce0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 16
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x84

    const/16 v1, 0x1fe

    iget-object v2, p0, Lce0$a;->c:Lce0;

    iget-object v2, v2, Lce0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {p1, v0, v1, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0xb

    .line 17
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 18
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 19
    :cond_1
    iget-object p1, p0, Lce0$a;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 20
    iget-object p1, p0, Lce0$a;->c:Lce0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x2587

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void
.end method
