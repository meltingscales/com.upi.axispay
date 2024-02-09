.class public Lcom/olive/upi/transport/model/RechargeDto;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field private rechargeplan:Lcom/olive/upi/transport/model/Rechargeplan;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRechargeplan()Lcom/olive/upi/transport/model/Rechargeplan;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RechargeDto;->rechargeplan:Lcom/olive/upi/transport/model/Rechargeplan;

    return-object v0
.end method

.method public setRechargeplan(Lcom/olive/upi/transport/model/Rechargeplan;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RechargeDto;->rechargeplan:Lcom/olive/upi/transport/model/Rechargeplan;

    return-void
.end method
