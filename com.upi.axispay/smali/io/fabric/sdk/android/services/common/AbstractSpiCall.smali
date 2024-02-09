.class public abstract Lio/fabric/sdk/android/services/common/AbstractSpiCall;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final ACCEPT_JSON_VALUE:Ljava/lang/String;

.field public static final ANDROID_CLIENT_TYPE:Ljava/lang/String;

.field public static final CLS_ANDROID_SDK_DEVELOPER_TOKEN:Ljava/lang/String;

.field public static final CRASHLYTICS_USER_AGENT:Ljava/lang/String;

.field public static final DEFAULT_TIMEOUT:I

.field public static final HEADER_ACCEPT:Ljava/lang/String;

.field public static final HEADER_API_KEY:Ljava/lang/String;

.field public static final HEADER_CLIENT_TYPE:Ljava/lang/String;

.field public static final HEADER_CLIENT_VERSION:Ljava/lang/String;

.field public static final HEADER_DEVELOPER_TOKEN:Ljava/lang/String;

.field public static final HEADER_REQUEST_ID:Ljava/lang/String;

.field public static final HEADER_USER_AGENT:Ljava/lang/String;

.field private static final PROTOCOL_AND_HOST_PATTERN:Ljava/util/regex/Pattern;


# instance fields
.field public final kit:Lio/fabric/sdk/android/Kit;

.field private final method:Lio/fabric/sdk/android/services/network/HttpMethod;

.field private final protocolAndHostOverride:Ljava/lang/String;

.field private final requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

.field private final url:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;

    const v1, 0xa2

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    const v0, 0x23a6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 1
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->PROTOCOL_AND_HOST_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Lio/fabric/sdk/android/services/network/HttpMethod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    .line 2
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->kit:Lio/fabric/sdk/android/Kit;

    .line 3
    iput-object p2, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->protocolAndHostOverride:Ljava/lang/String;

    .line 4
    invoke-direct {p0, p3}, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->overrideProtocolAndHost(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->url:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .line 6
    iput-object p5, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->method:Lio/fabric/sdk/android/services/network/HttpMethod;

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0x23a7

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0x23a8

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private overrideProtocolAndHost(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->protocolAndHostOverride:Ljava/lang/String;

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->PROTOCOL_AND_HOST_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->protocolAndHostOverride:Ljava/lang/String;

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method public getHttpRequest()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->getHttpRequest(Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public getHttpRequest(Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->method:Lio/fabric/sdk/android/services/network/HttpMethod;

    .line 3
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->getUrl()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-interface {v0, v1, v2, p1}, Lio/fabric/sdk/android/services/network/HttpRequestFactory;->buildHttpRequest(Lio/fabric/sdk/android/services/network/HttpMethod;Ljava/lang/String;Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->useCaches(Z)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const/16 v0, 0x2710

    .line 6
    invoke-virtual {p1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->connectTimeout(I)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x23a9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->kit:Lio/fabric/sdk/android/Kit;

    .line 7
    invoke-virtual {v1}, Lio/fabric/sdk/android/Kit;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x23aa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const v0, 0x23ab

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x23ac

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    return-object p1
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->url:Ljava/lang/String;

    return-object v0
.end method
