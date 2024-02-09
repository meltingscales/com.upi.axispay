.class public Lcom/olive/upi/transport/TransportManager$67;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/olive/upi/transport/TransportManager;->setuCheck(Landroid/content/Context;Lcom/olive/upi/transport/OliveRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/olive/upi/transport/model/SetuResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/olive/upi/transport/TransportManager;

.field public final synthetic val$request:Lcom/olive/upi/transport/OliveRequest;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/TransportManager$67;->this$0:Lcom/olive/upi/transport/TransportManager;

    iput-object p2, p0, Lcom/olive/upi/transport/TransportManager$67;->val$request:Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/model/SetuResponse;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 2
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager$67;->this$0:Lcom/olive/upi/transport/TransportManager;

    iget-object p1, p1, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager$67;->val$request:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/model/SetuResponse;",
            ">;",
            "Lretrofit2/Response<",
            "Lcom/olive/upi/transport/model/SetuResponse;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lcom/olive/upi/transport/api/Result;

    invoke-direct {p1}, Lcom/olive/upi/transport/api/Result;-><init>()V

    const v0, 0xfdf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    iput-object v0, p1, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    const v0, 0xfe0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    iput-object v0, p1, Lcom/olive/upi/transport/api/Result;->result:Ljava/lang/String;

    .line 5
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/api/Result;->setData(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Lcom/olive/upi/transport/TransportManager$67;->this$0:Lcom/olive/upi/transport/TransportManager;

    iget-object p2, p2, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager$67;->val$request:Lcom/olive/upi/transport/OliveRequest;

    invoke-interface {p2, v0, p1}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager$67;->this$0:Lcom/olive/upi/transport/TransportManager;

    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager$67;->val$request:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p1, p2, v0}, Lcom/olive/upi/transport/TransportManager;->processResponse(Lretrofit2/Response;Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method
