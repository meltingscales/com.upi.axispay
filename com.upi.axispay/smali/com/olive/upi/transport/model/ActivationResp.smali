.class public Lcom/olive/upi/transport/model/ActivationResp;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public action:Ljava/lang/String;

.field public valEnd:Ljava/lang/String;

.field public valStart:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ActivationResp;->action:Ljava/lang/String;

    return-object v0
.end method

.method public getValEnd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ActivationResp;->valEnd:Ljava/lang/String;

    return-object v0
.end method

.method public getValStart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ActivationResp;->valStart:Ljava/lang/String;

    return-object v0
.end method

.method public setAction(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ActivationResp;->action:Ljava/lang/String;

    return-void
.end method

.method public setValEnd(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ActivationResp;->valEnd:Ljava/lang/String;

    return-void
.end method

.method public setValStart(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ActivationResp;->valStart:Ljava/lang/String;

    return-void
.end method
