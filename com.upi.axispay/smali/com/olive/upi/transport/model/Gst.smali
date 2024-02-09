.class public Lcom/olive/upi/transport/model/Gst;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public consentName:Ljava/lang/String;

.field public consentType:Ljava/lang/String;

.field public gstIn:Ljava/lang/String;

.field public invoice:Lcom/olive/upi/transport/model/Invoice;

.field public isConsentEnabled:Ljava/lang/String;

.field public isGSTEnabled:Ljava/lang/String;

.field public mid:Ljava/lang/String;

.field public msid:Ljava/lang/String;

.field public mtid:Ljava/lang/String;

.field public pinCode:Ljava/lang/String;

.field public qr:Lcom/olive/upi/transport/model/QR;

.field public split:Lcom/olive/upi/transport/model/Split;

.field public tier:Ljava/lang/String;

.field public tipAmount:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xad8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/Gst;->tier:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getConsentName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->consentName:Ljava/lang/String;

    return-object v0
.end method

.method public getConsentType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->consentType:Ljava/lang/String;

    return-object v0
.end method

.method public getGstIn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->gstIn:Ljava/lang/String;

    return-object v0
.end method

.method public getInvoice()Lcom/olive/upi/transport/model/Invoice;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->invoice:Lcom/olive/upi/transport/model/Invoice;

    return-object v0
.end method

.method public getIsConsentEnabled()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->isConsentEnabled:Ljava/lang/String;

    return-object v0
.end method

.method public getIsGSTEnabled()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->isGSTEnabled:Ljava/lang/String;

    return-object v0
.end method

.method public getMid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->mid:Ljava/lang/String;

    return-object v0
.end method

.method public getMsid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->msid:Ljava/lang/String;

    return-object v0
.end method

.method public getMtid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->mtid:Ljava/lang/String;

    return-object v0
.end method

.method public getPinCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->pinCode:Ljava/lang/String;

    return-object v0
.end method

.method public getQr()Lcom/olive/upi/transport/model/QR;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->qr:Lcom/olive/upi/transport/model/QR;

    return-object v0
.end method

.method public getSplit()Lcom/olive/upi/transport/model/Split;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->split:Lcom/olive/upi/transport/model/Split;

    return-object v0
.end method

.method public getTier()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->tier:Ljava/lang/String;

    return-object v0
.end method

.method public getTipAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Gst;->tipAmount:Ljava/lang/String;

    return-object v0
.end method

.method public setConsentName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->consentName:Ljava/lang/String;

    return-void
.end method

.method public setConsentType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->consentType:Ljava/lang/String;

    return-void
.end method

.method public setGstIn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->gstIn:Ljava/lang/String;

    return-void
.end method

.method public setInvoice(Lcom/olive/upi/transport/model/Invoice;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->invoice:Lcom/olive/upi/transport/model/Invoice;

    return-void
.end method

.method public setIsConsentEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->isConsentEnabled:Ljava/lang/String;

    return-void
.end method

.method public setIsGSTEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->isGSTEnabled:Ljava/lang/String;

    return-void
.end method

.method public setMid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->mid:Ljava/lang/String;

    return-void
.end method

.method public setMsid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->msid:Ljava/lang/String;

    return-void
.end method

.method public setMtid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->mtid:Ljava/lang/String;

    return-void
.end method

.method public setPinCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->pinCode:Ljava/lang/String;

    return-void
.end method

.method public setQr(Lcom/olive/upi/transport/model/QR;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->qr:Lcom/olive/upi/transport/model/QR;

    return-void
.end method

.method public setSplit(Lcom/olive/upi/transport/model/Split;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->split:Lcom/olive/upi/transport/model/Split;

    return-void
.end method

.method public setTier(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->tier:Ljava/lang/String;

    return-void
.end method

.method public setTipAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Gst;->tipAmount:Ljava/lang/String;

    return-void
.end method
