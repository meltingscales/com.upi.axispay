.class public Lcom/olive/upi/transport/model/BillPay;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public billid:Ljava/lang/String;

.field public billinfo:Ljava/lang/String;

.field public payRequest:Lcom/olive/upi/transport/model/PayRequest;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBillid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillPay;->billid:Ljava/lang/String;

    return-object v0
.end method

.method public getBillinfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillPay;->billinfo:Ljava/lang/String;

    return-object v0
.end method

.method public getPayRequest()Lcom/olive/upi/transport/model/PayRequest;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillPay;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    return-object v0
.end method

.method public setBillid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillPay;->billid:Ljava/lang/String;

    return-void
.end method

.method public setBillinfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillPay;->billinfo:Ljava/lang/String;

    return-void
.end method

.method public setPayRequest(Lcom/olive/upi/transport/model/PayRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillPay;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    return-void
.end method
