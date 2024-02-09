.class public Lcom/olive/upi/transport/model/CustomerReg;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public data:Ljava/lang/String;

.field public refid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CustomerReg;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getRefid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CustomerReg;->refid:Ljava/lang/String;

    return-object v0
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CustomerReg;->data:Ljava/lang/String;

    return-void
.end method

.method public setRefid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CustomerReg;->refid:Ljava/lang/String;

    return-void
.end method
