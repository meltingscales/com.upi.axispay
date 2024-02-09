.class public Lcom/olive/upi/transport/model/Recharge;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/olive/upi/transport/model/Recharge;",
        ">;"
    }
.end annotation


# instance fields
.field private denomination:Ljava/lang/String;

.field private processingfees:Ljava/lang/String;

.field private remarks:Ljava/lang/String;

.field private servicetax:Ljava/lang/String;

.field private talktime:Ljava/lang/String;

.field private validfrom:Ljava/lang/String;

.field private validity:Ljava/lang/String;

.field private validto:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/olive/upi/transport/model/Recharge;)I
    .locals 4

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->denomination:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 3
    iget-object p1, p1, Lcom/olive/upi/transport/model/Recharge;->denomination:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    .line 4
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/olive/upi/transport/model/Recharge;

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/model/Recharge;->compareTo(Lcom/olive/upi/transport/model/Recharge;)I

    move-result p1

    return p1
.end method

.method public getDenomination()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->denomination:Ljava/lang/String;

    return-object v0
.end method

.method public getProcessingfees()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->processingfees:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getServicetax()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->servicetax:Ljava/lang/String;

    return-object v0
.end method

.method public getTalktime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->talktime:Ljava/lang/String;

    return-object v0
.end method

.method public getValidfrom()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->validfrom:Ljava/lang/String;

    return-object v0
.end method

.method public getValidity()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->validity:Ljava/lang/String;

    return-object v0
.end method

.method public getValidto()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Recharge;->validto:Ljava/lang/String;

    return-object v0
.end method

.method public setDenomination(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->denomination:Ljava/lang/String;

    return-void
.end method

.method public setProcessingfees(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->processingfees:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setServicetax(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->servicetax:Ljava/lang/String;

    return-void
.end method

.method public setTalktime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->talktime:Ljava/lang/String;

    return-void
.end method

.method public setValidfrom(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->validfrom:Ljava/lang/String;

    return-void
.end method

.method public setValidity(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->validity:Ljava/lang/String;

    return-void
.end method

.method public setValidto(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Recharge;->validto:Ljava/lang/String;

    return-void
.end method
