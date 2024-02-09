.class public Lcom/olive/upi/transport/model/BannerOffersVo;
.super Lcom/olive/upi/transport/model/Banner;
.source "AxisPay"


# instance fields
.field public customerName:Ljava/lang/String;

.field public customerType:Ljava/lang/String;

.field public customerid:Ljava/lang/String;

.field public offerAmount:I

.field public partnerName:Ljava/lang/String;

.field public product:Ljava/lang/String;

.field public productType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/olive/upi/transport/model/Banner;-><init>()V

    return-void
.end method


# virtual methods
.method public getClickUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Banner;->clickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->customerName:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->customerType:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Banner;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferAmount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->offerAmount:I

    return v0
.end method

.method public getOffertext()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Banner;->offertext:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->partnerName:Ljava/lang/String;

    return-object v0
.end method

.method public getProduct()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->product:Ljava/lang/String;

    return-object v0
.end method

.method public getProductType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->productType:Ljava/lang/String;

    return-object v0
.end method

.method public setClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Banner;->clickUrl:Ljava/lang/String;

    return-void
.end method

.method public setCustomerName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->customerName:Ljava/lang/String;

    return-void
.end method

.method public setCustomerType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->customerType:Ljava/lang/String;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Banner;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setOfferAmount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->offerAmount:I

    return-void
.end method

.method public setOffertext(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Banner;->offertext:Ljava/lang/String;

    return-void
.end method

.method public setPartnerName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->partnerName:Ljava/lang/String;

    return-void
.end method

.method public setProduct(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->product:Ljava/lang/String;

    return-void
.end method

.method public setProductType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BannerOffersVo;->productType:Ljava/lang/String;

    return-void
.end method
