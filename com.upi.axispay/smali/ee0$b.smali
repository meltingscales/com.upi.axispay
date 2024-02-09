.class public Lee0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lee0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lee0;


# direct methods
.method public constructor <init>(Lee0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lee0$b;->b:Lee0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 2
    iget-object p1, p0, Lee0$b;->b:Lee0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v1, 0xb

    invoke-interface {p1, v1, v0}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method
