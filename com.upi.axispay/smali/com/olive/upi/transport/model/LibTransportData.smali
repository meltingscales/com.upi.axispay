.class public Lcom/olive/upi/transport/model/LibTransportData;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public commonLibToken:Ljava/lang/String;

.field public configuration:Lcom/olive/upi/transport/model/lib/Configuration;

.field public credAllowedWrapper:Lcom/olive/upi/transport/model/CredAllowedWrapper;

.field public deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

.field public language:Ljava/lang/String;

.field public maskedAccNo:Ljava/lang/String;

.field public mobileNumber:Ljava/lang/String;

.field public mode:I

.field public payInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/lib/NameValuePair;",
            ">;"
        }
    .end annotation
.end field

.field public trustStr:Ljava/lang/String;

.field public txnId:Ljava/lang/String;

.field public xmlPayLoadString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCommonLibToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->commonLibToken:Ljava/lang/String;

    return-object v0
.end method

.method public getConfiguration()Lcom/olive/upi/transport/model/lib/Configuration;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->configuration:Lcom/olive/upi/transport/model/lib/Configuration;

    return-object v0
.end method

.method public getCredAllowedWrapper()Lcom/olive/upi/transport/model/CredAllowedWrapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->credAllowedWrapper:Lcom/olive/upi/transport/model/CredAllowedWrapper;

    return-object v0
.end method

.method public getDeviceDetails()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getMaskedAccNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->maskedAccNo:Ljava/lang/String;

    return-object v0
.end method

.method public getMobileNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->mobileNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->mode:I

    return v0
.end method

.method public getPayInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/lib/NameValuePair;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->payInfo:Ljava/util/List;

    return-object v0
.end method

.method public getTrustStr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->trustStr:Ljava/lang/String;

    return-object v0
.end method

.method public getTxnId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->txnId:Ljava/lang/String;

    return-object v0
.end method

.method public getXmlPayLoadString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/LibTransportData;->xmlPayLoadString:Ljava/lang/String;

    return-object v0
.end method

.method public setCommonLibToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->commonLibToken:Ljava/lang/String;

    return-void
.end method

.method public setConfiguration(Lcom/olive/upi/transport/model/lib/Configuration;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->configuration:Lcom/olive/upi/transport/model/lib/Configuration;

    return-void
.end method

.method public setCredAllowed(Lcom/olive/upi/transport/model/CredAllowedWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->credAllowedWrapper:Lcom/olive/upi/transport/model/CredAllowedWrapper;

    return-void
.end method

.method public setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->language:Ljava/lang/String;

    return-void
.end method

.method public setMaskedAccNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->maskedAccNo:Ljava/lang/String;

    return-void
.end method

.method public setMobileNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->mobileNumber:Ljava/lang/String;

    return-void
.end method

.method public setMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->mode:I

    return-void
.end method

.method public setPayInfo(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/lib/NameValuePair;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->payInfo:Ljava/util/List;

    return-void
.end method

.method public setTrustStr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->trustStr:Ljava/lang/String;

    return-void
.end method

.method public setTxnId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->txnId:Ljava/lang/String;

    return-void
.end method

.method public setXmlPayLoadString(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/LibTransportData;->xmlPayLoadString:Ljava/lang/String;

    return-void
.end method
