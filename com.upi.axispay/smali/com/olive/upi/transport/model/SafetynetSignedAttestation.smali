.class public Lcom/olive/upi/transport/model/SafetynetSignedAttestation;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public apiKey:Ljava/lang/String;

.field public signedAttestation:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getApiKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/SafetynetSignedAttestation;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public getSignedAttestation()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/SafetynetSignedAttestation;->signedAttestation:Ljava/lang/String;

    return-object v0
.end method

.method public setApiKey(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/SafetynetSignedAttestation;->apiKey:Ljava/lang/String;

    return-void
.end method

.method public setSignedAttestation(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/SafetynetSignedAttestation;->signedAttestation:Ljava/lang/String;

    return-void
.end method
