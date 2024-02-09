.class public Lde0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde0;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Landroid/app/Dialog;

.field public final synthetic j:Lde0;


# direct methods
.method public constructor <init>(Lde0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lde0$a;->j:Lde0;

    iput-object p2, p0, Lde0$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lde0$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lde0$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lde0$a;->e:Ljava/lang/String;

    iput-object p6, p0, Lde0$a;->f:Ljava/lang/String;

    iput-object p7, p0, Lde0$a;->g:Ljava/lang/String;

    iput-object p8, p0, Lde0$a;->h:Ljava/lang/String;

    iput-object p9, p0, Lde0$a;->i:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lde0$a;->j:Lde0;

    iget-object p1, p1, Lde0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_MANDATE_DECLINE:I

    const/16 v1, 0x83

    const v2, 0x3cc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-ne p1, v0, :cond_0

    .line 3
    new-instance p1, Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/UpdateMandate;-><init>()V

    .line 4
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/UpdateMandate;->setCustomerid(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/UpdateMandate;->setTxnid(Ljava/lang/String;)V

    .line 6
    iget-object v3, p0, Lde0$a;->j:Lde0;

    iget-object v3, v3, Lde0;->z:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/UpdateMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    const v3, 0x3cd

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/UpdateMandate;->setNewstate(Ljava/lang/String;)V

    .line 8
    iget-object v3, p0, Lde0$a;->b:Ljava/lang/String;

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/UpdateMandate;->setUmn(Ljava/lang/String;)V

    .line 9
    invoke-static {}, Leg0;->c()V

    .line 10
    iget-object v3, p0, Lde0$a;->j:Lde0;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v3

    invoke-static {v3}, Leg0;->i(Landroid/app/Activity;)V

    .line 11
    new-instance v3, Lcom/olive/upi/transport/model/UpdateMandateRequest;

    invoke-direct {v3}, Lcom/olive/upi/transport/model/UpdateMandateRequest;-><init>()V

    .line 12
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v5, 0x3ce

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setAppId(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setCustomerId(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v3, p1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->setUpdateMandate(Lcom/olive/upi/transport/model/UpdateMandate;)V

    .line 15
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x4c

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/model/MandateExecute;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/MandateExecute;-><init>()V

    .line 17
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setCustomerid(Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lde0$a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setUmn(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lde0$a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setExecute(Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lde0$a;->d:Ljava/lang/String;

    invoke-static {v0}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setAmount(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lde0$a;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setAmountrule(Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lde0$a;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setValiditystart(Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lde0$a;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setValidityend(Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lde0$a;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0x3cf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateExecute;->setRemarks(Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lde0$a;->j:Lde0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 27
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x52

    invoke-direct {v2, v1, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 28
    :goto_1
    iget-object p1, p0, Lde0$a;->i:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    return-void
.end method
