.class public Lcom/olive/upi/transport/TransportManager$57;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/olive/upi/transport/TransportManager;->getPendingMandateReq(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/OliveRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/olive/upi/transport/api/Result<",
        "Ljava/util/List<",
        "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/olive/upi/transport/TransportManager;

.field public final synthetic val$request:Lcom/olive/upi/transport/OliveRequest;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/TransportManager;Lcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/TransportManager$57;->this$0:Lcom/olive/upi/transport/TransportManager;

    iput-object p2, p0, Lcom/olive/upi/transport/TransportManager$57;->val$request:Lcom/olive/upi/transport/OliveRequest;

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
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;>;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager$57;->this$0:Lcom/olive/upi/transport/TransportManager;

    iget-object p1, p1, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager$57;->val$request:Lcom/olive/upi/transport/OliveRequest;

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
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;>;>;",
            "Lretrofit2/Response<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager$57;->this$0:Lcom/olive/upi/transport/TransportManager;

    iget-object p1, p1, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager$57;->val$request:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/api/Result;

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/olive/upi/transport/TransportManager$57;->this$0:Lcom/olive/upi/transport/TransportManager;

    iget-object p1, p1, Lcom/olive/upi/transport/TransportManager;->listener:Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;

    iget-object v0, p0, Lcom/olive/upi/transport/TransportManager$57;->val$request:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p2}, Lretrofit2/Response;->message()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
