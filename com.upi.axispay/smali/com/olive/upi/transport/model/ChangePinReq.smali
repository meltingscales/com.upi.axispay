.class public Lcom/olive/upi/transport/model/ChangePinReq;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public newPin:Ljava/lang/String;

.field public oldPin:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getNewPin()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangePinReq;->newPin:Ljava/lang/String;

    return-object v0
.end method

.method public getOldPin()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangePinReq;->oldPin:Ljava/lang/String;

    return-object v0
.end method

.method public setNewPin(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangePinReq;->newPin:Ljava/lang/String;

    return-void
.end method

.method public setOldPin(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangePinReq;->oldPin:Ljava/lang/String;

    return-void
.end method
