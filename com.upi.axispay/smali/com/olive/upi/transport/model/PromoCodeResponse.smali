.class public Lcom/olive/upi/transport/model/PromoCodeResponse;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public active:Ljava/lang/String;

.field public expiryDate:Ljava/lang/String;

.field public promoCode:Ljava/lang/String;

.field public promoDescription:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActive()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->active:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiryDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->expiryDate:Ljava/lang/String;

    return-object v0
.end method

.method public getPromoCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->promoCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPromoDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->promoDescription:Ljava/lang/String;

    return-object v0
.end method

.method public setActive(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->active:Ljava/lang/String;

    return-void
.end method

.method public setExpiryDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->expiryDate:Ljava/lang/String;

    return-void
.end method

.method public setPromoCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->promoCode:Ljava/lang/String;

    return-void
.end method

.method public setPromoDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/PromoCodeResponse;->promoDescription:Ljava/lang/String;

    return-void
.end method
