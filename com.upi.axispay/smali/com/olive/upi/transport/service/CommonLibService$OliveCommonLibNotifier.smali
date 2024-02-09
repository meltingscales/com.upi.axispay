.class public Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/service/CommonLibService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OliveCommonLibNotifier"
.end annotation


# instance fields
.field public mode:I

.field public oliveRequest:Lcom/olive/upi/transport/OliveRequest;

.field public final synthetic this$0:Lcom/olive/upi/transport/service/CommonLibService;


# direct methods
.method public constructor <init>(Lcom/olive/upi/transport/service/CommonLibService;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->mode:I

    return-void
.end method

.method public constructor <init>(Lcom/olive/upi/transport/service/CommonLibService;ILcom/olive/upi/transport/OliveRequest;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p2, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->mode:I

    .line 5
    iput-object p3, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    return-void
.end method


# virtual methods
.method public serviceConnected(Lorg/npci/upi/security/services/CLServices;)V
    .locals 4

    .line 1
    sput-object p1, Lcom/olive/upi/transport/TransportConstants;->mClservices:Lorg/npci/upi/security/services/CLServices;

    .line 2
    :try_start_0
    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->mode:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-static {p1}, Lcom/olive/upi/transport/service/CommonLibService;->access$200(Lcom/olive/upi/transport/service/CommonLibService;)Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    move-result-object p1

    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->mode:I

    iget-object v2, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-interface {p1, v1, v2}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onServiceConnected(ILcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    :cond_0
    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    .line 4
    iget-object v1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {v1}, Lcom/olive/upi/transport/OliveRequest;->getClInitData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/OliveUpiManager$InitLib;

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x993

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getDeviceId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x994

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getChallenge()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const v0, 0x995

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->getDeviceId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lorg/npci/upi/security/services/CLServices;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/OliveUpiManager$InitLib;->setChallenge(Ljava/lang/String;)V

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x996

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 9
    iget-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/OliveRequest;->setClInitData(Ljava/lang/Object;)V

    .line 10
    iget-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-static {p1}, Lcom/olive/upi/transport/service/CommonLibService;->access$200(Lcom/olive/upi/transport/service/CommonLibService;)Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    move-result-object p1

    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->mode:I

    iget-object v2, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-interface {p1, v1, v2}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onServiceConnected(ILcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    iget-object v1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/service/CommonLibService;->getCredentials(Lcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Lcom/olive/upi/transport/OliveUpiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    iget-object v1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-static {v1}, Lcom/olive/upi/transport/service/CommonLibService;->access$200(Lcom/olive/upi/transport/service/CommonLibService;)Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    move-result-object v1

    iget v2, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->mode:I

    iget-object v3, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    invoke-interface {v1, v2, p1, v3}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onServiceError(ILcom/olive/upi/transport/OliveUpiException;Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public serviceDisconnected()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->this$0:Lcom/olive/upi/transport/service/CommonLibService;

    invoke-static {v0}, Lcom/olive/upi/transport/service/CommonLibService;->access$200(Lcom/olive/upi/transport/service/CommonLibService;)Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;

    move-result-object v0

    iget v1, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->mode:I

    iget-object v2, p0, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibNotifier;->oliveRequest:Lcom/olive/upi/transport/OliveRequest;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;->onServiceError(ILcom/olive/upi/transport/OliveUpiException;Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
