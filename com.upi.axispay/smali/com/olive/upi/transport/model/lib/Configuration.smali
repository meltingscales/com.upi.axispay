.class public Lcom/olive/upi/transport/model/lib/Configuration;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public backgroundColor:Ljava/lang/String;

.field public payerBankName:Ljava/lang/String;

.field public resendOTPFeature:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBackgroundColor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/lib/Configuration;->backgroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public getPayerBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/lib/Configuration;->payerBankName:Ljava/lang/String;

    return-object v0
.end method

.method public setBackgroundColor(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/lib/Configuration;->backgroundColor:Ljava/lang/String;

    return-void
.end method

.method public setPayerBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/lib/Configuration;->payerBankName:Ljava/lang/String;

    return-void
.end method

.method public setResendOTPFeature(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/lib/Configuration;->resendOTPFeature:Ljava/lang/String;

    return-void
.end method
