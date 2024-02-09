.class public Lcom/olive/upi/transport/model/LimitCheckReq;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public ac:Lcom/olive/upi/transport/model/Account;

.field public amount:Ljava/lang/String;

.field public device:Lcom/olive/upi/transport/model/DeviceDetails;

.field public payees:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Payee;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAc()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->ac:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getPayees()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Payee;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->payees:Ljava/util/List;

    return-object v0
.end method

.method public setAc(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->ac:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->amount:Ljava/lang/String;

    return-void
.end method

.method public setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->device:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setPayees(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Payee;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LimitCheckReq;->payees:Ljava/util/List;

    return-void
.end method
