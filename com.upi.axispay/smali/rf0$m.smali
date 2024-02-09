.class public Lrf0$m;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lrf0;


# direct methods
.method public constructor <init>(Lrf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrf0$m;->b:Lrf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    new-instance p1, Lcom/olive/upi/transport/model/LimitCheckReq;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/LimitCheckReq;-><init>()V

    .line 2
    sget-object v0, Lrf0;->P:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 3
    iget-object v0, p0, Lrf0$m;->b:Lrf0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 4
    new-instance v0, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 5
    new-instance v1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lrf0$m;->b:Lrf0;

    iget-object v1, v1, Lrf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/LimitCheckReq;->setPayees(Ljava/util/List;)V

    .line 11
    iget-object v0, p0, Lrf0$m;->b:Lrf0;

    iget-object v0, v0, Lrf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setAmount(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lrf0$m;->b:Lrf0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x3f

    const/16 v3, 0x62

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/OliveUpiManager;->verifyLimit(Lcom/olive/upi/transport/OliveRequest;)V

    .line 13
    iget-object p1, p0, Lrf0$m;->b:Lrf0;

    invoke-static {p1}, Lrf0;->x(Lrf0;)V

    return-void
.end method
