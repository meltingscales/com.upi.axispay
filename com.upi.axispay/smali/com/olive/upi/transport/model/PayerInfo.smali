.class public Lcom/olive/upi/transport/model/PayerInfo;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public accountnumber:Ljava/lang/String;

.field public mcc:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public payervpa:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccountnumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInfo;->accountnumber:Ljava/lang/String;

    return-object v0
.end method

.method public getMcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInfo;->mcc:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPayervpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PayerInfo;->payervpa:Ljava/lang/String;

    return-object v0
.end method

.method public setAccountnumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInfo;->accountnumber:Ljava/lang/String;

    return-void
.end method

.method public setMcc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInfo;->mcc:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public setPayervpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PayerInfo;->payervpa:Ljava/lang/String;

    return-void
.end method
