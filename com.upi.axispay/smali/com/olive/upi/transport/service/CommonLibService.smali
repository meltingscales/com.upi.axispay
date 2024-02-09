.class public Lcom/olive/upi/transport/service/CommonLibService;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;,
        Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;
    }
.end annotation


# static fields
.field public static final MODE_BAL_ENQ:I

.field public static final MODE_BBPS_TXN:I

.field public static final MODE_BILL_PAY_TXN:I

.field public static final MODE_CHANGE_MPIN:I

.field public static final MODE_COLLECT_PAY_TXN:I

.field public static final MODE_CREATE_CHALLENGE:I

.field public static final MODE_INITIALIZE_LIB:I

.field public static final MODE_INITIATE_TXN:I

.field public static final MODE_MANDATE_APPROVE:I

.field public static final MODE_MANDATE_PAY:I

.field public static final MODE_MANDATE_UPDATE:I

.field public static final MODE_MANDATE_UPDATE_REVOKE_SUSPEND_PAUSE:I

.field public static final MODE_PAYER_EXECUTE:I

.field public static final MODE_SET_MPIN:I

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private commonLibListener:Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

.field private context:Landroid/content/Context;

.field private mode:I

.field public oliveRequest:Lcom/olive/upi/transport/OliveRequest;

.field private remoteResultReceiver:Lorg/npci/upi/security/services/CLRemoteResultReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/service/CommonLibService;

    const v1, 0x1d

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    .line 3
    new-instance v0, Lorg/npci/upi/security/services/CLRemoteResultReceiver;

    new-instance v1, Lcom/olive/upi/transport/service/CommonLibService$1;

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    invoke-direct {v1, p0, v2}, Lcom/olive/upi/transport/service/CommonLibService$1;-><init>(Lcom/olive/upi/transport/service/CommonLibService;Landroid/os/Handler;)V

    invoke-direct {v0, v1}, Lorg/npci/upi/security/services/CLRemoteResultReceiver;-><init>(Landroid/os/ResultReceiver;)V

    iput-object v0, p0, Lcom/olive/upi/transport/service/CommonLibService;->remoteResultReceiver:Lorg/npci/upi/security/services/CLRemoteResultReceiver;

    .line 4
    iput-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService;->context:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lcom/olive/upi/transport/service/CommonLibService;->commonLibListener:Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    return-void
.end method

