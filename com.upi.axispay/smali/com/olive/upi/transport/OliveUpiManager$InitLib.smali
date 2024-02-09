.class public Lcom/olive/upi/transport/OliveUpiManager$InitLib;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/OliveUpiManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "InitLib"
.end annotation


# instance fields
.field public challenge:Ljava/lang/String;

.field public data:Ljava/lang/Object;

.field public deviceId:Ljava/lang/String;

.field public expDayCount:I

.field public reqType:I

.field public final synthetic this$0:Lcom/olive/upi/transport/OliveUpiManager;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/OliveUpiManager;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->this$0:Lcom/olive/upi/transport/OliveUpiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->expDayCount:I

    .line 3
    iput-object p3, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->deviceId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getChallenge()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->challenge:Ljava/lang/String;

    return-object v0
.end method

.method public getData()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getExpDayCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->expDayCount:I

    return v0
.end method

.method public getReqType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->reqType:I

    return v0
.end method

.method public setChallenge(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->challenge:Ljava/lang/String;

    return-void
.end method

.method public setData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->data:Ljava/lang/Object;

    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->deviceId:Ljava/lang/String;

    return-void
.end method

.method public setExpDayCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->expDayCount:I

    return-void
.end method

.method public setReqType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->reqType:I

    return-void
.end method
