.class public Lcom/olive/upi/transport/model/QR;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public expireTs:Ljava/lang/String;

.field public qVer:Ljava/lang/String;

.field public qrMedium:Ljava/lang/String;

.field public ts:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getExpireTs()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/QR;->expireTs:Ljava/lang/String;

    return-object v0
.end method

.method public getQrMedium()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/QR;->qrMedium:Ljava/lang/String;

    return-object v0
.end method

.method public getTs()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/QR;->ts:Ljava/lang/String;

    return-object v0
.end method

.method public getqVer()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/QR;->qVer:Ljava/lang/String;

    return-object v0
.end method

.method public setExpireTs(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/QR;->expireTs:Ljava/lang/String;

    return-void
.end method

.method public setQrMedium(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/QR;->qrMedium:Ljava/lang/String;

    return-void
.end method

.method public setTs(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/QR;->ts:Ljava/lang/String;

    return-void
.end method

.method public setqVer(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/QR;->qVer:Ljava/lang/String;

    return-void
.end method
