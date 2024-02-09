.class public Lof0$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof0;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lof0;


# direct methods
.method public constructor <init>(Lof0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lof0$g;->b:Lof0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lof0$g;->b:Lof0;

    iget-object p1, p1, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 3
    iget-object p1, p0, Lof0$g;->b:Lof0;

    iget-object p1, p1, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lof0$g;->b:Lof0;

    iget-object p1, p1, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setIsfromSendMoney(Z)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lof0$g;->b:Lof0;

    iget-object v0, v0, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 6
    iget-object p1, p0, Lof0$g;->b:Lof0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v0, 0x18

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
