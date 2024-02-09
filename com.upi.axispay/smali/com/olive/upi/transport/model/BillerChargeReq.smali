.class public Lcom/olive/upi/transport/model/BillerChargeReq;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public AMOUNT:Lcom/olive/upi/transport/model/TagList;

.field public AMT:Ljava/lang/String;

.field public CORP_CODE:Ljava/lang/String;

.field public OU_ID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAMOUNT()Lcom/olive/upi/transport/model/TagList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->AMOUNT:Lcom/olive/upi/transport/model/TagList;

    return-object v0
.end method

.method public getAMT()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->AMT:Ljava/lang/String;

    return-object v0
.end method

.method public getCORP_CODE()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->CORP_CODE:Ljava/lang/String;

    return-object v0
.end method

.method public getOU_ID()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->OU_ID:Ljava/lang/String;

    return-object v0
.end method

.method public setAMOUNT(Lcom/olive/upi/transport/model/TagList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->AMOUNT:Lcom/olive/upi/transport/model/TagList;

    return-void
.end method

.method public setAMT(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->AMT:Ljava/lang/String;

    return-void
.end method

.method public setCORP_CODE(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->CORP_CODE:Ljava/lang/String;

    return-void
.end method

.method public setOU_ID(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerChargeReq;->OU_ID:Ljava/lang/String;

    return-void
.end method
