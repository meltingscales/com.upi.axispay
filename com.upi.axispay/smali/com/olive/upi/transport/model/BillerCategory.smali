.class public Lcom/olive/upi/transport/model/BillerCategory;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public CODE_VAL:Ljava/lang/String;

.field public DSCRPTN:Ljava/lang/String;

.field private fixedCategory:I

.field public icon:I

.field public iconUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/olive/upi/transport/model/BillerCategory;->icon:I

    return-void
.end method


# virtual methods
.method public getCODE_VAL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerCategory;->CODE_VAL:Ljava/lang/String;

    return-object v0
.end method

.method public getDSCRPTN()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerCategory;->DSCRPTN:Ljava/lang/String;

    return-object v0
.end method

.method public getFixedCategory()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/BillerCategory;->fixedCategory:I

    return v0
.end method

.method public getIconId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/BillerCategory;->icon:I

    return v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerCategory;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setCODE_VAL(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerCategory;->CODE_VAL:Ljava/lang/String;

    return-void
.end method

.method public setDSCRPTN(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerCategory;->DSCRPTN:Ljava/lang/String;

    return-void
.end method

.method public setFixedCategory(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/BillerCategory;->fixedCategory:I

    return-void
.end method

.method public setIconId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/BillerCategory;->icon:I

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerCategory;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0xabe

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/BillerCategory;->DSCRPTN:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0xabf

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/BillerCategory;->CODE_VAL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0xac0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/olive/upi/transport/model/BillerCategory;->fixedCategory:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
