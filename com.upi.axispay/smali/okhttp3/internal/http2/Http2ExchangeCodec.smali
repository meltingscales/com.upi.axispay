.class public final Lokhttp3/internal/http2/Http2ExchangeCodec;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lokhttp3/internal/http/ExchangeCodec;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;
    }
.end annotation


# static fields
.field private static final CONNECTION:Ljava/lang/String;

.field public static final Companion:Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;

.field private static final ENCODING:Ljava/lang/String;

.field private static final HOST:Ljava/lang/String;

.field private static final HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final KEEP_ALIVE:Ljava/lang/String;

.field private static final PROXY_CONNECTION:Ljava/lang/String;

.field private static final TE:Ljava/lang/String;

.field private static final TRANSFER_ENCODING:Ljava/lang/String;

.field private static final UPGRADE:Ljava/lang/String;


# instance fields
.field private volatile canceled:Z

.field private final chain:Lokhttp3/internal/http/RealInterceptorChain;

.field private final connection:Lokhttp3/internal/connection/RealConnection;

.field private final http2Connection:Lokhttp3/internal/http2/Http2Connection;

.field private final protocol:Lokhttp3/Protocol;

.field private volatile stream:Lokhttp3/internal/http2/Http2Stream;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const-class v0, Lokhttp3/internal/http2/Http2ExchangeCodec;

    const v1, 0x48

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    new-instance v0, Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;-><init>(Lvl0;)V

    sput-object v0, Lokhttp3/internal/http2/Http2ExchangeCodec;->Companion:Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;

    const v2, 0x3acd

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x3ace

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x3acf

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x3ad0

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x3ad1

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x3ad2

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x3ad3

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x3ad4

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x3ad5

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x3ad6

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x3ad7

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    const v13, 0x3ad8

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 1
    filled-new-array/range {v2 .. v13}, [Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lokhttp3/internal/Util;->immutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http2/Http2ExchangeCodec;->HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    const v1, 0x3ad9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3ada

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x3adb

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x3adc

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x3add

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x3ade

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x3adf

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x3ae0

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 3
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lokhttp3/internal/Util;->immutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http2/Http2ExchangeCodec;->HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V
    .locals 1

    const v0, 0x3ae1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ae2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ae3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ae4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p4, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->connection:Lokhttp3/internal/connection/RealConnection;

    iput-object p3, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->chain:Lokhttp3/internal/http/RealInterceptorChain;

    iput-object p4, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->http2Connection:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->protocols()Ljava/util/List;

    move-result-object p1

    sget-object p2, Lokhttp3/Protocol;->H2_PRIOR_KNOWLEDGE:Lokhttp3/Protocol;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object p2, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    .line 4
    :goto_0
    iput-object p2, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->protocol:Lokhttp3/Protocol;

    return-void
.end method

.method public static final synthetic access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/http2/Http2ExchangeCodec;->HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/http2/Http2ExchangeCodec;->HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->canceled:Z

    .line 2
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    if-eqz v0, :cond_0

    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->CANCEL:Lokhttp3/internal/http2/ErrorCode;

    invoke-virtual {v0, v1}, Lokhttp3/internal/http2/Http2Stream;->closeLater(Lokhttp3/internal/http2/ErrorCode;)V

    :cond_0
    return-void
.end method

.method public createRequestBody(Lokhttp3/Request;J)Lokio/Sink;
    .locals 0

    const p2, 0x3ae5

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    invoke-static {p1}, Lyl0;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lokhttp3/internal/http2/Http2Stream;->getSink()Lokio/Sink;

    move-result-object p1

    return-object p1
.end method

.method public finishRequest()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    invoke-static {v0}, Lyl0;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lokhttp3/internal/http2/Http2Stream;->getSink()Lokio/Sink;

    move-result-object v0

    invoke-interface {v0}, Lokio/Sink;->close()V

    return-void
.end method

.method public flushRequest()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->http2Connection:Lokhttp3/internal/http2/Http2Connection;

    invoke-virtual {v0}, Lokhttp3/internal/http2/Http2Connection;->flush()V

    return-void
.end method

.method public getConnection()Lokhttp3/internal/connection/RealConnection;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->connection:Lokhttp3/internal/connection/RealConnection;

    return-object v0
.end method

.method public openResponseBodySource(Lokhttp3/Response;)Lokio/Source;
    .locals 1

    const v0, 0x3ae6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    invoke-static {p1}, Lyl0;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lokhttp3/internal/http2/Http2Stream;->getSource$okhttp()Lokhttp3/internal/http2/Http2Stream$FramingSource;

    move-result-object p1

    return-object p1
.end method

.method public readResponseHeaders(Z)Lokhttp3/Response$Builder;
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lokhttp3/internal/http2/Http2Stream;->takeHeaders()Lokhttp3/Headers;

    move-result-object v0

    .line 3
    sget-object v1, Lokhttp3/internal/http2/Http2ExchangeCodec;->Companion:Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;

    iget-object v2, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->protocol:Lokhttp3/Protocol;

    invoke-virtual {v1, v0, v2}, Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;->readHttp2HeadersList(Lokhttp3/Headers;Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->getCode$okhttp()I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0

    .line 5
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const v0, 0x3ae7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public reportedContentLength(Lokhttp3/Response;)J
    .locals 2

    const v0, 0x3ae8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lokhttp3/internal/http/HttpHeaders;->promisesBody(Lokhttp3/Response;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Lokhttp3/internal/Util;->headersContentLength(Lokhttp3/Response;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public trailers()Lokhttp3/Headers;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    invoke-static {v0}, Lyl0;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lokhttp3/internal/http2/Http2Stream;->trailers()Lokhttp3/Headers;

    move-result-object v0

    return-object v0
.end method

.method public writeRequestHeaders(Lokhttp3/Request;)V
    .locals 3

    const v0, 0x3ae9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    :goto_0
    sget-object v1, Lokhttp3/internal/http2/Http2ExchangeCodec;->Companion:Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;

    invoke-virtual {v1, p1}, Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;->http2HeadersList(Lokhttp3/Request;)Ljava/util/List;

    move-result-object p1

    .line 4
    iget-object v1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->http2Connection:Lokhttp3/internal/http2/Http2Connection;

    invoke-virtual {v1, p1, v0}, Lokhttp3/internal/http2/Http2Connection;->newStream(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    .line 5
    iget-boolean p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->canceled:Z

    if-nez p1, :cond_2

    .line 6
    iget-object p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    invoke-static {p1}, Lyl0;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lokhttp3/internal/http2/Http2Stream;->readTimeout()Lokio/Timeout;

    move-result-object p1

    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->chain:Lokhttp3/internal/http/RealInterceptorChain;

    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getReadTimeoutMillis$okhttp()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 7
    iget-object p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    invoke-static {p1}, Lyl0;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lokhttp3/internal/http2/Http2Stream;->writeTimeout()Lokio/Timeout;

    move-result-object p1

    iget-object v0, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->chain:Lokhttp3/internal/http/RealInterceptorChain;

    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getWriteTimeoutMillis$okhttp()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    return-void

    .line 8
    :cond_2
    iget-object p1, p0, Lokhttp3/internal/http2/Http2ExchangeCodec;->stream:Lokhttp3/internal/http2/Http2Stream;

    invoke-static {p1}, Lyl0;->c(Ljava/lang/Object;)V

    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->CANCEL:Lokhttp3/internal/http2/ErrorCode;

    invoke-virtual {p1, v0}, Lokhttp3/internal/http2/Http2Stream;->closeLater(Lokhttp3/internal/http2/ErrorCode;)V

    .line 9
    new-instance p1, Ljava/io/IOException;

    const v0, 0x3aea

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
