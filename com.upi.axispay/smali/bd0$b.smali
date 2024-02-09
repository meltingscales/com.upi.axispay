.class public Lbd0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbd0;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lbd0;


# direct methods
.method public constructor <init>(Lbd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbd0$b;->b:Lbd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lbd0$b;->b:Lbd0;

    iget-object p1, p1, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lbd0$b;->b:Lbd0;

    iget-object v0, p1, Lbd0;->m:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-static {p1, v0}, Lbd0;->x(Lbd0;Lcom/olive/upi/transport/model/Account;)V

    return-void
.end method
