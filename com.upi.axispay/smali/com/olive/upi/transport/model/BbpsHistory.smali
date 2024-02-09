.class public Lcom/olive/upi/transport/model/BbpsHistory;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public amount:Ljava/lang/String;

.field public billername:Ljava/lang/String;

.field public mobilenumber:Ljava/lang/String;

.field public rrn:Ljava/lang/String;

.field public status:Ljava/lang/String;

.field public txndate:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BbpsHistory;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getBillername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BbpsHistory;->billername:Ljava/lang/String;

    return-object v0
.end method

.method public getMobilenumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BbpsHistory;->mobilenumber:Ljava/lang/String;

    return-object v0
.end method

.method public getRrn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BbpsHistory;->rrn:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BbpsHistory;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTxndate()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BbpsHistory;->txndate:Ljava/util/Date;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsHistory;->amount:Ljava/lang/String;

    return-void
.end method

.method public setBillername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsHistory;->billername:Ljava/lang/String;

    return-void
.end method

.method public setMobilenumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsHistory;->mobilenumber:Ljava/lang/String;

    return-void
.end method

.method public setRrn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsHistory;->rrn:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsHistory;->status:Ljava/lang/String;

    return-void
.end method

.method public setTxndate(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BbpsHistory;->txndate:Ljava/util/Date;

    return-void
.end method
