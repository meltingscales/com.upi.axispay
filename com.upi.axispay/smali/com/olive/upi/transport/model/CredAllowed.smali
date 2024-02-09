.class public Lcom/olive/upi/transport/model/CredAllowed;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public dLength:I

.field public dType:Ljava/lang/String;

.field public subtype:Ljava/lang/String;

.field public type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSubtype()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CredAllowed;->subtype:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CredAllowed;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getdLength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/CredAllowed;->dLength:I

    return v0
.end method

.method public getdType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/CredAllowed;->dType:Ljava/lang/String;

    return-object v0
.end method

.method public setSubtype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CredAllowed;->subtype:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CredAllowed;->type:Ljava/lang/String;

    return-void
.end method

.method public setdLength(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/CredAllowed;->dLength:I

    return-void
.end method

.method public setdType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/CredAllowed;->dType:Ljava/lang/String;

    return-void
.end method