.method public static synthetic access$000(Lcom/olive/upi/transport/service/CommonLibService;ILandroid/os/Bundle;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/olive/upi/transport/service/CommonLibService;->parseResult(ILandroid/os/Bundle;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static synthetic access$100(Lcom/olive/upi/transport/service/CommonLibService;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    return p0
.end method

.method public static synthetic access$200(Lcom/olive/upi/transport/service/CommonLibService;)Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/olive/upi/transport/service/CommonLibService;->commonLibListener:Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    return-object p0
.end method

.method private parseResult(ILandroid/os/Bundle;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0xf67

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object v1, p3

    goto :goto_0

    :cond_0
    const v0, 0xf68

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const v0, 0xf69

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    const v0, 0xf6a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :catch_0
    iget-object p2, p0, Lcom/olive/upi/transport/service/CommonLibService;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    .line 8
    iget-object p2, p0, Lcom/olive/upi/transport/service/CommonLibService;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/OliveRequest;->setClInitData(Ljava/lang/Object;)V

    .line 9
    iget-object p2, p0, Lcom/olive/upi/transport/service/CommonLibService;->commonLibListener:Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    iget-object v2, p0, Lcom/olive/upi/transport/service/CommonLibService;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-interface {p2, p1, v1, p3, v2}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onReceiveResult(IILjava/lang/Object;Lcom/olive/upi/transport/OliveRequest;)V

    return-void

    .line 10
    :cond_1
    iget-object p3, p0, Lcom/olive/upi/transport/service/CommonLibService;->commonLibListener:Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    iget-object v2, p0, Lcom/olive/upi/transport/service/CommonLibService;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-interface {p3, p1, v1, p2, v2}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onReceiveResult(IILjava/lang/Object;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public static populateHMAC(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const v0, 0xf6b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    :try_start_0
    new-instance v2, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v2}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    .line 3
    invoke-static {p2, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 4
    invoke-virtual {v2, p0}, Lcom/olive/upi/transport/service/CryptLibOne;->SHA256(Ljava/lang/String;)[B

    move-result-object p0

    .line 5
    invoke-virtual {v2, p0, p1}, Lcom/olive/upi/transport/service/CryptLibOne;->encrypt([B[B)[B

    move-result-object p0

    const/4 p1, 0x0

    .line 6
    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static trustCred(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v0}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/olive/upi/transport/service/CryptLibOne;->SHA256(Ljava/lang/String;)[B

    move-result-object p0

    const/4 v1, 0x2

    .line 3
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 4
    invoke-virtual {v0, p0, p1}, Lcom/olive/upi/transport/service/CryptLibOne;->encrypt([B[B)[B

    move-result-object p0

    const/4 p1, 0x0

    .line 5
    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public getCredentials(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    .line 2
    iget v3, v0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    const v4, 0xf6c

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0xf6d

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0xf6e

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0xf6f

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0xf70

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_0

    .line 3
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/MandateUpdateData;

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCredAllowedWrapper()Lcom/olive/upi/transport/model/CredAllowedWrapper;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getConfiguration()Lcom/olive/upi/transport/model/lib/Configuration;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getSalt()Lcom/olive/upi/transport/model/lib/PaymentSalt;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getPayInfo()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 8
    sget-object v6, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    sget-object v7, Lcom/olive/upi/transport/TransportConstants;->KEY_CODE:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getXmlPayLoadString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 9
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTrustStr()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getLanguage()Ljava/lang/String;

    move-result-object v14

    iget-object v15, v0, Lcom/olive/upi/transport/service/CommonLibService;->remoteResultReceiver:Lorg/npci/upi/security/services/CLRemoteResultReceiver;

    .line 10
    invoke-virtual/range {v6 .. v15}, Lorg/npci/upi/security/services/CLServices;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLRemoteResultReceiver;)V

    goto/16 :goto_0

    .line 11
    :pswitch_2
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/PayTransportData;

    .line 12
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCredAllowedWrapper()Lcom/olive/upi/transport/model/CredAllowedWrapper;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getConfiguration()Lcom/olive/upi/transport/model/lib/Configuration;

    move-result-object v9

    invoke-virtual {v2, v9}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 14
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PayTransportData;->getSalt()Lcom/olive/upi/transport/model/lib/PaymentSalt;

    move-result-object v10

    invoke-virtual {v2, v10}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 15
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getPayInfo()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v2, v11}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTrustStr()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    sget-object v11, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    sget-object v12, Lcom/olive/upi/transport/TransportConstants;->KEY_CODE:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getXmlPayLoadString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    .line 22
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTrustStr()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getLanguage()Ljava/lang/String;

    move-result-object v19

    iget-object v1, v0, Lcom/olive/upi/transport/service/CommonLibService;->remoteResultReceiver:Lorg/npci/upi/security/services/CLRemoteResultReceiver;

    move-object/from16 v20, v1

    .line 23
    invoke-virtual/range {v11 .. v20}, Lorg/npci/upi/security/services/CLServices;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLRemoteResultReceiver;)V

    goto/16 :goto_0

    .line 24
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getClInitData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/OliveUpiManager$InitLib;

    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0xf71

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    sget-object v3, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    invoke-virtual {v2}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    const v5, 0xf72

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Lorg/npci/upi/security/services/CLServices;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->setChallenge(Ljava/lang/String;)V

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0xf73

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/OliveRequest;->setClInitData(Ljava/lang/Object;)V

    .line 30
    iget-object v2, v0, Lcom/olive/upi/transport/service/CommonLibService;->commonLibListener:Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    const/4 v3, 0x0

    iget v4, v0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v2, v3, v4, v5, v1}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onReceiveResult(IILjava/lang/Object;Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 31
    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/AccountTransportData;

    .line 32
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCredAllowedWrapper()Lcom/olive/upi/transport/model/CredAllowedWrapper;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 33
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getConfiguration()Lcom/olive/upi/transport/model/lib/Configuration;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 34
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getSalt()Lcom/olive/upi/transport/model/lib/Salt;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 35
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getPayInfo()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTrustStr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0xf74

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTrustStr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0xf75

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getXmlPayLoadString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    sget-object v9, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    sget-object v10, Lcom/olive/upi/transport/TransportConstants;->KEY_CODE:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getXmlPayLoadString()Ljava/lang/String;

    move-result-object v11

    .line 43
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTrustStr()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getLanguage()Ljava/lang/String;

    move-result-object v17

    iget-object v1, v0, Lcom/olive/upi/transport/service/CommonLibService;->remoteResultReceiver:Lorg/npci/upi/security/services/CLRemoteResultReceiver;

    move-object/from16 v18, v1

    .line 44
    invoke-virtual/range {v9 .. v18}, Lorg/npci/upi/security/services/CLServices;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLRemoteResultReceiver;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
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

.method public initService(ILcom/olive/upi/transport/OliveRequest;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    .line 2
    iput-object p2, p0, Lcom/olive/upi/transport/service/CommonLibService;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    .line 3
    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/olive/upi/transport/service/CommonLibService;->context:Landroid/content/Context;

    new-instance v1, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;

    invoke-direct {v1, p0, p1, p2}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;-><init>(Lcom/olive/upi/transport/service/CommonLibService;ILcom/olive/upi/transport/OliveRequest;)V

    invoke-static {v0, v1}, Lorg/npci/upi/security/services/CLServices;->f(Landroid/content/Context;Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/service/CommonLibService;->getCredentials(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public initiatePay(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/PayTransportData;

    .line 2
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCommonLibToken()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getXmlPayLoadString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getMode()I

    move-result v2

    iput v2, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    .line 5
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PayTransportData;->getPayrequest()Lcom/olive/upi/transport/model/PayRequest;

    move-result-object v2

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getDeviceDetails()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    .line 7
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    .line 8
    new-instance v5, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 9
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    const v0, 0xf76

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 10
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    const v0, 0xf77

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 11
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    const v0, 0xf78

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 12
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 13
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v5, Lcom/olive/upi/transport/model/CredAllowedWrapper;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/CredAllowedWrapper;-><init>()V

    .line 16
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowedWrapper;->setCredAllowed(Ljava/util/List;)V

    .line 17
    invoke-virtual {v1, v5}, Lcom/olive/upi/transport/model/LibTransportData;->setCredAllowed(Lcom/olive/upi/transport/model/CredAllowedWrapper;)V

    .line 18
    new-instance v5, Lcom/olive/upi/transport/model/lib/Configuration;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/lib/Configuration;-><init>()V

    .line 19
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/olive/upi/transport/model/lib/Configuration;->setPayerBankName(Ljava/lang/String;)V

    const v0, 0xf79

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 20
    invoke-virtual {v5, v4}, Lcom/olive/upi/transport/model/lib/Configuration;->setBackgroundColor(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v1, v5}, Lcom/olive/upi/transport/model/LibTransportData;->setConfiguration(Lcom/olive/upi/transport/model/lib/Configuration;)V

    .line 22
    iget v4, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    const/16 v5, 0xe

    if-ne v4, v5, :cond_0

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0xf7a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PayTransportData;->getUmnId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PayTransportData;->getUmnId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v4

    .line 26
    :goto_0
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getPayees()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/olive/upi/transport/model/Payee;

    .line 27
    new-instance v6, Lcom/olive/upi/transport/model/lib/PaymentSalt;

    invoke-direct {v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;-><init>()V

    .line 28
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setTxnId(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Payee;->getBamount()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setTxnAmount(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setDeviceId(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getApp()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setAppId(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setMobileNumber(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setPayerAddr(Ljava/lang/String;)V

    .line 34
    iget-object v7, v5, Lcom/olive/upi/transport/model/Payee;->beneVpa:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setPayeeAddr(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v1, v6}, Lcom/olive/upi/transport/model/PayTransportData;->setSalt(Lcom/olive/upi/transport/model/lib/PaymentSalt;)V

    .line 36
    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v7, 0x64

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 37
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Payee;->getBamount()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getApp()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCommonLibToken()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/olive/upi/transport/service/CommonLibService;->trustCred(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setTrustStr(Ljava/lang/String;)V

    .line 46
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    new-instance v4, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PayTransportData;->getPayeeName()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf7b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    new-instance v4, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getAmount()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf7c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v4, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getRemarks()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf7d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    new-instance v4, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf7e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    new-instance v4, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/PayRequest;->getAc()Lcom/olive/upi/transport/model/Account;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v2

    const v0, 0xf7f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PayTransportData;->getRefUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 53
    new-instance v2, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/PayTransportData;->getRefUrl()Ljava/lang/String;

    move-result-object v4

    const v0, 0xf80

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v4}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_1
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/LibTransportData;->setPayInfo(Ljava/util/List;)V

    .line 55
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setClTransportData(Ljava/lang/Object;)V

    .line 56
    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    invoke-virtual {p0, v1, p1}, Lcom/olive/upi/transport/service/CommonLibService;->initService(ILcom/olive/upi/transport/OliveRequest;)V

    return-void

    .line 57
    :catch_0
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf81

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_2
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf82

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 59
    :cond_3
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf83

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public manageAccount(ILcom/olive/upi/transport/OliveRequest;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/AccountTransportData;

    .line 2
    iput p1, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    .line 3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getXmlPayLoadString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 4
    new-instance v2, Lcom/olive/upi/transport/model/lib/Configuration;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/lib/Configuration;-><init>()V

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    .line 7
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getOtpFormat()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const v0, 0xf84

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v5, :cond_0

    .line 8
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Account;->setOtpFormat(Ljava/lang/String;)V

    .line 9
    :cond_0
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getOtpLength()I

    move-result v5

    if-nez v5, :cond_1

    const/4 v5, 0x6

    .line 10
    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/Account;->setOtpLength(I)V

    .line 11
    :cond_1
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getdType()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 12
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getdType()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    move-object v5, v6

    :goto_0
    const/4 v7, 0x1

    const v0, 0xf85

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v0, 0xf86

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-ne p1, v7, :cond_3

    .line 13
    new-instance v4, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 14
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v5

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    .line 15
    invoke-virtual {v4, v9}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v4, v8}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 18
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    new-instance v4, Lcom/olive/upi/transport/model/CredAllowedWrapper;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/CredAllowedWrapper;-><init>()V

    .line 20
    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/CredAllowedWrapper;->setCredAllowed(Ljava/util/List;)V

    .line 21
    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/LibTransportData;->setCredAllowed(Lcom/olive/upi/transport/model/CredAllowedWrapper;)V

    goto/16 :goto_1

    :cond_3
    const/4 v7, 0x2

    if-ne p1, v7, :cond_6

    .line 22
    new-instance v7, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v7}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 23
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getOtpLength()I

    move-result v10

    invoke-virtual {v7, v10}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    const v0, 0xf87

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 24
    invoke-virtual {v7, v10}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v7, v10}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getOtpFormat()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 27
    new-instance v10, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v10}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 28
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    .line 29
    invoke-virtual {v10, v9}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v10, v8}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v10, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 32
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getAtmpinFormat()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    const v0, 0xf88

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 35
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    const v0, 0xf89

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 36
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 37
    :cond_4
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getAtmpinlength()I

    move-result v4

    .line 38
    new-instance v6, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v6}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 39
    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    .line 40
    invoke-virtual {v6, v9}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    const v0, 0xf8a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 41
    invoke-virtual {v6, v4}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v6, v5}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 43
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    :cond_5
    new-instance v4, Lcom/olive/upi/transport/model/CredAllowedWrapper;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/CredAllowedWrapper;-><init>()V

    .line 45
    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/CredAllowedWrapper;->setCredAllowed(Ljava/util/List;)V

    .line 46
    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/LibTransportData;->setCredAllowed(Lcom/olive/upi/transport/model/CredAllowedWrapper;)V

    const v0, 0xf8b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 47
    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/lib/Configuration;->setResendOTPFeature(Ljava/lang/String;)V

    goto :goto_1

    .line 48
    :cond_6
    new-instance v4, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 49
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v5

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    .line 50
    invoke-virtual {v4, v9}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    .line 51
    invoke-virtual {v4, v8}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 53
    new-instance v5, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 54
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v7

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    .line 55
    invoke-virtual {v5, v9}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    const v0, 0xf8c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 56
    invoke-virtual {v5, v7}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 58
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    new-instance v4, Lcom/olive/upi/transport/model/CredAllowedWrapper;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/CredAllowedWrapper;-><init>()V

    .line 61
    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/CredAllowedWrapper;->setCredAllowed(Ljava/util/List;)V

    .line 62
    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/LibTransportData;->setCredAllowed(Lcom/olive/upi/transport/model/CredAllowedWrapper;)V

    .line 63
    :goto_1
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCredAllowedWrapper()Lcom/olive/upi/transport/model/CredAllowedWrapper;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 64
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v3

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/lib/Configuration;->setPayerBankName(Ljava/lang/String;)V

    const v0, 0xf8d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 65
    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/lib/Configuration;->setBackgroundColor(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/LibTransportData;->setConfiguration(Lcom/olive/upi/transport/model/lib/Configuration;)V

    .line 67
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 68
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getDeviceDetails()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 69
    new-instance v4, Lcom/olive/upi/transport/model/lib/Salt;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/lib/Salt;-><init>()V

    .line 70
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getApp()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/lib/Salt;->setAppId(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/lib/Salt;->setDeviceId(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/lib/Salt;->setMobileNumber(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v4, v2}, Lcom/olive/upi/transport/model/lib/Salt;->setTxnId(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/AccountTransportData;->setSalt(Lcom/olive/upi/transport/model/lib/Salt;)V

    .line 75
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v5, 0x64

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 76
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getApp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCommonLibToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 81
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCommonLibToken()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/olive/upi/transport/service/CommonLibService;->trustCred(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/LibTransportData;->setTrustStr(Ljava/lang/String;)V

    .line 83
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 84
    new-instance v4, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v3

    const v0, 0xf8e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v4

    const v0, 0xf8f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/AccountTransportData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v4

    const v0, 0xf90

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/LibTransportData;->setPayInfo(Ljava/util/List;)V

    .line 88
    invoke-virtual {p0, p1, p2}, Lcom/olive/upi/transport/service/CommonLibService;->initService(ILcom/olive/upi/transport/OliveRequest;)V

    return-void

    .line 89
    :cond_7
    :try_start_1
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf91

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    :catch_0
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf92

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 91
    :cond_8
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf93

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 92
    :cond_9
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf94

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_a
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xf95

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public mandateUpdate(Lcom/olive/upi/transport/OliveRequest;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getClTransportData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/MandateUpdateData;

    .line 2
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCommonLibToken()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getXmlPayLoadString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getMode()I

    move-result v2

    iput v2, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    .line 5
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getUpdateMandate()Lcom/olive/upi/transport/model/UpdateMandate;

    move-result-object v2

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getDeviceDetails()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v3

    .line 7
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getSourceAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v4

    .line 8
    new-instance v5, Lcom/olive/upi/transport/model/CredAllowed;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/CredAllowed;-><init>()V

    .line 9
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdLength(I)V

    const v0, 0xf96

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 10
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setType(Ljava/lang/String;)V

    const v0, 0xf97

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 11
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setSubtype(Ljava/lang/String;)V

    const v0, 0xf98

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 12
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowed;->setdType(Ljava/lang/String;)V

    .line 13
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v5, Lcom/olive/upi/transport/model/CredAllowedWrapper;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/CredAllowedWrapper;-><init>()V

    .line 16
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/CredAllowedWrapper;->setCredAllowed(Ljava/util/List;)V

    .line 17
    invoke-virtual {v1, v5}, Lcom/olive/upi/transport/model/LibTransportData;->setCredAllowed(Lcom/olive/upi/transport/model/CredAllowedWrapper;)V

    .line 18
    new-instance v5, Lcom/olive/upi/transport/model/lib/Configuration;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/lib/Configuration;-><init>()V

    .line 19
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/Configuration;->setPayerBankName(Ljava/lang/String;)V

    const v0, 0xf99

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 20
    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/Configuration;->setBackgroundColor(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v1, v5}, Lcom/olive/upi/transport/model/LibTransportData;->setConfiguration(Lcom/olive/upi/transport/model/lib/Configuration;)V

    .line 22
    new-instance v5, Lcom/olive/upi/transport/model/lib/PaymentSalt;

    invoke-direct {v5}, Lcom/olive/upi/transport/model/lib/PaymentSalt;-><init>()V

    .line 23
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/UpdateMandate;->getTxnid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setTxnId(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getAmount()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setTxnAmount(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setDeviceId(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getApp()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setAppId(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setMobileNumber(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getPayerVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setPayerAddr(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getPayeeVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/olive/upi/transport/model/lib/PaymentSalt;->setPayeeAddr(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v1, v5}, Lcom/olive/upi/transport/model/MandateUpdateData;->setSalt(Lcom/olive/upi/transport/model/lib/PaymentSalt;)V

    .line 31
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x64

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 32
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getAmount()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/UpdateMandate;->getTxnid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getPayerVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getPayeeVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getApp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getMobile()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->SALT_DELIMETER:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/DeviceDetails;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getCommonLibToken()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/olive/upi/transport/service/CommonLibService;->trustCred(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/LibTransportData;->setTrustStr(Ljava/lang/String;)V

    .line 41
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getPayeeName()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf9a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getAmount()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf9b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getRemark()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf9c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/LibTransportData;->getTxnId()Ljava/lang/String;

    move-result-object v5

    const v0, 0xf9d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v4

    const v0, 0xf9e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getRefUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 48
    new-instance v3, Lcom/olive/upi/transport/model/lib/NameValuePair;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateUpdateData;->getRefUrl()Ljava/lang/String;

    move-result-object v4

    const v0, 0xf9f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lcom/olive/upi/transport/model/lib/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    :cond_0
    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/LibTransportData;->setPayInfo(Ljava/util/List;)V

    .line 50
    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService;->mode:I

    invoke-virtual {p0, v1, p1}, Lcom/olive/upi/transport/service/CommonLibService;->initService(ILcom/olive/upi/transport/OliveRequest;)V

    return-void

    .line 51
    :catch_0
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xfa0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_1
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xfa1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 53
    :cond_2
    new-instance p1, Lcom/olive/upi/transport/OliveUpiException;

    const v0, 0xfa2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/olive/upi/transport/OliveUpiException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
