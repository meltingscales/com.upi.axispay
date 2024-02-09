.class public Lcom/olive/upi/transport/model/Inbox;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public createdDate:Ljava/lang/String;

.field public expiryDate:Ljava/lang/String;

.field public id:J

.field public isDelete:Ljava/lang/String;

.field public isRead:Ljava/lang/String;

.field public jdata:Ljava/lang/String;

.field public longdiscription:Ljava/lang/String;

.field public mobile:Ljava/lang/String;

.field public selectPosition:I

.field public shortdiscription:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x32f8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->isRead:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->isDelete:Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/olive/upi/transport/model/Inbox;->selectPosition:I

    return-void
.end method


# virtual methods
.method public getCreatedDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->createdDate:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiryDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->expiryDate:Ljava/lang/String;

    return-object v0
.end method

.method public getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/olive/upi/transport/model/Inbox;->id:J

    return-wide v0
.end method

.method public getIsDelete()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->isDelete:Ljava/lang/String;

    return-object v0
.end method

.method public getIsRead()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->isRead:Ljava/lang/String;

    return-object v0
.end method

.method public getJdata()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->jdata:Ljava/lang/String;

    return-object v0
.end method

.method public getLongdiscription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->longdiscription:Ljava/lang/String;

    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getSelectPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/Inbox;->selectPosition:I

    return v0
.end method

.method public getShortdiscription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->shortdiscription:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Inbox;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setCreatedDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->createdDate:Ljava/lang/String;

    return-void
.end method

.method public setExpiryDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->expiryDate:Ljava/lang/String;

    return-void
.end method

.method public setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/olive/upi/transport/model/Inbox;->id:J

    return-void
.end method

.method public setIsDelete(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->isDelete:Ljava/lang/String;

    return-void
.end method

.method public setIsRead(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->isRead:Ljava/lang/String;

    return-void
.end method

.method public setJdata(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->jdata:Ljava/lang/String;

    return-void
.end method

.method public setLongdiscription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->longdiscription:Ljava/lang/String;

    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->mobile:Ljava/lang/String;

    return-void
.end method

.method public setSelectPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/Inbox;->selectPosition:I

    return-void
.end method

.method public setShortdiscription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->shortdiscription:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Inbox;->title:Ljava/lang/String;

    return-void
.end method
