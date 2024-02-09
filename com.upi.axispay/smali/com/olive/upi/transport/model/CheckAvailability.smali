.class public Lcom/olive/upi/transport/model/CheckAvailability;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public customerId:Ljava/lang/String;

.field public customerVpaSuggetion:Lcom/olive/upi/transport/model/CustomerVpaSuggetion;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CheckAvailability;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerVpaSuggetion()Lcom/olive/upi/transport/model/CustomerVpaSuggetion;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CheckAvailability;->customerVpaSuggetion:Lcom/olive/upi/transport/model/CustomerVpaSuggetion;

    return-object v0
.end method

.method public setCustomerId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CheckAvailability;->customerId:Ljava/lang/String;

    return-void
.end method

.method public setCustomerVpaSuggetion(Lcom/olive/upi/transport/model/CustomerVpaSuggetion;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CheckAvailability;->customerVpaSuggetion:Lcom/olive/upi/transport/model/CustomerVpaSuggetion;

    return-void
.end method
