.class public Lcom/olive/upi/transport/model/NotificationData;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field private actionableItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/NotificationAction;",
            ">;"
        }
    .end annotation
.end field

.field private bigImage:Ljava/lang/String;

.field private body:Ljava/lang/String;

.field private clickAction:Ljava/lang/String;

.field private isLoggedInRequired:Ljava/lang/Boolean;

.field private notificationData:Ljava/lang/Object;

.field public notificationType:Ljava/lang/String;

.field public notificationVisibe:Z

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->isLoggedInRequired:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public getActionableItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/NotificationAction;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->actionableItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getBigImage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->bigImage:Ljava/lang/String;

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getClickAction()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->clickAction:Ljava/lang/String;

    return-object v0
.end method

.method public getLoggedInRequired()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->isLoggedInRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getNotificationData()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->notificationData:Ljava/lang/Object;

    return-object v0
.end method

.method public getNotificationType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->notificationType:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/NotificationData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public isNotificationVisibe()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/model/NotificationData;->notificationVisibe:Z

    return v0
.end method

.method public setActionableItems(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/NotificationAction;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->actionableItems:Ljava/util/ArrayList;

    return-void
.end method

.method public setBigImage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->bigImage:Ljava/lang/String;

    return-void
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->body:Ljava/lang/String;

    return-void
.end method

.method public setClickAction(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->clickAction:Ljava/lang/String;

    return-void
.end method

.method public setLoggedInRequired(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->isLoggedInRequired:Ljava/lang/Boolean;

    return-void
.end method

.method public setNotificationData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->notificationData:Ljava/lang/Object;

    return-void
.end method

.method public setNotificationType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->notificationType:Ljava/lang/String;

    return-void
.end method

.method public setNotificationVisibe(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/olive/upi/transport/model/NotificationData;->notificationVisibe:Z

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/NotificationData;->title:Ljava/lang/String;

    return-void
.end method
