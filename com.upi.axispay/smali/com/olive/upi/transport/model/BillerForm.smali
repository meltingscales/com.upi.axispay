.class public Lcom/olive/upi/transport/model/BillerForm;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public biller:Lcom/olive/upi/transport/model/Billers;

.field public billerCategory:Ljava/lang/String;

.field public locCode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/olive/upi/transport/model/Billers;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerForm;->billerCategory:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/olive/upi/transport/model/BillerForm;->biller:Lcom/olive/upi/transport/model/Billers;

    .line 4
    iput-object p3, p0, Lcom/olive/upi/transport/model/BillerForm;->locCode:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBiller()Lcom/olive/upi/transport/model/Billers;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerForm;->biller:Lcom/olive/upi/transport/model/Billers;

    return-object v0
.end method

.method public getBillerCategory()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerForm;->billerCategory:Ljava/lang/String;

    return-object v0
.end method

.method public getLocCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/BillerForm;->locCode:Ljava/lang/String;

    return-object v0
.end method

.method public setBiller(Lcom/olive/upi/transport/model/Billers;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerForm;->biller:Lcom/olive/upi/transport/model/Billers;

    return-void
.end method

.method public setBillerCategory(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerForm;->billerCategory:Ljava/lang/String;

    return-void
.end method

.method public setLocCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/BillerForm;->locCode:Ljava/lang/String;

    return-void
.end method
