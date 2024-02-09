.class public Lue0$c;
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
    iput-object p1, p0, Lue0$c;->b:Lue0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lue0$c;->b:Lue0;

    iget-object p1, p1, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Leg0;->c()V

    .line 3
    iget-object p1, p0, Lue0$c;->b:Lue0;

    invoke-virtual {p1}, Lue0;->z()Z

    return-void
.end method
