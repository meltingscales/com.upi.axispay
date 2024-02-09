.class public interface abstract Lcom/olive/upi/transport/service/CommonLibService$OliveCommonLibListener;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/service/CommonLibService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OliveCommonLibListener"
.end annotation


# virtual methods
.method public abstract onReceiveResult(IILjava/lang/Object;Lcom/olive/upi/transport/OliveRequest;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation
.end method

.method public abstract onServiceConnected(ILcom/olive/upi/transport/OliveRequest;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/olive/upi/transport/OliveUpiException;
        }
    .end annotation
.end method

.method public abstract onServiceError(ILcom/olive/upi/transport/OliveUpiException;Lcom/olive/upi/transport/OliveRequest;)V
.end method
