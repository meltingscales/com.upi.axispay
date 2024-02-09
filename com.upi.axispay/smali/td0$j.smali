.class public Ltd0$j;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd0;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ltd0;


# direct methods
.method public constructor <init>(Ltd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltd0$j;->b:Ltd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Ltd0$j;->b:Ltd0;

    iget-object p1, p1, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Ltd0$j;->b:Ltd0;

    invoke-static {p1}, Ltd0;->y(Ltd0;)V

    return-void
.end method
