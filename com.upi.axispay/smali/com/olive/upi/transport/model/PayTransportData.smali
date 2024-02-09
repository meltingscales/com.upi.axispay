.class public Lcom/olive/upi/transport/model/PayTransportData;
.super Lcom/olive/upi/transport/model/LibTransportData;
.source "AxisPay"


# instance fields
.field public billId:Ljava/lang/String;

.field public billInfo:Ljava/lang/String;

.field private payeeName:Ljava/lang/String;

.field public payrequest:Lcom/olive/upi/transport/model/PayRequest;

.field private refUrl:Ljava/lang/String;

.field public salt:Lcom/olive/upi/transport/model/lib/PaymentSalt;

.field public umnId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/olive/upi/transport/model/LibTransportData;-><init>()V

    return-void
.end method


# virtual methods
.method public getBillId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayTransportData;->billId:Ljava/lang/String;

    return-object v0
.end method

.method public getBillInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayTransportData;->billInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayTransportData;->payeeName:Ljava/lang/String;

    return-object v0
.end method

.method public getPayrequest()Lcom/olive/upi/transport/model/PayRequest;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayTransportData;->payrequest:Lcom/olive/upi/transport/model/PayRequest;

    return-object v0
.end method

.method public getRefUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayTransportData;->refUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSalt()Lcom/olive/upi/transport/model/lib/PaymentSalt;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayTransportData;->salt:Lcom/olive/upi/transport/model/lib/PaymentSalt;

    return-object v0
.end method

.method public getUmnId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayTransportData;->umnId:Ljava/lang/String;

    return-object v0
.end method

.method public setBillId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayTransportData;->billId:Ljava/lang/String;

    return-void
.end method

.method public setBillInfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayTransportData;->billInfo:Ljava/lang/String;

    return-void
.end method

.method public setPayeeName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayTransportData;->payeeName:Ljava/lang/String;

    return-void
.end method

.method public setPayrequest(Lcom/olive/upi/transport/model/PayRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayTransportData;->payrequest:Lcom/olive/upi/transport/model/PayRequest;

    return-void
.end method

.method public setRefUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayTransportData;->refUrl:Ljava/lang/String;

    return-void
.end method

.method public setSalt(Lcom/olive/upi/transport/model/lib/PaymentSalt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayTransportData;->salt:Lcom/olive/upi/transport/model/lib/PaymentSalt;

    return-void
.end method

.method public setUmnId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayTransportData;->umnId:Ljava/lang/String;

    return-void
.end method
