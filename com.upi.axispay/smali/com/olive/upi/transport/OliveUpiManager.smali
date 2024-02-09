.class public Lcom/olive/upi/transport/OliveUpiManager;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;
.implements Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/olive/upi/transport/OliveUpiManager$InitLib;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static activity:Landroid/app/Activity;

.field private static manager:Lcom/olive/upi/transport/OliveUpiManager;


# instance fields
.field private DELIVERED:Ljava/lang/String;

.field private SENT:Ljava/lang/String;

.field private final STATE_SMS_DELEVERED:I

.field private final STATE_SMS_DELEVERED_FAILED:I

.field private final STATE_SMS_SENT:I

.field private final STATE_SMS_SENT_FAILED:I

.field private billPayRequest:Lcom/olive/upi/transport/model/BillPay;

.field public changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

.field private commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

.field private currentRetry:I

.field public custName:Ljava/lang/String;

.field private deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

.field private deviceId:Ljava/lang/String;

.field private key:Ljava/lang/String;

.field public lastTransactionId:Ljava/lang/String;

.field private listener:Lcom/olive/upi/transport/OliveUpiEventListener;

.field private password:Ljava/lang/String;

.field private payRequest:Lcom/olive/upi/transport/model/PayRequest;

.field private recurrenceAuthorization:Lcom/olive/upi/transport/model/RecurrenceAuthorization;

.field private regRequest:Lcom/olive/upi/transport/model/RegRequest;

.field public registration:Lcom/olive/upi/transport/model/Registration;

.field public request:Lcom/olive/upi/transport/OliveRequest;

.field private smsSentStatus:I

.field private timer:Landroid/os/CountDownTimer;

.field private timerStarted:Z

.field private updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/OliveUpiManager;

    const v1, 0x120

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->STATE_SMS_SENT:I

    const/4 v0, 0x2

    .line 3
    iput v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->STATE_SMS_SENT_FAILED:I

    const/4 v0, 0x3

    .line 4
    iput v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->STATE_SMS_DELEVERED:I

    const/4 v0, 0x4

    .line 5
    iput v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->STATE_SMS_DELEVERED_FAILED:I

    const v0, 0x2416

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    iput-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->SENT:Ljava/lang/String;

    const v0, 0x2417

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->DELIVERED:Ljava/lang/String;

    return-void
.end method

