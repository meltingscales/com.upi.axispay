.class public Lcom/olive/upi/transport/TransportManager$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/TransportManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/olive/upi/transport/TransportManager;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/TransportManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/TransportManager$1;->this$0:Lcom/olive/upi/transport/TransportManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/olive/upi/transport/TransportManager$1;->this$0:Lcom/olive/upi/transport/TransportManager;

    iget-object v3, v2, Lcom/olive/upi/transport/TransportManager;->token:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 4
    invoke-virtual {v2}, Lcom/olive/upi/transport/TransportManager;->getToken()Ljava/lang/String;

    move-result-object v2

    const v3, 0x3b9c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 5
    :cond_0
    sget-object v2, Lcom/olive/upi/transport/TransportConstants;->sk:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 6
    iget-object v2, p0, Lcom/olive/upi/transport/TransportManager$1;->this$0:Lcom/olive/upi/transport/TransportManager;

    invoke-virtual {v2}, Lcom/olive/upi/transport/TransportManager;->getCheckSum()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/olive/upi/transport/TransportManager$1;->this$0:Lcom/olive/upi/transport/TransportManager;

    invoke-virtual {v2}, Lcom/olive/upi/transport/TransportManager;->getCheckSum()Ljava/lang/String;

    move-result-object v2

    const v3, 0x3b9d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 8
    :cond_1
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v2

    const v3, 0x3b9e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const v3, 0x3b9f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 10
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x3ba0

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v3, 0x3ba1

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 11
    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 12
    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager$1;->this$0:Lcom/olive/upi/transport/TransportManager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/TransportManager;->setCheckSum(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method
