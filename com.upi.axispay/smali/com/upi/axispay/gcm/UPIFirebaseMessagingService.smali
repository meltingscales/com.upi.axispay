.class public Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "AxisPay"


# instance fields
.field public b:I

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const v0, 0x7f080285

    return v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 12

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x1517

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const v0, 0x1518

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-int v2, v2

    iput v2, p0, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->b:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 3
    :try_start_0
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 4
    const-class v5, Lcom/olive/upi/transport/model/GCMMessage;

    invoke-virtual {v4, p1, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/GCMMessage;

    .line 5
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/GCMMessage;->getTxnid()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->c:Ljava/lang/String;

    .line 6
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/GCMMessage;->getMessage()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/GCMMessage;->getTitle()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 8
    :try_start_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    invoke-virtual {v3, v4}, Lqa0;->a(Lcom/olive/upi/transport/model/GCMMessage;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v3, v2

    goto :goto_0

    :catch_0
    move v3, v2

    :catch_1
    move-object v5, p1

    .line 9
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-void

    .line 10
    :cond_0
    new-instance v4, Landroid/content/Intent;

    const-class v6, Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {v4, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v6, 0x10008000

    .line 11
    invoke-virtual {v4, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const v0, 0x1519

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 12
    invoke-virtual {v4, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    iget-object p1, p0, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->c:Ljava/lang/String;

    const v0, 0x151a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const v0, 0x151b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const/16 v6, 0x1f

    .line 14
    invoke-virtual {v4, p1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/high16 p1, 0x40000000    # 2.0f

    .line 15
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v6, :cond_1

    const/high16 p1, 0x4000000

    .line 16
    :cond_1
    iget v6, p0, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->b:I

    invoke-static {p0, v6, v4, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const v0, 0x151c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 17
    invoke-virtual {p0, v4}, Landroid/app/Service;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/NotificationManager;

    const/4 v6, 0x2

    .line 18
    invoke-static {v6}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v6

    const/16 v8, 0x1a

    const v0, 0x151d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-lt v7, v8, :cond_2

    .line 19
    new-instance v8, Landroid/app/NotificationChannel;

    const/4 v10, 0x3

    const v0, 0x151e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v8, v9, v11, v10}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const v10, 0x7f12008a

    .line 20
    invoke-virtual {p0, v10}, Landroid/app/Service;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v8, v2}, Landroid/app/NotificationChannel;->enableLights(Z)V

    const/high16 v10, -0x10000

    .line 22
    invoke-virtual {v8, v10}, Landroid/app/NotificationChannel;->setLightColor(I)V

    const/4 v10, 0x4

    new-array v10, v10, [J

    .line 23
    fill-array-data v10, :array_0

    invoke-virtual {v8, v10}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    .line 24
    invoke-virtual {v8, v2}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 25
    invoke-virtual {v4, v8}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 26
    :cond_2
    new-instance v8, Lm8$e;

    invoke-direct {v8, p0, v9}, Lm8$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->a()I

    move-result v9

    invoke-virtual {v8, v9}, Lm8$e;->q(I)Lm8$e;

    .line 28
    invoke-virtual {v8, v1}, Lm8$e;->k(Ljava/lang/CharSequence;)Lm8$e;

    .line 29
    invoke-virtual {v8, v5}, Lm8$e;->j(Ljava/lang/CharSequence;)Lm8$e;

    new-instance v1, Lm8$c;

    invoke-direct {v1}, Lm8$c;-><init>()V

    .line 30
    invoke-virtual {v1, v5}, Lm8$c;->h(Ljava/lang/CharSequence;)Lm8$c;

    .line 31
    invoke-virtual {v8, v1}, Lm8$e;->s(Lm8$f;)Lm8$e;

    .line 32
    invoke-virtual {v8, v2}, Lm8$e;->f(Z)Lm8$e;

    const v1, 0x7f060048

    .line 33
    invoke-static {p0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v8, v1}, Lm8$e;->h(I)Lm8$e;

    .line 34
    invoke-virtual {v8, v6}, Lm8$e;->r(Landroid/net/Uri;)Lm8$e;

    .line 35
    invoke-virtual {v8, p1}, Lm8$e;->i(Landroid/app/PendingIntent;)Lm8$e;

    const/16 p1, 0x15

    if-lt v7, p1, :cond_3

    const p1, 0x7f060044

    .line 36
    invoke-static {p0, p1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v8, p1}, Lm8$e;->h(I)Lm8$e;

    goto :goto_1

    :cond_3
    const p1, 0x7f06018b

    .line 37
    invoke-static {p0, p1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v8, p1}, Lm8$e;->h(I)Lm8$e;

    :goto_1
    if-eqz v4, :cond_4

    .line 38
    iget p1, p0, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->b:I

    invoke-virtual {v8}, Lm8$e;->b()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v4, p1, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :cond_4
    if-eqz v3, :cond_5

    .line 39
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x151f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    .line 40
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    add-int/2addr v1, v2

    invoke-virtual {p1, v3, v1}, Ln70;->v(Ljava/lang/String;I)V

    .line 41
    new-instance p1, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1520

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0, p1}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_2

    .line 43
    :cond_5
    new-instance p1, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1521

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0, p1}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    :goto_2
    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x3e8
        0x1f4
        0x3e8
    .end array-data
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x1522

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x1523

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1524

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x1525

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object p1

    const v0, 0x1526

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/upi/axispay/gcm/UPIFirebaseMessagingService;->c(Ljava/lang/String;)V

    return-void
.end method
