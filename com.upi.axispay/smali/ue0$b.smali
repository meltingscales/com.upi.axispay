.class public Lue0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lue0;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lue0;


# direct methods
.method public constructor <init>(Lue0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lue0$b;->b:Lue0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lue0$b;->b:Lue0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lue0$b;->b:Lue0;

    iget-object v0, p1, Lxc0;->b:Lmg0;

    iget-object p1, p1, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    const/16 v1, 0x76

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
