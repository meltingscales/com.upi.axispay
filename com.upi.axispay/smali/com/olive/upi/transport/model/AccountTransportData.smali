.class public Lcom/olive/upi/transport/model/AccountTransportData;
.super Lcom/olive/upi/transport/model/LibTransportData;
.source "AxisPay"


# instance fields
.field private account:Lcom/olive/upi/transport/model/Account;

.field public salt:Lcom/olive/upi/transport/model/lib/Salt;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/olive/upi/transport/model/LibTransportData;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccount()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountTransportData;->account:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getSalt()Lcom/olive/upi/transport/model/lib/Salt;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/AccountTransportData;->salt:Lcom/olive/upi/transport/model/lib/Salt;

    return-object v0
.end method

.method public setAccount(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountTransportData;->account:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setSalt(Lcom/olive/upi/transport/model/lib/Salt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/AccountTransportData;->salt:Lcom/olive/upi/transport/model/lib/Salt;

    return-void
.end method
