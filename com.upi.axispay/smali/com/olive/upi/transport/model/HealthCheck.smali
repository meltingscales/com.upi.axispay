.class public Lcom/olive/upi/transport/model/HealthCheck;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public aggregators:Ljava/lang/String;

.field public keyword_msg:Ljava/lang/String;

.field public service_provider_num:Ljava/lang/String;

.field public upgradetype:Ljava/lang/String;

.field public version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAggregators()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/HealthCheck;->aggregators:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyword_msg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/HealthCheck;->keyword_msg:Ljava/lang/String;

    return-object v0
.end method

.method public getService_provider_num()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/HealthCheck;->service_provider_num:Ljava/lang/String;

    return-object v0
.end method

.method public getUpgradetype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/HealthCheck;->upgradetype:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/HealthCheck;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setAggregators(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/HealthCheck;->aggregators:Ljava/lang/String;

    return-void
.end method

.method public setKeyword_msg(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/HealthCheck;->keyword_msg:Ljava/lang/String;

    return-void
.end method

.method public setService_provider_num(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/HealthCheck;->service_provider_num:Ljava/lang/String;

    return-void
.end method

.method public setUpgradetype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/HealthCheck;->upgradetype:Ljava/lang/String;

    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/HealthCheck;->version:Ljava/lang/String;

    return-void
.end method
