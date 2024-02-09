.class public Lcom/olive/upi/transport/model/Banner;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public actiontype:Ljava/lang/String;

.field public clickUrl:Ljava/lang/String;

.field public defaultImg:I

.field public imageUrl:Ljava/lang/String;

.field public offertext:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/olive/upi/transport/model/Banner;->imageUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/olive/upi/transport/model/Banner;->clickUrl:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getActionType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Banner;->actiontype:Ljava/lang/String;

    return-object v0
.end method

.method public getClickUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Banner;->clickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDefaultImg()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/Banner;->defaultImg:I

    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Banner;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getOffertext()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Banner;->offertext:Ljava/lang/String;

    return-object v0
.end method

.method public setActionType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Banner;->actiontype:Ljava/lang/String;

    return-void
.end method

.method public setDefaultImg(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/Banner;->defaultImg:I

    return-void
.end method
