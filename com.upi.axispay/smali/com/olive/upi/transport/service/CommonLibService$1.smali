.class public Lcom/olive/upi/transport/service/CommonLibService$1;
.super Landroid/os/ResultReceiver;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/service/CommonLibService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/olive/upi/transport/service/CommonLibService;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/service/CommonLibService;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService$1;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onReceiveResult(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/os/ResultReceiver;->onReceiveResult(ILandroid/os/Bundle;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/olive/upi/transport/service/CommonLibService$1;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    iget-object v1, v0, Lcom/olive/upi/transport/service/CommonLibService;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-static {v0, p1, p2, v1}, Lcom/olive/upi/transport/service/CommonLibService;->access$000(Lcom/olive/upi/transport/service/CommonLibService;ILandroid/os/Bundle;Lcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 4
    iget-object p2, p0, Lcom/olive/upi/transport/service/CommonLibService$1;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-static {p2}, Lcom/olive/upi/transport/service/CommonLibService;->access$200(Lcom/olive/upi/transport/service/CommonLibService;)Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    move-result-object p2

    iget-object v0, p0, Lcom/olive/upi/transport/service/CommonLibService$1;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-static {v0}, Lcom/olive/upi/transport/service/CommonLibService;->access$100(Lcom/olive/upi/transport/service/CommonLibService;)I

    move-result v0

    iget-object v1, p0, Lcom/olive/upi/transport/service/CommonLibService$1;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    iget-object v1, v1, Lcom/olive/upi/transport/service/CommonLibService;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-interface {p2, v0, p1, v1}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onServiceError(ILcom/olive/upi/transport/OliveUpiException;Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method
