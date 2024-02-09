.class public Lcom/olive/upi/transport/model/SetProfile;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public accountNo:Ljava/lang/String;

.field public vpa:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/model/SetProfile;->vpa:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/olive/upi/transport/model/SetProfile;->accountNo:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAccountNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/SetProfile;->accountNo:Ljava/lang/String;

    return-object v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/SetProfile;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public setAccountNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/SetProfile;->accountNo:Ljava/lang/String;

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/SetProfile;->vpa:Ljava/lang/String;

    return-void
.end method
