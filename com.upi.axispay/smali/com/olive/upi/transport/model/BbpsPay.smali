.class public Lcom/olive/upi/transport/model/BbpsPay;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public bbpspay:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

.field public payRequest:Lcom/olive/upi/transport/model/PayRequest;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setBbpspay(Lcom/olive/upi/transport/model/BillerRegEnqResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsPay;->bbpspay:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    return-void
.end method

.method public setPayRequest(Lcom/olive/upi/transport/model/PayRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsPay;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    return-void
.end method
