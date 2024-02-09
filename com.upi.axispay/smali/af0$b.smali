.class public Laf0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf0;->s(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/PendingReqVo;

.field public final synthetic c:Laf0;


# direct methods
.method public constructor <init>(Laf0;Lcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laf0$b;->c:Laf0;

    iput-object p2, p0, Laf0$b;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Laf0$b;->c:Laf0;

    iget-object v0, p0, Laf0$b;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-static {p1, v0}, Laf0;->y(Laf0;Lcom/olive/upi/transport/model/PendingReqVo;)V

    return-void
.end method
