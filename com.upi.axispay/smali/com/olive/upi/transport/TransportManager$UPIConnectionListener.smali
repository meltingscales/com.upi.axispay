.class public interface abstract Lcom/olive/upi/transport/TransportManager$UPIConnectionListener;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/TransportManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "UPIConnectionListener"
.end annotation


# virtual methods
.method public abstract onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Ljava/lang/Object;)V
.end method

.method public abstract onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end method
