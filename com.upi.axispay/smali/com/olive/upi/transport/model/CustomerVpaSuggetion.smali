.class public Lcom/olive/upi/transport/model/CustomerVpaSuggetion;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public accountno:Ljava/lang/String;

.field private cusomerId:Ljava/lang/String;

.field public vpa:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccountno()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CustomerVpaSuggetion;->accountno:Ljava/lang/String;

    return-object v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CustomerVpaSuggetion;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public setAccountno(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CustomerVpaSuggetion;->accountno:Ljava/lang/String;

    return-void
.end method

.method public setCusomerId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CustomerVpaSuggetion;->cusomerId:Ljava/lang/String;

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CustomerVpaSuggetion;->vpa:Ljava/lang/String;

    return-void
.end method
