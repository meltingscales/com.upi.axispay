.class public Lcom/olive/upi/transport/model/MandateExecute;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public amount:Ljava/lang/String;

.field public amountrule:Ljava/lang/String;

.field public customerid:Ljava/lang/String;

.field public execute:Ljava/lang/String;

.field public initmode:Ljava/lang/String;

.field public remarks:Ljava/lang/String;

.field public seqNum:Ljava/lang/String;

.field public umn:Ljava/lang/String;

.field public validityend:Ljava/lang/String;

.field public validitystart:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x20

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->initmode:Ljava/lang/String;

    const v0, 0x21

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->seqNum:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getAmountrule()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->amountrule:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getExecute()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->execute:Ljava/lang/String;

    return-object v0
.end method

.method public getInitMode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->initmode:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getSeqNum()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->seqNum:Ljava/lang/String;

    return-object v0
.end method

.method public getUmn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->umn:Ljava/lang/String;

    return-object v0
.end method

.method public getValidityend()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->validityend:Ljava/lang/String;

    return-object v0
.end method

.method public getValiditystart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/MandateExecute;->validitystart:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->amount:Ljava/lang/String;

    return-void
.end method

.method public setAmountrule(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->amountrule:Ljava/lang/String;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setExecute(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->execute:Ljava/lang/String;

    return-void
.end method

.method public setInitMode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->initmode:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setSeqNum(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->seqNum:Ljava/lang/String;

    return-void
.end method

.method public setUmn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->umn:Ljava/lang/String;

    return-void
.end method

.method public setValidityend(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->validityend:Ljava/lang/String;

    return-void
.end method

.method public setValiditystart(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/MandateExecute;->validitystart:Ljava/lang/String;

    return-void
.end method
