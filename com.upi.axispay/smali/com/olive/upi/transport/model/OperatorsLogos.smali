.class public Lcom/olive/upi/transport/model/OperatorsLogos;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public logo:Ljava/lang/String;

.field public name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/model/OperatorsLogos;->name:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/olive/upi/transport/model/OperatorsLogos;->logo:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getLogo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/OperatorsLogos;->logo:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/OperatorsLogos;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setLogo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/OperatorsLogos;->logo:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/OperatorsLogos;->name:Ljava/lang/String;

    return-void
.end method
