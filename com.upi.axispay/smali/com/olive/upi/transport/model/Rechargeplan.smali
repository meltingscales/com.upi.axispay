.class public Lcom/olive/upi/transport/model/Rechargeplan;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field private circle:Lcom/olive/upi/transport/model/Circle;

.field private operator:Lcom/olive/upi/transport/model/Operator;

.field private response:Lcom/olive/upi/transport/model/Response;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCircle()Lcom/olive/upi/transport/model/Circle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Rechargeplan;->circle:Lcom/olive/upi/transport/model/Circle;

    return-object v0
.end method

.method public getOperator()Lcom/olive/upi/transport/model/Operator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Rechargeplan;->operator:Lcom/olive/upi/transport/model/Operator;

    return-object v0
.end method

.method public getResponse()Lcom/olive/upi/transport/model/Response;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Rechargeplan;->response:Lcom/olive/upi/transport/model/Response;

    return-object v0
.end method

.method public setCircle(Lcom/olive/upi/transport/model/Circle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Rechargeplan;->circle:Lcom/olive/upi/transport/model/Circle;

    return-void
.end method

.method public setOperator(Lcom/olive/upi/transport/model/Operator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Rechargeplan;->operator:Lcom/olive/upi/transport/model/Operator;

    return-void
.end method

.method public setResponse(Lcom/olive/upi/transport/model/Response;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Rechargeplan;->response:Lcom/olive/upi/transport/model/Response;

    return-void
.end method
