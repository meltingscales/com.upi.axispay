.class public Lcom/olive/upi/transport/model/BillPayDataMaxAmount;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public dthPrepaidMaxAmount:Ljava/lang/String;

.field public mobilePostpaidMaxAmount:Ljava/lang/String;

.field public mobilePrepaidMaxAmount:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x99d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->dthPrepaidMaxAmount:Ljava/lang/String;

    const v0, 0x99e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->mobilePrepaidMaxAmount:Ljava/lang/String;

    const v0, 0x99f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    iput-object v0, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->mobilePostpaidMaxAmount:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDthPrepaidMaxAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->dthPrepaidMaxAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getMobilePostpaidMaxAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->mobilePostpaidMaxAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getMobilePrepaidMaxAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->mobilePrepaidMaxAmount:Ljava/lang/String;

    return-object v0
.end method

.method public setDthPrepaidMaxAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->dthPrepaidMaxAmount:Ljava/lang/String;

    return-void
.end method

.method public setMobilePostpaidMaxAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->mobilePostpaidMaxAmount:Ljava/lang/String;

    return-void
.end method

.method public setMobilePrepaidMaxAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->mobilePrepaidMaxAmount:Ljava/lang/String;

    return-void
.end method
