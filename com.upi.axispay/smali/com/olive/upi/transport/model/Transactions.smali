.class public Lcom/olive/upi/transport/model/Transactions;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field private amount:Ljava/lang/String;

.field private date:Ljava/lang/String;

.field private fromAcc:Ljava/lang/String;

.field private fromName:Ljava/lang/String;

.field private remarks:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private toAcc:Ljava/lang/String;

.field private toName:Ljava/lang/String;

.field private tranType:Ljava/lang/String;

.field private tranid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->tranid:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/olive/upi/transport/model/Transactions;->date:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/olive/upi/transport/model/Transactions;->amount:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/olive/upi/transport/model/Transactions;->tranType:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/olive/upi/transport/model/Transactions;->remarks:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->tranid:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lcom/olive/upi/transport/model/Transactions;->date:Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lcom/olive/upi/transport/model/Transactions;->fromAcc:Ljava/lang/String;

    .line 12
    iput-object p4, p0, Lcom/olive/upi/transport/model/Transactions;->toAcc:Ljava/lang/String;

    .line 13
    iput-object p5, p0, Lcom/olive/upi/transport/model/Transactions;->amount:Ljava/lang/String;

    .line 14
    iput-object p6, p0, Lcom/olive/upi/transport/model/Transactions;->tranType:Ljava/lang/String;

    .line 15
    iput-object p7, p0, Lcom/olive/upi/transport/model/Transactions;->status:Ljava/lang/String;

    .line 16
    iput-object p8, p0, Lcom/olive/upi/transport/model/Transactions;->remarks:Ljava/lang/String;

    .line 17
    iput-object p9, p0, Lcom/olive/upi/transport/model/Transactions;->fromName:Ljava/lang/String;

    .line 18
    iput-object p10, p0, Lcom/olive/upi/transport/model/Transactions;->toName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->date:Ljava/lang/String;

    return-object v0
.end method

.method public getFromAcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->fromAcc:Ljava/lang/String;

    return-object v0
.end method

.method public getFromName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->fromName:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getToAcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->toAcc:Ljava/lang/String;

    return-object v0
.end method

.method public getToName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->toName:Ljava/lang/String;

    return-object v0
.end method

.method public getTranType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->tranType:Ljava/lang/String;

    return-object v0
.end method

.method public getTranid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Transactions;->tranid:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->amount:Ljava/lang/String;

    return-void
.end method

.method public setDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->date:Ljava/lang/String;

    return-void
.end method

.method public setFromAcc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->fromAcc:Ljava/lang/String;

    return-void
.end method

.method public setFromName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->fromName:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->status:Ljava/lang/String;

    return-void
.end method

.method public setToAcc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->toAcc:Ljava/lang/String;

    return-void
.end method

.method public setToName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->toName:Ljava/lang/String;

    return-void
.end method

.method public setTranType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->tranType:Ljava/lang/String;

    return-void
.end method

.method public setTranid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Transactions;->tranid:Ljava/lang/String;

    return-void
.end method
