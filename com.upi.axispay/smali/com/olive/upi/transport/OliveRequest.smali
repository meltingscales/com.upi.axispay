.class public Lcom/olive/upi/transport/OliveRequest;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public clInitData:Ljava/lang/Object;

.field public clMode:I

.field public clTransportData:Ljava/lang/Object;

.field public hashMapData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public initiator:I

.field public isBackgroundCall:Z

.field public requestCount:I

.field public requestData:Ljava/lang/Object;

.field public requestType:I

.field public tag:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->initiator:I

    .line 17
    iput p2, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->initiator:I

    .line 5
    iput p2, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    .line 6
    iput-object p3, p0, Lcom/olive/upi/transport/OliveRequest;->requestData:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IILjava/lang/Object;Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->initiator:I

    .line 9
    iput p2, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    .line 10
    iput-object p3, p0, Lcom/olive/upi/transport/OliveRequest;->requestData:Ljava/lang/Object;

    .line 11
    iput-boolean p4, p0, Lcom/olive/upi/transport/OliveRequest;->isBackgroundCall:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    .line 14
    iput-object p2, p0, Lcom/olive/upi/transport/OliveRequest;->requestData:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getClInitData()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveRequest;->clInitData:Ljava/lang/Object;

    return-object v0
.end method

.method public getClMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/OliveRequest;->clMode:I

    return v0
.end method

.method public getClTransportData()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveRequest;->clTransportData:Ljava/lang/Object;

    return-object v0
.end method

.method public getHashMapData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveRequest;->hashMapData:Ljava/util/Map;

    return-object v0
.end method

.method public getInitiator()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/OliveRequest;->initiator:I

    return v0
.end method

.method public getRequestCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/OliveRequest;->requestCount:I

    return v0
.end method

.method public getRequestData()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveRequest;->requestData:Ljava/lang/Object;

    return-object v0
.end method

.method public getRequestType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    return v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveRequest;->tag:Ljava/lang/Object;

    return-object v0
.end method

.method public incrementRequestCount()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/OliveRequest;->requestCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/olive/upi/transport/OliveRequest;->requestCount:I

    return-void
.end method

.method public isBackgroundCall()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/OliveRequest;->isBackgroundCall:Z

    return v0
.end method

.method public setBackgroundCall(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/olive/upi/transport/OliveRequest;->isBackgroundCall:Z

    return-void
.end method

.method public setClInitData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveRequest;->clInitData:Ljava/lang/Object;

    return-void
.end method

.method public setClMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->clMode:I

    return-void
.end method

.method public setClTransportData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveRequest;->clTransportData:Ljava/lang/Object;

    return-void
.end method

.method public setHashMapData(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveRequest;->hashMapData:Ljava/util/Map;

    return-void
.end method

.method public setInitiator(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->initiator:I

    return-void
.end method

.method public setRequestCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->requestCount:I

    return-void
.end method

.method public setRequestData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveRequest;->requestData:Ljava/lang/Object;

    return-void
.end method

.method public setRequestType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveRequest;->tag:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x2c43

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/olive/upi/transport/OliveRequest;->initiator:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x2c44

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/olive/upi/transport/OliveRequest;->requestType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x2c45

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/OliveRequest;->requestData:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x2c46

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/OliveRequest;->hashMapData:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x2c47

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/OliveRequest;->tag:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
