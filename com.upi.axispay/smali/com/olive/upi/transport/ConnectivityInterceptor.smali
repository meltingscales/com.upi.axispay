.class public Lcom/olive/upi/transport/ConnectivityInterceptor;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/ConnectivityInterceptor;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/ConnectivityInterceptor;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lc70;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/NoConnectivityException;

    invoke-direct {p1}, Lcom/olive/upi/transport/NoConnectivityException;-><init>()V

    throw p1
.end method
