.class public Lcom/olive/upi/transport/TransportManager;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;
    }
.end annotation


# static fields
.field private static final CODE_UNAUTHORIZED:I

.field private static manager:Lcom/olive/upi/transport/TransportManager;

.field private static safetyNetService:Lcom/olive/upi/transport/api/UpiService;

.field private static setuService:Lcom/olive/upi/transport/api/UpiService;

.field private static upiPaymentService:Lcom/olive/upi/transport/api/UpiService;

.field private static upiService:Lcom/olive/upi/transport/api/UpiService;


# instance fields
.field public TAG:Ljava/lang/String;

.field public checkSum:Ljava/lang/String;

.field public interceptor:Lokhttp3/Interceptor;

.field public listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

.field public token:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/TransportManager;

    const v1, 0x7d

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x101a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/TransportManager;->TAG:Ljava/lang/String;

    .line 3
    new-instance v0, Lcom/olive/upi/transport/TransportManager$1;

    invoke-direct {v0, p0}, Lcom/olive/upi/transport/TransportManager$1;-><init>(Lcom/olive/upi/transport/TransportManager;)V

    iput-object v0, p0, Lcom/olive/upi/transport/TransportManager;->interceptor:Lokhttp3/Interceptor;

    return-void
.end method

.method public static synthetic access$000(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/olive/upi/transport/TransportManager;->convertInputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static convertInputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    const v1, 0x101b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v1
.end method

.method private getHttpClient(Z)Lokhttp3/OkHttpClient;
    .locals 7

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 2
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->interceptors()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/olive/upi/transport/TransportManager;->interceptor:Lokhttp3/Interceptor;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-wide/16 v1, 0x5a

    const-wide/16 v3, 0xa

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {v0, v5}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    .line 4
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, p1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 5
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, v6}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    .line 7
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, p1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    :goto_0
    const/4 p1, 0x2

    new-array p1, p1, [Lokhttp3/ConnectionSpec;

    .line 9
    sget-object v1, Lokhttp3/ConnectionSpec;->MODERN_TLS:Lokhttp3/ConnectionSpec;

    aput-object v1, p1, v5

    sget-object v1, Lokhttp3/ConnectionSpec;->COMPATIBLE_TLS:Lokhttp3/ConnectionSpec;

    aput-object v1, p1, v6

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/OkHttpClient$Builder;->connectionSpecs(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

    .line 10
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v1, 0x101c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const p1, 0x101d

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    :cond_1
    new-instance v1, Lokhttp3/CertificatePinner$Builder;

    invoke-direct {v1}, Lokhttp3/CertificatePinner$Builder;-><init>()V

    const v2, 0x101e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const v3, 0x101f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {v1, v3, v2}, Lokhttp3/CertificatePinner$Builder;->add(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;

    move-result-object v1

    const v2, 0x1020

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-virtual {v1, v3, v2}, Lokhttp3/CertificatePinner$Builder;->add(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;

    move-result-object v1

    const v2, 0x1021

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-virtual {v1, v3, v2}, Lokhttp3/CertificatePinner$Builder;->add(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;

    move-result-object v1

    const v2, 0x1022

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-virtual {v1, v3, v2}, Lokhttp3/CertificatePinner$Builder;->add(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;

    move-result-object v1

    const v2, 0x1023

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-virtual {v1, v3, v2}, Lokhttp3/CertificatePinner$Builder;->add(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/String;

    aput-object p1, v2, v5

    .line 18
    invoke-virtual {v1, v3, v2}, Lokhttp3/CertificatePinner$Builder;->add(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lokhttp3/CertificatePinner$Builder;->build()Lokhttp3/CertificatePinner;

    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Lokhttp3/OkHttpClient$Builder;->certificatePinner(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;

    .line 21
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    return-object p1
.end method

.method public static getInstance()Lcom/olive/upi/transport/TransportManager;
    .locals 1

    .line 5
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->manager:Lcom/olive/upi/transport/TransportManager;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Lcom/olive/upi/transport/TransportManager;

    invoke-direct {v0}, Lcom/olive/upi/transport/TransportManager;-><init>()V

    sput-object v0, Lcom/olive/upi/transport/TransportManager;->manager:Lcom/olive/upi/transport/TransportManager;

    .line 7
    :cond_0
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->manager:Lcom/olive/upi/transport/TransportManager;

    return-object v0
.end method

.method public static getInstance(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)Lcom/olive/upi/transport/TransportManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->manager:Lcom/olive/upi/transport/TransportManager;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/olive/upi/transport/TransportManager;

    invoke-direct {v0}, Lcom/olive/upi/transport/TransportManager;-><init>()V

    sput-object v0, Lcom/olive/upi/transport/TransportManager;->manager:Lcom/olive/upi/transport/TransportManager;

    .line 3
    :cond_0
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->manager:Lcom/olive/upi/transport/TransportManager;

    invoke-virtual {v0, p0}, Lcom/olive/upi/transport/TransportManager;->setListener(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)V

    .line 4
    sget-object p0, Lcom/olive/upi/transport/TransportManager;->manager:Lcom/olive/upi/transport/TransportManager;

    return-object p0
.end method

.method public static validateCheksum(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v0}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/service/CryptLibOne;->SHA256(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x2

    .line 3
    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->sk:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/service/CryptLibOne;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/olive/upi/transport/service/CryptLibOne;->decrypt([B[B)[B

    move-result-object p0

    .line 4
    invoke-static {p1, p0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public accountMobReg(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/RegRequest;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->accountMobileReg(Lcom/olive/upi/transport/model/RegRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$13;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$13;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1024

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public accountRemove(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/AcctUpdateReq;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/AcctUpdateReq;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->accountRemove(Lcom/olive/upi/transport/model/AcctUpdateReq;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$25;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$25;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1025

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public authenticate(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Authenticate;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Authenticate;->getUsername()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Authenticate;->getPassword()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Authenticate;->getDevice()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v2

    invoke-interface {v2, v0, v1, p1}, Lcom/olive/upi/transport/api/UpiService;->authenticate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$19;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$19;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1026

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public balanceEnqForCreditLine(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/CreditLineBalReqest;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->balanceEnqForCreditLine(Lcom/olive/upi/transport/model/CreditLineBalReqest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$78;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$78;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1027

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public beneBlock(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/api/UpiService;->blockedVpa(Ljava/lang/String;Ljava/util/ArrayList;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$51;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$51;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1028

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public billPay(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillPay;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->billPay(Lcom/olive/upi/transport/model/BillPay;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$44;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$44;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1029

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public calculateCharges(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerChargeReq;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->calculateCharge(Lcom/olive/upi/transport/model/BillerChargeReq;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$39;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$39;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x102a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public caluclateCheckSum(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/olive/upi/transport/service/CryptLibOne;

    invoke-direct {v0}, Lcom/olive/upi/transport/service/CryptLibOne;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/service/CryptLibOne;->SHA256(Ljava/lang/String;)[B

    move-result-object p1

    .line 3
    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->sk:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/service/CryptLibOne;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/olive/upi/transport/service/CryptLibOne;->encrypt([B[B)[B

    move-result-object p1

    const/4 v0, 0x2

    .line 4
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->setCheckSum(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public changePassword(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/ChangeAppPin;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->changePassword(Lcom/olive/upi/transport/model/ChangeAppPin;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$30;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$30;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x102b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public collect(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Collect;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Collect;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->collectReq(Lcom/olive/upi/transport/model/Collect;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$18;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$18;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x102c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public collectNotification(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/CollectPayRequest;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->collectNotification(Lcom/olive/upi/transport/model/CollectPayRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$12;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$12;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x102d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public connectServer(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    new-instance p3, Lcom/olive/upi/transport/TransportManager$69;

    invoke-direct {p3, p0, p1, p2}, Lcom/olive/upi/transport/TransportManager$69;-><init>(Lcom/olive/upi/transport/TransportManager;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public createMandateRequest(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, v0}, Lcom/olive/upi/transport/api/UpiService;->createMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/PayerInitiatedMandate;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$55;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$55;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public customerReg(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/CustomerReg;

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v0

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/CustomerReg;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/CustomerReg;->getRefid()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/olive/upi/transport/api/UpiService;->customerReg(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$9;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$9;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x102e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public customerSignOff(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x26

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/olive/upi/transport/api/UpiService;->signOff(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$8;

    invoke-direct {p2, p0, v0}, Lcom/olive/upi/transport/TransportManager$8;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x102f

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public deRegister(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x27

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/olive/upi/transport/api/UpiService;->deRegister(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$31;

    invoke-direct {p2, p0, v0}, Lcom/olive/upi/transport/TransportManager$31;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1030

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public declineApproveMandate(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, v0}, Lcom/olive/upi/transport/api/UpiService;->declineMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$59;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$59;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public deleteCustomerVpa(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x2c

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v1 .. v6}, Lcom/olive/upi/transport/api/UpiService;->deleteCustomerVpa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$26;

    invoke-direct {p2, p0, v0}, Lcom/olive/upi/transport/TransportManager$26;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1031

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public fetchAccounts(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/AcRequest;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/AcRequest;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/olive/upi/transport/api/UpiService;->accountFetch(Lcom/olive/upi/transport/model/AcRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$3;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$3;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1032

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public fetchAllAccounts(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/CustomerAcRequest;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/CustomerAcRequest;->getInput()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/olive/upi/transport/api/UpiService;->getAllAccounts(Lcom/olive/upi/transport/model/CustomerAcRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$4;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$4;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    .line 5
    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1033

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public generateToken(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    const v1, 0x1034

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lcom/olive/upi/transport/api/UpiService;->token(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$6;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$6;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1035

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getBBPSHistory(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillPaymentEnqRequst;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->billpayEnquiry(Lcom/olive/upi/transport/model/BillPaymentEnqRequst;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$41;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$41;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1036

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getBalance(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BRequest;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BRequest;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getBal(Lcom/olive/upi/transport/model/BRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$15;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$15;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1037

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getBanner(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/olive/upi/transport/api/UpiService;->getBanner(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$45;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$45;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1038

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getBillPayMaxAmounts(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getBillPayMaxAmounts()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$48;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$48;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public getBillerCategories(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getBillerCategory()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$61;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$61;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public getBillerLocation(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerLocation;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerLocation;->getBillerCategory()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerLocation;->getBiller()Lcom/olive/upi/transport/model/Billers;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Billers;->getCORP_CODE()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerLocation;->getBiller()Lcom/olive/upi/transport/model/Billers;

    move-result-object v3

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Billers;->getMASTR_TYPE()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerLocation;->getBiller()Lcom/olive/upi/transport/model/Billers;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getCIF_ID()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v2, v3, v0}, Lcom/olive/upi/transport/api/UpiService;->getBillerLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$64;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$64;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1039

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getBillerRegForm(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerForm;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerForm;->getBillerCategory()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerForm;->getBiller()Lcom/olive/upi/transport/model/Billers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Billers;->getCORP_CODE()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerForm;->getLocCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerForm;->getBiller()Lcom/olive/upi/transport/model/Billers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Billers;->getMASTR_TYPE()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerForm;->getBiller()Lcom/olive/upi/transport/model/Billers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Billers;->getCIF_ID()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lcom/olive/upi/transport/api/UpiService;->getBillerForm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$65;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$65;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x103a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getBillers(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getBillerName(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$63;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$63;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x103b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getBlockBeneVpa(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getBlockedBeneVpa()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$50;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$50;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x103c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getChangeMpin(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/ChangeCredReq;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getChangeMpin(Lcom/olive/upi/transport/model/ChangeCredReq;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$7;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$7;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    .line 4
    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x103d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getCheckStatus(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/CheckStatus;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, v0}, Lcom/olive/upi/transport/api/UpiService;->getcheckStatus(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/CheckStatus;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$81;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$81;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x103e

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p4, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getCheckSum()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager;->checkSum:Ljava/lang/String;

    return-object v0
.end method

.method public getClToken(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/ClTokenReq;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getClToken(Lcom/olive/upi/transport/model/ClTokenReq;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$77;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$77;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x103f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getDthOperator(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getDTH()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$49;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$49;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1040

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getInboxContent(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getInbox()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$62;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$62;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1041

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getInfo(Landroid/app/Activity;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :cond_0
    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getInfo()Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$37;

    invoke-direct {p2, p0}, Lcom/olive/upi/transport/TransportManager$37;-><init>(Lcom/olive/upi/transport/TransportManager;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_2
    return-void
.end method

.method public getMobileCircle(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getMobileCircle(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$47;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$47;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1042

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getMobileNumber(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getMobile(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$20;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$20;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1043

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getMobileOperator(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getMobileOperator(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$46;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$46;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1044

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getMyVpaAccounts(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x2b

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getMyVpaAccounts()Lretrofit2/Call;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/TransportManager$5;

    invoke-direct {v1, p0, v0}, Lcom/olive/upi/transport/TransportManager$5;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v1, 0x1045

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getOperator(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getoperator()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$70;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$70;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1046

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getPendingMandateReq(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/GetMandate;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, v0}, Lcom/olive/upi/transport/api/UpiService;->pendingSI(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/GetMandate;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$57;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$57;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public getPendingTransactions(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getPendingTransactions()Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$23;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$23;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1047

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getPersonalLoan(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getPersonalLoan(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$43;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$43;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1048

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getPlainAccountNumber(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getPlainAccount(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$42;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$42;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1049

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getPromotionalOffers(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/olive/upi/transport/api/UpiService;->promotionalOffers(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$75;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$75;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x104a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getRaisedQueries(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/olive/upi/transport/api/UpiService;->listQueries(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$29;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$29;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x104b

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getRechargeHistory(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getRechargeHistory(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$36;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$36;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x104c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getRechargePlans(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/RechargePlanParam;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/RechargePlanParam;->getServicecode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/RechargePlanParam;->getConsumerno()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/RechargePlanParam;->getSpcode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/RechargePlanParam;->getSspcode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v2, v3, v0}, Lcom/olive/upi/transport/api/UpiService;->getRechargePlans(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$52;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$52;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x104d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getSafetyCheckerService()Lcom/olive/upi/transport/api/UpiService;
    .locals 3

    .line 1
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->safetyNetService:Lcom/olive/upi/transport/api/UpiService;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 3
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->setLenient()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    .line 5
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    const v2, 0x104e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 7
    invoke-static {v0}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lcom/google/gson/Gson;)Lretrofit2/converter/gson/GsonConverterFactory;

    move-result-object v0

    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    .line 9
    const-class v1, Lcom/olive/upi/transport/api/UpiService;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/api/UpiService;

    sput-object v0, Lcom/olive/upi/transport/TransportManager;->safetyNetService:Lcom/olive/upi/transport/api/UpiService;

    .line 10
    :cond_0
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->safetyNetService:Lcom/olive/upi/transport/api/UpiService;

    return-object v0
.end method

.method public getSetuService()Lcom/olive/upi/transport/api/UpiService;
    .locals 3

    .line 1
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->setuService:Lcom/olive/upi/transport/api/UpiService;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 3
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->setLenient()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    .line 5
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    const v2, 0x104f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 7
    invoke-static {v0}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lcom/google/gson/Gson;)Lretrofit2/converter/gson/GsonConverterFactory;

    move-result-object v0

    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 8
    invoke-direct {p0, v1}, Lcom/olive/upi/transport/TransportManager;->getHttpClient(Z)Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    .line 10
    const-class v1, Lcom/olive/upi/transport/api/UpiService;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/api/UpiService;

    sput-object v0, Lcom/olive/upi/transport/TransportManager;->setuService:Lcom/olive/upi/transport/api/UpiService;

    .line 11
    :cond_0
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->setuService:Lcom/olive/upi/transport/api/UpiService;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager;->token:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionHistory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    if-eqz p5, :cond_0

    const/16 p5, 0x272

    goto :goto_1

    .line 1
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_2

    if-nez p4, :cond_1

    goto :goto_0

    :cond_1
    const/16 p5, 0x20e

    goto :goto_1

    :cond_2
    :goto_0
    const/16 p5, 0x1a

    .line 2
    :goto_1
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v0, p5}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    .line 3
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, p4}, Lcom/olive/upi/transport/api/UpiService;->getTransactionHistory(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$22;

    invoke-direct {p2, p0, v0}, Lcom/olive/upi/transport/TransportManager$22;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_2

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1050

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;
    .locals 3

    .line 1
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->upiPaymentService:Lcom/olive/upi/transport/api/UpiService;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 3
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->setLenient()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    .line 5
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->API_BASE_URL:Ljava/lang/String;

    .line 6
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 7
    invoke-static {v0}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lcom/google/gson/Gson;)Lretrofit2/converter/gson/GsonConverterFactory;

    move-result-object v0

    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, v1}, Lcom/olive/upi/transport/TransportManager;->getHttpClient(Z)Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    .line 10
    const-class v1, Lcom/olive/upi/transport/api/UpiService;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/api/UpiService;

    sput-object v0, Lcom/olive/upi/transport/TransportManager;->upiPaymentService:Lcom/olive/upi/transport/api/UpiService;

    .line 11
    :cond_0
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->upiPaymentService:Lcom/olive/upi/transport/api/UpiService;

    return-object v0
.end method

.method public getUPIService()Lcom/olive/upi/transport/api/UpiService;
    .locals 3

    .line 1
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->upiService:Lcom/olive/upi/transport/api/UpiService;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 3
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->setLenient()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    .line 5
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->API_BASE_URL:Ljava/lang/String;

    .line 6
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 7
    invoke-static {v0}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lcom/google/gson/Gson;)Lretrofit2/converter/gson/GsonConverterFactory;

    move-result-object v0

    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 8
    invoke-direct {p0, v1}, Lcom/olive/upi/transport/TransportManager;->getHttpClient(Z)Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    .line 10
    const-class v1, Lcom/olive/upi/transport/api/UpiService;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/api/UpiService;

    sput-object v0, Lcom/olive/upi/transport/TransportManager;->upiService:Lcom/olive/upi/transport/api/UpiService;

    .line 11
    :cond_0
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->upiService:Lcom/olive/upi/transport/api/UpiService;

    return-object v0
.end method

.method public getVerifiedMerchant(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/VerifyVPA;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->getVerifiedMerchant(Lcom/olive/upi/transport/model/VerifyVPA;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$83;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$83;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1051

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getWebUrls(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->getWebUrls()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$76;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$76;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1052

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getraiseComplain(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/ReqComplientVo;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/api/UpiService;->getRaiseComplain(Ljava/lang/String;Lcom/olive/upi/transport/model/ReqComplientVo;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$82;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$82;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1053

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public isPaymentServiceInitialised()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/TransportManager;->upiPaymentService:Lcom/olive/upi/transport/api/UpiService;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public listBanks(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->listBanks()Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$17;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$17;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1054

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public listKeys(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1}, Lcom/olive/upi/transport/api/UpiService;->listKeys()Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$33;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$33;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1055

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public listVpa(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/olive/upi/transport/api/UpiService;->listVPA(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$16;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$16;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1056

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public mandateExecute(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/MandateExecute;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, v0}, Lcom/olive/upi/transport/api/UpiService;->executeMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/MandateExecute;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$72;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$72;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1057

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p4, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public mandateRequest(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, v0}, Lcom/olive/upi/transport/api/UpiService;->mandateRequest(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/PayeeInitiatedMandate;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$56;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$56;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public mandatehistory(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/ReqMandateTxn;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3, v0}, Lcom/olive/upi/transport/api/UpiService;->mandateHistory(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/ReqMandateTxn;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$60;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$60;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public pay(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIPaymentService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/PayRequest;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->PayReq(Lcom/olive/upi/transport/model/PayRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$11;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$11;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1058

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public payBBPSBill(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BbpsPay;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->payBBPSBill(Lcom/olive/upi/transport/model/BbpsPay;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$40;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$40;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1059

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public processResponse(Lretrofit2/Response;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lretrofit2/Response;->code()I

    move-result v0

    const/16 v1, 0x191

    if-ne v0, v1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x105a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    invoke-virtual {p1}, Lretrofit2/Response;->message()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public raiseQuery(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/TranHistory;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TranHistory;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->raiseQuery(Lcom/olive/upi/transport/model/TranHistory;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$28;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$28;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x105b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public recurrenceAuthorization(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/RecurrenceAuthorization;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p3, p2, v0}, Lcom/olive/upi/transport/api/UpiService;->recurrenceAuthorization(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/RecurrenceAuthorization;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$80;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$80;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x105c

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p4, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public recurrencePending(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/api/UpiService;->recurrencePending(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$79;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$79;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x105d

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p4, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public regBillerEnq(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/RegisterBiller;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->registerEnqBiller(Lcom/olive/upi/transport/model/RegisterBiller;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$68;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$68;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x105e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public rejectpending(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/PendingReqVo;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->rejectPending(Lcom/olive/upi/transport/model/PendingReqVo;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$24;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$24;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x105f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public resetUpiService()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    sput-object v0, Lcom/olive/upi/transport/TransportManager;->upiService:Lcom/olive/upi/transport/api/UpiService;

    .line 2
    sput-object v0, Lcom/olive/upi/transport/TransportManager;->upiPaymentService:Lcom/olive/upi/transport/api/UpiService;

    return-void
.end method

.method public safetyNetChecker(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/SafetynetSignedAttestation;

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/SafetynetSignedAttestation;->getApiKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/SafetynetSignedAttestation;->setApiKey(Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getSafetyCheckerService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v1, v0}, Lcom/olive/upi/transport/api/UpiService;->safetynetCheck(Ljava/lang/String;Lcom/olive/upi/transport/model/SafetynetSignedAttestation;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$66;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$66;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1060

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public saveVpa(Landroid/content/Context;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BeneVpa;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getNickname()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getFavorite()Ljava/lang/String;

    move-result-object v6

    move-object v2, p2

    invoke-interface/range {v1 .. v6}, Lcom/olive/upi/transport/api/UpiService;->saveVPA(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$14;

    invoke-direct {p2, p0, p3}, Lcom/olive/upi/transport/TransportManager$14;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1061

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public sendAccountOTPRequest(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/AccountOTPRequest;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/AccountOTPRequest;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->accountOtp(Lcom/olive/upi/transport/model/AccountOTPRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$2;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$2;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1062

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public serverHealth(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->serverCheck(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$32;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$32;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1063

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setCheckSum(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/TransportManager;->checkSum:Ljava/lang/String;

    return-void
.end method

.method public setCustomerVpa(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x2a

    invoke-direct {v0, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(I)V

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v1 .. v6}, Lcom/olive/upi/transport/api/UpiService;->setCustomerVpa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$35;

    invoke-direct {p2, p0, v0}, Lcom/olive/upi/transport/TransportManager$35;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x1064

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setListener(Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/TransportManager;->token:Ljava/lang/String;

    return-void
.end method

.method public setuCheck(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getSetuService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v1, v2, v3, v0}, Lcom/olive/upi/transport/api/UpiService;->setuCheck(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$67;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$67;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1065

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public signedQR(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/IntentData;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->generateSignedQR(Lcom/olive/upi/transport/model/IntentData;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$73;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$73;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1066

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public skipBindCall(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->skipBindCall(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$21;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$21;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1067

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public updateAccounts(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/AcctUpdateReq;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/AcctUpdateReq;->getInput()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->accountSave(Lcom/olive/upi/transport/model/AcctUpdateReq;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$10;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$10;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1068

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public updateInbox(Landroid/app/Activity;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Inbox;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->updateInbox(Lcom/olive/upi/transport/model/Inbox;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$38;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$38;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1069

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public updateMandate(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/UpdateMandateRequest;

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object v0

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->getAppId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/UpdateMandateRequest;->getUpdateMandate()Lcom/olive/upi/transport/model/UpdateMandate;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Lcom/olive/upi/transport/api/UpiService;->updateMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/UpdateMandate;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$58;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$58;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    :cond_0
    return-void
.end method

.method public verifyLimitChecks(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/LimitCheckReq;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->verifyLimits(Lcom/olive/upi/transport/model/LimitCheckReq;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$84;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$84;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x106a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public verifyPromocode(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->verifyPromoCode(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$54;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$54;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x106b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public verifyQR(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/IntentData;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/IntentData;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/olive/upi/transport/api/UpiService;->verifySignedQR(Lcom/olive/upi/transport/model/IntentData;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$74;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$74;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x106c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public verifyReferalCode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Lcom/olive/upi/transport/api/UpiService;->verifyRereralCode(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/TransportManager$53;

    invoke-direct {p2, p0, p4}, Lcom/olive/upi/transport/TransportManager$53;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const p2, 0x106d

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p4, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public verifyVpa2(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/VpaVerify;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/VpaVerify;->getCustomerid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/VpaVerify;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->verifyVpa2(Lcom/olive/upi/transport/model/VpaVerify;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$71;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$71;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x106e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public vpaRemove(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/olive/upi/transport/TransportManager;->caluclateCheckSum(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/olive/upi/transport/api/UpiService;->vpaRemove(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$27;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$27;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x106f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public vpaSuggestion(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/OliveRequest;->getRequestData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/SetProfile;

    .line 2
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/TransportManager;->getUPIService()Lcom/olive/upi/transport/api/UpiService;

    move-result-object p1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/SetProfile;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/SetProfile;->getAccountNo()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/olive/upi/transport/api/UpiService;->vpaSuggestion(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/TransportManager$34;

    invoke-direct {v0, p0, p2}, Lcom/olive/upi/transport/TransportManager$34;-><init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    const v0, 0x1070

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
