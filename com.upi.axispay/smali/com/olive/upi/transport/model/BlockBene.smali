.class public Lcom/olive/upi/transport/model/BlockBene;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/model/CheckSum;


# instance fields
.field public block:Ljava/lang/String;

.field public customerid:Ljava/lang/String;

.field public txnid:Ljava/lang/String;

.field public vpa:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBlock()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BlockBene;->block:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BlockBene;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/olive/upi/transport/model/BlockBene;->customerid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/BlockBene;->vpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/BlockBene;->txnid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/BlockBene;->block:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTxnid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BlockBene;->txnid:Ljava/lang/String;

    return-object v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BlockBene;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public setBlock(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BlockBene;->block:Ljava/lang/String;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BlockBene;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setTxnid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BlockBene;->txnid:Ljava/lang/String;

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BlockBene;->vpa:Ljava/lang/String;

    return-void
.end method