.method private generateToken(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {}, Lc70;->q()V

    .line 2
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->generateToken(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method private getInfo(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getInfo(Landroid/app/Activity;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/OliveUpiManager;->manager:Lcom/olive/upi/transport/OliveUpiManager;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/olive/upi/transport/OliveUpiManager;

    invoke-direct {v0}, Lcom/olive/upi/transport/OliveUpiManager;-><init>()V

    sput-object v0, Lcom/olive/upi/transport/OliveUpiManager;->manager:Lcom/olive/upi/transport/OliveUpiManager;

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/OliveUpiManager;->init(Landroid/app/Activity;)V

    .line 4
    sget-object p0, Lcom/olive/upi/transport/OliveUpiManager;->manager:Lcom/olive/upi/transport/OliveUpiManager;

    return-object p0
.end method

.method private getMobileNumber(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 2
    invoke-static {}, Lcom/olive/upi/transport/service/CryptLibOne;->createAesKey()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->key:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sput-object v1, Lcom/olive/upi/transport/TransportConstants;->regRandom:Ljava/lang/String;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->regRandom:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x2418

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x2419

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->key:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    new-instance v2, Lcom/olive/upi/transport/service/RegHelper;

    invoke-direct {v2}, Lcom/olive/upi/transport/service/RegHelper;-><init>()V

    .line 6
    :try_start_0
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/service/RegHelper;->encryptData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x241a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    :goto_0
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 8
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v1

    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->getMobileNumber(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static init(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    return-void
.end method

.method private initCommonLib(ILcom/olive/upi/transport/OliveRequest;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x241b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x241c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->j(Ljava/lang/String;)I

    move-result v2

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x241d

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v4, 0x241e

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const v3, 0x241f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-nez v1, :cond_3

    sget v1, Lcom/olive/upi/transport/TransportConstants;->MAX_TOKEN_DAYS:I

    if-lt v2, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    if-nez v1, :cond_1

    .line 6
    new-instance v1, Lcom/olive/upi/transport/service/CommonLibService;

    sget-object v4, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-direct {v1, v4, p0}, Lcom/olive/upi/transport/service/CommonLibService;-><init>(Landroid/content/Context;Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;)V

    iput-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    .line 7
    new-instance v1, Lcom/olive/upi/transport/OliveUpiManager$InitLib;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, v2, v0}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;-><init>(Lcom/olive/upi/transport/OliveUpiManager;ILjava/lang/String;)V

    .line 8
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->setReqType(I)V

    .line 9
    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/OliveRequest;->setClInitData(Ljava/lang/Object;)V

    .line 10
    iget-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    const/16 v0, 0x8

    invoke-virtual {p1, v0, p2}, Lcom/olive/upi/transport/service/CommonLibService;->initService(ILcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    if-nez v0, :cond_2

    .line 12
    new-instance v0, Lcom/olive/upi/transport/service/CommonLibService;

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1, p0}, Lcom/olive/upi/transport/service/CommonLibService;-><init>(Landroid/content/Context;Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;)V

    iput-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLibAction(ILcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 14
    :cond_3
    :goto_0
    new-instance v1, Lcom/olive/upi/transport/service/CommonLibService;

    sget-object v4, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-direct {v1, v4, p0}, Lcom/olive/upi/transport/service/CommonLibService;-><init>(Landroid/content/Context;Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;)V

    iput-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    .line 15
    new-instance v1, Lcom/olive/upi/transport/OliveUpiManager$InitLib;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, v2, v0}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;-><init>(Lcom/olive/upi/transport/OliveUpiManager;ILjava/lang/String;)V

    .line 16
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->setReqType(I)V

    .line 17
    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/OliveRequest;->setClInitData(Ljava/lang/Object;)V

    .line 18
    iget-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Lcom/olive/upi/transport/service/CommonLibService;->initService(ILcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method private initCommonLibAction(ILcom/olive/upi/transport/OliveRequest;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x2420

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x2421

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const v0, 0x2422

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 2
    :pswitch_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/MandateUpdateData;

    .line 3
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/service/CommonLibService;->mandateUpdate(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 5
    :pswitch_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/PayTransportData;

    .line 6
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/service/CommonLibService;->initiatePay(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 8
    :pswitch_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/AccountTransportData;

    .line 9
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->commonLibManager:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-virtual {v0, p1, p2}, Lcom/olive/upi/transport/service/CommonLibService;->manageAccount(ILcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private isValidVpa(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x2423

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private skipBindCall(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 2
    invoke-static {}, Lcom/olive/upi/transport/service/CryptLibOne;->createAesKey()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->key:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sput-object v1, Lcom/olive/upi/transport/TransportConstants;->regRandom:Ljava/lang/String;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->regRandom:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x2424

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x2425

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->key:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x2426

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 6
    new-instance v2, Lcom/olive/upi/transport/service/RegHelper;

    invoke-direct {v2}, Lcom/olive/upi/transport/service/RegHelper;-><init>()V

    .line 7
    :try_start_0
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/service/RegHelper;->encryptData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x2427

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    :goto_0
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 9
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v1

    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->skipBindCall(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method private updateInbox(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->updateInbox(Landroid/app/Activity;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method


# virtual methods
.method public FetchAccountonIIN(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/AcRequest;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/AcRequest;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/AcRequest;->setBankId(Ljava/lang/String;)V

    return-void
.end method

.method public VerifyMerchant(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/VerifyVPA;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/VerifyVPA;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/VerifyVPA;->setVpa(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 4
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getVerifiedMerchant(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public acceptMandate(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2428

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x2429

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->declineApproveMandate(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public accountMobReg(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->accountMobReg(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public activateAccount(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/olive/upi/transport/model/ActivateAccount;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/ActivateAccount;

    .line 3
    new-instance v1, Lcom/olive/upi/transport/model/AccountOTPRequest;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/AccountOTPRequest;-><init>()V

    .line 4
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x242a

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setCustomerId(Ljava/lang/String;)V

    .line 5
    new-instance v2, Lcom/olive/upi/transport/model/RegRequest;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/RegRequest;-><init>()V

    iput-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    .line 6
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/RegRequest;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 7
    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getExp()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/RegRequest;->setExpiry(Ljava/lang/String;)V

    .line 8
    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getCardNo()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/RegRequest;->setCard(Ljava/lang/String;)V

    .line 9
    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getBankId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/RegRequest;->setBank(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 11
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getBankId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setBankId(Ljava/lang/String;)V

    .line 12
    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v2}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v2

    iput-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 13
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 14
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setTxnId(Ljava/lang/String;)V

    .line 15
    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 16
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getCardNo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setCard(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ActivateAccount;->getExp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setExpiry(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 19
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->sendAccountOTPRequest(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public balanceEnqForCreditLine(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->balanceEnqForCreditLine(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public beneVpaBlock(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x242b

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->beneBlock(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public billPayment(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->billPay(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public calculateCharges(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->calculateCharges(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public changeMPin(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getChangeMpin(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public checkBalance(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 7

    .line 1
    :try_start_0
    new-instance v1, Lcom/olive/upi/transport/model/AccountTransportData;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/AccountTransportData;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/olive/upi/transport/model/Account;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    .line 4
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/AccountTransportData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 5
    sget-object v3, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v3}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 6
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 8
    sget-object v4, Ln70;->f:Ln70$a;

    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v5

    const v0, 0x242c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x242d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setXmlPayLoadString(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x242e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x242f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/LibTransportData;->setMaskedAccNo(Ljava/lang/String;)V

    .line 13
    :cond_0
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 14
    invoke-direct {p0, v1, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLib(ILcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 15
    new-instance v2, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v2}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 16
    invoke-virtual {v1}, Lcom/olive/upi/transport/OliveUpiException;->getErrorCode()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 17
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 18
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, v2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :goto_0
    return-void
.end method

.method public checkStatus(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/CheckStatus;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/CheckStatus;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/TransactionData;

    .line 3
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2430

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/CheckStatus;->setMobilenumber(Ljava/lang/String;)V

    const v3, 0x2431

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/CheckStatus;->setInitiatedby(Ljava/lang/String;)V

    const v3, 0x2432

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/CheckStatus;->setSubtype(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getOrderId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/CheckStatus;->setOrderid(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/CheckStatus;->setTranid(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/CheckStatus;->setRrn(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 10
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v3, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x2433

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v2, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getCheckStatus(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public collect(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/olive/upi/transport/model/CollectRequest;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/CollectRequest;

    .line 3
    new-instance v1, Lcom/olive/upi/transport/model/Collect;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/Collect;-><init>()V

    .line 4
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/CollectRequest;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/Collect;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 5
    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v2}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v2

    .line 6
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/CollectRequest;->getAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc70;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/Collect;->setAmount(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/Collect;->setCustomerId(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/CollectRequest;->getRemarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    const v4, 0x2434

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const v3, 0x2435

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/Collect;->setRemarks(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/CollectRequest;->getRemarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/Collect;->setRemarks(Ljava/lang/String;)V

    .line 11
    :goto_0
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 12
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/Collect;->setTxnId(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/CollectRequest;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/Collect;->setPayerVpa(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/Collect;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 15
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/CollectRequest;->getDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/Collect;->setExpiry(Ljava/lang/String;)V

    const v0, 0x2436

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/Collect;->setInitmode(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/Collect;->setPurpose(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/Collect;->setRefCategory(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 20
    :cond_1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->collect(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public collectBlockedVpaList(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBlockBeneVpa(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public collectPay(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/olive/upi/transport/model/PayRequest;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/PayRequest;

    .line 3
    new-instance v1, Lcom/olive/upi/transport/model/CollectPayRequest;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/CollectPayRequest;-><init>()V

    .line 4
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/CollectPayRequest;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 5
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/CollectPayRequest;->setTxnId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/CollectPayRequest;->setCred(Lcom/olive/upi/transport/model/Cred;)V

    .line 7
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/CollectPayRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 8
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 9
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->collectNotification(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public deleteAccount(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/olive/upi/transport/model/Account;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/AcctUpdateReq;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/AcctUpdateReq;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AcctUpdateReq;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 4
    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AcctUpdateReq;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 6
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 7
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->accountRemove(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public deleteCustomerVpa(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V
    .locals 9

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x2437

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v2

    sget-object v3, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getIfsc()Ljava/lang/String;

    move-result-object v8

    move-object v7, p2

    invoke-virtual/range {v2 .. v8}, Lcom/olive/upi/transport/TransportManager;->deleteCustomerVpa(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public deleteVpa(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->vpaRemove(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public encPass(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v1, Lcom/olive/upi/transport/service/RegHelper;

    invoke-direct {v1}, Lcom/olive/upi/transport/service/RegHelper;-><init>()V

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/olive/upi/transport/TransportConstants;->regToken:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x2438

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    :try_start_0
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/service/RegHelper;->encryptData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public executeMandate(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 7

    .line 1
    :try_start_0
    new-instance v1, Lcom/olive/upi/transport/model/AccountTransportData;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/AccountTransportData;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/olive/upi/transport/model/ExecuteData;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/ExecuteData;

    .line 4
    iget-object v3, v2, Lcom/olive/upi/transport/model/ExecuteData;->account:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/AccountTransportData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 5
    sget-object v3, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v3}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 6
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/ExecuteData;->getTxnid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 7
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x2439

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/ExecuteData;->getTxnid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x243a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/LibTransportData;->setXmlPayLoadString(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x243b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x243c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    .line 11
    new-instance v3, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-direct {v3}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;-><init>()V

    iput-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->recurrenceAuthorization:Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    .line 12
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/ExecuteData;->getTxnid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setTxnid(Ljava/lang/String;)V

    .line 13
    iget-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->recurrenceAuthorization:Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/ExecuteData;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setAction(Ljava/lang/String;)V

    .line 14
    iget-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->recurrenceAuthorization:Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/ExecuteData;->getPayervpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayervpa(Ljava/lang/String;)V

    .line 15
    iget-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->recurrenceAuthorization:Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/ExecuteData;->getPayeevpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setPayeevpa(Ljava/lang/String;)V

    .line 16
    iget-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->recurrenceAuthorization:Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/ExecuteData;->getUmnid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setUmn(Ljava/lang/String;)V

    .line 17
    :cond_0
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    const/16 v1, 0xe

    .line 18
    invoke-direct {p0, v1, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLib(ILcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 19
    new-instance v2, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v2}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 20
    invoke-virtual {v1}, Lcom/olive/upi/transport/OliveUpiException;->getErrorCode()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 21
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 22
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, v2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :goto_0
    return-void
.end method

.method public fetchMobileNumber(Lcom/olive/upi/transport/model/Registration;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->registration:Lcom/olive/upi/transport/model/Registration;

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Registration;->getDeviceInfo()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/DeviceDetails;->getId()Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x243d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Registration;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->custName:Ljava/lang/String;

    return-void
.end method

.method public fetchMyAccounts(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/olive/upi/transport/model/CustomerAcRequest;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/CustomerAcRequest;-><init>()V

    .line 3
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x243e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/CustomerAcRequest;->setCustomerId(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/CustomerAcRequest;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 5
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 6
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->fetchAllAccounts(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public fetchPayloadKey(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x243f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->listKeys(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getAccountsFromBank(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    iput-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/AcRequest;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/AcRequest;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AcRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 4
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AcRequest;->setCustomerId(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AcRequest;->setTxnId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AcRequest;->setBankId(Ljava/lang/String;)V

    .line 8
    :cond_0
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 9
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x2440

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->fetchAccounts(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getAllTransactionHistory(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/olive/upi/transport/TransportManager;->getTransactionHistory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public getBalance(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBalance(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getBanner(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    const v0, 0x2441

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 2
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBanner(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getBillPayMaxAmounts(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBillPayMaxAmounts(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getBillerCategories(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBillerCategories(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getBillerForm(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBillerRegForm(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getBillerLocations(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBillerLocation(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getBillerNames(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBillers(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getClToken(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getClToken(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getDecryptedData(Ljava/lang/String;)[B
    .locals 2

    .line 1
    new-instance v0, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v0}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/service/CryptLibOne;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object p1

    .line 3
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/service/CryptLibOne;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    .line 4
    :try_start_0
    invoke-virtual {v0, p1, v1}, Lcom/olive/upi/transport/service/CryptLibOne;->decrypt([B[B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getDthOperator(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getDthOperator(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getInboxDate(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getInboxContent(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getLastTransactionId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    return-object v0
.end method

.method public getLongcode(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->serverHealth(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getMobileCircles(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getMobileCircle(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getMobileOperator(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getMobileOperator(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getMobileOperators(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getOperator(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getMyVpaAccounts()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/TransportManager;->getMyVpaAccounts(Landroid/content/Context;)V

    return-void
.end method

.method public getPendingRequest(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x2442

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->getPendingTransactions(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getPersonalLoan(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getPersonalLoan(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getPlainAccountNumber(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getPlainAccountNumber(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getPromotionalOffers(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x2443

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 2
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getPromotionalOffers(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getQueryList(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x2444

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v1

    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2, v0, p1}, Lcom/olive/upi/transport/TransportManager;->getRaisedQueries(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getRecentBBPSHistory(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getBBPSHistory(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getRechargeHistory(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getRechargeHistory(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getRechargePlan(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getRechargePlans(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/TransportManager;->getToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUPIBankList(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->listBanks(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getVerifyVpa2(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->verifyVpa2(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getVpaList(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x2445

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->listVpa(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public getWebUrls(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->getWebUrls(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public initiateChangeMpin(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 9

    const v0, 0x2446

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    .line 2
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object v3

    .line 3
    :try_start_0
    new-instance v4, Lcom/olive/upi/transport/model/AccountTransportData;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/AccountTransportData;-><init>()V

    .line 4
    sget-object v5, Ln70;->f:Ln70$a;

    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v6

    const v0, 0x2447

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/LibTransportData;->setXmlPayLoadString(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v6

    invoke-virtual {v6, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/LibTransportData;->setMobileNumber(Ljava/lang/String;)V

    .line 6
    new-instance v6, Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-direct {v6}, Lcom/olive/upi/transport/model/DeviceDetails;-><init>()V

    iput-object v6, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 7
    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v7

    const v0, 0x2448

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/DeviceDetails;->setApp(Ljava/lang/String;)V

    .line 8
    iget-object v6, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v7

    invoke-virtual {v7, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/DeviceDetails;->setMobile(Ljava/lang/String;)V

    .line 9
    iget-object v6, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v7

    const v0, 0x2449

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/DeviceDetails;->setId(Ljava/lang/String;)V

    .line 10
    iget-object v6, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/LibTransportData;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 11
    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v6

    const v0, 0x244a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v4, v2}, Lcom/olive/upi/transport/model/AccountTransportData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 13
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v6

    const v0, 0x244b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v6

    const v0, 0x244c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    .line 16
    new-instance v6, Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-direct {v6}, Lcom/olive/upi/transport/model/ChangeCredReq;-><init>()V

    iput-object v6, p0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    .line 17
    invoke-virtual {v6, v2}, Lcom/olive/upi/transport/model/ChangeCredReq;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 18
    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-virtual {v5}, Ln70$a;->a()Ln70;

    move-result-object v5

    invoke-virtual {v5, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/ChangeCredReq;->setCustomerid(Ljava/lang/String;)V

    .line 19
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/ChangeCredReq;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 20
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/ChangeCredReq;->setTxnid(Ljava/lang/String;)V

    .line 21
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/ChangeCredReq;->setBank(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    const/4 v1, 0x3

    .line 23
    invoke-direct {p0, v1, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLib(ILcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 24
    new-instance v2, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v2}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 25
    invoke-virtual {v1}, Lcom/olive/upi/transport/OliveUpiException;->getErrorCode()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 26
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 27
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, v2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :goto_0
    return-void
.end method

.method public initiatePay(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/TransactionData;

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getClMode()I

    move-result v3

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    .line 4
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v5

    .line 5
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTipAmount()Ljava/lang/Double;

    move-result-object v6

    .line 6
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object v7

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    cmpl-double v7, v10, v8

    if-eqz v7, :cond_0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedAmount()Ljava/lang/Double;

    move-result-object v7

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v7

    :goto_0
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    .line 7
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getEditedRemarks()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v7

    .line 8
    :goto_1
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v12

    .line 9
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefUrl()Ljava/lang/String;

    move-result-object v13

    .line 10
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    .line 11
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getOrderId()Ljava/lang/String;

    move-result-object v14

    .line 12
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBillpayKey()Ljava/lang/String;

    move-result-object v15

    .line 13
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBillpayInfoString()Ljava/lang/String;

    move-result-object v8

    .line 14
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMode()Ljava/lang/String;

    move-result-object v9

    const v23, 0x244d

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v18

    if-eqz v9, :cond_2

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMode()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMode()Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    :cond_2
    move-object/from16 v9, v18

    .line 15
    :goto_2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getPurpose()Ljava/lang/String;

    move-result-object v19

    if-eqz v19, :cond_3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getPurpose()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19

    if-nez v19, :cond_3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getPurpose()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v2, v19

    goto :goto_3

    :cond_3
    move-object/from16 v2, v18

    .line 16
    :goto_3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefCategory()Ljava/lang/String;

    move-result-object v19

    if-eqz v19, :cond_4

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefCategory()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19

    if-nez v19, :cond_4

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRefCategory()Ljava/lang/String;

    move-result-object v18

    :cond_4
    move-object/from16 v20, v18

    if-nez v4, :cond_5

    return-void

    :cond_5
    if-nez v5, :cond_6

    return-void

    :cond_6
    const-wide/16 v16, 0x0

    cmpl-double v16, v10, v16

    if-nez v16, :cond_7

    return-void

    :cond_7
    if-nez v7, :cond_8

    return-void

    :cond_8
    move-object/from16 v16, v2

    .line 17
    new-instance v2, Lcom/olive/upi/transport/model/PayTransportData;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/PayTransportData;-><init>()V

    .line 18
    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setMode(I)V

    .line 19
    sget-object v17, Ln70;->f:Ln70$a;

    move-object/from16 v18, v9

    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v9

    move-object/from16 v19, v7

    const v23, 0x244e

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v7}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 20
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v7

    const v23, 0x244f

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/olive/upi/transport/model/LibTransportData;->setXmlPayLoadString(Ljava/lang/String;)V

    .line 21
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v7

    const v23, 0x2450

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/olive/upi/transport/model/LibTransportData;->setMobileNumber(Ljava/lang/String;)V

    .line 22
    sget-object v7, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v7}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v7

    .line 23
    invoke-virtual {v2, v7}, Lcom/olive/upi/transport/model/LibTransportData;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 24
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v9

    move-object/from16 v21, v14

    const v23, 0x2451

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    const/4 v9, 0x7

    move-object/from16 v22, v14

    const v23, 0x2452

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    if-eq v3, v9, :cond_f

    const/16 v9, 0xa

    if-ne v3, v9, :cond_9

    goto :goto_7

    :cond_9
    const/4 v8, 0x5

    if-eq v3, v8, :cond_d

    const/16 v8, 0x9

    if-eq v3, v8, :cond_d

    const/16 v8, 0xc

    if-eq v3, v8, :cond_d

    const/16 v8, 0xe

    if-ne v3, v8, :cond_a

    goto :goto_5

    :cond_a
    const/4 v8, 0x6

    if-ne v3, v8, :cond_b

    .line 25
    iput-object v12, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 26
    invoke-virtual {v2, v12}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 27
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v8

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v14, v9}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_b
    const/16 v8, 0xb

    if-ne v3, v8, :cond_10

    .line 28
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_c

    .line 29
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    goto :goto_4

    .line 30
    :cond_c
    iput-object v12, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 31
    :goto_4
    iput-object v12, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 32
    invoke-virtual {v2, v12}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 33
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v8

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v14, v9}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    .line 34
    :cond_d
    :goto_5
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_e

    .line 35
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    goto :goto_6

    .line 36
    :cond_e
    iput-object v12, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 37
    :goto_6
    iget-object v8, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 38
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v8

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v14, v9}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    .line 39
    :cond_f
    :goto_7
    new-instance v9, Lcom/olive/upi/transport/model/BillPay;

    invoke-direct {v9}, Lcom/olive/upi/transport/model/BillPay;-><init>()V

    iput-object v9, v1, Lcom/olive/upi/transport/OliveUpiManager;->billPayRequest:Lcom/olive/upi/transport/model/BillPay;

    .line 40
    invoke-virtual {v9, v8}, Lcom/olive/upi/transport/model/BillPay;->setBillinfo(Ljava/lang/String;)V

    .line 41
    iget-object v8, v1, Lcom/olive/upi/transport/OliveUpiManager;->billPayRequest:Lcom/olive/upi/transport/model/BillPay;

    invoke-virtual {v8, v15}, Lcom/olive/upi/transport/model/BillPay;->setBillid(Ljava/lang/String;)V

    .line 42
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 43
    invoke-virtual {v2, v8}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 44
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v8

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v14, v9}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    :goto_8
    const/16 v8, 0xe

    if-ne v3, v8, :cond_11

    .line 45
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const v23, 0x2453

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getUmn()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getUmn()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/olive/upi/transport/model/PayTransportData;->setUmnId(Ljava/lang/String;)V

    .line 47
    :cond_11
    new-instance v8, Lcom/olive/upi/transport/model/PayRequest;

    invoke-direct {v8}, Lcom/olive/upi/transport/model/PayRequest;-><init>()V

    iput-object v8, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    .line 48
    invoke-virtual {v8, v7}, Lcom/olive/upi/transport/model/PayRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 49
    iget-object v7, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v7, v4}, Lcom/olive/upi/transport/model/PayRequest;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 50
    new-instance v4, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 51
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/olive/upi/transport/model/Payee;->setBeneName(Ljava/lang/String;)V

    const v23, 0x2454

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v6, :cond_12

    .line 53
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    add-double/2addr v10, v8

    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc70;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 55
    iget-object v6, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc70;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/PayRequest;->setAmount(Ljava/lang/String;)V

    goto :goto_9

    .line 56
    :cond_12
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc70;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 57
    iget-object v6, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc70;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/PayRequest;->setAmount(Ljava/lang/String;)V

    .line 58
    :goto_9
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 59
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/PayRequest;->setPayees(Ljava/util/List;)V

    .line 61
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v4, v13}, Lcom/olive/upi/transport/model/PayRequest;->setRefUrl(Ljava/lang/String;)V

    .line 62
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    move-object/from16 v6, v21

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/PayRequest;->setOrderId(Ljava/lang/String;)V

    .line 63
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-static/range {v19 .. v19}, Lc70;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/PayRequest;->setRemarks(Ljava/lang/String;)V

    .line 64
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/PayRequest;->setTxnId(Ljava/lang/String;)V

    .line 65
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    move-object/from16 v9, v18

    invoke-virtual {v4, v9}, Lcom/olive/upi/transport/model/PayRequest;->setInitmode(Ljava/lang/String;)V

    .line 66
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMcc()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/PayRequest;->setMcc(Ljava/lang/String;)V

    .line 67
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    move-object/from16 v6, v16

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/PayRequest;->setPurpose(Ljava/lang/String;)V

    .line 68
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    move-object/from16 v6, v20

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/PayRequest;->setRefCategory(Ljava/lang/String;)V

    .line 69
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getIsConsentEnabled()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setIsConsentEnabled(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_13

    .line 71
    new-instance v4, Lcom/olive/upi/transport/model/Invoice;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/Invoice;-><init>()V

    .line 72
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceNo()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Invoice;->setNum(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Invoice;->setName(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceDate()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Invoice;->setDate(Ljava/lang/String;)V

    .line 75
    iget-object v6, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/Gst;->setInvoice(Lcom/olive/upi/transport/model/Invoice;)V

    .line 76
    new-instance v4, Lcom/olive/upi/transport/model/QR;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/QR;-><init>()V

    .line 77
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQRts()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/QR;->setTs(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/QR;->setqVer(Ljava/lang/String;)V

    .line 79
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/QR;->setQrMedium(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQRexpire()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/QR;->setExpireTs(Ljava/lang/String;)V

    .line 81
    iget-object v6, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/Gst;->setQr(Lcom/olive/upi/transport/model/QR;)V

    .line 82
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getIsGSTEnabled()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setIsGSTEnabled(Ljava/lang/String;)V

    .line 83
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getGstIn()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setGstIn(Ljava/lang/String;)V

    .line 84
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTipAmount()Ljava/lang/Double;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setTipAmount(Ljava/lang/String;)V

    .line 85
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getConsentName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setConsentName(Ljava/lang/String;)V

    .line 86
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getConsentType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setConsentType(Ljava/lang/String;)V

    .line 87
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getIsConsentEnabled()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setIsConsentEnabled(Ljava/lang/String;)V

    .line 88
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setMid(Ljava/lang/String;)V

    .line 89
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMsid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setMsid(Ljava/lang/String;)V

    .line 90
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getPinCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setPinCode(Ljava/lang/String;)V

    .line 91
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getMtid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setMid(Ljava/lang/String;)V

    .line 92
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    const v23, 0x2455

    invoke-static/range {v23 .. v23}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Gst;->setTier(Ljava/lang/String;)V

    .line 93
    new-instance v4, Lcom/olive/upi/transport/model/Split;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/Split;-><init>()V

    .line 94
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getCESS()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Split;->setAmountSplitCESS(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getCGST()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Split;->setAmountSplitCGST(Ljava/lang/String;)V

    .line 96
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getGST()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Split;->setAmountSplitGST(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getIGST()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Split;->setAmountSplitIGST(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getSGST()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/olive/upi/transport/model/Split;->setAmountSplitSGST(Ljava/lang/String;)V

    .line 99
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setSplit(Lcom/olive/upi/transport/model/Split;)V

    goto :goto_a

    .line 100
    :cond_13
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getIsConsentEnabled()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/olive/upi/transport/model/Gst;->setIsConsentEnabled(Ljava/lang/String;)V

    .line 101
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setConsentType(Ljava/lang/String;)V

    .line 102
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setConsentName(Ljava/lang/String;)V

    .line 103
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setTipAmount(Ljava/lang/String;)V

    .line 104
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setGstIn(Ljava/lang/String;)V

    .line 105
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setSplit(Lcom/olive/upi/transport/model/Split;)V

    .line 106
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setInvoice(Lcom/olive/upi/transport/model/Invoice;)V

    .line 107
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setQr(Lcom/olive/upi/transport/model/QR;)V

    .line 108
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setIsGSTEnabled(Ljava/lang/String;)V

    .line 109
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setMid(Ljava/lang/String;)V

    .line 110
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setMsid(Ljava/lang/String;)V

    .line 111
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setPinCode(Ljava/lang/String;)V

    .line 112
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setMtid(Ljava/lang/String;)V

    .line 113
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Gst;->setTier(Ljava/lang/String;)V

    .line 114
    :goto_a
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/PayTransportData;->setPayrequest(Lcom/olive/upi/transport/model/PayRequest;)V

    .line 115
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/PayTransportData;->setPayeeName(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v2, v13}, Lcom/olive/upi/transport/model/PayTransportData;->setRefUrl(Ljava/lang/String;)V

    .line 117
    invoke-virtual/range {v17 .. v17}, Ln70$a;->a()Ln70;

    move-result-object v0

    move-object/from16 v4, v22

    invoke-virtual {v0, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    move-object/from16 v4, p1

    .line 118
    invoke-virtual {v4, v2}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    .line 119
    :try_start_0
    invoke-direct {v1, v3, v4}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLib(ILcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 120
    new-instance v0, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v0}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 121
    invoke-virtual {v2}, Lcom/olive/upi/transport/OliveUpiException;->getErrorCode()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 122
    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 123
    iget-object v2, v1, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v2, v4, v0}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :goto_b
    return-void
.end method

.method public isConnectionAvailable(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const v1, 0x2456

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 2
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public isPaymentServiceInitialised()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/TransportManager;->isPaymentServiceInitialised()Z

    move-result v0

    return v0
.end method

.method public login(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Authenticate;

    .line 2
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Authenticate;->getPin()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 4
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x2457

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    sget-object p1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    const/4 v1, 0x0

    const v0, 0x2458

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 7
    :cond_0
    sget-object v5, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v5}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v5

    iput-object v5, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 8
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/TransportManager;->setToken(Ljava/lang/String;)V

    .line 9
    new-instance v5, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v5}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 10
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Authenticate;->getType()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_1

    const v0, 0x2459

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 11
    :cond_1
    sget-object v7, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v7, v2}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v0, 0x245a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 12
    :goto_0
    invoke-static {}, Lcom/olive/upi/transport/service/CryptLibOne;->createAesKey()Ljava/lang/String;

    move-result-object v8

    sput-object v8, Lcom/olive/upi/transport/TransportConstants;->sk:Ljava/lang/String;

    .line 13
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x245b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->sk:Ljava/lang/String;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 14
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v10

    const v0, 0x245c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v10

    const v0, 0x245d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v10

    const v0, 0x245e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x245f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v10

    const v0, 0x2460

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x2461

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Authenticate;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 21
    new-instance v7, Lcom/olive/upi/transport/service/RegHelper;

    invoke-direct {v7}, Lcom/olive/upi/transport/service/RegHelper;-><init>()V

    .line 22
    :try_start_0
    invoke-virtual {v7, v2}, Lcom/olive/upi/transport/service/RegHelper;->encryptData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 23
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    sget-object v7, Lcom/olive/upi/transport/TransportConstants;->sk:Ljava/lang/String;

    invoke-virtual {v5, v7}, Lcom/olive/upi/transport/service/CryptLibOne;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v7

    invoke-virtual {v5, v3, v7}, Lcom/olive/upi/transport/service/CryptLibOne;->encrypt([B[B)[B

    move-result-object v3

    const/4 v5, 0x2

    .line 24
    invoke-static {v3, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    move-object v2, v6

    .line 25
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    .line 26
    :goto_2
    invoke-virtual {v1, v6}, Lcom/olive/upi/transport/model/Authenticate;->setDevice(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/Authenticate;->setPassword(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/Authenticate;->setUsername(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 30
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v1

    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->authenticate(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    :cond_2
    return-void
.end method

.method public mandateCreateRequest(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2462

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x2463

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->createMandateRequest(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public mandateExecute(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2464

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x2465

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->mandateExecute(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public mandateHistory(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2466

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x2467

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->mandatehistory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public mandateRequest(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2468

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x2469

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->mandateRequest(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public mandateUpdate(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const v19, 0x246a

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v19, 0x246b

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 2
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v5

    .line 3
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const v19, 0x246c

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v6

    .line 5
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    .line 6
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getPayerVpa()Ljava/lang/String;

    move-result-object v9

    .line 7
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeVpa()Ljava/lang/String;

    move-result-object v10

    .line 8
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object v11

    .line 9
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v12

    .line 10
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v13

    .line 11
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getUpdateType()Ljava/lang/String;

    move-result-object v14

    .line 12
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getRefUrl()Ljava/lang/String;

    move-result-object v15

    .line 13
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v4

    .line 14
    :try_start_0
    new-instance v2, Lcom/olive/upi/transport/model/MandateUpdateData;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/MandateUpdateData;-><init>()V

    .line 15
    invoke-virtual {v2, v5}, Lcom/olive/upi/transport/model/LibTransportData;->setMode(I)V

    .line 16
    sget-object v16, Ln70;->f:Ln70$a;

    move-object/from16 v17, v12

    invoke-virtual/range {v16 .. v16}, Ln70$a;->a()Ln70;

    move-result-object v12

    move-object/from16 v18, v14

    const v19, 0x246d

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 17
    invoke-virtual/range {v16 .. v16}, Ln70$a;->a()Ln70;

    move-result-object v12

    const v19, 0x246e

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Lcom/olive/upi/transport/model/LibTransportData;->setXmlPayLoadString(Ljava/lang/String;)V

    .line 18
    invoke-virtual/range {v16 .. v16}, Ln70$a;->a()Ln70;

    move-result-object v12

    invoke-virtual {v12, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Lcom/olive/upi/transport/model/LibTransportData;->setMobileNumber(Ljava/lang/String;)V

    .line 19
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc70;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/olive/upi/transport/model/MandateUpdateData;->setAmount(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v2, v9}, Lcom/olive/upi/transport/model/MandateUpdateData;->setPayerVpa(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/MandateUpdateData;->setPayeeVpa(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v2, v11}, Lcom/olive/upi/transport/model/MandateUpdateData;->setPayeeName(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/MandateUpdateData;->setRemark(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/MandateUpdateData;->setRefUrl(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v2, v6}, Lcom/olive/upi/transport/model/MandateUpdateData;->setSourceAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 26
    sget-object v4, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v4}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v4

    .line 27
    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/LibTransportData;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 28
    invoke-virtual/range {v16 .. v16}, Ln70$a;->a()Ln70;

    move-result-object v6

    invoke-virtual {v6, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    const/16 v6, 0xd

    if-ne v5, v6, :cond_0

    .line 29
    iput-object v13, v1, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 30
    invoke-virtual {v2, v13}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 31
    invoke-virtual/range {v16 .. v16}, Ln70$a;->a()Ln70;

    move-result-object v6

    const v19, 0x246f

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_0
    new-instance v6, Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-direct {v6}, Lcom/olive/upi/transport/model/UpdateMandate;-><init>()V

    iput-object v6, v1, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    .line 33
    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/UpdateMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 34
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    move-object/from16 v6, v18

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/UpdateMandate;->setNewstate(Ljava/lang/String;)V

    .line 35
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    move-object/from16 v6, v17

    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/UpdateMandate;->setUmn(Ljava/lang/String;)V

    .line 36
    iget-object v4, v1, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-virtual/range {v16 .. v16}, Ln70$a;->a()Ln70;

    move-result-object v6

    invoke-virtual {v6, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/UpdateMandate;->setCustomerid(Ljava/lang/String;)V

    .line 37
    iget-object v3, v1, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/UpdateMandate;->setTxnid(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/MandateUpdateData;->setRefUrl(Ljava/lang/String;)V

    .line 39
    invoke-virtual/range {v16 .. v16}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    .line 40
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/MandateUpdateData;->setUpdateMandate(Lcom/olive/upi/transport/model/UpdateMandate;)V
    :try_end_0
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v0, v2

    move-object/from16 v2, p1

    .line 41
    :try_start_1
    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    .line 42
    invoke-direct {v1, v5, v2}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLib(ILcom/olive/upi/transport/OliveRequest;)V
    :try_end_1
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object/from16 v2, p1

    .line 43
    :goto_0
    new-instance v3, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v3}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 44
    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiException;->getErrorCode()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 45
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 46
    iget-object v0, v1, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v0, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :goto_1
    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v0}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v1, 0x2470

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    iput-object v1, v0, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 3
    check-cast p2, Ljava/lang/String;

    .line 4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const v2, 0x2471

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2472

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_0

    .line 5
    sget-object p2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget v1, Lg70;->unable_to_process_your_request:I

    invoke-virtual {p2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 6
    iput-object v2, v0, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const v1, 0x2473

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const v1, 0x2474

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 9
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const v1, 0x2475

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {p2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 11
    sget-object p2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget v1, Lg70;->unable_to_process_your_request:I

    invoke-virtual {p2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v1, 0x2476

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 12
    iput-object v1, v0, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    goto :goto_1

    .line 13
    :cond_2
    invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 14
    sget-object p2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget v1, Lg70;->unable_to_process_your_request:I

    invoke-virtual {p2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 15
    iput-object v2, v0, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    goto :goto_1

    :cond_3
    :goto_0
    const p2, 0x2477

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 16
    iput-object p2, v0, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    move-object p2, v3

    .line 17
    :cond_4
    :goto_1
    iput-object p2, v0, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 18
    iget-object p2, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    if-eqz p2, :cond_5

    .line 19
    invoke-interface {p2, p1, v0}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :cond_5
    return-void
.end method

.method public onReceiveResult(IILjava/lang/Object;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 1
    const-class v5, Lcom/olive/upi/transport/model/Cred;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const v16, 0x2478

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v16, 0x2479

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v16, 0x247a

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v16, 0x247b

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const/4 v6, 0x2

    const/4 v7, 0x7

    if-ne v1, v6, :cond_0

    .line 2
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v16, 0x247c

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 4
    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v3, v7}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {v2, v3, v1}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    return-void

    :cond_0
    if-nez v3, :cond_1

    .line 5
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v16, 0x247d

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 7
    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    new-instance v4, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v4, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {v3, v4, v1}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    return-void

    :cond_1
    const v16, 0x247e

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v16, 0x247f

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v16, 0x2480

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-ne v2, v6, :cond_5

    .line 8
    move-object v2, v3

    check-cast v2, Landroid/os/Bundle;

    .line 9
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    .line 10
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 11
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 12
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v6, v4, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Cred;

    .line 13
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Cred;->getSubType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 14
    iget-object v6, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/RegRequest;->setMpincred(Lcom/olive/upi/transport/model/Cred;)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Cred;->getSubType()Ljava/lang/String;

    move-result-object v6

    const v16, 0x2481

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 16
    iget-object v6, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/RegRequest;->setAtmpincred(Lcom/olive/upi/transport/model/Cred;)V

    goto :goto_0

    :cond_3
    const v16, 0x2482

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Cred;->setSubType(Ljava/lang/String;)V

    .line 18
    iget-object v6, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/RegRequest;->setOtpcred(Lcom/olive/upi/transport/model/Cred;)V

    goto :goto_0

    .line 19
    :cond_4
    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/RegRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 20
    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v16, 0x2483

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/RegRequest;->setRegtype(Ljava/lang/String;)V

    .line 21
    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    iget-object v4, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/RegRequest;->setCustomerid(Ljava/lang/String;)V

    .line 22
    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/RegRequest;->setTxnId(Ljava/lang/String;)V

    .line 23
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 24
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x8

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto/16 :goto_8

    :cond_5
    const/4 v6, 0x3

    const v16, 0x2484

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    if-ne v2, v6, :cond_9

    .line 25
    move-object v2, v3

    check-cast v2, Landroid/os/Bundle;

    .line 26
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    .line 27
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 28
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :catch_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 29
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-direct {v7, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 30
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 31
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v7, v6, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/olive/upi/transport/model/Cred;

    .line 32
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 33
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/olive/upi/transport/model/Cred;

    .line 34
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Cred;->getSubType()Ljava/lang/String;

    move-result-object v4

    const v16, 0x2485

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 35
    iget-object v4, v0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/ChangeCredReq;->setNewcred(Lcom/olive/upi/transport/model/Cred;)V

    goto :goto_2

    .line 36
    :cond_7
    iget-object v4, v0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/ChangeCredReq;->setCred(Lcom/olive/upi/transport/model/Cred;)V

    goto :goto_2

    .line 37
    :cond_8
    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    invoke-virtual {v4, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/ChangeCredReq;->setTxnid(Ljava/lang/String;)V

    .line 38
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/ChangeCredReq;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 39
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v10}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/ChangeCredReq;->setCustomerid(Ljava/lang/String;)V

    .line 40
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x1c

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->changeCredReq:Lcom/olive/upi/transport/model/ChangeCredReq;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto/16 :goto_8

    :cond_9
    const/4 v1, 0x5

    const v16, 0x2486

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v16, 0x2487

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    const v16, 0x2488

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    const v16, 0x2489

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x6

    const v16, 0x248a

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    if-eq v2, v1, :cond_12

    if-eq v2, v14, :cond_12

    if-eq v2, v7, :cond_12

    const/16 v1, 0xa

    if-eq v2, v1, :cond_12

    const/16 v1, 0x9

    if-eq v2, v1, :cond_12

    const/16 v1, 0xe

    if-eq v2, v1, :cond_12

    const/16 v1, 0xb

    if-eq v2, v1, :cond_12

    const/16 v1, 0xc

    if-ne v2, v1, :cond_a

    goto/16 :goto_6

    :cond_a
    const/16 v1, 0xd

    if-ne v2, v1, :cond_c

    .line 41
    move-object v1, v3

    check-cast v1, Landroid/os/Bundle;

    .line 42
    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    .line 43
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catch_1
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 44
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 45
    new-instance v3, Lcom/olive/upi/transport/model/Data;

    invoke-direct {v3}, Lcom/olive/upi/transport/model/Data;-><init>()V

    .line 46
    invoke-virtual {v3, v13}, Lcom/olive/upi/transport/model/Data;->setCode(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v4, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/Data;->setEncryptedBase64String(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v4, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/Data;->setKi(Ljava/lang/String;)V

    .line 49
    iget-object v4, v0, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    iget-object v5, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/UpdateMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 50
    new-instance v4, Lcom/olive/upi/transport/model/Cred;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/Cred;-><init>()V

    .line 51
    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/Cred;->setData(Lcom/olive/upi/transport/model/Data;)V

    .line 52
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Cred;->setType(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v4, v8}, Lcom/olive/upi/transport/model/Cred;->setSubType(Ljava/lang/String;)V

    .line 54
    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    iget-object v5, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/UpdateMandate;->setCustomerid(Ljava/lang/String;)V

    .line 55
    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/UpdateMandate;->setCred(Lcom/olive/upi/transport/model/Cred;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 56
    :cond_b
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x4c

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate:Lcom/olive/upi/transport/model/UpdateMandate;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto/16 :goto_8

    :cond_c
    const/4 v1, 0x1

    if-ne v2, v1, :cond_f

    .line 57
    move-object v1, v3

    check-cast v1, Landroid/os/Bundle;

    .line 58
    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    .line 59
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 60
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :catch_2
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 61
    :try_start_2
    new-instance v7, Lorg/json/JSONObject;

    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-direct {v7, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 62
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 63
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v7, v6, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/olive/upi/transport/model/Cred;

    .line 64
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    .line 65
    :cond_d
    invoke-virtual/range {p4 .. p4}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/AccountTransportData;

    .line 66
    new-instance v3, Lcom/olive/upi/transport/model/BRequest;

    invoke-direct {v3}, Lcom/olive/upi/transport/model/BRequest;-><init>()V

    .line 67
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/olive/upi/transport/model/BRequest;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 68
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/olive/upi/transport/model/BRequest;->setTxnid(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_e

    const/4 v1, 0x0

    .line 70
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Cred;

    invoke-virtual {v3, v1}, Lcom/olive/upi/transport/model/BRequest;->setCred(Lcom/olive/upi/transport/model/Cred;)V

    .line 71
    :cond_e
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v10}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/olive/upi/transport/model/BRequest;->setCustomerId(Ljava/lang/String;)V

    .line 72
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v3, v1}, Lcom/olive/upi/transport/model/BRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 73
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x13

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto/16 :goto_8

    :cond_f
    const/4 v1, 0x4

    if-ne v2, v1, :cond_1b

    .line 74
    invoke-virtual/range {p4 .. p4}, Lcom/olive/upi/transport/OliveRequest;->getClInitData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/OliveUpiManager$InitLib;

    .line 75
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v5

    const v16, 0x248b

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 76
    invoke-virtual {v2}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getExpDayCount()I

    move-result v6

    sget v7, Lcom/olive/upi/transport/TransportConstants;->MAX_TOKEN_DAYS:I

    if-ge v6, v7, :cond_11

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_5

    .line 77
    :cond_10
    invoke-virtual {v2}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getReqType()I

    move-result v1

    invoke-direct {v0, v1, v4}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLibAction(ILcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_8

    .line 78
    :cond_11
    :goto_5
    invoke-virtual {v2}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getChallenge()Ljava/lang/String;

    move-result-object v2

    .line 79
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v6

    const v16, 0x248c

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v16, 0x248d

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v7

    const v16, 0x248e

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v10}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 82
    invoke-virtual {v4, v2}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 83
    invoke-virtual {v4, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestType(I)V

    .line 84
    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_8

    .line 85
    :cond_12
    :goto_6
    move-object v1, v3

    check-cast v1, Landroid/os/Bundle;

    .line 86
    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    .line 87
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :catch_3
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 88
    :try_start_3
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 89
    new-instance v4, Lcom/olive/upi/transport/model/Data;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/Data;-><init>()V

    .line 90
    invoke-virtual {v4, v13}, Lcom/olive/upi/transport/model/Data;->setCode(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v5, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/olive/upi/transport/model/Data;->setEncryptedBase64String(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v5, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/Data;->setKi(Ljava/lang/String;)V

    .line 93
    iget-object v5, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    iget-object v9, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v5, v9}, Lcom/olive/upi/transport/model/PayRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 94
    new-instance v5, Lcom/olive/upi/transport/model/Cred;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/Cred;-><init>()V

    .line 95
    invoke-virtual {v5, v4}, Lcom/olive/upi/transport/model/Cred;->setData(Lcom/olive/upi/transport/model/Data;)V

    .line 96
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/Cred;->setType(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v5, v8}, Lcom/olive/upi/transport/model/Cred;->setSubType(Ljava/lang/String;)V

    .line 98
    iget-object v4, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    iget-object v9, v0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v9}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/olive/upi/transport/model/PayRequest;->setCustomerId(Ljava/lang/String;)V

    .line 99
    iget-object v4, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/PayRequest;->setCred(Lcom/olive/upi/transport/model/Cred;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_7

    .line 100
    :cond_13
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, -0x64

    invoke-direct {v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    const/4 v4, 0x0

    invoke-interface {v1, v3, v4}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    if-ne v2, v14, :cond_14

    .line 101
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x18

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto/16 :goto_8

    :cond_14
    if-ne v2, v7, :cond_15

    .line 102
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->billPayRequest:Lcom/olive/upi/transport/model/BillPay;

    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/BillPay;->setPayRequest(Lcom/olive/upi/transport/model/PayRequest;)V

    .line 103
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x2d

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->billPayRequest:Lcom/olive/upi/transport/model/BillPay;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto :goto_8

    :cond_15
    const/16 v1, 0xa

    if-ne v2, v1, :cond_16

    .line 104
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->billPayRequest:Lcom/olive/upi/transport/model/BillPay;

    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/BillPay;->setPayRequest(Lcom/olive/upi/transport/model/PayRequest;)V

    .line 105
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x45

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->billPayRequest:Lcom/olive/upi/transport/model/BillPay;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto :goto_8

    :cond_16
    const/16 v1, 0xe

    if-ne v2, v1, :cond_17

    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v16, 0x248f

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x5c

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto :goto_8

    :cond_17
    const/16 v1, 0x9

    if-ne v2, v1, :cond_18

    .line 108
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto :goto_8

    :cond_18
    const/16 v1, 0xc

    if-ne v2, v1, :cond_19

    .line 109
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto :goto_8

    :cond_19
    const/16 v1, 0xb

    if-ne v2, v1, :cond_1a

    .line 110
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    const/16 v2, 0x4d

    iget-object v3, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    invoke-interface {v1, v2, v3}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    goto :goto_8

    .line 111
    :cond_1a
    iget-object v1, v0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    iget-object v2, v0, Lcom/olive/upi/transport/OliveUpiManager;->payRequest:Lcom/olive/upi/transport/model/PayRequest;

    const/16 v3, 0xa

    invoke-interface {v1, v3, v2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onCommonLibResponse(ILjava/lang/Object;)V

    :cond_1b
    :goto_8
    return-void
.end method

.method public onServiceConnected(ILcom/olive/upi/transport/OliveRequest;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getClInitData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/OliveUpiManager$InitLib;

    .line 2
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x2490

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getExpDayCount()I

    move-result v1

    sget v2, Lcom/olive/upi/transport/TransportConstants;->MAX_TOKEN_DAYS:I

    if-lt v1, v2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget p1, p1, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->reqType:I

    invoke-direct {p0, p1, p2}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLibAction(ILcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getChallenge()Ljava/lang/String;

    move-result-object p1

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x2491

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x2492

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2493

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v3, 0x2494

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 11
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/OliveRequest;->setRequestType(I)V

    .line 12
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_1
    return-void
.end method

.method public onServiceError(ILcom/olive/upi/transport/OliveUpiException;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const p2, 0x2495

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {p2, p3, p1}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 10

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 2
    :goto_0
    iget-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    if-nez v3, :cond_1

    return-void

    :cond_1
    if-nez v2, :cond_2

    .line 3
    new-instance p2, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p2}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 4
    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget v2, Lg70;->unable_to_process_your_request:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x2496

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 5
    iput-object v2, p2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 6
    iput-object v1, p2, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 7
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    return-void

    :cond_2
    const v0, 0x2497

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 9
    new-instance p2, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p2}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 10
    iput-object v3, p2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    .line 11
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    return-void

    .line 12
    :cond_3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v3

    const v0, 0x2498

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    const v0, 0x2499

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eq v3, v5, :cond_1f

    const/4 v5, 0x7

    const v0, 0x249a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v0, 0x249b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    if-eq v3, v5, :cond_1d

    const/16 v4, 0xc

    const/4 v5, 0x0

    if-eq v3, v4, :cond_1b

    const/16 v4, 0xf

    if-eq v3, v4, :cond_19

    const/16 v4, 0x15

    if-eq v3, v4, :cond_17

    const/16 v4, 0x17

    if-eq v3, v4, :cond_14

    const/16 v4, 0x1d

    if-eq v3, v4, :cond_11

    const/16 v4, 0x2b

    if-eq v3, v4, :cond_19

    const/16 v4, 0x51

    if-eq v3, v4, :cond_19

    const/16 v4, 0x59

    if-eq v3, v4, :cond_e

    const/16 v4, 0x9

    if-eq v3, v4, :cond_19

    const/16 v4, 0xa

    if-eq v3, v4, :cond_19

    const/16 v4, 0x12

    if-eq v3, v4, :cond_c

    const/16 v4, 0x13

    if-eq v3, v4, :cond_19

    const/16 v4, 0x22

    if-eq v3, v4, :cond_19

    const/16 v4, 0x23

    if-eq v3, v4, :cond_19

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    .line 13
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 14
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 15
    :cond_4
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 16
    :pswitch_0
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 17
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 18
    :cond_5
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 19
    :pswitch_1
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 20
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x249c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->c(Ljava/lang/String;)V

    .line 21
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 22
    :cond_6
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 23
    :pswitch_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 24
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/TransportManager;->setToken(Ljava/lang/String;)V

    .line 25
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x249d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Ln70;->A(Ljava/lang/String;Z)V

    .line 26
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 27
    :cond_7
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 28
    :pswitch_3
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    const v0, 0x249e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    .line 29
    :cond_8
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 30
    :cond_9
    :goto_1
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 31
    :pswitch_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_a

    .line 32
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 33
    :cond_a
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 34
    :pswitch_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_b

    .line 35
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 36
    :cond_b
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 37
    :cond_c
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_d

    .line 38
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 39
    :cond_d
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 40
    :cond_e
    :pswitch_6
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 41
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Registration;

    .line 42
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Registration;->getMobilenumber()Ljava/lang/String;

    move-result-object v2

    .line 43
    invoke-virtual {p0, v2}, Lcom/olive/upi/transport/OliveUpiManager;->getDecryptedData(Ljava/lang/String;)[B

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Registration;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/olive/upi/transport/OliveUpiManager;->getDecryptedData(Ljava/lang/String;)[B

    move-result-object v3

    if-eqz v3, :cond_f

    .line 44
    new-instance v3, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/olive/upi/transport/OliveUpiManager;->getDecryptedData(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    .line 45
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Registration;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 46
    invoke-virtual {p0, v2}, Lcom/olive/upi/transport/OliveUpiManager;->getDecryptedData(Ljava/lang/String;)[B

    move-result-object v2

    .line 47
    sget-object v4, Ln70;->f:Ln70$a;

    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v4

    invoke-virtual {v4, v8, v3}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Registration;->getName()Ljava/lang/String;

    .line 49
    invoke-static {v2}, Lcom/olive/upi/transport/service/CryptLibOne;->bytesToHex([B)Ljava/lang/String;

    move-result-object v1

    .line 50
    sput-object v1, Lcom/olive/upi/transport/TransportConstants;->regToken:Ljava/lang/String;

    .line 51
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 52
    :cond_f
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v0, 0x249f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    const v0, 0x24a0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setResult(Ljava/lang/String;)V

    .line 55
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 56
    :cond_10
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 57
    :cond_11
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 58
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_12

    .line 59
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 60
    :cond_12
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 61
    :cond_13
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 62
    :cond_14
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 63
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/TokenResponse;

    if-eqz v1, :cond_15

    .line 64
    new-instance v2, Lcom/olive/upi/transport/model/MasterUpdate;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/MasterUpdate;-><init>()V

    .line 65
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getBannerVersion()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/MasterUpdate;->setBanner(I)V

    .line 66
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getEncryptionFlag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/MasterUpdate;->setEncryptionFlag(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getDthOperatorVersion()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/MasterUpdate;->setDthOperator(I)V

    .line 68
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getMobOperatorVersion()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/MasterUpdate;->setMobileOperator(I)V

    .line 69
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getBillpayMaxAmtVersion()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/MasterUpdate;->setBill_pay_max(I)V

    .line 70
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v0, 0x24a1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getRateitnow()I

    move-result v4

    const v0, 0x24a2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 72
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getRemindmelater()I

    move-result v4

    const v0, 0x24a3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 73
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getNothanks()I

    move-result v4

    const v0, 0x24a4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 74
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getAsap()Ljava/lang/String;

    move-result-object v4

    const v0, 0x24a5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getVpa()Ljava/lang/String;

    move-result-object v4

    const v0, 0x24a6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getChecksumWebUrl()Ljava/lang/String;

    move-result-object v4

    const v0, 0x24a7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getBannerVersion()I

    move-result v4

    const v0, 0x24a8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 78
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getDthOperatorVersion()I

    move-result v4

    const v0, 0x24a9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 79
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getMobOperatorVersion()I

    move-result v4

    const v0, 0x24aa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 80
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getBillpayMaxAmtVersion()I

    move-result v4

    const v0, 0x24ab

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 81
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getToken()Ljava/lang/String;

    move-result-object v2

    .line 82
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/olive/upi/transport/TransportManager;->setToken(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getAmount()Ljava/lang/Double;

    move-result-object v2

    sput-object v2, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    .line 84
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v0, 0x24ac

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x24ad

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getVpa()Ljava/lang/String;

    .line 86
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getNotification()I

    move-result v2

    .line 87
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getTokenexpirydays()I

    move-result v4

    .line 88
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getTokenValidDays()I

    move-result v5

    .line 89
    sput v5, Lcom/olive/upi/transport/TransportConstants;->MAX_TOKEN_DAYS:I

    .line 90
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v5

    const v0, 0x24ae

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ln70;->v(Ljava/lang/String;I)V

    .line 91
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getBillpayvpa()Ljava/lang/String;

    move-result-object v4

    .line 92
    sput-object v4, Lcom/olive/upi/transport/TransportConstants;->BILLPAY_UPIID:Ljava/lang/String;

    .line 93
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getFlrespdesc()Ljava/lang/String;

    move-result-object v4

    sput-object v4, Lcom/olive/upi/transport/TransportConstants;->FLRESPDESC:Ljava/lang/String;

    .line 94
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getFprespdesc()Ljava/lang/String;

    move-result-object v4

    sput-object v4, Lcom/olive/upi/transport/TransportConstants;->FPRESPDESC:Ljava/lang/String;

    .line 95
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TokenResponse;->getBillervpa()Ljava/lang/String;

    move-result-object v1

    .line 96
    sput-object v1, Lcom/olive/upi/transport/TransportConstants;->BILLERPAY_UPIID:Ljava/lang/String;

    .line 97
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x24af

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ln70;->v(Ljava/lang/String;I)V

    .line 98
    :cond_15
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 99
    :cond_16
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 100
    :cond_17
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 101
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 102
    :cond_18
    new-instance p2, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p2}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v0, 0x24b0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 103
    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    const v0, 0x24b1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 104
    invoke-virtual {p2, v1}, Lcom/olive/upi/transport/api/Result;->setResult(Ljava/lang/String;)V

    .line 105
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 106
    :cond_19
    :pswitch_7
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 107
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 108
    :cond_1a
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 109
    :cond_1b
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 110
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 111
    invoke-static {v1, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    .line 112
    :try_start_0
    new-instance v2, Ljava/lang/String;

    const v0, 0x24b2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 113
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v7, v2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :catch_0
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 115
    :cond_1c
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 116
    :cond_1d
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 117
    :try_start_1
    new-instance v1, Lcom/olive/upi/transport/model/AccountTransportData;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/AccountTransportData;-><init>()V

    .line 118
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v7}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setXmlPayLoadString(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v8}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setMobileNumber(Ljava/lang/String;)V

    .line 120
    sget-object v3, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v3}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 121
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setCommonLibToken(Ljava/lang/String;)V

    .line 122
    iget-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->regRequest:Lcom/olive/upi/transport/model/RegRequest;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/RegRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/AccountTransportData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 123
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 124
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setTxnId(Ljava/lang/String;)V

    .line 125
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x24b3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v0, 0x24b4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/LibTransportData;->setLanguage(Ljava/lang/String;)V

    .line 127
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 128
    invoke-direct {p0, v1, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLib(ILcom/olive/upi/transport/OliveRequest;)V
    :try_end_1
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    .line 129
    :catch_1
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 130
    :cond_1e
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    invoke-interface {v1, p1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto/16 :goto_2

    .line 131
    :cond_1f
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    .line 132
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 133
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x24b5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 134
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v6

    const v0, 0x24b6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 135
    iget-object v7, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 136
    invoke-virtual {v7}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v7

    .line 137
    invoke-static {v3, v7, v1, v6}, Lcom/olive/upi/transport/service/CommonLibService;->populateHMAC(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 138
    sget-object v8, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    iget-object v9, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v9}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v3, v9, v6, v7}, Lorg/npci/upi/security/services/CLServices;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 139
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const v0, 0x24b7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v3, :cond_20

    .line 140
    :try_start_2
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v4, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x24b8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ln70;->A(Ljava/lang/String;Z)V

    .line 142
    new-instance v1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {v1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 143
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 144
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/olive/upi/transport/api/Result;->setResult(Ljava/lang/String;)V

    .line 145
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getClInitData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/OliveUpiManager$InitLib;

    .line 146
    iget p2, p2, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->reqType:I

    invoke-direct {p0, p2, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initCommonLibAction(ILcom/olive/upi/transport/OliveRequest;)V
    :try_end_2
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    .line 147
    :catch_2
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 148
    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 149
    iget-object p2, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v1, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p2, v1, p1}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_2

    .line 150
    :cond_20
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    .line 151
    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    .line 152
    iget-object p2, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v1, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p2, v1, p1}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_2

    .line 153
    :cond_21
    iget-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v1, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {p1, v1, p2}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x25
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public pay(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->pay(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public payBBPSBill(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->payBBPSBill(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public pendingMandateRequest(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x24b9

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x24ba

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->getPendingMandateReq(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public raiseComplain(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/ReqComplientVo;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/ReqComplientVo;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/UdirReasons;

    const v2, 0x24bb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/ReqComplientVo;->setInitiationMode(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UdirReasons;->getTransactionID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/ReqComplientVo;->setOrgTxnId(Ljava/lang/String;)V

    if-eqz v1, :cond_0

    .line 5
    iget-object v2, v1, Lcom/olive/upi/transport/model/UdirReasons;->adjcode:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/ReqComplientVo;->setReqAdjCode(Ljava/lang/String;)V

    .line 6
    iget-object v1, v1, Lcom/olive/upi/transport/model/UdirReasons;->adjflag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/ReqComplientVo;->setReqAdjFlag(Ljava/lang/String;)V

    :cond_0
    const v1, 0x24bc

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/ReqComplientVo;->setSubType(Ljava/lang/String;)V

    const v1, 0x24bd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/ReqComplientVo;->setType(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 10
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x24be

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->getraiseComplain(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public raiseQuery(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->raiseQuery(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public recurrenceAuthorization(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    .line 2
    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/RecurrenceAuthorization;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 3
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 4
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x24bf

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x24c0

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->recurrenceAuthorization(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public recurrencePending(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x24c1

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v4, 0x24c2

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/olive/upi/transport/TransportManager;->recurrencePending(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public regBillerEnq(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->regBillerEnq(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public registerUser(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/olive/upi/transport/model/UserRegister;

    if-eqz v1, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/UserRegister;

    .line 3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UserRegister;->getConfirmPassword()Ljava/lang/String;

    .line 4
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x24c3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    sget-object p1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    const/4 v1, 0x0

    const v0, 0x24c4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 6
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v0, 0x24c5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/api/Result;->setCode(Ljava/lang/String;)V

    const v0, 0x24c6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/api/Result;->setResult(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x25

    invoke-direct {v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    invoke-interface {v1, v2, p1}, Lcom/olive/upi/transport/OliveUpiEventListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    return-void

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/TransportManager;->setToken(Ljava/lang/String;)V

    .line 11
    sget-object v3, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v3}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    iput-object v3, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 12
    new-instance v3, Lcom/olive/upi/transport/model/RegCustomer;

    invoke-direct {v3}, Lcom/olive/upi/transport/model/RegCustomer;-><init>()V

    .line 13
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UserRegister;->getCustName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/RegCustomer;->setCustomerName(Ljava/lang/String;)V

    .line 14
    iget-object v5, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/RegCustomer;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 15
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UserRegister;->getReferralVpa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/RegCustomer;->setRefereevpa(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UserRegister;->getConfirmPassword()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/RegCustomer;->setAppPin(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UserRegister;->getCustEmail()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/RegCustomer;->setEmail(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UserRegister;->getRegType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/olive/upi/transport/model/RegCustomer;->setRegtype(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v5

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/UserRegister;->getCustEmail()Ljava/lang/String;

    move-result-object v1

    const v0, 0x24c7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x24c8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-virtual {v3, v1}, Lcom/olive/upi/transport/model/RegCustomer;->setVpa(Ljava/lang/String;)V

    .line 22
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 23
    invoke-virtual {v1, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 25
    new-instance v2, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v2}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 26
    sget-object v3, Lcom/olive/upi/transport/TransportConstants;->regToken:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/service/CryptLibOne;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v3

    .line 27
    :try_start_0
    invoke-virtual {v2, v1, v3}, Lcom/olive/upi/transport/service/CryptLibOne;->encrypt([B[B)[B

    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/olive/upi/transport/service/CryptLibOne;->bytesToHex([B)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x24c9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 29
    :goto_0
    new-instance v2, Lcom/olive/upi/transport/model/CustomerReg;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/CustomerReg;-><init>()V

    .line 30
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/CustomerReg;->setData(Ljava/lang/String;)V

    .line 31
    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->regRandom:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/CustomerReg;->setRefid(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 33
    :cond_1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v1

    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->customerReg(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public rejectPendingRequest(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->rejectpending(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public retryLastRequest()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->request:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveRequest;->incrementRequestCount()V

    .line 2
    iget-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->request:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p0, v0}, Lcom/olive/upi/transport/OliveUpiManager;->sendRequest(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public safetyNetCheck(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->safetyNetChecker(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public saveVpaContact(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x24ca

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/olive/upi/transport/TransportManager;->saveVpa(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public sendAccountOTP(Lcom/olive/upi/transport/model/Account;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/AccountOTPRequest;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/AccountOTPRequest;-><init>()V

    .line 2
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x24cb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setCustomerId(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setBankId(Ljava/lang/String;)V

    .line 5
    sget-object p1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {p1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object p1

    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 6
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->lastTransactionId:Ljava/lang/String;

    .line 7
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setTxnId(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/AccountOTPRequest;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    return-void
.end method

.method public sendRequest(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    if-nez p1, :cond_0

    .line 1
    sget v0, Lg70;->unable_to_process_your_request:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/olive/upi/transport/OliveUpiManager;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->request:Lcom/olive/upi/transport/OliveRequest;

    .line 3
    sget-object v0, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/olive/upi/transport/OliveUpiManager;->isConnectionAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x24cc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/olive/upi/transport/OliveUpiManager;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    packed-switch v0, :pswitch_data_4

    packed-switch v0, :pswitch_data_5

    packed-switch v0, :pswitch_data_6

    packed-switch v0, :pswitch_data_7

    packed-switch v0, :pswitch_data_8

    goto/16 :goto_0

    .line 6
    :pswitch_0
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->verifyLimit(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 7
    :pswitch_1
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->VerifyMerchant(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 8
    :pswitch_2
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->raiseComplain(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 9
    :pswitch_3
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->checkStatus(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 10
    :pswitch_4
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getRecentBBPSHistory(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 11
    :pswitch_5
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->payBBPSBill(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 12
    :pswitch_6
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->calculateCharges(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 13
    :pswitch_7
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->regBillerEnq(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 14
    :pswitch_8
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getBillerForm(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 15
    :pswitch_9
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getBillerLocations(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 16
    :pswitch_a
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getBillerNames(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 17
    :pswitch_b
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getBillerCategories(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 18
    :pswitch_c
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getMobileOperators(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 19
    :pswitch_d
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->mandateRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 20
    :pswitch_e
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->mandateCreateRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 21
    :pswitch_f
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->verifyReferalCode(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 22
    :pswitch_10
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->verifyPromoCode(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 23
    :pswitch_11
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getRechargePlan(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 24
    :pswitch_12
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->collectBlockedVpaList(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 25
    :pswitch_13
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->beneVpaBlock(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 26
    :pswitch_14
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getDthOperator(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 27
    :pswitch_15
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getBillPayMaxAmounts(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 28
    :pswitch_16
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getMobileCircles(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 29
    :pswitch_17
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getMobileOperator(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 30
    :pswitch_18
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getBanner(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 31
    :pswitch_19
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->billPayment(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 32
    :pswitch_1a
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->userPasscodeChange(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 33
    :pswitch_1b
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getQueryList(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 34
    :pswitch_1c
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->raiseQuery(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 35
    :pswitch_1d
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->deleteVpa(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 36
    :pswitch_1e
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->deleteAccount(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 37
    :pswitch_1f
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->vpaSuggestion(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 38
    :pswitch_20
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->rejectPendingRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 39
    :pswitch_21
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->changeMPin(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 40
    :pswitch_22
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getPendingRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 41
    :pswitch_23
    invoke-direct {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getMobileNumber(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 42
    :pswitch_24
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->collectPay(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 43
    :pswitch_25
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->login(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 44
    :pswitch_26
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getBalance(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 45
    :pswitch_27
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getVpaList(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 46
    :pswitch_28
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->saveVpaContact(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 47
    :pswitch_29
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->fetchPayloadKey(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 48
    :pswitch_2a
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->collect(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 49
    :pswitch_2b
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->pay(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 50
    :pswitch_2c
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->updateVPA(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 51
    :pswitch_2d
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->accountMobReg(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 52
    :pswitch_2e
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->activateAccount(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 53
    :pswitch_2f
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getAccountsFromBank(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 54
    :sswitch_0
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initiatePay(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 55
    :sswitch_1
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->mandateUpdate(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 56
    :pswitch_30
    :sswitch_2
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getRechargeHistory(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 57
    :sswitch_3
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initiateChangeMpin(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 58
    :sswitch_4
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->checkBalance(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 59
    :sswitch_5
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->initiatePay(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 60
    :sswitch_6
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getPlainAccountNumber(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 61
    :sswitch_7
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->setuCheck(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 62
    :sswitch_8
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->safetyNetCheck(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 63
    :sswitch_9
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->recurrenceAuthorization(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 64
    :sswitch_a
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->recurrenceAuthorization(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 65
    :sswitch_b
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->recurrencePending(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 66
    :sswitch_c
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->balanceEnqForCreditLine(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 67
    :sswitch_d
    invoke-direct {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->skipBindCall(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 68
    :sswitch_e
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getClToken(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 69
    :sswitch_f
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getPersonalLoan(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 70
    :sswitch_10
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getWebUrls(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 71
    :sswitch_11
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getPromotionalOffers(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 72
    :sswitch_12
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->verifyQR(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 73
    :sswitch_13
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->signedQR(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 74
    :sswitch_14
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->mandateExecute(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 75
    :sswitch_15
    invoke-direct {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->updateInbox(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 76
    :sswitch_16
    invoke-direct {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInfo(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 77
    :sswitch_17
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getVerifyVpa2(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 78
    :sswitch_18
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->mandateHistory(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 79
    :sswitch_19
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->acceptMandate(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 80
    :sswitch_1a
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->updateMandate(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 81
    :sswitch_1b
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->pendingMandateRequest(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 82
    :sswitch_1c
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInboxDate(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 83
    :sswitch_1d
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLongcode(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 84
    :sswitch_1e
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->registerUser(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 85
    :sswitch_1f
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getUPIBankList(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 86
    :sswitch_20
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->fetchMyAccounts(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 87
    :sswitch_21
    invoke-direct {p0, p1}, Lcom/olive/upi/transport/OliveUpiManager;->generateToken(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_21
        0xf -> :sswitch_20
        0x15 -> :sswitch_1f
        0x25 -> :sswitch_1e
        0x28 -> :sswitch_1d
        0x48 -> :sswitch_1c
        0x4b -> :sswitch_1b
        0x4c -> :sswitch_1a
        0x4d -> :sswitch_19
        0x4e -> :sswitch_18
        0x4f -> :sswitch_17
        0x50 -> :sswitch_16
        0x51 -> :sswitch_15
        0x52 -> :sswitch_14
        0x53 -> :sswitch_13
        0x54 -> :sswitch_12
        0x55 -> :sswitch_11
        0x56 -> :sswitch_10
        0x57 -> :sswitch_f
        0x58 -> :sswitch_e
        0x59 -> :sswitch_d
        0x5a -> :sswitch_c
        0x5b -> :sswitch_b
        0x5c -> :sswitch_a
        0x5d -> :sswitch_9
        0x65 -> :sswitch_8
        0x66 -> :sswitch_7
        0xad -> :sswitch_6
        0x1fe -> :sswitch_5
        0x207 -> :sswitch_4
        0x210 -> :sswitch_3
        0x230 -> :sswitch_2
        0x240 -> :sswitch_1
        0x247 -> :sswitch_13
        0x250 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x11
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x17
        :pswitch_25
        :pswitch_24
        :pswitch_23
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1b
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x32
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x37
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_30
        :pswitch_c
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x3f
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x5f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setCustomerVpa(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x24cd

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getIfsc()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v5

    move-object v6, p2

    invoke-virtual/range {v0 .. v6}, Lcom/olive/upi/transport/TransportManager;->setCustomerVpa(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setListener(Lcom/olive/upi/transport/OliveUpiEventListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/OliveUpiManager;->listener:Lcom/olive/upi/transport/OliveUpiEventListener;

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/TransportManager;->setToken(Ljava/lang/String;)V

    return-void
.end method

.method public setuCheck(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->setuCheck(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public signedQR(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->signedQR(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public updateMandate(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->updateMandate(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public updateVPA(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    iput-object v0, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/olive/upi/transport/model/SaveAccount;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/SaveAccount;

    .line 4
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/SaveAccount;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/olive/upi/transport/OliveUpiManager;->isValidVpa(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/SaveAccount;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    .line 6
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/SaveAccount;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/olive/upi/transport/model/AcctUpdateReq;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/AcctUpdateReq;-><init>()V

    .line 8
    iget-object v2, p0, Lcom/olive/upi/transport/OliveUpiManager;->deviceDetails:Lcom/olive/upi/transport/model/DeviceDetails;

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/AcctUpdateReq;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 9
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/AcctUpdateReq;->setTxnId(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/AcctUpdateReq;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 11
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 12
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->updateAccounts(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 13
    :cond_0
    sget-object p1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    const/4 v0, 0x0

    const v1, 0x24ce

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 14
    :cond_1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->updateAccounts(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public userDeRegister()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x24cf

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/olive/upi/transport/TransportManager;->deRegister(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public userLogout()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x24d0

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/olive/upi/transport/TransportManager;->customerSignOff(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public userPasscodeChange(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/ChangeAppPin;

    .line 3
    new-instance v1, Lcom/olive/upi/transport/model/ChangeAppPin;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/ChangeAppPin;-><init>()V

    .line 4
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->getOldPin()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/olive/upi/transport/OliveUpiManager;->encPass(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/ChangeAppPin;->setOldPin(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->getNewPin()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/olive/upi/transport/OliveUpiManager;->encPass(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/ChangeAppPin;->setNewPin(Ljava/lang/String;)V

    .line 6
    sget-object v2, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-static {v2}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v2

    .line 7
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/ChangeAppPin;->setDeviceDetails(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 8
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setType(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->changePassword(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public verifyLimit(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/LimitCheckReq;

    .line 2
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setRequestData(Ljava/lang/Object;)V

    .line 3
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->verifyLimitChecks(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public verifyPromoCode(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->verifyPromocode(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public verifyQR(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->verifyQR(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public verifyReferalCode(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 6

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0x24d1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x24d2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x24d3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v0, 0x24d4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 3
    new-instance v2, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v2}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 4
    sget-object v3, Lcom/olive/upi/transport/TransportConstants;->regToken:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/service/CryptLibOne;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v3

    .line 5
    :try_start_0
    invoke-virtual {v2, v1, v3}, Lcom/olive/upi/transport/service/CryptLibOne;->encrypt([B[B)[B

    move-result-object v1

    .line 6
    invoke-static {v1}, Lcom/olive/upi/transport/service/CryptLibOne;->bytesToHex([B)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x24d5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    :goto_0
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v2

    sget-object v3, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    sget-object v4, Lcom/olive/upi/transport/TransportConstants;->regRandom:Ljava/lang/String;

    invoke-virtual {v2, v3, v1, v4, p1}, Lcom/olive/upi/transport/TransportManager;->verifyReferalCode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public vpaSuggestion(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;

    move-result-object v0

    sget-object v1, Lcom/olive/upi/transport/OliveUpiManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/olive/upi/transport/TransportManager;->vpaSuggestion(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
