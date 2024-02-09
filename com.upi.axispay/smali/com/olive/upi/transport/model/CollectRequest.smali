.class public Lcom/olive/upi/transport/model/CollectRequest;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public account:Lcom/olive/upi/transport/model/Account;

.field public amount:Ljava/lang/Double;

.field public beneVpa:Lcom/olive/upi/transport/model/BeneVpa;

.field public date:Ljava/lang/String;

.field public remarks:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/model/Account;Lcom/olive/upi/transport/model/BeneVpa;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/model/CollectRequest;->account:Lcom/olive/upi/transport/model/Account;

    .line 3
    iput-object p2, p0, Lcom/olive/upi/transport/model/CollectRequest;->beneVpa:Lcom/olive/upi/transport/model/BeneVpa;

    .line 4
    iput-object p3, p0, Lcom/olive/upi/transport/model/CollectRequest;->amount:Ljava/lang/Double;

    .line 5
    iput-object p4, p0, Lcom/olive/upi/transport/model/CollectRequest;->remarks:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/olive/upi/transport/model/CollectRequest;->date:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAccount()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CollectRequest;->account:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getAmount()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CollectRequest;->amount:Ljava/lang/Double;

    return-object v0
.end method

.method public getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CollectRequest;->beneVpa:Lcom/olive/upi/transport/model/BeneVpa;

    return-object v0
.end method

.method public getDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CollectRequest;->date:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CollectRequest;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public setAccount(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CollectRequest;->account:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setAmount(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CollectRequest;->amount:Ljava/lang/Double;

    return-void
.end method

.method public setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CollectRequest;->beneVpa:Lcom/olive/upi/transport/model/BeneVpa;

    return-void
.end method

.method public setDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CollectRequest;->date:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CollectRequest;->remarks:Ljava/lang/String;

    return-void
.end method
