.class public Lcom/olive/upi/transport/model/Payee;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public bamount:Ljava/lang/String;

.field public beneName:Ljava/lang/String;

.field public beneVpa:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBamount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Payee;->bamount:Ljava/lang/String;

    return-object v0
.end method

.method public getBeneName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Payee;->beneName:Ljava/lang/String;

    return-object v0
.end method

.method public getBeneVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Payee;->beneVpa:Ljava/lang/String;

    return-object v0
.end method

.method public setBamount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Payee;->bamount:Ljava/lang/String;

    return-void
.end method

.method public setBeneName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Payee;->beneName:Ljava/lang/String;

    return-void
.end method

.method public setBeneVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Payee;->beneVpa:Ljava/lang/String;

    return-void
.end method
