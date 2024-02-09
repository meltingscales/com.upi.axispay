.class public Lcom/olive/upi/transport/model/TokenResponse;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/model/CheckSum;


# instance fields
.field public amount:Ljava/lang/Double;

.field public asap:Ljava/lang/String;

.field public bannerVersion:I

.field public billervpa:Ljava/lang/String;

.field public billpayMaxAmtVersion:I

.field public billpayvpa:Ljava/lang/String;

.field public checksumWebUrl:Ljava/lang/String;

.field public counter:Ljava/lang/String;

.field public dthOperatorVersion:I

.field public email:Ljava/lang/String;

.field public encryptionFlag:Ljava/lang/String;

.field public flrespdesc:Ljava/lang/String;

.field public fprespdesc:Ljava/lang/String;

.field public mobOperatorVersion:I

.field public nothanks:I

.field public notification:I

.field public prefixDthVersion:I

.field public prefixMobVersion:I

.field public rateitnow:I

.field public refereevpa:Ljava/lang/String;

.field public remindmelater:I

.field public token:Ljava/lang/String;

.field public tokenValidDays:I

.field public tokenexpirydays:I

.field public vpa:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->amount:Ljava/lang/Double;

    return-object v0
.end method

.method public getAsap()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->asap:Ljava/lang/String;

    return-object v0
.end method

.method public getBannerVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->bannerVersion:I

    return v0
.end method

.method public getBillervpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->billervpa:Ljava/lang/String;

    return-object v0
.end method

.method public getBillpayMaxAmtVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->billpayMaxAmtVersion:I

    return v0
.end method

.method public getBillpayvpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->billpayvpa:Ljava/lang/String;

    return-object v0
.end method

.method public getChecksumWebUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->checksumWebUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCounter()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->counter:Ljava/lang/String;

    return-object v0
.end method

.method public getDthOperatorVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->dthOperatorVersion:I

    return v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getEncryptionFlag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->encryptionFlag:Ljava/lang/String;

    return-object v0
.end method

.method public getFlrespdesc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->flrespdesc:Ljava/lang/String;

    return-object v0
.end method

.method public getFprespdesc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->fprespdesc:Ljava/lang/String;

    return-object v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/olive/upi/transport/model/TokenResponse;->token:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TokenResponse;->vpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/olive/upi/transport/model/TokenResponse;->notification:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMobOperatorVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->mobOperatorVersion:I

    return v0
.end method

.method public getNothanks()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->nothanks:I

    return v0
.end method

.method public getNotification()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->notification:I

    return v0
.end method

.method public getPrefixDthVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->prefixDthVersion:I

    return v0
.end method

.method public getPrefixMobVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->prefixMobVersion:I

    return v0
.end method

.method public getRateitnow()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->rateitnow:I

    return v0
.end method

.method public getRefereevpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->refereevpa:Ljava/lang/String;

    return-object v0
.end method

.method public getRemindmelater()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->remindmelater:I

    return v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->token:Ljava/lang/String;

    return-object v0
.end method

.method public getTokenValidDays()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->tokenValidDays:I

    return v0
.end method

.method public getTokenexpirydays()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->tokenexpirydays:I

    return v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TokenResponse;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->amount:Ljava/lang/Double;

    return-void
.end method

.method public setAsap(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->asap:Ljava/lang/String;

    return-void
.end method

.method public setBannerVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->bannerVersion:I

    return-void
.end method

.method public setBillervpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->billervpa:Ljava/lang/String;

    return-void
.end method

.method public setBillpayMaxAmtVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->billpayMaxAmtVersion:I

    return-void
.end method

.method public setBillpayvpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->billpayvpa:Ljava/lang/String;

    return-void
.end method

.method public setChecksumWebUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->checksumWebUrl:Ljava/lang/String;

    return-void
.end method

.method public setCounter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->counter:Ljava/lang/String;

    return-void
.end method

.method public setDthOperatorVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->dthOperatorVersion:I

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->email:Ljava/lang/String;

    return-void
.end method

.method public setEncryptionFlag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->encryptionFlag:Ljava/lang/String;

    return-void
.end method

.method public setFlrespdesc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->flrespdesc:Ljava/lang/String;

    return-void
.end method

.method public setFprespdesc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->fprespdesc:Ljava/lang/String;

    return-void
.end method

.method public setMobOperatorVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->mobOperatorVersion:I

    return-void
.end method

.method public setNothanks(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->nothanks:I

    return-void
.end method

.method public setNotification(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->notification:I

    return-void
.end method

.method public setPrefixDthVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->prefixDthVersion:I

    return-void
.end method

.method public setPrefixMobVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->prefixMobVersion:I

    return-void
.end method

.method public setRateitnow(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->rateitnow:I

    return-void
.end method

.method public setRefereevpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->refereevpa:Ljava/lang/String;

    return-void
.end method

.method public setRemindmelater(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->remindmelater:I

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->token:Ljava/lang/String;

    return-void
.end method

.method public setTokenValidDays(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->tokenValidDays:I

    return-void
.end method

.method public setTokenexpirydays(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->tokenexpirydays:I

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TokenResponse;->vpa:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x12cd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/TokenResponse;->token:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v2, 0x12ce

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/olive/upi/transport/model/TokenResponse;->vpa:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v1, 0x12cf

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/olive/upi/transport/model/TokenResponse;->notification:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
