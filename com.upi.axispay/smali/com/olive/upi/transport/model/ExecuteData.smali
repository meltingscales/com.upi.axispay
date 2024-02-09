.class public Lcom/olive/upi/transport/model/ExecuteData;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public account:Lcom/olive/upi/transport/model/Account;

.field public action:Ljava/lang/String;

.field public payeevpa:Ljava/lang/String;

.field public payervpa:Ljava/lang/String;

.field public txnid:Ljava/lang/String;

.field public umn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccount()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ExecuteData;->account:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ExecuteData;->action:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeevpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ExecuteData;->payeevpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPayervpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ExecuteData;->payervpa:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ExecuteData;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public getUmnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ExecuteData;->umn:Ljava/lang/String;

    return-object v0
.end method

.method public setAccount(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ExecuteData;->account:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setAction(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ExecuteData;->action:Ljava/lang/String;

    return-void
.end method

.method public setPayeevpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ExecuteData;->payeevpa:Ljava/lang/String;

    return-void
.end method

.method public setPayervpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ExecuteData;->payervpa:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ExecuteData;->txnid:Ljava/lang/String;

    return-void
.end method

.method public setUmnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ExecuteData;->umn:Ljava/lang/String;

    return-void
.end method
