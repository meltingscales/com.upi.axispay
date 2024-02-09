.class public Lcom/olive/upi/transport/model/RechargePlanParam;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public consumerno:Ljava/lang/String;

.field public servicecode:Ljava/lang/String;

.field public spcode:Ljava/lang/String;

.field public sspcode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->servicecode:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->consumerno:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->spcode:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->sspcode:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getConsumerno()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->consumerno:Ljava/lang/String;

    return-object v0
.end method

.method public getServicecode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->servicecode:Ljava/lang/String;

    return-object v0
.end method

.method public getSpcode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->spcode:Ljava/lang/String;

    return-object v0
.end method

.method public getSspcode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->sspcode:Ljava/lang/String;

    return-object v0
.end method

.method public setConsumerno(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->consumerno:Ljava/lang/String;

    return-void
.end method

.method public setServicecode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->servicecode:Ljava/lang/String;

    return-void
.end method

.method public setSpcode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->spcode:Ljava/lang/String;

    return-void
.end method

.method public setSspcode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RechargePlanParam;->sspcode:Ljava/lang/String;

    return-void
.end method
