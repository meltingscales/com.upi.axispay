.class public Lcom/olive/upi/transport/model/MasterUpdate;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public banner:I

.field public bill_pay_max:I

.field public dthOperator:I

.field public encryptionFlag:Ljava/lang/String;

.field public mobileOperator:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBanner()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/MasterUpdate;->banner:I

    return v0
.end method

.method public getBill_pay_max()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/MasterUpdate;->bill_pay_max:I

    return v0
.end method

.method public getDthOperator()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/MasterUpdate;->dthOperator:I

    return v0
.end method

.method public getEncryptionFlag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MasterUpdate;->encryptionFlag:Ljava/lang/String;

    return-object v0
.end method

.method public getMobileOperator()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/MasterUpdate;->mobileOperator:I

    return v0
.end method

.method public setBanner(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/MasterUpdate;->banner:I

    return-void
.end method

.method public setBill_pay_max(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/MasterUpdate;->bill_pay_max:I

    return-void
.end method

.method public setDthOperator(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/MasterUpdate;->dthOperator:I

    return-void
.end method

.method public setEncryptionFlag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MasterUpdate;->encryptionFlag:Ljava/lang/String;

    return-void
.end method

.method public setMobileOperator(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/MasterUpdate;->mobileOperator:I

    return-void
.end method
