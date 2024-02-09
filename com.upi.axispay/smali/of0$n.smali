.class public Lof0$n;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/PendingReqVo;

.field public final synthetic c:Lof0;


# direct methods
.method public constructor <init>(Lof0;Lcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lof0$n;->c:Lof0;

    iput-object p2, p0, Lof0$n;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lof0$n;->c:Lof0;

    iget-object v0, p0, Lof0$n;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getTxnid()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lof0$n;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lof0;->C(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Leg0;->c()V

    return-void
.end method
